package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbkp implements com.google.android.gms.ads.internal.overlay.zzo, zzbrp, zzbrs, zzpz {
    private final Clock zzbnt;
    private final zzbkg zzfhe;
    private final zzbkn zzfhf;
    private final zzalb<JSONObject, JSONObject> zzfhh;
    private final Executor zzfhi;
    private final Set<zzbek> zzfhg = new HashSet();
    private final AtomicBoolean zzfhj = new AtomicBoolean(false);
    private final zzbkr zzfhk = new zzbkr();
    private boolean zzfhl = false;
    private WeakReference<?> zzfhm = new WeakReference<>(this);

    public zzbkp(zzaku zzakuVar, zzbkn zzbknVar, Executor executor, zzbkg zzbkgVar, Clock clock) {
        this.zzfhe = zzbkgVar;
        this.zzfhh = zzakuVar.zzb("google.afma.activeView.handleUpdate", zzakk.zzddu, zzakk.zzddu);
        this.zzfhf = zzbknVar;
        this.zzfhi = executor;
        this.zzbnt = clock;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zztz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzua() {
    }

    public final synchronized void zzagm() {
        if (!(this.zzfhm.get() != null)) {
            zzago();
            return;
        }
        if (!this.zzfhl && this.zzfhj.get()) {
            try {
                this.zzfhk.timestamp = this.zzbnt.elapsedRealtime();
                final JSONObject zzj = this.zzfhf.zzj(this.zzfhk);
                for (final zzbek zzbekVar : this.zzfhg) {
                    this.zzfhi.execute(new Runnable(zzbekVar, zzj) { // from class: com.google.android.gms.internal.ads.zzbko
                        private final zzbek zzelg;
                        private final JSONObject zzfhd;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzelg = zzbekVar;
                            this.zzfhd = zzj;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzelg.zza("AFMA_updateActiveView", this.zzfhd);
                        }
                    });
                }
                zzbaf.zzb(this.zzfhh.zzf(zzj), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                zzawr.zza("Failed to call ActiveViewJS", e);
            }
        }
    }

    private final void zzagn() {
        for (zzbek zzbekVar : this.zzfhg) {
            this.zzfhe.zze(zzbekVar);
        }
        this.zzfhe.zzagl();
    }

    public final synchronized void zzago() {
        zzagn();
        this.zzfhl = true;
    }

    public final synchronized void zzf(zzbek zzbekVar) {
        this.zzfhg.add(zzbekVar);
        this.zzfhe.zzd(zzbekVar);
    }

    public final void zzo(Object obj) {
        this.zzfhm = new WeakReference<>(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final synchronized void zza(zzqa zzqaVar) {
        this.zzfhk.zzbot = zzqaVar.zzbot;
        this.zzfhk.zzfhu = zzqaVar;
        zzagm();
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final synchronized void zzbx(Context context) {
        this.zzfhk.zzfhr = true;
        zzagm();
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final synchronized void zzby(Context context) {
        this.zzfhk.zzfhr = false;
        zzagm();
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final synchronized void zzbz(Context context) {
        this.zzfhk.zzfht = "u";
        zzagm();
        zzagn();
        this.zzfhl = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onPause() {
        this.zzfhk.zzfhr = true;
        zzagm();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onResume() {
        this.zzfhk.zzfhr = false;
        zzagm();
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final synchronized void onAdImpression() {
        if (this.zzfhj.compareAndSet(false, true)) {
            this.zzfhe.zza(this);
            zzagm();
        }
    }
}
