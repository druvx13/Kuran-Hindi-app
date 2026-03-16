package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzhw {
    private final zzdns zzaes;
    private final zzhx zzaih;

    public zzhw(zzdns zzdnsVar, zzhx zzhxVar) {
        this.zzaes = zzhxVar != null ? (zzdns) zzoh.checkNotNull(zzdnsVar) : null;
        this.zzaih = zzhxVar;
    }

    public final void zza(zziy zziyVar) {
        if (this.zzaih != null) {
            this.zzaes.post(new zzhz(this, zziyVar));
        }
    }

    public final void zza(String str, long j, long j2) {
        if (this.zzaih != null) {
            this.zzaes.post(new zzhy(this, str, j, j2));
        }
    }

    public final void zzb(zzhf zzhfVar) {
        if (this.zzaih != null) {
            this.zzaes.post(new zzib(this, zzhfVar));
        }
    }

    public final void zza(int i, long j, long j2) {
        if (this.zzaih != null) {
            this.zzaes.post(new zzia(this, i, j, j2));
        }
    }

    public final void zzb(zziy zziyVar) {
        if (this.zzaih != null) {
            this.zzaes.post(new zzid(this, zziyVar));
        }
    }

    public final void zzt(int i) {
        if (this.zzaih != null) {
            this.zzaes.post(new zzic(this, i));
        }
    }
}
