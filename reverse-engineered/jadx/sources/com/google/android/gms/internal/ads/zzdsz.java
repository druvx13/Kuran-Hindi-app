package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdsx;
import java.security.GeneralSecurityException;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdsz implements zzdsx.zza {
    private final /* synthetic */ zzdsm zzhjs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdsz(zzdsm zzdsmVar) {
        this.zzhjs = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsx.zza
    public final Class<?> zzaxk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdsx.zza
    public final <Q> zzdsh<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzdsk(this.zzhjs, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsx.zza
    public final zzdsh<?> zzaxi() {
        zzdsm zzdsmVar = this.zzhjs;
        return new zzdsk(zzdsmVar, zzdsmVar.zzaxa());
    }

    @Override // com.google.android.gms.internal.ads.zzdsx.zza
    public final Class<?> zzaxj() {
        return this.zzhjs.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzdsx.zza
    public final Set<Class<?>> zzawz() {
        return this.zzhjs.zzawz();
    }
}
