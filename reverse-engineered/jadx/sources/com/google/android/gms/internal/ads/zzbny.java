package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbny {
    public final List<? extends zzdri<? extends zzbns>> zzfkv;

    public zzbny(List<? extends zzdri<? extends zzbns>> list) {
        this.zzfkv = list;
    }

    public zzbny(zzbns zzbnsVar) {
        this.zzfkv = Collections.singletonList(zzdqw.zzag(zzbnsVar));
    }

    public static zzcnj<zzbny> zza(zzcpk<? extends zzbns> zzcpkVar) {
        return new zzcni(zzcpkVar, zzbob.zzdsc);
    }

    public static zzcnj<zzbny> zza(zzcnj<? extends zzbns> zzcnjVar) {
        return new zzcni(zzcnjVar, zzboa.zzdsc);
    }
}
