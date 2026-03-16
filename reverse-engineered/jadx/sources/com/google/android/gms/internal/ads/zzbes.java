package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbes {
    public static zzdri<zzbek> zza(final Context context, final zzazz zzazzVar, final String str, final zzdt zzdtVar, final com.google.android.gms.ads.internal.zza zzaVar) {
        return zzdqw.zzb(zzdqw.zzag(null), new zzdqj(context, zzdtVar, zzazzVar, zzaVar, str) { // from class: com.google.android.gms.internal.ads.zzber
            private final Context zzcit;
            private final zzdt zzdcn;
            private final zzazz zzeip;
            private final com.google.android.gms.ads.internal.zza zzeiq;
            private final String zzeir;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcit = context;
                this.zzdcn = zzdtVar;
                this.zzeip = zzazzVar;
                this.zzeiq = zzaVar;
                this.zzeir = str;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                Context context2 = this.zzcit;
                zzdt zzdtVar2 = this.zzdcn;
                zzazz zzazzVar2 = this.zzeip;
                com.google.android.gms.ads.internal.zza zzaVar2 = this.zzeiq;
                String str2 = this.zzeir;
                com.google.android.gms.ads.internal.zzq.zzkx();
                zzbek zza = zzbes.zza(context2, zzbfz.zzacl(), "", false, false, zzdtVar2, zzazzVar2, null, null, zzaVar2, zzst.zzmz(), null, false);
                final zzbak zzl = zzbak.zzl(zza);
                zza.zzabj().zza(new zzbfv(zzl) { // from class: com.google.android.gms.internal.ads.zzbet
                    private final zzbak zzeis;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzeis = zzl;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbfv
                    public final void zzak(boolean z) {
                        this.zzeis.zzyj();
                    }
                });
                zza.loadUrl(str2);
                return zzl;
            }
        }, zzbab.zzdzv);
    }

    public static zzbek zza(final Context context, final zzbfz zzbfzVar, final String str, final boolean z, final boolean z2, final zzdt zzdtVar, final zzazz zzazzVar, zzaam zzaamVar, final com.google.android.gms.ads.internal.zzi zziVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzst zzstVar, final zzrv zzrvVar, final boolean z3) throws zzbew {
        zzzz.initialize(context);
        if (zzabz.zzcyb.get().booleanValue()) {
            return zzbgf.zza(context, zzbfzVar, str, z, z2, zzdtVar, zzazzVar, null, zziVar, zzaVar, zzstVar, zzrvVar, z3);
        }
        try {
            return (zzbek) zzaze.zza(new zzdon(context, zzbfzVar, str, z, z2, zzdtVar, zzazzVar, null, zziVar, zzaVar, zzstVar, zzrvVar, z3) { // from class: com.google.android.gms.internal.ads.zzbeu
                private final Context zzcit;
                private final String zzdep;
                private final zzbfz zzeit;
                private final boolean zzeiu;
                private final boolean zzeiv;
                private final zzdt zzeiw;
                private final zzazz zzeix;
                private final zzaam zzeiy = null;
                private final com.google.android.gms.ads.internal.zzi zzeiz;
                private final com.google.android.gms.ads.internal.zza zzeja;
                private final zzst zzejb;
                private final zzrv zzejc;
                private final boolean zzejd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzcit = context;
                    this.zzeit = zzbfzVar;
                    this.zzdep = str;
                    this.zzeiu = z;
                    this.zzeiv = z2;
                    this.zzeiw = zzdtVar;
                    this.zzeix = zzazzVar;
                    this.zzeiz = zziVar;
                    this.zzeja = zzaVar;
                    this.zzejb = zzstVar;
                    this.zzejc = zzrvVar;
                    this.zzejd = z3;
                }

                @Override // com.google.android.gms.internal.ads.zzdon
                public final Object get() {
                    Context context2 = this.zzcit;
                    zzbfz zzbfzVar2 = this.zzeit;
                    String str2 = this.zzdep;
                    boolean z4 = this.zzeiu;
                    boolean z5 = this.zzeiv;
                    zzdt zzdtVar2 = this.zzeiw;
                    zzazz zzazzVar2 = this.zzeix;
                    zzaam zzaamVar2 = this.zzeiy;
                    com.google.android.gms.ads.internal.zzi zziVar2 = this.zzeiz;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzeja;
                    zzst zzstVar2 = this.zzejb;
                    zzbev zzbevVar = new zzbev(zzbfa.zzb(context2, zzbfzVar2, str2, z4, z5, zzdtVar2, zzazzVar2, zzaamVar2, zziVar2, zzaVar2, zzstVar2, this.zzejc, this.zzejd));
                    zzbevVar.setWebViewClient(com.google.android.gms.ads.internal.zzq.zzky().zza(zzbevVar, zzstVar2, z5));
                    zzbevVar.setWebChromeClient(new zzbec(zzbevVar));
                    return zzbevVar;
                }
            });
        } catch (Throwable th) {
            throw new zzbew("Webview initialization failed.", th);
        }
    }
}
