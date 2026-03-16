package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Future;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzsl {
    private final Object lock = new Object();
    private zzsg zzbsg;
    private boolean zzbst;
    private final Context zzvf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsl(Context context) {
        this.zzvf = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Future<InputStream> zzb(zzsf zzsfVar) {
        zzso zzsoVar = new zzso(this);
        zzsn zzsnVar = new zzsn(this, zzsfVar, zzsoVar);
        zzsr zzsrVar = new zzsr(this, zzsoVar);
        synchronized (this.lock) {
            zzsg zzsgVar = new zzsg(this.zzvf, com.google.android.gms.ads.internal.zzq.zzlk().zzxx(), zzsnVar, zzsrVar);
            this.zzbsg = zzsgVar;
            zzsgVar.checkAvailabilityAndConnect();
        }
        return zzsoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.lock) {
            if (this.zzbsg == null) {
                return;
            }
            this.zzbsg.disconnect();
            this.zzbsg = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zza(zzsl zzslVar, boolean z) {
        zzslVar.zzbst = true;
        return true;
    }
}
