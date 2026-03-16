package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbri extends zzbui<zzbrl> implements zzbrb {
    public zzbri(Set<zzbvt<zzbrl>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zza(zzbxy zzbxyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzf(final int i, String str) {
        zza(new zzbuk(i) { // from class: com.google.android.gms.internal.ads.zzbrh
            private final int zzdzl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdzl = i;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                ((zzbrl) obj).zzcx(this.zzdzl);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzais() {
        zza(zzbrk.zzfnf);
    }
}
