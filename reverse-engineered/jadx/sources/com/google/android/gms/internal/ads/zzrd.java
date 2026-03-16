package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzrd {
    final long value;
    final int zzbrj;
    final String zzbrq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrd(long j, String str, int i) {
        this.value = j;
        this.zzbrq = str;
        this.zzbrj = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzrd)) {
            zzrd zzrdVar = (zzrd) obj;
            if (zzrdVar.value == this.value && zzrdVar.zzbrj == this.zzbrj) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.value;
    }
}
