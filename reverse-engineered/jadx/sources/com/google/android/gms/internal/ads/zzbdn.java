package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbdn implements Runnable {
    private final /* synthetic */ String zzdxx;
    private final /* synthetic */ String zzegq;
    private final /* synthetic */ long zzegr;
    private final /* synthetic */ long zzegs;
    private final /* synthetic */ boolean zzegt;
    private final /* synthetic */ int zzegu;
    private final /* synthetic */ int zzegv;
    private final /* synthetic */ zzbdl zzegw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdn(zzbdl zzbdlVar, String str, String str2, long j, long j2, boolean z, int i, int i2) {
        this.zzegw = zzbdlVar;
        this.zzdxx = str;
        this.zzegq = str2;
        this.zzegr = j;
        this.zzegs = j2;
        this.zzegt = z;
        this.zzegu = i;
        this.zzegv = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.zzdxx);
        hashMap.put("cachedSrc", this.zzegq);
        hashMap.put("bufferedDuration", Long.toString(this.zzegr));
        hashMap.put("totalDuration", Long.toString(this.zzegs));
        hashMap.put("cacheReady", this.zzegt ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.zzegu));
        hashMap.put("playerPreparedCount", Integer.toString(this.zzegv));
        this.zzegw.zza("onPrecacheEvent", hashMap);
    }
}
