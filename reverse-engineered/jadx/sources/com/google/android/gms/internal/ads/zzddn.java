package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzddn implements zzbrc, zzbsr, zzder {
    private final zzdih zzgqx;
    private final AtomicReference<zzrn> zzgqy = new AtomicReference<>();
    private final AtomicReference<zzrs> zzgqz = new AtomicReference<>();
    private final AtomicReference<zzbsr> zzgra = new AtomicReference<>();
    private zzddn zzgrb = null;

    public zzddn(zzdih zzdihVar) {
        this.zzgqx = zzdihVar;
    }

    public static zzddn zza(zzddn zzddnVar) {
        zzddn zzddnVar2 = new zzddn(zzddnVar.zzgqx);
        zzddnVar2.zzb(zzddnVar);
        return zzddnVar2;
    }

    public final void zzb(zzrn zzrnVar) {
        this.zzgqy.set(zzrnVar);
    }

    public final void zzb(zzrs zzrsVar) {
        this.zzgqz.set(zzrsVar);
    }

    public final void zza(zzbsr zzbsrVar) {
        this.zzgra.set(zzbsrVar);
    }

    public final void zzb(final zzrm zzrmVar) {
        zzddn zzddnVar = this;
        while (true) {
            zzddn zzddnVar2 = zzddnVar.zzgrb;
            if (zzddnVar2 == null) {
                zzdek.zza(zzddnVar.zzgqy, new zzdej(zzrmVar) { // from class: com.google.android.gms.internal.ads.zzddq
                    private final zzrm zzgrc;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgrc = zzrmVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdej
                    public final void zzr(Object obj) {
                        ((zzrn) obj).zza(this.zzgrc);
                    }
                });
                return;
            }
            zzddnVar = zzddnVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void onAdFailedToLoad(final int i) {
        zzddn zzddnVar = this;
        while (true) {
            zzddn zzddnVar2 = zzddnVar.zzgrb;
            if (zzddnVar2 == null) {
                zzdek.zza(zzddnVar.zzgqy, new zzdej(i) { // from class: com.google.android.gms.internal.ads.zzddp
                    private final int zzdzl;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdzl = i;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdej
                    public final void zzr(Object obj) {
                        ((zzrn) obj).onAppOpenAdFailedToLoad(this.zzdzl);
                    }
                });
                return;
            }
            zzddnVar = zzddnVar2;
        }
    }

    public final void onAdClosed() {
        zzddn zzddnVar = this;
        while (true) {
            zzddn zzddnVar2 = zzddnVar.zzgrb;
            if (zzddnVar2 == null) {
                zzddnVar.zzgqx.onAdClosed();
                zzdek.zza(zzddnVar.zzgqz, zzdds.zzgrd);
                return;
            }
            zzddnVar = zzddnVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zzait() {
        zzddn zzddnVar = this;
        while (true) {
            zzddn zzddnVar2 = zzddnVar.zzgrb;
            if (zzddnVar2 == null) {
                zzdek.zza(zzddnVar.zzgra, zzddr.zzgrd);
                return;
            }
            zzddnVar = zzddnVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final void zzb(zzder zzderVar) {
        this.zzgrb = (zzddn) zzderVar;
    }
}
