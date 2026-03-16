package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcid implements zzdla {
    private final Clock zzbnt;
    private final zzchx zzfzg;
    private final Map<zzdkr, Long> zzfzf = new HashMap();
    private final Map<zzdkr, zzcic> zzfzh = new HashMap();

    public zzcid(zzchx zzchxVar, Set<zzcic> set, Clock clock) {
        zzdkr zzdkrVar;
        this.zzfzg = zzchxVar;
        for (zzcic zzcicVar : set) {
            Map<zzdkr, zzcic> map = this.zzfzh;
            zzdkrVar = zzcicVar.zzfze;
            map.put(zzdkrVar, zzcicVar);
        }
        this.zzbnt = clock;
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zza(zzdkr zzdkrVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zzb(zzdkr zzdkrVar, String str) {
        this.zzfzf.put(zzdkrVar, Long.valueOf(this.zzbnt.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zza(zzdkr zzdkrVar, String str, Throwable th) {
        if (this.zzfzf.containsKey(zzdkrVar)) {
            long elapsedRealtime = this.zzbnt.elapsedRealtime() - this.zzfzf.get(zzdkrVar).longValue();
            Map<String, String> zzrm = this.zzfzg.zzrm();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzrm.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.zzfzh.containsKey(zzdkrVar)) {
            zza(zzdkrVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zzc(zzdkr zzdkrVar, String str) {
        if (this.zzfzf.containsKey(zzdkrVar)) {
            long elapsedRealtime = this.zzbnt.elapsedRealtime() - this.zzfzf.get(zzdkrVar).longValue();
            Map<String, String> zzrm = this.zzfzg.zzrm();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzrm.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.zzfzh.containsKey(zzdkrVar)) {
            zza(zzdkrVar, true);
        }
    }

    private final void zza(zzdkr zzdkrVar, boolean z) {
        zzdkr zzdkrVar2;
        String str;
        zzdkrVar2 = this.zzfzh.get(zzdkrVar).zzfzd;
        String str2 = z ? "s." : "f.";
        if (this.zzfzf.containsKey(zzdkrVar2)) {
            long elapsedRealtime = this.zzbnt.elapsedRealtime() - this.zzfzf.get(zzdkrVar2).longValue();
            Map<String, String> zzrm = this.zzfzg.zzrm();
            str = this.zzfzh.get(zzdkrVar).label;
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "label.".concat(valueOf) : new String("label.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzrm.put(concat, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
        }
    }
}
