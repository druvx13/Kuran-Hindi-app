package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzgp implements zzhk, zzhn {
    private int index;
    private int state;
    private final int zzade;
    private zzhm zzadf;
    private zzmt zzadg;
    private long zzadh;
    private boolean zzadi = true;
    private boolean zzadj;

    public zzgp(int i) {
        this.zzade = i;
    }

    protected void onStarted() throws zzgq {
    }

    protected void onStopped() throws zzgq {
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public void zza(int i, Object obj) throws zzgq {
    }

    protected void zza(long j, boolean z) throws zzgq {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zza(zzhf[] zzhfVarArr, long j) throws zzgq {
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final zzhn zzdy() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public zzol zzdz() {
        return null;
    }

    protected void zze(boolean z) throws zzgq {
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public int zzef() throws zzgq {
        return 0;
    }

    protected void zzeg() {
    }

    @Override // com.google.android.gms.internal.ads.zzhk, com.google.android.gms.internal.ads.zzhn
    public final int getTrackType() {
        return this.zzade;
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void setIndex(int i) {
        this.index = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final int getState() {
        return this.state;
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zza(zzhm zzhmVar, zzhf[] zzhfVarArr, zzmt zzmtVar, long j, boolean z, long j2) throws zzgq {
        zzoh.checkState(this.state == 0);
        this.zzadf = zzhmVar;
        this.state = 1;
        zze(z);
        zza(zzhfVarArr, zzmtVar, j2);
        zza(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void start() throws zzgq {
        zzoh.checkState(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zza(zzhf[] zzhfVarArr, zzmt zzmtVar, long j) throws zzgq {
        zzoh.checkState(!this.zzadj);
        this.zzadg = zzmtVar;
        this.zzadi = false;
        this.zzadh = j;
        zza(zzhfVarArr, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final zzmt zzea() {
        return this.zzadg;
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final boolean zzeb() {
        return this.zzadi;
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzec() {
        this.zzadj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final boolean zzed() {
        return this.zzadj;
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzee() throws IOException {
        this.zzadg.zzhr();
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzdm(long j) throws zzgq {
        this.zzadj = false;
        this.zzadi = false;
        zza(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void stop() throws zzgq {
        zzoh.checkState(this.state == 2);
        this.state = 1;
        onStopped();
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void disable() {
        zzoh.checkState(this.state == 1);
        this.state = 0;
        this.zzadg = null;
        this.zzadj = false;
        zzeg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzhm zzeh() {
        return this.zzadf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zza(zzhh zzhhVar, zzjb zzjbVar, boolean z) {
        int zzb = this.zzadg.zzb(zzhhVar, zzjbVar, z);
        if (zzb == -4) {
            if (zzjbVar.zzgh()) {
                this.zzadi = true;
                return this.zzadj ? -4 : -3;
            }
            zzjbVar.timeUs += this.zzadh;
        } else if (zzb == -5) {
            zzhf zzhfVar = zzhhVar.zzahd;
            if (zzhfVar.zzagx != Long.MAX_VALUE) {
                zzhhVar.zzahd = zzhfVar.zzds(zzhfVar.zzagx + this.zzadh);
            }
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzdn(long j) {
        this.zzadg.zzeh(j - this.zzadh);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzei() {
        return this.zzadi ? this.zzadj : this.zzadg.isReady();
    }
}
