package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbke implements zzbqx, zzbrp, zzbsm, zzub {
    private final View view;
    private final zzdha zzfgj;
    private final zzdgo zzfgk;
    private final zzdld zzfgl;
    private final zzdt zzfgm;
    private boolean zzfgn;
    private boolean zzfgo;
    private final Context zzvf;

    public zzbke(Context context, zzdha zzdhaVar, zzdgo zzdgoVar, zzdld zzdldVar, View view, zzdt zzdtVar) {
        this.zzvf = context;
        this.zzfgj = zzdhaVar;
        this.zzfgk = zzdgoVar;
        this.zzfgl = zzdldVar;
        this.zzfgm = zzdtVar;
        this.view = view;
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdClosed() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdOpened() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final synchronized void onAdLoaded() {
        if (this.zzfgn) {
            ArrayList arrayList = new ArrayList(this.zzfgk.zzdev);
            arrayList.addAll(this.zzfgk.zzgtn);
            this.zzfgl.zza(this.zzfgj, this.zzfgk, true, null, arrayList);
        } else {
            this.zzfgl.zza(this.zzfgj, this.zzfgk, this.zzfgk.zzgtp);
            this.zzfgl.zza(this.zzfgj, this.zzfgk, this.zzfgk.zzgtn);
        }
        this.zzfgn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzub
    public final void onAdClicked() {
        zzdld zzdldVar = this.zzfgl;
        zzdha zzdhaVar = this.zzfgj;
        zzdgo zzdgoVar = this.zzfgk;
        zzdldVar.zza(zzdhaVar, zzdgoVar, zzdgoVar.zzdeu);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final synchronized void onAdImpression() {
        if (!this.zzfgo) {
            this.zzfgl.zza(this.zzfgj, this.zzfgk, false, ((Boolean) zzvj.zzpv().zzd(zzzz.zzcol)).booleanValue() ? this.zzfgm.zzcb().zza(this.zzvf, this.view, (Activity) null) : null, this.zzfgk.zzdev);
            this.zzfgo = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zzb(zzasd zzasdVar, String str, String str2) {
        zzdld zzdldVar = this.zzfgl;
        zzdha zzdhaVar = this.zzfgj;
        zzdgo zzdgoVar = this.zzfgk;
        zzdldVar.zza(zzdhaVar, zzdgoVar, zzdgoVar.zzdok, zzasdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onRewardedVideoStarted() {
        zzdld zzdldVar = this.zzfgl;
        zzdha zzdhaVar = this.zzfgj;
        zzdgo zzdgoVar = this.zzfgk;
        zzdldVar.zza(zzdhaVar, zzdgoVar, zzdgoVar.zzdoj);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onRewardedVideoCompleted() {
        zzdld zzdldVar = this.zzfgl;
        zzdha zzdhaVar = this.zzfgj;
        zzdgo zzdgoVar = this.zzfgk;
        zzdldVar.zza(zzdhaVar, zzdgoVar, zzdgoVar.zzgto);
    }
}
