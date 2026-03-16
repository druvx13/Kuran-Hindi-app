package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzamt<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends zzalt {
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> zzdhg;
    private final NETWORK_EXTRAS zzdhh;

    public zzamt(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.zzdhg = mediationAdapter;
        this.zzdhh = network_extras;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final zzxl getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void showVideo() {
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(IObjectWrapper iObjectWrapper, zzahc zzahcVar, List<zzahk> list) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(IObjectWrapper iObjectWrapper, zzasy zzasyVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, zzasy zzasyVar, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, String str2, zzalv zzalvVar, zzaci zzaciVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(zzuj zzujVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(zzuj zzujVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zzb(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, zzalv zzalvVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zzc(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, zzalv zzalvVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final zzaly zztg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final zzamd zzth() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final boolean zztk() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final zzado zztl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final zzame zztm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final zzaoj zztn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final zzaoj zzto() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final IObjectWrapper zztf() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdhg;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzazw.zzfc(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.wrap(((MediationBannerAdapter) mediationAdapter).getBannerView());
        } catch (Throwable th) {
            zzazw.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(IObjectWrapper iObjectWrapper, zzum zzumVar, zzuj zzujVar, String str, zzalv zzalvVar) throws RemoteException {
        zza(iObjectWrapper, zzumVar, zzujVar, str, null, zzalvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(IObjectWrapper iObjectWrapper, zzum zzumVar, zzuj zzujVar, String str, String str2, zzalv zzalvVar) throws RemoteException {
        AdSize adSize;
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdhg;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzazw.zzfc(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzazw.zzed("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzdhg;
            zzams zzamsVar = new zzams(zzalvVar);
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
            SERVER_PARAMETERS zzdn = zzdn(str);
            int i = 0;
            AdSize[] adSizeArr = {AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER};
            while (true) {
                if (i < 6) {
                    if (adSizeArr[i].getWidth() == zzumVar.width && adSizeArr[i].getHeight() == zzumVar.height) {
                        adSize = adSizeArr[i];
                        break;
                    }
                    i++;
                } else {
                    adSize = new AdSize(com.google.android.gms.ads.zzb.zza(zzumVar.width, zzumVar.height, zzumVar.zzacf));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(zzamsVar, activity, zzdn, adSize, zzane.zza(zzujVar, zzc(zzujVar)), this.zzdhh);
        } catch (Throwable th) {
            zzazw.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final Bundle zzti() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, zzalv zzalvVar) throws RemoteException {
        zza(iObjectWrapper, zzujVar, str, (String) null, zzalvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, String str2, zzalv zzalvVar) throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdhg;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzazw.zzfc(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzazw.zzed("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdhg).requestInterstitialAd(new zzams(zzalvVar), (Activity) ObjectWrapper.unwrap(iObjectWrapper), zzdn(str), zzane.zza(zzujVar, zzc(zzujVar)), this.zzdhh);
        } catch (Throwable th) {
            zzazw.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void showInterstitial() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdhg;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzazw.zzfc(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzazw.zzed("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdhg).showInterstitial();
        } catch (Throwable th) {
            zzazw.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final Bundle zztj() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void destroy() throws RemoteException {
        try {
            this.zzdhg.destroy();
        } catch (Throwable th) {
            zzazw.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void resume() throws RemoteException {
        throw new RemoteException();
    }

    private final SERVER_PARAMETERS zzdn(String str) throws RemoteException {
        HashMap hashMap;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.zzdhg.getServerParametersType();
            if (serverParametersType != null) {
                SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
                newInstance.load(hashMap);
                return newInstance;
            }
            return null;
        } catch (Throwable th) {
            zzazw.zzc("", th);
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
}
