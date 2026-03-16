package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [AdT] */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdji<AdT> implements zzdqx<zzdiv<AdT>> {
    private final /* synthetic */ zzdjd zzgyk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdji(zzdjd zzdjdVar) {
        this.zzgyk = zzdjdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        zzdjk zzdjkVar;
        zzdrp zzdrpVar;
        synchronized (this.zzgyk) {
            zzdjkVar = this.zzgyk.zzgye;
            zzdjkVar.zzb(th);
            zzdrpVar = this.zzgyk.zzgyb;
            zzdrpVar.setException(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(Object obj) {
        zzdjk zzdjkVar;
        int i;
        int i2;
        zzdrp zzdrpVar;
        zzdjj zzdjjVar;
        zzdio zzdioVar;
        zzdjj zzdjjVar2;
        zzdiv<?> zzdivVar = (zzdiv) obj;
        synchronized (this.zzgyk) {
            zzdjkVar = this.zzgyk.zzgye;
            zzdjkVar.zza(zzdivVar);
            i = this.zzgyk.zzgyd;
            if (i != zzdit.zzgxm) {
                zzdioVar = this.zzgyk.zzgrx;
                zzdjjVar2 = this.zzgyk.zzgya;
                zzdioVar.zza(zzdjjVar2.zzarl(), zzdivVar);
            }
            i2 = this.zzgyk.zzgyd;
            if (i2 == zzdit.zzgxl) {
                zzdjd zzdjdVar = this.zzgyk;
                zzdjjVar = this.zzgyk.zzgya;
                zzdjdVar.zzd(zzdjjVar);
            }
            this.zzgyk.zzgyd = zzdit.zzgxl;
            zzdrpVar = this.zzgyk.zzgyb;
            zzdrpVar.set(zzdivVar);
        }
    }
}
