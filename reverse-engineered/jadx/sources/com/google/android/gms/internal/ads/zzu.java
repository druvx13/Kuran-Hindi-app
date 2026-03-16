package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzu {
    private final zzn zzaa;
    private final AtomicInteger zzav;
    private final Set<zzq<?>> zzaw;
    private final PriorityBlockingQueue<zzq<?>> zzax;
    private final PriorityBlockingQueue<zzq<?>> zzay;
    private final zzm[] zzaz;
    private final List<zzw> zzba;
    private final List<zzx> zzbb;
    private final zza zzc;
    private final zzaa zzd;
    private zzc zzo;

    private zzu(zza zzaVar, zzn zznVar, int i, zzaa zzaaVar) {
        this.zzav = new AtomicInteger();
        this.zzaw = new HashSet();
        this.zzax = new PriorityBlockingQueue<>();
        this.zzay = new PriorityBlockingQueue<>();
        this.zzba = new ArrayList();
        this.zzbb = new ArrayList();
        this.zzc = zzaVar;
        this.zzaa = zznVar;
        this.zzaz = new zzm[4];
        this.zzd = zzaaVar;
    }

    private zzu(zza zzaVar, zzn zznVar, int i) {
        this(zzaVar, zznVar, 4, new zzj(new Handler(Looper.getMainLooper())));
    }

    public zzu(zza zzaVar, zzn zznVar) {
        this(zzaVar, zznVar, 4);
    }

    public final void start() {
        zzm[] zzmVarArr;
        zzc zzcVar = this.zzo;
        if (zzcVar != null) {
            zzcVar.quit();
        }
        for (zzm zzmVar : this.zzaz) {
            if (zzmVar != null) {
                zzmVar.quit();
            }
        }
        zzc zzcVar2 = new zzc(this.zzax, this.zzay, this.zzc, this.zzd);
        this.zzo = zzcVar2;
        zzcVar2.start();
        for (int i = 0; i < this.zzaz.length; i++) {
            zzm zzmVar2 = new zzm(this.zzay, this.zzaa, this.zzc, this.zzd);
            this.zzaz[i] = zzmVar2;
            zzmVar2.start();
        }
    }

    public final <T> zzq<T> zze(zzq<T> zzqVar) {
        zzqVar.zza(this);
        synchronized (this.zzaw) {
            this.zzaw.add(zzqVar);
        }
        zzqVar.zzb(this.zzav.incrementAndGet());
        zzqVar.zzb("add-to-queue");
        zza(zzqVar, 0);
        if (!zzqVar.zzh()) {
            this.zzay.add(zzqVar);
            return zzqVar;
        }
        this.zzax.add(zzqVar);
        return zzqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> void zzf(zzq<T> zzqVar) {
        synchronized (this.zzaw) {
            this.zzaw.remove(zzqVar);
        }
        synchronized (this.zzba) {
            for (zzw zzwVar : this.zzba) {
                zzwVar.zzg(zzqVar);
            }
        }
        zza(zzqVar, 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzq<?> zzqVar, int i) {
        synchronized (this.zzbb) {
            for (zzx zzxVar : this.zzbb) {
                zzxVar.zzb(zzqVar, i);
            }
        }
    }
}
