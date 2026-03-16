package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzctv {
    private final zzcae zzgkd;
    private final zzctp zzgke;
    private final zzbrc zzgkf;

    public zzctv(zzcae zzcaeVar) {
        final zzctp zzctpVar = new zzctp();
        this.zzgke = zzctpVar;
        this.zzgkd = zzcaeVar;
        final zzahu zzalp = zzcaeVar.zzalp();
        this.zzgkf = new zzbrc(zzctpVar, zzalp) { // from class: com.google.android.gms.internal.ads.zzctu
            private final zzctp zzgkb;
            private final zzahu zzgkc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgkb = zzctpVar;
                this.zzgkc = zzalp;
            }

            @Override // com.google.android.gms.internal.ads.zzbrc
            public final void onAdFailedToLoad(int i) {
                zzctp zzctpVar2 = this.zzgkb;
                zzahu zzahuVar = this.zzgkc;
                zzctpVar2.onAdFailedToLoad(i);
                if (zzahuVar != null) {
                    try {
                        zzahuVar.onInstreamAdFailedToLoad(i);
                    } catch (RemoteException e) {
                        zzazw.zze("#007 Could not call remote method.", e);
                    }
                }
            }
        };
    }

    public final void zzc(zzvm zzvmVar) {
        this.zzgke.zzc(zzvmVar);
    }

    public final zzbyl zzapo() {
        return new zzbyl(this.zzgkd, this.zzgke.zzapl());
    }

    public final zzbqx zzapp() {
        return this.zzgke;
    }

    public final zzbsm zzapq() {
        return this.zzgke;
    }

    public final zzbrc zzapr() {
        return this.zzgkf;
    }

    public final zzbrp zzaps() {
        return this.zzgke;
    }

    public final zzub zzapt() {
        return this.zzgke;
    }
}
