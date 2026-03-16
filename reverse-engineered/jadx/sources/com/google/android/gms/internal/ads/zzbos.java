package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbos implements zzdqx<zzarj> {
    private final /* synthetic */ zzboq zzflt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbos(zzboq zzboqVar) {
        this.zzflt = zzboqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        zzbtx zzbtxVar;
        zzbtxVar = this.zzflt.zzflp;
        zzbtxVar.zzbg(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(@NullableDecl zzarj zzarjVar) {
        zzbtx zzbtxVar;
        zzbtxVar = this.zzflt.zzflp;
        zzbtxVar.zzbg(true);
    }
}
