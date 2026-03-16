package com.google.android.gms.ads.rewarded;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public class ServerSideVerificationOptions {
    private final String zzdrf;
    private final String zzdrg;

    private ServerSideVerificationOptions(Builder builder) {
        this.zzdrf = builder.zzdrf;
        this.zzdrg = builder.zzdrg;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private String zzdrf = "";
        private String zzdrg = "";

        public final Builder setUserId(String str) {
            this.zzdrf = str;
            return this;
        }

        public final Builder setCustomData(String str) {
            this.zzdrg = str;
            return this;
        }

        public final ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this);
        }
    }

    public String getUserId() {
        return this.zzdrf;
    }

    public String getCustomData() {
        return this.zzdrg;
    }
}
