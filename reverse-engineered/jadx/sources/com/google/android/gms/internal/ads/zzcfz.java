package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcfz {
    private final zzcfu zzfxs;
    private final AtomicReference<zzalp> zzfxt = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfz(zzcfu zzcfuVar) {
        this.zzfxs = zzcfuVar;
    }

    public final void zzb(zzalp zzalpVar) {
        this.zzfxt.compareAndSet(null, zzalpVar);
    }

    public final zzdhq zzd(String str, JSONObject jSONObject) throws zzdhk {
        zzalq zze;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zze = new zzaml(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                zze = new zzaml(new AdUrlAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zze = new zzaml(new zzaol());
            } else {
                zze = zze(str, jSONObject);
            }
            zzdhq zzdhqVar = new zzdhq(zze);
            this.zzfxs.zza(str, zzdhqVar);
            return zzdhqVar;
        } catch (Throwable th) {
            throw new zzdhk(th);
        }
    }

    public final zzanv zzdk(String str) throws RemoteException {
        zzanv zzdk = zzanc().zzdk(str);
        this.zzfxs.zza(str, zzdk);
        return zzdk;
    }

    public final boolean zzanb() {
        return this.zzfxt.get() != null;
    }

    private final zzalq zze(String str, JSONObject jSONObject) throws RemoteException {
        zzalp zzanc = zzanc();
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                if (zzanc.zzdh(jSONObject.getString("class_name"))) {
                    return zzanc.zzdg("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                }
                return zzanc.zzdg("com.google.ads.mediation.customevent.CustomEventAdapter");
            } catch (JSONException e) {
                zzawr.zzc("Invalid custom event.", e);
            }
        }
        return zzanc.zzdg(str);
    }

    private final zzalp zzanc() throws RemoteException {
        zzalp zzalpVar = this.zzfxt.get();
        if (zzalpVar != null) {
            return zzalpVar;
        }
        zzawr.zzfc("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
