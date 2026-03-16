package com.google.android.gms.internal.ads;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaxe implements zzazn {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzdwk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxe(zzaxa zzaxaVar, Context context, String str) {
        this.val$context = context;
        this.zzdwk = str;
    }

    @Override // com.google.android.gms.internal.ads.zzazn
    public final void zzeq(String str) {
        com.google.android.gms.ads.internal.zzq.zzkw();
        zzaxa.zzb(this.val$context, this.zzdwk, str);
    }
}
