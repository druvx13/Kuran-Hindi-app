package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbns;
import java.util.LinkedList;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdjd<AdT extends zzbns> {
    private final zzdio zzgrx;
    private final zzdih zzgxz;
    private zzdjj zzgya;
    private zzdrp<zzdiv<AdT>> zzgyb;
    private zzdri<zzdiv<AdT>> zzgyc;
    private final zzdjk<AdT> zzgye;
    private int zzgyd = zzdit.zzgxl;
    private final zzdqx<zzdiv<AdT>> zzgyg = new zzdji(this);
    private final LinkedList<zzdjj> zzgyf = new LinkedList<>();

    public zzdjd(zzdio zzdioVar, zzdih zzdihVar, zzdjk<AdT> zzdjkVar) {
        this.zzgrx = zzdioVar;
        this.zzgxz = zzdihVar;
        this.zzgye = zzdjkVar;
        this.zzgxz.zza(new zzdik(this) { // from class: com.google.android.gms.internal.ads.zzdjf
            private final zzdjd zzgyi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgyi = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdik
            public final void execute() {
                this.zzgyi.zzatf();
            }
        });
    }

    public final void zzb(zzdjj zzdjjVar) {
        this.zzgyf.add(zzdjjVar);
    }

    public final synchronized zzdri<zzdjh<AdT>> zzc(zzdjj zzdjjVar) {
        if (zzate()) {
            return null;
        }
        this.zzgyd = zzdit.zzgxn;
        if (this.zzgya.zzarl() != null && zzdjjVar.zzarl() != null && this.zzgya.zzarl().equals(zzdjjVar.zzarl())) {
            this.zzgyd = zzdit.zzgxm;
            return zzdqw.zzb(this.zzgyb, new zzdqj(this) { // from class: com.google.android.gms.internal.ads.zzdjg
                private final zzdjd zzgyi;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgyi = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdqj
                public final zzdri zzf(Object obj) {
                    return this.zzgyi.zzc((zzdiv) obj);
                }
            }, zzdjjVar.getExecutor());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(zzdjj zzdjjVar) {
        while (zzate()) {
            if (zzdjjVar == null && this.zzgyf.isEmpty()) {
                return;
            }
            if (zzdjjVar == null) {
                zzdjjVar = this.zzgyf.remove();
            }
            if (zzdjjVar.zzarl() != null && this.zzgrx.zzb(zzdjjVar.zzarl())) {
                this.zzgya = zzdjjVar.zzarm();
                this.zzgyb = zzdrp.zzaws();
                zzdri<zzdiv<AdT>> zza = this.zzgye.zza(this.zzgya);
                this.zzgyc = zza;
                zzdqw.zza(zza, this.zzgyg, zzdjjVar.getExecutor());
                return;
            }
            zzdjjVar = null;
        }
        if (zzdjjVar != null) {
            this.zzgyf.add(zzdjjVar);
        }
    }

    private final boolean zzate() {
        zzdri<zzdiv<AdT>> zzdriVar = this.zzgyc;
        return zzdriVar == null || zzdriVar.isDone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzatf() {
        synchronized (this) {
            zzd(this.zzgya);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzc(zzdiv zzdivVar) throws Exception {
        zzdri zzag;
        synchronized (this) {
            zzag = zzdqw.zzag(new zzdjh(zzdivVar, this.zzgya));
        }
        return zzag;
    }
}
