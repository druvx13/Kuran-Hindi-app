package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzclf {
    private final zzdrh zzfur;
    private final zzegt<zzclo> zzgax;
    private final zzckw zzgcd;

    public zzclf(zzdrh zzdrhVar, zzckw zzckwVar, zzegt<zzclo> zzegtVar) {
        this.zzfur = zzdrhVar;
        this.zzgcd = zzckwVar;
        this.zzgax = zzegtVar;
    }

    private final <RetT> zzdri<RetT> zza(final zzarj zzarjVar, zzclm<InputStream> zzclmVar, final zzclm<InputStream> zzclmVar2, final zzdqj<InputStream, RetT> zzdqjVar) {
        zzdri zzb;
        String str = zzarjVar.packageName;
        com.google.android.gms.ads.internal.zzq.zzkw();
        if (zzaxa.zzep(str)) {
            zzb = zzdqw.immediateFailedFuture(new zzclc(0));
        } else {
            zzb = zzdqw.zzb(zzclmVar.zzo(zzarjVar), ExecutionException.class, zzcle.zzbly, this.zzfur);
        }
        return (zzdqr) zzdqw.zzb(zzdqr.zzg(zzb).zzb(zzdqjVar, this.zzfur), zzclc.class, new zzdqj(this, zzclmVar2, zzarjVar, zzdqjVar) { // from class: com.google.android.gms.internal.ads.zzclh
            private final zzclf zzgce;
            private final zzclm zzgcf;
            private final zzarj zzgcg;
            private final zzdqj zzgch;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgce = this;
                this.zzgcf = zzclmVar2;
                this.zzgcg = zzarjVar;
                this.zzgch = zzdqjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgce.zza(this.zzgcf, this.zzgcg, this.zzgch, (zzclc) obj);
            }
        }, this.zzfur);
    }

    public final zzdri<zzarj> zzj(final zzarj zzarjVar) {
        zzdqj zzdqjVar = new zzdqj(zzarjVar) { // from class: com.google.android.gms.internal.ads.zzclg
            private final zzarj zzfnq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfnq = zzarjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                zzarj zzarjVar2 = this.zzfnq;
                zzarjVar2.zzdpi = new String(zzdpr.toByteArray((InputStream) obj), zzdnv.UTF_8);
                return zzdqw.zzag(zzarjVar2);
            }
        };
        zzckw zzckwVar = this.zzgcd;
        zzckwVar.getClass();
        return zza(zzarjVar, zzclj.zza(zzckwVar), new zzclm(this) { // from class: com.google.android.gms.internal.ads.zzcli
            private final zzclf zzgce;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgce = this;
            }

            @Override // com.google.android.gms.internal.ads.zzclm
            public final zzdri zzo(zzarj zzarjVar2) {
                return this.zzgce.zzn(zzarjVar2);
            }
        }, zzdqjVar);
    }

    public final zzdri<Void> zzk(zzarj zzarjVar) {
        if (zzet.zzaq(zzarjVar.zzdpi)) {
            return zzdqw.immediateFailedFuture(new zzclp("Pool key missing from removeUrl call.", 1));
        }
        return zza(zzarjVar, new zzclm(this) { // from class: com.google.android.gms.internal.ads.zzclk
            private final zzclf zzgce;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgce = this;
            }

            @Override // com.google.android.gms.internal.ads.zzclm
            public final zzdri zzo(zzarj zzarjVar2) {
                return this.zzgce.zzm(zzarjVar2);
            }
        }, new zzclm(this) { // from class: com.google.android.gms.internal.ads.zzcln
            private final zzclf zzgce;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgce = this;
            }

            @Override // com.google.android.gms.internal.ads.zzclm
            public final zzdri zzo(zzarj zzarjVar2) {
                return this.zzgce.zzl(zzarjVar2);
            }
        }, zzcll.zzbly);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzl(zzarj zzarjVar) {
        return this.zzgax.get().zzgl(zzarjVar.zzdpi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzm(zzarj zzarjVar) {
        return this.zzgcd.zzgk(zzarjVar.zzdpi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzn(zzarj zzarjVar) {
        return this.zzgax.get().zzc(zzarjVar, Binder.getCallingUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(zzclm zzclmVar, zzarj zzarjVar, zzdqj zzdqjVar, zzclc zzclcVar) throws Exception {
        return zzdqw.zzb(zzclmVar.zzo(zzarjVar), zzdqjVar, this.zzfur);
    }
}
