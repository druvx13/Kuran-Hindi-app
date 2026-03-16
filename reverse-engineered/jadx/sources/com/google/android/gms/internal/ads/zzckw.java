package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzckw extends zzckt {
    private String zzgbw;
    private int zzgbx = zzclb.zzgbz;

    public zzckw(Context context) {
        this.zzgbu = new zzaqr(context, com.google.android.gms.ads.internal.zzq.zzlk().zzxx(), this, this);
    }

    public final zzdri<InputStream> zzi(zzarj zzarjVar) {
        synchronized (this.mLock) {
            if (this.zzgbx != zzclb.zzgbz && this.zzgbx != zzclb.zzgca) {
                return zzdqw.immediateFailedFuture(new zzclc(1));
            } else if (this.zzgbr) {
                return this.zzdej;
            } else {
                this.zzgbx = zzclb.zzgca;
                this.zzgbr = true;
                this.zzgbt = zzarjVar;
                this.zzgbu.checkAvailabilityAndConnect();
                this.zzdej.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzckz
                    private final zzckw zzgby;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgby = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzgby.zzaot();
                    }
                }, zzbab.zzdzw);
                return this.zzdej;
            }
        }
    }

    public final zzdri<InputStream> zzgk(String str) {
        synchronized (this.mLock) {
            if (this.zzgbx != zzclb.zzgbz && this.zzgbx != zzclb.zzgcb) {
                return zzdqw.immediateFailedFuture(new zzclc(1));
            } else if (this.zzgbr) {
                return this.zzdej;
            } else {
                this.zzgbx = zzclb.zzgcb;
                this.zzgbr = true;
                this.zzgbw = str;
                this.zzgbu.checkAvailabilityAndConnect();
                this.zzdej.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcky
                    private final zzckw zzgby;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgby = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzgby.zzaot();
                    }
                }, zzbab.zzdzw);
                return this.zzdej;
            }
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
                    if (this.zzgbx == zzclb.zzgca) {
                        this.zzgbu.zzus().zzc(this.zzgbt, new zzcks(this));
                    } else if (this.zzgbx == zzclb.zzgcb) {
                        this.zzgbu.zzus().zza(this.zzgbw, new zzcks(this));
                    } else {
                        this.zzdej.setException(new zzclc(0));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zzdej.setException(new zzclc(0));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzq.zzla().zza(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zzdej.setException(new zzclc(0));
                }
            }
        }
    }
}
