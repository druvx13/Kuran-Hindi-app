package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzsn implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzsf zzbsu;
    private final /* synthetic */ zzbaj zzbsv;
    final /* synthetic */ zzsl zzbsw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsn(zzsl zzslVar, zzsf zzsfVar, zzbaj zzbajVar) {
        this.zzbsw = zzslVar;
        this.zzbsu = zzsfVar;
        this.zzbsv = zzbajVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z;
        final zzsg zzsgVar;
        obj = this.zzbsw.lock;
        synchronized (obj) {
            z = this.zzbsw.zzbst;
            if (z) {
                return;
            }
            zzsl.zza(this.zzbsw, true);
            zzsgVar = this.zzbsw.zzbsg;
            if (zzsgVar == null) {
                return;
            }
            zzdrh zzdrhVar = zzbab.zzdzr;
            final zzsf zzsfVar = this.zzbsu;
            final zzbaj zzbajVar = this.zzbsv;
            final zzdri<?> zzf = zzdrhVar.zzf(new Runnable(this, zzsgVar, zzsfVar, zzbajVar) { // from class: com.google.android.gms.internal.ads.zzsq
                private final zzsn zzbsz;
                private final zzsg zzbta;
                private final zzsf zzbtb;
                private final zzbaj zzbtc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbsz = this;
                    this.zzbta = zzsgVar;
                    this.zzbtb = zzsfVar;
                    this.zzbtc = zzbajVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzsn zzsnVar = this.zzbsz;
                    zzsg zzsgVar2 = this.zzbta;
                    zzsf zzsfVar2 = this.zzbtb;
                    zzbaj zzbajVar2 = this.zzbtc;
                    try {
                        zzse zza = zzsgVar2.zzmy().zza(zzsfVar2);
                        if (!zza.zzmv()) {
                            zzbajVar2.setException(new RuntimeException("No entry contents."));
                            zzsnVar.zzbsw.disconnect();
                            return;
                        }
                        zzss zzssVar = new zzss(zzsnVar, zza.zzmw(), 1);
                        int read = zzssVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzssVar.unread(read);
                        zzbajVar2.set(zzssVar);
                    } catch (RemoteException | IOException e) {
                        zzawr.zzc("Unable to obtain a cache service instance.", e);
                        zzbajVar2.setException(e);
                        zzsnVar.zzbsw.disconnect();
                    }
                }
            });
            zzbaj zzbajVar2 = this.zzbsv;
            final zzbaj zzbajVar3 = this.zzbsv;
            zzbajVar2.addListener(new Runnable(zzbajVar3, zzf) { // from class: com.google.android.gms.internal.ads.zzsp
                private final zzbaj zzbsx;
                private final Future zzbsy;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbsx = zzbajVar3;
                    this.zzbsy = zzf;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbaj zzbajVar4 = this.zzbsx;
                    Future future = this.zzbsy;
                    if (zzbajVar4.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzbab.zzdzw);
        }
    }
}
