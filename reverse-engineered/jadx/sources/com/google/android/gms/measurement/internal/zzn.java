package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
public final class zzn extends zzkp {
    private String zzb;
    private Set<Integer> zzc;
    private Map<Integer, zzp> zzd;
    private Long zze;
    private Long zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzks zzksVar) {
        super(zzksVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkp
    protected final boolean zze() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x032b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.internal.measurement.zzbr.zza> zza(java.lang.String r53, java.util.List<com.google.android.gms.internal.measurement.zzbr.zzc> r54, java.util.List<com.google.android.gms.internal.measurement.zzbr.zzk> r55, java.lang.Long r56, java.lang.Long r57) {
        /*
            Method dump skipped, instructions count: 2046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzn.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    private final zzp zza(int i) {
        if (this.zzd.containsKey(Integer.valueOf(i))) {
            return this.zzd.get(Integer.valueOf(i));
        }
        zzp zzpVar = new zzp(this, this.zzb, null);
        this.zzd.put(Integer.valueOf(i), zzpVar);
        return zzpVar;
    }

    private final boolean zza(int i, int i2) {
        if (this.zzd.get(Integer.valueOf(i)) == null) {
            return false;
        }
        return zzp.zza(this.zzd.get(Integer.valueOf(i))).get(i2);
    }
}
