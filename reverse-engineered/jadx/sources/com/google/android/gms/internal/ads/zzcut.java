package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import javax.annotation.Nonnull;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcut implements zzdqx<ArrayList<Uri>> {
    private final /* synthetic */ zzapx zzgkz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcut(zzcuh zzcuhVar, zzapx zzapxVar) {
        this.zzgkz = zzapxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        try {
            zzapx zzapxVar = this.zzgkz;
            String valueOf = String.valueOf(th.getMessage());
            zzapxVar.onError(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(@Nonnull ArrayList<Uri> arrayList) {
        try {
            this.zzgkz.onSuccess(arrayList);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }
}
