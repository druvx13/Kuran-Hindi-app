package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbrr extends zzbui<zzbrs> {
    public zzbrr(Set<zzbvt<zzbrs>> set) {
        super(set);
    }

    public final void zzbx(final Context context) {
        zza(new zzbuk(context) { // from class: com.google.android.gms.internal.ads.zzbru
            private final Context zzcit;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcit = context;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                ((zzbrs) obj).zzbx(this.zzcit);
            }
        });
    }

    public final void zzby(final Context context) {
        zza(new zzbuk(context) { // from class: com.google.android.gms.internal.ads.zzbrt
            private final Context zzcit;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcit = context;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                ((zzbrs) obj).zzby(this.zzcit);
            }
        });
    }

    public final void zzbz(final Context context) {
        zza(new zzbuk(context) { // from class: com.google.android.gms.internal.ads.zzbrw
            private final Context zzcit;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcit = context;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                ((zzbrs) obj).zzbz(this.zzcit);
            }
        });
    }

    public final void zza(zzbwj zzbwjVar, Executor executor) {
        zza(zzbvt.zzb(new zzbrv(this, zzbwjVar), executor));
    }
}
