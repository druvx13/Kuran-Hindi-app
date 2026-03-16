package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzni extends zzno {
    private zznh zzbfd;
    private final SparseArray<Map<zzna, zznk>> zzbfb = new SparseArray<>();
    private final SparseBooleanArray zzbfc = new SparseBooleanArray();
    private int zzahj = 0;

    protected abstract zznj[] zza(zzhn[] zzhnVarArr, zzna[] zznaVarArr, int[][][] iArr) throws zzgq;

    public final void zzf(int i, boolean z) {
        if (this.zzbfc.get(i) == z) {
            return;
        }
        this.zzbfc.put(i, z);
        invalidate();
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final zznq zza(zzhn[] zzhnVarArr, zzna zznaVar) throws zzgq {
        int[] iArr;
        int[] iArr2 = new int[zzhnVarArr.length + 1];
        int length = zzhnVarArr.length + 1;
        zzmx[][] zzmxVarArr = new zzmx[length];
        int[][][] iArr3 = new int[zzhnVarArr.length + 1][];
        for (int i = 0; i < length; i++) {
            zzmxVarArr[i] = new zzmx[zznaVar.length];
            iArr3[i] = new int[zznaVar.length];
        }
        int length2 = zzhnVarArr.length;
        int[] iArr4 = new int[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            iArr4[i2] = zzhnVarArr[i2].zzef();
        }
        for (int i3 = 0; i3 < zznaVar.length; i3++) {
            zzmx zzay = zznaVar.zzay(i3);
            int length3 = zzhnVarArr.length;
            int i4 = 0;
            for (int i5 = 0; i5 < zzhnVarArr.length; i5++) {
                zzhn zzhnVar = zzhnVarArr[i5];
                for (int i6 = 0; i6 < zzay.length; i6++) {
                    int zza = zzhnVar.zza(zzay.zzax(i6)) & 3;
                    if (zza > i4) {
                        length3 = i5;
                        if (zza == 3) {
                            break;
                        }
                        i4 = zza;
                    }
                }
            }
            if (length3 == zzhnVarArr.length) {
                iArr = new int[zzay.length];
            } else {
                zzhn zzhnVar2 = zzhnVarArr[length3];
                int[] iArr5 = new int[zzay.length];
                for (int i7 = 0; i7 < zzay.length; i7++) {
                    iArr5[i7] = zzhnVar2.zza(zzay.zzax(i7));
                }
                iArr = iArr5;
            }
            int i8 = iArr2[length3];
            zzmxVarArr[length3][i8] = zzay;
            iArr3[length3][i8] = iArr;
            iArr2[length3] = iArr2[length3] + 1;
        }
        zzna[] zznaVarArr = new zzna[zzhnVarArr.length];
        int[] iArr6 = new int[zzhnVarArr.length];
        for (int i9 = 0; i9 < zzhnVarArr.length; i9++) {
            int i10 = iArr2[i9];
            zznaVarArr[i9] = new zzna((zzmx[]) Arrays.copyOf(zzmxVarArr[i9], i10));
            iArr3[i9] = (int[][]) Arrays.copyOf(iArr3[i9], i10);
            iArr6[i9] = zzhnVarArr[i9].getTrackType();
        }
        zzna zznaVar2 = new zzna((zzmx[]) Arrays.copyOf(zzmxVarArr[zzhnVarArr.length], iArr2[zzhnVarArr.length]));
        zznj[] zza2 = zza(zzhnVarArr, zznaVarArr, iArr3);
        int i11 = 0;
        while (true) {
            if (i11 < zzhnVarArr.length) {
                if (this.zzbfc.get(i11)) {
                    zza2[i11] = null;
                } else {
                    zzna zznaVar3 = zznaVarArr[i11];
                    Map<zzna, zznk> map = this.zzbfb.get(i11);
                    if ((map != null ? map.get(zznaVar3) : null) != null) {
                        throw new NoSuchMethodError();
                    }
                }
                i11++;
            } else {
                zznh zznhVar = new zznh(iArr6, zznaVarArr, iArr4, iArr3, zznaVar2);
                zzhm[] zzhmVarArr = new zzhm[zzhnVarArr.length];
                for (int i12 = 0; i12 < zzhnVarArr.length; i12++) {
                    zzhmVarArr[i12] = zza2[i12] != null ? zzhm.zzahi : null;
                }
                return new zznq(zznaVar, new zznl(zza2), zznhVar, zzhmVarArr);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzd(Object obj) {
        this.zzbfd = (zznh) obj;
    }
}
