package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzebn implements zzefv {
    private final zzebk zzhtl;

    public static zzebn zza(zzebk zzebkVar) {
        if (zzebkVar.zzhuj != null) {
            return zzebkVar.zzhuj;
        }
        return new zzebn(zzebkVar);
    }

    private zzebn(zzebk zzebkVar) {
        zzebk zzebkVar2 = (zzebk) zzecg.zza(zzebkVar, "output");
        this.zzhtl = zzebkVar2;
        zzebkVar2.zzhuj = this;
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final int zzbeb() {
        return zzecd.zzf.zzhym;
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzal(int i, int i2) throws IOException {
        this.zzhtl.zzae(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzp(int i, long j) throws IOException {
        this.zzhtl.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzq(int i, long j) throws IOException {
        this.zzhtl.zzj(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zza(int i, float f) throws IOException {
        this.zzhtl.zza(i, f);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzb(int i, double d) throws IOException {
        this.zzhtl.zzb(i, d);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzam(int i, int i2) throws IOException {
        this.zzhtl.zzab(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzh(int i, long j) throws IOException {
        this.zzhtl.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzab(int i, int i2) throws IOException {
        this.zzhtl.zzab(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzj(int i, long j) throws IOException {
        this.zzhtl.zzj(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzae(int i, int i2) throws IOException {
        this.zzhtl.zzae(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzh(int i, boolean z) throws IOException {
        this.zzhtl.zzh(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzk(int i, String str) throws IOException {
        this.zzhtl.zzk(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zza(int i, zzeaq zzeaqVar) throws IOException {
        this.zzhtl.zza(i, zzeaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzac(int i, int i2) throws IOException {
        this.zzhtl.zzac(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzad(int i, int i2) throws IOException {
        this.zzhtl.zzad(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzi(int i, long j) throws IOException {
        this.zzhtl.zzi(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zza(int i, Object obj, zzeek zzeekVar) throws IOException {
        this.zzhtl.zza(i, (zzedo) obj, zzeekVar);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzb(int i, Object obj, zzeek zzeekVar) throws IOException {
        zzebk zzebkVar = this.zzhtl;
        zzebkVar.writeTag(i, 3);
        zzeekVar.zza((zzedo) obj, zzebkVar.zzhuj);
        zzebkVar.writeTag(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzgt(int i) throws IOException {
        this.zzhtl.writeTag(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzgu(int i) throws IOException {
        this.zzhtl.writeTag(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzc(int i, Object obj) throws IOException {
        if (obj instanceof zzeaq) {
            this.zzhtl.zzb(i, (zzeaq) obj);
        } else {
            this.zzhtl.zza(i, (zzedo) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zza(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhtl.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzebk.zzgl(list.get(i4).intValue());
            }
            this.zzhtl.zzgh(i3);
            while (i2 < list.size()) {
                this.zzhtl.zzgg(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhtl.zzab(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhtl.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzebk.zzgo(list.get(i4).intValue());
            }
            this.zzhtl.zzgh(i3);
            while (i2 < list.size()) {
                this.zzhtl.zzgj(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhtl.zzae(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzc(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhtl.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzebk.zzfl(list.get(i4).longValue());
            }
            this.zzhtl.zzgh(i3);
            while (i2 < list.size()) {
                this.zzhtl.zzfi(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhtl.zzh(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzd(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhtl.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzebk.zzfm(list.get(i4).longValue());
            }
            this.zzhtl.zzgh(i3);
            while (i2 < list.size()) {
                this.zzhtl.zzfi(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhtl.zzh(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhtl.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzebk.zzfo(list.get(i4).longValue());
            }
            this.zzhtl.zzgh(i3);
            while (i2 < list.size()) {
                this.zzhtl.zzfk(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhtl.zzj(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhtl.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzebk.zzg(list.get(i4).floatValue());
            }
            this.zzhtl.zzgh(i3);
            while (i2 < list.size()) {
                this.zzhtl.zzf(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhtl.zza(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhtl.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzebk.zzc(list.get(i4).doubleValue());
            }
            this.zzhtl.zzgh(i3);
            while (i2 < list.size()) {
                this.zzhtl.zzb(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhtl.zzb(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhtl.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzebk.zzgq(list.get(i4).intValue());
            }
            this.zzhtl.zzgh(i3);
            while (i2 < list.size()) {
                this.zzhtl.zzgg(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhtl.zzab(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhtl.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzebk.zzbt(list.get(i4).booleanValue());
            }
            this.zzhtl.zzgh(i3);
            while (i2 < list.size()) {
                this.zzhtl.zzbs(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhtl.zzh(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zza(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzecv) {
            zzecv zzecvVar = (zzecv) list;
            while (i2 < list.size()) {
                Object zzgy = zzecvVar.zzgy(i2);
                if (zzgy instanceof String) {
                    this.zzhtl.zzk(i, (String) zzgy);
                } else {
                    this.zzhtl.zza(i, (zzeaq) zzgy);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhtl.zzk(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzb(int i, List<zzeaq> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zzhtl.zza(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhtl.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzebk.zzgm(list.get(i4).intValue());
            }
            this.zzhtl.zzgh(i3);
            while (i2 < list.size()) {
                this.zzhtl.zzgh(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhtl.zzac(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhtl.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzebk.zzgp(list.get(i4).intValue());
            }
            this.zzhtl.zzgh(i3);
            while (i2 < list.size()) {
                this.zzhtl.zzgj(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhtl.zzae(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhtl.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzebk.zzfp(list.get(i4).longValue());
            }
            this.zzhtl.zzgh(i3);
            while (i2 < list.size()) {
                this.zzhtl.zzfk(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhtl.zzj(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhtl.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzebk.zzgn(list.get(i4).intValue());
            }
            this.zzhtl.zzgh(i3);
            while (i2 < list.size()) {
                this.zzhtl.zzgi(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhtl.zzad(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzhtl.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzebk.zzfn(list.get(i4).longValue());
            }
            this.zzhtl.zzgh(i3);
            while (i2 < list.size()) {
                this.zzhtl.zzfj(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzhtl.zzi(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zza(int i, List<?> list, zzeek zzeekVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzeekVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final void zzb(int i, List<?> list, zzeek zzeekVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzeekVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final <K, V> void zza(int i, zzedf<K, V> zzedfVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zzhtl.writeTag(i, 2);
            this.zzhtl.zzgh(zzedg.zza(zzedfVar, entry.getKey(), entry.getValue()));
            zzedg.zza(this.zzhtl, zzedfVar, entry.getKey(), entry.getValue());
        }
    }
}
