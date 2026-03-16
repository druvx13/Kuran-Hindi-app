package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsv;
import com.google.android.gms.internal.ads.zztf;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcgs implements zzbrc, zzbrp, zzbsm, zzbtm, zzbuf, zzub {
    private final zzst zzfyd;
    private boolean zzfye = false;
    private boolean zzfyf = false;

    public zzcgs(zzst zzstVar, @Nullable zzdfa zzdfaVar) {
        this.zzfyd = zzstVar;
        zzstVar.zza(zzsv.zza.EnumC0024zza.AD_REQUEST);
        if (zzdfaVar != null) {
            zzstVar.zza(zzsv.zza.EnumC0024zza.REQUEST_IS_PREFETCH);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzd(zzarj zzarjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzb(final zzdha zzdhaVar) {
        this.zzfyd.zza(new zzsw(zzdhaVar) { // from class: com.google.android.gms.internal.ads.zzcgv
            private final zzdha zzfnp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfnp = zzdhaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzsw
            public final void zza(zztf.zzi.zza zzaVar) {
                zzaVar.zza(zzaVar.zzny().zzbew().zza(zzaVar.zzny().zznc().zzbew().zzbw(this.zzfnp.zzgus.zzgup.zzdoh)));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void onAdLoaded() {
        this.zzfyd.zza(zzsv.zza.EnumC0024zza.AD_LOADED);
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void onAdFailedToLoad(int i) {
        switch (i) {
            case 1:
                this.zzfyd.zza(zzsv.zza.EnumC0024zza.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                return;
            case 2:
                this.zzfyd.zza(zzsv.zza.EnumC0024zza.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                return;
            case 3:
                this.zzfyd.zza(zzsv.zza.EnumC0024zza.AD_FAILED_TO_LOAD_NO_FILL);
                return;
            case 4:
                this.zzfyd.zza(zzsv.zza.EnumC0024zza.AD_FAILED_TO_LOAD_TIMEOUT);
                return;
            case 5:
                this.zzfyd.zza(zzsv.zza.EnumC0024zza.AD_FAILED_TO_LOAD_CANCELLED);
                return;
            case 6:
                this.zzfyd.zza(zzsv.zza.EnumC0024zza.AD_FAILED_TO_LOAD_NO_ERROR);
                return;
            case 7:
                this.zzfyd.zza(zzsv.zza.EnumC0024zza.AD_FAILED_TO_LOAD_NOT_FOUND);
                return;
            default:
                this.zzfyd.zza(zzsv.zza.EnumC0024zza.AD_FAILED_TO_LOAD);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final synchronized void onAdImpression() {
        this.zzfyd.zza(zzsv.zza.EnumC0024zza.AD_IMPRESSION);
    }

    @Override // com.google.android.gms.internal.ads.zzub
    public final synchronized void onAdClicked() {
        if (!this.zzfyf) {
            this.zzfyd.zza(zzsv.zza.EnumC0024zza.AD_FIRST_CLICK);
            this.zzfyf = true;
            return;
        }
        this.zzfyd.zza(zzsv.zza.EnumC0024zza.AD_SUBSEQUENT_CLICK);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzc(final zztf.zzb zzbVar) {
        this.zzfyd.zza(new zzsw(zzbVar) { // from class: com.google.android.gms.internal.ads.zzcgu
            private final zztf.zzb zzfnr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfnr = zzbVar;
            }

            @Override // com.google.android.gms.internal.ads.zzsw
            public final void zza(zztf.zzi.zza zzaVar) {
                zzaVar.zzb(this.zzfnr);
            }
        });
        this.zzfyd.zza(zzsv.zza.EnumC0024zza.REQUEST_LOADED_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzd(final zztf.zzb zzbVar) {
        this.zzfyd.zza(new zzsw(zzbVar) { // from class: com.google.android.gms.internal.ads.zzcgx
            private final zztf.zzb zzfnr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfnr = zzbVar;
            }

            @Override // com.google.android.gms.internal.ads.zzsw
            public final void zza(zztf.zzi.zza zzaVar) {
                zzaVar.zzb(this.zzfnr);
            }
        });
        this.zzfyd.zza(zzsv.zza.EnumC0024zza.REQUEST_SAVED_TO_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zze(final zztf.zzb zzbVar) {
        this.zzfyd.zza(new zzsw(zzbVar) { // from class: com.google.android.gms.internal.ads.zzcgw
            private final zztf.zzb zzfnr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfnr = zzbVar;
            }

            @Override // com.google.android.gms.internal.ads.zzsw
            public final void zza(zztf.zzi.zza zzaVar) {
                zzaVar.zzb(this.zzfnr);
            }
        });
        this.zzfyd.zza(zzsv.zza.EnumC0024zza.REQUEST_PREFETCH_INTERCEPTED);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzbg(boolean z) {
        zzsv.zza.EnumC0024zza enumC0024zza;
        zzst zzstVar = this.zzfyd;
        if (z) {
            enumC0024zza = zzsv.zza.EnumC0024zza.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED;
        } else {
            enumC0024zza = zzsv.zza.EnumC0024zza.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED;
        }
        zzstVar.zza(enumC0024zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzbh(boolean z) {
        zzsv.zza.EnumC0024zza enumC0024zza;
        zzst zzstVar = this.zzfyd;
        if (z) {
            enumC0024zza = zzsv.zza.EnumC0024zza.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED;
        } else {
            enumC0024zza = zzsv.zza.EnumC0024zza.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED;
        }
        zzstVar.zza(enumC0024zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzaja() {
        this.zzfyd.zza(zzsv.zza.EnumC0024zza.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }
}
