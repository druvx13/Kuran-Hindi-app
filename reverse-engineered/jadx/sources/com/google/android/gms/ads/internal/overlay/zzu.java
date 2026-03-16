package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzapf;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzu extends zzapf {
    private Activity zzaad;
    private AdOverlayInfoParcel zzdld;
    private boolean zzdjw = false;
    private boolean zzdle = false;

    public zzu(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdld = adOverlayInfoParcel;
        this.zzaad = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onBackPressed() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onRestart() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onStart() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zzad(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zzdp() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final boolean zzuh() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onCreate(Bundle bundle) {
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdld;
        if (adOverlayInfoParcel == null) {
            this.zzaad.finish();
        } else if (z) {
            this.zzaad.finish();
        } else {
            if (bundle == null) {
                if (adOverlayInfoParcel.zzceb != null) {
                    this.zzdld.zzceb.onAdClicked();
                }
                if (this.zzaad.getIntent() != null && this.zzaad.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && this.zzdld.zzdkt != null) {
                    this.zzdld.zzdkt.zzua();
                }
            }
            com.google.android.gms.ads.internal.zzq.zzku();
            if (zzb.zza(this.zzaad, this.zzdld.zzdks, this.zzdld.zzdkx)) {
                return;
            }
            this.zzaad.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onResume() throws RemoteException {
        if (this.zzdjw) {
            this.zzaad.finish();
            return;
        }
        this.zzdjw = true;
        if (this.zzdld.zzdkt != null) {
            this.zzdld.zzdkt.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdjw);
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onPause() throws RemoteException {
        if (this.zzdld.zzdkt != null) {
            this.zzdld.zzdkt.onPause();
        }
        if (this.zzaad.isFinishing()) {
            zzur();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onStop() throws RemoteException {
        if (this.zzaad.isFinishing()) {
            zzur();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onDestroy() throws RemoteException {
        if (this.zzaad.isFinishing()) {
            zzur();
        }
    }

    private final synchronized void zzur() {
        if (!this.zzdle) {
            if (this.zzdld.zzdkt != null) {
                this.zzdld.zzdkt.zztz();
            }
            this.zzdle = true;
        }
    }
}
