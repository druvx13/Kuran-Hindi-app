package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcfa {
    private final zzaun zzblv;
    private final zzdt zzejl;
    private final Executor zzfhi;
    private final zzbrx zzflh;
    private final zzbsu zzfpb;
    private final zzbqw zzfqd;
    private final zzbkp zzfqe;
    private final zzbvs zzfqg;
    private final zzbsl zzfwn;
    private final zzbtw zzfwo;
    private final com.google.android.gms.ads.internal.zzc zzfxc;
    private final zzbrr zzfxd;
    private final zzbtl zzfxe;

    public zzcfa(zzbqw zzbqwVar, zzbrx zzbrxVar, zzbsl zzbslVar, zzbsu zzbsuVar, zzbtw zzbtwVar, Executor executor, zzbvs zzbvsVar, zzbkp zzbkpVar, com.google.android.gms.ads.internal.zzc zzcVar, zzbrr zzbrrVar, zzaun zzaunVar, zzdt zzdtVar, zzbtl zzbtlVar) {
        this.zzfqd = zzbqwVar;
        this.zzflh = zzbrxVar;
        this.zzfwn = zzbslVar;
        this.zzfpb = zzbsuVar;
        this.zzfwo = zzbtwVar;
        this.zzfhi = executor;
        this.zzfqg = zzbvsVar;
        this.zzfqe = zzbkpVar;
        this.zzfxc = zzcVar;
        this.zzfxd = zzbrrVar;
        this.zzblv = zzaunVar;
        this.zzejl = zzdtVar;
        this.zzfxe = zzbtlVar;
    }

    public final void zzb(final zzbek zzbekVar, boolean z) {
        zzdj zzcb;
        zzbekVar.zzabj().zza(new zzub(this) { // from class: com.google.android.gms.internal.ads.zzcfd
            private final zzcfa zzfxg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxg = this;
            }

            @Override // com.google.android.gms.internal.ads.zzub
            public final void onAdClicked() {
                this.zzfxg.zzamx();
            }
        }, this.zzfwn, this.zzfpb, new zzafl(this) { // from class: com.google.android.gms.internal.ads.zzcfc
            private final zzcfa zzfxg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxg = this;
            }

            @Override // com.google.android.gms.internal.ads.zzafl
            public final void onAppEvent(String str, String str2) {
                this.zzfxg.zzp(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzt(this) { // from class: com.google.android.gms.internal.ads.zzcff
            private final zzcfa zzfxg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxg = this;
            }

            @Override // com.google.android.gms.ads.internal.overlay.zzt
            public final void zzuq() {
                this.zzfxg.zzamw();
            }
        }, z, null, this.zzfxc, new zzcfk(this), this.zzblv);
        zzbekVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.google.android.gms.internal.ads.zzcfe
            private final zzcfa zzfxg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxg = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.zzfxg.zza(view, motionEvent);
            }
        });
        zzbekVar.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.gms.internal.ads.zzcfh
            private final zzcfa zzfxg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxg = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.zzfxg.zzad(view);
            }
        });
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcnt)).booleanValue() && (zzcb = this.zzejl.zzcb()) != null) {
            zzcb.zzb(zzbekVar.getView());
        }
        this.zzfqg.zza(zzbekVar, this.zzfhi);
        this.zzfqg.zza(new zzpz(zzbekVar) { // from class: com.google.android.gms.internal.ads.zzcfg
            private final zzbek zzelg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzelg = zzbekVar;
            }

            @Override // com.google.android.gms.internal.ads.zzpz
            public final void zza(zzqa zzqaVar) {
                this.zzelg.zzabj().zza(zzqaVar.zzbpe.left, zzqaVar.zzbpe.top, false);
            }
        }, this.zzfhi);
        this.zzfqg.zzu(zzbekVar.getView());
        zzbekVar.zza("/trackActiveViewUnit", new zzaga(this, zzbekVar) { // from class: com.google.android.gms.internal.ads.zzcfj
            private final zzbek zzfvt;
            private final zzcfa zzfxg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxg = this;
                this.zzfvt = zzbekVar;
            }

            @Override // com.google.android.gms.internal.ads.zzaga
            public final void zza(Object obj, Map map) {
                this.zzfxg.zza(this.zzfvt, (zzbek) obj, map);
            }
        });
        this.zzfqe.zzo(zzbekVar);
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcli)).booleanValue()) {
            return;
        }
        zzbrr zzbrrVar = this.zzfxd;
        zzbekVar.getClass();
        zzbrrVar.zza(zzcfi.zzn(zzbekVar), this.zzfhi);
    }

    public static zzdri<?> zza(zzbek zzbekVar, String str, String str2) {
        final zzbaj zzbajVar = new zzbaj();
        zzbekVar.zzabj().zza(new zzbfv(zzbajVar) { // from class: com.google.android.gms.internal.ads.zzcfl
            private final zzbaj zzbsx;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbsx = zzbajVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbfv
            public final void zzak(boolean z) {
                zzbaj zzbajVar2 = this.zzbsx;
                if (z) {
                    zzbajVar2.set(null);
                } else {
                    zzbajVar2.setException(new Exception("Ad Web View failed to load."));
                }
            }
        });
        zzbekVar.zzb(str, str2, null);
        return zzbajVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbek zzbekVar, zzbek zzbekVar2, Map map) {
        this.zzfqe.zzf(zzbekVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzad(View view) {
        this.zzfxc.recordClick();
        zzaun zzaunVar = this.zzblv;
        if (zzaunVar != null) {
            zzaunVar.zzvh();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ boolean zza(View view, MotionEvent motionEvent) {
        this.zzfxc.recordClick();
        zzaun zzaunVar = this.zzblv;
        if (zzaunVar != null) {
            zzaunVar.zzvh();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzamw() {
        this.zzflh.onAdLeftApplication();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(String str, String str2) {
        this.zzfwo.onAppEvent(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzamx() {
        this.zzfqd.onAdClicked();
    }
}
