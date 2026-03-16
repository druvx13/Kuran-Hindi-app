package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcdf extends zzahr implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzacf {
    private zzxl zzfrz;
    private View zzfse;
    private zzbzm zzftd;
    private boolean zzejx = false;
    private boolean zzfvz = false;

    public zzcdf(zzbzm zzbzmVar, zzbzx zzbzxVar) {
        this.zzfse = zzbzxVar.zzala();
        this.zzfrz = zzbzxVar.getVideoController();
        this.zzftd = zzbzmVar;
        if (zzbzxVar.zzalb() != null) {
            zzbzxVar.zzalb().zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    public final void zza(IObjectWrapper iObjectWrapper, zzaht zzahtVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzejx) {
            zzawr.zzfa("Instream ad can not be shown after destroy().");
            zza(zzahtVar, 2);
        } else if (this.zzfse == null || this.zzfrz == null) {
            String str = this.zzfse == null ? "can not get video view." : "can not get video controller.";
            zzawr.zzfa(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            zza(zzahtVar, 0);
        } else if (this.zzfvz) {
            zzawr.zzfa("Instream ad should not be used again.");
            zza(zzahtVar, 1);
        } else {
            this.zzfvz = true;
            zzaml();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zzfse, new ViewGroup.LayoutParams(-1, -1));
            com.google.android.gms.ads.internal.zzq.zzlt();
            zzbar.zza(this.zzfse, (ViewTreeObserver.OnGlobalLayoutListener) this);
            com.google.android.gms.ads.internal.zzq.zzlt();
            zzbar.zza(this.zzfse, (ViewTreeObserver.OnScrollChangedListener) this);
            zzamm();
            try {
                zzahtVar.zzsp();
            } catch (RemoteException e) {
                zzawr.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    public final void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zza(iObjectWrapper, new zzcdh(this));
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    public final zzxl getVideoController() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzejx) {
            zzawr.zzfa("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzfrz;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    public final zzacr zzsl() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzejx) {
            zzawr.zzfa("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzbzm zzbzmVar = this.zzftd;
        if (zzbzmVar == null || zzbzmVar.zzakt() == null) {
            return null;
        }
        return this.zzftd.zzakt().zzsl();
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaml();
        zzbzm zzbzmVar = this.zzftd;
        if (zzbzmVar != null) {
            zzbzmVar.destroy();
        }
        this.zzftd = null;
        this.zzfse = null;
        this.zzfrz = null;
        this.zzejx = true;
    }

    private final void zzaml() {
        View view = this.zzfse;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zzfse);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzamm();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzamm();
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final void zzrw() {
        zzaxa.zzdwf.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcde
            private final zzcdf zzfvy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvy = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfvy.zzamn();
            }
        });
    }

    private final void zzamm() {
        View view;
        zzbzm zzbzmVar = this.zzftd;
        if (zzbzmVar == null || (view = this.zzfse) == null) {
            return;
        }
        zzbzmVar.zzb(view, Collections.emptyMap(), Collections.emptyMap(), zzbzm.zzy(this.zzfse));
    }

    private static void zza(zzaht zzahtVar, int i) {
        try {
            zzahtVar.zzcw(i);
        } catch (RemoteException e) {
            zzawr.zze("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzamn() {
        try {
            destroy();
        } catch (RemoteException e) {
            zzawr.zze("#007 Could not call remote method.", e);
        }
    }
}
