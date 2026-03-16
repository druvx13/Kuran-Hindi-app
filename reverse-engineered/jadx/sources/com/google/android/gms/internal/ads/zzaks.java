package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaks implements zzbal {
    private final /* synthetic */ zzbaj zzdax;
    private final /* synthetic */ zzajs zzded;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaks(zzakq zzakqVar, zzbaj zzbajVar, zzajs zzajsVar) {
        this.zzdax = zzbajVar;
        this.zzded = zzajsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbal
    public final void run() {
        this.zzdax.setException(new zzake("Unable to obtain a JavascriptEngine."));
        this.zzded.release();
    }
}
