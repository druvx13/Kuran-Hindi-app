package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbsf;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcru<AdT, AdapterT, ListenerT extends zzbsf> implements zzcnj<AdT> {
    private final zzcnk<AdapterT, ListenerT> zzffp;
    private final zzdku zzflm;
    private final zzcnm<AdT, AdapterT, ListenerT> zzghq;
    private final zzdrh zzghr;

    public zzcru(zzdku zzdkuVar, zzdrh zzdrhVar, zzcnk<AdapterT, ListenerT> zzcnkVar, zzcnm<AdT, AdapterT, ListenerT> zzcnmVar) {
        this.zzflm = zzdkuVar;
        this.zzghr = zzdrhVar;
        this.zzghq = zzcnmVar;
        this.zzffp = zzcnkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final boolean zza(zzdha zzdhaVar, zzdgo zzdgoVar) {
        return !zzdgoVar.zzgts.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final zzdri<AdT> zzb(final zzdha zzdhaVar, final zzdgo zzdgoVar) {
        final zzcnl<AdapterT, ListenerT> zzcnlVar;
        Iterator<String> it = zzdgoVar.zzgts.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzcnlVar = null;
                break;
            }
            try {
                zzcnlVar = this.zzffp.zzf(it.next(), zzdgoVar.zzgtu);
                break;
            } catch (zzdhk unused) {
            }
        }
        if (zzcnlVar == null) {
            return zzdqw.immediateFailedFuture(new zzcpy("unable to instantiate mediation adapter class"));
        }
        zzbaj zzbajVar = new zzbaj();
        zzcnlVar.zzgel.zza(new zzcrz(this, zzbajVar));
        if (zzdgoVar.zzdpp) {
            Bundle bundle = zzdhaVar.zzgur.zzfll.zzguw.zzcen;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        return this.zzflm.zzu(zzdkr.ADAPTER_LOAD_AD_SYN).zza(new zzdke(this, zzdhaVar, zzdgoVar, zzcnlVar) { // from class: com.google.android.gms.internal.ads.zzcrx
            private final zzdgo zzfjm;
            private final zzdha zzfvc;
            private final zzcnl zzghm;
            private final zzcru zzghs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghs = this;
                this.zzfvc = zzdhaVar;
                this.zzfjm = zzdgoVar;
                this.zzghm = zzcnlVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdke
            public final void run() {
                this.zzghs.zzd(this.zzfvc, this.zzfjm, this.zzghm);
            }
        }, this.zzghr).zzw(zzdkr.ADAPTER_LOAD_AD_ACK).zze(zzbajVar).zzw(zzdkr.ADAPTER_WRAP_ADAPTER).zzb(new zzdkb(this, zzdhaVar, zzdgoVar, zzcnlVar) { // from class: com.google.android.gms.internal.ads.zzcrw
            private final zzdgo zzfjm;
            private final zzdha zzfvc;
            private final zzcnl zzghm;
            private final zzcru zzghs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghs = this;
                this.zzfvc = zzdhaVar;
                this.zzfjm = zzdgoVar;
                this.zzghm = zzcnlVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdkb
            public final Object apply(Object obj) {
                return this.zzghs.zza(this.zzfvc, this.zzfjm, this.zzghm, (Void) obj);
            }
        }).zzaud();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl zzcnlVar, Void r4) throws Exception {
        return this.zzghq.zzb(zzdhaVar, zzdgoVar, zzcnlVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl zzcnlVar) throws Exception {
        this.zzghq.zza(zzdhaVar, zzdgoVar, zzcnlVar);
    }
}
