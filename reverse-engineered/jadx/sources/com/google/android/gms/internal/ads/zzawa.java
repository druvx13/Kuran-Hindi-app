package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzawa implements Runnable {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzbaj zzdth;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawa(zzavx zzavxVar, Context context, zzbaj zzbajVar) {
        this.val$context = context;
        this.zzdth = zzbajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzdth.set(AdvertisingIdClient.getAdvertisingIdInfo(this.val$context));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzdth.setException(e);
            zzazw.zzc("Exception while getting advertising Id info", e);
        }
    }
}
