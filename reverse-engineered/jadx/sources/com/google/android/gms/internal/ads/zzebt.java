package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzebt<T extends zzebv<T>> {
    private static final zzebt zzhuw = new zzebt(true);
    final zzeel<T, Object> zzhut;
    private boolean zzhuu;
    private boolean zzhuv;

    private zzebt() {
        this.zzhut = zzeel.zzhi(16);
    }

    private zzebt(boolean z) {
        this(zzeel.zzhi(0));
        zzbcj();
    }

    private zzebt(zzeel<T, Object> zzeelVar) {
        this.zzhut = zzeelVar;
        zzbcj();
    }

    public static <T extends zzebv<T>> zzebt<T> zzbee() {
        return zzhuw;
    }

    public final void zzbcj() {
        if (this.zzhuu) {
            return;
        }
        this.zzhut.zzbcj();
        this.zzhuu = true;
    }

    public final boolean isImmutable() {
        return this.zzhuu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzebt) {
            return this.zzhut.equals(((zzebt) obj).zzhut);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzhut.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> iterator() {
        if (this.zzhuv) {
            return new zzecu(this.zzhut.entrySet().iterator());
        }
        return this.zzhut.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> descendingIterator() {
        if (this.zzhuv) {
            return new zzecu(this.zzhut.zzbgs().iterator());
        }
        return this.zzhut.zzbgs().iterator();
    }

    private final Object zza(T t) {
        Object obj = this.zzhut.get(t);
        if (obj instanceof zzecp) {
            zzecp zzecpVar = (zzecp) obj;
            return zzecp.zzbfp();
        }
        return obj;
    }

    private final void zza(T t, Object obj) {
        if (t.zzbel()) {
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
                zza(t.zzbej(), obj2);
            }
            obj = arrayList;
        } else {
            zza(t.zzbej(), obj);
        }
        if (obj instanceof zzecp) {
            this.zzhuv = true;
        }
        this.zzhut.zza((zzeel<T, Object>) t, (T) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzecf) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzecp) == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.ads.zzefp r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.zzecg.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.ads.zzebw.zzhuz
            com.google.android.gms.internal.ads.zzefw r2 = r2.zzbhn()
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
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzedo
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzecp
            if (r2 == 0) goto L14
            goto L42
        L1f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzecf
            if (r2 == 0) goto L14
            goto L42
        L28:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzeaq
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebt.zza(com.google.android.gms.internal.ads.zzefp, java.lang.Object):void");
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzhut.zzbgq(); i++) {
            if (!zzb(this.zzhut.zzhj(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.zzhut.zzbgr()) {
            if (!zzb(entry)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzebv<T>> boolean zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzbek() == zzefw.MESSAGE) {
            if (key.zzbel()) {
                for (zzedo zzedoVar : (List) entry.getValue()) {
                    if (!zzedoVar.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzedo) {
                    if (!((zzedo) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzecp) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzebt<T> zzebtVar) {
        for (int i = 0; i < zzebtVar.zzhut.zzbgq(); i++) {
            zzc(zzebtVar.zzhut.zzhj(i));
        }
        for (Map.Entry<T, Object> entry : zzebtVar.zzhut.zzbgr()) {
            zzc(entry);
        }
    }

    private static Object zzal(Object obj) {
        if (obj instanceof zzedt) {
            return ((zzedt) obj).zzbcg();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    private final void zzc(Map.Entry<T, Object> entry) {
        zzedo zzbet;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzecp) {
            zzecp zzecpVar = (zzecp) value;
            value = zzecp.zzbfp();
        }
        if (key.zzbel()) {
            Object zza = zza((zzebt<T>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) zza).add(zzal(obj));
            }
            this.zzhut.zza((zzeel<T, Object>) key, (T) zza);
        } else if (key.zzbek() == zzefw.MESSAGE) {
            Object zza2 = zza((zzebt<T>) key);
            if (zza2 == null) {
                this.zzhut.zza((zzeel<T, Object>) key, (T) zzal(value));
                return;
            }
            if (zza2 instanceof zzedt) {
                zzbet = key.zza((zzedt) zza2, (zzedt) value);
            } else {
                zzbet = key.zza(((zzedo) zza2).zzbfb(), (zzedo) value).zzbet();
            }
            this.zzhut.zza((zzeel<T, Object>) key, (T) zzbet);
        } else {
            this.zzhut.zza((zzeel<T, Object>) key, (T) zzal(value));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzebk zzebkVar, zzefp zzefpVar, int i, Object obj) throws IOException {
        if (zzefpVar == zzefp.zzidu) {
            zzedo zzedoVar = (zzedo) obj;
            zzecg.zzk(zzedoVar);
            zzebkVar.writeTag(i, 3);
            zzedoVar.zzb(zzebkVar);
            zzebkVar.writeTag(i, 4);
            return;
        }
        zzebkVar.writeTag(i, zzefpVar.zzbho());
        switch (zzebw.zzhuk[zzefpVar.ordinal()]) {
            case 1:
                zzebkVar.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzebkVar.zzf(((Float) obj).floatValue());
                return;
            case 3:
                zzebkVar.zzfi(((Long) obj).longValue());
                return;
            case 4:
                zzebkVar.zzfi(((Long) obj).longValue());
                return;
            case 5:
                zzebkVar.zzgg(((Integer) obj).intValue());
                return;
            case 6:
                zzebkVar.zzfk(((Long) obj).longValue());
                return;
            case 7:
                zzebkVar.zzgj(((Integer) obj).intValue());
                return;
            case 8:
                zzebkVar.zzbs(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzedo) obj).zzb(zzebkVar);
                return;
            case 10:
                zzebkVar.zzg((zzedo) obj);
                return;
            case 11:
                if (obj instanceof zzeaq) {
                    zzebkVar.zzah((zzeaq) obj);
                    return;
                } else {
                    zzebkVar.zzhr((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzeaq) {
                    zzebkVar.zzah((zzeaq) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzebkVar.zzk(bArr, 0, bArr.length);
                return;
            case 13:
                zzebkVar.zzgh(((Integer) obj).intValue());
                return;
            case 14:
                zzebkVar.zzgj(((Integer) obj).intValue());
                return;
            case 15:
                zzebkVar.zzfk(((Long) obj).longValue());
                return;
            case 16:
                zzebkVar.zzgi(((Integer) obj).intValue());
                return;
            case 17:
                zzebkVar.zzfj(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzecf) {
                    zzebkVar.zzgg(((zzecf) obj).zzw());
                    return;
                } else {
                    zzebkVar.zzgg(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzbef() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzhut.zzbgq(); i2++) {
            i += zzd(this.zzhut.zzhj(i2));
        }
        for (Map.Entry<T, Object> entry : this.zzhut.zzbgr()) {
            i += zzd(entry);
        }
        return i;
    }

    private static int zzd(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzbek() == zzefw.MESSAGE && !key.zzbel() && !key.zzbem()) {
            if (value instanceof zzecp) {
                return zzebk.zzb(entry.getKey().zzw(), (zzecp) value);
            }
            return zzebk.zzb(entry.getKey().zzw(), (zzedo) value);
        }
        return zzb((zzebv<?>) key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzefp zzefpVar, int i, Object obj) {
        int zzgk = zzebk.zzgk(i);
        if (zzefpVar == zzefp.zzidu) {
            zzecg.zzk((zzedo) obj);
            zzgk <<= 1;
        }
        return zzgk + zzb(zzefpVar, obj);
    }

    private static int zzb(zzefp zzefpVar, Object obj) {
        switch (zzebw.zzhuk[zzefpVar.ordinal()]) {
            case 1:
                return zzebk.zzc(((Double) obj).doubleValue());
            case 2:
                return zzebk.zzg(((Float) obj).floatValue());
            case 3:
                return zzebk.zzfl(((Long) obj).longValue());
            case 4:
                return zzebk.zzfm(((Long) obj).longValue());
            case 5:
                return zzebk.zzgl(((Integer) obj).intValue());
            case 6:
                return zzebk.zzfo(((Long) obj).longValue());
            case 7:
                return zzebk.zzgo(((Integer) obj).intValue());
            case 8:
                return zzebk.zzbt(((Boolean) obj).booleanValue());
            case 9:
                return zzebk.zzi((zzedo) obj);
            case 10:
                if (obj instanceof zzecp) {
                    return zzebk.zza((zzecp) obj);
                }
                return zzebk.zzh((zzedo) obj);
            case 11:
                if (obj instanceof zzeaq) {
                    return zzebk.zzai((zzeaq) obj);
                }
                return zzebk.zzhs((String) obj);
            case 12:
                if (obj instanceof zzeaq) {
                    return zzebk.zzai((zzeaq) obj);
                }
                return zzebk.zzx((byte[]) obj);
            case 13:
                return zzebk.zzgm(((Integer) obj).intValue());
            case 14:
                return zzebk.zzgp(((Integer) obj).intValue());
            case 15:
                return zzebk.zzfp(((Long) obj).longValue());
            case 16:
                return zzebk.zzgn(((Integer) obj).intValue());
            case 17:
                return zzebk.zzfn(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzecf) {
                    return zzebk.zzgq(((zzecf) obj).zzw());
                }
                return zzebk.zzgq(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzebv<?> zzebvVar, Object obj) {
        zzefp zzbej = zzebvVar.zzbej();
        int zzw = zzebvVar.zzw();
        if (zzebvVar.zzbel()) {
            int i = 0;
            if (zzebvVar.zzbem()) {
                for (Object obj2 : (List) obj) {
                    i += zzb(zzbej, obj2);
                }
                return zzebk.zzgk(zzw) + i + zzebk.zzgs(i);
            }
            for (Object obj3 : (List) obj) {
                i += zza(zzbej, zzw, obj3);
            }
            return i;
        }
        return zza(zzbej, zzw, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzebt zzebtVar = new zzebt();
        for (int i = 0; i < this.zzhut.zzbgq(); i++) {
            Map.Entry<T, Object> zzhj = this.zzhut.zzhj(i);
            zzebtVar.zza((zzebt) zzhj.getKey(), zzhj.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zzhut.zzbgr()) {
            zzebtVar.zza((zzebt) entry.getKey(), entry.getValue());
        }
        zzebtVar.zzhuv = this.zzhuv;
        return zzebtVar;
    }
}
