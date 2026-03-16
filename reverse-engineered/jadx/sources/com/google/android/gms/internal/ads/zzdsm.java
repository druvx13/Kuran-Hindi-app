package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.gms.internal.ads.zzedo;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzdsm<KeyProtoT extends zzedo> {
    private final Class<KeyProtoT> zzhiy;
    private final Map<Class<?>, zzdso<?, KeyProtoT>> zzhiz;
    private final Class<?> zzhja;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public zzdsm(Class<KeyProtoT> cls, zzdso<?, KeyProtoT>... zzdsoVarArr) {
        this.zzhiy = cls;
        HashMap hashMap = new HashMap();
        for (zzdso<?, KeyProtoT> zzdsoVar : zzdsoVarArr) {
            if (hashMap.containsKey(zzdsoVar.zzawu())) {
                String valueOf = String.valueOf(zzdsoVar.zzawu().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            hashMap.put(zzdsoVar.zzawu(), zzdsoVar);
        }
        if (zzdsoVarArr.length > 0) {
            this.zzhja = zzdsoVarArr[0].zzawu();
        } else {
            this.zzhja = Void.class;
        }
        this.zzhiz = Collections.unmodifiableMap(hashMap);
    }

    public abstract String getKeyType();

    public abstract zzdxf.zzb zzawy();

    public abstract void zze(KeyProtoT keyprotot) throws GeneralSecurityException;

    public abstract KeyProtoT zzr(zzeaq zzeaqVar) throws zzeco;

    public final Class<KeyProtoT> zzawx() {
        return this.zzhiy;
    }

    public final <P> P zza(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        zzdso<?, KeyProtoT> zzdsoVar = this.zzhiz.get(cls);
        if (zzdsoVar == null) {
            String canonicalName = cls.getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
            sb.append("Requested primitive class ");
            sb.append(canonicalName);
            sb.append(" not supported.");
            throw new IllegalArgumentException(sb.toString());
        }
        return (P) zzdsoVar.zzah(keyprotot);
    }

    public final Set<Class<?>> zzawz() {
        return this.zzhiz.keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<?> zzaxa() {
        return this.zzhja;
    }

    public zzdsl<?, KeyProtoT> zzaxb() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}
