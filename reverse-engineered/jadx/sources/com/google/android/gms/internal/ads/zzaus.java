package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
final class zzaus {
    private static final Map<String, String> zzdsm;
    private final List<String> zzdsn;
    private final zzaue zzdso;
    private final Context zzvf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaus(Context context, List<String> list, zzaue zzaueVar) {
        this.zzvf = context;
        this.zzdsn = list;
        this.zzdso = zzaueVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<String> zzb(String[] strArr) {
        boolean z;
        boolean z2;
        String valueOf;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Iterator<String> it = this.zzdsn.iterator();
            do {
                z = true;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                String next = it.next();
                if (next.equals(str)) {
                    break;
                }
                valueOf = String.valueOf(next);
            } while (!(valueOf.length() != 0 ? "android.webkit.resource.".concat(valueOf) : new String("android.webkit.resource.")).equals(str));
            z2 = true;
            if (z2) {
                if (zzdsm.containsKey(str)) {
                    com.google.android.gms.ads.internal.zzq.zzkw();
                    if (!zzaxa.zzq(this.zzvf, zzdsm.get(str))) {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(str);
                } else {
                    this.zzdso.zzea(str);
                }
            } else {
                this.zzdso.zzdz(str);
            }
        }
        return arrayList;
    }

    static {
        HashMap hashMap = new HashMap();
        if (PlatformVersion.isAtLeastLollipop()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        zzdsm = hashMap;
    }
}
