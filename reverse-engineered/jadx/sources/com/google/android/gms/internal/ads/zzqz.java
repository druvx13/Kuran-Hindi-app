package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.MurmurHash3;
import java.io.UnsupportedEncodingException;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzqz {
    public static int zzbt(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        return MurmurHash3.murmurhash3_x86_32(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
        if (((r6 >= 65382 && r6 <= 65437) || (r6 >= 65441 && r6 <= 65500)) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c4, code lost:
        if (r4 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d4, code lost:
        if (r4 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d6, code lost:
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d7, code lost:
        r4 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] zzd(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqz.zzd(java.lang.String, boolean):java.lang.String[]");
    }
}
