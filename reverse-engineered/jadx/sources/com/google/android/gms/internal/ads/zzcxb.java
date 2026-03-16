package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcxb implements zzdak<zzdah<Bundle>> {
    private final zzdee zzgmq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcxb(zzdee zzdeeVar) {
        this.zzgmq = zzdeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdah<Bundle>> zzaqa() {
        zzdee zzdeeVar = this.zzgmq;
        return zzdqw.zzag((zzdeeVar == null || zzdeeVar.zzarn() == null || this.zzgmq.zzarn().isEmpty()) ? null : new zzdah(this) { // from class: com.google.android.gms.internal.ads.zzcxe
            private final zzcxb zzgmr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmr = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdah
            public final void zzs(Object obj) {
                this.zzgmr.zzp((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(Bundle bundle) {
        bundle.putString("key_schema", this.zzgmq.zzarn());
    }
}
