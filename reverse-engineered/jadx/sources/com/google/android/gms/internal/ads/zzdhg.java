package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdhg {
    private boolean zzbli;
    private zzum zzbmp;
    private zzaci zzdhc;
    private zzahm zzdno;
    private zzwn zzguu;
    private zzze zzguv;
    private zzuj zzguw;
    private String zzgux;
    private ArrayList<String> zzguy;
    private ArrayList<String> zzguz;
    private zzut zzgva;
    private PublisherAdViewOptions zzgvb;
    private zzwh zzgvc;
    private int zzgkg = 1;
    private zzdgt zzgve = new zzdgt();
    private boolean zzglu = false;

    public final zzdhg zzh(zzuj zzujVar) {
        this.zzguw = zzujVar;
        return this;
    }

    public final zzuj zzarz() {
        return this.zzguw;
    }

    public final zzdhg zzd(zzum zzumVar) {
        this.zzbmp = zzumVar;
        return this;
    }

    public final zzdhg zzbo(boolean z) {
        this.zzglu = z;
        return this;
    }

    public final zzum zzkg() {
        return this.zzbmp;
    }

    public final zzdhg zzc(zzwn zzwnVar) {
        this.zzguu = zzwnVar;
        return this;
    }

    public final zzdhg zzgr(String str) {
        this.zzgux = str;
        return this;
    }

    public final String zzasa() {
        return this.zzgux;
    }

    public final zzdhg zzc(zzze zzzeVar) {
        this.zzguv = zzzeVar;
        return this;
    }

    public final zzdgt zzasb() {
        return this.zzgve;
    }

    public final zzdhg zzbp(boolean z) {
        this.zzbli = z;
        return this;
    }

    public final zzdhg zzdv(int i) {
        this.zzgkg = i;
        return this;
    }

    public final zzdhg zzc(ArrayList<String> arrayList) {
        this.zzguy = arrayList;
        return this;
    }

    public final zzdhg zzd(ArrayList<String> arrayList) {
        this.zzguz = arrayList;
        return this;
    }

    public final zzdhg zzb(zzaci zzaciVar) {
        this.zzdhc = zzaciVar;
        return this;
    }

    public final zzdhg zzb(zzut zzutVar) {
        this.zzgva = zzutVar;
        return this;
    }

    public final zzdhg zzb(zzahm zzahmVar) {
        this.zzdno = zzahmVar;
        this.zzguv = new zzze(false, true, false);
        return this;
    }

    public final zzdhg zzb(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzgvb = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zzbli = publisherAdViewOptions.getManualImpressionsEnabled();
            this.zzgvc = publisherAdViewOptions.zzjt();
        }
        return this;
    }

    public final zzdhg zzc(zzdhe zzdheVar) {
        this.zzgve.zza(zzdheVar.zzgvd);
        this.zzguw = zzdheVar.zzguw;
        this.zzbmp = zzdheVar.zzbmp;
        this.zzguu = zzdheVar.zzguu;
        this.zzgux = zzdheVar.zzgux;
        this.zzguv = zzdheVar.zzguv;
        this.zzguy = zzdheVar.zzguy;
        this.zzguz = zzdheVar.zzguz;
        this.zzdhc = zzdheVar.zzdhc;
        this.zzgva = zzdheVar.zzgva;
        zzdhg zzb = zzb(zzdheVar.zzgvb);
        zzb.zzglu = zzdheVar.zzglu;
        return zzb;
    }

    public final zzdhe zzasc() {
        Preconditions.checkNotNull(this.zzgux, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzbmp, "ad size must not be null");
        Preconditions.checkNotNull(this.zzguw, "ad request must not be null");
        return new zzdhe(this);
    }

    public static /* synthetic */ zzum zza(zzdhg zzdhgVar) {
        return zzdhgVar.zzbmp;
    }

    public static /* synthetic */ String zzb(zzdhg zzdhgVar) {
        return zzdhgVar.zzgux;
    }

    public static /* synthetic */ zzwn zzc(zzdhg zzdhgVar) {
        return zzdhgVar.zzguu;
    }

    public static /* synthetic */ ArrayList zzd(zzdhg zzdhgVar) {
        return zzdhgVar.zzguy;
    }

    public static /* synthetic */ ArrayList zze(zzdhg zzdhgVar) {
        return zzdhgVar.zzguz;
    }

    public static /* synthetic */ zzut zzf(zzdhg zzdhgVar) {
        return zzdhgVar.zzgva;
    }

    public static /* synthetic */ int zzg(zzdhg zzdhgVar) {
        return zzdhgVar.zzgkg;
    }

    public static /* synthetic */ PublisherAdViewOptions zzh(zzdhg zzdhgVar) {
        return zzdhgVar.zzgvb;
    }

    public static /* synthetic */ zzwh zzi(zzdhg zzdhgVar) {
        return zzdhgVar.zzgvc;
    }

    public static /* synthetic */ zzahm zzj(zzdhg zzdhgVar) {
        return zzdhgVar.zzdno;
    }

    public static /* synthetic */ zzdgt zzk(zzdhg zzdhgVar) {
        return zzdhgVar.zzgve;
    }

    public static /* synthetic */ boolean zzl(zzdhg zzdhgVar) {
        return zzdhgVar.zzglu;
    }

    public static /* synthetic */ zzuj zzm(zzdhg zzdhgVar) {
        return zzdhgVar.zzguw;
    }

    public static /* synthetic */ boolean zzn(zzdhg zzdhgVar) {
        return zzdhgVar.zzbli;
    }

    public static /* synthetic */ zzze zzo(zzdhg zzdhgVar) {
        return zzdhgVar.zzguv;
    }

    public static /* synthetic */ zzaci zzp(zzdhg zzdhgVar) {
        return zzdhgVar.zzdhc;
    }
}
