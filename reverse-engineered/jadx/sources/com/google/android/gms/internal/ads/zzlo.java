package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzlo extends zzlu {
    public static final Parcelable.Creator<zzlo> CREATOR = new zzlq();
    private final String description;
    private final String mimeType;
    private final int zzbar;
    private final byte[] zzbas;

    public zzlo(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.mimeType = str;
        this.description = null;
        this.zzbar = 3;
        this.zzbas = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlo(Parcel parcel) {
        super("APIC");
        this.mimeType = parcel.readString();
        this.description = parcel.readString();
        this.zzbar = parcel.readInt();
        this.zzbas = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzlo zzloVar = (zzlo) obj;
            if (this.zzbar == zzloVar.zzbar && zzov.zza(this.mimeType, zzloVar.mimeType) && zzov.zza(this.description, zzloVar.description) && Arrays.equals(this.zzbas, zzloVar.zzbas)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.zzbar + 527) * 31;
        String str = this.mimeType;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzbas);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.zzbar);
        parcel.writeByteArray(this.zzbas);
    }
}
