package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdxl extends zzecd<zzdxl, zza> implements zzedq {
    private static volatile zzedx<zzdxl> zzea;
    private static final zzdxl zzhor;
    private String zzhnz = "";
    private zzeaq zzhoa = zzeaq.zzhtf;
    private int zzhoq;

    private zzdxl() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdxl, zza> implements zzedq {
        private zza() {
            super(zzdxl.zzhor);
        }

        /* synthetic */ zza(zzdxk zzdxkVar) {
            this();
        }
    }

    public final String zzbad() {
        return this.zzhnz;
    }

    public final zzeaq zzbae() {
        return this.zzhoa;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdxk.zzdk[i - 1]) {
            case 1:
                return new zzdxl();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhor, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzhnz", "zzhoa", "zzhoq"});
            case 4:
                return zzhor;
            case 5:
                zzedx<zzdxl> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdxl.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhor);
                            zzea = zzedxVar;
                        }
                    }
                }
                return zzedxVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static zzdxl zzbaj() {
        return zzhor;
    }

    static {
        zzdxl zzdxlVar = new zzdxl();
        zzhor = zzdxlVar;
        zzecd.zza(zzdxl.class, zzdxlVar);
    }
}
