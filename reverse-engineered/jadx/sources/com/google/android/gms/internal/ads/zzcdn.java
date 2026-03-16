package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcdn extends zzadr {
    private final zzbzx zzfqb;
    private zzbzm zzftd;
    private zzcat zzfwc;
    private final Context zzzo;

    public zzcdn(Context context, zzbzx zzbzxVar, zzcat zzcatVar, zzbzm zzbzmVar) {
        this.zzzo = context;
        this.zzfqb = zzbzxVar;
        this.zzfwc = zzcatVar;
        this.zzftd = zzbzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final IObjectWrapper zzrz() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final String zzcv(String str) {
        return this.zzfqb.zzalg().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final zzacs zzcw(String str) {
        return this.zzfqb.zzale().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final List<String> getAvailableAssetNames() {
        SimpleArrayMap<String, zzace> zzale = this.zzfqb.zzale();
        SimpleArrayMap<String, String> zzalg = this.zzfqb.zzalg();
        String[] strArr = new String[zzale.size() + zzalg.size()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < zzale.size()) {
            strArr[i3] = zzale.keyAt(i2);
            i2++;
            i3++;
        }
        while (i < zzalg.size()) {
            strArr[i3] = zzalg.keyAt(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final String getCustomTemplateId() {
        return this.zzfqb.getCustomTemplateId();
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void performClick(String str) {
        zzbzm zzbzmVar = this.zzftd;
        if (zzbzmVar != null) {
            zzbzmVar.zzfx(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void recordImpression() {
        zzbzm zzbzmVar = this.zzftd;
        if (zzbzmVar != null) {
            zzbzmVar.zzakl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final zzxl getVideoController() {
        return this.zzfqb.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void destroy() {
        zzbzm zzbzmVar = this.zzftd;
        if (zzbzmVar != null) {
            zzbzmVar.destroy();
        }
        this.zzftd = null;
        this.zzfwc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final IObjectWrapper zzse() {
        return ObjectWrapper.wrap(this.zzzo);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final boolean zzp(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (unwrap instanceof ViewGroup) {
            zzcat zzcatVar = this.zzfwc;
            if (zzcatVar != null && zzcatVar.zza((ViewGroup) unwrap)) {
                this.zzfqb.zzalb().zza(new zzcdm(this));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final boolean zzsf() {
        zzbzm zzbzmVar = this.zzftd;
        return (zzbzmVar == null || zzbzmVar.zzaks()) && this.zzfqb.zzalc() != null && this.zzfqb.zzalb() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final boolean zzsg() {
        IObjectWrapper zzald = this.zzfqb.zzald();
        if (zzald != null) {
            com.google.android.gms.ads.internal.zzq.zzll().zzab(zzald);
            return true;
        }
        zzawr.zzfc("Trying to start OMID session before creation.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void zzq(IObjectWrapper iObjectWrapper) {
        zzbzm zzbzmVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof View) || this.zzfqb.zzald() == null || (zzbzmVar = this.zzftd) == null) {
            return;
        }
        zzbzmVar.zzz((View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void zzsh() {
        String zzalf = this.zzfqb.zzalf();
        if ("Google".equals(zzalf)) {
            zzawr.zzfc("Illegal argument specified for omid partner name.");
            return;
        }
        zzbzm zzbzmVar = this.zzftd;
        if (zzbzmVar != null) {
            zzbzmVar.zzg(zzalf, false);
        }
    }
}
