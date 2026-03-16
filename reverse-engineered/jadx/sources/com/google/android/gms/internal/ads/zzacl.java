package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzacl implements Parcelable.Creator<zzaci> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaci[] newArray(int i) {
        return new zzaci[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaci createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzze zzzeVar = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 3:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    zzzeVar = (zzze) SafeParcelReader.createParcelable(parcel, readHeader, zzze.CREATOR);
                    break;
                case 7:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 8:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzaci(i, z, i2, z2, i3, zzzeVar, z3, i4);
    }
}
