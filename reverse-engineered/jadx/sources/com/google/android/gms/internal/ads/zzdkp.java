package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [O] */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdkp<O> implements zzdqx<O> {
    private final /* synthetic */ zzdkd zzgzk;
    private final /* synthetic */ zzdkm zzgzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdkp(zzdkm zzdkmVar, zzdkd zzdkdVar) {
        this.zzgzl = zzdkmVar;
        this.zzgzk = zzdkdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void onSuccess(O o) {
        zzdkg.zzc(this.zzgzl.zzgzf).zzc(this.zzgzk);
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        zzdkg.zzc(this.zzgzl.zzgzf).zza(this.zzgzk, th);
    }
}
