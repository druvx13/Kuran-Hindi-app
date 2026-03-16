package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzctt {
    private zzxg zzacv;
    private boolean zzaef = false;
    private final String zzbsc;
    private final zzctx<zzbns> zzgka;

    public zzctt(zzctx<zzbns> zzctxVar, String str) {
        this.zzgka = zzctxVar;
        this.zzbsc = str;
    }

    public final synchronized boolean isLoading() throws RemoteException {
        return this.zzgka.isLoading();
    }

    public final synchronized void zza(zzuj zzujVar, int i) throws RemoteException {
        this.zzacv = null;
        this.zzaef = this.zzgka.zza(zzujVar, this.zzbsc, new zzcty(i), new zzcts(this));
    }

    public final synchronized String getMediationAdapterClassName() {
        try {
            if (this.zzacv != null) {
                return this.zzacv.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e) {
            zzawr.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final synchronized String zzkh() {
        try {
            if (this.zzacv != null) {
                return this.zzacv.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e) {
            zzawr.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zza(zzctt zzcttVar, boolean z) {
        zzcttVar.zzaef = false;
        return false;
    }
}
