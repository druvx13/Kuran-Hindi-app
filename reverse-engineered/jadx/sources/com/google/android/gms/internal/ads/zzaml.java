package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaml extends zzalt {
    private final Object zzdgp;
    private zzamm zzdgq;
    private zzasy zzdgr;
    private IObjectWrapper zzdgs;
    private MediationRewardedAd zzdgt;

    public zzaml(MediationAdapter mediationAdapter) {
        this.zzdgp = mediationAdapter;
    }

    public zzaml(Adapter adapter) {
        this.zzdgp = adapter;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final IObjectWrapper zztf() throws RemoteException {
        Object obj = this.zzdgp;
        if (!(obj instanceof MediationBannerAdapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazw.zzfc(sb.toString());
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
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
        AdSize zza;
        if (!(this.zzdgp instanceof MediationBannerAdapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazw.zzfc(sb.toString());
            throw new RemoteException();
        }
        zzazw.zzed("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzdgp;
            zzami zzamiVar = new zzami(zzujVar.zzceg == -1 ? null : new Date(zzujVar.zzceg), zzujVar.zzceh, zzujVar.zzcei != null ? new HashSet(zzujVar.zzcei) : null, zzujVar.zzmp, zzc(zzujVar), zzujVar.zzacq, zzujVar.zzces, zzujVar.zzacr, zza(str, zzujVar));
            Bundle bundle = zzujVar.zzcen != null ? zzujVar.zzcen.getBundle(mediationBannerAdapter.getClass().getName()) : null;
            if (zzumVar.zzcfd) {
                zza = com.google.android.gms.ads.zzb.zza(zzumVar.width, zzumVar.height);
            } else {
                zza = com.google.android.gms.ads.zzb.zza(zzumVar.width, zzumVar.height, zzumVar.zzacf);
            }
            mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzamm(zzalvVar), zza(str, zzujVar, str2), zza, zzamiVar, bundle);
        } catch (Throwable th) {
            zzazw.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final Bundle zzti() {
        Object obj = this.zzdgp;
        if (!(obj instanceof zzbgx)) {
            String canonicalName = zzbgx.class.getCanonicalName();
            String canonicalName2 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazw.zzfc(sb.toString());
            return new Bundle();
        }
        return ((zzbgx) obj).zzti();
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, zzalv zzalvVar) throws RemoteException {
        zza(iObjectWrapper, zzujVar, str, (String) null, zzalvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, String str2, zzalv zzalvVar) throws RemoteException {
        if (!(this.zzdgp instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazw.zzfc(sb.toString());
            throw new RemoteException();
        }
        zzazw.zzed("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.zzdgp;
            mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzamm(zzalvVar), zza(str, zzujVar, str2), new zzami(zzujVar.zzceg == -1 ? null : new Date(zzujVar.zzceg), zzujVar.zzceh, zzujVar.zzcei != null ? new HashSet(zzujVar.zzcei) : null, zzujVar.zzmp, zzc(zzujVar), zzujVar.zzacq, zzujVar.zzces, zzujVar.zzacr, zza(str, zzujVar)), zzujVar.zzcen != null ? zzujVar.zzcen.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            zzazw.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final Bundle getInterstitialAdapterInfo() {
        Object obj = this.zzdgp;
        if (!(obj instanceof zzbgz)) {
            String canonicalName = zzbgz.class.getCanonicalName();
            String canonicalName2 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazw.zzfc(sb.toString());
            return new Bundle();
        }
        return ((zzbgz) obj).getInterstitialAdapterInfo();
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, String str2, zzalv zzalvVar, zzaci zzaciVar, List<String> list) throws RemoteException {
        Object obj = this.zzdgp;
        if (!(obj instanceof MediationNativeAdapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazw.zzfc(sb.toString());
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
            zzamq zzamqVar = new zzamq(zzujVar.zzceg == -1 ? null : new Date(zzujVar.zzceg), zzujVar.zzceh, zzujVar.zzcei != null ? new HashSet(zzujVar.zzcei) : null, zzujVar.zzmp, zzc(zzujVar), zzujVar.zzacq, zzaciVar, list, zzujVar.zzces, zzujVar.zzacr, zza(str, zzujVar));
            Bundle bundle = zzujVar.zzcen != null ? zzujVar.zzcen.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.zzdgq = new zzamm(zzalvVar);
            mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzdgq, zza(str, zzujVar, str2), zzamqVar, bundle);
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
    public final zzaly zztg() {
        NativeAdMapper zztt = this.zzdgq.zztt();
        if (zztt instanceof NativeAppInstallAdMapper) {
            return new zzamo((NativeAppInstallAdMapper) zztt);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final zzame zztm() {
        UnifiedNativeAdMapper zztu = this.zzdgq.zztu();
        if (zztu != null) {
            return new zzang(zztu);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final zzamd zzth() {
        NativeAdMapper zztt = this.zzdgq.zztt();
        if (zztt instanceof NativeContentAdMapper) {
            return new zzamr((NativeContentAdMapper) zztt);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final zzado zztl() {
        NativeCustomTemplateAd zztv = this.zzdgq.zztv();
        if (zztv instanceof zzadt) {
            return ((zzadt) zztv).zzsi();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final boolean zztk() {
        return this.zzdgp instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, zzasy zzasyVar, String str2) throws RemoteException {
        zzami zzamiVar;
        Bundle bundle;
        Object obj = this.zzdgp;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzazw.zzed("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzdgp;
                Bundle zza = zza(str2, zzujVar, (String) null);
                if (zzujVar != null) {
                    zzami zzamiVar2 = new zzami(zzujVar.zzceg == -1 ? null : new Date(zzujVar.zzceg), zzujVar.zzceh, zzujVar.zzcei != null ? new HashSet(zzujVar.zzcei) : null, zzujVar.zzmp, zzc(zzujVar), zzujVar.zzacq, zzujVar.zzces, zzujVar.zzacr, zza(str2, zzujVar));
                    bundle = zzujVar.zzcen != null ? zzujVar.zzcen.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    zzamiVar = zzamiVar2;
                } else {
                    zzamiVar = null;
                    bundle = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzamiVar, str, new zzasz(zzasyVar), zza, bundle);
            } catch (Throwable th) {
                zzazw.zzc("", th);
                throw new RemoteException();
            }
        } else if (!(obj instanceof Adapter)) {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzazw.zzfc(sb.toString());
            throw new RemoteException();
        } else {
            this.zzdgs = iObjectWrapper;
            this.zzdgr = zzasyVar;
            zzasyVar.zzaf(ObjectWrapper.wrap(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(IObjectWrapper iObjectWrapper, zzasy zzasyVar, List<String> list) throws RemoteException {
        if (!(this.zzdgp instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazw.zzfc(sb.toString());
            throw new RemoteException();
        }
        zzazw.zzed("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.zzdgp;
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                arrayList.add(zza(str, (zzuj) null, (String) null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzasz(zzasyVar), arrayList);
        } catch (Throwable th) {
            zzazw.zzd("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(zzuj zzujVar, String str) throws RemoteException {
        zza(zzujVar, str, (String) null);
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(zzuj zzujVar, String str, String str2) throws RemoteException {
        Object obj = this.zzdgp;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzazw.zzed("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzdgp;
                mediationRewardedVideoAdAdapter.loadAd(new zzami(zzujVar.zzceg == -1 ? null : new Date(zzujVar.zzceg), zzujVar.zzceh, zzujVar.zzcei != null ? new HashSet(zzujVar.zzcei) : null, zzujVar.zzmp, zzc(zzujVar), zzujVar.zzacq, zzujVar.zzces, zzujVar.zzacr, zza(str, zzujVar)), zza(str, zzujVar, str2), zzujVar.zzcen != null ? zzujVar.zzcen.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                zzazw.zzc("", th);
                throw new RemoteException();
            }
        } else if (!(obj instanceof Adapter)) {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzazw.zzfc(sb.toString());
            throw new RemoteException();
        } else {
            zzb(this.zzdgs, zzujVar, str, new zzamp((Adapter) this.zzdgp, this.zzdgr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void showVideo() throws RemoteException {
        Object obj = this.zzdgp;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzazw.zzed("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.zzdgp).showVideo();
            } catch (Throwable th) {
                zzazw.zzc("", th);
                throw new RemoteException();
            }
        } else if (!(obj instanceof Adapter)) {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzazw.zzfc(sb.toString());
            throw new RemoteException();
        } else {
            MediationRewardedAd mediationRewardedAd = this.zzdgt;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzdgs));
            } else {
                zzazw.zzfa("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final boolean isInitialized() throws RemoteException {
        Object obj = this.zzdgp;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzazw.zzed("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.zzdgp).isInitialized();
            } catch (Throwable th) {
                zzazw.zzc("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return this.zzdgr != null;
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzazw.zzfc(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zzb(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, zzalv zzalvVar) throws RemoteException {
        if (!(this.zzdgp instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazw.zzfc(sb.toString());
            throw new RemoteException();
        }
        zzazw.zzed("Requesting rewarded ad from adapter.");
        try {
            ((Adapter) this.zzdgp).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zza(str, zzujVar, (String) null), zzd(zzujVar), zzc(zzujVar), zzujVar.zzmp, zzujVar.zzacq, zzujVar.zzacr, zza(str, zzujVar), ""), zza(zzalvVar));
        } catch (Exception e) {
            zzazw.zzc("", e);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zzc(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, zzalv zzalvVar) throws RemoteException {
        if (!(this.zzdgp instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazw.zzfc(sb.toString());
            throw new RemoteException();
        }
        zzazw.zzed("Requesting rewarded interstitial ad from adapter.");
        try {
            ((Adapter) this.zzdgp).zza(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zza(str, zzujVar, (String) null), zzd(zzujVar), zzc(zzujVar), zzujVar.zzmp, zzujVar.zzacq, zzujVar.zzacr, zza(str, zzujVar), ""), zza(zzalvVar));
        } catch (Exception e) {
            zzazw.zzc("", e);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (!(this.zzdgp instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazw.zzfc(sb.toString());
            throw new RemoteException();
        }
        zzazw.zzed("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.zzdgt;
        if (mediationRewardedAd != null) {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } else {
            zzazw.zzfa("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Object obj = this.zzdgp;
        if (!(obj instanceof OnImmersiveModeUpdatedListener)) {
            String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
            String canonicalName2 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazw.zzed(sb.toString());
            return;
        }
        try {
            ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            zzazw.zzc("", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final zzxl getVideoController() {
        Object obj = this.zzdgp;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th) {
                zzazw.zzc("", th);
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void showInterstitial() throws RemoteException {
        if (!(this.zzdgp instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdgp.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzazw.zzfc(sb.toString());
            throw new RemoteException();
        }
        zzazw.zzed("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdgp).showInterstitial();
        } catch (Throwable th) {
            zzazw.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void destroy() throws RemoteException {
        Object obj = this.zzdgp;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzazw.zzc("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void pause() throws RemoteException {
        Object obj = this.zzdgp;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzazw.zzc("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void resume() throws RemoteException {
        Object obj = this.zzdgp;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzazw.zzc("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zzdgp;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final void zza(IObjectWrapper iObjectWrapper, zzahc zzahcVar, List<zzahk> list) throws RemoteException {
        AdFormat adFormat;
        if (!(this.zzdgp instanceof Adapter)) {
            throw new RemoteException();
        }
        zzamk zzamkVar = new zzamk(this, zzahcVar);
        ArrayList arrayList = new ArrayList();
        for (zzahk zzahkVar : list) {
            String str = zzahkVar.zzdbk;
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
                throw new RemoteException();
            }
            arrayList.add(new MediationConfiguration(adFormat, zzahkVar.extras));
        }
        ((Adapter) this.zzdgp).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzamkVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final zzaoj zztn() {
        Object obj = this.zzdgp;
        if (obj instanceof Adapter) {
            return zzaoj.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final zzaoj zzto() {
        Object obj = this.zzdgp;
        if (obj instanceof Adapter) {
            return zzaoj.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> zza(zzalv zzalvVar) {
        return new zzamn(this, zzalvVar);
    }

    private final Bundle zza(String str, zzuj zzujVar, String str2) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzazw.zzed(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
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
                bundle = bundle2;
            }
            if (this.zzdgp instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzujVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzujVar.zzacq);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
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
        return (zzujVar.zzcen == null || (bundle = zzujVar.zzcen.getBundle(this.zzdgp.getClass().getName())) == null) ? new Bundle() : bundle;
    }
}
