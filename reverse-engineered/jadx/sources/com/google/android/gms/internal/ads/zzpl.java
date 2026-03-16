package com.google.android.gms.internal.ads;

import android.view.Surface;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzpl {
    private final zzdns zzaes;
    private final zzpm zzbkh;

    public zzpl(zzdns zzdnsVar, zzpm zzpmVar) {
        this.zzaes = zzpmVar != null ? (zzdns) zzoh.checkNotNull(zzdnsVar) : null;
        this.zzbkh = zzpmVar;
    }

    public final void zza(zziy zziyVar) {
        if (this.zzbkh != null) {
            this.zzaes.post(new zzpo(this, zziyVar));
        }
    }

    public final void zza(String str, long j, long j2) {
        if (this.zzbkh != null) {
            this.zzaes.post(new zzpn(this, str, j, j2));
        }
    }

    public final void zzb(zzhf zzhfVar) {
        if (this.zzbkh != null) {
            this.zzaes.post(new zzpq(this, zzhfVar));
        }
    }

    public final void zze(int i, long j) {
        if (this.zzbkh != null) {
            this.zzaes.post(new zzpp(this, i, j));
        }
    }

    public final void zza(int i, int i2, int i3, float f) {
        if (this.zzbkh != null) {
            this.zzaes.post(new zzps(this, i, i2, i3, f));
        }
    }

    public final void zza(Surface surface) {
        if (this.zzbkh != null) {
            this.zzaes.post(new zzpr(this, surface));
        }
    }

    public final void zzb(zziy zziyVar) {
        if (this.zzbkh != null) {
            this.zzaes.post(new zzpt(this, zziyVar));
        }
    }
}
