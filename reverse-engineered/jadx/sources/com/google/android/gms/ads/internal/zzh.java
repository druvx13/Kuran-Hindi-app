package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzawr;
import com.google.android.gms.internal.ads.zzazm;
import com.google.android.gms.internal.ads.zzazz;
import com.google.android.gms.internal.ads.zzbab;
import com.google.android.gms.internal.ads.zzcm;
import com.google.android.gms.internal.ads.zzdf;
import com.google.android.gms.internal.ads.zzdj;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzzz;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzh implements zzdj, Runnable {
    private zzazz zzbml;
    private Context zzvf;
    private final int zzwg;
    private final List<Object[]> zzbmi = new Vector();
    private final AtomicReference<zzdj> zzbmj = new AtomicReference<>();
    private final AtomicReference<zzdj> zzbmk = new AtomicReference<>();
    private CountDownLatch zzbmm = new CountDownLatch(1);

    public zzh(Context context, zzazz zzazzVar) {
        this.zzvf = context;
        this.zzbml = zzazzVar;
        int intValue = ((Integer) zzvj.zzpv().zzd(zzzz.zzcnm)).intValue();
        if (intValue == 1) {
            this.zzwg = zzcm.zzmy;
        } else if (intValue == 2) {
            this.zzwg = zzcm.zzmz;
        } else {
            this.zzwg = zzcm.zzmx;
        }
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcod)).booleanValue()) {
            zzbab.zzdzr.execute(this);
            return;
        }
        zzvj.zzpr();
        if (zzazm.zzye()) {
            zzbab.zzdzr.execute(this);
        } else {
            run();
        }
    }

    private final boolean zzka() {
        try {
            this.zzbmm.await();
            return true;
        } catch (InterruptedException e) {
            zzawr.zzd("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    private final void zzkb() {
        zzdj zzcb = zzcb();
        if (this.zzbmi.isEmpty() || zzcb == null) {
            return;
        }
        for (Object[] objArr : this.zzbmi) {
            if (objArr.length == 1) {
                zzcb.zza((MotionEvent) objArr[0]);
            } else if (objArr.length == 3) {
                zzcb.zza(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzbmi.clear();
    }

    private static Context zze(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final String zzb(Context context) {
        zzdj zzdjVar;
        if (zzka()) {
            if (this.zzwg == zzcm.zzmy || this.zzwg == zzcm.zzmz) {
                zzdjVar = this.zzbmk.get();
            } else {
                zzdjVar = this.zzbmj.get();
            }
            if (zzdjVar != null) {
                zzkb();
                return zzdjVar.zzb(zze(context));
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final String zza(Context context, View view, Activity activity) {
        zzdj zzcb = zzcb();
        return zzcb != null ? zzcb.zza(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final String zza(Context context, String str, View view, Activity activity) {
        zzdj zzcb;
        if (!zzka() || (zzcb = zzcb()) == null) {
            return "";
        }
        zzkb();
        return zzcb.zza(zze(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final void zzb(View view) {
        zzdj zzcb = zzcb();
        if (zzcb != null) {
            zzcb.zzb(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final void zza(MotionEvent motionEvent) {
        zzdj zzcb = zzcb();
        if (zzcb != null) {
            zzkb();
            zzcb.zza(motionEvent);
            return;
        }
        this.zzbmi.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final void zza(int i, int i2, int i3) {
        zzdj zzcb = zzcb();
        if (zzcb != null) {
            zzkb();
            zzcb.zza(i, i2, i3);
            return;
        }
        this.zzbmi.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context, com.google.android.gms.internal.ads.zzazz] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.zzbml.zzdzp;
            if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcls)).booleanValue() && z2) {
                z = true;
            }
            if (this.zzwg != zzcm.zzmy) {
                this.zzbmj.set(zzdu.zzb(this.zzbml.zzbnd, zze(this.zzvf), z, this.zzwg));
            }
            if (this.zzwg != zzcm.zzmx) {
                this.zzbmk.set(zzdf.zza(this.zzbml.zzbnd, zze(this.zzvf), z));
            }
        } finally {
            this.zzbmm.countDown();
            this.zzvf = null;
            this.zzbml = null;
        }
    }

    private final zzdj zzcb() {
        if (this.zzwg == zzcm.zzmy) {
            return this.zzbmk.get();
        }
        return this.zzbmj.get();
    }
}
