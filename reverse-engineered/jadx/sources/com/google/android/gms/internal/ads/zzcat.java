package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.AdChoicesView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcat {
    private final Executor executor;
    private final zzaci zzdhc;
    private final zzawt zzduw;
    private final Executor zzfhi;
    private final zzdhe zzfll;
    private final zzbzx zzfqb;
    private final zzcab zzfrc;
    private final zzbzs zzfrk;
    private final zzcbb zzftp;

    public zzcat(zzawt zzawtVar, zzdhe zzdheVar, zzcab zzcabVar, zzbzx zzbzxVar, zzcbb zzcbbVar, Executor executor, Executor executor2, zzbzs zzbzsVar) {
        this.zzduw = zzawtVar;
        this.zzfll = zzdheVar;
        this.zzdhc = zzdheVar.zzdhc;
        this.zzfrc = zzcabVar;
        this.zzfqb = zzbzxVar;
        this.zzftp = zzcbbVar;
        this.zzfhi = executor;
        this.executor = executor2;
        this.zzfrk = zzbzsVar;
    }

    public final void zza(final zzcbj zzcbjVar) {
        this.zzfhi.execute(new Runnable(this, zzcbjVar) { // from class: com.google.android.gms.internal.ads.zzcas
            private final zzcat zzftn;
            private final zzcbj zzfto;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzftn = this;
                this.zzfto = zzcbjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzftn.zzd(this.zzfto);
            }
        });
    }

    private static void zza(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i == 3) {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        } else {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        }
    }

    public final void zzc(zzcbj zzcbjVar) {
        if (zzcbjVar == null || this.zzftp == null || zzcbjVar.zzalw() == null || !this.zzfrc.zzali()) {
            return;
        }
        try {
            zzcbjVar.zzalw().addView(this.zzftp.zzamh());
        } catch (zzbew e) {
            zzawr.zza("web view can not be obtained", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zza(zzcbj zzcbjVar, String[] strArr) {
        Map<String, WeakReference<View>> zzalz = zzcbjVar.zzalz();
        if (zzalz == null) {
            return false;
        }
        for (String str : strArr) {
            if (zzalz.get(str) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean zza(ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        View zzala = this.zzfqb.zzala();
        if (zzala == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzala.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzala.getParent()).removeView(zzala);
        }
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcpa)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzala, layoutParams);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.zzfqb.zzala() != null) {
            if (2 == this.zzfqb.zzakw() || 1 == this.zzfqb.zzakw()) {
                this.zzduw.zza(this.zzfll.zzgux, String.valueOf(this.zzfqb.zzakw()), z);
            } else if (6 == this.zzfqb.zzakw()) {
                this.zzduw.zza(this.zzfll.zzgux, "2", z);
                this.zzduw.zza(this.zzfll.zzgux, "1", z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzcbj zzcbjVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        IObjectWrapper zzrv;
        Drawable drawable;
        int i = 0;
        if (this.zzfrc.zzalk() || this.zzfrc.zzalj()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW};
            for (int i2 = 0; i2 < 2; i2++) {
                View zzgd = zzcbjVar.zzgd(strArr[i2]);
                if (zzgd != null && (zzgd instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzgd;
                    break;
                }
            }
        }
        viewGroup = null;
        boolean z = viewGroup != null;
        Context context = zzcbjVar.zzahe().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.zzfqb.zzakx() != null) {
            view = this.zzfqb.zzakx();
            zzaci zzaciVar = this.zzdhc;
            if (zzaciVar != null && !z) {
                zza(layoutParams, zzaciVar.zzbla);
                view.setLayoutParams(layoutParams);
            }
        } else if (this.zzfqb.zzsb() instanceof zzacd) {
            zzacd zzacdVar = (zzacd) this.zzfqb.zzsb();
            if (!z) {
                zza(layoutParams, zzacdVar.zzru());
            }
            View zzaccVar = new zzacc(context, zzacdVar, layoutParams);
            zzaccVar.setContentDescription((CharSequence) zzvj.zzpv().zzd(zzzz.zzcox));
            view = zzaccVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (z) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                AdChoicesView adChoicesView = new AdChoicesView(zzcbjVar.zzahe().getContext());
                adChoicesView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                adChoicesView.addView(view);
                FrameLayout zzalw = zzcbjVar.zzalw();
                if (zzalw != null) {
                    zzalw.addView(adChoicesView);
                }
            }
            zzcbjVar.zza(zzcbjVar.zzamb(), view, true);
        }
        String[] strArr2 = zzcar.zzfth;
        int length = strArr2.length;
        while (true) {
            if (i >= length) {
                viewGroup2 = null;
                break;
            }
            View zzgd2 = zzcbjVar.zzgd(strArr2[i]);
            if (zzgd2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzgd2;
                break;
            }
            i++;
        }
        this.executor.execute(new Runnable(this, viewGroup2) { // from class: com.google.android.gms.internal.ads.zzcav
            private final zzcat zzftn;
            private final ViewGroup zzftt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzftn = this;
                this.zzftt = viewGroup2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzftn.zzb(this.zzftt);
            }
        });
        if (viewGroup2 != null) {
            if (zza(viewGroup2)) {
                if (this.zzfqb.zzalb() != null) {
                    this.zzfqb.zzalb().zza(new zzcau(this, zzcbjVar, viewGroup2));
                    return;
                }
                return;
            }
            viewGroup2.removeAllViews();
            View zzahe = zzcbjVar.zzahe();
            Context context2 = zzahe != null ? zzahe.getContext() : null;
            if (context2 != null) {
                if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcow)).booleanValue()) {
                    zzacr zzsl = this.zzfrk.zzsl();
                    if (zzsl == null) {
                        return;
                    }
                    try {
                        zzrv = zzsl.zzry();
                    } catch (RemoteException unused) {
                        zzawr.zzfc("Could not get main image drawable");
                        return;
                    }
                } else {
                    zzacs zzaky = this.zzfqb.zzaky();
                    if (zzaky == null) {
                        return;
                    }
                    try {
                        zzrv = zzaky.zzrv();
                    } catch (RemoteException unused2) {
                        zzawr.zzfc("Could not get drawable from image");
                        return;
                    }
                }
                if (zzrv == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzrv)) == null) {
                    return;
                }
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                IObjectWrapper zzamc = zzcbjVar != null ? zzcbjVar.zzamc() : null;
                if (zzamc == null || !((Boolean) zzvj.zzpv().zzd(zzzz.zzcsy)).booleanValue()) {
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                } else {
                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzamc));
                }
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup2.addView(imageView);
            }
        }
    }
}
