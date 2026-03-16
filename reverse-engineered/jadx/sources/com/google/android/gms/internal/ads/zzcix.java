package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcix implements AppEventListener, zzbqx, zzbrc, zzbrp, zzbrs, zzbsm, zzbtm, zzdla, zzub {
    private long startTime;
    private final List<Object> zzdzj;
    private final zzcil zzfzu;

    public zzcix(zzcil zzcilVar, zzbgy zzbgyVar) {
        this.zzfzu = zzcilVar;
        this.zzdzj = Collections.singletonList(zzbgyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzb(zzdha zzdhaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzbx(Context context) {
        zza(zzbrs.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzby(Context context) {
        zza(zzbrs.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzbz(Context context) {
        zza(zzbrs.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.ads.doubleclick.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zza(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void onAdLoaded() {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - this.startTime;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime);
        zzawr.zzeg(sb.toString());
        zza(zzbsm.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void onAdFailedToLoad(int i) {
        zza(zzbrc.class, "onAdFailedToLoad", Integer.valueOf(i));
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdOpened() {
        zza(zzbqx.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdClosed() {
        zza(zzbqx.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdLeftApplication() {
        zza(zzbqx.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzub
    public final void onAdClicked() {
        zza(zzub.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void onAdImpression() {
        zza(zzbrp.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onRewardedVideoStarted() {
        zza(zzbqx.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    @ParametersAreNonnullByDefault
    public final void zzb(zzasd zzasdVar, String str, String str2) {
        zza(zzbqx.class, "onRewarded", zzasdVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onRewardedVideoCompleted() {
        zza(zzbqx.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zza(zzdkr zzdkrVar, String str) {
        zza(zzdks.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zzb(zzdkr zzdkrVar, String str) {
        zza(zzdks.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zza(zzdkr zzdkrVar, String str, Throwable th) {
        zza(zzdks.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zzc(zzdkr zzdkrVar, String str) {
        zza(zzdks.class, "onTaskSucceeded", str);
    }

    private final void zza(Class<?> cls, String str, Object... objArr) {
        zzcil zzcilVar = this.zzfzu;
        List<Object> list = this.zzdzj;
        String valueOf = String.valueOf(cls.getSimpleName());
        zzcilVar.zza(list, valueOf.length() != 0 ? "Event-".concat(valueOf) : new String("Event-"), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzd(zzarj zzarjVar) {
        this.startTime = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime();
        zza(zzbtm.class, "onAdRequest", new Object[0]);
    }
}
