package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzazz;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzdu;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzm implements Callable<zzdt> {
    private final /* synthetic */ zzl zzbmn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(zzl zzlVar) {
        this.zzbmn = zzlVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzdt call() throws Exception {
        zzazz zzazzVar;
        Context context;
        zzazzVar = this.zzbmn.zzbmo;
        String str = zzazzVar.zzbnd;
        context = this.zzbmn.zzvf;
        return new zzdt(zzdu.zzb(str, context, false));
    }
}
