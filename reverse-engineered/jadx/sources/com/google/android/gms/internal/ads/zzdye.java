package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdye extends zzecd<zzdye, zza> implements zzedq {
    private static volatile zzedx<zzdye> zzea;
    private static final zzdye zzhqa;
    private int zzhlh;
    private zzeaq zzhli = zzeaq.zzhtf;

    private zzdye() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdye, zza> implements zzedq {
        private zza() {
            super(zzdye.zzhqa);
        }

        public final zza zzfh(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdye) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzag(zzeaq zzeaqVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdye) this.zzhxt).zzs(zzeaqVar);
            return this;
        }

        /* synthetic */ zza(zzdyf zzdyfVar) {
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

    public static zzdye zzw(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdye) zzecd.zza(zzhqa, zzeaqVar, zzebqVar);
    }

    public static zza zzbbs() {
        return zzhqa.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdyf.zzdk[i - 1]) {
            case 1:
                return new zzdye();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhqa, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhlh", "zzhli"});
            case 4:
                return zzhqa;
            case 5:
                zzedx<zzdye> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdye.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhqa);
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
        zzdye zzdyeVar = new zzdye();
        zzhqa = zzdyeVar;
        zzecd.zza(zzdye.class, zzdyeVar);
    }
}
