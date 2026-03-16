package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzctg extends zzvv {
    private zzvm zzbmt;
    private final zzbgy zzggh;
    private final Context zzgiz;
    private final zzdhg zzgja = new zzdhg();
    private final zzcag zzgjb = new zzcag();

    public zzctg(zzbgy zzbgyVar, Context context, String str) {
        this.zzggh = zzbgyVar;
        this.zzgja.zzgr(str);
        this.zzgiz = context;
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final zzvr zzqa() {
        zzcae zzals = this.zzgjb.zzals();
        this.zzgja.zzc(zzals.zzalq());
        this.zzgja.zzd(zzals.zzalr());
        zzdhg zzdhgVar = this.zzgja;
        if (zzdhgVar.zzkg() == null) {
            zzdhgVar.zzd(zzum.zzph());
        }
        return new zzctj(this.zzgiz, this.zzggh, this.zzgja, zzals, this.zzbmt);
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zzb(zzvm zzvmVar) {
        this.zzbmt = zzvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zza(zzads zzadsVar) {
        this.zzgjb.zzb(zzadsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zza(zzael zzaelVar) {
        this.zzgjb.zzb(zzaelVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zza(zzadx zzadxVar) {
        this.zzgjb.zzb(zzadxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zza(String str, zzaed zzaedVar, zzady zzadyVar) {
        this.zzgjb.zzb(str, zzaedVar, zzadyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zza(zzaci zzaciVar) {
        this.zzgja.zzb(zzaciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zza(zzahm zzahmVar) {
        this.zzgja.zzb(zzahmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zza(zzahu zzahuVar) {
        this.zzgjb.zzb(zzahuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zzb(zzwn zzwnVar) {
        this.zzgja.zzc(zzwnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zza(zzaeg zzaegVar, zzum zzumVar) {
        this.zzgjb.zza(zzaegVar);
        this.zzgja.zzd(zzumVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzgja.zzb(publisherAdViewOptions);
    }
}
