package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcvg implements zzdah<Bundle> {
    private final zzum zzbmp;
    private final List<Parcelable> zzglm;
    private final Context zzvf;

    public zzcvg(Context context, zzum zzumVar, List<Parcelable> list) {
        this.zzvf = context;
        this.zzbmp = zzumVar;
        this.zzglm = list;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (zzabm.zzcwz.get().booleanValue()) {
            Bundle bundle3 = new Bundle();
            com.google.android.gms.ads.internal.zzq.zzkw();
            bundle3.putString("activity", zzaxa.zzat(this.zzvf));
            Bundle bundle4 = new Bundle();
            bundle4.putInt("width", this.zzbmp.width);
            bundle4.putInt("height", this.zzbmp.height);
            bundle3.putBundle("size", bundle4);
            if (this.zzglm.size() > 0) {
                List<Parcelable> list = this.zzglm;
                bundle3.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle2.putBundle("view_hierarchy", bundle3);
        }
    }
}
