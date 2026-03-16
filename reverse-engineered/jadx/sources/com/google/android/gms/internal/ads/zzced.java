package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzced implements Callable<zzcdt> {
    private final zzbes zzbnm;
    private final zzazz zzdls;
    private final zzdt zzejl;
    private final Executor zzfhi;
    private final com.google.android.gms.ads.internal.zza zzfvf;
    private final Context zzvf;

    public zzced(Context context, Executor executor, zzdt zzdtVar, zzazz zzazzVar, com.google.android.gms.ads.internal.zza zzaVar, zzbes zzbesVar) {
        this.zzvf = context;
        this.zzfhi = executor;
        this.zzejl = zzdtVar;
        this.zzdls = zzazzVar;
        this.zzfvf = zzaVar;
        this.zzbnm = zzbesVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzcdt call() throws Exception {
        zzcdt zzcdtVar = new zzcdt(this);
        zzcdtVar.zzamp();
        return zzcdtVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Context zza(zzced zzcedVar) {
        return zzcedVar.zzvf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Executor zzb(zzced zzcedVar) {
        return zzcedVar.zzfhi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzdt zzc(zzced zzcedVar) {
        return zzcedVar.zzejl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzazz zzd(zzced zzcedVar) {
        return zzcedVar.zzdls;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ com.google.android.gms.ads.internal.zza zze(zzced zzcedVar) {
        return zzcedVar.zzfvf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzbes zzf(zzced zzcedVar) {
        return zzcedVar.zzbnm;
    }
}
