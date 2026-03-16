package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzajf {
    private final Object lock;
    private int status;
    private final zzazz zzbmo;
    private final String zzdcp;
    private zzayf<zzais> zzdcq;
    private zzayf<zzais> zzdcr;
    private zzajw zzdcs;
    private final Context zzvf;

    public zzajf(Context context, zzazz zzazzVar, String str) {
        this.lock = new Object();
        this.status = 1;
        this.zzdcp = str;
        this.zzvf = context.getApplicationContext();
        this.zzbmo = zzazzVar;
        this.zzdcq = new zzajt();
        this.zzdcr = new zzajt();
    }

    public zzajf(Context context, zzazz zzazzVar, String str, zzayf<zzais> zzayfVar, zzayf<zzais> zzayfVar2) {
        this(context, zzazzVar, str);
        this.zzdcq = zzayfVar;
        this.zzdcr = zzayfVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzajw zza(final zzdt zzdtVar) {
        final zzajw zzajwVar = new zzajw(this.zzdcr);
        zzbab.zzdzv.execute(new Runnable(this, zzdtVar, zzajwVar) { // from class: com.google.android.gms.internal.ads.zzaje
            private final zzajf zzdcm;
            private final zzdt zzdcn;
            private final zzajw zzdco;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdcm = this;
                this.zzdcn = zzdtVar;
                this.zzdco = zzajwVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdcm.zza(this.zzdcn, this.zzdco);
            }
        });
        zzajwVar.zza(new zzajo(this, zzajwVar), new zzajr(this, zzajwVar));
        return zzajwVar;
    }

    public final zzajs zzb(zzdt zzdtVar) {
        synchronized (this.lock) {
            synchronized (this.lock) {
                if (this.zzdcs != null && this.status == 0) {
                    this.zzdcs.zza(new zzban(this) { // from class: com.google.android.gms.internal.ads.zzajh
                        private final zzajf zzdcm;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdcm = this;
                        }

                        @Override // com.google.android.gms.internal.ads.zzban
                        public final void zzh(Object obj) {
                            this.zzdcm.zza((zzais) obj);
                        }
                    }, zzajg.zzdct);
                }
            }
            if (this.zzdcs != null && this.zzdcs.getStatus() != -1) {
                if (this.status == 0) {
                    return this.zzdcs.zzsx();
                } else if (this.status == 1) {
                    this.status = 2;
                    zza((zzdt) null);
                    return this.zzdcs.zzsx();
                } else if (this.status == 2) {
                    return this.zzdcs.zzsx();
                } else {
                    return this.zzdcs.zzsx();
                }
            }
            this.status = 2;
            zzajw zza = zza((zzdt) null);
            this.zzdcs = zza;
            return zza.zzsx();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzais zzaisVar) {
        if (zzaisVar.isDestroyed()) {
            this.status = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzdt zzdtVar, final zzajw zzajwVar) {
        final zzais zzaiuVar;
        try {
            Context context = this.zzvf;
            zzazz zzazzVar = this.zzbmo;
            if (zzabz.zzcyc.get().booleanValue()) {
                zzaiuVar = new zzaie(context, zzazzVar);
            } else {
                zzaiuVar = new zzaiu(context, zzazzVar, zzdtVar, null);
            }
            zzaiuVar.zza(new zzaiv(this, zzajwVar, zzaiuVar) { // from class: com.google.android.gms.internal.ads.zzajj
                private final zzajf zzdcm;
                private final zzajw zzdcu;
                private final zzais zzdcv;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdcm = this;
                    this.zzdcu = zzajwVar;
                    this.zzdcv = zzaiuVar;
                }

                @Override // com.google.android.gms.internal.ads.zzaiv
                public final void zzsv() {
                    zzaxa.zzdwf.postDelayed(new Runnable(this.zzdcm, this.zzdcu, this.zzdcv) { // from class: com.google.android.gms.internal.ads.zzaji
                        private final zzajf zzdcm;
                        private final zzajw zzdcu;
                        private final zzais zzdcv;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdcm = r1;
                            this.zzdcu = r2;
                            this.zzdcv = r3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzdcm.zza(this.zzdcu, this.zzdcv);
                        }
                    }, zzajq.zzdde);
                }
            });
            zzaiuVar.zza("/jsLoaded", new zzajk(this, zzajwVar, zzaiuVar));
            zzazb zzazbVar = new zzazb();
            zzajn zzajnVar = new zzajn(this, zzdtVar, zzaiuVar, zzazbVar);
            zzazbVar.set(zzajnVar);
            zzaiuVar.zza("/requestReload", zzajnVar);
            if (this.zzdcp.endsWith(".js")) {
                zzaiuVar.zzcx(this.zzdcp);
            } else if (this.zzdcp.startsWith("<html>")) {
                zzaiuVar.zzcy(this.zzdcp);
            } else {
                zzaiuVar.zzcz(this.zzdcp);
            }
            zzaxa.zzdwf.postDelayed(new zzajm(this, zzajwVar, zzaiuVar), zzajq.zzddd);
        } catch (Throwable th) {
            zzawr.zzc("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzq.zzla().zza(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzajwVar.reject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzajw zzajwVar, zzais zzaisVar) {
        synchronized (this.lock) {
            if (zzajwVar.getStatus() != -1 && zzajwVar.getStatus() != 1) {
                zzajwVar.reject();
                zzdrh zzdrhVar = zzbab.zzdzv;
                zzaisVar.getClass();
                zzdrhVar.execute(zzajl.zzb(zzaisVar));
                zzawr.zzeg("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
