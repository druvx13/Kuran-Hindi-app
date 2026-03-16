package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbbp extends zzbbh {
    @Override // com.google.android.gms.internal.ads.zzbbh
    public final zzbbi zza(Context context, zzbbx zzbbxVar, int i, boolean z, zzaam zzaamVar, zzbby zzbbyVar) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) {
            zzbca zzbcaVar = new zzbca(context, zzbbxVar.zzzk(), zzbbxVar.getRequestId(), zzaamVar, zzbbxVar.zzzg());
            if (i == 2) {
                return new zzbce(context, zzbcaVar, zzbbxVar, z, zza(zzbbxVar), zzbbyVar);
            }
            return new zzbav(context, z, zza(zzbbxVar), zzbbyVar, new zzbca(context, zzbbxVar.zzzk(), zzbbxVar.getRequestId(), zzaamVar, zzbbxVar.zzzg()));
        }
        return null;
    }
}
