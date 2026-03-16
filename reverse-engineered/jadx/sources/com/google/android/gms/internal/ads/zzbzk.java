package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbzk extends zzacq {
    private final zzbzx zzfqb;
    private IObjectWrapper zzfqy;

    public zzbzk(zzbzx zzbzxVar) {
        this.zzfqb = zzbzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final float getAspectRatio() throws RemoteException {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzctc)).booleanValue()) {
            if (this.zzfqb.getMediaContentAspectRatio() != 0.0f) {
                return this.zzfqb.getMediaContentAspectRatio();
            }
            if (this.zzfqb.getVideoController() != null) {
                return zzakq();
            }
            IObjectWrapper iObjectWrapper = this.zzfqy;
            if (iObjectWrapper != null) {
                return zzar(iObjectWrapper);
            }
            zzacs zzaky = this.zzfqb.zzaky();
            if (zzaky == null) {
                return 0.0f;
            }
            float width = (zzaky == null || zzaky.getWidth() == -1 || zzaky.getHeight() == -1) ? 0.0f : zzaky.getWidth() / zzaky.getHeight();
            return width != 0.0f ? width : zzar(zzaky.zzrv());
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final float getDuration() throws RemoteException {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzctd)).booleanValue() && this.zzfqb.getVideoController() != null) {
            return this.zzfqb.getVideoController().getDuration();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final float getCurrentTime() throws RemoteException {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzctd)).booleanValue() && this.zzfqb.getVideoController() != null) {
            return this.zzfqb.getVideoController().getCurrentTime();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final zzxl getVideoController() throws RemoteException {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzctd)).booleanValue()) {
            return this.zzfqb.getVideoController();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean hasVideoContent() throws RemoteException {
        return ((Boolean) zzvj.zzpv().zzd(zzzz.zzctd)).booleanValue() && this.zzfqb.getVideoController() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zza(zzaee zzaeeVar) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzctd)).booleanValue() && (this.zzfqb.getVideoController() instanceof zzbfe)) {
            ((zzbfe) this.zzfqb.getVideoController()).zza(zzaeeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzo(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcow)).booleanValue()) {
            this.zzfqy = iObjectWrapper;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final IObjectWrapper zzry() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzfqy;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzacs zzaky = this.zzfqb.zzaky();
        if (zzaky == null) {
            return null;
        }
        return zzaky.zzrv();
    }

    private final float zzakq() {
        try {
            return this.zzfqb.getVideoController().getAspectRatio();
        } catch (RemoteException e) {
            zzawr.zzc("Remote exception getting video controller aspect ratio.", e);
            return 0.0f;
        }
    }

    private static float zzar(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }
}
