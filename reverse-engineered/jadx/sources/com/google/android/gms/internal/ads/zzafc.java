package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzafc extends zzaej {
    private final OnPublisherAdViewLoadedListener zzczo;

    public zzafc(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.zzczo = onPublisherAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzaeg
    public final void zza(zzvz zzvzVar, IObjectWrapper iObjectWrapper) {
        if (zzvzVar == null || iObjectWrapper == null) {
            return;
        }
        PublisherAdView publisherAdView = new PublisherAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzvzVar.zzkk() instanceof zzuf) {
                zzuf zzufVar = (zzuf) zzvzVar.zzkk();
                publisherAdView.setAdListener(zzufVar != null ? zzufVar.getAdListener() : null);
            }
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
        try {
            if (zzvzVar.zzkj() instanceof zzuq) {
                zzuq zzuqVar = (zzuq) zzvzVar.zzkj();
                publisherAdView.setAppEventListener(zzuqVar != null ? zzuqVar.getAppEventListener() : null);
            }
        } catch (RemoteException e2) {
            zzazw.zzc("", e2);
        }
        zzazm.zzzn.post(new zzaff(this, publisherAdView, zzvzVar));
    }
}
