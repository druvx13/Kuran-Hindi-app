package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaae {
    public static void zza(zzaac zzaacVar, zzaad zzaadVar) {
        if (zzaadVar.getContext() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzaadVar.zzkr())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzaacVar.zza(zzaadVar.getContext(), zzaadVar.zzkr(), zzaadVar.zzrh(), zzaadVar.zzri());
    }
}
