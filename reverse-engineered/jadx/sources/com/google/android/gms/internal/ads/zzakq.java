package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzakq<I, O> implements zzakh<I, O> {
    private final zzajf zzddz;
    private final zzakj<O> zzdea;
    private final zzaki<I> zzdeb;
    private final String zzdec;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakq(zzajf zzajfVar, String str, zzaki<I> zzakiVar, zzakj<O> zzakjVar) {
        this.zzddz = zzajfVar;
        this.zzdec = str;
        this.zzdeb = zzakiVar;
        this.zzdea = zzakjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzakh
    public final zzdri<O> zzi(I i) {
        zzbaj zzbajVar = new zzbaj();
        zzajs zzb = this.zzddz.zzb((zzdt) null);
        zzb.zza(new zzakt(this, zzb, i, zzbajVar), new zzaks(this, zzbajVar, zzb));
        return zzbajVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzajs zzajsVar, zzakd zzakdVar, I i, zzbaj<O> zzbajVar) {
        try {
            com.google.android.gms.ads.internal.zzq.zzkw();
            String zzxg = zzaxa.zzxg();
            zzafn.zzdam.zza(zzxg, new zzakv(this, zzajsVar, zzbajVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", zzxg);
            jSONObject.put("args", this.zzdeb.zzj(i));
            zzakdVar.zza(this.zzdec, jSONObject);
        } catch (Exception e) {
            try {
                zzbajVar.setException(e);
                zzawr.zzc("Unable to invokeJavascript", e);
            } finally {
                zzajsVar.release();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final zzdri<O> zzf(I i) throws Exception {
        return zzi(i);
    }
}
