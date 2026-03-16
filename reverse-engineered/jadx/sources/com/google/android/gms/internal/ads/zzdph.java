package com.google.android.gms.internal.ads;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdph<K, V> extends zzdoy<K, V> {
    private static final zzdoy<Object, Object> zzhfv = new zzdph(null, new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzhft;
    private final transient Object zzhfw;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
        r10[r6] = (short) r3;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
        r10[r7] = r4;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
        r10[r6] = (byte) r3;
        r2 = r2 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [int[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <K, V> com.google.android.gms.internal.ads.zzdph<K, V> zzc(int r10, java.lang.Object[] r11) {
        /*
            int r10 = r11.length
            int r10 = r10 >> 1
            r0 = 5
            com.google.android.gms.internal.ads.zzdoj.zzt(r0, r10)
            int r10 = com.google.android.gms.internal.ads.zzdpb.zzeh(r0)
            int r1 = r10 + (-1)
            r2 = 0
            r3 = -1
            r4 = 128(0x80, float:1.794E-43)
            if (r10 > r4) goto L4b
            byte[] r10 = new byte[r10]
            java.util.Arrays.fill(r10, r3)
        L18:
            if (r2 >= r0) goto Lbd
            int r3 = r2 * 2
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            com.google.android.gms.internal.ads.zzdoo.zzb(r4, r5)
            int r6 = r4.hashCode()
            int r6 = com.google.android.gms.internal.ads.zzdoq.zzef(r6)
        L2d:
            r6 = r6 & r1
            r7 = r10[r6]
            r8 = 255(0xff, float:3.57E-43)
            r7 = r7 & r8
            if (r7 != r8) goto L3b
            byte r3 = (byte) r3
            r10[r6] = r3
            int r2 = r2 + 1
            goto L18
        L3b:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L46
            int r6 = r6 + 1
            goto L2d
        L46:
            java.lang.IllegalArgumentException r10 = zza(r4, r5, r11, r7)
            throw r10
        L4b:
            r4 = 32768(0x8000, float:4.5918E-41)
            if (r10 > r4) goto L89
            short[] r10 = new short[r10]
            java.util.Arrays.fill(r10, r3)
        L55:
            if (r2 >= r0) goto Lbd
            int r3 = r2 * 2
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            com.google.android.gms.internal.ads.zzdoo.zzb(r4, r5)
            int r6 = r4.hashCode()
            int r6 = com.google.android.gms.internal.ads.zzdoq.zzef(r6)
        L6a:
            r6 = r6 & r1
            short r7 = r10[r6]
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            if (r7 != r8) goto L79
            short r3 = (short) r3
            r10[r6] = r3
            int r2 = r2 + 1
            goto L55
        L79:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L84
            int r6 = r6 + 1
            goto L6a
        L84:
            java.lang.IllegalArgumentException r10 = zza(r4, r5, r11, r7)
            throw r10
        L89:
            int[] r10 = new int[r10]
            java.util.Arrays.fill(r10, r3)
        L8e:
            if (r2 >= r0) goto Lbd
            int r4 = r2 * 2
            r5 = r11[r4]
            r6 = r4 ^ 1
            r6 = r11[r6]
            com.google.android.gms.internal.ads.zzdoo.zzb(r5, r6)
            int r7 = r5.hashCode()
            int r7 = com.google.android.gms.internal.ads.zzdoq.zzef(r7)
        La3:
            r7 = r7 & r1
            r8 = r10[r7]
            if (r8 != r3) goto Lad
            r10[r7] = r4
            int r2 = r2 + 1
            goto L8e
        Lad:
            r9 = r11[r8]
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto Lb8
            int r7 = r7 + 1
            goto La3
        Lb8:
            java.lang.IllegalArgumentException r10 = zza(r5, r6, r11, r8)
            throw r10
        Lbd:
            com.google.android.gms.internal.ads.zzdph r1 = new com.google.android.gms.internal.ads.zzdph
            r1.<init>(r10, r11, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdph.zzc(int, java.lang.Object[]):com.google.android.gms.internal.ads.zzdph");
    }

    private static IllegalArgumentException zza(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    private zzdph(Object obj, Object[] objArr, int i) {
        this.zzhfw = obj;
        this.zzhft = objArr;
        this.size = i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzdoy, java.util.Map
    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.zzhfw;
        Object[] objArr = this.zzhft;
        int i = this.size;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int zzef = zzdoq.zzef(obj.hashCode());
                while (true) {
                    int i2 = zzef & length;
                    int i3 = bArr[i2] & 255;
                    if (i3 == 255) {
                        return null;
                    }
                    if (objArr[i3].equals(obj)) {
                        return (V) objArr[i3 ^ 1];
                    }
                    zzef = i2 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int zzef2 = zzdoq.zzef(obj.hashCode());
                while (true) {
                    int i4 = zzef2 & length2;
                    int i5 = sArr[i4] & 65535;
                    if (i5 == 65535) {
                        return null;
                    }
                    if (objArr[i5].equals(obj)) {
                        return (V) objArr[i5 ^ 1];
                    }
                    zzef2 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int zzef3 = zzdoq.zzef(obj.hashCode());
                while (true) {
                    int i6 = zzef3 & length3;
                    int i7 = iArr[i6];
                    if (i7 == -1) {
                        return null;
                    }
                    if (objArr[i7].equals(obj)) {
                        return (V) objArr[i7 ^ 1];
                    }
                    zzef3 = i6 + 1;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    final zzdpb<Map.Entry<K, V>> zzavz() {
        return new zzdpg(this, this.zzhft, 0, this.size);
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    final zzdpb<K> zzawa() {
        return new zzdpi(this, new zzdpl(this.zzhft, 0, this.size));
    }

    @Override // com.google.android.gms.internal.ads.zzdoy
    final zzdot<V> zzawb() {
        return new zzdpl(this.zzhft, 1, this.size);
    }
}
