package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdwe extends zzecd<zzdwe, zza> implements zzedq {
    private static volatile zzedx<zzdwe> zzea;
    private static final zzdwe zzhmh;
    private int zzhlh;
    private zzeaq zzhli = zzeaq.zzhtf;

    private zzdwe() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdwe, zza> implements zzedq {
        private zza() {
            super(zzdwe.zzhmh);
        }

        public final zza zzer(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdwe) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzx(zzeaq zzeaqVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdwe) this.zzhxt).zzs(zzeaqVar);
            return this;
        }

        /* synthetic */ zza(zzdwd zzdwdVar) {
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

    public static zzdwe zzl(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdwe) zzecd.zza(zzhmh, zzeaqVar, zzebqVar);
    }

    public static zza zzayu() {
        return zzhmh.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdwd.zzdk[i - 1]) {
            case 1:
                return new zzdwe();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhmh, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzhlh", "zzhli"});
            case 4:
                return zzhmh;
            case 5:
                zzedx<zzdwe> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdwe.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhmh);
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
        zzdwe zzdweVar = new zzdwe();
        zzhmh = zzdweVar;
        zzecd.zza(zzdwe.class, zzdweVar);
    }
}
