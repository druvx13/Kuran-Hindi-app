package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzddj implements zzctz<zzblr> {
    private final /* synthetic */ zzddf zzgqt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzddj(zzddf zzddfVar) {
        this.zzgqt = zzddfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctz
    public final void zzapn() {
        this.zzgqt.zzgqn = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
        if (r0.zzdzo < ((java.lang.Integer) com.google.android.gms.internal.ads.zzvj.zzpv().zzd(com.google.android.gms.internal.ads.zzzz.zzcrb)).intValue()) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzctz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void onSuccess(com.google.android.gms.internal.ads.zzblr r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzblr r4 = (com.google.android.gms.internal.ads.zzblr) r4
            com.google.android.gms.internal.ads.zzddf r0 = r3.zzgqt
            com.google.android.gms.internal.ads.zzblr r0 = r0.zzgqn
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzddf r0 = r3.zzgqt
            com.google.android.gms.internal.ads.zzblr r0 = r0.zzgqn
            r0.destroy()
        Lf:
            com.google.android.gms.internal.ads.zzddf r0 = r3.zzgqt
            r0.zzgqn = r4
            com.google.android.gms.internal.ads.zzddf r0 = r3.zzgqt
            android.view.ViewGroup r0 = com.google.android.gms.internal.ads.zzddf.zza(r0)
            r0.removeAllViews()
            com.google.android.gms.internal.ads.zzddf r0 = r3.zzgqt
            android.view.ViewGroup r0 = com.google.android.gms.internal.ads.zzddf.zza(r0)
            android.view.View r1 = r4.zzahe()
            com.google.android.gms.internal.ads.zzaxf r2 = com.google.android.gms.ads.internal.zzq.zzky()
            android.view.ViewGroup$LayoutParams r2 = r2.zzxl()
            r0.addView(r1, r2)
            boolean r0 = r4.zzagw()
            if (r0 != 0) goto L51
            com.google.android.gms.internal.ads.zzddf r0 = r3.zzgqt
            com.google.android.gms.internal.ads.zzazz r0 = com.google.android.gms.internal.ads.zzddf.zzb(r0)
            int r0 = r0.zzdzo
            com.google.android.gms.internal.ads.zzzk<java.lang.Integer> r1 = com.google.android.gms.internal.ads.zzzz.zzcrb
            com.google.android.gms.internal.ads.zzzv r2 = com.google.android.gms.internal.ads.zzvj.zzpv()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 >= r1) goto L76
        L51:
            com.google.android.gms.internal.ads.zzddf r0 = r3.zzgqt
            com.google.android.gms.ads.internal.overlay.zzq r0 = com.google.android.gms.internal.ads.zzddf.zza(r0, r4)
            android.widget.RelativeLayout$LayoutParams r1 = com.google.android.gms.internal.ads.zzddf.zzd(r4)
            boolean r2 = r4.zzahf()
            if (r2 == 0) goto L69
            boolean r2 = r4.zzagx()
            if (r2 != 0) goto L69
            r2 = 1
            goto L6a
        L69:
            r2 = 0
        L6a:
            r0.zzal(r2)
            com.google.android.gms.internal.ads.zzddf r2 = r3.zzgqt
            android.view.ViewGroup r2 = com.google.android.gms.internal.ads.zzddf.zza(r2)
            r2.addView(r0, r1)
        L76:
            com.google.android.gms.internal.ads.zzddf r0 = r3.zzgqt
            com.google.android.gms.internal.ads.zzddf.zzb(r0, r4)
            com.google.android.gms.internal.ads.zzddf r0 = r3.zzgqt
            android.view.ViewGroup r0 = com.google.android.gms.internal.ads.zzddf.zza(r0)
            com.google.android.gms.internal.ads.zzddf r1 = r3.zzgqt
            com.google.android.gms.internal.ads.zzum r1 = com.google.android.gms.internal.ads.zzddf.zzc(r1)
            int r1 = r1.heightPixels
            r0.setMinimumHeight(r1)
            com.google.android.gms.internal.ads.zzddf r0 = r3.zzgqt
            android.view.ViewGroup r0 = com.google.android.gms.internal.ads.zzddf.zza(r0)
            com.google.android.gms.internal.ads.zzddf r1 = r3.zzgqt
            com.google.android.gms.internal.ads.zzum r1 = com.google.android.gms.internal.ads.zzddf.zzc(r1)
            int r1 = r1.widthPixels
            r0.setMinimumWidth(r1)
            com.google.android.gms.internal.ads.zzddf r0 = r3.zzgqt
            com.google.android.gms.internal.ads.zzddn r0 = com.google.android.gms.internal.ads.zzddf.zzd(r0)
            com.google.android.gms.internal.ads.zzblt r1 = new com.google.android.gms.internal.ads.zzblt
            com.google.android.gms.internal.ads.zzddf r2 = r3.zzgqt
            r1.<init>(r4, r2)
            r0.zzb(r1)
            r4.zzahk()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzddj.onSuccess(java.lang.Object):void");
    }
}
