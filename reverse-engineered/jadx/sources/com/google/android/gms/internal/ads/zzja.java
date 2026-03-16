package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzja implements Parcelable, Comparator<zza> {
    public static final Parcelable.Creator<zzja> CREATOR = new zzjc();
    private int zzahb;
    private final zza[] zzanm;
    public final int zzann;

    public zzja(zza... zzaVarArr) {
        this(true, zzaVarArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza implements Parcelable {
        public static final Parcelable.Creator<zza> CREATOR = new zzje();
        private final byte[] data;
        private final String mimeType;
        private final UUID uuid;
        private int zzahb;
        public final boolean zzanq;

        public zza(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private zza(UUID uuid, String str, byte[] bArr, boolean z) {
            this.uuid = (UUID) zzoh.checkNotNull(uuid);
            this.mimeType = (String) zzoh.checkNotNull(str);
            this.data = (byte[]) zzoh.checkNotNull(bArr);
            this.zzanq = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public zza(Parcel parcel) {
            this.uuid = new UUID(parcel.readLong(), parcel.readLong());
            this.mimeType = parcel.readString();
            this.data = parcel.createByteArray();
            this.zzanq = parcel.readByte() != 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof zza) {
                if (obj == this) {
                    return true;
                }
                zza zzaVar = (zza) obj;
                return this.mimeType.equals(zzaVar.mimeType) && zzov.zza(this.uuid, zzaVar.uuid) && Arrays.equals(this.data, zzaVar.data);
            }
            return false;
        }

        public final int hashCode() {
            if (this.zzahb == 0) {
                this.zzahb = (((this.uuid.hashCode() * 31) + this.mimeType.hashCode()) * 31) + Arrays.hashCode(this.data);
            }
            return this.zzahb;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.uuid.getMostSignificantBits());
            parcel.writeLong(this.uuid.getLeastSignificantBits());
            parcel.writeString(this.mimeType);
            parcel.writeByteArray(this.data);
            parcel.writeByte(this.zzanq ? (byte) 1 : (byte) 0);
        }
    }

    private zzja(boolean z, zza... zzaVarArr) {
        zza[] zzaVarArr2 = (zza[]) zzaVarArr.clone();
        Arrays.sort(zzaVarArr2, this);
        for (int i = 1; i < zzaVarArr2.length; i++) {
            if (zzaVarArr2[i - 1].uuid.equals(zzaVarArr2[i].uuid)) {
                String valueOf = String.valueOf(zzaVarArr2[i].uuid);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Duplicate data for uuid: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.zzanm = zzaVarArr2;
        this.zzann = zzaVarArr2.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzja(Parcel parcel) {
        zza[] zzaVarArr = (zza[]) parcel.createTypedArray(zza.CREATOR);
        this.zzanm = zzaVarArr;
        this.zzann = zzaVarArr.length;
    }

    public final zza zzaa(int i) {
        return this.zzanm[i];
    }

    public final int hashCode() {
        if (this.zzahb == 0) {
            this.zzahb = Arrays.hashCode(this.zzanm);
        }
        return this.zzahb;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzanm, ((zzja) obj).zzanm);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.zzanm, 0);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zza zzaVar, zza zzaVar2) {
        zza zzaVar3 = zzaVar;
        zza zzaVar4 = zzaVar2;
        if (zzgr.zzadl.equals(zzaVar3.uuid)) {
            return zzgr.zzadl.equals(zzaVar4.uuid) ? 0 : 1;
        }
        return zzaVar3.uuid.compareTo(zzaVar4.uuid);
    }
}
