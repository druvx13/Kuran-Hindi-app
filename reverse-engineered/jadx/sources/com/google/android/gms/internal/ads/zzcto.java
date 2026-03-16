package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.AppEventListener;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcto implements AppEventListener {
    private zzwh zzgjs;

    public final synchronized void zzb(zzwh zzwhVar) {
        this.zzgjs = zzwhVar;
    }

    public final synchronized zzwh zzapk() {
        return this.zzgjs;
    }

    @Override // com.google.android.gms.ads.doubleclick.AppEventListener
    public final synchronized void onAppEvent(String str, String str2) {
        if (this.zzgjs != null) {
            try {
                this.zzgjs.onAppEvent(str, str2);
            } catch (RemoteException e) {
                zzawr.zzd("Remote Exception at onAppEvent.", e);
            }
        }
    }
}
