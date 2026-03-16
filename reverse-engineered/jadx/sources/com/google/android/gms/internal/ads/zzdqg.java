package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdpw;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
abstract class zzdqg<OutputT> extends zzdpw.zzj<OutputT> {
    private static final Logger zzhgm = Logger.getLogger(zzdqg.class.getName());
    private static final zzb zzhhl;
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    static abstract class zzb {
        private zzb() {
        }

        abstract void zza(zzdqg zzdqgVar, Set<Throwable> set, Set<Throwable> set2);

        abstract int zzc(zzdqg zzdqgVar);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    static final class zzc extends zzb {
        private zzc() {
            super();
        }

        @Override // com.google.android.gms.internal.ads.zzdqg.zzb
        final void zza(zzdqg zzdqgVar, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (zzdqgVar) {
                if (zzdqgVar.seenExceptions == null) {
                    zzdqgVar.seenExceptions = set2;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdqg.zzb
        final int zzc(zzdqg zzdqgVar) {
            int zzb;
            synchronized (zzdqgVar) {
                zzb = zzdqg.zzb(zzdqgVar);
            }
            return zzb;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqg(int i) {
        this.remaining = i;
    }

    abstract void zzh(Set<Throwable> set);

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    static final class zza extends zzb {
        private final AtomicReferenceFieldUpdater<zzdqg, Set<Throwable>> zzhhm;
        private final AtomicIntegerFieldUpdater<zzdqg> zzhhn;

        zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.zzhhm = atomicReferenceFieldUpdater;
            this.zzhhn = atomicIntegerFieldUpdater;
        }

        @Override // com.google.android.gms.internal.ads.zzdqg.zzb
        final void zza(zzdqg zzdqgVar, Set<Throwable> set, Set<Throwable> set2) {
            this.zzhhm.compareAndSet(zzdqgVar, null, set2);
        }

        @Override // com.google.android.gms.internal.ads.zzdqg.zzb
        final int zzc(zzdqg zzdqgVar) {
            return this.zzhhn.decrementAndGet(zzdqgVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Throwable> zzawk() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set<Throwable> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zzh(newSetFromMap);
            zzhhl.zza(this, null, newSetFromMap);
            return this.seenExceptions;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzawl() {
        return zzhhl.zzc(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzawm() {
        this.seenExceptions = null;
    }

    static /* synthetic */ int zzb(zzdqg zzdqgVar) {
        int i = zzdqgVar.remaining - 1;
        zzdqgVar.remaining = i;
        return i;
    }

    static {
        zzb zzcVar;
        Throwable th;
        try {
            zzcVar = new zza(AtomicReferenceFieldUpdater.newUpdater(zzdqg.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzdqg.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzcVar = new zzc();
            th = th2;
        }
        zzhhl = zzcVar;
        if (th != null) {
            zzhgm.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }
}
