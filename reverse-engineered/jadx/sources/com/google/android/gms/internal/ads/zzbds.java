package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbds implements Runnable {
    private final /* synthetic */ String zzdxx;
    private final /* synthetic */ String zzegq;
    private final /* synthetic */ long zzegs;
    private final /* synthetic */ zzbdl zzegw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbds(zzbdl zzbdlVar, String str, String str2, long j) {
        this.zzegw = zzbdlVar;
        this.zzdxx = str;
        this.zzegq = str2;
        this.zzegs = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        hashMap.put("src", this.zzdxx);
        hashMap.put("cachedSrc", this.zzegq);
        hashMap.put("totalDuration", Long.toString(this.zzegs));
        this.zzegw.zza("onPrecacheEvent", hashMap);
    }
}
