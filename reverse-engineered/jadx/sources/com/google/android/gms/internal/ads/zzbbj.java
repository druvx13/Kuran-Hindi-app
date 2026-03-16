package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzbbj implements Runnable {
    private final zzbbi zzebi;

    private zzbbj(zzbbi zzbbiVar) {
        this.zzebi = zzbbiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzbbi zzbbiVar) {
        return new zzbbj(zzbbiVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzebi.stop();
    }
}
