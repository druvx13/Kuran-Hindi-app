package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzceh extends VideoController.VideoLifecycleCallbacks {
    private final zzbzx zzfqb;

    public zzceh(zzbzx zzbzxVar) {
        this.zzfqb = zzbzxVar;
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzxm zza = zza(this.zzfqb);
        if (zza == null) {
            return;
        }
        try {
            zza.onVideoStart();
        } catch (RemoteException e) {
            zzawr.zzd("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzxm zza = zza(this.zzfqb);
        if (zza == null) {
            return;
        }
        try {
            zza.onVideoPause();
        } catch (RemoteException e) {
            zzawr.zzd("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzxm zza = zza(this.zzfqb);
        if (zza == null) {
            return;
        }
        try {
            zza.onVideoEnd();
        } catch (RemoteException e) {
            zzawr.zzd("Unable to call onVideoEnd()", e);
        }
    }

    private static zzxm zza(zzbzx zzbzxVar) {
        zzxl videoController = zzbzxVar.getVideoController();
        if (videoController == null) {
            return null;
        }
        try {
            return videoController.zzqg();
        } catch (RemoteException unused) {
            return null;
        }
    }
}
