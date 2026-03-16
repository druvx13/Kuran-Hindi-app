package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzakf implements zzain, zzakc {
    private final zzakd zzddo;
    private final HashSet<AbstractMap.SimpleEntry<String, zzaga<? super zzakd>>> zzddp = new HashSet<>();

    public zzakf(zzakd zzakdVar) {
        this.zzddo = zzakdVar;
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

    @Override // com.google.android.gms.internal.ads.zzain, com.google.android.gms.internal.ads.zzajc
    public final void zzda(String str) {
        this.zzddo.zzda(str);
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zza(String str, zzaga<? super zzakd> zzagaVar) {
        this.zzddo.zza(str, zzagaVar);
        this.zzddp.add(new AbstractMap.SimpleEntry<>(str, zzagaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zzb(String str, zzaga<? super zzakd> zzagaVar) {
        this.zzddo.zzb(str, zzagaVar);
        this.zzddp.remove(new AbstractMap.SimpleEntry(str, zzagaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzakc
    public final void zztb() {
        Iterator<AbstractMap.SimpleEntry<String, zzaga<? super zzakd>>> it = this.zzddp.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, zzaga<? super zzakd>> next = it.next();
            String valueOf = String.valueOf(next.getValue().toString());
            zzawr.zzeg(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.zzddo.zzb(next.getKey(), next.getValue());
        }
        this.zzddp.clear();
    }
}
