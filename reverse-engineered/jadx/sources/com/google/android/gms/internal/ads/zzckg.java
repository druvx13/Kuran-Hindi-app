package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzckg extends zzcke {
    private static final Pattern zzgbh = Pattern.compile("Received error HTTP response code: (.*)");
    private final ScheduledExecutorService zzfky;
    private final zzdhe zzfll;
    private final zzdrh zzfur;
    private final zzcjn zzgbf;
    private final zzcmv zzgbg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzckg(zzbth zzbthVar, zzdhe zzdheVar, zzcjn zzcjnVar, zzdrh zzdrhVar, ScheduledExecutorService scheduledExecutorService, zzcmv zzcmvVar) {
        super(zzbthVar);
        this.zzfll = zzdheVar;
        this.zzgbf = zzcjnVar;
        this.zzfur = zzdrhVar;
        this.zzfky = scheduledExecutorService;
        this.zzgbg = zzcmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcke
    public final zzdri<zzdha> zzb(zzarj zzarjVar) throws zzcjk {
        zzdri<zzdha> zzb = zzdqw.zzb(this.zzgbf.zze(zzarjVar), new zzdqj(this) { // from class: com.google.android.gms.internal.ads.zzckj
            private final zzckg zzgbj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbj = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgbj.zzd((InputStream) obj);
            }
        }, this.zzfur);
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcrq)).booleanValue()) {
            zzb = zzdqw.zzb(zzdqw.zza(zzb, ((Integer) zzvj.zzpv().zzd(zzzz.zzcrr)).intValue(), TimeUnit.SECONDS, this.zzfky), TimeoutException.class, zzcki.zzbly, zzbab.zzdzw);
        }
        zzdqw.zza(zzb, new zzckl(this), zzbab.zzdzw);
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzd(InputStream inputStream) throws Exception {
        return zzdqw.zzag(new zzdha(new zzdgv(this.zzfll), zzdgy.zza(new InputStreamReader(inputStream))));
    }
}
