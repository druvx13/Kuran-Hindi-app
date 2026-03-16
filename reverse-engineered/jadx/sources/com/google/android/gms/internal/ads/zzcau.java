package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcau implements zzacg {
    private final /* synthetic */ zzcbj zzftq;
    private final /* synthetic */ ViewGroup zzftr;
    private final /* synthetic */ zzcat zzfts;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcau(zzcat zzcatVar, zzcbj zzcbjVar, ViewGroup viewGroup) {
        this.zzfts = zzcatVar;
        this.zzftq = zzcbjVar;
        this.zzftr = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzacg
    public final void zzrx() {
        boolean zza;
        zzcat zzcatVar = this.zzfts;
        zza = zzcat.zza(this.zzftq, zzcar.zzfth);
        if (zza) {
            this.zzftq.onClick(this.zzftr);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacg
    public final void zzc(MotionEvent motionEvent) {
        this.zzftq.onTouch(null, motionEvent);
    }
}
