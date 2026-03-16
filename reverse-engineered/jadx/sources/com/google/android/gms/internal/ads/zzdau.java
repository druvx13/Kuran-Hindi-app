package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdau implements zzdak<zzdar> {
    private final zzdrh zzfur;
    private final Context zzvf;

    public zzdau(zzdrh zzdrhVar, Context context) {
        this.zzfur = zzdrhVar;
        this.zzvf = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdar> zzaqa() {
        return this.zzfur.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdat
            private final zzdau zzgox;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgox = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgox.zzaqs();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdar zzaqs() throws Exception {
        int i;
        boolean z;
        int i2;
        int i3;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzvf.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int networkType = telephonyManager.getNetworkType();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzq.zzkw();
        int i4 = -1;
        if (zzaxa.zzq(this.zzvf, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzvf.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                i4 = activeNetworkInfo.getType();
                i3 = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                i3 = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i2 = i3;
            i = i4;
        } else {
            i = -2;
            z = false;
            i2 = -1;
        }
        return new zzdar(networkOperator, i, networkType, phoneType, z, i2);
    }
}
