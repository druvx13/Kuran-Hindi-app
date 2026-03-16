package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbra extends zzbui<zzbrc> implements zzbrc {
    public zzbra(Set<zzbvt<zzbrc>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void onAdFailedToLoad(final int i) {
        zza(new zzbuk(i) { // from class: com.google.android.gms.internal.ads.zzbqz
            private final int zzdzl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdzl = i;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                ((zzbrc) obj).onAdFailedToLoad(this.zzdzl);
            }
        });
    }
}
