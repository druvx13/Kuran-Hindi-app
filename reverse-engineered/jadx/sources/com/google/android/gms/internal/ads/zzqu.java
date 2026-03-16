package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzqu implements ValueCallback<String> {
    private final /* synthetic */ zzqr zzbrg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqu(zzqr zzqrVar) {
        this.zzbrg = zzqrVar;
    }

    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        this.zzbrg.zzbrc.zza(this.zzbrg.zzbqz, this.zzbrg.zzbra, str, this.zzbrg.zzbrb);
    }
}
