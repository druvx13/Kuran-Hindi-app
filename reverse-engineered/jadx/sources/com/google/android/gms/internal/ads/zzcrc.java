package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcrc implements Runnable {
    private final zzcfo zzgfr;

    private zzcrc(zzcfo zzcfoVar) {
        this.zzgfr = zzcfoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzcfo zzcfoVar) {
        return new zzcrc(zzcfoVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzgfr.zzamy();
    }
}
