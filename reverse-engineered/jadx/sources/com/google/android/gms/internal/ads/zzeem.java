package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzeem {
    private static final Class<?> zzibx = zzbgy();
    private static final zzefc<?, ?> zziby = zzbv(false);
    private static final zzefc<?, ?> zzibz = zzbv(true);
    private static final zzefc<?, ?> zzica = new zzefe();

    public static void zzi(Class<?> cls) {
        Class<?> cls2;
        if (!zzecd.class.isAssignableFrom(cls) && (cls2 = zzibx) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<Double> list, zzefv zzefvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zzg(i, list, z);
    }

    public static void zzb(int i, List<Float> list, zzefv zzefvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zzf(i, list, z);
    }

    public static void zzc(int i, List<Long> list, zzefv zzefvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Long> list, zzefv zzefvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zzd(i, list, z);
    }

    public static void zze(int i, List<Long> list, zzefv zzefvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zzn(i, list, z);
    }

    public static void zzf(int i, List<Long> list, zzefv zzefvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zze(i, list, z);
    }

    public static void zzg(int i, List<Long> list, zzefv zzefvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zzl(i, list, z);
    }

    public static void zzh(int i, List<Integer> list, zzefv zzefvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zza(i, list, z);
    }

    public static void zzi(int i, List<Integer> list, zzefv zzefvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zzj(i, list, z);
    }

    public static void zzj(int i, List<Integer> list, zzefv zzefvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zzm(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zzefv zzefvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zzb(i, list, z);
    }

    public static void zzl(int i, List<Integer> list, zzefv zzefvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zzk(i, list, z);
    }

    public static void zzm(int i, List<Integer> list, zzefv zzefvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zzh(i, list, z);
    }

    public static void zzn(int i, List<Boolean> list, zzefv zzefvVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zzi(i, list, z);
    }

    public static void zza(int i, List<String> list, zzefv zzefvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zza(i, list);
    }

    public static void zzb(int i, List<zzeaq> list, zzefv zzefvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zzb(i, list);
    }

    public static void zza(int i, List<?> list, zzefv zzefvVar, zzeek zzeekVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zza(i, list, zzeekVar);
    }

    public static void zzb(int i, List<?> list, zzefv zzefvVar, zzeek zzeekVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzefvVar.zzb(i, list, zzeekVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzz(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzedc) {
            zzedc zzedcVar = (zzedc) list;
            i = 0;
            while (i2 < size) {
                i += zzebk.zzfl(zzedcVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzebk.zzfl(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzz(list) + (list.size() * zzebk.zzgk(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzaa(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzedc) {
            zzedc zzedcVar = (zzedc) list;
            i = 0;
            while (i2 < size) {
                i += zzebk.zzfm(zzedcVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzebk.zzfm(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaa(list) + (size * zzebk.zzgk(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzab(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzedc) {
            zzedc zzedcVar = (zzedc) list;
            i = 0;
            while (i2 < size) {
                i += zzebk.zzfn(zzedcVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzebk.zzfn(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzab(list) + (size * zzebk.zzgk(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzac(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzece) {
            zzece zzeceVar = (zzece) list;
            i = 0;
            while (i2 < size) {
                i += zzebk.zzgq(zzeceVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzebk.zzgq(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzac(list) + (size * zzebk.zzgk(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzad(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzece) {
            zzece zzeceVar = (zzece) list;
            i = 0;
            while (i2 < size) {
                i += zzebk.zzgl(zzeceVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzebk.zzgl(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzad(list) + (size * zzebk.zzgk(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzae(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzece) {
            zzece zzeceVar = (zzece) list;
            i = 0;
            while (i2 < size) {
                i += zzebk.zzgm(zzeceVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzebk.zzgm(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzae(list) + (size * zzebk.zzgk(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzaf(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzece) {
            zzece zzeceVar = (zzece) list;
            i = 0;
            while (i2 < size) {
                i += zzebk.zzgn(zzeceVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzebk.zzgn(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzaf(list) + (size * zzebk.zzgk(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzag(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzebk.zzai(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzah(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzebk.zzn(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzai(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzebk.zzi(i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<?> list) {
        int zzhs;
        int zzhs2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzgk = zzebk.zzgk(i) * size;
        if (list instanceof zzecv) {
            zzecv zzecvVar = (zzecv) list;
            while (i2 < size) {
                Object zzgy = zzecvVar.zzgy(i2);
                if (zzgy instanceof zzeaq) {
                    zzhs2 = zzebk.zzai((zzeaq) zzgy);
                } else {
                    zzhs2 = zzebk.zzhs((String) zzgy);
                }
                zzgk += zzhs2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzeaq) {
                    zzhs = zzebk.zzai((zzeaq) obj);
                } else {
                    zzhs = zzebk.zzhs((String) obj);
                }
                zzgk += zzhs;
                i2++;
            }
        }
        return zzgk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, Object obj, zzeek zzeekVar) {
        if (obj instanceof zzect) {
            return zzebk.zza(i, (zzect) obj);
        }
        return zzebk.zzb(i, (zzedo) obj, zzeekVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<?> list, zzeek zzeekVar) {
        int zza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzgk = zzebk.zzgk(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzect) {
                zza = zzebk.zza((zzect) obj);
            } else {
                zza = zzebk.zza((zzedo) obj, zzeekVar);
            }
            zzgk += zza;
        }
        return zzgk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<zzeaq> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzgk = size * zzebk.zzgk(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgk += zzebk.zzai(list.get(i2));
        }
        return zzgk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<zzedo> list, zzeek zzeekVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzebk.zzc(i, list.get(i3), zzeekVar);
        }
        return i2;
    }

    public static zzefc<?, ?> zzbgv() {
        return zziby;
    }

    public static zzefc<?, ?> zzbgw() {
        return zzibz;
    }

    public static zzefc<?, ?> zzbgx() {
        return zzica;
    }

    private static zzefc<?, ?> zzbv(boolean z) {
        try {
            Class<?> zzbgz = zzbgz();
            if (zzbgz == null) {
                return null;
            }
            return (zzefc) zzbgz.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzbgy() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzbgz() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzg(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zza(zzedh zzedhVar, T t, T t2, long j) {
        zzefi.zza(t, j, zzedhVar.zze(zzefi.zzp(t, j), zzefi.zzp(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzebv<FT>> void zza(zzebs<FT> zzebsVar, T t, T t2) {
        zzebt<FT> zzai = zzebsVar.zzai(t2);
        if (zzai.zzhut.isEmpty()) {
            return;
        }
        zzebsVar.zzaj(t).zza(zzai);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zza(zzefc<UT, UB> zzefcVar, T t, T t2) {
        zzefcVar.zzh(t, zzefcVar.zzj(zzefcVar.zzay(t), zzefcVar.zzay(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, List<Integer> list, zzech zzechVar, UB ub, zzefc<UT, UB> zzefcVar) {
        if (zzechVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzechVar.zzf(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(i, intValue, ub, zzefcVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzechVar.zzf(intValue2)) {
                    ub = (UB) zza(i, intValue2, ub, zzefcVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, int i2, UB ub, zzefc<UT, UB> zzefcVar) {
        if (ub == null) {
            ub = zzefcVar.zzbhg();
        }
        zzefcVar.zza((zzefc<UT, UB>) ub, i, i2);
        return ub;
    }
}
