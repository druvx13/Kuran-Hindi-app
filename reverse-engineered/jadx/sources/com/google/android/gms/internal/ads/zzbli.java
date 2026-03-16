package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbli {
    private final zzdha zzepv;
    private final zzchz zzfiq;

    public zzbli(zzchz zzchzVar, zzdha zzdhaVar) {
        this.zzfiq = zzchzVar;
        this.zzepv = zzdhaVar;
    }

    public final void zzfd(long j) {
        this.zzfiq.zzaoa().zza(this.zzepv.zzgus.zzgup).zzq("action", "ad_closed").zzq("show_time", String.valueOf(j)).zzq("ad_format", "appopen").zzany();
    }
}
