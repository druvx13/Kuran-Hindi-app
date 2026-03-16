package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcbw {
    private final zzdrh zzfur;
    private final zzcca zzfus;
    private final zzcck zzfut;

    public zzcbw(zzdrh zzdrhVar, zzcca zzccaVar, zzcck zzcckVar) {
        this.zzfur = zzdrhVar;
        this.zzfus = zzccaVar;
        this.zzfut = zzcckVar;
    }

    public final zzdri<zzbzx> zza(final zzdha zzdhaVar, final zzdgo zzdgoVar, final JSONObject jSONObject) {
        zzdri zzb;
        final zzdri zzd = this.zzfur.zzd(new Callable(this, zzdhaVar, zzdgoVar, jSONObject) { // from class: com.google.android.gms.internal.ads.zzcbz
            private final zzdgo zzfjm;
            private final zzcbw zzfuu;
            private final zzdha zzfvc;
            private final JSONObject zzfvd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfuu = this;
                this.zzfvc = zzdhaVar;
                this.zzfjm = zzdgoVar;
                this.zzfvd = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdha zzdhaVar2 = this.zzfvc;
                zzdgo zzdgoVar2 = this.zzfjm;
                JSONObject jSONObject2 = this.zzfvd;
                zzbzx zzbzxVar = new zzbzx();
                zzbzxVar.zzdr(jSONObject2.optInt("template_id", -1));
                zzbzxVar.zzfy(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                zzbzxVar.zzfz(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
                zzdhe zzdheVar = zzdhaVar2.zzgur.zzfll;
                if (!zzdheVar.zzguy.contains(Integer.toString(zzbzxVar.zzakw()))) {
                    int zzakw = zzbzxVar.zzakw();
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("Invalid template ID: ");
                    sb.append(zzakw);
                    throw new zzcqm(sb.toString(), 0);
                }
                if (zzbzxVar.zzakw() == 3) {
                    if (zzbzxVar.getCustomTemplateId() == null) {
                        throw new zzcqm("No custom template id for custom template ad response.", 0);
                    }
                    if (!zzdheVar.zzguz.contains(zzbzxVar.getCustomTemplateId())) {
                        throw new zzcqm("Unexpected custom template id in the response.", 0);
                    }
                }
                zzbzxVar.setStarRating(jSONObject2.optDouble("rating", -1.0d));
                String optString = jSONObject2.optString("headline", null);
                if (zzdgoVar2.zzdpp) {
                    com.google.android.gms.ads.internal.zzq.zzkw();
                    String zzxj = zzaxa.zzxj();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzxj).length() + 3 + String.valueOf(optString).length());
                    sb2.append(zzxj);
                    sb2.append(" : ");
                    sb2.append(optString);
                    optString = sb2.toString();
                }
                zzbzxVar.zzn("headline", optString);
                zzbzxVar.zzn("body", jSONObject2.optString("body", null));
                zzbzxVar.zzn("call_to_action", jSONObject2.optString("call_to_action", null));
                zzbzxVar.zzn("store", jSONObject2.optString("store", null));
                zzbzxVar.zzn(FirebaseAnalytics.Param.PRICE, jSONObject2.optString(FirebaseAnalytics.Param.PRICE, null));
                zzbzxVar.zzn("advertiser", jSONObject2.optString("advertiser", null));
                return zzbzxVar;
            }
        });
        final zzdri<List<zzace>> zzd2 = this.zzfus.zzd(jSONObject, "images");
        final zzdri<zzace> zzc = this.zzfus.zzc(jSONObject, "secondary_image");
        final zzdri<zzace> zzc2 = this.zzfus.zzc(jSONObject, "app_icon");
        final zzdri<zzacd> zze = this.zzfus.zze(jSONObject, "attribution");
        final zzdri<zzbek> zzm = this.zzfus.zzm(jSONObject);
        final zzcca zzccaVar = this.zzfus;
        if (!jSONObject.optBoolean("enable_omid")) {
            zzb = zzdqw.zzag(null);
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzb = zzdqw.zzag(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzb = zzdqw.zzag(null);
                } else {
                    zzb = zzdqw.zzb(zzdqw.zzag(null), new zzdqj(zzccaVar, optString) { // from class: com.google.android.gms.internal.ads.zzcce
                        private final String zzdbv;
                        private final zzcca zzfvk;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzfvk = zzccaVar;
                            this.zzdbv = optString;
                        }

                        @Override // com.google.android.gms.internal.ads.zzdqj
                        public final zzdri zzf(Object obj) {
                            return this.zzfvk.zzb(this.zzdbv, obj);
                        }
                    }, zzbab.zzdzv);
                }
            }
        }
        final zzdri zzdriVar = zzb;
        final zzdri<List<zzccp>> zzg = this.zzfut.zzg(jSONObject, "custom_assets");
        return zzdqw.zza(zzd, zzd2, zzc, zzc2, zze, zzm, zzdriVar, zzg).zza(new Callable(this, zzd, zzd2, zzc2, zzc, zze, jSONObject, zzm, zzdriVar, zzg) { // from class: com.google.android.gms.internal.ads.zzcby
            private final zzdri zzflc;
            private final zzdri zzfmu;
            private final zzcbw zzfuu;
            private final zzdri zzfuv;
            private final zzdri zzfuw;
            private final zzdri zzfux;
            private final JSONObject zzfuy;
            private final zzdri zzfuz;
            private final zzdri zzfva;
            private final zzdri zzfvb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfuu = this;
                this.zzfmu = zzd;
                this.zzflc = zzd2;
                this.zzfuv = zzc2;
                this.zzfuw = zzc;
                this.zzfux = zze;
                this.zzfuy = jSONObject;
                this.zzfuz = zzm;
                this.zzfva = zzdriVar;
                this.zzfvb = zzg;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdri zzdriVar2 = this.zzfmu;
                zzdri zzdriVar3 = this.zzflc;
                zzdri zzdriVar4 = this.zzfuv;
                zzdri zzdriVar5 = this.zzfuw;
                zzdri zzdriVar6 = this.zzfux;
                JSONObject jSONObject2 = this.zzfuy;
                zzdri zzdriVar7 = this.zzfuz;
                zzdri zzdriVar8 = this.zzfva;
                zzdri zzdriVar9 = this.zzfvb;
                zzbzx zzbzxVar = (zzbzx) zzdriVar2.get();
                zzbzxVar.setImages((List) zzdriVar3.get());
                zzbzxVar.zza((zzacs) zzdriVar4.get());
                zzbzxVar.zzb((zzacs) zzdriVar5.get());
                zzbzxVar.zza((zzack) zzdriVar6.get());
                zzbzxVar.zzg(zzcca.zzj(jSONObject2));
                zzbzxVar.zza(zzcca.zzk(jSONObject2));
                zzbek zzbekVar = (zzbek) zzdriVar7.get();
                if (zzbekVar != null) {
                    zzbzxVar.zzi(zzbekVar);
                    zzbzxVar.zzab(zzbekVar.getView());
                    zzbzxVar.zzb(zzbekVar.zzzf());
                }
                zzbek zzbekVar2 = (zzbek) zzdriVar8.get();
                if (zzbekVar2 != null) {
                    zzbzxVar.zzj(zzbekVar2);
                }
                for (zzccp zzccpVar : (List) zzdriVar9.get()) {
                    int i = zzccpVar.type;
                    if (i == 1) {
                        zzbzxVar.zzn(zzccpVar.zzcc, zzccpVar.zzfvq);
                    } else if (i == 2) {
                        zzbzxVar.zza(zzccpVar.zzcc, zzccpVar.zzfvr);
                    }
                }
                return zzbzxVar;
            }
        }, this.zzfur);
    }
}
