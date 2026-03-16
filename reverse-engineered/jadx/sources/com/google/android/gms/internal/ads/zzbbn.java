package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbbn implements Runnable {
    private final /* synthetic */ zzbbk zzeca;
    private final /* synthetic */ boolean zzecd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbn(zzbbk zzbbkVar, boolean z) {
        this.zzeca = zzbbkVar;
        this.zzecd = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzeca.zzd("windowVisibilityChanged", "isVisible", String.valueOf(this.zzecd));
    }
}
