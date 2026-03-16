package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzalb<I, O> implements zzdqj<I, O> {
    private final zzakj<O> zzdea;
    private final zzaki<I> zzdeb;
    private final String zzdec;
    private final zzdri<zzakd> zzdeh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalb(zzdri<zzakd> zzdriVar, String str, zzaki<I> zzakiVar, zzakj<O> zzakjVar) {
        this.zzdeh = zzdriVar;
        this.zzdec = str;
        this.zzdeb = zzakiVar;
        this.zzdea = zzakjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final zzdri<O> zzf(final I i) throws Exception {
        return zzdqw.zzb(this.zzdeh, new zzdqj(this, i) { // from class: com.google.android.gms.internal.ads.zzala
            private final zzalb zzdek;
            private final Object zzdel;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdek = this;
                this.zzdel = i;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzdek.zza(this.zzdel, (zzakd) obj);
            }
        }, zzbab.zzdzw);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(Object obj, zzakd zzakdVar) throws Exception {
        zzbaj zzbajVar = new zzbaj();
        com.google.android.gms.ads.internal.zzq.zzkw();
        String zzxg = zzaxa.zzxg();
        zzafn.zzdam.zza(zzxg, new zzald(this, zzbajVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", zzxg);
        jSONObject.put("args", this.zzdeb.zzj(obj));
        zzakdVar.zza(this.zzdec, jSONObject);
        return zzbajVar;
    }
}
