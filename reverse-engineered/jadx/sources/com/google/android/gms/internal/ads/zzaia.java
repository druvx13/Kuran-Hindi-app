package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaia {
    private final zzuk zzaca;
    private final zzvr zzacb;
    private final Context zzvf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaia(Context context, zzvr zzvrVar) {
        this(context, zzvrVar, zzuk.zzcev);
    }

    private zzaia(Context context, zzvr zzvrVar, zzuk zzukVar) {
        this.zzvf = context;
        this.zzacb = zzvrVar;
        this.zzaca = zzukVar;
    }

    private final void zza(zzxt zzxtVar) {
        try {
            this.zzacb.zzb(zzuk.zza(this.zzvf, zzxtVar));
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void loadAd(AdRequest adRequest) {
        zza(adRequest.zzdq());
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        zza(publisherAdRequest.zzdq());
    }
}
