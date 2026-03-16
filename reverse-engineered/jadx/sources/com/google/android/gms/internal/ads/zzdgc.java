package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdgc extends zzati {
    private final String zzbsc;
    private final zzdgz zzfmx;
    private final Context zzgiz;
    private final zzdfw zzgsz;
    private final zzdez zzgta;
    private zzcel zzgtb;

    public zzdgc(String str, zzdfw zzdfwVar, Context context, zzdez zzdezVar, zzdgz zzdgzVar) {
        this.zzbsc = str;
        this.zzgsz = zzdfwVar;
        this.zzgta = zzdezVar;
        this.zzfmx = zzdgzVar;
        this.zzgiz = context;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final synchronized void zza(zzuj zzujVar, zzatn zzatnVar) throws RemoteException {
        zza(zzujVar, zzatnVar, zzdgw.zzguk);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final synchronized void zzb(zzuj zzujVar, zzatn zzatnVar) throws RemoteException {
        zza(zzujVar, zzatnVar, zzdgw.zzgul);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zza(iObjectWrapper, false);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final synchronized void zza(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzgtb == null) {
            zzawr.zzfc("Rewarded can not be shown before loaded");
            this.zzgta.zzcx(2);
            return;
        }
        this.zzgtb.zzb(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgtb == null || this.zzgtb.zzaia() == null) {
            return null;
        }
        return this.zzgtb.zzaia().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final boolean isLoaded() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcel zzcelVar = this.zzgtb;
        return (zzcelVar == null || zzcelVar.zzamq()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzatk zzatkVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzgta.zzb(zzatkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzats zzatsVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzgta.zzb(zzatsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzxa zzxaVar) {
        if (zzxaVar == null) {
            this.zzgta.zza((AdMetadataListener) null);
        } else {
            this.zzgta.zza(new zzdgb(this, zzxaVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcel zzcelVar = this.zzgtb;
        return zzcelVar != null ? zzcelVar.getAdMetadata() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final zzate zzqt() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzcel zzcelVar = this.zzgtb;
        if (zzcelVar != null) {
            return zzcelVar.zzqt();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final synchronized void zza(zzaua zzauaVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdgz zzdgzVar = this.zzfmx;
        zzdgzVar.zzdrf = zzauaVar.zzdrf;
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcln)).booleanValue()) {
            zzdgzVar.zzdrg = zzauaVar.zzdrg;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final zzxg zzki() {
        zzcel zzcelVar;
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcua)).booleanValue() && (zzcelVar = this.zzgtb) != null) {
            return zzcelVar.zzaia();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzxf zzxfVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        this.zzgta.zzc(zzxfVar);
    }

    private final synchronized void zza(zzuj zzujVar, zzatn zzatnVar, int i) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzgta.zzb(zzatnVar);
        com.google.android.gms.ads.internal.zzq.zzkw();
        if (zzaxa.zzbd(this.zzgiz) && zzujVar.zzceu == null) {
            zzawr.zzfa("Failed to load the ad because app ID is missing.");
            this.zzgta.onAdFailedToLoad(8);
        } else if (this.zzgtb != null) {
        } else {
            zzdft zzdftVar = new zzdft(null);
            this.zzgsz.zzdt(i);
            this.zzgsz.zza(zzujVar, this.zzbsc, zzdftVar, new zzdge(this));
        }
    }
}
