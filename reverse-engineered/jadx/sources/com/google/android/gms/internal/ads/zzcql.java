package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcql<T> implements zzdqx<T> {
    private final /* synthetic */ String zzggo;
    private final /* synthetic */ long zzggp;
    private final /* synthetic */ zzdgo zzggq;
    private final /* synthetic */ zzdgq zzggr;
    private final /* synthetic */ zzcqi zzggs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcql(zzcqi zzcqiVar, String str, long j, zzdgo zzdgoVar, zzdgq zzdgqVar) {
        this.zzggs = zzcqiVar;
        this.zzggo = str;
        this.zzggp = j;
        this.zzggq = zzdgoVar;
        this.zzggr = zzdgqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void onSuccess(T t) {
        Clock clock;
        boolean z;
        zzcqk zzcqkVar;
        clock = this.zzggs.zzbnt;
        long elapsedRealtime = clock.elapsedRealtime();
        this.zzggs.zza(this.zzggo, 0, elapsedRealtime - this.zzggp, this.zzggq.zzguf);
        z = this.zzggs.zzggn;
        if (z) {
            zzcqkVar = this.zzggs.zzggl;
            zzcqkVar.zza(this.zzggr, this.zzggq, 0, null, elapsedRealtime - this.zzggp);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        Clock clock;
        boolean z;
        zzcqk zzcqkVar;
        clock = this.zzggs.zzbnt;
        long elapsedRealtime = clock.elapsedRealtime();
        int i = 6;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzcpy) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof zzdhk) {
            i = 5;
        } else if ((th instanceof zzcjk) && ((zzcjk) th).getErrorCode() == 3) {
            i = 1;
        }
        this.zzggs.zza(this.zzggo, i, elapsedRealtime - this.zzggp, this.zzggq.zzguf);
        z = this.zzggs.zzggn;
        if (z) {
            zzcqkVar = this.zzggs.zzggl;
            zzcqkVar.zza(this.zzggr, this.zzggq, i, th instanceof zzcnn ? (zzcnn) th : null, elapsedRealtime - this.zzggp);
        }
    }
}
