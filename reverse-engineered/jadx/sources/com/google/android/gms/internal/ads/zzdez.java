package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdez extends AdMetadataListener implements zzbqx, zzbrc, zzbrl, zzbsm, zzbtb, zzder {
    private final zzdih zzgqx;
    private final AtomicReference<AdMetadataListener> zzgsj = new AtomicReference<>();
    private final AtomicReference<zzatn> zzgsk = new AtomicReference<>();
    private final AtomicReference<zzatk> zzgsl = new AtomicReference<>();
    private final AtomicReference<zzasn> zzgsm = new AtomicReference<>();
    private final AtomicReference<zzats> zzgsn = new AtomicReference<>();
    private final AtomicReference<zzasi> zzgso = new AtomicReference<>();
    private final AtomicReference<zzxf> zzgsp = new AtomicReference<>();
    private zzdez zzgsq = null;

    public zzdez(zzdih zzdihVar) {
        this.zzgqx = zzdihVar;
    }

    public static zzdez zza(zzdez zzdezVar) {
        zzdez zzdezVar2 = new zzdez(zzdezVar.zzgqx);
        zzdezVar2.zzb(zzdezVar);
        return zzdezVar2;
    }

    public final void zzb(zzatn zzatnVar) {
        this.zzgsk.set(zzatnVar);
    }

    public final void zzb(zzatk zzatkVar) {
        this.zzgsl.set(zzatkVar);
    }

    public final void zzb(zzats zzatsVar) {
        this.zzgsn.set(zzatsVar);
    }

    public final void zza(AdMetadataListener adMetadataListener) {
        this.zzgsj.set(adMetadataListener);
    }

    public final void zzc(zzxf zzxfVar) {
        this.zzgsp.set(zzxfVar);
    }

    @Deprecated
    public final void zzb(zzasn zzasnVar) {
        this.zzgsm.set(zzasnVar);
    }

    @Deprecated
    public final void zzb(zzasi zzasiVar) {
        this.zzgso.set(zzasiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void onAdLoaded() {
        zzdez zzdezVar = this;
        while (true) {
            zzdez zzdezVar2 = zzdezVar.zzgsq;
            if (zzdezVar2 == null) {
                zzdek.zza(zzdezVar.zzgsk, zzdfc.zzgrd);
                zzdek.zza(zzdezVar.zzgsm, zzdfb.zzgrd);
                return;
            }
            zzdezVar = zzdezVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void onAdFailedToLoad(final int i) {
        zzdez zzdezVar = this;
        while (true) {
            zzdez zzdezVar2 = zzdezVar.zzgsq;
            if (zzdezVar2 == null) {
                zzdek.zza(zzdezVar.zzgsk, new zzdej(i) { // from class: com.google.android.gms.internal.ads.zzdfm
                    private final int zzdzl;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdzl = i;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdej
                    public final void zzr(Object obj) {
                        ((zzatn) obj).onRewardedAdFailedToLoad(this.zzdzl);
                    }
                });
                zzdek.zza(zzdezVar.zzgsm, new zzdej(i) { // from class: com.google.android.gms.internal.ads.zzdfl
                    private final int zzdzl;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdzl = i;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdej
                    public final void zzr(Object obj) {
                        ((zzasn) obj).onRewardedVideoAdFailedToLoad(this.zzdzl);
                    }
                });
                return;
            }
            zzdezVar = zzdezVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdOpened() {
        zzdez zzdezVar = this;
        while (true) {
            zzdez zzdezVar2 = zzdezVar.zzgsq;
            if (zzdezVar2 == null) {
                zzdek.zza(zzdezVar.zzgsl, zzdfo.zzgrd);
                zzdek.zza(zzdezVar.zzgsm, zzdfn.zzgrd);
                return;
            }
            zzdezVar = zzdezVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdClosed() {
        zzdez zzdezVar = this;
        while (true) {
            zzdez zzdezVar2 = zzdezVar.zzgsq;
            if (zzdezVar2 == null) {
                zzdezVar.zzgqx.onAdClosed();
                zzdek.zza(zzdezVar.zzgsl, zzdfq.zzgrd);
                zzdek.zza(zzdezVar.zzgsm, zzdfp.zzgrd);
                return;
            }
            zzdezVar = zzdezVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdLeftApplication() {
        zzdez zzdezVar = this;
        while (true) {
            zzdez zzdezVar2 = zzdezVar.zzgsq;
            if (zzdezVar2 == null) {
                zzdek.zza(zzdezVar.zzgsm, zzdfs.zzgrd);
                return;
            }
            zzdezVar = zzdezVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onRewardedVideoStarted() {
        zzdez zzdezVar = this;
        while (true) {
            zzdez zzdezVar2 = zzdezVar.zzgsq;
            if (zzdezVar2 == null) {
                zzdek.zza(zzdezVar.zzgsm, zzdfr.zzgrd);
                return;
            }
            zzdezVar = zzdezVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zzb(final zzasd zzasdVar, final String str, final String str2) {
        zzdez zzdezVar = this;
        while (true) {
            zzdez zzdezVar2 = zzdezVar.zzgsq;
            if (zzdezVar2 == null) {
                zzdek.zza(zzdezVar.zzgsl, new zzdej(zzasdVar) { // from class: com.google.android.gms.internal.ads.zzdfe
                    private final zzasd zzfnj;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfnj = zzasdVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdej
                    public final void zzr(Object obj) {
                        zzasd zzasdVar2 = this.zzfnj;
                        ((zzatk) obj).zza(new zzaub(zzasdVar2.getType(), zzasdVar2.getAmount()));
                    }
                });
                zzdek.zza(zzdezVar.zzgsn, new zzdej(zzasdVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdfd
                    private final String zzdbv;
                    private final String zzdep;
                    private final zzasd zzfnj;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfnj = zzasdVar;
                        this.zzdbv = str;
                        this.zzdep = str2;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdej
                    public final void zzr(Object obj) {
                        zzasd zzasdVar2 = this.zzfnj;
                        ((zzats) obj).zza(new zzaub(zzasdVar2.getType(), zzasdVar2.getAmount()), this.zzdbv, this.zzdep);
                    }
                });
                zzdek.zza(zzdezVar.zzgsm, new zzdej(zzasdVar) { // from class: com.google.android.gms.internal.ads.zzdfg
                    private final zzasd zzfnj;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfnj = zzasdVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdej
                    public final void zzr(Object obj) {
                        ((zzasn) obj).zza(this.zzfnj);
                    }
                });
                zzdek.zza(zzdezVar.zzgso, new zzdej(zzasdVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdff
                    private final String zzdbv;
                    private final String zzdep;
                    private final zzasd zzfnj;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfnj = zzasdVar;
                        this.zzdbv = str;
                        this.zzdep = str2;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdej
                    public final void zzr(Object obj) {
                        ((zzasi) obj).zza(this.zzfnj, this.zzdbv, this.zzdep);
                    }
                });
                return;
            }
            zzdezVar = zzdezVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onRewardedVideoCompleted() {
        zzdez zzdezVar = this;
        while (true) {
            zzdez zzdezVar2 = zzdezVar.zzgsq;
            if (zzdezVar2 == null) {
                zzdek.zza(zzdezVar.zzgsm, zzdfi.zzgrd);
                return;
            }
            zzdezVar = zzdezVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzcx(final int i) {
        zzdez zzdezVar = this;
        while (true) {
            zzdez zzdezVar2 = zzdezVar.zzgsq;
            if (zzdezVar2 == null) {
                zzdek.zza(zzdezVar.zzgsl, new zzdej(i) { // from class: com.google.android.gms.internal.ads.zzdfh
                    private final int zzdzl;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdzl = i;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdej
                    public final void zzr(Object obj) {
                        ((zzatk) obj).onRewardedAdFailedToShow(this.zzdzl);
                    }
                });
                return;
            }
            zzdezVar = zzdezVar2;
        }
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        zzdez zzdezVar = this.zzgsq;
        if (zzdezVar != null) {
            zzdezVar.onAdMetadataChanged();
        } else {
            zzdek.zza(this.zzgsj, zzdfk.zzgrd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzb(final zzuo zzuoVar) {
        zzdez zzdezVar = this;
        while (true) {
            zzdez zzdezVar2 = zzdezVar.zzgsq;
            if (zzdezVar2 == null) {
                zzdek.zza(zzdezVar.zzgsp, new zzdej(zzuoVar) { // from class: com.google.android.gms.internal.ads.zzdfj
                    private final zzuo zzgjr;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgjr = zzuoVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdej
                    public final void zzr(Object obj) {
                        ((zzxf) obj).zza(this.zzgjr);
                    }
                });
                return;
            }
            zzdezVar = zzdezVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final void zzb(zzder zzderVar) {
        this.zzgsq = (zzdez) zzderVar;
    }
}
