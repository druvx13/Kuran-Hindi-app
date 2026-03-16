package com.google.android.gms.ads.mediation;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public interface MediationAdapter extends MediationExtrasReceiver {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    public static class zza {
        private int zzema;

        public final zza zzdo(int i) {
            this.zzema = 1;
            return this;
        }

        public final Bundle zzact() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.zzema);
            return bundle;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
