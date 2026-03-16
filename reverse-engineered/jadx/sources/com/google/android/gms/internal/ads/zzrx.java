package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzrx {
    private zzsg zzbsg;
    private zzsk zzbsh;
    private Context zzvf;
    private final Runnable zzbsf = new zzsa(this);
    private final Object lock = new Object();

    public final void initialize(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.lock) {
            if (this.zzvf != null) {
                return;
            }
            this.zzvf = context.getApplicationContext();
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcpt)).booleanValue()) {
                connect();
            } else {
                if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcps)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzq.zzkz().zza(new zzrz(this));
                }
            }
        }
    }

    public final void zzmu() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcpu)).booleanValue()) {
            synchronized (this.lock) {
                connect();
                com.google.android.gms.ads.internal.zzq.zzkw();
                zzaxa.zzdwf.removeCallbacks(this.zzbsf);
                com.google.android.gms.ads.internal.zzq.zzkw();
                zzaxa.zzdwf.postDelayed(this.zzbsf, ((Long) zzvj.zzpv().zzd(zzzz.zzcpv)).longValue());
            }
        }
    }

    public final zzse zza(zzsf zzsfVar) {
        synchronized (this.lock) {
            if (this.zzbsh == null) {
                return new zzse();
            }
            try {
                return this.zzbsh.zza(zzsfVar);
            } catch (RemoteException e) {
                zzawr.zzc("Unable to call into cache service.", e);
                return new zzse();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void connect() {
        synchronized (this.lock) {
            if (this.zzvf != null && this.zzbsg == null) {
                zzsg zza = zza(new zzsc(this), new zzsb(this));
                this.zzbsg = zza;
                zza.checkAvailabilityAndConnect();
            }
        }
    }

    private final synchronized zzsg zza(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzsg(this.zzvf, com.google.android.gms.ads.internal.zzq.zzlk().zzxx(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.lock) {
            if (this.zzbsg == null) {
                return;
            }
            if (this.zzbsg.isConnected() || this.zzbsg.isConnecting()) {
                this.zzbsg.disconnect();
            }
            this.zzbsg = null;
            this.zzbsh = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzsg zza(zzrx zzrxVar, zzsg zzsgVar) {
        zzrxVar.zzbsg = null;
        return null;
    }
}
