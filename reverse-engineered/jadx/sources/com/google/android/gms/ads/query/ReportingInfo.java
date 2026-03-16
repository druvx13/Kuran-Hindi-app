package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzaqd;
import com.google.android.gms.internal.ads.zzaqi;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class ReportingInfo {
    private final zzaqd zzhav;

    private ReportingInfo(Builder builder) {
        this.zzhav = new zzaqd(builder.zzhaw);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private final zzaqi zzhaw;

        public Builder(View view) {
            zzaqi zzaqiVar = new zzaqi();
            this.zzhaw = zzaqiVar;
            zzaqiVar.zzk(view);
        }

        public final Builder setAssetViews(Map<String, View> map) {
            this.zzhaw.zzh(map);
            return this;
        }

        public final ReportingInfo build() {
            return new ReportingInfo(this);
        }
    }

    public final void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zzhav.updateImpressionUrls(list, updateImpressionUrlsCallback);
    }

    public final void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zzhav.updateClickUrl(uri, updateClickUrlCallback);
    }

    public final void reportTouchEvent(MotionEvent motionEvent) {
        this.zzhav.reportTouchEvent(motionEvent);
    }
}
