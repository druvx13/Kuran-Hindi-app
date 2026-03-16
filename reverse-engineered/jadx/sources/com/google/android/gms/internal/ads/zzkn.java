package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzkn implements zzkl {
    private final zzos zzavw;
    private final int zzawe;
    private final int zzawf;

    public zzkn(zzkk zzkkVar) {
        zzos zzosVar = zzkkVar.zzavw;
        this.zzavw = zzosVar;
        zzosVar.zzbi(12);
        this.zzawe = this.zzavw.zzje();
        this.zzawf = this.zzavw.zzje();
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final int zzgw() {
        return this.zzawf;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final int zzgx() {
        int i = this.zzawe;
        return i == 0 ? this.zzavw.zzje() : i;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzgy() {
        return this.zzawe != 0;
    }
}
