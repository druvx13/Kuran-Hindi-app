package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbbq {
    private final Context zzciq;
    private final zzbbx zzebj;
    private final ViewGroup zzece;
    private zzbbk zzecf;

    public zzbbq(Context context, ViewGroup viewGroup, zzbek zzbekVar) {
        this(context, viewGroup, zzbekVar, null);
    }

    private zzbbq(Context context, ViewGroup viewGroup, zzbbx zzbbxVar, zzbbk zzbbkVar) {
        this.zzciq = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzece = viewGroup;
        this.zzebj = zzbbxVar;
        this.zzecf = null;
    }

    public final void zze(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzbbk zzbbkVar = this.zzecf;
        if (zzbbkVar != null) {
            zzbbkVar.zzd(i, i2, i3, i4);
        }
    }

    public final void zza(int i, int i2, int i3, int i4, int i5, boolean z, zzbby zzbbyVar) {
        if (this.zzecf != null) {
            return;
        }
        zzaah.zza(this.zzebj.zzzj().zzrn(), this.zzebj.zzzg(), "vpr2");
        Context context = this.zzciq;
        zzbbx zzbbxVar = this.zzebj;
        zzbbk zzbbkVar = new zzbbk(context, zzbbxVar, i5, z, zzbbxVar.zzzj().zzrn(), zzbbyVar);
        this.zzecf = zzbbkVar;
        this.zzece.addView(zzbbkVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzecf.zzd(i, i2, i3, i4);
        this.zzebj.zzav(false);
    }

    public final zzbbk zzza() {
        Preconditions.checkMainThread("getAdVideoUnderlay must be called from the UI thread.");
        return this.zzecf;
    }

    public final void onPause() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzbbk zzbbkVar = this.zzecf;
        if (zzbbkVar != null) {
            zzbbkVar.pause();
        }
    }

    public final void onDestroy() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzbbk zzbbkVar = this.zzecf;
        if (zzbbkVar != null) {
            zzbbkVar.destroy();
            this.zzece.removeView(this.zzecf);
            this.zzecf = null;
        }
    }
}
