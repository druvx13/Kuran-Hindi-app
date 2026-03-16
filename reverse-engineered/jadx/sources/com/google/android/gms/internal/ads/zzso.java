package com.google.android.gms.internal.ads;

import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzso extends zzbaj<InputStream> {
    private final /* synthetic */ zzsl zzbsw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzso(zzsl zzslVar) {
        this.zzbsw = zzslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbaj, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.zzbsw.disconnect();
        return super.cancel(z);
    }
}
