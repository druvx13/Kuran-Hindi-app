package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaoa extends zzanu {
    private MediationRewardedAd zzdgt;
    private final RtbAdapter zzdhn;
    private MediationInterstitialAd zzdho;
    private String zzdhp = "";

    public zzaoa(RtbAdapter rtbAdapter) {
        this.zzdhn = rtbAdapter;
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zza(String[] strArr, Bundle[] bundleArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zzy(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zza(String str, String str2, zzuj zzujVar, IObjectWrapper iObjectWrapper, zzanj zzanjVar, zzalv zzalvVar, zzum zzumVar) throws RemoteException {
        try {
            this.zzdhn.loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdr(str2), zzd(zzujVar), zzc(zzujVar), zzujVar.zzmp, zzujVar.zzacq, zzujVar.zzacr, zza(str2, zzujVar), com.google.android.gms.ads.zzb.zza(zzumVar.width, zzumVar.height, zzumVar.zzacf), this.zzdhp), new zzaod(this, zzanjVar, zzalvVar));
        } catch (Throwable th) {
            zzazw.zzc("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zza(String str, String str2, zzuj zzujVar, IObjectWrapper iObjectWrapper, zzank zzankVar, zzalv zzalvVar) throws RemoteException {
        try {
            this.zzdhn.loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdr(str2), zzd(zzujVar), zzc(zzujVar), zzujVar.zzmp, zzujVar.zzacq, zzujVar.zzacr, zza(str2, zzujVar), this.zzdhp), new zzaoc(this, zzankVar, zzalvVar));
        } catch (Throwable th) {
            zzazw.zzc("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zza(String str, String str2, zzuj zzujVar, IObjectWrapper iObjectWrapper, zzanq zzanqVar, zzalv zzalvVar) throws RemoteException {
        try {
            this.zzdhn.loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdr(str2), zzd(zzujVar), zzc(zzujVar), zzujVar.zzmp, zzujVar.zzacq, zzujVar.zzacr, zza(str2, zzujVar), this.zzdhp), zza(zzanqVar, zzalvVar));
        } catch (Throwable th) {
            zzazw.zzc("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zzb(String str, String str2, zzuj zzujVar, IObjectWrapper iObjectWrapper, zzanq zzanqVar, zzalv zzalvVar) throws RemoteException {
        try {
            this.zzdhn.zza(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdr(str2), zzd(zzujVar), zzc(zzujVar), zzujVar.zzmp, zzujVar.zzacq, zzujVar.zzacr, zza(str2, zzujVar), this.zzdhp), zza(zzanqVar, zzalvVar));
        } catch (Throwable th) {
            zzazw.zzc("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zza(String str, String str2, zzuj zzujVar, IObjectWrapper iObjectWrapper, zzanp zzanpVar, zzalv zzalvVar) throws RemoteException {
        try {
            this.zzdhn.loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdr(str2), zzd(zzujVar), zzc(zzujVar), zzujVar.zzmp, zzujVar.zzacq, zzujVar.zzacr, zza(str2, zzujVar), this.zzdhp), new zzaof(this, zzanpVar, zzalvVar));
        } catch (Throwable th) {
            zzazw.zzc("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final boolean zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.zzdho;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzazw.zzc("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final boolean zzaa(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.zzdgt;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzazw.zzc("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final zzxl getVideoController() {
        RtbAdapter rtbAdapter = this.zzdhn;
        if (rtbAdapter instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                zzazw.zzc("", th);
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzum zzumVar, zzanw zzanwVar) throws RemoteException {
        AdFormat adFormat;
        try {
            zzaoe zzaoeVar = new zzaoe(this, zzanwVar);
            RtbAdapter rtbAdapter = this.zzdhn;
            char c = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 3;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                adFormat = AdFormat.BANNER;
            } else if (c == 1) {
                adFormat = AdFormat.INTERSTITIAL;
            } else if (c == 2) {
                adFormat = AdFormat.REWARDED;
            } else if (c == 3) {
                adFormat = AdFormat.NATIVE;
            } else {
                throw new IllegalArgumentException("Internal Error");
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zzb.zza(zzumVar.width, zzumVar.height, zzumVar.zzacf)), zzaoeVar);
        } catch (Throwable th) {
            zzazw.zzc("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final zzaoj zztn() throws RemoteException {
        return zzaoj.zza(this.zzdhn.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final zzaoj zzto() throws RemoteException {
        return zzaoj.zza(this.zzdhn.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zzdp(String str) {
        this.zzdhp = str;
    }

    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> zza(zzanq zzanqVar, zzalv zzalvVar) {
        return new zzaoh(this, zzanqVar, zzalvVar);
    }

    private static Bundle zzdr(String str) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzazw.zzfc(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                return bundle2;
            }
            return bundle;
        } catch (JSONException e) {
            zzazw.zzc("", e);
            throw new RemoteException();
        }
    }

    private static boolean zzc(zzuj zzujVar) {
        if (zzujVar.zzcej) {
            return true;
        }
        zzvj.zzpr();
        return zzazm.zzyd();
    }

    private static String zza(String str, zzuj zzujVar) {
        String str2 = zzujVar.zzacs;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    private final Bundle zzd(zzuj zzujVar) {
        Bundle bundle;
        return (zzujVar.zzcen == null || (bundle = zzujVar.zzcen.getBundle(this.zzdhn.getClass().getName())) == null) ? new Bundle() : bundle;
    }
}
