package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdzh;
import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdzi<T_WRAPPER extends zzdzh<T_ENGINE>, T_ENGINE> {
    private static final Logger logger = Logger.getLogger(zzdzi.class.getName());
    private static final List<Provider> zzhrr;
    public static final zzdzi<zzdzk, Cipher> zzhrs;
    public static final zzdzi<zzdzo, Mac> zzhrt;
    private static final zzdzi<zzdzq, Signature> zzhru;
    private static final zzdzi<zzdzn, MessageDigest> zzhrv;
    public static final zzdzi<zzdzj, KeyAgreement> zzhrw;
    public static final zzdzi<zzdzl, KeyPairGenerator> zzhrx;
    public static final zzdzi<zzdzm, KeyFactory> zzhry;
    private T_WRAPPER zzhrz;
    private List<Provider> zzhsa = zzhrr;
    private boolean zzhsb = true;

    private zzdzi(T_WRAPPER t_wrapper) {
        this.zzhrz = t_wrapper;
    }

    public final T_ENGINE zzho(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider provider : this.zzhsa) {
            try {
                return (T_ENGINE) this.zzhrz.zza(str, provider);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (this.zzhsb) {
            return (T_ENGINE) this.zzhrz.zza(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    static {
        if (zzdzv.zzbcc()) {
            String[] strArr = {ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    logger.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            zzhrr = arrayList;
        } else {
            zzhrr = new ArrayList();
        }
        zzhrs = new zzdzi<>(new zzdzk());
        zzhrt = new zzdzi<>(new zzdzo());
        zzhru = new zzdzi<>(new zzdzq());
        zzhrv = new zzdzi<>(new zzdzn());
        zzhrw = new zzdzi<>(new zzdzj());
        zzhrx = new zzdzi<>(new zzdzl());
        zzhry = new zzdzi<>(new zzdzm());
    }
}
