package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbnd extends zzblx {
    private final Executor zzfhi;
    private final zzaem zzfjy;
    private final Runnable zzfjz;

    public zzbnd(zzbnv zzbnvVar, zzaem zzaemVar, Runnable runnable, Executor executor) {
        super(zzbnvVar);
        this.zzfjy = zzaemVar;
        this.zzfjz = runnable;
        this.zzfhi = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final zzxl getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zza(ViewGroup viewGroup, zzum zzumVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final zzdgn zzahd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final View zzahe() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final zzdgn zzahi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final int zzahj() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zzkf() {
    }

    @Override // com.google.android.gms.internal.ads.zzbns
    public final void zzahk() {
        final AtomicReference atomicReference = new AtomicReference(this.zzfjz);
        final Runnable runnable = new Runnable(atomicReference) { // from class: com.google.android.gms.internal.ads.zzbnc
            private final AtomicReference zzfjx;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfjx = atomicReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = (Runnable) this.zzfjx.getAndSet(null);
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        this.zzfhi.execute(new Runnable(this, runnable) { // from class: com.google.android.gms.internal.ads.zzbnf
            private final Runnable zzffu;
            private final zzbnd zzfka;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfka = this;
                this.zzffu = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfka.zze(this.zzffu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(Runnable runnable) {
        try {
            if (this.zzfjy.zzm(ObjectWrapper.wrap(runnable))) {
                return;
            }
            runnable.run();
        } catch (RemoteException unused) {
            runnable.run();
        }
    }
}
