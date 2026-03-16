package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdk implements Runnable {
    private final /* synthetic */ zzdh zzvv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdk(zzdh zzdhVar) {
        this.zzvv = zzdhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzeo zzeoVar;
        ConditionVariable conditionVariable2;
        if (this.zzvv.zzvs != null) {
            return;
        }
        conditionVariable = zzdh.zzvq;
        synchronized (conditionVariable) {
            if (this.zzvv.zzvs != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = zzzz.zzcno.get().booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzeoVar = this.zzvv.zzvp;
                    zzdh.zzvr = new zzsy(zzeoVar.zzvf, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.zzvv.zzvs = Boolean.valueOf(z2);
            conditionVariable2 = zzdh.zzvq;
            conditionVariable2.open();
        }
    }
}
