package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaju implements zzban<zzakd> {
    private final /* synthetic */ zzajs zzddh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaju(zzajs zzajsVar) {
        this.zzddh = zzajsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final /* synthetic */ void zzh(zzakd zzakdVar) {
        zzajw zzajwVar;
        zzawr.zzeg("Releasing engine reference.");
        zzajwVar = this.zzddh.zzddf;
        zzajwVar.zzsy();
    }
}
