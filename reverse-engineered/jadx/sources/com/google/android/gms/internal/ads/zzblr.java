package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzblr extends zzbns {
    private final View view;
    private final zzbek zzdce;
    private final zzdgn zzfik;
    private final int zzfil;
    private final boolean zzfim;
    private final boolean zzfin;
    private zzrs zzfit;
    private final zzbli zzfiu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblr(zzbnv zzbnvVar, View view, zzbek zzbekVar, zzdgn zzdgnVar, int i, boolean z, boolean z2, zzbli zzbliVar) {
        super(zzbnvVar);
        this.view = view;
        this.zzdce = zzbekVar;
        this.zzfik = zzdgnVar;
        this.zzfil = i;
        this.zzfim = z;
        this.zzfin = z2;
        this.zzfiu = zzbliVar;
    }

    public final zzdgn zzahd() {
        return zzdhh.zza(this.zzfkd.zzgtq, this.zzfik);
    }

    public final View zzahe() {
        return this.view;
    }

    public final int zzagv() {
        return this.zzfil;
    }

    public final boolean zzagw() {
        return this.zzfim;
    }

    public final boolean zzagx() {
        return this.zzfin;
    }

    public final boolean zzaap() {
        zzbek zzbekVar = this.zzdce;
        return (zzbekVar == null || zzbekVar.zzabj() == null || !this.zzdce.zzabj().zzaap()) ? false : true;
    }

    public final boolean zzahf() {
        zzbek zzbekVar = this.zzdce;
        return zzbekVar != null && zzbekVar.zzabl();
    }

    public final void zza(zzrh zzrhVar) {
        zzbek zzbekVar = this.zzdce;
        if (zzbekVar != null) {
            zzbekVar.zza(zzrhVar);
        }
    }

    public final void zza(zzrs zzrsVar) {
        this.zzfit = zzrsVar;
    }

    public final zzrs zzahg() {
        return this.zzfit;
    }

    public final void zzfd(long j) {
        this.zzfiu.zzfd(j);
    }
}
