package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaqd {
    @Nonnull
    private final View zzaae;
    private final Map<String, WeakReference<View>> zzdli;
    private final zzavn zzdlj;

    public zzaqd(zzaqi zzaqiVar) {
        View view;
        Map<String, WeakReference<View>> map;
        View view2;
        Map<String, WeakReference<View>> map2;
        view = zzaqiVar.zzaae;
        this.zzaae = view;
        map = zzaqiVar.zzdli;
        this.zzdli = map;
        view2 = zzaqiVar.zzaae;
        zzavn zzr = zzaqc.zzr(view2.getContext());
        this.zzdlj = zzr;
        if (zzr == null || (map2 = this.zzdli) == null || map2.isEmpty()) {
            return;
        }
        try {
            this.zzdlj.zza(new zzaqh(ObjectWrapper.wrap(this.zzaae).asBinder(), ObjectWrapper.wrap(this.zzdli).asBinder()));
        } catch (RemoteException unused) {
            zzazw.zzfa("Failed to call remote method.");
        }
    }

    public final void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzdlj == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzdlj.zza(list, ObjectWrapper.wrap(this.zzaae), new zzaqg(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Internal error: ");
            sb.append(valueOf);
            updateImpressionUrlsCallback.onFailure(sb.toString());
        }
    }

    public final void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzdlj == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzdlj.zzb(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zzaae), new zzaqf(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Internal error: ");
            sb.append(valueOf);
            updateClickUrlCallback.onFailure(sb.toString());
        }
    }

    public final void reportTouchEvent(MotionEvent motionEvent) {
        zzavn zzavnVar = this.zzdlj;
        if (zzavnVar == null) {
            zzazw.zzfa("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzavnVar.zzan(ObjectWrapper.wrap(motionEvent));
        } catch (RemoteException unused) {
            zzazw.zzfa("Failed to call remote method.");
        }
    }
}
