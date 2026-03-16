package com.google.android.gms.internal.ads;

import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzng {
    public final int viewportHeight;
    public final int viewportWidth;
    public final String zzbem;
    public final String zzben;
    public final boolean zzbeo;
    public final boolean zzbep;
    public final int zzbeq;
    public final int zzber;
    public final int zzbes;
    public final boolean zzbet;
    public final boolean zzbeu;
    public final boolean zzbev;

    public zzng() {
        this(null, null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
    }

    private zzng(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
        this.zzbem = null;
        this.zzben = null;
        this.zzbeo = false;
        this.zzbep = true;
        this.zzbeq = Integer.MAX_VALUE;
        this.zzber = Integer.MAX_VALUE;
        this.zzbes = Integer.MAX_VALUE;
        this.zzbet = true;
        this.zzbeu = true;
        this.viewportWidth = Integer.MAX_VALUE;
        this.viewportHeight = Integer.MAX_VALUE;
        this.zzbev = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzng zzngVar = (zzng) obj;
            if (this.zzbep == zzngVar.zzbep && this.zzbeq == zzngVar.zzbeq && this.zzber == zzngVar.zzber && this.zzbet == zzngVar.zzbet && this.zzbeu == zzngVar.zzbeu && this.zzbev == zzngVar.zzbev && this.viewportWidth == zzngVar.viewportWidth && this.viewportHeight == zzngVar.viewportHeight && this.zzbes == zzngVar.zzbes && TextUtils.equals(null, null) && TextUtils.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.zzbep ? 1 : 0)) * 31) + this.zzbeq) * 31) + this.zzber) * 31) + this.zzbes) * 31) + (this.zzbet ? 1 : 0)) * 31) + (this.zzbeu ? 1 : 0)) * 31) + (this.zzbev ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight;
    }
}
