package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfh implements Callable {
    private final zzbv.zza.C0010zza zzaam;
    private final zzeo zzvp;

    public zzfh(zzeo zzeoVar, zzbv.zza.C0010zza c0010zza) {
        this.zzvp = zzeoVar;
        this.zzaam = c0010zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: zzcz */
    public final Void call() throws Exception {
        if (this.zzvp.zzcq() != null) {
            this.zzvp.zzcq().get();
        }
        zzbv.zza zzcp = this.zzvp.zzcp();
        if (zzcp != null) {
            try {
                synchronized (this.zzaam) {
                    zzbv.zza.C0010zza c0010zza = this.zzaam;
                    byte[] byteArray = zzcp.toByteArray();
                    c0010zza.zza(byteArray, 0, byteArray.length, zzebq.zzbed());
                }
                return null;
            } catch (zzeco unused) {
                return null;
            }
        }
        return null;
    }
}
