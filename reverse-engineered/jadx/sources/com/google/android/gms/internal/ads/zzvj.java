package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import java.util.Random;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzvj {
    private static zzvj zzcfz = new zzvj();
    private final zzazm zzcga;
    private final zzuu zzcgb;
    private final String zzcgc;
    private final zzzq zzcgd;
    private final zzzs zzcge;
    private final zzzv zzcgf;
    private final zzazz zzcgg;
    private final Random zzcgh;
    private final WeakHashMap<QueryInfo, String> zzcgi;

    protected zzvj() {
        this(new zzazm(), new zzuu(new zzuh(), new zzue(), new zzyj(), new zzaew(), new zzasr(), new zzatv(), new zzape(), new zzaez()), new zzzq(), new zzzs(), new zzzv(), zzazm.zzyf(), new zzazz(0, 201004000, true), new Random(), new WeakHashMap());
    }

    private zzvj(zzazm zzazmVar, zzuu zzuuVar, zzzq zzzqVar, zzzs zzzsVar, zzzv zzzvVar, String str, zzazz zzazzVar, Random random, WeakHashMap<QueryInfo, String> weakHashMap) {
        this.zzcga = zzazmVar;
        this.zzcgb = zzuuVar;
        this.zzcgd = zzzqVar;
        this.zzcge = zzzsVar;
        this.zzcgf = zzzvVar;
        this.zzcgc = str;
        this.zzcgg = zzazzVar;
        this.zzcgh = random;
        this.zzcgi = weakHashMap;
    }

    public static zzazm zzpr() {
        return zzcfz.zzcga;
    }

    public static zzuu zzps() {
        return zzcfz.zzcgb;
    }

    public static zzzs zzpt() {
        return zzcfz.zzcge;
    }

    public static zzzq zzpu() {
        return zzcfz.zzcgd;
    }

    public static zzzv zzpv() {
        return zzcfz.zzcgf;
    }

    public static String zzpw() {
        return zzcfz.zzcgc;
    }

    public static zzazz zzpx() {
        return zzcfz.zzcgg;
    }

    public static Random zzpy() {
        return zzcfz.zzcgh;
    }

    public static WeakHashMap<QueryInfo, String> zzpz() {
        return zzcfz.zzcgi;
    }
}
