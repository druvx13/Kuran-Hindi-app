package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbky implements zzpz {
    private final Clock zzbnt;
    private zzbek zzdce;
    private final zzbkn zzfhf;
    private final Executor zzfhi;
    private boolean zzbtg = false;
    private boolean zzfid = false;
    private zzbkr zzfhk = new zzbkr();

    public zzbky(Executor executor, zzbkn zzbknVar, Clock clock) {
        this.zzfhi = executor;
        this.zzfhf = zzbknVar;
        this.zzbnt = clock;
    }

    private final void zzagp() {
        try {
            final JSONObject zzj = this.zzfhf.zzj(this.zzfhk);
            if (this.zzdce != null) {
                this.zzfhi.execute(new Runnable(this, zzj) { // from class: com.google.android.gms.internal.ads.zzblb
                    private final JSONObject zzfhd;
                    private final zzbky zzfie;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfie = this;
                        this.zzfhd = zzj;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzfie.zzi(this.zzfhd);
                    }
                });
            }
        } catch (JSONException e) {
            zzawr.zza("Failed to call video active view js", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zza(zzqa zzqaVar) {
        this.zzfhk.zzbot = this.zzfid ? false : zzqaVar.zzbot;
        this.zzfhk.timestamp = this.zzbnt.elapsedRealtime();
        this.zzfhk.zzfhu = zzqaVar;
        if (this.zzbtg) {
            zzagp();
        }
    }

    public final void zzg(zzbek zzbekVar) {
        this.zzdce = zzbekVar;
    }

    public final void disable() {
        this.zzbtg = false;
    }

    public final void enable() {
        this.zzbtg = true;
        zzagp();
    }

    public final void zzbf(boolean z) {
        this.zzfid = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(JSONObject jSONObject) {
        this.zzdce.zza("AFMA_updateActiveView", jSONObject);
    }
}
