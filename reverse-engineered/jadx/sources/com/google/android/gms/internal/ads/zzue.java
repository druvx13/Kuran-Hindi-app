package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzue extends RemoteCreator<zzvx> {
    public zzue() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final zzvs zza(Context context, String str, zzalp zzalpVar) {
        try {
            IBinder zzc = getRemoteCreatorInstance(context).zzc(ObjectWrapper.wrap(context), str, zzalpVar, 201004000);
            if (zzc == null) {
                return null;
            }
            IInterface queryLocalInterface = zzc.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzvs) {
                return (zzvs) queryLocalInterface;
            }
            return new zzvu(zzc);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzazw.zzd("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzvx getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof zzvx) {
            return (zzvx) queryLocalInterface;
        }
        return new zzvw(iBinder);
    }
}
