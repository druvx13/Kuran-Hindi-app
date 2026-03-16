package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcel extends zzbns {
    private final zzate zzdri;
    private final WeakReference<zzbek> zzfor;
    private final zzbvg zzfos;
    private final zzbom zzfou;
    private final zzdly zzfov;
    private final zzbre zzfow;
    private final zzbxz zzfoz;
    private boolean zzfvz;
    private final zzbsl zzfwn;
    private final Context zzvf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcel(zzbnv zzbnvVar, Context context, zzbek zzbekVar, zzbxz zzbxzVar, zzbvg zzbvgVar, zzbre zzbreVar, zzbsl zzbslVar, zzbom zzbomVar, zzdgo zzdgoVar, zzdly zzdlyVar) {
        super(zzbnvVar);
        this.zzfvz = false;
        this.zzvf = context;
        this.zzfoz = zzbxzVar;
        this.zzfor = new WeakReference<>(zzbekVar);
        this.zzfos = zzbvgVar;
        this.zzfow = zzbreVar;
        this.zzfwn = zzbslVar;
        this.zzfou = zzbomVar;
        this.zzfov = zzdlyVar;
        this.zzdri = new zzaub(zzdgoVar.zzdoi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.content.Context] */
    public final boolean zzb(boolean z, Activity activity) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcla)).booleanValue()) {
            com.google.android.gms.ads.internal.zzq.zzkw();
            if (zzaxa.zzau(this.zzvf)) {
                zzawr.zzfc("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzfow.zzais();
                if (((Boolean) zzvj.zzpv().zzd(zzzz.zzclb)).booleanValue()) {
                    this.zzfov.zzgz(this.zzfgj.zzgus.zzgup.zzdoh);
                }
                return false;
            }
        }
        if (this.zzfvz) {
            zzawr.zzfc("The rewarded ad have been showed.");
            this.zzfow.zzf(1, null);
            return false;
        }
        this.zzfvz = true;
        this.zzfos.zzajn();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzvf;
        }
        try {
            this.zzfoz.zza(z, activity2);
            return true;
        } catch (zzbxy e) {
            this.zzfow.zza(e);
            return false;
        }
    }

    public final boolean zzamq() {
        return this.zzfvz;
    }

    public final zzate zzqt() {
        return this.zzdri;
    }

    public final boolean isClosed() {
        return this.zzfou.isClosed();
    }

    public final boolean zzqu() {
        zzbek zzbekVar = this.zzfor.get();
        return (zzbekVar == null || zzbekVar.zzaby()) ? false : true;
    }

    public final Bundle getAdMetadata() {
        return this.zzfwn.getAdMetadata();
    }

    public final void finalize() throws Throwable {
        try {
            zzbek zzbekVar = this.zzfor.get();
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcty)).booleanValue()) {
                if (!this.zzfvz && zzbekVar != null) {
                    zzdrh zzdrhVar = zzbab.zzdzv;
                    zzbekVar.getClass();
                    zzdrhVar.execute(zzcek.zzh(zzbekVar));
                }
            } else if (zzbekVar != null) {
                zzbekVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
