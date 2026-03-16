package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbaz implements Runnable {
    private final /* synthetic */ zzbav zzeba;
    private final /* synthetic */ String zzebc;
    private final /* synthetic */ String zzebd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbaz(zzbav zzbavVar, String str, String str2) {
        this.zzeba = zzbavVar;
        this.zzebc = str;
        this.zzebd = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbbf zzbbfVar;
        zzbbf zzbbfVar2;
        zzbbfVar = this.zzeba.zzeay;
        if (zzbbfVar != null) {
            zzbbfVar2 = this.zzeba.zzeay;
            zzbbfVar2.zzm(this.zzebc, this.zzebd);
        }
    }
}
