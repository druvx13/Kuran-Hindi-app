package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
abstract class zzdqd<InputT, OutputT> extends zzdqg<OutputT> {
    private static final Logger logger = Logger.getLogger(zzdqd.class.getName());
    @NullableDecl
    private zzdot<? extends zzdri<? extends InputT>> zzhhe;
    private final boolean zzhhf;
    private final boolean zzhhg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public enum zza {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqd(zzdot<? extends zzdri<? extends InputT>> zzdotVar, boolean z, boolean z2) {
        super(zzdotVar.size());
        this.zzhhe = (zzdot) zzdoj.checkNotNull(zzdotVar);
        this.zzhhf = z;
        this.zzhhg = z2;
    }

    abstract void zzawj();

    abstract void zzb(int i, @NullableDecl InputT inputt);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdpw
    public final void afterDone() {
        super.afterDone();
        zzdot<? extends zzdri<? extends InputT>> zzdotVar = this.zzhhe;
        zza(zza.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (zzdotVar != null)) {
            boolean wasInterrupted = wasInterrupted();
            zzdpp zzdppVar = (zzdpp) zzdotVar.iterator();
            while (zzdppVar.hasNext()) {
                ((Future) zzdppVar.next()).cancel(wasInterrupted);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdpw
    public final String pendingToString() {
        zzdot<? extends zzdri<? extends InputT>> zzdotVar = this.zzhhe;
        if (zzdotVar != null) {
            String valueOf = String.valueOf(zzdotVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb.append("futures=");
            sb.append(valueOf);
            return sb.toString();
        }
        return super.pendingToString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzawi() {
        if (this.zzhhe.isEmpty()) {
            zzawj();
        } else if (this.zzhhf) {
            int i = 0;
            zzdpp zzdppVar = (zzdpp) this.zzhhe.iterator();
            while (zzdppVar.hasNext()) {
                zzdri zzdriVar = (zzdri) zzdppVar.next();
                zzdriVar.addListener(new zzdqc(this, zzdriVar, i), zzdqp.INSTANCE);
                i++;
            }
        } else {
            zzdqe zzdqeVar = new zzdqe(this, this.zzhhg ? this.zzhhe : null);
            zzdpp zzdppVar2 = (zzdpp) this.zzhhe.iterator();
            while (zzdppVar2.hasNext()) {
                ((zzdri) zzdppVar2.next()).addListener(zzdqeVar, zzdqp.INSTANCE);
            }
        }
    }

    private final void zzi(Throwable th) {
        zzdoj.checkNotNull(th);
        if (this.zzhhf && !setException(th) && zza(zzawk(), th)) {
            zzj(th);
        } else if (th instanceof Error) {
            zzj(th);
        }
    }

    private static void zzj(Throwable th) {
        logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
    }

    @Override // com.google.android.gms.internal.ads.zzdqg
    final void zzh(Set<Throwable> set) {
        zzdoj.checkNotNull(set);
        if (isCancelled()) {
            return;
        }
        zza(set, zzawf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zza(int i, Future<? extends InputT> future) {
        try {
            zzb(i, (int) zzdqw.zza(future));
        } catch (ExecutionException e) {
            zzi(e.getCause());
        } catch (Throwable th) {
            zzi(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(@NullableDecl zzdot<? extends Future<? extends InputT>> zzdotVar) {
        int zzawl = zzawl();
        int i = 0;
        if (!(zzawl >= 0)) {
            throw new IllegalStateException("Less than 0 remaining futures");
        }
        if (zzawl == 0) {
            if (zzdotVar != null) {
                zzdpp zzdppVar = (zzdpp) zzdotVar.iterator();
                while (zzdppVar.hasNext()) {
                    Future<? extends InputT> future = (Future) zzdppVar.next();
                    if (!future.isCancelled()) {
                        zza(i, future);
                    }
                    i++;
                }
            }
            zzawm();
            zzawj();
            zza(zza.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zza(zza zzaVar) {
        zzdoj.checkNotNull(zzaVar);
        this.zzhhe = null;
    }

    private static boolean zza(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzdot zza(zzdqd zzdqdVar, zzdot zzdotVar) {
        zzdqdVar.zzhhe = null;
        return null;
    }
}
