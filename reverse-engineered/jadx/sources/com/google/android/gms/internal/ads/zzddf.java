package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzddf extends zzvy implements com.google.android.gms.ads.internal.overlay.zzy, zzbsr, zzrh {
    private final zzazz zzbml;
    private final String zzbsc;
    private final ViewGroup zzfiv;
    private final zzbgy zzggh;
    private final Context zzgiz;
    private AtomicBoolean zzgqi = new AtomicBoolean();
    private final zzdcz zzgqj;
    private final zzddn zzgqk;
    private long zzgql;
    private zzblc zzgqm;
    protected zzblr zzgqn;

    public zzddf(zzbgy zzbgyVar, Context context, String str, zzdcz zzdczVar, zzddn zzddnVar, zzazz zzazzVar) {
        this.zzfiv = new FrameLayout(context);
        this.zzggh = zzbgyVar;
        this.zzgiz = context;
        this.zzbsc = str;
        this.zzgqj = zzdczVar;
        this.zzgqk = zzddnVar;
        zzddnVar.zza(this);
        this.zzbml = zzazzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean isReady() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void showInterstitial() {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void stopLoading() {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzapq zzapqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzapw zzapwVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzasn zzasnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzvl zzvlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzvm zzvmVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzwc zzwcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzwh zzwhVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzxf zzxfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzxr zzxrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzbn(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzwh zzkj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzvm zzkk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final IObjectWrapper zzke() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzfiv);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzut zzutVar) {
        this.zzgqj.zza(zzutVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized boolean zza(zzuj zzujVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzq.zzkw();
        if (zzaxa.zzbd(this.zzgiz) && zzujVar.zzceu == null) {
            zzawr.zzfa("Failed to load the ad because app ID is missing.");
            this.zzgqk.onAdFailedToLoad(8);
            return false;
        } else if (isLoading()) {
            return false;
        } else {
            this.zzgqi = new AtomicBoolean();
            return this.zzgqj.zza(zzujVar, this.zzbsc, new zzddk(this), new zzddj(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.gms.ads.internal.overlay.zzq zza(zzblr zzblrVar) {
        boolean zzaap = zzblrVar.zzaap();
        int intValue = ((Integer) zzvj.zzpv().zzd(zzzz.zzcqp)).intValue();
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = new com.google.android.gms.ads.internal.overlay.zzp();
        zzpVar.size = 50;
        zzpVar.paddingLeft = zzaap ? intValue : 0;
        zzpVar.paddingRight = zzaap ? 0 : intValue;
        zzpVar.paddingTop = 0;
        zzpVar.paddingBottom = intValue;
        return new com.google.android.gms.ads.internal.overlay.zzq(this.zzgiz, zzpVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RelativeLayout.LayoutParams zzb(zzblr zzblrVar) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(zzblrVar.zzaap() ? 11 : 9);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(zzblr zzblrVar) {
        zzblrVar.zza(this);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzy
    public final void zzug() {
        zzari();
    }

    @Override // com.google.android.gms.internal.ads.zzrh
    public final void zzms() {
        zzari();
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zzait() {
        if (this.zzgqn == null) {
            return;
        }
        this.zzgql = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime();
        int zzagv = this.zzgqn.zzagv();
        if (zzagv <= 0) {
            return;
        }
        zzblc zzblcVar = new zzblc(this.zzggh.zzacw(), com.google.android.gms.ads.internal.zzq.zzld());
        this.zzgqm = zzblcVar;
        zzblcVar.zza(zzagv, new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzddh
            private final zzddf zzgqs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgqs = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgqs.zzarh();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzarf */
    public final void zzari() {
        if (this.zzgqi.compareAndSet(false, true)) {
            zzblr zzblrVar = this.zzgqn;
            if (zzblrVar != null && zzblrVar.zzahg() != null) {
                this.zzgqk.zzb(this.zzgqn.zzahg());
            }
            this.zzgqk.onAdClosed();
            this.zzfiv.removeAllViews();
            zzblc zzblcVar = this.zzgqm;
            if (zzblcVar != null) {
                com.google.android.gms.ads.internal.zzq.zzkz().zzb(zzblcVar);
            }
            zzblr zzblrVar2 = this.zzgqn;
            if (zzblrVar2 != null) {
                zzblrVar2.zzfd(com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - this.zzgql);
            }
            destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzum zzarg() {
        return zzdhh.zzb(this.zzgiz, Collections.singletonList(this.zzgqn.zzahd()));
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzgqn != null) {
            this.zzgqn.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzrn zzrnVar) {
        this.zzgqk.zzb(zzrnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized zzum zzkg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        if (this.zzgqn != null) {
            return zzdhh.zzb(this.zzgiz, Collections.singletonList(this.zzgqn.zzahd()));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void zza(zzum zzumVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized String getMediationAdapterClassName() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized String zzkh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized zzxg zzki() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized boolean isLoading() {
        return this.zzgqj.isLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized String getAdUnitId() {
        return this.zzbsc;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void zzkf() {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void zza(zzwn zzwnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void setManualImpressionsEnabled(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized zzxl getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void zza(zzze zzzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void zza(zzaas zzaasVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final Bundle getAdMetadata() {
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzarh() {
        this.zzggh.zzacv().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzddi
            private final zzddf zzgqs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgqs = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgqs.zzari();
            }
        });
    }
}
