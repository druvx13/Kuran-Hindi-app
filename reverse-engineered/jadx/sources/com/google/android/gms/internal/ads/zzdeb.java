package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdeb<R> implements zzdjj {
    public final Executor executor;
    public final String zzbsc;
    public final zzuj zzdlx;
    public final zzut zzgmd;
    public final zzdew<R> zzgrt;
    public final zzdev zzgru;
    @Nullable
    private final zzdiy zzgrv;

    public zzdeb(zzdew<R> zzdewVar, zzdev zzdevVar, zzuj zzujVar, String str, Executor executor, zzut zzutVar, @Nullable zzdiy zzdiyVar) {
        this.zzgrt = zzdewVar;
        this.zzgru = zzdevVar;
        this.zzdlx = zzujVar;
        this.zzbsc = str;
        this.executor = executor;
        this.zzgmd = zzutVar;
        this.zzgrv = zzdiyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final Executor getExecutor() {
        return this.executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    @Nullable
    public final zzdiy zzarl() {
        return this.zzgrv;
    }

    @Override // com.google.android.gms.internal.ads.zzdjj
    public final zzdjj zzarm() {
        return new zzdeb(this.zzgrt, this.zzgru, this.zzdlx, this.zzbsc, this.executor, this.zzgmd, this.zzgrv);
    }
}
