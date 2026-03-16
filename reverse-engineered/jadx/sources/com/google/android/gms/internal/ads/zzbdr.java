package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbdr implements Runnable {
    private final /* synthetic */ String val$message;
    private final /* synthetic */ String zzdxx;
    private final /* synthetic */ String zzegq;
    private final /* synthetic */ zzbdl zzegw;
    private final /* synthetic */ String zzegz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdr(zzbdl zzbdlVar, String str, String str2, String str3, String str4) {
        this.zzegw = zzbdlVar;
        this.zzdxx = str;
        this.zzegq = str2;
        this.zzegz = str3;
        this.val$message = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String zzfn;
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
        hashMap.put("src", this.zzdxx);
        if (!TextUtils.isEmpty(this.zzegq)) {
            hashMap.put("cachedSrc", this.zzegq);
        }
        zzbdl zzbdlVar = this.zzegw;
        zzfn = zzbdl.zzfn(this.zzegz);
        hashMap.put("type", zzfn);
        hashMap.put("reason", this.zzegz);
        if (!TextUtils.isEmpty(this.val$message)) {
            hashMap.put("message", this.val$message);
        }
        this.zzegw.zza("onPrecacheEvent", hashMap);
    }
}
