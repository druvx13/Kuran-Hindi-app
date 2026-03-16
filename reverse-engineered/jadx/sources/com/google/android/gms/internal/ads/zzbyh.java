package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zztf;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbyh implements zzbqx, zzbvi {
    private final View view;
    private final zzauu zzboj;
    private final zzaur zzfkp;
    private final zztf.zza.EnumC0025zza zzfpf;
    private String zzfpl;
    private final Context zzvf;

    public zzbyh(zzaur zzaurVar, Context context, zzauu zzauuVar, View view, zztf.zza.EnumC0025zza enumC0025zza) {
        this.zzfkp = zzaurVar;
        this.zzvf = context;
        this.zzboj = zzauuVar;
        this.view = view;
        this.zzfpf = enumC0025zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdOpened() {
        View view = this.view;
        if (view != null && this.zzfpl != null) {
            this.zzboj.zzg(view.getContext(), this.zzfpl);
        }
        this.zzfkp.zzam(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdClosed() {
        this.zzfkp.zzam(false);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzajn() {
        String zzad = this.zzboj.zzad(this.zzvf);
        this.zzfpl = zzad;
        String valueOf = String.valueOf(zzad);
        String str = this.zzfpf == zztf.zza.EnumC0025zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.zzfpl = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    @ParametersAreNonnullByDefault
    public final void zzb(zzasd zzasdVar, String str, String str2) {
        if (this.zzboj.zzab(this.zzvf)) {
            try {
                this.zzboj.zza(this.zzvf, this.zzboj.zzag(this.zzvf), this.zzfkp.getAdUnitId(), zzasdVar.getType(), zzasdVar.getAmount());
            } catch (RemoteException e) {
                zzawr.zzd("Remote Exception to get reward item.", e);
            }
        }
    }
}
