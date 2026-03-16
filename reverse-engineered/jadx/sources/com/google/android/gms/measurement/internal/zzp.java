package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzmv;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
public final class zzp {
    private String zza;
    private boolean zzb;
    private zzbr.zzi zzc;
    private BitSet zzd;
    private BitSet zze;
    private Map<Integer, Long> zzf;
    private Map<Integer, List<Long>> zzg;
    private final /* synthetic */ zzn zzh;

    private zzp(zzn zznVar, String str) {
        this.zzh = zznVar;
        this.zza = str;
        this.zzb = true;
        this.zzd = new BitSet();
        this.zze = new BitSet();
        this.zzf = new ArrayMap();
        this.zzg = new ArrayMap();
    }

    private zzp(zzn zznVar, String str, zzbr.zzi zziVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.zzh = zznVar;
        this.zza = str;
        this.zzd = bitSet;
        this.zze = bitSet2;
        this.zzf = map;
        this.zzg = new ArrayMap();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.zzg.put(num, arrayList);
            }
        }
        this.zzb = false;
        this.zzc = zziVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzu zzuVar) {
        int zza = zzuVar.zza();
        if (zzuVar.zzc != null) {
            this.zze.set(zza, zzuVar.zzc.booleanValue());
        }
        if (zzuVar.zzd != null) {
            this.zzd.set(zza, zzuVar.zzd.booleanValue());
        }
        if (zzuVar.zze != null) {
            Long l = this.zzf.get(Integer.valueOf(zza));
            long longValue = zzuVar.zze.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.zzf.put(Integer.valueOf(zza), Long.valueOf(longValue));
            }
        }
        if (zzuVar.zzf != null) {
            List<Long> list = this.zzg.get(Integer.valueOf(zza));
            if (list == null) {
                list = new ArrayList<>();
                this.zzg.put(Integer.valueOf(zza), list);
            }
            if (zzmv.zzb() && this.zzh.zzt().zzd(this.zza, zzap.zzbt) && zzuVar.zzb()) {
                list.clear();
            }
            if (com.google.android.gms.internal.measurement.zzkg.zzb() && this.zzh.zzt().zzd(this.zza, zzap.zzbx) && zzuVar.zzc()) {
                list.clear();
            }
            if (com.google.android.gms.internal.measurement.zzkg.zzb() && this.zzh.zzt().zzd(this.zza, zzap.zzbx)) {
                long longValue2 = zzuVar.zzf.longValue() / 1000;
                if (list.contains(Long.valueOf(longValue2))) {
                    return;
                }
                list.add(Long.valueOf(longValue2));
                return;
            }
            list.add(Long.valueOf(zzuVar.zzf.longValue() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ee, code lost:
        if (r17.zzh.zzt().zzd(r17.zza, com.google.android.gms.measurement.internal.zzap.zzbt) == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzbr.zza zza(int r18, java.util.List<java.lang.Integer> r19) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzp.zza(int, java.util.List):com.google.android.gms.internal.measurement.zzbr$zza");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzp(zzn zznVar, String str, zzbr.zzi zziVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzq zzqVar) {
        this(zznVar, str, zziVar, bitSet, bitSet2, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzp(zzn zznVar, String str, zzq zzqVar) {
        this(zznVar, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ BitSet zza(zzp zzpVar) {
        return zzpVar.zzd;
    }
}
