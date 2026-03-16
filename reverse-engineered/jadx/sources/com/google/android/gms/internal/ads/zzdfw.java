package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.internal.ads.zzbqj;
import com.google.android.gms.internal.ads.zzbuj;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdfw implements zzctx<zzcel> {
    private final Executor zzfhi;
    private final zzdgz zzfmx;
    private final zzdhg zzgja;
    private final zzbgy zzgku;
    private final Context zzgqc;
    private final zzdeu<zzceo, zzcel> zzgqe;
    private final zzdez zzgst;
    private zzdri<zzcel> zzgsu;

    public zzdfw(Context context, Executor executor, zzbgy zzbgyVar, zzdeu<zzceo, zzcel> zzdeuVar, zzdez zzdezVar, zzdhg zzdhgVar, zzdgz zzdgzVar) {
        this.zzgqc = context;
        this.zzfhi = executor;
        this.zzgku = zzbgyVar;
        this.zzgqe = zzdeuVar;
        this.zzgst = zzdezVar;
        this.zzgja = zzdhgVar;
        this.zzfmx = zzdgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctx
    public final boolean isLoading() {
        zzdri<zzcel> zzdriVar = this.zzgsu;
        return (zzdriVar == null || zzdriVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzctx
    public final boolean zza(zzuj zzujVar, String str, zzctw zzctwVar, zzctz<? super zzcel> zzctzVar) throws RemoteException {
        zzast zzastVar = new zzast(zzujVar, str);
        String str2 = zzctwVar instanceof zzdft ? ((zzdft) zzctwVar).zzgsr : null;
        if (zzastVar.zzbsc == null) {
            zzawr.zzfa("Ad unit ID should not be null for rewarded video ad.");
            this.zzfhi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdfv
                private final zzdfw zzgss;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgss = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgss.zzarq();
                }
            });
            return false;
        }
        zzdri<zzcel> zzdriVar = this.zzgsu;
        if (zzdriVar == null || zzdriVar.isDone()) {
            zzdhn.zze(this.zzgqc, zzastVar.zzdlx.zzcej);
            zzdhe zzasc = this.zzgja.zzgr(zzastVar.zzbsc).zzd(zzum.zzpi()).zzh(zzastVar.zzdlx).zzasc();
            zzdga zzdgaVar = new zzdga(null);
            zzdgaVar.zzfll = zzasc;
            zzdgaVar.zzgsr = str2;
            zzdri<zzcel> zza = this.zzgqe.zza(new zzdev(zzdgaVar), new zzdew(this) { // from class: com.google.android.gms.internal.ads.zzdfy
                private final zzdfw zzgss;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgss = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdew
                public final zzbqg zzc(zzdet zzdetVar) {
                    return this.zzgss.zze(zzdetVar);
                }
            });
            this.zzgsu = zza;
            zzdqw.zza(zza, new zzdfx(this, zzctzVar, zzdgaVar), this.zzfhi);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzdt(int i) {
        this.zzgja.zzasb().zzdu(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd */
    public final zzcer zze(zzdet zzdetVar) {
        zzdga zzdgaVar = (zzdga) zzdetVar;
        zzdez zza = zzdez.zza(this.zzgst);
        return this.zzgku.zzadh().zze(new zzbqj.zza().zzcb(this.zzgqc).zza(zzdgaVar.zzfll).zzfv(zzdgaVar.zzgsr).zza(this.zzfmx).zzair()).zze(new zzbuj.zza().zza((zzbqx) zza, this.zzfhi).zza((zzbsm) zza, this.zzfhi).zza((zzbrc) zza, this.zzfhi).zza((AdMetadataListener) zza, this.zzfhi).zza((zzbrl) zza, this.zzfhi).zza((zzbtb) zza, this.zzfhi).zza(zza).zzajm());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzarq() {
        this.zzgst.onAdFailedToLoad(1);
    }
}
