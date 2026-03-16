package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzzw implements zzaby {
    private final /* synthetic */ zzzv zzcis;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzw(zzzv zzzvVar) {
        this.zzcis = zzzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final Boolean zze(String str, boolean z) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zzcis.zzcip;
        return Boolean.valueOf(sharedPreferences.getBoolean(str, z));
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final Long getLong(String str, long j) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zzcis.zzcip;
            return Long.valueOf(sharedPreferences2.getLong(str, j));
        } catch (ClassCastException unused) {
            sharedPreferences = this.zzcis.zzcip;
            return Long.valueOf(sharedPreferences.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final Double zza(String str, double d) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zzcis.zzcip;
        return Double.valueOf(sharedPreferences.getFloat(str, (float) d));
    }

    @Override // com.google.android.gms.internal.ads.zzaby
    public final String get(String str, String str2) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zzcis.zzcip;
        return sharedPreferences.getString(str, str2);
    }
}
