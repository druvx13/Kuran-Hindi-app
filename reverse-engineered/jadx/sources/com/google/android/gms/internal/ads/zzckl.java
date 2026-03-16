package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzckl implements zzdqx<zzdha> {
    private final /* synthetic */ zzckg zzgbk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzckl(zzckg zzckgVar) {
        this.zzgbk = zzckgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        Pattern pattern;
        zzcmv zzcmvVar;
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsz)).booleanValue()) {
            pattern = zzckg.zzgbh;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzcmvVar = this.zzgbk.zzgbg;
                zzcmvVar.zzds(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(zzdha zzdhaVar) {
        zzcmv zzcmvVar;
        zzcmv zzcmvVar2;
        zzdha zzdhaVar2 = zzdhaVar;
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsz)).booleanValue()) {
            zzcmvVar = this.zzgbk.zzgbg;
            zzcmvVar.zzds(zzdhaVar2.zzgus.zzgup.responseCode);
            zzcmvVar2 = this.zzgbk.zzgbg;
            zzcmvVar2.zzeq(zzdhaVar2.zzgus.zzgup.zzgda);
        }
    }
}
