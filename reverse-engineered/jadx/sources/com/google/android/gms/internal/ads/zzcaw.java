package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcaw implements View.OnClickListener {
    private final Clock zzbnt;
    private final zzcdt zzftu;
    private zzaer zzftv;
    private zzaga<Object> zzftw;
    String zzftx;
    Long zzfty;
    WeakReference<View> zzftz;

    public zzcaw(zzcdt zzcdtVar, Clock clock) {
        this.zzftu = zzcdtVar;
        this.zzbnt = clock;
    }

    public final void zza(final zzaer zzaerVar) {
        this.zzftv = zzaerVar;
        zzaga<Object> zzagaVar = this.zzftw;
        if (zzagaVar != null) {
            this.zzftu.zzb("/unconfirmedClick", zzagaVar);
        }
        zzaga<Object> zzagaVar2 = new zzaga(this, zzaerVar) { // from class: com.google.android.gms.internal.ads.zzcaz
            private final zzcaw zzfua;
            private final zzaer zzfub;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfua = this;
                this.zzfub = zzaerVar;
            }

            @Override // com.google.android.gms.internal.ads.zzaga
            public final void zza(Object obj, Map map) {
                zzcaw zzcawVar = this.zzfua;
                zzaer zzaerVar2 = this.zzfub;
                try {
                    zzcawVar.zzfty = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    zzawr.zzfa("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzcawVar.zzftx = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzaerVar2 == null) {
                    zzawr.zzed("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzaerVar2.onUnconfirmedClickReceived(str);
                } catch (RemoteException e) {
                    zzazw.zze("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzftw = zzagaVar2;
        this.zzftu.zza("/unconfirmedClick", zzagaVar2);
    }

    public final zzaer zzamf() {
        return this.zzftv;
    }

    public final void cancelUnconfirmedClick() {
        if (this.zzftv == null || this.zzfty == null) {
            return;
        }
        zzamg();
        try {
            this.zzftv.onUnconfirmedClickCancelled();
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference<View> weakReference = this.zzftz;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zzftx != null && this.zzfty != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.zzftx);
            hashMap.put("time_interval", String.valueOf(this.zzbnt.currentTimeMillis() - this.zzfty.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzftu.zza("sendMessageToNativeJs", hashMap);
        }
        zzamg();
    }

    private final void zzamg() {
        View view;
        this.zzftx = null;
        this.zzfty = null;
        WeakReference<View> weakReference = this.zzftz;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzftz = null;
    }
}
