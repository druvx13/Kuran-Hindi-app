package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcdt {
    private final zzbes zzbnm;
    private final zzazz zzdls;
    private final zzdt zzejl;
    private final Executor zzfhi;
    private final com.google.android.gms.ads.internal.zza zzfvf;
    private final zzcdy zzfwf = new zzcdy(null);
    private final zzagg zzfwg = new zzagg();
    private zzdri<zzbek> zzfwh;
    private final Context zzvf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdt(zzced zzcedVar) {
        this.zzvf = zzced.zza(zzcedVar);
        this.zzfhi = zzced.zzb(zzcedVar);
        this.zzejl = zzced.zzc(zzcedVar);
        this.zzdls = zzced.zzd(zzcedVar);
        this.zzfvf = zzced.zze(zzcedVar);
        this.zzbnm = zzced.zzf(zzcedVar);
    }

    public final synchronized void zzamp() {
        zzdri<zzbek> zzb = zzdqw.zzb(zzbes.zza(this.zzvf, this.zzdls, (String) zzvj.zzpv().zzd(zzzz.zzcoq), this.zzejl, this.zzfvf), new zzdnx(this) { // from class: com.google.android.gms.internal.ads.zzcds
            private final zzcdt zzfwe;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfwe = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj) {
                return this.zzfwe.zzm((zzbek) obj);
            }
        }, this.zzfhi);
        this.zzfwh = zzb;
        zzbaf.zza(zzb, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void destroy() {
        if (this.zzfwh == null) {
            return;
        }
        zzdqw.zza(this.zzfwh, new zzcdu(this), this.zzfhi);
        this.zzfwh = null;
    }

    public final synchronized zzdri<JSONObject> zzc(final String str, final JSONObject jSONObject) {
        if (this.zzfwh == null) {
            return zzdqw.zzag(null);
        }
        return zzdqw.zzb(this.zzfwh, new zzdqj(this, str, jSONObject) { // from class: com.google.android.gms.internal.ads.zzcdv
            private final String zzdbv;
            private final zzcdt zzfwe;
            private final JSONObject zzfwi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfwe = this;
                this.zzdbv = str;
                this.zzfwi = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzfwe.zza(this.zzdbv, this.zzfwi, (zzbek) obj);
            }
        }, this.zzfhi);
    }

    public final synchronized void zza(String str, zzaga<Object> zzagaVar) {
        if (this.zzfwh == null) {
            return;
        }
        zzdqw.zza(this.zzfwh, new zzcdx(this, str, zzagaVar), this.zzfhi);
    }

    public final synchronized void zzb(String str, zzaga<Object> zzagaVar) {
        if (this.zzfwh == null) {
            return;
        }
        zzdqw.zza(this.zzfwh, new zzcdw(this, str, zzagaVar), this.zzfhi);
    }

    public final synchronized void zza(String str, Map<String, ?> map) {
        if (this.zzfwh == null) {
            return;
        }
        zzdqw.zza(this.zzfwh, new zzcdz(this, str, map), this.zzfhi);
    }

    public final <T> void zza(WeakReference<T> weakReference, String str, zzaga<T> zzagaVar) {
        zza(str, new zzcec(this, weakReference, str, zzagaVar, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(String str, JSONObject jSONObject, zzbek zzbekVar) throws Exception {
        return this.zzfwg.zza(zzbekVar, str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbek zzm(zzbek zzbekVar) {
        zzbekVar.zza("/result", this.zzfwg);
        zzbfw zzabj = zzbekVar.zzabj();
        zzcdy zzcdyVar = this.zzfwf;
        zzabj.zza(null, zzcdyVar, zzcdyVar, zzcdyVar, zzcdyVar, false, null, new com.google.android.gms.ads.internal.zzc(this.zzvf, null, null), null, null);
        return zzbekVar;
    }
}
