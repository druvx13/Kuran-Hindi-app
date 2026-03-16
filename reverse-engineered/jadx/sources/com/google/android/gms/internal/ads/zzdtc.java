package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdsx;
import java.security.GeneralSecurityException;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdtc implements zzdsx.zza {
    private final /* synthetic */ zzdsy zzhjv;
    private final /* synthetic */ zzdsm zzhjw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtc(zzdsy zzdsyVar, zzdsm zzdsmVar) {
        this.zzhjv = zzdsyVar;
        this.zzhjw = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsx.zza
    public final <Q> zzdsh<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzdsv(this.zzhjv, this.zzhjw, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsx.zza
    public final zzdsh<?> zzaxi() {
        zzdsy zzdsyVar = this.zzhjv;
        return new zzdsv(zzdsyVar, this.zzhjw, zzdsyVar.zzaxa());
    }

    @Override // com.google.android.gms.internal.ads.zzdsx.zza
    public final Class<?> zzaxj() {
        return this.zzhjv.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzdsx.zza
    public final Set<Class<?>> zzawz() {
        return this.zzhjv.zzawz();
    }

    @Override // com.google.android.gms.internal.ads.zzdsx.zza
    public final Class<?> zzaxk() {
        return this.zzhjw.getClass();
    }
}
