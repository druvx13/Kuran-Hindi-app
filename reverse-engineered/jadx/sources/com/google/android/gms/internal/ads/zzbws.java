package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbws extends zzbns {
    private final WeakReference<zzbek> zzfor;
    private final zzbvg zzfos;
    private final zzbxz zzfot;
    private final zzbom zzfou;
    private final zzdly zzfov;
    private final zzbre zzfow;
    private boolean zzfox;
    private final Context zzvf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbws(zzbnv zzbnvVar, Context context, @Nullable zzbek zzbekVar, zzbvg zzbvgVar, zzbxz zzbxzVar, zzbom zzbomVar, zzdly zzdlyVar, zzbre zzbreVar) {
        super(zzbnvVar);
        this.zzfox = false;
        this.zzvf = context;
        this.zzfor = new WeakReference<>(zzbekVar);
        this.zzfos = zzbvgVar;
        this.zzfot = zzbxzVar;
        this.zzfou = zzbomVar;
        this.zzfov = zzdlyVar;
        this.zzfow = zzbreVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzbi(boolean r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzzk<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzzz.zzcla
            com.google.android.gms.internal.ads.zzzv r1 = com.google.android.gms.internal.ads.zzvj.zzpv()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L49
            com.google.android.gms.ads.internal.zzq.zzkw()
            android.content.Context r0 = r4.zzvf
            boolean r0 = com.google.android.gms.internal.ads.zzaxa.zzau(r0)
            if (r0 == 0) goto L49
            java.lang.String r0 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.zzawr.zzfc(r0)
            com.google.android.gms.internal.ads.zzbre r0 = r4.zzfow
            r0.zzais()
            com.google.android.gms.internal.ads.zzzk<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzzz.zzclb
            com.google.android.gms.internal.ads.zzzv r3 = com.google.android.gms.internal.ads.zzvj.zzpv()
            java.lang.Object r0 = r3.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4f
            com.google.android.gms.internal.ads.zzdly r0 = r4.zzfov
            com.google.android.gms.internal.ads.zzdha r3 = r4.zzfgj
            com.google.android.gms.internal.ads.zzdgy r3 = r3.zzgus
            com.google.android.gms.internal.ads.zzdgq r3 = r3.zzgup
            java.lang.String r3 = r3.zzdoh
            r0.zzgz(r3)
            goto L4f
        L49:
            boolean r0 = r4.zzfox
            if (r0 != 0) goto L4f
            r0 = 1
            goto L50
        L4f:
            r0 = 0
        L50:
            if (r0 != 0) goto L53
            return r2
        L53:
            com.google.android.gms.internal.ads.zzbvg r0 = r4.zzfos
            r0.zzajn()
            com.google.android.gms.internal.ads.zzbxz r0 = r4.zzfot     // Catch: com.google.android.gms.internal.ads.zzbxy -> L62
            android.content.Context r3 = r4.zzvf     // Catch: com.google.android.gms.internal.ads.zzbxy -> L62
            r0.zza(r5, r3)     // Catch: com.google.android.gms.internal.ads.zzbxy -> L62
            r4.zzfox = r1
            return r1
        L62:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzbre r0 = r4.zzfow
            r0.zza(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbws.zzbi(boolean):boolean");
    }

    public final boolean isClosed() {
        return this.zzfou.isClosed();
    }

    public final void finalize() throws Throwable {
        try {
            zzbek zzbekVar = this.zzfor.get();
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcty)).booleanValue()) {
                if (!this.zzfox && zzbekVar != null) {
                    zzdrh zzdrhVar = zzbab.zzdzv;
                    zzbekVar.getClass();
                    zzdrhVar.execute(zzbwv.zzh(zzbekVar));
                }
            } else if (zzbekVar != null) {
                zzbekVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
