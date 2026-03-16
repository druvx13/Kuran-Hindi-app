package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbqj;
import com.google.android.gms.internal.ads.zzbuj;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcub implements zzctx<zzbns> {
    private final zzbgy zzggh;
    private final Context zzgiz;
    private final zzdhg zzgja;
    private final zzctv zzgki;
    private zzbod zzgkj;

    public zzcub(zzbgy zzbgyVar, Context context, zzctv zzctvVar, zzdhg zzdhgVar) {
        this.zzggh = zzbgyVar;
        this.zzgiz = context;
        this.zzgki = zzctvVar;
        this.zzgja = zzdhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctx
    public final boolean isLoading() {
        zzbod zzbodVar = this.zzgkj;
        return zzbodVar != null && zzbodVar.isLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzctx
    public final boolean zza(zzuj zzujVar, String str, zzctw zzctwVar, zzctz<? super zzbns> zzctzVar) throws RemoteException {
        com.google.android.gms.ads.internal.zzq.zzkw();
        if (zzaxa.zzbd(this.zzgiz) && zzujVar.zzceu == null) {
            zzawr.zzfa("Failed to load the ad because app ID is missing.");
            this.zzggh.zzacv().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcua
                private final zzcub zzgkh;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgkh = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgkh.zzapv();
                }
            });
            return false;
        } else if (str == null) {
            zzawr.zzfa("Ad unit ID should not be null for NativeAdLoader.");
            this.zzggh.zzacv().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcud
                private final zzcub zzgkh;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgkh = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgkh.zzapu();
                }
            });
            return false;
        } else {
            zzdhn.zze(this.zzgiz, zzujVar.zzcej);
            zzdhe zzasc = this.zzgja.zzh(zzujVar).zzdv(zzctwVar instanceof zzcty ? ((zzcty) zzctwVar).zzgkg : 1).zzasc();
            zzbyp zzaef = this.zzggh.zzadg().zza(new zzbqj.zza().zzcb(this.zzgiz).zza(zzasc).zzair()).zza(new zzbuj.zza().zza(this.zzgki.zzapq(), this.zzggh.zzacv()).zza(this.zzgki.zzapr(), this.zzggh.zzacv()).zza(this.zzgki.zzaps(), this.zzggh.zzacv()).zza(this.zzgki.zzapt(), this.zzggh.zzacv()).zza(this.zzgki.zzapp(), this.zzggh.zzacv()).zza(zzasc.zzgvc, this.zzggh.zzacv()).zzajm()).zza(this.zzgki.zzapo()).zzaef();
            this.zzggh.zzadk().zzdw(1);
            zzbod zzbodVar = new zzbod(this.zzggh.zzacx(), this.zzggh.zzacw(), zzaef.zzaed().zzaii());
            this.zzgkj = zzbodVar;
            zzbodVar.zza(new zzcuc(this, zzctzVar, zzaef));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzapu() {
        this.zzgki.zzapr().onAdFailedToLoad(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzapv() {
        this.zzgki.zzapr().onAdFailedToLoad(8);
    }
}
