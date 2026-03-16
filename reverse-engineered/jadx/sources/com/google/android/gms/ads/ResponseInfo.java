package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzxg;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class ResponseInfo {
    private final zzxg zzacv;

    private ResponseInfo(zzxg zzxgVar) {
        this.zzacv = zzxgVar;
    }

    public final String getMediationAdapterClassName() {
        try {
            return this.zzacv.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzazw.zzc("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    public final String getResponseId() {
        try {
            return this.zzacv.getResponseId();
        } catch (RemoteException e) {
            zzazw.zzc("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    public static ResponseInfo zza(zzxg zzxgVar) {
        if (zzxgVar != null) {
            return new ResponseInfo(zzxgVar);
        }
        return null;
    }
}
