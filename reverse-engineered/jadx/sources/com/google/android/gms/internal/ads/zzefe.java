package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzefe extends zzefc<zzefb, zzefb> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefc
    public final boolean zza(zzeee zzeeeVar) {
        return false;
    }

    private static void zza(Object obj, zzefb zzefbVar) {
        ((zzecd) obj).zzhxv = zzefbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefc
    public final void zzak(Object obj) {
        ((zzecd) obj).zzhxv.zzbcj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefc
    public final /* synthetic */ int zzau(zzefb zzefbVar) {
        return zzefbVar.zzbex();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefc
    public final /* synthetic */ int zzba(zzefb zzefbVar) {
        return zzefbVar.zzbhf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefc
    public final /* synthetic */ zzefb zzj(zzefb zzefbVar, zzefb zzefbVar2) {
        zzefb zzefbVar3 = zzefbVar;
        zzefb zzefbVar4 = zzefbVar2;
        return zzefbVar4.equals(zzefb.zzbhd()) ? zzefbVar3 : zzefb.zza(zzefbVar3, zzefbVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefc
    public final /* synthetic */ void zzc(zzefb zzefbVar, zzefv zzefvVar) throws IOException {
        zzefbVar.zza(zzefvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefc
    public final /* synthetic */ void zza(zzefb zzefbVar, zzefv zzefvVar) throws IOException {
        zzefbVar.zzb(zzefvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefc
    public final /* synthetic */ void zzi(Object obj, zzefb zzefbVar) {
        zza(obj, zzefbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefc
    public final /* synthetic */ zzefb zzaz(Object obj) {
        zzefb zzefbVar = ((zzecd) obj).zzhxv;
        if (zzefbVar == zzefb.zzbhd()) {
            zzefb zzbhe = zzefb.zzbhe();
            zza(obj, zzbhe);
            return zzbhe;
        }
        return zzefbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefc
    public final /* synthetic */ zzefb zzay(Object obj) {
        return ((zzecd) obj).zzhxv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefc
    public final /* synthetic */ void zzh(Object obj, zzefb zzefbVar) {
        zza(obj, zzefbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzefc
    final /* synthetic */ zzefb zzaq(zzefb zzefbVar) {
        zzefb zzefbVar2 = zzefbVar;
        zzefbVar2.zzbcj();
        return zzefbVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefc
    public final /* synthetic */ zzefb zzbhg() {
        return zzefb.zzbhe();
    }

    @Override // com.google.android.gms.internal.ads.zzefc
    final /* synthetic */ void zza(zzefb zzefbVar, int i, zzefb zzefbVar2) {
        zzefbVar.zzd((i << 3) | 3, zzefbVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefc
    public final /* synthetic */ void zza(zzefb zzefbVar, int i, zzeaq zzeaqVar) {
        zzefbVar.zzd((i << 3) | 2, zzeaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzefc
    final /* synthetic */ void zzb(zzefb zzefbVar, int i, long j) {
        zzefbVar.zzd((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzefc
    final /* synthetic */ void zzc(zzefb zzefbVar, int i, int i2) {
        zzefbVar.zzd((i << 3) | 5, Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefc
    public final /* synthetic */ void zza(zzefb zzefbVar, int i, long j) {
        zzefbVar.zzd(i << 3, Long.valueOf(j));
    }
}
