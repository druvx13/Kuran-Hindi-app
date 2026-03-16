package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdwo extends zzecd<zzdwo, zza> implements zzedq {
    private static volatile zzedx<zzdwo> zzea;
    private static final zzdwo zzhmw;
    private zzdwt zzhmt;
    private zzdwk zzhmu;
    private int zzhmv;

    private zzdwo() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdwo, zza> implements zzedq {
        private zza() {
            super(zzdwo.zzhmw);
        }

        /* synthetic */ zza(zzdwn zzdwnVar) {
            this();
        }
    }

    public final zzdwt zzazc() {
        zzdwt zzdwtVar = this.zzhmt;
        return zzdwtVar == null ? zzdwt.zzazs() : zzdwtVar;
    }

    public final zzdwk zzazd() {
        zzdwk zzdwkVar = this.zzhmu;
        return zzdwkVar == null ? zzdwk.zzayy() : zzdwkVar;
    }

    public final zzdwi zzaze() {
        zzdwi zzes = zzdwi.zzes(this.zzhmv);
        return zzes == null ? zzdwi.UNRECOGNIZED : zzes;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdwn.zzdk[i - 1]) {
            case 1:
                return new zzdwo();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhmw, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzhmt", "zzhmu", "zzhmv"});
            case 4:
                return zzhmw;
            case 5:
                zzedx<zzdwo> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdwo.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhmw);
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

    public static zzdwo zzazf() {
        return zzhmw;
    }

    static {
        zzdwo zzdwoVar = new zzdwo();
        zzhmw = zzdwoVar;
        zzecd.zza(zzdwo.class, zzdwoVar);
    }
}
