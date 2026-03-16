package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbdo implements Runnable {
    private final /* synthetic */ String zzdxx;
    private final /* synthetic */ String zzegq;
    private final /* synthetic */ boolean zzegt = false;
    private final /* synthetic */ zzbdl zzegw;
    private final /* synthetic */ int zzegx;
    private final /* synthetic */ int zzegy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdo(zzbdl zzbdlVar, String str, String str2, int i, int i2, boolean z) {
        this.zzegw = zzbdlVar;
        this.zzdxx = str;
        this.zzegq = str2;
        this.zzegx = i;
        this.zzegy = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.zzdxx);
        hashMap.put("cachedSrc", this.zzegq);
        hashMap.put("bytesLoaded", Integer.toString(this.zzegx));
        hashMap.put("totalBytes", Integer.toString(this.zzegy));
        hashMap.put("cacheReady", this.zzegt ? "1" : "0");
        this.zzegw.zza("onPrecacheEvent", hashMap);
    }
}
