package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcdx implements zzdqx<zzbek> {
    private final /* synthetic */ String zzeio;
    private final /* synthetic */ zzaga zzfwj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdx(zzcdt zzcdtVar, String str, zzaga zzagaVar) {
        this.zzeio = str;
        this.zzfwj = zzagaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(zzbek zzbekVar) {
        zzbekVar.zza(this.zzeio, this.zzfwj);
    }
}
