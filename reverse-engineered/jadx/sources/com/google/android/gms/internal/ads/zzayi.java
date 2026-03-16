package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzayi {
    private final String[] zzdxg;
    private final double[] zzdxh;
    private final double[] zzdxi;
    private final int[] zzdxj;
    private int zzdxk;

    private zzayi(zzayj zzayjVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzayjVar.zzdxm;
        int size = list.size();
        list2 = zzayjVar.zzdxl;
        this.zzdxg = (String[]) list2.toArray(new String[size]);
        list3 = zzayjVar.zzdxm;
        this.zzdxh = zzf(list3);
        list4 = zzayjVar.zzdxn;
        this.zzdxi = zzf(list4);
        this.zzdxj = new int[size];
        this.zzdxk = 0;
    }

    private static double[] zzf(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    public final void zza(double d) {
        this.zzdxk++;
        int i = 0;
        while (true) {
            double[] dArr = this.zzdxi;
            if (i >= dArr.length) {
                return;
            }
            if (dArr[i] <= d && d < this.zzdxh[i]) {
                int[] iArr = this.zzdxj;
                iArr[i] = iArr[i] + 1;
            }
            if (d < this.zzdxi[i]) {
                return;
            }
            i++;
        }
    }

    public final List<zzayk> zzxv() {
        ArrayList arrayList = new ArrayList(this.zzdxg.length);
        int i = 0;
        while (true) {
            String[] strArr = this.zzdxg;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d = this.zzdxi[i];
            double d2 = this.zzdxh[i];
            int[] iArr = this.zzdxj;
            double d3 = iArr[i];
            double d4 = this.zzdxk;
            Double.isNaN(d3);
            Double.isNaN(d4);
            arrayList.add(new zzayk(str, d, d2, d3 / d4, iArr[i]));
            i++;
        }
    }
}
