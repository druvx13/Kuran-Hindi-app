package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjr implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zziz zza;
    private volatile boolean zzb;
    private volatile zzfk zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzjr(zziz zzizVar) {
        this.zza = zzizVar;
    }

    public final void zza(Intent intent) {
        zzjr zzjrVar;
        this.zza.zzd();
        Context zzn = this.zza.zzn();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzr().zzx().zza("Connection attempt already in progress");
                return;
            }
            this.zza.zzr().zzx().zza("Using local app measurement service");
            this.zzb = true;
            zzjrVar = this.zza.zza;
            connectionTracker.bindService(zzn, intent, zzjrVar, 129);
        }
    }

    public final void zza() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzjr zzjrVar;
        zzfb zzfdVar;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzr().zzf().zza("Service connected with null binder");
                return;
            }
            zzfb zzfbVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        if (queryLocalInterface instanceof zzfb) {
                            zzfdVar = (zzfb) queryLocalInterface;
                        } else {
                            zzfdVar = new zzfd(iBinder);
                        }
                        zzfbVar = zzfdVar;
                    }
                    this.zza.zzr().zzx().zza("Bound to IMeasurementService interface");
                } else {
                    this.zza.zzr().zzf().zza("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zza.zzr().zzf().zza("Service connect failed to get IMeasurementService");
            }
            if (zzfbVar == null) {
                this.zzb = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    Context zzn = this.zza.zzn();
                    zzjrVar = this.zza.zza;
                    connectionTracker.unbindService(zzn, zzjrVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzq().zza(new zzju(this, zzfbVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zza.zzr().zzw().zza("Service disconnected");
        this.zza.zzq().zza(new zzjt(this, componentName));
    }

    public final void zzb() {
        this.zza.zzd();
        Context zzn = this.zza.zzn();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzr().zzx().zza("Connection attempt already in progress");
            } else if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                this.zza.zzr().zzx().zza("Already awaiting connection attempt");
            } else {
                this.zzc = new zzfk(zzn, Looper.getMainLooper(), this, this);
                this.zza.zzr().zzx().zza("Connecting to remote service");
                this.zzb = true;
                this.zzc.checkAvailabilityAndConnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.zza.zzq().zza(new zzjw(this, this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zza.zzr().zzw().zza("Service connection suspended");
        this.zza.zzq().zza(new zzjv(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzfj zzd = this.zza.zzx.zzd();
        if (zzd != null) {
            zzd.zzi().zza("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzq().zza(new zzjy(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zza(zzjr zzjrVar, boolean z) {
        zzjrVar.zzb = false;
        return false;
    }
}
