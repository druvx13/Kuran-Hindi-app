package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdge implements zzctz<zzcel> {
    private final /* synthetic */ zzdgc zzgsy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdge(zzdgc zzdgcVar) {
        this.zzgsy = zzdgcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctz
    public final void zzapn() {
        synchronized (this.zzgsy) {
            this.zzgsy.zzgtb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzctz
    public final /* synthetic */ void onSuccess(zzcel zzcelVar) {
        zzcel zzcelVar2;
        zzcel zzcelVar3 = zzcelVar;
        synchronized (this.zzgsy) {
            this.zzgsy.zzgtb = zzcelVar3;
            zzcelVar2 = this.zzgsy.zzgtb;
            zzcelVar2.zzahk();
        }
    }
}
