package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzgr {
    public static final int CHANNEL_OUT_7POINT1_SURROUND;
    public static final UUID zzadl;
    private static final UUID zzadm;
    private static final UUID zzadn;
    private static final UUID zzado;

    public static long zzdo(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j / 1000;
    }

    public static long zzdp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j * 1000;
    }

    static {
        CHANNEL_OUT_7POINT1_SURROUND = zzov.SDK_INT < 23 ? PointerIconCompat.TYPE_GRAB : 6396;
        zzadl = new UUID(0L, 0L);
        zzadm = new UUID(1186680826959645954L, -5988876978535335093L);
        zzadn = new UUID(-1301668207276963122L, -6645017420763422227L);
        zzado = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
