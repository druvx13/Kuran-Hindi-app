package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
final class zzdlp extends zzdlo {
    private final String zzhbe;
    private final boolean zzwb;
    private final boolean zzyu;

    private zzdlp(String str, boolean z, boolean z2) {
        this.zzhbe = str;
        this.zzwb = z;
        this.zzyu = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzdlo
    public final String zzauf() {
        return this.zzhbe;
    }

    @Override // com.google.android.gms.internal.ads.zzdlo
    public final boolean zzaug() {
        return this.zzwb;
    }

    @Override // com.google.android.gms.internal.ads.zzdlo
    public final boolean zzcn() {
        return this.zzyu;
    }

    public final String toString() {
        String str = this.zzhbe;
        boolean z = this.zzwb;
        boolean z2 = this.zzyu;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdlo) {
            zzdlo zzdloVar = (zzdlo) obj;
            if (this.zzhbe.equals(zzdloVar.zzauf()) && this.zzwb == zzdloVar.zzaug() && this.zzyu == zzdloVar.zzcn()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zzhbe.hashCode() ^ 1000003) * 1000003) ^ (this.zzwb ? 1231 : 1237)) * 1000003) ^ (this.zzyu ? 1231 : 1237);
    }
}
