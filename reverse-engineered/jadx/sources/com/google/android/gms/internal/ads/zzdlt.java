package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbv;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdlt implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final String packageName;
    private final HandlerThread zzdyf;
    private zzdmr zzhbh;
    private final String zzhbi;
    private final LinkedBlockingQueue<zzbv.zza> zzhbj;

    public zzdlt(Context context, String str, String str2) {
        this.packageName = str;
        this.zzhbi = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zzdyf = handlerThread;
        handlerThread.start();
        this.zzhbh = new zzdmr(context, this.zzdyf.getLooper(), this, this, 9200000);
        this.zzhbj = new LinkedBlockingQueue<>();
        this.zzhbh.checkAvailabilityAndConnect();
    }

    public final zzbv.zza zzdx(int i) {
        zzbv.zza zzaVar;
        try {
            zzaVar = this.zzhbj.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzaVar = null;
        }
        return zzaVar == null ? zzauj() : zzaVar;
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
            this.zzhbj.put(zzauj());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzdmy zzaui = zzaui();
        if (zzaui != null) {
            try {
                try {
                    this.zzhbj.put(zzaui.zza(new zzdmu(this.packageName, this.zzhbi)).zzauy());
                    zzaot();
                    this.zzdyf.quit();
                } catch (Throwable unused) {
                    this.zzhbj.put(zzauj());
                    zzaot();
                    this.zzdyf.quit();
                }
            } catch (InterruptedException unused2) {
                zzaot();
                this.zzdyf.quit();
            } catch (Throwable th) {
                zzaot();
                this.zzdyf.quit();
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzhbj.put(zzauj());
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

    private static zzbv.zza zzauj() {
        return (zzbv.zza) ((zzecd) zzbv.zza.zzar().zzn(32768L).zzbet());
    }
}
