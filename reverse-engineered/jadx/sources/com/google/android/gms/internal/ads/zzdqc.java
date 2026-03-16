package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdqc implements Runnable {
    private final /* synthetic */ zzdri zzhhb;
    private final /* synthetic */ int zzhhc;
    private final /* synthetic */ zzdqd zzhhd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqc(zzdqd zzdqdVar, zzdri zzdriVar, int i) {
        this.zzhhd = zzdqdVar;
        this.zzhhb = zzdriVar;
        this.zzhhc = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.zzhhb.isCancelled()) {
                zzdqd.zza(this.zzhhd, (zzdot) null);
                this.zzhhd.cancel(false);
            } else {
                this.zzhhd.zza(this.zzhhc, this.zzhhb);
            }
        } finally {
            this.zzhhd.zza((zzdot) null);
        }
    }
}
