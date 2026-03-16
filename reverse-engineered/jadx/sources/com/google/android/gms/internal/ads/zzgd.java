package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzgd extends zzecd<zzgd, zza> implements zzedq {
    private static final zzgd zzabm;
    private static volatile zzedx<zzgd> zzea;
    private zzgh zzabj;
    private zzeaq zzabk = zzeaq.zzhtf;
    private zzeaq zzabl = zzeaq.zzhtf;
    private int zzdl;

    private zzgd() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzgd, zza> implements zzedq {
        private zza() {
            super(zzgd.zzabm);
        }

        /* synthetic */ zza(zzgf zzgfVar) {
            this();
        }
    }

    public final zzgh zzdd() {
        zzgh zzghVar = this.zzabj;
        return zzghVar == null ? zzgh.zzdn() : zzghVar;
    }

    public final zzeaq zzde() {
        return this.zzabk;
    }

    public final zzeaq zzdf() {
        return this.zzabl;
    }

    public static zzgd zza(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzgd) zzecd.zza(zzabm, zzeaqVar, zzebqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzgf.zzdk[i - 1]) {
            case 1:
                return new zzgd();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzabm, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzdl", "zzabj", "zzabk", "zzabl"});
            case 4:
                return zzabm;
            case 5:
                zzedx<zzgd> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzgd.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzabm);
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
        zzgd zzgdVar = new zzgd();
        zzabm = zzgdVar;
        zzecd.zza(zzgd.class, zzgdVar);
    }
}
