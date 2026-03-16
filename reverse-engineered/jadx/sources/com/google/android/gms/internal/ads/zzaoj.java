package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaoj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaoj> CREATOR = new zzaoi();
    private final int major;
    private final int minor;
    private final int zzdhy;

    public static zzaoj zza(VersionInfo versionInfo) {
        return new zzaoj(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaoj(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.zzdhy = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.major);
        SafeParcelWriter.writeInt(parcel, 2, this.minor);
        SafeParcelWriter.writeInt(parcel, 3, this.zzdhy);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String toString() {
        int i = this.major;
        int i2 = this.minor;
        int i3 = this.zzdhy;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzaoj)) {
            zzaoj zzaojVar = (zzaoj) obj;
            if (zzaojVar.zzdhy == this.zzdhy && zzaojVar.minor == this.minor && zzaojVar.major == this.major) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.major, this.minor, this.zzdhy});
    }
}
