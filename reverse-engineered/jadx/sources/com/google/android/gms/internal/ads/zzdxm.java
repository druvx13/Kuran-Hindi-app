package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzdxm extends zzecd<zzdxm, zza> implements zzedq {
    private static volatile zzedx<zzdxm> zzea;
    private static final zzdxm zzhow;
    private int zzhot;
    private boolean zzhou;
    private String zzhos = "";
    private String zzhnz = "";
    private String zzhov = "";

    private zzdxm() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdxm, zza> implements zzedq {
        private zza() {
            super(zzdxm.zzhow);
        }

        /* synthetic */ zza(zzdxn zzdxnVar) {
            this();
        }
    }

    public final String zzbal() {
        return this.zzhos;
    }

    public final String zzbad() {
        return this.zzhnz;
    }

    public final int zzbam() {
        return this.zzhot;
    }

    public final boolean zzban() {
        return this.zzhou;
    }

    public final String zzbao() {
        return this.zzhov;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdxn.zzdk[i - 1]) {
            case 1:
                return new zzdxm();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhow, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzhos", "zzhnz", "zzhot", "zzhou", "zzhov"});
            case 4:
                return zzhow;
            case 5:
                zzedx<zzdxm> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdxm.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhow);
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

    static {
        zzdxm zzdxmVar = new zzdxm();
        zzhow = zzdxmVar;
        zzecd.zza(zzdxm.class, zzdxmVar);
    }
}
