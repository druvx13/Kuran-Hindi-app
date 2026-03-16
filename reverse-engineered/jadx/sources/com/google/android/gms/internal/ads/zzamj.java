package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzamj extends zzxk {
    private final Object lock = new Object();
    private volatile zzxm zzdgn;

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
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final float getCurrentTime() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void zza(zzxm zzxmVar) throws RemoteException {
        synchronized (this.lock) {
            this.zzdgn = zzxmVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final zzxm zzqg() throws RemoteException {
        zzxm zzxmVar;
        synchronized (this.lock) {
            zzxmVar = this.zzdgn;
        }
        return zzxmVar;
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
