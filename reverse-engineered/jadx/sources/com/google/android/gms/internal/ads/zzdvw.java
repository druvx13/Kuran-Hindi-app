package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdvw extends zzecd<zzdvw, zza> implements zzedq {
    private static volatile zzedx<zzdvw> zzea;
    private static final zzdvw zzhmd;
    private int zzhlm;
    private zzdvx zzhmb;

    private zzdvw() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdvw, zza> implements zzedq {
        private zza() {
            super(zzdvw.zzhmd);
        }

        /* synthetic */ zza(zzdvv zzdvvVar) {
            this();
        }
    }

    public final zzdvx zzayl() {
        zzdvx zzdvxVar = this.zzhmb;
        return zzdvxVar == null ? zzdvx.zzayp() : zzdvxVar;
    }

    public final int getKeySize() {
        return this.zzhlm;
    }

    public static zzdvw zzi(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdvw) zzecd.zza(zzhmd, zzeaqVar, zzebqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvv.zzdk[i - 1]) {
            case 1:
                return new zzdvw();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhmd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhmb", "zzhlm"});
            case 4:
                return zzhmd;
            case 5:
                zzedx<zzdvw> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdvw.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhmd);
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
        zzdvw zzdvwVar = new zzdvw();
        zzhmd = zzdvwVar;
        zzecd.zza(zzdvw.class, zzdvwVar);
    }
}
