package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcro extends zzasx {
    private final /* synthetic */ zzbsu zzghh;
    private final /* synthetic */ zzbqw zzghi;
    private final /* synthetic */ zzbrx zzghj;
    private final /* synthetic */ zzbwd zzghk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcro(zzcrk zzcrkVar, zzbsu zzbsuVar, zzbqw zzbqwVar, zzbrx zzbrxVar, zzbwd zzbwdVar) {
        this.zzghh = zzbsuVar;
        this.zzghi = zzbqwVar;
        this.zzghj = zzbrxVar;
        this.zzghk = zzbwdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final void zzaf(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final void zzag(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final void zzb(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final void zzd(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final void zze(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final void zzah(IObjectWrapper iObjectWrapper) {
        this.zzghh.zzua();
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final void zzaj(IObjectWrapper iObjectWrapper) {
        this.zzghh.zztz();
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final void zzak(IObjectWrapper iObjectWrapper) {
        this.zzghi.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final void zzal(IObjectWrapper iObjectWrapper) {
        this.zzghj.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final void zza(IObjectWrapper iObjectWrapper, zzatc zzatcVar) {
        this.zzghk.zza(zzatcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final void zzai(IObjectWrapper iObjectWrapper) {
        this.zzghk.zzsm();
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final void zzam(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zzghj.onRewardedVideoCompleted();
    }
}
