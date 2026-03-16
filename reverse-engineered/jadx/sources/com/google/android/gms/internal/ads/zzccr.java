package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzccr {
    private final Executor zzfhi;
    private final zzdhe zzfll;
    private final zzcey zzfud;

    public zzccr(zzdhe zzdheVar, Executor executor, zzcey zzceyVar) {
        this.zzfll = zzdheVar;
        this.zzfhi = executor;
        this.zzfud = zzceyVar;
    }

    public final zzdri<zzbek> zzn(final JSONObject jSONObject) {
        return zzdqw.zzb(zzdqw.zzb(zzdqw.zzag(null), new zzdqj(this) { // from class: com.google.android.gms.internal.ads.zzccs
            private final zzccr zzfvs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvs = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzfvs.zzq(obj);
            }
        }, this.zzfhi), new zzdqj(this, jSONObject) { // from class: com.google.android.gms.internal.ads.zzccq
            private final JSONObject zzfhd;
            private final zzccr zzfvs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvs = this;
                this.zzfhd = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzfvs.zza(this.zzfhd, (zzbek) obj);
            }
        }, this.zzfhi);
    }

    public final zzdri<zzbek> zzo(final String str, final String str2) {
        return zzdqw.zzb(zzdqw.zzag(null), new zzdqj(this, str, str2) { // from class: com.google.android.gms.internal.ads.zzcct
            private final String zzdbv;
            private final String zzdep;
            private final zzccr zzfvs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvs = this;
                this.zzdbv = str;
                this.zzdep = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzfvs.zza(this.zzdbv, this.zzdep, obj);
            }
        }, this.zzfhi);
    }

    private final void zzk(zzbek zzbekVar) {
        zzbekVar.zza("/video", zzafn.zzdaj);
        zzbekVar.zza("/videoMeta", zzafn.zzdak);
        zzbekVar.zza("/precache", new zzbdu());
        zzbekVar.zza("/delayPageLoaded", zzafn.zzdan);
        zzbekVar.zza("/instrument", zzafn.zzdal);
        zzbekVar.zza("/log", zzafn.zzdae);
        zzbekVar.zza("/videoClicked", zzafn.zzdaf);
        zzbekVar.zzabj().zzay(true);
        zzbekVar.zza("/click", zzafn.zzdaa);
        if (this.zzfll.zzdno != null) {
            zzbekVar.zzabj().zzaz(true);
            zzbekVar.zza("/open", new zzage(null, null));
            return;
        }
        zzbekVar.zzabj().zzaz(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzq(Object obj) throws Exception {
        zzbek zza = this.zzfud.zza(zzum.zzph(), false);
        final zzbak zzl = zzbak.zzl(zza);
        zzk(zza);
        zza.zzabj().zza(new zzbfy(zzl) { // from class: com.google.android.gms.internal.ads.zzccv
            private final zzbak zzeis;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeis = zzl;
            }

            @Override // com.google.android.gms.internal.ads.zzbfy
            public final void zzsw() {
                this.zzeis.zzyj();
            }
        });
        zza.loadUrl((String) zzvj.zzpv().zzd(zzzz.zzcos));
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(String str, String str2, Object obj) throws Exception {
        final zzbek zza = this.zzfud.zza(zzum.zzph(), false);
        final zzbak zzl = zzbak.zzl(zza);
        zzk(zza);
        if (this.zzfll.zzdno != null) {
            zza.zza(zzbfz.zzacn());
        } else {
            zza.zza(zzbfz.zzacm());
        }
        zza.zzabj().zza(new zzbfv(this, zza, zzl) { // from class: com.google.android.gms.internal.ads.zzccu
            private final zzccr zzfvs;
            private final zzbek zzfvt;
            private final zzbak zzfvu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvs = this;
                this.zzfvt = zza;
                this.zzfvu = zzl;
            }

            @Override // com.google.android.gms.internal.ads.zzbfv
            public final void zzak(boolean z) {
                this.zzfvs.zza(this.zzfvt, this.zzfvu, z);
            }
        });
        zza.zzb(str, str2, null);
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbek zzbekVar, zzbak zzbakVar, boolean z) {
        if (z) {
            if (this.zzfll.zzguv != null && zzbekVar.zzzf() != null) {
                zzbekVar.zzzf().zzb(this.zzfll.zzguv);
            }
            zzbakVar.zzyj();
            return;
        }
        zzbakVar.setException(new zzcqm("Instream video Web View failed to load.", 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(JSONObject jSONObject, final zzbek zzbekVar) throws Exception {
        final zzbak zzl = zzbak.zzl(zzbekVar);
        if (this.zzfll.zzdno != null) {
            zzbekVar.zza(zzbfz.zzacn());
        } else {
            zzbekVar.zza(zzbfz.zzacm());
        }
        zzbekVar.zzabj().zza(new zzbfv(this, zzbekVar, zzl) { // from class: com.google.android.gms.internal.ads.zzccx
            private final zzccr zzfvs;
            private final zzbek zzfvt;
            private final zzbak zzfvu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvs = this;
                this.zzfvt = zzbekVar;
                this.zzfvu = zzl;
            }

            @Override // com.google.android.gms.internal.ads.zzbfv
            public final void zzak(boolean z) {
                this.zzfvs.zzb(this.zzfvt, this.zzfvu, z);
            }
        });
        zzbekVar.zza("google.afma.nativeAds.renderVideo", jSONObject);
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzbek zzbekVar, zzbak zzbakVar, boolean z) {
        if (this.zzfll.zzguv != null && zzbekVar.zzzf() != null) {
            zzbekVar.zzzf().zzb(this.zzfll.zzguv);
        }
        zzbakVar.zzyj();
    }
}
