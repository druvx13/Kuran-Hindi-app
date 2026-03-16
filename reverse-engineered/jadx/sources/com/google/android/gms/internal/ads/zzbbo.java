package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbbo implements Runnable {
    private final /* synthetic */ zzbbk zzeca;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbo(zzbbk zzbbkVar) {
        this.zzeca = zzbbkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzeca.zzd("surfaceDestroyed", new String[0]);
    }
}
