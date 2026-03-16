package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzajy implements zzbal {
    private final /* synthetic */ zzajs zzddk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajy(zzajw zzajwVar, zzajs zzajsVar) {
        this.zzddk = zzajsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbal
    public final void run() {
        zzawr.zzeg("Rejecting reference for JS Engine.");
        this.zzddk.reject();
    }
}
