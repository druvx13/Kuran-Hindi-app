package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public abstract class zzhk extends zzhh {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhk(zzgq zzgqVar) {
        super(zzgqVar);
        this.zzx.zza(this);
    }

    protected void f_() {
    }

    protected abstract boolean zze();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzz() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaa() {
        if (!zzz()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzab() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zze()) {
            return;
        }
        this.zzx.zzag();
        this.zza = true;
    }

    public final void zzac() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        f_();
        this.zzx.zzag();
        this.zza = true;
    }
}
