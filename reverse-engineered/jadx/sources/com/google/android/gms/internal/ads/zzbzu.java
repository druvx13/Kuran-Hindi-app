package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbzu extends zzxk {
    private final Object lock = new Object();
    @Nullable
    private zzxl zzfrv;
    @Nullable
    private final zzame zzfrw;

    public zzbzu(@Nullable zzxl zzxlVar, @Nullable zzame zzameVar) {
        this.zzfrv = zzxlVar;
        this.zzfrw = zzameVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void play() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void stop() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void mute(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final boolean isMuted() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final int getPlaybackState() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final float getDuration() throws RemoteException {
        zzame zzameVar = this.zzfrw;
        if (zzameVar != null) {
            return zzameVar.getVideoDuration();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final float getCurrentTime() throws RemoteException {
        zzame zzameVar = this.zzfrw;
        if (zzameVar != null) {
            return zzameVar.getVideoCurrentTime();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void zza(zzxm zzxmVar) throws RemoteException {
        synchronized (this.lock) {
            if (this.zzfrv != null) {
                this.zzfrv.zza(zzxmVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final zzxm zzqg() throws RemoteException {
        synchronized (this.lock) {
            if (this.zzfrv != null) {
                return this.zzfrv.zzqg();
            }
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final float getAspectRatio() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final boolean isCustomControlsEnabled() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final boolean isClickToExpandEnabled() throws RemoteException {
        throw new RemoteException();
    }
}
