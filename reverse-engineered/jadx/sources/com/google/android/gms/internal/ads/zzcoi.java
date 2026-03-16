package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcoi implements zzcnj<zzbws> {
    private final zzdgm zzfgh;
    private final Executor zzfhi;
    private final zzbxr zzgfa;
    private final Context zzvf;

    public zzcoi(Context context, Executor executor, zzbxr zzbxrVar, zzdgm zzdgmVar) {
        this.zzvf = context;
        this.zzgfa = zzbxrVar;
        this.zzfhi = executor;
        this.zzfgh = zzdgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final boolean zza(zzdha zzdhaVar, zzdgo zzdgoVar) {
        return (this.zzvf instanceof Activity) && PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzaaw.zzj(this.zzvf) && !TextUtils.isEmpty(zzd(zzdgoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final zzdri<zzbws> zzb(final zzdha zzdhaVar, final zzdgo zzdgoVar) {
        String zzd = zzd(zzdgoVar);
        final Uri parse = zzd != null ? Uri.parse(zzd) : null;
        return zzdqw.zzb(zzdqw.zzag(null), new zzdqj(this, parse, zzdhaVar, zzdgoVar) { // from class: com.google.android.gms.internal.ads.zzcol
            private final Uri zzdwc;
            private final zzcoi zzgfb;
            private final zzdha zzgfc;
            private final zzdgo zzgfd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfb = this;
                this.zzdwc = parse;
                this.zzgfc = zzdhaVar;
                this.zzgfd = zzdgoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgfb.zza(this.zzdwc, this.zzgfc, this.zzgfd, obj);
            }
        }, this.zzfhi);
    }

    private static String zzd(zzdgo zzdgoVar) {
        try {
            return zzdgoVar.zzgtu.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(Uri uri, zzdha zzdhaVar, zzdgo zzdgoVar, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzd zzdVar = new com.google.android.gms.ads.internal.overlay.zzd(build.intent);
            final zzbaj zzbajVar = new zzbaj();
            zzbwu zza = this.zzgfa.zza(new zzboi(zzdhaVar, zzdgoVar, null), new zzbwx(new zzbxz(zzbajVar) { // from class: com.google.android.gms.internal.ads.zzcok
                private final zzbaj zzbsx;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbsx = zzbajVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbxz
                public final void zza(boolean z, Context context) {
                    zzbaj zzbajVar2 = this.zzbsx;
                    try {
                        com.google.android.gms.ads.internal.zzq.zzkv();
                        com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) zzbajVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }));
            zzbajVar.set(new AdOverlayInfoParcel(zzdVar, null, zza.zzafp(), null, new zzazz(0, 0, false)));
            this.zzfgh.zzvx();
            return zzdqw.zzag(zza.zzafo());
        } catch (Throwable th) {
            zzawr.zzc("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
