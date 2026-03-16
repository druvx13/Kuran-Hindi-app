package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdwa extends zzecd<zzdwa, zza> implements zzedq {
    private static volatile zzedx<zzdwa> zzea;
    private static final zzdwa zzhmf;
    private int zzhlh;
    private zzeaq zzhli = zzeaq.zzhtf;

    private zzdwa() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdwa, zza> implements zzedq {
        private zza() {
            super(zzdwa.zzhmf);
        }

        public final zza zzeq(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdwa) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzw(zzeaq zzeaqVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdwa) this.zzhxt).zzs(zzeaqVar);
            return this;
        }

        /* synthetic */ zza(zzdvz zzdvzVar) {
            this();
        }
    }

    public final int getVersion() {
        return this.zzhlh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzhlh = i;
    }

    public final zzeaq zzaxn() {
        return this.zzhli;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzeaq zzeaqVar) {
        zzeaqVar.getClass();
        this.zzhli = zzeaqVar;
    }

    public static zzdwa zzj(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdwa) zzecd.zza(zzhmf, zzeaqVar, zzebqVar);
    }

    public static zza zzayr() {
        return zzhmf.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvz.zzdk[i - 1]) {
            case 1:
                return new zzdwa();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhmf, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhlh", "zzhli"});
            case 4:
                return zzhmf;
            case 5:
                zzedx<zzdwa> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdwa.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhmf);
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
        zzdwa zzdwaVar = new zzdwa();
        zzhmf = zzdwaVar;
        zzecd.zza(zzdwa.class, zzdwaVar);
    }
}
