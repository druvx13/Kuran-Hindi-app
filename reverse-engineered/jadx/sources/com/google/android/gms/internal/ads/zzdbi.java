package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdbi implements zzdak<zzdbf> {
    private final String packageName;
    private final zzdrh zzfur;
    private final zzarq zzgph;
    private final Context zzvf;

    public zzdbi(zzarq zzarqVar, Context context, String str, zzdrh zzdrhVar) {
        this.zzgph = zzarqVar;
        this.zzvf = context;
        this.packageName = str;
        this.zzfur = zzdrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdbf> zzaqa() {
        return this.zzfur.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdbh
            private final zzdbi zzgpg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgpg = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgpg.zzaqt();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdbf zzaqt() throws Exception {
        JSONObject jSONObject = new JSONObject();
        zzarq zzarqVar = this.zzgph;
        if (zzarqVar != null) {
            zzarqVar.zza(this.zzvf, this.packageName, jSONObject);
        }
        return new zzdbf(jSONObject);
    }
}
