package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzbui<ListenerT> {
    private final Map<ListenerT, Executor> zzfnt = new HashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbui(Set<zzbvt<ListenerT>> set) {
        zzb(set);
    }

    public final synchronized void zza(zzbvt<ListenerT> zzbvtVar) {
        zza(zzbvtVar.zzfom, zzbvtVar.executor);
    }

    public final synchronized void zza(ListenerT listenert, Executor executor) {
        this.zzfnt.put(listenert, executor);
    }

    private final synchronized void zzb(Set<zzbvt<ListenerT>> set) {
        for (zzbvt<ListenerT> zzbvtVar : set) {
            zza(zzbvtVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zza(final zzbuk<ListenerT> zzbukVar) {
        for (Map.Entry<ListenerT, Executor> entry : this.zzfnt.entrySet()) {
            final ListenerT key = entry.getKey();
            entry.getValue().execute(new Runnable(zzbukVar, key) { // from class: com.google.android.gms.internal.ads.zzbuh
                private final Object zzdel;
                private final zzbuk zzfns;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfns = zzbukVar;
                    this.zzdel = key;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.zzfns.zzp(this.zzdel);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzq.zzla().zzb(th, "EventEmitter.notify");
                        zzawr.zza("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
