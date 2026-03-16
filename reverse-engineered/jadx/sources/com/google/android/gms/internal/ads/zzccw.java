package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzccw {
    private final Executor zzfhi;
    private final zzbvs zzfqg;
    private final zzbky zzfvv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccw(Executor executor, zzbky zzbkyVar, zzbvs zzbvsVar) {
        this.zzfhi = executor;
        this.zzfqg = zzbvsVar;
        this.zzfvv = zzbkyVar;
    }

    public final void zzl(final zzbek zzbekVar) {
        if (zzbekVar == null) {
            return;
        }
        this.zzfqg.zzu(zzbekVar.getView());
        this.zzfqg.zza(new zzpz(zzbekVar) { // from class: com.google.android.gms.internal.ads.zzccz
            private final zzbek zzelg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzelg = zzbekVar;
            }

            @Override // com.google.android.gms.internal.ads.zzpz
            public final void zza(zzqa zzqaVar) {
                this.zzelg.zzabj().zza(zzqaVar.zzbpe.left, zzqaVar.zzbpe.top, false);
            }
        }, this.zzfhi);
        this.zzfqg.zza(new zzpz(zzbekVar) { // from class: com.google.android.gms.internal.ads.zzccy
            private final zzbek zzelg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzelg = zzbekVar;
            }

            @Override // com.google.android.gms.internal.ads.zzpz
            public final void zza(zzqa zzqaVar) {
                zzbek zzbekVar2 = this.zzelg;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", zzqaVar.zzbot ? "1" : "0");
                zzbekVar2.zza("onAdVisibilityChanged", hashMap);
            }
        }, this.zzfhi);
        this.zzfqg.zza(this.zzfvv, this.zzfhi);
        this.zzfvv.zzg(zzbekVar);
        zzbekVar.zza("/trackActiveViewUnit", new zzaga(this) { // from class: com.google.android.gms.internal.ads.zzcdb
            private final zzccw zzfvw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvw = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaga
            public final void zza(Object obj, Map map) {
                this.zzfvw.zzf((zzbek) obj, map);
            }
        });
        zzbekVar.zza("/untrackActiveViewUnit", new zzaga(this) { // from class: com.google.android.gms.internal.ads.zzcda
            private final zzccw zzfvw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvw = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaga
            public final void zza(Object obj, Map map) {
                this.zzfvw.zze((zzbek) obj, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzbek zzbekVar, Map map) {
        this.zzfvv.disable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzbek zzbekVar, Map map) {
        this.zzfvv.enable();
    }
}
