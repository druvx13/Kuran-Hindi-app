package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzagp implements Parcelable.Creator<zzagm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagm[] newArray(int i) {
        return new zzagm[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagm createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                strArr = SafeParcelReader.createStringArray(parcel, readHeader);
            } else if (fieldId == 3) {
                strArr2 = SafeParcelReader.createStringArray(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzagm(str, strArr, strArr2);
    }
}
