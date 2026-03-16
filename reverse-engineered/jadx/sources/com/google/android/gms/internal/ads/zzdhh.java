package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdhh {
    public static zzdgn zza(List<zzdgn> list, zzdgn zzdgnVar) {
        return list.get(0);
    }

    public static zzum zzb(Context context, List<zzdgn> list) {
        ArrayList arrayList = new ArrayList();
        for (zzdgn zzdgnVar : list) {
            if (zzdgnVar.zzgtj) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzdgnVar.width, zzdgnVar.height));
            }
        }
        return new zzum(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzdgn zze(zzum zzumVar) {
        if (zzumVar.zzcey) {
            return new zzdgn(-3, 0, true);
        }
        return new zzdgn(zzumVar.width, zzumVar.height, false);
    }
}
