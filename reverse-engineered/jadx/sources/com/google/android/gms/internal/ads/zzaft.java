package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzaft implements zzaga<zzbek> {
    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ void zza(zzbek zzbekVar, Map map) {
        zzbek zzbekVar2 = zzbekVar;
        if (zzbekVar2.zzabx() != null) {
            zzbekVar2.zzabx().zzms();
        }
        com.google.android.gms.ads.internal.overlay.zzc zzabf = zzbekVar2.zzabf();
        if (zzabf != null) {
            zzabf.close();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzc zzabg = zzbekVar2.zzabg();
        if (zzabg != null) {
            zzabg.close();
        } else {
            zzawr.zzfc("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
