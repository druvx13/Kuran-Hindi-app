package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzayo implements zzy {
    private final /* synthetic */ String zzdxx;
    private final /* synthetic */ zzayp zzdxy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayo(zzaym zzaymVar, String str, zzayp zzaypVar) {
        this.zzdxx = str;
        this.zzdxy = zzaypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzy
    public final void zzc(zzae zzaeVar) {
        String str = this.zzdxx;
        String zzaeVar2 = zzaeVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(zzaeVar2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(zzaeVar2);
        zzawr.zzfc(sb.toString());
        this.zzdxy.zzb(null);
    }
}
