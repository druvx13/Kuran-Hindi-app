package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdqe implements Runnable {
    private final /* synthetic */ zzdqd zzhhd;
    private final /* synthetic */ zzdot zzhhk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqe(zzdqd zzdqdVar, zzdot zzdotVar) {
        this.zzhhd = zzdqdVar;
        this.zzhhk = zzdotVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzhhd.zza(this.zzhhk);
    }
}
