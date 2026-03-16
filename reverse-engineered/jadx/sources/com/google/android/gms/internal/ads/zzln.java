package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzln implements Parcelable {
    public static final Parcelable.Creator<zzln> CREATOR = new zzlm();
    private final zza[] zzbaq;

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public interface zza extends Parcelable {
    }

    public zzln(List<? extends zza> list) {
        zza[] zzaVarArr = new zza[list.size()];
        this.zzbaq = zzaVarArr;
        list.toArray(zzaVarArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzln(Parcel parcel) {
        this.zzbaq = new zza[parcel.readInt()];
        int i = 0;
        while (true) {
            zza[] zzaVarArr = this.zzbaq;
            if (i >= zzaVarArr.length) {
                return;
            }
            zzaVarArr[i] = (zza) parcel.readParcelable(zza.class.getClassLoader());
            i++;
        }
    }

    public final int length() {
        return this.zzbaq.length;
    }

    public final zza zzau(int i) {
        return this.zzbaq[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzbaq, ((zzln) obj).zzbaq);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzbaq);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzbaq.length);
        for (zza zzaVar : this.zzbaq) {
            parcel.writeParcelable(zzaVar, 0);
        }
    }
}
