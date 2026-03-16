package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcrb implements zzcnk<zzdhq, zzcos> {
    private final zzcfz zzgac;
    private final Map<String, zzcnl<zzdhq, zzcos>> zzgha = new HashMap();

    public zzcrb(zzcfz zzcfzVar) {
        this.zzgac = zzcfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final zzcnl<zzdhq, zzcos> zzf(String str, JSONObject jSONObject) throws zzdhk {
        synchronized (this) {
            zzcnl<zzdhq, zzcos> zzcnlVar = this.zzgha.get(str);
            if (zzcnlVar == null) {
                zzdhq zzd = this.zzgac.zzd(str, jSONObject);
                if (zzd == null) {
                    return null;
                }
                zzcnlVar = new zzcnl<>(zzd, new zzcos(), str);
                this.zzgha.put(str, zzcnlVar);
            }
            return zzcnlVar;
        }
    }
}
