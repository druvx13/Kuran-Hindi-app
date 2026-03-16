package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcwd implements zzdak<zzcwe> {
    private final zzdhe zzfll;
    private final zzdrh zzfur;

    public zzcwd(zzdrh zzdrhVar, zzdhe zzdheVar) {
        this.zzfur = zzdrhVar;
        this.zzfll = zzdheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzcwe> zzaqa() {
        return this.zzfur.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcwg
            private final zzcwd zzgme;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgme = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgme.zzaqd();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcwe zzaqd() throws Exception {
        return new zzcwe(this.zzfll.zzgva);
    }
}
