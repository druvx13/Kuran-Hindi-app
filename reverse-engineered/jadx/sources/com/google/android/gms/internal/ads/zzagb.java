package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzagb implements zzaga<zzbek> {
    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ void zza(zzbek zzbekVar, Map map) {
        zzbek zzbekVar2 = zzbekVar;
        com.google.android.gms.ads.internal.zzq.zzkw();
        DisplayMetrics zza = zzaxa.zza((WindowManager) zzbekVar2.getContext().getSystemService("window"));
        int i = zza.widthPixels;
        int i2 = zza.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzbekVar2).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzbekVar2.zza("locationReady", hashMap);
        zzawr.zzfc("GET LOCATION COMPILED");
    }
}
