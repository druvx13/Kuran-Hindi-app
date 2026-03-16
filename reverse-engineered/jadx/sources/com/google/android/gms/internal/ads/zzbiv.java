package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzbiv {
    private zza zzfff;

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static abstract class zza {
        public abstract zzbdt zzads();

        public abstract zzbbh zzadt();

        public abstract zzsy zzadu();

        public abstract zzaup zzadv();

        public abstract zzapn zzadw();

        public abstract zzalc zzadx();
    }

    public zzbiv(zza zzaVar) {
        this.zzfff = zzaVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzauk, com.google.android.gms.internal.ads.zzauq] */
    public final com.google.android.gms.ads.internal.zza zzaga() {
        zza zzaVar = this.zzfff;
        return new com.google.android.gms.ads.internal.zza(zzaVar.zzads(), zzaVar.zzadt(), new zzauk(zzaVar.zzadv()), zzaVar.zzadu(), zzaVar.zzadw());
    }

    public final zzaup zzadv() {
        return this.zzfff.zzadv();
    }

    public final zzapn zzadw() {
        return this.zzfff.zzadw();
    }

    public final zzalc zzadx() {
        return this.zzfff.zzadx();
    }
}
