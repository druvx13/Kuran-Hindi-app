package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.InputStream;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzckt implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected zzarj zzgbt;
    protected zzaqr zzgbu;
    protected final zzbaj<InputStream> zzdej = new zzbaj<>();
    protected final Object mLock = new Object();
    protected boolean zzgbr = false;
    protected boolean zzgbs = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaot() {
        synchronized (this.mLock) {
            this.zzgbs = true;
            if (this.zzgbu.isConnected() || this.zzgbu.isConnecting()) {
                this.zzgbu.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        zzawr.zzed("Cannot connect to remote service, fallback to local instance.");
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        zzawr.zzed("Disconnected from remote ad request service.");
        this.zzdej.setException(new zzclc(0));
    }
}
