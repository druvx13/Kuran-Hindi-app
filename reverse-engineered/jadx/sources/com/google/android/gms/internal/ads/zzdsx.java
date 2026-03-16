package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxp;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdsx {
    private static final Logger logger = Logger.getLogger(zzdsx.class.getName());
    private static final ConcurrentMap<String, zza> zzhjm = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzb> zzhjn = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> zzhjo = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzdse<?>> zzhjp = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, zzdsw<?>> zzhjq = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public interface zza {
        Set<Class<?>> zzawz();

        zzdsh<?> zzaxi();

        Class<?> zzaxj();

        Class<?> zzaxk();

        <P> zzdsh<P> zzb(Class<P> cls) throws GeneralSecurityException;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    interface zzb {
    }

    private static <KeyProtoT extends zzedo> zza zza(zzdsm<KeyProtoT> zzdsmVar) {
        return new zzdsz(zzdsmVar);
    }

    private static <KeyProtoT extends zzedo> zzb zzb(zzdsm<KeyProtoT> zzdsmVar) {
        return new zzdtb(zzdsmVar);
    }

    private static synchronized zza zzhi(String str) throws GeneralSecurityException {
        zza zzaVar;
        synchronized (zzdsx.class) {
            if (!zzhjm.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            zzaVar = zzhjm.get(str);
        }
        return zzaVar;
    }

    @Deprecated
    public static zzdse<?> zzhj(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        zzdse<?> zzdseVar = zzhjp.get(str.toLowerCase());
        if (zzdseVar == null) {
            String format = String.format("no catalogue found for %s. ", str);
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase().startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        return zzdseVar;
    }

    private static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    private static synchronized <P> void zza(String str, Class<?> cls, boolean z) throws GeneralSecurityException {
        synchronized (zzdsx.class) {
            if (zzhjm.containsKey(str)) {
                zza zzaVar = zzhjm.get(str);
                if (!zzaVar.zzaxj().equals(cls)) {
                    Logger logger2 = logger;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(str);
                    logger2.logp(level, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", valueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(valueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzaVar.zzaxj().getName(), cls.getName()));
                } else if (!z || zzhjo.get(str).booleanValue()) {
                } else {
                    String valueOf2 = String.valueOf(str);
                    throw new GeneralSecurityException(valueOf2.length() != 0 ? "New keys are already disallowed for key type ".concat(valueOf2) : new String("New keys are already disallowed for key type "));
                }
            }
        }
    }

    public static synchronized <P> void zza(zzdsh<P> zzdshVar, boolean z) throws GeneralSecurityException {
        synchronized (zzdsx.class) {
            if (zzdshVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String keyType = zzdshVar.getKeyType();
            zza(keyType, zzdshVar.getClass(), z);
            if (!zzhjm.containsKey(keyType)) {
                zzhjm.put(keyType, new zzdta(zzdshVar));
            }
            zzhjo.put(keyType, Boolean.valueOf(z));
        }
    }

    public static synchronized <KeyProtoT extends zzedo> void zza(zzdsm<KeyProtoT> zzdsmVar, boolean z) throws GeneralSecurityException {
        synchronized (zzdsx.class) {
            String keyType = zzdsmVar.getKeyType();
            zza(keyType, zzdsmVar.getClass(), true);
            if (!zzhjm.containsKey(keyType)) {
                zzhjm.put(keyType, zza(zzdsmVar));
                zzhjn.put(keyType, zzb(zzdsmVar));
            }
            zzhjo.put(keyType, true);
        }
    }

    public static synchronized <KeyProtoT extends zzedo, PublicKeyProtoT extends zzedo> void zza(zzdsy<KeyProtoT, PublicKeyProtoT> zzdsyVar, zzdsm<PublicKeyProtoT> zzdsmVar, boolean z) throws GeneralSecurityException {
        Class<?> zzaxk;
        synchronized (zzdsx.class) {
            String keyType = zzdsyVar.getKeyType();
            String keyType2 = zzdsmVar.getKeyType();
            zza(keyType, zzdsyVar.getClass(), true);
            zza(keyType2, zzdsmVar.getClass(), false);
            if (keyType.equals(keyType2)) {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
            if (zzhjm.containsKey(keyType) && (zzaxk = zzhjm.get(keyType).zzaxk()) != null && !zzaxk.equals(zzdsmVar.getClass())) {
                Logger logger2 = logger;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder(String.valueOf(keyType).length() + 96 + String.valueOf(keyType2).length());
                sb.append("Attempted overwrite of a registered key manager for key type ");
                sb.append(keyType);
                sb.append(" with inconsistent public key type ");
                sb.append(keyType2);
                logger2.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb.toString());
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzdsyVar.getClass().getName(), zzaxk.getName(), zzdsmVar.getClass().getName()));
            }
            if (!zzhjm.containsKey(keyType) || zzhjm.get(keyType).zzaxk() == null) {
                zzhjm.put(keyType, new zzdtc(zzdsyVar, zzdsmVar));
                zzhjn.put(keyType, zzb(zzdsyVar));
            }
            zzhjo.put(keyType, true);
            if (!zzhjm.containsKey(keyType2)) {
                zzhjm.put(keyType2, zza(zzdsmVar));
            }
            zzhjo.put(keyType2, false);
        }
    }

    public static synchronized <P> void zza(zzdsw<P> zzdswVar) throws GeneralSecurityException {
        synchronized (zzdsx.class) {
            if (zzdswVar == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> zzawu = zzdswVar.zzawu();
            if (zzhjq.containsKey(zzawu)) {
                zzdsw<?> zzdswVar2 = zzhjq.get(zzawu);
                if (!zzdswVar.getClass().equals(zzdswVar2.getClass())) {
                    Logger logger2 = logger;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(zzawu.toString());
                    logger2.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", valueOf.length() != 0 ? "Attempted overwrite of a registered SetWrapper for type ".concat(valueOf) : new String("Attempted overwrite of a registered SetWrapper for type "));
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzawu.getName(), zzdswVar2.getClass().getName(), zzdswVar.getClass().getName()));
                }
            }
            zzhjq.put(zzawu, zzdswVar);
        }
    }

    private static zzdsh<?> zzhk(String str) throws GeneralSecurityException {
        return zzhi(str).zzaxi();
    }

    private static <P> zzdsh<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zza zzhi = zzhi(str);
        if (cls == null) {
            return (zzdsh<P>) zzhi.zzaxi();
        }
        if (zzhi.zzawz().contains(cls)) {
            return zzhi.zzb(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzhi.zzaxj());
        Set<Class<?>> zzawz = zzhi.zzawz();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : zzawz) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    public static synchronized zzdxf zza(zzdxl zzdxlVar) throws GeneralSecurityException {
        zzdxf zzo;
        synchronized (zzdsx.class) {
            zzdsh<?> zzhk = zzhk(zzdxlVar.zzbad());
            if (zzhjo.get(zzdxlVar.zzbad()).booleanValue()) {
                zzo = zzhk.zzo(zzdxlVar.zzbae());
            } else {
                String valueOf = String.valueOf(zzdxlVar.zzbad());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzo;
    }

    public static synchronized zzedo zzb(zzdxl zzdxlVar) throws GeneralSecurityException {
        zzedo zzn;
        synchronized (zzdsx.class) {
            zzdsh<?> zzhk = zzhk(zzdxlVar.zzbad());
            if (zzhjo.get(zzdxlVar.zzbad()).booleanValue()) {
                zzn = zzhk.zzn(zzdxlVar.zzbae());
            } else {
                String valueOf = String.valueOf(zzdxlVar.zzbad());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzn;
    }

    public static <P> P zza(String str, zzedo zzedoVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(str, (Class) checkNotNull(cls)).zza(zzedoVar);
    }

    private static <P> P zza(String str, zzeaq zzeaqVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(str, cls).zzm(zzeaqVar);
    }

    public static <P> P zza(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(str, zzeaq.zzu(bArr), (Class) checkNotNull(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <P> zzdsu<P> zza(zzdsn zzdsnVar, zzdsh<P> zzdshVar, Class<P> cls) throws GeneralSecurityException {
        Class cls2 = (Class) checkNotNull(cls);
        zzdte.zzc(zzdsnVar.zzaxc());
        zzdsu<P> zzdsuVar = (zzdsu<P>) zzdsu.zza(cls2);
        for (zzdxp.zza zzaVar : zzdsnVar.zzaxc().zzbar()) {
            if (zzaVar.zzaxe() == zzdxj.ENABLED) {
                zzdst zza2 = zzdsuVar.zza(zza(zzaVar.zzbav().zzbad(), zzaVar.zzbav().zzbae(), cls2), zzaVar);
                if (zzaVar.zzbaw() == zzdsnVar.zzaxc().zzbaq()) {
                    zzdsuVar.zza(zza2);
                }
            }
        }
        return zzdsuVar;
    }

    public static <P> P zza(zzdsu<P> zzdsuVar) throws GeneralSecurityException {
        zzdsw<?> zzdswVar = zzhjq.get(zzdsuVar.zzawu());
        if (zzdswVar == null) {
            String valueOf = String.valueOf(zzdsuVar.zzawu().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
        }
        return (P) zzdswVar.zza(zzdsuVar);
    }
}
