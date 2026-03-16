package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzum extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzum> CREATOR = new zzup();
    public final int height;
    public final int heightPixels;
    public final int width;
    public final int widthPixels;
    public final String zzacf;
    public final boolean zzbnf;
    public final boolean zzcew;
    public final zzum[] zzcex;
    public final boolean zzcey;
    public boolean zzcez;
    public boolean zzcfa;
    private boolean zzcfb;
    public boolean zzcfc;
    public boolean zzcfd;

    public static int zzb(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int zzc(DisplayMetrics displayMetrics) {
        return (int) (zzd(displayMetrics) * displayMetrics.density);
    }

    private static int zzd(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public static zzum zzph() {
        return new zzum("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false);
    }

    public static zzum zzpi() {
        return new zzum("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false);
    }

    public static zzum zzpj() {
        return new zzum("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false);
    }

    public zzum() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false);
    }

    public static zzum zzpk() {
        return new zzum("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false);
    }

    public zzum(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzum(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzum.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzum(String str, int i, int i2, boolean z, int i3, int i4, zzum[] zzumVarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.zzacf = str;
        this.height = i;
        this.heightPixels = i2;
        this.zzcew = z;
        this.width = i3;
        this.widthPixels = i4;
        this.zzcex = zzumVarArr;
        this.zzbnf = z2;
        this.zzcey = z3;
        this.zzcez = z4;
        this.zzcfa = z5;
        this.zzcfb = z6;
        this.zzcfc = z7;
        this.zzcfd = z8;
    }

    public final AdSize zzpl() {
        return com.google.android.gms.ads.zzb.zza(this.width, this.height, this.zzacf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzacf, false);
        SafeParcelWriter.writeInt(parcel, 3, this.height);
        SafeParcelWriter.writeInt(parcel, 4, this.heightPixels);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzcew);
        SafeParcelWriter.writeInt(parcel, 6, this.width);
        SafeParcelWriter.writeInt(parcel, 7, this.widthPixels);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzcex, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzbnf);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzcey);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzcez);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzcfa);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzcfb);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzcfc);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzcfd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
