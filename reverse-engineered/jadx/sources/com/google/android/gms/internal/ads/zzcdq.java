package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcdq implements zzaga<Object> {
    private final zzegt<zzcdn> zzfrh;
    private final zzcdt zzftu;
    private final zzady zzfwd;

    public zzcdq(zzcae zzcaeVar, zzbzx zzbzxVar, zzcdt zzcdtVar, zzegt<zzcdn> zzegtVar) {
        this.zzfwd = zzcaeVar.zzgc(zzbzxVar.getCustomTemplateId());
        this.zzftu = zzcdtVar;
        this.zzfrh = zzegtVar;
    }

    public final void zzamo() {
        if (this.zzfwd == null) {
            return;
        }
        this.zzftu.zza("/nativeAdCustomClick", this);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.zzfwd.zza(this.zzfrh.get(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            zzawr.zzd(sb.toString(), e);
        }
    }
}
