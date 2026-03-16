package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdsx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdta implements zzdsx.zza {
    private final /* synthetic */ zzdsh zzhjt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdta(zzdsh zzdshVar) {
        this.zzhjt = zzdshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsx.zza
    public final Class<?> zzaxk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdsx.zza
    public final <Q> zzdsh<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        if (!this.zzhjt.zzawu().equals(cls)) {
            throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
        }
        return this.zzhjt;
    }

    @Override // com.google.android.gms.internal.ads.zzdsx.zza
    public final zzdsh<?> zzaxi() {
        return this.zzhjt;
    }

    @Override // com.google.android.gms.internal.ads.zzdsx.zza
    public final Class<?> zzaxj() {
        return this.zzhjt.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzdsx.zza
    public final Set<Class<?>> zzawz() {
        return Collections.singleton(this.zzhjt.zzawu());
    }
}
