package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcpn implements zzcpk<zzbzm> {
    private final zzdrh zzfur;
    private final zzbyp zzgfy;
    private final zzcbw zzgfz;
    private final zzdhp<zzcdt> zzgga;

    public zzcpn(zzbyp zzbypVar, zzdrh zzdrhVar, zzcbw zzcbwVar, zzdhp<zzcdt> zzdhpVar) {
        this.zzgfy = zzbypVar;
        this.zzfur = zzdrhVar;
        this.zzgfz = zzcbwVar;
        this.zzgga = zzdhpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final boolean zza(zzdha zzdhaVar, zzdgo zzdgoVar) {
        return (zzdgoVar.zzgtr == null || zzdgoVar.zzgtr.zzfpz == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final zzdri<List<zzdri<zzbzm>>> zzb(final zzdha zzdhaVar, final zzdgo zzdgoVar) {
        return zzdqw.zzb(zzdqw.zzb(this.zzgga.zzasg(), new zzdqj(this, zzdgoVar) { // from class: com.google.android.gms.internal.ads.zzcpm
            private final zzdgo zzgfo;
            private final zzcpn zzgfx;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfx = this;
                this.zzgfo = zzdgoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgfx.zza(this.zzgfo, (zzcdt) obj);
            }
        }, this.zzfur), new zzdqj(this, zzdhaVar, zzdgoVar) { // from class: com.google.android.gms.internal.ads.zzcpp
            private final zzdgo zzfjm;
            private final zzdha zzfvc;
            private final zzcpn zzgfx;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfx = this;
                this.zzfvc = zzdhaVar;
                this.zzfjm = zzdgoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgfx.zza(this.zzfvc, this.zzfjm, (JSONArray) obj);
            }
        }, this.zzfur);
    }

    private final zzdri<zzbzm> zzb(final zzdha zzdhaVar, final zzdgo zzdgoVar, final JSONObject jSONObject) {
        final zzdri<zzcdt> zzasg = this.zzgga.zzasg();
        final zzdri<zzbzx> zza = this.zzgfz.zza(zzdhaVar, zzdgoVar, jSONObject);
        return zzdqw.zzb(zzasg, zza).zza(new Callable(this, zza, zzasg, zzdhaVar, zzdgoVar, jSONObject) { // from class: com.google.android.gms.internal.ads.zzcpq
            private final zzdri zzflc;
            private final zzdri zzfmu;
            private final zzdha zzgfq;
            private final zzcpn zzgfx;
            private final zzdgo zzggc;
            private final JSONObject zzggd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfx = this;
                this.zzfmu = zza;
                this.zzflc = zzasg;
                this.zzgfq = zzdhaVar;
                this.zzggc = zzdgoVar;
                this.zzggd = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgfx.zza(this.zzfmu, this.zzflc, this.zzgfq, this.zzggc, this.zzggd);
            }
        }, this.zzfur);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbzm zza(zzdri zzdriVar, zzdri zzdriVar2, zzdha zzdhaVar, zzdgo zzdgoVar, JSONObject jSONObject) throws Exception {
        zzbzx zzbzxVar = (zzbzx) zzdriVar.get();
        zzcdt zzcdtVar = (zzcdt) zzdriVar2.get();
        zzbzz zza = this.zzgfy.zza(new zzboi(zzdhaVar, zzdgoVar, null), new zzcaj(zzbzxVar), new zzbza(jSONObject, zzcdtVar));
        zza.zzaep().zzamo();
        zza.zzaeq().zzb(zzcdtVar);
        zza.zzaer().zzl(zzbzxVar.zzalb());
        return zza.zzaeo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(zzcdt zzcdtVar, JSONObject jSONObject) throws Exception {
        this.zzgga.zzd(zzdqw.zzag(zzcdtVar));
        if (!jSONObject.optBoolean(FirebaseAnalytics.Param.SUCCESS)) {
            throw new zzake("process json failed");
        }
        return zzdqw.zzag(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(zzdha zzdhaVar, zzdgo zzdgoVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzdqw.immediateFailedFuture(new zzcjk(3));
        }
        if (zzdhaVar.zzgur.zzfll.zzgkg > 1) {
            int length = jSONArray.length();
            this.zzgga.zzdw(Math.min(length, zzdhaVar.zzgur.zzfll.zzgkg));
            ArrayList arrayList = new ArrayList(zzdhaVar.zzgur.zzfll.zzgkg);
            for (int i = 0; i < zzdhaVar.zzgur.zzfll.zzgkg; i++) {
                if (i < length) {
                    arrayList.add(zzb(zzdhaVar, zzdgoVar, jSONArray.getJSONObject(i)));
                } else {
                    arrayList.add(zzdqw.immediateFailedFuture(new zzcjk(3)));
                }
            }
            return zzdqw.zzag(arrayList);
        }
        return zzdqw.zzb(zzb(zzdhaVar, zzdgoVar, jSONArray.getJSONObject(0)), zzcpr.zzdsc, this.zzfur);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(zzdgo zzdgoVar, final zzcdt zzcdtVar) throws Exception {
        JSONObject zza = zzayu.zza("isNonagon", (Object) true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("response", zzdgoVar.zzgtr.zzfpz);
        jSONObject.put("sdk_params", zza);
        return zzdqw.zzb(zzcdtVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject), new zzdqj(this, zzcdtVar) { // from class: com.google.android.gms.internal.ads.zzcpo
            private final zzcpn zzgfx;
            private final zzcdt zzggb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfx = this;
                this.zzggb = zzcdtVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgfx.zza(this.zzggb, (JSONObject) obj);
            }
        }, this.zzfur);
    }
}
