package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbqj;
import com.google.android.gms.internal.ads.zzbuj;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdcz implements zzctx<zzblr> {
    private final Executor zzfhi;
    private final ViewGroup zzfiv;
    private final zzdhg zzgja;
    @Nullable
    private zzdri<zzblr> zzgjl;
    private final zzbgy zzgku;
    private final Context zzgqc;
    private final zzddn zzgqd;
    private final zzdeu<zzbll, zzblr> zzgqe;

    public zzdcz(Context context, Executor executor, zzbgy zzbgyVar, zzdeu<zzbll, zzblr> zzdeuVar, zzddn zzddnVar, zzdhg zzdhgVar) {
        this.zzgqc = context;
        this.zzfhi = executor;
        this.zzgku = zzbgyVar;
        this.zzgqe = zzdeuVar;
        this.zzgqd = zzddnVar;
        this.zzgja = zzdhgVar;
        this.zzfiv = new FrameLayout(context);
    }

    @Override // com.google.android.gms.internal.ads.zzctx
    public final boolean isLoading() {
        zzdri<zzblr> zzdriVar = this.zzgjl;
        return (zzdriVar == null || zzdriVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzctx
    public final synchronized boolean zza(zzuj zzujVar, String str, zzctw zzctwVar, zzctz<? super zzblr> zzctzVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (str == null) {
            zzawr.zzfa("Ad unit ID should not be null for app open ad.");
            this.zzfhi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzddc
                private final zzdcz zzgqf;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgqf = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgqf.zzare();
                }
            });
            return false;
        } else if (this.zzgjl != null) {
            return false;
        } else {
            zzdhn.zze(this.zzgqc, zzujVar.zzcej);
            zzdhe zzasc = this.zzgja.zzgr(str).zzd(zzum.zzpj()).zzh(zzujVar).zzasc();
            zzddd zzdddVar = new zzddd(null);
            zzdddVar.zzfll = zzasc;
            zzdri<zzblr> zza = this.zzgqe.zza(new zzdev(zzdddVar), new zzdew(this) { // from class: com.google.android.gms.internal.ads.zzddb
                private final zzdcz zzgqf;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgqf = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdew
                public final zzbqg zzc(zzdet zzdetVar) {
                    return this.zzgqf.zzb(zzdetVar);
                }
            });
            this.zzgjl = zza;
            zzdqw.zza(zza, new zzdde(this, zzctzVar, zzdddVar), this.zzfhi);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zza */
    public final synchronized zzblk zzb(zzdet zzdetVar) {
        zzbuj.zza zzaVar;
        zzddn zza = zzddn.zza(this.zzgqd);
        zzaVar = new zzbuj.zza();
        zzaVar.zza((zzbrc) zza, this.zzfhi);
        zzaVar.zza((zzbsr) zza, this.zzfhi);
        zzaVar.zza(zza);
        return this.zzgku.zzadd().zza(new zzbls(this.zzfiv)).zzb(new zzbqj.zza().zzcb(this.zzgqc).zza(((zzddd) zzdetVar).zzfll).zzair()).zzb(zzaVar.zzajm());
    }

    public final void zza(zzut zzutVar) {
        this.zzgja.zzb(zzutVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzare() {
        this.zzgqd.onAdFailedToLoad(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzdri zza(zzdcz zzdczVar, zzdri zzdriVar) {
        zzdczVar.zzgjl = null;
        return null;
    }
}
