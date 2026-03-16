package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzedo;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzdsy<KeyProtoT extends zzedo, PublicKeyProtoT extends zzedo> extends zzdsm<KeyProtoT> {
    private final Class<PublicKeyProtoT> zzhjr;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public zzdsy(Class<KeyProtoT> cls, Class<PublicKeyProtoT> cls2, zzdso<?, KeyProtoT>... zzdsoVarArr) {
        super(cls, zzdsoVarArr);
        this.zzhjr = cls2;
    }
}
