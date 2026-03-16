package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzchn implements zzbrb, zzbrp, zzbtt {
    private final zzdha zzepv;
    private final zzdgo zzfgk;
    private final zzchz zzfiq;
    private final zzdhm zzfyt;
    private Boolean zzfyu;
    private final boolean zzfyv = ((Boolean) zzvj.zzpv().zzd(zzzz.zzcub)).booleanValue();
    private final Context zzvf;

    public zzchn(Context context, zzdhm zzdhmVar, zzchz zzchzVar, zzdha zzdhaVar, zzdgo zzdgoVar) {
        this.zzvf = context;
        this.zzfyt = zzdhmVar;
        this.zzfiq = zzchzVar;
        this.zzepv = zzdhaVar;
        this.zzfgk = zzdgoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void onAdImpression() {
        if (zzanu()) {
            zzgf("impression").zzany();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zzaiy() {
        if (zzanu()) {
            zzgf("adapter_impression").zzany();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zzaiz() {
        if (zzanu()) {
            zzgf("adapter_shown").zzany();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzf(int i, String str) {
        if (this.zzfyv) {
            zzchy zzgf = zzgf("ifts");
            zzgf.zzq("reason", "adapter");
            if (i >= 0) {
                zzgf.zzq("arec", String.valueOf(i));
            }
            String zzgs = this.zzfyt.zzgs(str);
            if (zzgs != null) {
                zzgf.zzq("areec", zzgs);
            }
            zzgf.zzany();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zza(zzbxy zzbxyVar) {
        if (this.zzfyv) {
            zzchy zzgf = zzgf("ifts");
            zzgf.zzq("reason", "exception");
            if (!TextUtils.isEmpty(zzbxyVar.getMessage())) {
                zzgf.zzq(NotificationCompat.CATEGORY_MESSAGE, zzbxyVar.getMessage());
            }
            zzgf.zzany();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzais() {
        if (this.zzfyv) {
            zzchy zzgf = zzgf("ifts");
            zzgf.zzq("reason", "blocked");
            zzgf.zzany();
        }
    }

    private final boolean zzanu() {
        if (this.zzfyu == null) {
            synchronized (this) {
                if (this.zzfyu == null) {
                    zzzk<String> zzzkVar = zzzz.zzcne;
                    com.google.android.gms.ads.internal.zzq.zzkw();
                    this.zzfyu = Boolean.valueOf(zzf((String) zzvj.zzpv().zzd(zzzkVar), zzaxa.zzbc(this.zzvf)));
                }
            }
        }
        return this.zzfyu.booleanValue();
    }

    private static boolean zzf(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzq.zzla().zza(e, "CsiActionsListener.isPatternMatched");
            }
        }
        return false;
    }

    private final zzchy zzgf(String str) {
        zzchy zzc = this.zzfiq.zzaoa().zza(this.zzepv.zzgus.zzgup).zzc(this.zzfgk);
        zzc.zzq("action", str);
        if (!this.zzfgk.zzgts.isEmpty()) {
            zzc.zzq("ancn", this.zzfgk.zzgts.get(0));
        }
        return zzc;
    }
}
