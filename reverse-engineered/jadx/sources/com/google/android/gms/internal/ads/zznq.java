package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zznq {
    public final zzna zzbfg;
    public final zznl zzbfh;
    public final Object zzbfi;
    public final zzhm[] zzbfj;

    public zznq(zzna zznaVar, zznl zznlVar, Object obj, zzhm[] zzhmVarArr) {
        this.zzbfg = zznaVar;
        this.zzbfh = zznlVar;
        this.zzbfi = obj;
        this.zzbfj = zzhmVarArr;
    }

    public final boolean zza(zznq zznqVar, int i) {
        return zznqVar != null && zzov.zza(this.zzbfh.zzba(i), zznqVar.zzbfh.zzba(i)) && zzov.zza(this.zzbfj[i], zznqVar.zzbfj[i]);
    }
}
