package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzyo extends zzwo {
    private zzahh zzchv;

    @Override // com.google.android.gms.internal.ads.zzwp
    public final String getVersionString() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void setAppMuted(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void setAppVolume(float f) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zza(zzalp zzalpVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zza(zzyy zzyyVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zza(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zzb(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zzcf(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zzcg(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final float zzqb() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final boolean zzqc() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void initialize() throws RemoteException {
        zzazw.zzfa("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzazm.zzzn.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzyr
            private final zzyo zzchx;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzchx = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzchx.zzqs();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zza(zzahh zzahhVar) throws RemoteException {
        this.zzchv = zzahhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final List<zzaha> zzqd() throws RemoteException {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzqs() {
        zzahh zzahhVar = this.zzchv;
        if (zzahhVar != null) {
            try {
                zzahhVar.zzd(Collections.emptyList());
            } catch (RemoteException e) {
                zzazw.zzd("Could not notify onComplete event.", e);
            }
        }
    }
}
