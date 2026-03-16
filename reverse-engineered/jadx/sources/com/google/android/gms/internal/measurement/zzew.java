package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
/* loaded from: classes.dex */
public final class zzew<T extends zzey<T>> {
    private static final zzew zzd = new zzew(true);
    final zzhi<T, Object> zza;
    private boolean zzb;
    private boolean zzc;

    private zzew() {
        this.zza = zzhi.zza(16);
    }

    private zzew(boolean z) {
        this(zzhi.zza(0));
        zzb();
    }

    private zzew(zzhi<T, Object> zzhiVar) {
        this.zza = zzhiVar;
        zzb();
    }

    public static <T extends zzey<T>> zzew<T> zza() {
        return zzd;
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        this.zza.zza();
        this.zzb = true;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzew) {
            return this.zza.equals(((zzew) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zzc) {
            return new zzfu(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> zze() {
        if (this.zzc) {
            return new zzfu(this.zza.zze().iterator());
        }
        return this.zza.zze().iterator();
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        if (obj instanceof zzfp) {
            zzfp zzfpVar = (zzfp) obj;
            return zzfp.zza();
        }
        return obj;
    }

    private final void zzb(T t, Object obj) {
        if (t.zzd()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(t.zzb(), obj2);
            }
            obj = arrayList;
        } else {
            zza(t.zzb(), obj);
        }
        if (obj instanceof zzfp) {
            this.zzc = true;
        }
        this.zza.zza((zzhi<T, Object>) t, (T) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzfi) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzfp) == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.measurement.zzim r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.zzff.zza(r3)
            int[] r0 = com.google.android.gms.internal.measurement.zzev.zza
            com.google.android.gms.internal.measurement.zzip r2 = r2.zza()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L28;
                case 8: goto L1f;
                case 9: goto L16;
                default: goto L14;
            }
        L14:
            r0 = 0
            goto L42
        L16:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzgo
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzfp
            if (r2 == 0) goto L14
            goto L42
        L1f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzfi
            if (r2 == 0) goto L14
            goto L42
        L28:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzdu
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L14
            goto L42
        L31:
            boolean r0 = r3 instanceof java.lang.String
            goto L42
        L34:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r0 = r3 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L42
        L40:
            boolean r0 = r3 instanceof java.lang.Integer
        L42:
            if (r0 == 0) goto L45
            return
        L45:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L4e
        L4d:
            throw r2
        L4e:
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzew.zza(com.google.android.gms.internal.measurement.zzim, java.lang.Object):void");
    }

    public final boolean zzf() {
        for (int i = 0; i < this.zza.zzc(); i++) {
            if (!zza((Map.Entry) this.zza.zzb(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.zza.zzd()) {
            if (!zza((Map.Entry) entry)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzey<T>> boolean zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() == zzip.MESSAGE) {
            if (key.zzd()) {
                for (zzgo zzgoVar : (List) entry.getValue()) {
                    if (!zzgoVar.zzbl()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzgo) {
                    if (!((zzgo) value).zzbl()) {
                        return false;
                    }
                } else if (value instanceof zzfp) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzew<T> zzewVar) {
        for (int i = 0; i < zzewVar.zza.zzc(); i++) {
            zzb(zzewVar.zza.zzb(i));
        }
        for (Map.Entry<T, Object> entry : zzewVar.zza.zzd()) {
            zzb(entry);
        }
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzgt) {
            return ((zzgt) obj).zza();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        zzgo zzu;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzfp) {
            zzfp zzfpVar = (zzfp) value;
            value = zzfp.zza();
        }
        if (key.zzd()) {
            Object zza = zza((zzew<T>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) zza).add(zza(obj));
            }
            this.zza.zza((zzhi<T, Object>) key, (T) zza);
        } else if (key.zzc() == zzip.MESSAGE) {
            Object zza2 = zza((zzew<T>) key);
            if (zza2 == null) {
                this.zza.zza((zzhi<T, Object>) key, (T) zza(value));
                return;
            }
            if (zza2 instanceof zzgt) {
                zzu = key.zza((zzgt) zza2, (zzgt) value);
            } else {
                zzu = key.zza(((zzgo) zza2).zzbr(), (zzgo) value).zzu();
            }
            this.zza.zza((zzhi<T, Object>) key, (T) zzu);
        } else {
            this.zza.zza((zzhi<T, Object>) key, (T) zza(value));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzen zzenVar, zzim zzimVar, int i, Object obj) throws IOException {
        if (zzimVar == zzim.zzj) {
            zzgo zzgoVar = (zzgo) obj;
            zzff.zza(zzgoVar);
            zzenVar.zza(i, 3);
            zzgoVar.zza(zzenVar);
            zzenVar.zza(i, 4);
            return;
        }
        zzenVar.zza(i, zzimVar.zzb());
        switch (zzev.zzb[zzimVar.ordinal()]) {
            case 1:
                zzenVar.zza(((Double) obj).doubleValue());
                return;
            case 2:
                zzenVar.zza(((Float) obj).floatValue());
                return;
            case 3:
                zzenVar.zza(((Long) obj).longValue());
                return;
            case 4:
                zzenVar.zza(((Long) obj).longValue());
                return;
            case 5:
                zzenVar.zza(((Integer) obj).intValue());
                return;
            case 6:
                zzenVar.zzc(((Long) obj).longValue());
                return;
            case 7:
                zzenVar.zzd(((Integer) obj).intValue());
                return;
            case 8:
                zzenVar.zza(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzgo) obj).zza(zzenVar);
                return;
            case 10:
                zzenVar.zza((zzgo) obj);
                return;
            case 11:
                if (obj instanceof zzdu) {
                    zzenVar.zza((zzdu) obj);
                    return;
                } else {
                    zzenVar.zza((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzdu) {
                    zzenVar.zza((zzdu) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzenVar.zzb(bArr, 0, bArr.length);
                return;
            case 13:
                zzenVar.zzb(((Integer) obj).intValue());
                return;
            case 14:
                zzenVar.zzd(((Integer) obj).intValue());
                return;
            case 15:
                zzenVar.zzc(((Long) obj).longValue());
                return;
            case 16:
                zzenVar.zzc(((Integer) obj).intValue());
                return;
            case 17:
                zzenVar.zzb(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzfi) {
                    zzenVar.zza(((zzfi) obj).zza());
                    return;
                } else {
                    zzenVar.zza(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzg() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzc(); i2++) {
            i += zzc(this.zza.zzb(i2));
        }
        for (Map.Entry<T, Object> entry : this.zza.zzd()) {
            i += zzc(entry);
        }
        return i;
    }

    private static int zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzip.MESSAGE && !key.zzd() && !key.zze()) {
            if (value instanceof zzfp) {
                return zzen.zzb(entry.getKey().zza(), (zzfp) value);
            }
            return zzen.zzb(entry.getKey().zza(), (zzgo) value);
        }
        return zza((zzey<?>) key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzim zzimVar, int i, Object obj) {
        int zze = zzen.zze(i);
        if (zzimVar == zzim.zzj) {
            zzff.zza((zzgo) obj);
            zze <<= 1;
        }
        return zze + zzb(zzimVar, obj);
    }

    private static int zzb(zzim zzimVar, Object obj) {
        switch (zzev.zzb[zzimVar.ordinal()]) {
            case 1:
                return zzen.zzb(((Double) obj).doubleValue());
            case 2:
                return zzen.zzb(((Float) obj).floatValue());
            case 3:
                return zzen.zzd(((Long) obj).longValue());
            case 4:
                return zzen.zze(((Long) obj).longValue());
            case 5:
                return zzen.zzf(((Integer) obj).intValue());
            case 6:
                return zzen.zzg(((Long) obj).longValue());
            case 7:
                return zzen.zzi(((Integer) obj).intValue());
            case 8:
                return zzen.zzb(((Boolean) obj).booleanValue());
            case 9:
                return zzen.zzc((zzgo) obj);
            case 10:
                if (obj instanceof zzfp) {
                    return zzen.zza((zzfp) obj);
                }
                return zzen.zzb((zzgo) obj);
            case 11:
                if (obj instanceof zzdu) {
                    return zzen.zzb((zzdu) obj);
                }
                return zzen.zzb((String) obj);
            case 12:
                if (obj instanceof zzdu) {
                    return zzen.zzb((zzdu) obj);
                }
                return zzen.zzb((byte[]) obj);
            case 13:
                return zzen.zzg(((Integer) obj).intValue());
            case 14:
                return zzen.zzj(((Integer) obj).intValue());
            case 15:
                return zzen.zzh(((Long) obj).longValue());
            case 16:
                return zzen.zzh(((Integer) obj).intValue());
            case 17:
                return zzen.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzfi) {
                    return zzen.zzk(((zzfi) obj).zza());
                }
                return zzen.zzk(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zza(zzey<?> zzeyVar, Object obj) {
        zzim zzb = zzeyVar.zzb();
        int zza = zzeyVar.zza();
        if (zzeyVar.zzd()) {
            int i = 0;
            if (zzeyVar.zze()) {
                for (Object obj2 : (List) obj) {
                    i += zzb(zzb, obj2);
                }
                return zzen.zze(zza) + i + zzen.zzl(i);
            }
            for (Object obj3 : (List) obj) {
                i += zza(zzb, zza, obj3);
            }
            return i;
        }
        return zza(zzb, zza, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzew zzewVar = new zzew();
        for (int i = 0; i < this.zza.zzc(); i++) {
            Map.Entry<T, Object> zzb = this.zza.zzb(i);
            zzewVar.zzb((zzew) zzb.getKey(), zzb.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzd()) {
            zzewVar.zzb((zzew) entry.getKey(), entry.getValue());
        }
        zzewVar.zzc = this.zzc;
        return zzewVar;
    }
}
