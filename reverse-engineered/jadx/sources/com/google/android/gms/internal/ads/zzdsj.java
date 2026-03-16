package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzedo;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdsj<KeyFormatProtoT extends zzedo, KeyProtoT extends zzedo> {
    private final zzdsl<KeyFormatProtoT, KeyProtoT> zzhiv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdsj(zzdsl<KeyFormatProtoT, KeyProtoT> zzdslVar) {
        this.zzhiv = zzdslVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final KeyProtoT zzp(zzeaq zzeaqVar) throws GeneralSecurityException, zzeco {
        KeyFormatProtoT zzq = this.zzhiv.zzq(zzeaqVar);
        this.zzhiv.zzc(zzq);
        return this.zzhiv.zzd(zzq);
    }
}
