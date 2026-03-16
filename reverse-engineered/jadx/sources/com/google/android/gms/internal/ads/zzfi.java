package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzbv;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfi extends zzfz {
    public zzfi(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2) {
        super(zzeoVar, str, str2, c0010zza, i, 24);
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    public final Void zzcz() throws Exception {
        if (this.zzvp.isInitialized()) {
            return super.call();
        }
        if (this.zzvp.zzcl()) {
            zzda();
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        if (this.zzvp.zzcl()) {
            zzda();
            return;
        }
        synchronized (this.zzaam) {
            this.zzaam.zzaa((String) this.zzaaw.invoke(null, this.zzvp.getContext()));
        }
    }

    private final void zzda() {
        AdvertisingIdClient zzct = this.zzvp.zzct();
        if (zzct == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = zzct.getInfo();
            String zzap = zzet.zzap(info.getId());
            if (zzap != null) {
                synchronized (this.zzaam) {
                    this.zzaam.zzaa(zzap);
                    this.zzaam.zza(info.isLimitAdTrackingEnabled());
                    this.zzaam.zza(zzbv.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfz, java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        return call();
    }
}
