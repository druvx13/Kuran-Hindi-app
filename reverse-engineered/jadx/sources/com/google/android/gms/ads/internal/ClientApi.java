package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzacw;
import com.google.android.gms.internal.ads.zzadd;
import com.google.android.gms.internal.ads.zzalp;
import com.google.android.gms.internal.ads.zzapg;
import com.google.android.gms.internal.ads.zzapr;
import com.google.android.gms.internal.ads.zzask;
import com.google.android.gms.internal.ads.zzatf;
import com.google.android.gms.internal.ads.zzazz;
import com.google.android.gms.internal.ads.zzbgy;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcar;
import com.google.android.gms.internal.ads.zzctg;
import com.google.android.gms.internal.ads.zzcti;
import com.google.android.gms.internal.ads.zzctr;
import com.google.android.gms.internal.ads.zzum;
import com.google.android.gms.internal.ads.zzvs;
import com.google.android.gms.internal.ads.zzvz;
import com.google.android.gms.internal.ads.zzwl;
import com.google.android.gms.internal.ads.zzwp;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class ClientApi extends zzwl {
    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzwp zzc(IObjectWrapper iObjectWrapper) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzapr zzd(IObjectWrapper iObjectWrapper) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzvz zza(IObjectWrapper iObjectWrapper, zzum zzumVar, String str, zzalp zzalpVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzcti(zzbgy.zza(context, zzalpVar, i), context, zzumVar, str);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzvz zzb(IObjectWrapper iObjectWrapper, zzum zzumVar, String str, zzalp zzalpVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzctr(zzbgy.zza(context, zzalpVar, i), context, zzumVar, str);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzvs zza(IObjectWrapper iObjectWrapper, String str, zzalp zzalpVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzctg(zzbgy.zza(context, zzalpVar, i), context, str);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzacw zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzcar((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 201004000);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzask zza(IObjectWrapper iObjectWrapper, zzalp zzalpVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return zzbgy.zza(context, zzalpVar, i).zzadi().zzbw(context).zzaft().zzafr();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzapg zzb(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(activity.getIntent());
        if (zzc == null) {
            return new zzr(activity);
        }
        int i = zzc.zzdky;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new zzu(activity, zzc);
                    }
                    return new zzr(activity);
                }
                return new zzz(activity);
            }
            return new zzx(activity);
        }
        return new zzs(activity);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzwp zza(IObjectWrapper iObjectWrapper, int i) {
        return zzbgy.zzf((Context) ObjectWrapper.unwrap(iObjectWrapper), i).zzadb();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzvz zza(IObjectWrapper iObjectWrapper, zzum zzumVar, String str, int i) {
        return new zzl((Context) ObjectWrapper.unwrap(iObjectWrapper), zzumVar, str, new zzazz(201004000, i, true, false));
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzadd zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzcao((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzatf zzb(IObjectWrapper iObjectWrapper, String str, zzalp zzalpVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return zzbgy.zza(context, zzalpVar, i).zzadi().zzbw(context).zzfu(str).zzaft().zzafs();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzvz zzc(IObjectWrapper iObjectWrapper, zzum zzumVar, String str, zzalp zzalpVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return zzbgy.zza(context, zzalpVar, i).zzade().zzft(str).zzbv(context).zzafd().zzafc();
    }
}
