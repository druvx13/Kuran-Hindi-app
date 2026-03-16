package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdtd {
    public static final String zzhjx = new zzdth().getKeyType();
    public static final String zzhjy = new zzdtr().getKeyType();
    private static final String zzhjz = new zzdtm().getKeyType();
    private static final String zzhka = new zzdtx().getKeyType();
    private static final String zzhkb = new zzdub().getKeyType();
    private static final String zzhkc = new zzdts().getKeyType();
    private static final String zzhkd = new zzduc().getKeyType();
    @Deprecated
    private static final zzdyd zzhke;
    @Deprecated
    private static final zzdyd zzhkf;
    @Deprecated
    private static final zzdyd zzhkg;

    public static void zzaxl() throws GeneralSecurityException {
        zzduz.zzaxl();
        zzdsx.zza((zzdsm) new zzdth(), true);
        zzdsx.zza((zzdsm) new zzdtm(), true);
        zzdsx.zza((zzdsm) new zzdtr(), true);
        zzdsx.zza((zzdsm) new zzdts(), true);
        zzdsx.zza((zzdsm) new zzdtx(), true);
        zzdsx.zza((zzdsm) new zzdub(), true);
        zzdsx.zza((zzdsm) new zzduc(), true);
        zzdsx.zza(new zzdtg());
    }

    static {
        zzdyd zzbbq = zzdyd.zzbbq();
        zzhke = zzbbq;
        zzhkf = zzbbq;
        zzhkg = zzbbq;
        try {
            zzaxl();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
