package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzctf extends zzanz {
    private final String zzdbg;
    private final zzanv zzgiv;
    private zzbaj<JSONObject> zzgiw;
    private final JSONObject zzgix;
    private boolean zzgiy;

    public zzctf(String str, zzanv zzanvVar, zzbaj<JSONObject> zzbajVar) {
        JSONObject jSONObject = new JSONObject();
        this.zzgix = jSONObject;
        this.zzgiy = false;
        this.zzgiw = zzbajVar;
        this.zzdbg = str;
        this.zzgiv = zzanvVar;
        try {
            jSONObject.put("adapter_version", zzanvVar.zztn().toString());
            this.zzgix.put("sdk_version", this.zzgiv.zzto().toString());
            this.zzgix.put(AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzdbg);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanw
    public final synchronized void zzdq(String str) throws RemoteException {
        if (this.zzgiy) {
            return;
        }
        if (str == null) {
            onFailure("Adapter returned null signals");
            return;
        }
        try {
            this.zzgix.put("signals", str);
        } catch (JSONException unused) {
        }
        this.zzgiw.set(this.zzgix);
        this.zzgiy = true;
    }

    @Override // com.google.android.gms.internal.ads.zzanw
    public final synchronized void onFailure(String str) throws RemoteException {
        if (this.zzgiy) {
            return;
        }
        try {
            this.zzgix.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.zzgiw.set(this.zzgix);
        this.zzgiy = true;
    }
}
