package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbai implements zzdqx<Object> {
    private final /* synthetic */ String zzeaa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbai(String str) {
        this.zzeaa = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void onSuccess(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        com.google.android.gms.ads.internal.zzq.zzla().zza(th, this.zzeaa);
    }
}
