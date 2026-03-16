package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzedo;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzdsk<PrimitiveT, KeyProtoT extends zzedo> implements zzdsh<PrimitiveT> {
    private final zzdsm<KeyProtoT> zzhiw;
    private final Class<PrimitiveT> zzhix;

    public zzdsk(zzdsm<KeyProtoT> zzdsmVar, Class<PrimitiveT> cls) {
        if (!zzdsmVar.zzawz().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzdsmVar.toString(), cls.getName()));
        }
        this.zzhiw = zzdsmVar;
        this.zzhix = cls;
    }

    @Override // com.google.android.gms.internal.ads.zzdsh
    public final PrimitiveT zzm(zzeaq zzeaqVar) throws GeneralSecurityException {
        try {
            return zzb(this.zzhiw.zzr(zzeaqVar));
        } catch (zzeco e) {
            String valueOf = String.valueOf(this.zzhiw.zzawx().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdsh
    public final PrimitiveT zza(zzedo zzedoVar) throws GeneralSecurityException {
        String valueOf = String.valueOf(this.zzhiw.zzawx().getName());
        String concat = valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type ");
        if (!this.zzhiw.zzawx().isInstance(zzedoVar)) {
            throw new GeneralSecurityException(concat);
        }
        return (PrimitiveT) zzb(zzedoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdsh
    public final zzedo zzn(zzeaq zzeaqVar) throws GeneralSecurityException {
        try {
            return zzawv().zzp(zzeaqVar);
        } catch (zzeco e) {
            String valueOf = String.valueOf(this.zzhiw.zzaxb().zzaww().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsh
    public final String getKeyType() {
        return this.zzhiw.getKeyType();
    }

    @Override // com.google.android.gms.internal.ads.zzdsh
    public final zzdxf zzo(zzeaq zzeaqVar) throws GeneralSecurityException {
        try {
            return (zzdxf) ((zzecd) zzdxf.zzbag().zzhm(this.zzhiw.getKeyType()).zzaf(zzawv().zzp(zzeaqVar).zzbce()).zzb(this.zzhiw.zzawy()).zzbet());
        } catch (zzeco e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsh
    public final Class<PrimitiveT> zzawu() {
        return this.zzhix;
    }

    private final PrimitiveT zzb(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (Void.class.equals(this.zzhix)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.zzhiw.zze(keyprotot);
        return (PrimitiveT) this.zzhiw.zza(keyprotot, (Class<PrimitiveT>) this.zzhix);
    }

    private final zzdsj<?, KeyProtoT> zzawv() {
        return new zzdsj<>(this.zzhiw.zzaxb());
    }
}
