package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzckr extends zzckt {
    public zzckr(Context context) {
        this.zzgbu = new zzaqr(context, com.google.android.gms.ads.internal.zzq.zzlk().zzxx(), this, this);
    }

    public final zzdri<InputStream> zzg(zzarj zzarjVar) {
        synchronized (this.mLock) {
            if (this.zzgbr) {
                return this.zzdej;
            }
            this.zzgbr = true;
            this.zzgbt = zzarjVar;
            this.zzgbu.checkAvailabilityAndConnect();
            this.zzdej.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzckq
                private final zzckr zzgbp;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgbp = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgbp.zzaot();
                }
            }, zzbab.zzdzw);
            return this.zzdej;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzckt, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzawr.zzed("Cannot connect to remote service, fallback to local instance.");
        this.zzdej.setException(new zzclc(0));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.mLock) {
            if (!this.zzgbs) {
                this.zzgbs = true;
                try {
                    this.zzgbu.zzus().zza(this.zzgbt, new zzcks(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zzdej.setException(new zzclc(0));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzq.zzla().zza(th, "RemoteAdRequestClientTask.onConnected");
                    this.zzdej.setException(new zzclc(0));
                }
            }
        }
    }
}
