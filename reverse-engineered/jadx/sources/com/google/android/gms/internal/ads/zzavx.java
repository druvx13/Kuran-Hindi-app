package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzavx implements zzavz {
    @Override // com.google.android.gms.internal.ads.zzavz
    public final zzdri<String> zza(String str, PackageInfo packageInfo) {
        return zzdqw.zzag(str);
    }

    @Override // com.google.android.gms.internal.ads.zzavz
    public final zzdri<AdvertisingIdClient.Info> zzak(Context context) {
        zzbaj zzbajVar = new zzbaj();
        zzvj.zzpr();
        if (zzazm.zzbm(context)) {
            zzbab.zzdzr.execute(new zzawa(this, context, zzbajVar));
        }
        return zzbajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzavz
    public final zzdri<String> zza(Context context, int i) {
        return zzdqw.zzag(null);
    }
}
