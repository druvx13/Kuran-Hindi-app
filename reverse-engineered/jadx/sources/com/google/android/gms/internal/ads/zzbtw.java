package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbtw extends zzbui<AppEventListener> implements zzafl {
    public zzbtw(Set<zzbvt<AppEventListener>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final synchronized void onAppEvent(final String str, final String str2) {
        zza(new zzbuk(str, str2) { // from class: com.google.android.gms.internal.ads.zzbtv
            private final String zzdbv;
            private final String zzdcd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdcd = str;
                this.zzdbv = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                ((AppEventListener) obj).onAppEvent(this.zzdcd, this.zzdbv);
            }
        });
    }
}
