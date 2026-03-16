package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcji extends zzahf {
    private final /* synthetic */ zzciz zzgal;
    private final /* synthetic */ Object zzgam;
    private final /* synthetic */ String zzgan;
    private final /* synthetic */ long zzgao;
    private final /* synthetic */ zzbaj zzgap;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcji(zzciz zzcizVar, Object obj, String str, long j, zzbaj zzbajVar) {
        this.zzgal = zzcizVar;
        this.zzgam = obj;
        this.zzgan = str;
        this.zzgao = j;
        this.zzgap = zzbajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void onInitializationSucceeded() {
        zzcij zzcijVar;
        synchronized (this.zzgam) {
            this.zzgal.zza(this.zzgan, true, "", (int) (com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - this.zzgao));
            zzcijVar = this.zzgal.zzgad;
            zzcijVar.zzgi(this.zzgan);
            this.zzgap.set(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void onInitializationFailed(String str) {
        zzcij zzcijVar;
        synchronized (this.zzgam) {
            this.zzgal.zza(this.zzgan, false, str, (int) (com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - this.zzgao));
            zzcijVar = this.zzgal.zzgad;
            zzcijVar.zzr(this.zzgan, "error");
            this.zzgap.set(false);
        }
    }
}
