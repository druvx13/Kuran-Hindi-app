package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcag {
    zzadx zzfsp;
    zzads zzfsq;
    zzael zzfsr;
    zzaeg zzfss;
    zzahu zzfst;
    final SimpleArrayMap<String, zzaed> zzfsu = new SimpleArrayMap<>();
    final SimpleArrayMap<String, zzady> zzfsv = new SimpleArrayMap<>();

    public final zzcag zzb(zzadx zzadxVar) {
        this.zzfsp = zzadxVar;
        return this;
    }

    public final zzcag zzb(zzads zzadsVar) {
        this.zzfsq = zzadsVar;
        return this;
    }

    public final zzcag zzb(zzael zzaelVar) {
        this.zzfsr = zzaelVar;
        return this;
    }

    public final zzcag zza(zzaeg zzaegVar) {
        this.zzfss = zzaegVar;
        return this;
    }

    public final zzcag zzb(zzahu zzahuVar) {
        this.zzfst = zzahuVar;
        return this;
    }

    public final zzcag zzb(String str, zzaed zzaedVar, zzady zzadyVar) {
        this.zzfsu.put(str, zzaedVar);
        this.zzfsv.put(str, zzadyVar);
        return this;
    }

    public final zzcae zzals() {
        return new zzcae(this);
    }
}
