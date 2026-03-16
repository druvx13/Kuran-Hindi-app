package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzlp extends zzlu {
    public static final Parcelable.Creator<zzlp> CREATOR = new zzls();
    public final String description;
    public final String text;
    private final String zzagz;

    public zzlp(String str, String str2, String str3) {
        super("COMM");
        this.zzagz = str;
        this.description = str2;
        this.text = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlp(Parcel parcel) {
        super("COMM");
        this.zzagz = parcel.readString();
        this.description = parcel.readString();
        this.text = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzlp zzlpVar = (zzlp) obj;
            if (zzov.zza(this.description, zzlpVar.description) && zzov.zza(this.zzagz, zzlpVar.zzagz) && zzov.zza(this.text, zzlpVar.text)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzagz;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.text;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzagd);
        parcel.writeString(this.zzagz);
        parcel.writeString(this.text);
    }
}
