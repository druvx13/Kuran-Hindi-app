package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzhl {
    public static final zzhl zzahe = new zzhl(1.0f, 1.0f);
    public final float zzahf;
    public final float zzahg;
    private final int zzahh;

    public zzhl(float f, float f2) {
        this.zzahf = f;
        this.zzahg = f2;
        this.zzahh = Math.round(f * 1000.0f);
    }

    public final long zzdu(long j) {
        return j * this.zzahh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzhl zzhlVar = (zzhl) obj;
            if (this.zzahf == zzhlVar.zzahf && this.zzahg == zzhlVar.zzahg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzahf) + 527) * 31) + Float.floatToRawIntBits(this.zzahg);
    }
}
