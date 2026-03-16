package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzxw {
    private static final Object lock = new Object();
    private static zzxw zzche;
    private zzwp zzchf;
    private RewardedVideoAd zzchg;
    private RequestConfiguration zzchh = new RequestConfiguration.Builder().build();
    private InitializationStatus zzchi;

    private zzxw() {
    }

    public static zzxw zzqq() {
        zzxw zzxwVar;
        synchronized (lock) {
            if (zzche == null) {
                zzche = new zzxw();
            }
            zzxwVar = zzche;
        }
        return zzxwVar;
    }

    public final void zza(final Context context, String str, final OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (lock) {
            if (this.zzchf != null) {
                return;
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            try {
                zzalh.zzte().zzc(context, str);
                zzwp zzd = new zzvc(zzvj.zzps(), context).zzd(context, false);
                this.zzchf = zzd;
                if (onInitializationCompleteListener != null) {
                    zzd.zza(new zzyd(this, onInitializationCompleteListener, null));
                }
                this.zzchf.zza(new zzalm());
                this.zzchf.initialize();
                this.zzchf.zza(str, ObjectWrapper.wrap(new Runnable(this, context) { // from class: com.google.android.gms.internal.ads.zzxz
                    private final zzxw zzchl;
                    private final Context zzchn;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzchl = this;
                        this.zzchn = context;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzchl.getRewardedVideoAdInstance(this.zzchn);
                    }
                }));
                if (this.zzchh.getTagForChildDirectedTreatment() != -1 || this.zzchh.getTagForUnderAgeOfConsent() != -1) {
                    zza(this.zzchh);
                }
                zzzz.initialize(context);
                if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcrg)).booleanValue() && !getVersionString().endsWith("0")) {
                    zzazw.zzfa("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                    this.zzchi = new InitializationStatus(this) { // from class: com.google.android.gms.internal.ads.zzyb
                        private final zzxw zzchl;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzchl = this;
                        }

                        @Override // com.google.android.gms.ads.initialization.InitializationStatus
                        public final Map getAdapterStatusMap() {
                            zzxw zzxwVar = this.zzchl;
                            HashMap hashMap = new HashMap();
                            hashMap.put("com.google.android.gms.ads.MobileAds", new zzya(zzxwVar));
                            return hashMap;
                        }
                    };
                    if (onInitializationCompleteListener != null) {
                        zzazm.zzzn.post(new Runnable(this, onInitializationCompleteListener) { // from class: com.google.android.gms.internal.ads.zzxy
                            private final zzxw zzchl;
                            private final OnInitializationCompleteListener zzchm;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zzchl = this;
                                this.zzchm = onInitializationCompleteListener;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zzchl.zza(this.zzchm);
                            }
                        });
                    }
                }
            } catch (RemoteException e) {
                zzazw.zzd("MobileAdsSettingManager initialization failed", e);
            }
        }
    }

    public final RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        synchronized (lock) {
            if (this.zzchg != null) {
                return this.zzchg;
            }
            zzasv zzasvVar = new zzasv(context, new zzvh(zzvj.zzps(), context, new zzalm()).zzd(context, false));
            this.zzchg = zzasvVar;
            return zzasvVar;
        }
    }

    public final void setAppVolume(float f) {
        Preconditions.checkArgument(0.0f <= f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        Preconditions.checkState(this.zzchf != null, "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.zzchf.setAppVolume(f);
        } catch (RemoteException e) {
            zzazw.zzc("Unable to set app volume.", e);
        }
    }

    public final float zzqb() {
        zzwp zzwpVar = this.zzchf;
        if (zzwpVar == null) {
            return 1.0f;
        }
        try {
            return zzwpVar.zzqb();
        } catch (RemoteException e) {
            zzazw.zzc("Unable to get app volume.", e);
            return 1.0f;
        }
    }

    public final void setAppMuted(boolean z) {
        Preconditions.checkState(this.zzchf != null, "MobileAds.initialize() must be called prior to setting app muted state.");
        try {
            this.zzchf.setAppMuted(z);
        } catch (RemoteException e) {
            zzazw.zzc("Unable to set app mute state.", e);
        }
    }

    public final boolean zzqc() {
        zzwp zzwpVar = this.zzchf;
        if (zzwpVar == null) {
            return false;
        }
        try {
            return zzwpVar.zzqc();
        } catch (RemoteException e) {
            zzazw.zzc("Unable to get app mute state.", e);
            return false;
        }
    }

    public final void openDebugMenu(Context context, String str) {
        Preconditions.checkState(this.zzchf != null, "MobileAds.initialize() must be called prior to opening debug menu.");
        try {
            this.zzchf.zzb(ObjectWrapper.wrap(context), str);
        } catch (RemoteException e) {
            zzazw.zzc("Unable to open debug menu.", e);
        }
    }

    public final String getVersionString() {
        Preconditions.checkState(this.zzchf != null, "MobileAds.initialize() must be called prior to getting version string.");
        try {
            return zzdok.zzhe(this.zzchf.getVersionString());
        } catch (RemoteException e) {
            zzazw.zzc("Unable to get version string.", e);
            return "";
        }
    }

    public final void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        try {
            this.zzchf.zzcg(cls.getCanonicalName());
        } catch (RemoteException e) {
            zzazw.zzc("Unable to register RtbAdapter", e);
        }
    }

    public final InitializationStatus getInitializationStatus() {
        Preconditions.checkState(this.zzchf != null, "MobileAds.initialize() must be called prior to getting initialization status.");
        try {
            if (this.zzchi != null) {
                return this.zzchi;
            }
            return zzc(this.zzchf.zzqd());
        } catch (RemoteException unused) {
            zzazw.zzfa("Unable to get Initialization status.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzc(List<zzaha> list) {
        HashMap hashMap = new HashMap();
        for (zzaha zzahaVar : list) {
            hashMap.put(zzahaVar.zzdbg, new zzahi(zzahaVar.zzdbh ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzahaVar.description, zzahaVar.zzdbi));
        }
        return new zzahl(hashMap);
    }

    public final RequestConfiguration getRequestConfiguration() {
        return this.zzchh;
    }

    public final void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        RequestConfiguration requestConfiguration2 = this.zzchh;
        this.zzchh = requestConfiguration;
        if (this.zzchf == null) {
            return;
        }
        if (requestConfiguration2.getTagForChildDirectedTreatment() == requestConfiguration.getTagForChildDirectedTreatment() && requestConfiguration2.getTagForUnderAgeOfConsent() == requestConfiguration.getTagForUnderAgeOfConsent()) {
            return;
        }
        zza(requestConfiguration);
    }

    private final void zza(RequestConfiguration requestConfiguration) {
        try {
            this.zzchf.zza(new zzyy(requestConfiguration));
        } catch (RemoteException e) {
            zzazw.zzc("Unable to set request configuration parcel.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(OnInitializationCompleteListener onInitializationCompleteListener) {
        onInitializationCompleteListener.onInitializationComplete(this.zzchi);
    }
}
