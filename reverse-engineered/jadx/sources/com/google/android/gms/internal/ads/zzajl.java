package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzajl implements Runnable {
    private final zzais zzdcz;

    private zzajl(zzais zzaisVar) {
        this.zzdcz = zzaisVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zzb(zzais zzaisVar) {
        return new zzajl(zzaisVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdcz.destroy();
    }
}
