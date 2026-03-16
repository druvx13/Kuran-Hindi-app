package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaiu implements zzain, zzais {
    private final zzbek zzdce;
    private final Context zzvf;

    public zzaiu(Context context, zzazz zzazzVar, zzdt zzdtVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzbew {
        this.zzvf = context;
        com.google.android.gms.ads.internal.zzq.zzkx();
        zzbek zza = zzbes.zza(context, zzbfz.zzacl(), "", false, false, zzdtVar, zzazzVar, null, null, null, zzst.zzmz(), null, false);
        this.zzdce = zza;
        zza.getView().setWillNotDraw(true);
    }

    @Override // com.google.android.gms.internal.ads.zzaif
    public final void zza(String str, Map map) {
        zzaim.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final void zza(String str, JSONObject jSONObject) {
        zzaim.zza(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzain, com.google.android.gms.internal.ads.zzaif
    public final void zzb(String str, JSONObject jSONObject) {
        zzaim.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final void zzj(String str, String str2) {
        zzaim.zza(this, str, str2);
    }

    private static void runOnUiThread(Runnable runnable) {
        zzvj.zzpr();
        if (zzazm.zzye()) {
            runnable.run();
        } else {
            zzaxa.zzdwf.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzain, com.google.android.gms.internal.ads.zzajc
    public final void zzda(final String str) {
        runOnUiThread(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzaix
            private final String zzdbv;
            private final zzaiu zzdcg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdcg = this;
                this.zzdbv = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdcg.zzdf(this.zzdbv);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final void zzcx(String str) {
        runOnUiThread(new zzaiy(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str)));
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final void zzcy(String str) {
        runOnUiThread(new zzajb(this, str));
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final void zzcz(String str) {
        runOnUiThread(new zzaja(this, str));
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zza(String str, zzaga<? super zzakd> zzagaVar) {
        this.zzdce.zza(str, new zzajd(this, zzagaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zzb(String str, final zzaga<? super zzakd> zzagaVar) {
        this.zzdce.zza(str, new Predicate(zzagaVar) { // from class: com.google.android.gms.internal.ads.zzaiw
            private final zzaga zzdcf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdcf = zzagaVar;
            }

            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzaga zzagaVar2;
                zzaga zzagaVar3 = this.zzdcf;
                zzaga zzagaVar4 = (zzaga) obj;
                if (zzagaVar4 instanceof zzajd) {
                    zzagaVar2 = ((zzajd) zzagaVar4).zzdcl;
                    return zzagaVar2.equals(zzagaVar3);
                }
                return false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final void zza(zzaiv zzaivVar) {
        zzbfw zzabj = this.zzdce.zzabj();
        zzaivVar.getClass();
        zzabj.zza(zzaiz.zzb(zzaivVar));
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final zzakc zzsu() {
        return new zzakf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final void destroy() {
        this.zzdce.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final boolean isDestroyed() {
        return this.zzdce.isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzdf(String str) {
        this.zzdce.zzda(str);
    }
}
