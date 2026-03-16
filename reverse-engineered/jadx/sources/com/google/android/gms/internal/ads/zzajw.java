package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzajw extends zzbaq<zzais> {
    private zzayf<zzais> zzdcr;
    private final Object lock = new Object();
    private boolean zzddi = false;
    private int zzddj = 0;

    public zzajw(zzayf<zzais> zzayfVar) {
        this.zzdcr = zzayfVar;
    }

    public final zzajs zzsx() {
        zzajs zzajsVar = new zzajs(this);
        synchronized (this.lock) {
            zza(new zzajz(this, zzajsVar), new zzajy(this, zzajsVar));
            Preconditions.checkState(this.zzddj >= 0);
            this.zzddj++;
        }
        return zzajsVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzsy() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzddj > 0);
            zzawr.zzeg("Releasing 1 reference for JS Engine");
            this.zzddj--;
            zzta();
        }
    }

    public final void zzsz() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzddj >= 0);
            zzawr.zzeg("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzddi = true;
            zzta();
        }
    }

    private final void zzta() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzddj >= 0);
            if (this.zzddi && this.zzddj == 0) {
                zzawr.zzeg("No reference is left (including root). Cleaning up engine.");
                zza(new zzakb(this), new zzbao());
            } else {
                zzawr.zzeg("There are still references to the engine. Not destroying.");
            }
        }
    }
}
