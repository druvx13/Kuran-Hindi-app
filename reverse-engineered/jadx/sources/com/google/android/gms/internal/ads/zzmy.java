package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzmy extends zzhp {
    private static final Object zzbdz = new Object();
    private final boolean zzaho;
    private final boolean zzahp;
    private final long zzbea;
    private final long zzbeb;
    private final long zzbec;
    private final long zzbed;

    public zzmy(long j, boolean z) {
        this(j, j, 0L, 0L, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final int zzfe() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final int zzff() {
        return 1;
    }

    private zzmy(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.zzbea = j;
        this.zzbeb = j2;
        this.zzbec = 0L;
        this.zzbed = 0L;
        this.zzaho = z;
        this.zzahp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final zzhq zza(int i, zzhq zzhqVar, boolean z, long j) {
        zzoh.zzc(i, 0, 1);
        boolean z2 = this.zzaho;
        long j2 = this.zzbeb;
        zzhqVar.zzahl = null;
        zzhqVar.zzahm = -9223372036854775807L;
        zzhqVar.zzahn = -9223372036854775807L;
        zzhqVar.zzaho = z2;
        zzhqVar.zzahp = false;
        zzhqVar.zzahs = 0L;
        zzhqVar.zzaht = j2;
        zzhqVar.zzahq = 0;
        zzhqVar.zzahr = 0;
        zzhqVar.zzahu = 0L;
        return zzhqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final zzhr zza(int i, zzhr zzhrVar, boolean z) {
        zzoh.zzc(i, 0, 1);
        Object obj = z ? zzbdz : null;
        return zzhrVar.zza(obj, obj, 0, this.zzbea, 0L, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final int zzc(Object obj) {
        return zzbdz.equals(obj) ? 0 : -1;
    }
}
