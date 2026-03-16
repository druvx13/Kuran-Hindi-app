package com.google.android.gms.internal.ads;

import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzlz implements Runnable {
    private final /* synthetic */ zzly zzbau;
    private final /* synthetic */ zzme zzbbv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlz(zzly zzlyVar, zzme zzmeVar) {
        this.zzbau = zzlyVar;
        this.zzbbv = zzmeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        this.zzbbv.release();
        sparseArray = this.zzbau.zzbbg;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray2 = this.zzbau.zzbbg;
            ((zzms) sparseArray2.valueAt(i)).disable();
        }
    }
}
