package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbm;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
final class zzdlv implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final long startTime;
    private final HandlerThread zzdyf;
    private zzdmr zzhbh;
    private final LinkedBlockingQueue<zzdng> zzhbj;
    private final String zzhbk;
    private final String zzhbl;
    private final int zzhbm = 1;
    private final zzdlk zzvj;
    private final zzgb zzvl;

    public zzdlv(Context context, int i, zzgb zzgbVar, String str, String str2, String str3, zzdlk zzdlkVar) {
        this.zzhbk = str;
        this.zzvl = zzgbVar;
        this.zzhbl = str2;
        this.zzvj = zzdlkVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzdyf = handlerThread;
        handlerThread.start();
        this.startTime = System.currentTimeMillis();
        this.zzhbh = new zzdmr(context, this.zzdyf.getLooper(), this, this, 19621000);
        this.zzhbj = new LinkedBlockingQueue<>();
        this.zzhbh.checkAvailabilityAndConnect();
    }

    public final zzdng zzdy(int i) {
        zzdng zzdngVar;
        try {
            zzdngVar = this.zzhbj.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzb(2009, this.startTime, e);
            zzdngVar = null;
        }
        zzb(3004, this.startTime, null);
        if (zzdngVar != null) {
            if (zzdngVar.status == 7) {
                zzdlk.zzb(zzbm.zza.zzc.DISABLED);
            } else {
                zzdlk.zzb(zzbm.zza.zzc.ENABLED);
            }
        }
        return zzdngVar == null ? zzauk() : zzdngVar;
    }

    private final zzdmy zzaui() {
        try {
            return this.zzhbh.zzaux();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            zzb(4011, this.startTime, null);
            this.zzhbj.put(zzauk());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzdmy zzaui = zzaui();
        if (zzaui != null) {
            try {
                zzdng zza = zzaui.zza(new zzdne(this.zzhbm, this.zzvl, this.zzhbk, this.zzhbl));
                zzb(5011, this.startTime, null);
                this.zzhbj.put(zza);
            } catch (Throwable th) {
                try {
                    zzb(2010, this.startTime, new Exception(th));
                } finally {
                    zzaot();
                    this.zzdyf.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zzb(4012, this.startTime, null);
            this.zzhbj.put(zzauk());
        } catch (InterruptedException unused) {
        }
    }

    private final void zzaot() {
        zzdmr zzdmrVar = this.zzhbh;
        if (zzdmrVar != null) {
            if (zzdmrVar.isConnected() || this.zzhbh.isConnecting()) {
                this.zzhbh.disconnect();
            }
        }
    }

    private static zzdng zzauk() {
        return new zzdng(null, 1);
    }

    private final void zzb(int i, long j, Exception exc) {
        zzdlk zzdlkVar = this.zzvj;
        if (zzdlkVar != null) {
            zzdlkVar.zza(i, System.currentTimeMillis() - j, exc);
        }
    }
}
