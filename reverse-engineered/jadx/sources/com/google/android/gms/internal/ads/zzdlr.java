package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
final class zzdlr extends zzdln {
    private String zzhbe;
    private Boolean zzhbf;
    private Boolean zzhbg;

    @Override // com.google.android.gms.internal.ads.zzdln
    public final zzdln zzgy(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.zzhbe = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdln
    public final zzdln zzbq(boolean z) {
        this.zzhbf = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdln
    public final zzdln zzbr(boolean z) {
        this.zzhbg = true;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdln
    public final zzdlo zzaue() {
        String concat = this.zzhbe == null ? "".concat(" clientVersion") : "";
        if (this.zzhbf == null) {
            concat = String.valueOf(concat).concat(" shouldGetAdvertisingId");
        }
        if (this.zzhbg == null) {
            concat = String.valueOf(concat).concat(" isGooglePlayServicesAvailable");
        }
        if (!concat.isEmpty()) {
            String valueOf = String.valueOf(concat);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new zzdlp(this.zzhbe, this.zzhbf.booleanValue(), this.zzhbg.booleanValue());
    }
}
