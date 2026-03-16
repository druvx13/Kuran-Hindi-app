package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcts implements zzctz<zzbns> {
    private final /* synthetic */ zzctt zzgjz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcts(zzctt zzcttVar) {
        this.zzgjz = zzcttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctz
    public final void zzapn() {
        synchronized (this.zzgjz) {
            zzctt.zza(this.zzgjz, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzctz
    public final /* synthetic */ void onSuccess(zzbns zzbnsVar) {
        zzbns zzbnsVar2 = zzbnsVar;
        synchronized (this.zzgjz) {
            zzctt.zza(this.zzgjz, false);
            this.zzgjz.zzacv = zzbnsVar2.zzaia();
            zzbnsVar2.zzahk();
        }
    }
}
