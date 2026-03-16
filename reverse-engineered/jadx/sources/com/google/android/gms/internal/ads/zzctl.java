package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzctl implements zzdqx<zzblx> {
    private final /* synthetic */ zzbmt zzgjo;
    private final /* synthetic */ zzcti zzgjp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzctl(zzcti zzctiVar, zzbmt zzbmtVar) {
        this.zzgjp = zzctiVar;
        this.zzgjo = zzbmtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        zzbte zzbteVar;
        synchronized (this.zzgjp) {
            zzcti.zza(this.zzgjp, (zzdri) null);
            this.zzgjo.zzaee().onAdFailedToLoad(zzcjk.zzd(th));
            zzbteVar = this.zzgjp.zzgji;
            zzbteVar.zzdp(60);
            zzdhn.zzc(th, "BannerAdManagerShim.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(zzblx zzblxVar) {
        zzblx zzblxVar2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzbte zzbteVar;
        zzblx zzblxVar3;
        zzblx zzblxVar4 = zzblxVar;
        synchronized (this.zzgjp) {
            zzcti.zza(this.zzgjp, (zzdri) null);
            zzblxVar2 = this.zzgjp.zzgiu;
            if (zzblxVar2 != null) {
                zzblxVar3 = this.zzgjp.zzgiu;
                zzblxVar3.destroy();
            }
            this.zzgjp.zzgiu = zzblxVar4;
            viewGroup = this.zzgjp.zzfiv;
            viewGroup.removeAllViews();
            if (zzblxVar4.zzahe() != null) {
                ViewParent parent = zzblxVar4.zzahe().getParent();
                if (parent instanceof ViewGroup) {
                    String mediationAdapterClassName = this.zzgjp.getMediationAdapterClassName();
                    StringBuilder sb = new StringBuilder(String.valueOf(mediationAdapterClassName).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(mediationAdapterClassName);
                    sb.append(" already has a parent view. Removing its old parent.");
                    zzawr.zzfc(sb.toString());
                    ((ViewGroup) parent).removeView(zzblxVar4.zzahe());
                }
            }
            viewGroup2 = this.zzgjp.zzfiv;
            viewGroup2.addView(zzblxVar4.zzahe());
            zzblxVar4.zzahk();
            zzbteVar = this.zzgjp.zzgji;
            zzbteVar.zzdp(zzblxVar4.zzahj());
        }
    }
}
