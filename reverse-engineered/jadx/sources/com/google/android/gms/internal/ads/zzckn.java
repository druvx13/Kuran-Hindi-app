package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzckn {
    private final Executor executor;
    private final zzdhe zzfll;
    private final zzazz zzgbn;
    private final Context zzvf;

    public zzckn(Context context, zzazz zzazzVar, zzdhe zzdheVar, Executor executor) {
        this.zzvf = context;
        this.zzgbn = zzazzVar;
        this.zzfll = zzdheVar;
        this.executor = executor;
    }

    public final zzdri<zzdha> zzaos() {
        final zzakh zza = com.google.android.gms.ads.internal.zzq.zzlj().zzb(this.zzvf, this.zzgbn).zza("google.afma.response.normalize", zzakk.zzddu, zzakk.zzddu);
        final zzud zzudVar = this.zzfll.zzguw.zzceu;
        return zzdqw.zzb(zzdqw.zzb(zzdqw.zzb(zzdqw.zzag(""), new zzdqj(this, zzudVar) { // from class: com.google.android.gms.internal.ads.zzckm
            private final zzckn zzgbl;
            private final zzud zzgbm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbl = this;
                this.zzgbm = zzudVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                zzud zzudVar2 = this.zzgbm;
                String str = (String) obj;
                String str2 = zzudVar2.zzcec;
                String str3 = zzudVar2.zzced;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("headers", new JSONObject());
                jSONObject3.put("body", str2);
                jSONObject2.put("base_url", "");
                jSONObject2.put("signals", new JSONObject(str3));
                jSONObject.put("request", jSONObject2);
                jSONObject.put("response", jSONObject3);
                jSONObject.put("flags", new JSONObject());
                return zzdqw.zzag(jSONObject);
            }
        }, this.executor), new zzdqj(zza) { // from class: com.google.android.gms.internal.ads.zzckp
            private final zzakh zzgbo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbo = zza;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgbo.zzi((JSONObject) obj);
            }
        }, this.executor), new zzdqj(this) { // from class: com.google.android.gms.internal.ads.zzcko
            private final zzckn zzgbl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbl = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgbl.zzo((JSONObject) obj);
            }
        }, this.executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzo(JSONObject jSONObject) throws Exception {
        return zzdqw.zzag(new zzdha(new zzdgv(this.zzfll), zzdgy.zza(new StringReader(jSONObject.toString()))));
    }
}
