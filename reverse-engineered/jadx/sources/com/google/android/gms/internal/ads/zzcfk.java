package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcfk implements zzapa {
    private final /* synthetic */ zzcfa zzfxh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfk(zzcfa zzcfaVar) {
        this.zzfxh = zzcfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zza(int i, int i2, int i3, int i4) {
        zzbrx zzbrxVar;
        zzbrxVar = this.zzfxh.zzflh;
        zzbrxVar.onAdOpened();
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zzud() {
        zzbrx zzbrxVar;
        zzbrxVar = this.zzfxh.zzflh;
        zzbrxVar.onAdClosed();
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zzue() {
        zzbtl zzbtlVar;
        zzbtlVar = this.zzfxh.zzfxe;
        zzbtlVar.zzaho();
    }
}
