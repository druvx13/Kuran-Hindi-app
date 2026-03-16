package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbdk extends zzawn {
    final zzbbx zzebj;
    private final String zzebv;
    private final String[] zzebw;
    final zzbdl zzegn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdk(zzbbx zzbbxVar, zzbdl zzbdlVar, String str, String[] strArr) {
        this.zzebj = zzbbxVar;
        this.zzegn = zzbdlVar;
        this.zzebv = str;
        this.zzebw = strArr;
        com.google.android.gms.ads.internal.zzq.zzls().zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzawn
    public final void zzup() {
        try {
            this.zzegn.zze(this.zzebv, this.zzebw);
        } finally {
            zzaxa.zzdwf.post(new zzbdj(this));
        }
    }
}
