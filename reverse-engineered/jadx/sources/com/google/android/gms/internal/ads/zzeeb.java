package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzeeb implements zzedm {
    private final int flags;
    private final String info;
    private final Object[] zziae;
    private final zzedo zziah;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeeb(zzedo zzedoVar, String str, Object[] objArr) {
        this.zziah = zzedoVar;
        this.info = str;
        this.zziae = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.flags = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzbgl() {
        return this.info;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zzbgm() {
        return this.zziae;
    }

    @Override // com.google.android.gms.internal.ads.zzedm
    public final zzedo zzbgg() {
        return this.zziah;
    }

    @Override // com.google.android.gms.internal.ads.zzedm
    public final int zzbge() {
        return (this.flags & 1) == 1 ? zzecd.zzf.zzhyj : zzecd.zzf.zzhyk;
    }

    @Override // com.google.android.gms.internal.ads.zzedm
    public final boolean zzbgf() {
        return (this.flags & 2) == 2;
    }
}
