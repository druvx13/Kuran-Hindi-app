package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbvb implements zzegz<Set<zzbvt<AppEventListener>>> {
    private final zzbuj zzfoh;

    private zzbvb(zzbuj zzbujVar) {
        this.zzfoh = zzbujVar;
    }

    public static zzbvb zzw(zzbuj zzbujVar) {
        return new zzbvb(zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(this.zzfoh.zzajg(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
