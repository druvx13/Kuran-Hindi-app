package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzauz implements zzavh {
    static final zzavh zzdtc = new zzauz();

    private zzauz() {
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    public final Object zzb(zzbgr zzbgrVar) {
        String currentScreenName = zzbgrVar.getCurrentScreenName();
        if (currentScreenName != null) {
            return currentScreenName;
        }
        String currentScreenClass = zzbgrVar.getCurrentScreenClass();
        return currentScreenClass != null ? currentScreenClass : "";
    }
}
