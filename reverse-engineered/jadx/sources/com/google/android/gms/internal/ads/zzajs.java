package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzajs extends zzbaq<zzakd> {
    private final Object lock = new Object();
    private final zzajw zzddf;
    private boolean zzddg;

    public zzajs(zzajw zzajwVar) {
        this.zzddf = zzajwVar;
    }

    public final void release() {
        synchronized (this.lock) {
            if (this.zzddg) {
                return;
            }
            this.zzddg = true;
            zza(new zzajv(this), new zzbao());
            zza(new zzaju(this), new zzajx(this));
        }
    }
}
