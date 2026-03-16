package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdja implements zzdiy {
    private final String zzcc;

    public zzdja(String str) {
        this.zzcc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    public final boolean equals(Object obj) {
        if (obj instanceof zzdja) {
            return this.zzcc.equals(((zzdja) obj).zzcc);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    public final int hashCode() {
        return this.zzcc.hashCode();
    }

    public final String toString() {
        return this.zzcc;
    }
}
