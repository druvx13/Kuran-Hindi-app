package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzrw {
    private final int orientation;
    private final zzxt zzacc;
    private zzvz zzbsb;
    private final String zzbsc;
    private final AppOpenAd.AppOpenAdLoadCallback zzbsd;
    private final Context zzvf;
    private final zzalm zzbse = new zzalm();
    private final zzuk zzaca = zzuk.zzcev;

    public zzrw(Context context, String str, zzxt zzxtVar, int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzvf = context;
        this.zzbsc = str;
        this.zzacc = zzxtVar;
        this.orientation = i;
        this.zzbsd = appOpenAdLoadCallback;
    }

    public final void zzmt() {
        try {
            this.zzbsb = zzvj.zzps().zza(this.zzvf, zzum.zzpj(), this.zzbsc, this.zzbse);
            this.zzbsb.zza(new zzut(this.orientation));
            this.zzbsb.zza(new zzrk(this.zzbsd));
            this.zzbsb.zza(zzuk.zza(this.zzvf, this.zzacc));
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }
}
