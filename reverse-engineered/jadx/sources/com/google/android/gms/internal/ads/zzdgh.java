package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdgh implements zzctz<zzcel> {
    private final /* synthetic */ zzdgi zzgtc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdgh(zzdgi zzdgiVar) {
        this.zzgtc = zzdgiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctz
    public final void zzapn() {
        synchronized (this.zzgtc) {
            this.zzgtc.zzgtb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzctz
    public final /* synthetic */ void onSuccess(zzcel zzcelVar) {
        zzcel zzcelVar2;
        zzcel zzcelVar3 = zzcelVar;
        synchronized (this.zzgtc) {
            this.zzgtc.zzgtb = zzcelVar3;
            zzcelVar2 = this.zzgtc.zzgtb;
            zzcelVar2.zzahk();
        }
    }
}
