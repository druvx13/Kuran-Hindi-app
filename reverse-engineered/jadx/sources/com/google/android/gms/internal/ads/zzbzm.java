package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbzm extends zzbns {
    private final zzazz zzbmo;
    private final zzdt zzejl;
    private final Executor zzfhi;
    private final zzcae zzfjb;
    private final zzaur zzfkp;
    private final zzbzx zzfqb;
    private final zzcaf zzfra;
    private final zzcat zzfrb;
    private final zzcab zzfrc;
    private final zzegt<zzcdl> zzfrd;
    private final zzegt<zzcdj> zzfre;
    private final zzegt<zzcdo> zzfrf;
    private final zzegt<zzcdf> zzfrg;
    private final zzegt<zzcdn> zzfrh;
    private zzcbj zzfri;
    private boolean zzfrj;
    private final zzbzs zzfrk;
    private final zzctk zzfrl;
    private final Context zzvf;

    public zzbzm(zzbnv zzbnvVar, Executor executor, zzbzx zzbzxVar, zzcaf zzcafVar, zzcat zzcatVar, zzcab zzcabVar, zzcae zzcaeVar, zzegt<zzcdl> zzegtVar, zzegt<zzcdj> zzegtVar2, zzegt<zzcdo> zzegtVar3, zzegt<zzcdf> zzegtVar4, zzegt<zzcdn> zzegtVar5, zzaur zzaurVar, zzdt zzdtVar, zzazz zzazzVar, Context context, zzbzs zzbzsVar, zzctk zzctkVar) {
        super(zzbnvVar);
        this.zzfhi = executor;
        this.zzfqb = zzbzxVar;
        this.zzfra = zzcafVar;
        this.zzfrb = zzcatVar;
        this.zzfrc = zzcabVar;
        this.zzfjb = zzcaeVar;
        this.zzfrd = zzegtVar;
        this.zzfre = zzegtVar2;
        this.zzfrf = zzegtVar3;
        this.zzfrg = zzegtVar4;
        this.zzfrh = zzegtVar5;
        this.zzfkp = zzaurVar;
        this.zzejl = zzdtVar;
        this.zzbmo = zzazzVar;
        this.zzvf = context;
        this.zzfrk = zzbzsVar;
        this.zzfrl = zzctkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbns
    public final void zzahk() {
        this.zzfhi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbzp
            private final zzbzm zzfrn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfrn = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfrn.zzakv();
            }
        });
        if (this.zzfqb.zzakw() != 7) {
            Executor executor = this.zzfhi;
            zzcaf zzcafVar = this.zzfra;
            zzcafVar.getClass();
            executor.execute(zzbzo.zza(zzcafVar));
        }
        super.zzahk();
    }

    public final synchronized void zzfx(String str) {
        this.zzfra.zzfx(str);
    }

    public final synchronized void zzakl() {
        if (this.zzfrj) {
            return;
        }
        this.zzfra.zzakl();
    }

    public final synchronized void zzg(Bundle bundle) {
        this.zzfra.zzg(bundle);
    }

    public final synchronized boolean zzi(Bundle bundle) {
        if (this.zzfrj) {
            return true;
        }
        boolean zzi = this.zzfra.zzi(bundle);
        this.zzfrj = zzi;
        return zzi;
    }

    public final synchronized void zzh(Bundle bundle) {
        this.zzfra.zzh(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbns
    public final synchronized void destroy() {
        this.zzfhi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbzr
            private final zzbzm zzfrn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfrn = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfrn.zzaku();
            }
        });
        super.destroy();
    }

    public final synchronized void zza(zzcbj zzcbjVar) {
        zzdj zzcb;
        this.zzfri = zzcbjVar;
        this.zzfrb.zza(zzcbjVar);
        this.zzfra.zza(zzcbjVar.zzahe(), zzcbjVar.zzalz(), zzcbjVar.zzama(), zzcbjVar, zzcbjVar);
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcnt)).booleanValue() && (zzcb = this.zzejl.zzcb()) != null) {
            zzcb.zzb(zzcbjVar.zzahe());
        }
        if (zzcbjVar.zzalx() != null) {
            zzcbjVar.zzalx().zza(this.zzfkp);
        }
    }

    public final synchronized void zzb(zzcbj zzcbjVar) {
        this.zzfra.zza(zzcbjVar.zzahe(), zzcbjVar.zzaly());
        if (zzcbjVar.zzalw() != null) {
            zzcbjVar.zzalw().setClickable(false);
            zzcbjVar.zzalw().removeAllViews();
        }
        if (zzcbjVar.zzalx() != null) {
            zzcbjVar.zzalx().zzb(this.zzfkp);
        }
        this.zzfri = null;
    }

    public final synchronized void zza(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        this.zzfrb.zzc(this.zzfri);
        this.zzfra.zza(view, view2, map, map2, z);
    }

    public final synchronized void zza(View view, MotionEvent motionEvent, View view2) {
        this.zzfra.zza(view, motionEvent, view2);
    }

    public final synchronized void zzb(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.zzfrj) {
            return;
        }
        if (z) {
            this.zzfra.zza(view, map, map2);
            this.zzfrj = true;
            return;
        }
        if (!z) {
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcpb)).booleanValue() && map != null) {
                for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                    View view2 = entry.getValue().get();
                    if (view2 != null && zzy(view2)) {
                        this.zzfra.zza(view, map, map2);
                        this.zzfrj = true;
                        return;
                    }
                }
            }
        }
    }

    public final synchronized void setClickConfirmingView(View view) {
        this.zzfra.setClickConfirmingView(view);
    }

    public final synchronized void zza(zzaer zzaerVar) {
        this.zzfra.zza(zzaerVar);
    }

    public final synchronized void cancelUnconfirmedClick() {
        this.zzfra.cancelUnconfirmedClick();
    }

    public final synchronized void zza(zzww zzwwVar) {
        this.zzfra.zza(zzwwVar);
    }

    public final synchronized void zza(zzws zzwsVar) {
        this.zzfra.zza(zzwsVar);
    }

    public final synchronized void zzsk() {
        this.zzfra.zzsk();
    }

    public final synchronized void recordCustomClickGesture() {
        if (this.zzfri == null) {
            zzawr.zzed("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z = this.zzfri instanceof zzcao;
        this.zzfhi.execute(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzbzq
            private final boolean zzecc;
            private final zzbzm zzfrn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfrn = this;
                this.zzecc = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfrn.zzbj(this.zzecc);
            }
        });
    }

    public final synchronized boolean isCustomClickGestureEnabled() {
        return this.zzfra.isCustomClickGestureEnabled();
    }

    public static boolean zzy(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    public final boolean zzakr() {
        return this.zzfrc.zzalj();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(java.lang.String r11, boolean r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzcab r0 = r10.zzfrc
            boolean r0 = r0.zzaks()
            if (r0 != 0) goto L9
            return
        L9:
            com.google.android.gms.internal.ads.zzbzx r0 = r10.zzfqb
            com.google.android.gms.internal.ads.zzbek r0 = r0.zzalc()
            com.google.android.gms.internal.ads.zzbzx r1 = r10.zzfqb
            com.google.android.gms.internal.ads.zzbek r1 = r1.zzalb()
            if (r0 != 0) goto L1a
            if (r1 != 0) goto L1a
            return
        L1a:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            r4 = 1
            goto L21
        L20:
            r4 = 0
        L21:
            if (r1 == 0) goto L24
            goto L25
        L24:
            r2 = 0
        L25:
            r3 = 0
            if (r4 == 0) goto L2a
        L28:
            r8 = r3
            goto L32
        L2a:
            if (r2 == 0) goto L30
            java.lang.String r3 = "javascript"
            r0 = r1
            goto L28
        L30:
            r0 = r3
            r8 = r0
        L32:
            android.webkit.WebView r3 = r0.getWebView()
            if (r3 != 0) goto L39
            return
        L39:
            com.google.android.gms.internal.ads.zzapd r3 = com.google.android.gms.ads.internal.zzq.zzll()
            android.content.Context r4 = r10.zzvf
            boolean r3 = r3.zzo(r4)
            if (r3 == 0) goto L97
            com.google.android.gms.internal.ads.zzazz r3 = r10.zzbmo
            int r3 = r3.zzdzn
            com.google.android.gms.internal.ads.zzazz r4 = r10.zzbmo
            int r4 = r4.zzdzo
            r5 = 23
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r6.append(r3)
            java.lang.String r3 = "."
            r6.append(r3)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.google.android.gms.internal.ads.zzapd r3 = com.google.android.gms.ads.internal.zzq.zzll()
            android.webkit.WebView r5 = r0.getWebView()
            java.lang.String r6 = ""
            java.lang.String r7 = "javascript"
            r9 = r11
            com.google.android.gms.dynamic.IObjectWrapper r11 = r3.zza(r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L77
            return
        L77:
            com.google.android.gms.internal.ads.zzbzx r3 = r10.zzfqb
            r3.zzas(r11)
            r0.zzap(r11)
            if (r2 == 0) goto L8e
            android.view.View r0 = r1.getView()
            if (r0 == 0) goto L8e
            com.google.android.gms.internal.ads.zzapd r1 = com.google.android.gms.ads.internal.zzq.zzll()
            r1.zza(r11, r0)
        L8e:
            if (r12 == 0) goto L97
            com.google.android.gms.internal.ads.zzapd r12 = com.google.android.gms.ads.internal.zzq.zzll()
            r12.zzab(r11)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzm.zzg(java.lang.String, boolean):void");
    }

    public final boolean zzaks() {
        return this.zzfrc.zzaks();
    }

    public final void zzz(View view) {
        IObjectWrapper zzald = this.zzfqb.zzald();
        boolean z = this.zzfqb.zzalc() != null;
        if (!this.zzfrc.zzaks() || zzald == null || !z || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzq.zzll().zza(zzald, view);
    }

    public final void zzaa(View view) {
        IObjectWrapper zzald = this.zzfqb.zzald();
        if (!this.zzfrc.zzaks() || zzald == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzq.zzll().zzb(zzald, view);
    }

    public final zzbzs zzakt() {
        return this.zzfrk;
    }

    public final synchronized void zza(zzxf zzxfVar) {
        this.zzfrl.zzb(zzxfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzbj(boolean z) {
        this.zzfra.zza(this.zzfri.zzahe(), this.zzfri.zzaly(), this.zzfri.zzalz(), z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaku() {
        this.zzfra.destroy();
        this.zzfqb.destroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzakv() {
        try {
            int zzakw = this.zzfqb.zzakw();
            if (zzakw == 1) {
                if (this.zzfjb.zzall() != null) {
                    zzg("Google", true);
                    this.zzfjb.zzall().zza(this.zzfrd.get());
                }
            } else if (zzakw == 2) {
                if (this.zzfjb.zzalm() != null) {
                    zzg("Google", true);
                    this.zzfjb.zzalm().zza(this.zzfre.get());
                }
            } else if (zzakw == 3) {
                if (this.zzfjb.zzgb(this.zzfqb.getCustomTemplateId()) != null) {
                    if (this.zzfqb.zzalb() != null) {
                        zzg("Google", true);
                    }
                    this.zzfjb.zzgb(this.zzfqb.getCustomTemplateId()).zzb(this.zzfrh.get());
                }
            } else if (zzakw == 6) {
                if (this.zzfjb.zzaln() != null) {
                    zzg("Google", true);
                    this.zzfjb.zzaln().zza(this.zzfrf.get());
                }
            } else if (zzakw == 7) {
                if (this.zzfjb.zzalp() != null) {
                    this.zzfjb.zzalp().zza(this.zzfrg.get());
                }
            } else {
                zzawr.zzfa("Wrong native template id!");
            }
        } catch (RemoteException e) {
            zzawr.zzc("RemoteException when notifyAdLoad is called", e);
        }
    }
}
