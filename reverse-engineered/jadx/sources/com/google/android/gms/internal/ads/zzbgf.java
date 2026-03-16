package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbgf {
    public static zzbek zza(final Context context, final zzbfz zzbfzVar, final String str, final boolean z, final boolean z2, final zzdt zzdtVar, final zzazz zzazzVar, zzaam zzaamVar, final com.google.android.gms.ads.internal.zzi zziVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzst zzstVar, final zzrv zzrvVar, final boolean z3) throws zzbew {
        try {
            return (zzbek) zzaze.zza(new zzdon(context, zzbfzVar, str, z, z2, zzdtVar, zzazzVar, null, zziVar, zzaVar, zzstVar, zzrvVar, z3) { // from class: com.google.android.gms.internal.ads.zzbgi
                private final Context zzcit;
                private final String zzdep;
                private final zzbfz zzeit;
                private final boolean zzeiu;
                private final boolean zzeiv;
                private final zzdt zzeiw;
                private final zzazz zzeix;
                private final zzaam zzeiy;
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
                    this.zzeiy = r8;
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
                    zzrv zzrvVar2 = this.zzejc;
                    boolean z6 = this.zzejd;
                    zzbgc zzbgcVar = new zzbgc();
                    zzbgh zzbghVar = new zzbgh(new zzbga(context2), zzbgcVar, zzbfzVar2, str2, z4, z5, zzdtVar2, zzazzVar2, zzaamVar2, zziVar2, zzaVar2, zzstVar2, zzrvVar2, z6);
                    zzbev zzbevVar = new zzbev(zzbghVar);
                    zzbghVar.setWebChromeClient(new zzbec(zzbevVar));
                    zzbgcVar.zza(zzbevVar, z5);
                    return zzbevVar;
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzq.zzla().zza(th, "AdWebViewFactory.newAdWebView2");
            throw new zzbew("Webview initialization failed.", th);
        }
    }
}
