package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcyh implements zzdak<zzcyi> {
    private final zzdgm zzfgh;
    private final zzdrh zzfur;

    public zzcyh(zzdrh zzdrhVar, zzdgm zzdgmVar) {
        this.zzfur = zzdrhVar;
        this.zzfgh = zzdgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzcyi> zzaqa() {
        return this.zzfur.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcyk
            private final zzcyh zzgng;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgng = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgng.zzaqh();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcyi zzaqh() throws Exception {
        return new zzcyi(this.zzfgh);
    }
}
