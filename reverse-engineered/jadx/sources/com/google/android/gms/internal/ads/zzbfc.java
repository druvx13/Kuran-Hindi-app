package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbfc implements zzaga<zzbek> {
    private final /* synthetic */ zzbfa zzekt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfc(zzbfa zzbfaVar) {
        this.zzekt = zzbfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ void zza(zzbek zzbekVar, Map map) {
        int i;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zzekt) {
                    i = this.zzekt.zzekk;
                    if (i != parseInt) {
                        this.zzekt.zzekk = parseInt;
                        this.zzekt.requestLayout();
                    }
                }
            } catch (Exception e) {
                zzawr.zzd("Exception occurred while getting webview content height", e);
            }
        }
    }
}
