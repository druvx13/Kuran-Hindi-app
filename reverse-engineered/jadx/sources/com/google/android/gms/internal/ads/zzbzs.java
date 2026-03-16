package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbzs {
    private zzacr zzchr;

    public zzbzs(zzbzk zzbzkVar) {
        this.zzchr = zzbzkVar;
    }

    public final synchronized zzacr zzsl() {
        return this.zzchr;
    }

    public final synchronized void zza(zzacr zzacrVar) {
        this.zzchr = zzacrVar;
    }
}
