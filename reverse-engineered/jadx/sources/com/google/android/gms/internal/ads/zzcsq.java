package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcsq implements zzcsk<zzbws> {
    private final zzbxr zzgfa;
    private final Context zzvf;

    public zzcsq(Context context, zzbxr zzbxrVar) {
        this.zzvf = context;
        this.zzgfa = zzbxrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsk
    public final /* synthetic */ zzbws zza(zzdha zzdhaVar, zzdgo zzdgoVar, View view, zzcsr zzcsrVar) {
        zzbwu zza = this.zzgfa.zza(new zzboi(zzdhaVar, zzdgoVar, null), new zzcss(this, zzcst.zzgio));
        zzcsrVar.zza(new zzcsv(this, zza));
        return zza.zzafo();
    }
}
