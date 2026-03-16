package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzduk {
    private static final String zzhku = new zzdui().getKeyType();
    private static final String zzhkv = new zzduh().getKeyType();
    @Deprecated
    public static final zzdyd zzhke = zzdyd.zzbbq();
    @Deprecated
    private static final zzdyd zzhkf = zzdyd.zzbbq();
    @Deprecated
    private static final zzdyd zzhkg = zzdyd.zzbbq();

    static {
        try {
            zzdtd.zzaxl();
            zzdsx.zza((zzdsy) new zzduh(), (zzdsm) new zzdui(), true);
            zzdsx.zza(new zzdum());
            zzdsx.zza(new zzdun());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
