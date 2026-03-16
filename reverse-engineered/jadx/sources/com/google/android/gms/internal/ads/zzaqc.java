package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaqc {
    private final zzxt zzacc;
    private final AdFormat zzdlh;
    private final Context zzvf;

    public zzaqc(Context context, AdFormat adFormat, zzxt zzxtVar) {
        this.zzvf = context;
        this.zzdlh = adFormat;
        this.zzacc = zzxtVar;
    }

    public final void zza(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzuj zza;
        zzavn zzr = zzr(this.zzvf);
        if (zzr == null) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zzvf);
        zzxt zzxtVar = this.zzacc;
        if (zzxtVar == null) {
            zza = new zzui().zzpg();
        } else {
            zza = zzuk.zza(this.zzvf, zzxtVar);
        }
        try {
            zzr.zza(wrap, new zzavt(null, this.zzdlh.name(), null, zza), new zzaqe(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }

    public static zzavn zzr(Context context) {
        try {
            return ((zzavs) zzazv.zza(context, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", zzaqb.zzbvh)).zzf(ObjectWrapper.wrap(context), 201004000);
        } catch (RemoteException | zzazx | NullPointerException unused) {
            return null;
        }
    }
}
