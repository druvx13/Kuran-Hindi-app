package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdia {
    private final zzazz zzbml;
    private final zzawd zzbnp;
    private final Map<String, zzdic> zzgvq = new HashMap();
    private final Context zzzo;

    public zzdia(Context context, zzazz zzazzVar, zzawd zzawdVar) {
        this.zzzo = context;
        this.zzbml = zzazzVar;
        this.zzbnp = zzawdVar;
    }

    public final zzdic zzgt(String str) {
        if (str == null) {
            return zzasi();
        }
        if (this.zzgvq.containsKey(str)) {
            return this.zzgvq.get(str);
        }
        zzdic zzgu = zzgu(str);
        this.zzgvq.put(str, zzgu);
        return zzgu;
    }

    private final zzdic zzasi() {
        return new zzdic(this.zzzo, this.zzbnp.zzwb(), this.zzbnp.zzwd());
    }

    private final zzdic zzgu(String str) {
        zzase zzz = zzase.zzz(this.zzzo);
        try {
            zzz.setAppPackageName(str);
            zzaww zzawwVar = new zzaww();
            zzawwVar.zza(this.zzzo, str, false);
            zzawx zzawxVar = new zzawx(this.zzbnp.zzwb(), zzawwVar);
            return new zzdic(zzz, zzawxVar, new zzawo(zzazm.zzyf(), zzawxVar));
        } catch (PackageManager.NameNotFoundException unused) {
            return zzasi();
        }
    }
}
