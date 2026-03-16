package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdih {
    private zzdik zzgvu = null;
    private zzdik zzgvv = null;
    private zzdik zzgvw = null;
    private zzdik zzgvx = null;
    private zzdik zzgvy = null;
    private zzdik zzgvz = null;
    private zzdik zzgwa = null;
    private zzdik zzgwb = null;

    public final void zza(zzdik zzdikVar) {
        this.zzgvx = zzdikVar;
    }

    public final void onAdClosed() {
        zzdik zzdikVar = this.zzgvx;
        if (zzdikVar != null) {
            zzdikVar.execute();
        }
    }
}
