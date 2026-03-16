package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaan {
    private final Map<String, zzaak> zzcuz = new HashMap();
    private final zzaam zzcva;

    public zzaan(zzaam zzaamVar) {
        this.zzcva = zzaamVar;
    }

    public final void zza(String str, zzaak zzaakVar) {
        this.zzcuz.put(str, zzaakVar);
    }

    public final void zza(String str, String str2, long j) {
        zzaam zzaamVar = this.zzcva;
        zzaak zzaakVar = this.zzcuz.get(str2);
        String[] strArr = {str};
        if (zzaamVar != null && zzaakVar != null) {
            zzaamVar.zza(zzaakVar, j, strArr);
        }
        Map<String, zzaak> map = this.zzcuz;
        zzaam zzaamVar2 = this.zzcva;
        map.put(str, zzaamVar2 == null ? null : zzaamVar2.zzex(j));
    }

    public final zzaam zzrn() {
        return this.zzcva;
    }
}
