package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zznd extends zzni {
    private static final int[] zzbej = new int[0];
    private final zznm zzbek;
    private final AtomicReference<zzng> zzbel;

    public zznd() {
        this(null);
    }

    private static int zze(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        } else if (i2 == -1) {
            return 1;
        } else {
            return i - i2;
        }
    }

    private static boolean zze(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3) {
            return z && i2 == 2;
        }
        return true;
    }

    private zznd(zznm zznmVar) {
        this.zzbek = null;
        this.zzbel = new AtomicReference<>(new zzng());
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0184, code lost:
        if (r10.zzage <= r12) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b4  */
    @Override // com.google.android.gms.internal.ads.zzni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.gms.internal.ads.zznj[] zza(com.google.android.gms.internal.ads.zzhn[] r36, com.google.android.gms.internal.ads.zzna[] r37, int[][][] r38) throws com.google.android.gms.internal.ads.zzgq {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznd.zza(com.google.android.gms.internal.ads.zzhn[], com.google.android.gms.internal.ads.zzna[], int[][][]):com.google.android.gms.internal.ads.zznj[]");
    }

    private static boolean zza(zzhf zzhfVar, String str) {
        return str != null && TextUtils.equals(str, zzov.zzbh(zzhfVar.zzagz));
    }
}
