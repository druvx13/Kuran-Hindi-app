package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzbzo implements Runnable {
    private final zzcaf zzfrm;

    private zzbzo(zzcaf zzcafVar) {
        this.zzfrm = zzcafVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzcaf zzcafVar) {
        return new zzbzo(zzcafVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzfrm.zzakn();
    }
}
