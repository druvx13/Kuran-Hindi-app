package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdhe {
    public final zzum zzbmp;
    public final zzaci zzdhc;
    public final zzahm zzdno;
    public final int zzgkg;
    public final boolean zzglu;
    public final zzwn zzguu;
    public final zzze zzguv;
    public final zzuj zzguw;
    public final String zzgux;
    public final ArrayList<String> zzguy;
    public final ArrayList<String> zzguz;
    public final zzut zzgva;
    public final PublisherAdViewOptions zzgvb;
    public final zzwh zzgvc;
    public final zzdgr zzgvd;

    private zzdhe(zzdhg zzdhgVar) {
        zzze zzzeVar;
        zzaci zzp;
        this.zzbmp = zzdhg.zza(zzdhgVar);
        this.zzgux = zzdhg.zzb(zzdhgVar);
        this.zzguu = zzdhg.zzc(zzdhgVar);
        this.zzguw = new zzuj(zzdhg.zzm(zzdhgVar).versionCode, zzdhg.zzm(zzdhgVar).zzceg, zzdhg.zzm(zzdhgVar).extras, zzdhg.zzm(zzdhgVar).zzceh, zzdhg.zzm(zzdhgVar).zzcei, zzdhg.zzm(zzdhgVar).zzcej, zzdhg.zzm(zzdhgVar).zzacq, zzdhg.zzm(zzdhgVar).zzbli || zzdhg.zzn(zzdhgVar), zzdhg.zzm(zzdhgVar).zzcek, zzdhg.zzm(zzdhgVar).zzcel, zzdhg.zzm(zzdhgVar).zzmp, zzdhg.zzm(zzdhgVar).zzcem, zzdhg.zzm(zzdhgVar).zzcen, zzdhg.zzm(zzdhgVar).zzceo, zzdhg.zzm(zzdhgVar).zzcep, zzdhg.zzm(zzdhgVar).zzceq, zzdhg.zzm(zzdhgVar).zzcer, zzdhg.zzm(zzdhgVar).zzces, zzdhg.zzm(zzdhgVar).zzceu, zzdhg.zzm(zzdhgVar).zzacr, zzdhg.zzm(zzdhgVar).zzacs, zzdhg.zzm(zzdhgVar).zzcet);
        if (zzdhg.zzo(zzdhgVar) != null) {
            zzzeVar = zzdhg.zzo(zzdhgVar);
        } else {
            zzzeVar = zzdhg.zzp(zzdhgVar) != null ? zzdhg.zzp(zzdhgVar).zzcyu : null;
        }
        this.zzguv = zzzeVar;
        this.zzguy = zzdhg.zzd(zzdhgVar);
        this.zzguz = zzdhg.zze(zzdhgVar);
        if (zzdhg.zzd(zzdhgVar) == null) {
            zzp = null;
        } else if (zzdhg.zzp(zzdhgVar) == null) {
            zzp = new zzaci(new NativeAdOptions.Builder().build());
        } else {
            zzp = zzdhg.zzp(zzdhgVar);
        }
        this.zzdhc = zzp;
        this.zzgva = zzdhg.zzf(zzdhgVar);
        this.zzgkg = zzdhg.zzg(zzdhgVar);
        this.zzgvb = zzdhg.zzh(zzdhgVar);
        this.zzgvc = zzdhg.zzi(zzdhgVar);
        this.zzdno = zzdhg.zzj(zzdhgVar);
        this.zzgvd = new zzdgr(zzdhg.zzk(zzdhgVar));
        this.zzglu = zzdhg.zzl(zzdhgVar);
    }

    public final zzaem zzarx() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzgvb;
        if (publisherAdViewOptions == null) {
            return null;
        }
        return publisherAdViewOptions.zzju();
    }
}
