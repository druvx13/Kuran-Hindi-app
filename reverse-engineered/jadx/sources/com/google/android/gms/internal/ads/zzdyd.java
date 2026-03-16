package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzdyd extends zzecd<zzdyd, zza> implements zzedq {
    private static volatile zzedx<zzdyd> zzea;
    private static final zzdyd zzhpz;
    private String zzhpx = "";
    private zzecl<zzdxm> zzhpy = zzbfa();

    private zzdyd() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdyd, zza> implements zzedq {
        private zza() {
            super(zzdyd.zzhpz);
        }

        /* synthetic */ zza(zzdyc zzdycVar) {
            this();
        }
    }

    public final List<zzdxm> zzbbp() {
        return this.zzhpy;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdyc.zzdk[i - 1]) {
            case 1:
                return new zzdyd();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhpz, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzhpx", "zzhpy", zzdxm.class});
            case 4:
                return zzhpz;
            case 5:
                zzedx<zzdyd> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdyd.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhpz);
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

    public static zzdyd zzbbq() {
        return zzhpz;
    }

    static {
        zzdyd zzdydVar = new zzdyd();
        zzhpz = zzdydVar;
        zzecd.zza(zzdyd.class, zzdydVar);
    }
}
