package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbqk implements zzegz<String> {
    private final zzbqj zzfmy;

    private zzbqk(zzbqj zzbqjVar) {
        this.zzfmy = zzbqjVar;
    }

    public static zzbqk zzg(zzbqj zzbqjVar) {
        return new zzbqk(zzbqjVar);
    }

    public static String zzh(zzbqj zzbqjVar) {
        return zzbqjVar.zzaiq();
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return this.zzfmy.zzaiq();
    }
}
