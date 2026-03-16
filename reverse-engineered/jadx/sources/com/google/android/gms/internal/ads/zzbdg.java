package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbdg implements zzbdt {
    @Override // com.google.android.gms.internal.ads.zzbdt
    public final zzbdl zza(zzbbx zzbbxVar, int i, String str, zzbby zzbbyVar) {
        if (i > 0) {
            int zzaaj = zzbcu.zzaaj();
            if (zzaaj < zzbbyVar.zzedy) {
                return new zzbea(zzbbxVar, zzbbyVar);
            }
            if (zzaaj < zzbbyVar.zzeds) {
                return new zzbdx(zzbbxVar, zzbbyVar);
            }
            return new zzbdv(zzbbxVar);
        }
        return new zzbdw(zzbbxVar);
    }
}
