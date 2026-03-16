package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdvk extends zzecd<zzdvk, zza> implements zzedq {
    private static volatile zzedx<zzdvk> zzea;
    private static final zzdvk zzhls;
    private int zzhlh;
    private zzdvo zzhlq;
    private zzdxa zzhlr;

    private zzdvk() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdvk, zza> implements zzedq {
        private zza() {
            super(zzdvk.zzhls);
        }

        public final zza zzen(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvk) this.zzhxt).setVersion(i);
            return this;
        }

        public final zza zzb(zzdvo zzdvoVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvk) this.zzhxt).zza(zzdvoVar);
            return this;
        }

        public final zza zzb(zzdxa zzdxaVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvk) this.zzhxt).zza(zzdxaVar);
            return this;
        }

        /* synthetic */ zza(zzdvj zzdvjVar) {
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

    public final zzdvo zzaxv() {
        zzdvo zzdvoVar = this.zzhlq;
        return zzdvoVar == null ? zzdvo.zzaye() : zzdvoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdvo zzdvoVar) {
        zzdvoVar.getClass();
        this.zzhlq = zzdvoVar;
    }

    public final zzdxa zzaxw() {
        zzdxa zzdxaVar = this.zzhlr;
        return zzdxaVar == null ? zzdxa.zzazw() : zzdxaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdxa zzdxaVar) {
        zzdxaVar.getClass();
        this.zzhlr = zzdxaVar;
    }

    public static zzdvk zzd(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdvk) zzecd.zza(zzhls, zzeaqVar, zzebqVar);
    }

    public static zza zzaxx() {
        return zzhls.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvj.zzdk[i - 1]) {
            case 1:
                return new zzdvk();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhls, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzhlh", "zzhlq", "zzhlr"});
            case 4:
                return zzhls;
            case 5:
                zzedx<zzdvk> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdvk.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhls);
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
        zzdvk zzdvkVar = new zzdvk();
        zzhls = zzdvkVar;
        zzecd.zza(zzdvk.class, zzdvkVar);
    }
}
