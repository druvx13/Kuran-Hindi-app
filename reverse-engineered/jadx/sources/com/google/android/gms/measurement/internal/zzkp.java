package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
public abstract class zzkp extends zzkq {
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkp(zzks zzksVar) {
        super(zzksVar);
        this.zza.zza(this);
    }

    protected abstract boolean zze();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzaj() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzak() {
        if (!zzaj()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzal() {
        if (this.zzb) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zze();
        this.zza.zzp();
        this.zzb = true;
    }
}
