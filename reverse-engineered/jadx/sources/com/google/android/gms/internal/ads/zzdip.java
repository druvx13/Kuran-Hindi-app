package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdip {
    private final zzdis zzgwj = new zzdis();
    private int zzgwk;
    private int zzgwl;
    private int zzgwm;
    private int zzgwn;
    private int zzgwo;

    public final void zzass() {
        this.zzgwm++;
    }

    public final void zzast() {
        this.zzgwn++;
    }

    public final void zzasu() {
        this.zzgwk++;
        this.zzgwj.zzgxd = true;
    }

    public final void zzasv() {
        this.zzgwl++;
        this.zzgwj.zzgxe = true;
    }

    public final void zzasw() {
        this.zzgwo++;
    }

    public final zzdis zzasx() {
        zzdis zzdisVar = (zzdis) this.zzgwj.clone();
        zzdis zzdisVar2 = this.zzgwj;
        zzdisVar2.zzgxd = false;
        zzdisVar2.zzgxe = false;
        return zzdisVar;
    }

    public final String zzasy() {
        return "\n\tPool does not exist: " + this.zzgwm + "\n\tNew pools created: " + this.zzgwk + "\n\tPools removed: " + this.zzgwl + "\n\tEntries added: " + this.zzgwo + "\n\tNo entries retrieved: " + this.zzgwn + "\n";
    }
}
