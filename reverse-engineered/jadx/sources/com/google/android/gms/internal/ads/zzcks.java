package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcks extends zzarg {
    private final /* synthetic */ zzckt zzgbq;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcks(zzckt zzcktVar) {
        this.zzgbq = zzcktVar;
    }

    @Override // com.google.android.gms.internal.ads.zzard
    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzgbq.zzdej.set(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.zzard
    public final void zza(zzaye zzayeVar) {
        this.zzgbq.zzdej.setException(new zzayd(zzayeVar.zzdxf, zzayeVar.errorCode));
    }
}
