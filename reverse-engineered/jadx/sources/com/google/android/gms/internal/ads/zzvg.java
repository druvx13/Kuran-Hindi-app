package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzvg<T> {
    private static final zzwi zzcfx = zzpo();

    protected abstract T zza(zzwi zzwiVar) throws RemoteException;

    protected abstract T zzpm();

    protected abstract T zzpn() throws RemoteException;

    private static zzwi zzpo() {
        try {
            Object newInstance = zzuu.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzazw.zzfc("ClientApi class is not an instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            if (queryLocalInterface instanceof zzwi) {
                return (zzwi) queryLocalInterface;
            }
            return new zzwk(iBinder);
        } catch (Exception unused) {
            zzazw.zzfc("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    private final T zzpp() {
        zzwi zzwiVar = zzcfx;
        if (zzwiVar == null) {
            zzazw.zzfc("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zza(zzwiVar);
        } catch (RemoteException e) {
            zzazw.zzd("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final T zzpq() {
        try {
            return zzpn();
        } catch (RemoteException e) {
            zzazw.zzd("Cannot invoke remote loader.", e);
            return null;
        }
    }

    public final T zzd(Context context, boolean z) {
        T zzpp;
        boolean z2 = z;
        if (!z2) {
            zzvj.zzpr();
            if (!zzazm.zzd(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzazw.zzed("Google Play Services is not available.");
                z2 = true;
            }
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID)) {
            z2 = true;
        }
        zzzz.initialize(context);
        if (zzabj.zzcwj.get().booleanValue()) {
            z2 = false;
        }
        if (z2) {
            zzpp = zzpp();
            if (zzpp == null) {
                zzpp = zzpq();
            }
        } else {
            T zzpq = zzpq();
            int i = zzpq == null ? 1 : 0;
            if (i != 0) {
                if (zzvj.zzpy().nextInt(zzabt.zzcxn.get().intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", i);
                    zzvj.zzpr().zza(context, zzvj.zzpx().zzbnd, "gmob-apps", bundle, true);
                }
            }
            zzpp = zzpq == null ? zzpp() : zzpq;
        }
        return zzpp == null ? zzpm() : zzpp;
    }
}
