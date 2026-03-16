package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcca {
    private final Executor executor;
    private final zzazz zzbmo;
    private final zzaci zzdhc;
    private final zzst zzeht;
    private final zzdt zzejl;
    private final ScheduledExecutorService zzfky;
    private final zzcbv zzfve;
    private final com.google.android.gms.ads.internal.zza zzfvf;
    private final zzccr zzfvg;
    private final Context zzvf;

    public zzcca(Context context, zzcbv zzcbvVar, zzdt zzdtVar, zzazz zzazzVar, com.google.android.gms.ads.internal.zza zzaVar, zzst zzstVar, Executor executor, zzdhe zzdheVar, zzccr zzccrVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzvf = context;
        this.zzfve = zzcbvVar;
        this.zzejl = zzdtVar;
        this.zzbmo = zzazzVar;
        this.zzfvf = zzaVar;
        this.zzeht = zzstVar;
        this.executor = executor;
        this.zzdhc = zzdheVar.zzdhc;
        this.zzfvg = zzccrVar;
        this.zzfky = scheduledExecutorService;
    }

    public static List<zzye> zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return Collections.emptyList();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzye zzl = zzl(optJSONArray.optJSONObject(i));
            if (zzl != null) {
                arrayList.add(zzl);
            }
        }
        return arrayList;
    }

    public static zzye zzk(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzl(optJSONObject);
    }

    private static zzye zzl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzye(optString, optString2);
    }

    public final zzdri<zzace> zzc(JSONObject jSONObject, String str) {
        return zza(jSONObject.optJSONObject(str), this.zzdhc.zzcyt);
    }

    public final zzdri<List<zzace>> zzd(JSONObject jSONObject, String str) {
        return zza(jSONObject.optJSONArray(str), this.zzdhc.zzcyt, this.zzdhc.zzbkz);
    }

    private final zzdri<List<zzace>> zza(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzdqw.zzag(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zza(jSONArray.optJSONObject(i), z));
        }
        return zzdqw.zzb(zzdqw.zzi(arrayList), zzccd.zzdsc, this.executor);
    }

    private final zzdri<zzace> zza(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzdqw.zzag(null);
        }
        final String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzdqw.zzag(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzdqw.zzag(new zzace(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zza(jSONObject.optBoolean("require"), zzdqw.zzb(this.zzfve.zza(optString, optDouble, optBoolean), new zzdnx(optString, optDouble, optInt, optInt2) { // from class: com.google.android.gms.internal.ads.zzccc
            private final String zzdcd;
            private final int zzdwu;
            private final int zzdwv;
            private final double zzfvj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdcd = optString;
                this.zzfvj = optDouble;
                this.zzdwu = optInt;
                this.zzdwv = optInt2;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj) {
                String str = this.zzdcd;
                return new zzace(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.zzfvj, this.zzdwu, this.zzdwv);
            }
        }, this.executor), (Object) null);
    }

    public final zzdri<zzacd> zze(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return zzdqw.zzag(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zza(optJSONObject.optBoolean("require"), zzdqw.zzb(zza(optJSONArray, false, true), new zzdnx(this, optJSONObject) { // from class: com.google.android.gms.internal.ads.zzccf
            private final JSONObject zzfhd;
            private final zzcca zzfvk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvk = this;
                this.zzfhd = optJSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj) {
                return this.zzfvk.zza(this.zzfhd, (List) obj);
            }
        }, this.executor), (Object) null);
    }

    private static Integer zzf(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final zzdri<zzbek> zzm(JSONObject jSONObject) {
        JSONObject zza = zzayu.zza(jSONObject, "html_containers", "instream");
        if (zza == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzdqw.zzag(null);
            }
            if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
                zzawr.zzfc("Required field 'vast_xml' is missing");
                return zzdqw.zzag(null);
            }
            return zza(zzdqw.zza(this.zzfvg.zzn(optJSONObject), ((Integer) zzvj.zzpv().zzd(zzzz.zzcot)).intValue(), TimeUnit.SECONDS, this.zzfky), (Object) null);
        }
        final zzdri<zzbek> zzo = this.zzfvg.zzo(zza.optString("base_url"), zza.optString("html"));
        return zzdqw.zzb(zzo, new zzdqj(zzo) { // from class: com.google.android.gms.internal.ads.zzcch
            private final zzdri zzfvm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvm = zzo;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                zzdri zzdriVar = this.zzfvm;
                zzbek zzbekVar = (zzbek) obj;
                if (zzbekVar == null || zzbekVar.zzzf() == null) {
                    throw new zzcqm("Retrieve video view in instream ad response failed.", 0);
                }
                return zzdriVar;
            }
        }, zzbab.zzdzw);
    }

    private static <T> zzdri<T> zza(zzdri<T> zzdriVar, T t) {
        return zzdqw.zzb(zzdriVar, Exception.class, new zzdqj(null) { // from class: com.google.android.gms.internal.ads.zzccg
            private final Object zzfvl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvl = r1;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                Object obj2 = this.zzfvl;
                zzawr.zza("Error during loading assets.", (Exception) obj);
                return zzdqw.zzag(obj2);
            }
        }, zzbab.zzdzw);
    }

    private static <T> zzdri<T> zza(boolean z, final zzdri<T> zzdriVar, T t) {
        if (z) {
            return zzdqw.zzb(zzdriVar, new zzdqj(zzdriVar) { // from class: com.google.android.gms.internal.ads.zzccj
                private final zzdri zzfvm;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfvm = zzdriVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdqj
                public final zzdri zzf(Object obj) {
                    return obj != null ? this.zzfvm : zzdqw.immediateFailedFuture(new zzcqm("Retrieve required value in native ad response failed.", 0));
                }
            }, zzbab.zzdzw);
        }
        return zza(zzdriVar, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzb(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzq.zzkx();
        zzbek zza = zzbes.zza(this.zzvf, zzbfz.zzacl(), "native-omid", false, false, this.zzejl, this.zzbmo, null, null, this.zzfvf, this.zzeht, null, false);
        final zzbak zzl = zzbak.zzl(zza);
        zza.zzabj().zza(new zzbfv(zzl) { // from class: com.google.android.gms.internal.ads.zzcci
            private final zzbak zzeis;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeis = zzl;
            }

            @Override // com.google.android.gms.internal.ads.zzbfv
            public final void zzak(boolean z) {
                this.zzeis.zzyj();
            }
        });
        zza.loadData(str, "text/html", "UTF-8");
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzacd zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzf = zzf(jSONObject, "bg_color");
        Integer zzf2 = zzf(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzacd(optString, list, zzf, zzf2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzdhc.zzbla, optBoolean);
    }
}
