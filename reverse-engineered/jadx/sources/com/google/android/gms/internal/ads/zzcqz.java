package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzcqz extends zzcsb {
    private zzbwd zzggz;

    public zzcqz(zzbqw zzbqwVar, zzbro zzbroVar, zzbrx zzbrxVar, zzbsh zzbshVar, zzbre zzbreVar, zzbtw zzbtwVar, zzbwi zzbwiVar, zzbsu zzbsuVar, zzbwd zzbwdVar, zzbtp zzbtpVar) {
        super(zzbqwVar, zzbroVar, zzbrxVar, zzbshVar, zzbtwVar, zzbsuVar, zzbwiVar, zzbtpVar, zzbreVar);
        this.zzggz = zzbwdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsb, com.google.android.gms.internal.ads.zzalv
    public final void zztp() {
        this.zzggz.zzsm();
    }

    @Override // com.google.android.gms.internal.ads.zzcsb, com.google.android.gms.internal.ads.zzalv
    public final void zztq() throws RemoteException {
        this.zzggz.zzsn();
    }

    @Override // com.google.android.gms.internal.ads.zzcsb, com.google.android.gms.internal.ads.zzalv
    public final void zza(zzate zzateVar) throws RemoteException {
        super.zza(zzateVar);
        this.zzggz.zza(new zzatc(zzateVar.getType(), zzateVar.getAmount()));
    }

    @Override // com.google.android.gms.internal.ads.zzcsb, com.google.android.gms.internal.ads.zzalv
    public final void zzb(zzatc zzatcVar) {
        super.zzb(zzatcVar);
        this.zzggz.zza(zzatcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcsb, com.google.android.gms.internal.ads.zzalv
    public final void onVideoEnd() {
        this.zzggz.zzsn();
    }
}
