package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdn implements Runnable {
    private final /* synthetic */ Context zzxa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdn(zzdl zzdlVar, Context context) {
        this.zzxa = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdlk zzdlkVar;
        zzdf zzdfVar;
        try {
            zzdfVar = zzdl.zzvw;
            zzdfVar.zzb(this.zzxa);
        } catch (Exception e) {
            zzdlkVar = zzdl.zzvy;
            zzdlkVar.zza(2019, -1L, e);
        }
    }
}
