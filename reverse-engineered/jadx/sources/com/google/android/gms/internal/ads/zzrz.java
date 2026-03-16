package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzrz implements zzqq {
    private final /* synthetic */ zzrx zzbsk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrz(zzrx zzrxVar) {
        this.zzbsk = zzrxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    public final void zzp(boolean z) {
        if (!z) {
            this.zzbsk.disconnect();
        } else {
            this.zzbsk.connect();
        }
    }
}
