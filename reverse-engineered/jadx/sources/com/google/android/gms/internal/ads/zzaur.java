package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaur implements zzpz {
    private final Object lock;
    private String zzbsc;
    private final Context zzciq;
    private boolean zzdsl;

    public zzaur(Context context, String str) {
        this.zzciq = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzbsc = str;
        this.zzdsl = false;
        this.lock = new Object();
    }

    public final void zzam(boolean z) {
        if (com.google.android.gms.ads.internal.zzq.zzlu().zzab(this.zzciq)) {
            synchronized (this.lock) {
                if (this.zzdsl == z) {
                    return;
                }
                this.zzdsl = z;
                if (TextUtils.isEmpty(this.zzbsc)) {
                    return;
                }
                if (this.zzdsl) {
                    com.google.android.gms.ads.internal.zzq.zzlu().zze(this.zzciq, this.zzbsc);
                } else {
                    com.google.android.gms.ads.internal.zzq.zzlu().zzf(this.zzciq, this.zzbsc);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zza(zzqa zzqaVar) {
        zzam(zzqaVar.zzbot);
    }

    public final String getAdUnitId() {
        return this.zzbsc;
    }
}
