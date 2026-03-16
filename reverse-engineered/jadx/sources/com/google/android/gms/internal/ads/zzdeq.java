package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdeq implements zzdnx<zzclc, zzdes> {
    private final /* synthetic */ zzdeo zzgsg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdeq(zzdeo zzdeoVar) {
        this.zzgsg = zzdeoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnx
    @NullableDecl
    public final /* synthetic */ zzdes apply(@NullableDecl zzclc zzclcVar) {
        zzdiy zzarp;
        zzdes zzdesVar;
        zzazw.zzc("", zzclcVar);
        zzawr.zzeg("Failed to get a cache key, reverting to legacy flow.");
        zzdeo zzdeoVar = this.zzgsg;
        zzarp = zzdeoVar.zzarp();
        zzdeoVar.zzgsf = new zzdes(null, zzarp, null);
        zzdesVar = this.zzgsg.zzgsf;
        return zzdesVar;
    }
}
