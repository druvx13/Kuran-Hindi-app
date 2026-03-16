package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbyx implements zzcaf {
    private final zzazz zzbmo;
    private final Clock zzbnt;
    private final zzdt zzejl;
    private final zzdld zzfgl;
    private final zzcae zzfjb;
    private final zzdgo zzfkd;
    private final zzdhe zzfll;
    private final JSONObject zzfpz;
    private final zzcdt zzfqa;
    private final zzbzx zzfqb;
    private final zzbro zzfqc;
    private final zzbqw zzfqd;
    private final zzbkp zzfqe;
    private final zzcaw zzfqf;
    private final zzbvs zzfqg;
    private boolean zzfqi;
    private zzws zzfqp;
    private final Context zzvf;
    private boolean zzfqh = false;
    private boolean zzfqj = false;
    private boolean zzfqk = false;
    private Point zzfql = new Point();
    private Point zzfqm = new Point();
    private long zzfqn = 0;
    private long zzfqo = 0;

    public zzbyx(Context context, zzcae zzcaeVar, JSONObject jSONObject, zzcdt zzcdtVar, zzbzx zzbzxVar, zzdt zzdtVar, zzbro zzbroVar, zzbqw zzbqwVar, zzdgo zzdgoVar, zzazz zzazzVar, zzdhe zzdheVar, zzbkp zzbkpVar, zzcaw zzcawVar, Clock clock, zzbvs zzbvsVar, zzdld zzdldVar) {
        this.zzvf = context;
        this.zzfjb = zzcaeVar;
        this.zzfpz = jSONObject;
        this.zzfqa = zzcdtVar;
        this.zzfqb = zzbzxVar;
        this.zzejl = zzdtVar;
        this.zzfqc = zzbroVar;
        this.zzfqd = zzbqwVar;
        this.zzfkd = zzdgoVar;
        this.zzbmo = zzazzVar;
        this.zzfll = zzdheVar;
        this.zzfqe = zzbkpVar;
        this.zzfqf = zzcawVar;
        this.zzbnt = clock;
        this.zzfqg = zzbvsVar;
        this.zzfgl = zzdldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzfql = new Point();
        this.zzfqm = new Point();
        if (!this.zzfqi) {
            this.zzfqg.zzu(view);
            this.zzfqi = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzfqe.zzo(this);
        boolean zzdb = zzaza.zzdb(this.zzbmo.zzdzo);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null) {
                    if (zzdb) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> entry2 : map2.entrySet()) {
                View view3 = entry2.getValue().get();
                if (view3 != null) {
                    if (zzdb) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zza(View view, Map<String, WeakReference<View>> map) {
        this.zzfql = new Point();
        this.zzfqm = new Point();
        this.zzfqg.zzv(view);
        this.zzfqi = false;
    }

    private final boolean zzfw(String str) {
        JSONObject optJSONObject = this.zzfpz.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zza(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        JSONObject zza = zzaza.zza(this.zzvf, map, map2, view2);
        JSONObject zza2 = zzaza.zza(this.zzvf, view2);
        JSONObject zzs = zzaza.zzs(view2);
        JSONObject zzb = zzaza.zzb(this.zzvf, view2);
        String zzb2 = zzb(view, map);
        zza(view, zza2, zza, zzs, zzb, zzb2, zzaza.zza(zzb2, this.zzvf, this.zzfqm, this.zzfql), null, z, false);
    }

    private final String zzb(View view, Map<String, WeakReference<View>> map) {
        if (map != null && view != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                if (view.equals(entry.getValue().get())) {
                    return entry.getKey();
                }
            }
        }
        int zzakw = this.zzfqb.zzakw();
        if (zzakw != 1) {
            if (zzakw != 2) {
                if (zzakw != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzfx(String str) {
        zza(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzg(Bundle bundle) {
        if (bundle == null) {
            zzawr.zzed("Click data is null. No click is reported.");
        } else if (!zzfw("click_reporting")) {
            zzawr.zzfa("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zza(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.zzq.zzkw().zza(bundle, (JSONObject) null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzfqk) {
            zzawr.zzed("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!zzakk()) {
            zzawr.zzed("Custom click reporting failed. Ad unit id not whitelisted.");
        } else {
            JSONObject zza = zzaza.zza(this.zzvf, map, map2, view);
            JSONObject zza2 = zzaza.zza(this.zzvf, view);
            JSONObject zzs = zzaza.zzs(view);
            JSONObject zzb = zzaza.zzb(this.zzvf, view);
            String zzb2 = zzb(null, map);
            zza(view, zza2, zza, zzs, zzb, zzb2, zzaza.zza(zzb2, this.zzvf, this.zzfqm, this.zzfql), null, z, true);
        }
    }

    private final boolean zzakk() {
        return this.zzfpz.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzsk() {
        this.zzfqk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final boolean isCustomClickGestureEnabled() {
        return zzakk();
    }

    private final void zza(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        Preconditions.checkMainThread("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzfpz);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.zzfjb.zzgc(this.zzfqb.getCustomTemplateId()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zzfqb.zzakw());
            jSONObject8.put("view_aware_api_used", z);
            jSONObject8.put("custom_mute_requested", this.zzfll.zzdhc != null && this.zzfll.zzdhc.zzblc);
            jSONObject8.put("custom_mute_enabled", (this.zzfqb.getMuteThisAdReasons().isEmpty() || this.zzfqb.zzakz() == null) ? false : true);
            if (this.zzfqf.zzamf() != null && this.zzfpz.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzbnt.currentTimeMillis());
            if (this.zzfqk && zzakk()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.zzfjb.zzgc(this.zzfqb.getCustomTemplateId()) != null);
            jSONObject8.put("click_signals", zzw(view));
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.zzbnt.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzfqn);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzfqo);
            jSONObject7.put("touch_signal", jSONObject9);
            zzbaf.zza(this.zzfqa.zzc("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e) {
            zzawr.zzc("Unable to create click JSON.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zza(View view, MotionEvent motionEvent, View view2) {
        this.zzfql = zzaza.zza(motionEvent, view2);
        long currentTimeMillis = this.zzbnt.currentTimeMillis();
        this.zzfqo = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzfqn = currentTimeMillis;
            this.zzfqm = this.zzfql;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(this.zzfql.x, this.zzfql.y);
        this.zzejl.zza(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzh(Bundle bundle) {
        if (bundle == null) {
            zzawr.zzed("Touch event data is null. No touch event is reported.");
        } else if (!zzfw("touch_reporting")) {
            zzawr.zzfa("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            int i = bundle.getInt("duration_ms");
            this.zzejl.zzcb().zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzakl() {
        zza(null, null, null, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void setClickConfirmingView(View view) {
        if (!this.zzfpz.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzawr.zzfc("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzcaw zzcawVar = this.zzfqf;
        if (view != null) {
            view.setOnClickListener(zzcawVar);
            view.setClickable(true);
            zzcawVar.zzftz = new WeakReference<>(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zza(zzaer zzaerVar) {
        if (!this.zzfpz.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzawr.zzfc("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
        } else {
            this.zzfqf.zza(zzaerVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void cancelUnconfirmedClick() {
        if (this.zzfpz.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzfqf.cancelUnconfirmedClick();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zza(zzww zzwwVar) {
        try {
            if (this.zzfqj) {
                return;
            }
            if (zzwwVar == null && this.zzfqb.zzakz() != null) {
                this.zzfqj = true;
                this.zzfgl.zzeq(this.zzfqb.zzakz().zzqe());
                zzakm();
                return;
            }
            this.zzfqj = true;
            this.zzfgl.zzeq(zzwwVar.zzqe());
            zzakm();
        } catch (RemoteException e) {
            zzawr.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zza(zzws zzwsVar) {
        this.zzfqp = zzwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzakm() {
        try {
            if (this.zzfqp != null) {
                this.zzfqp.onAdMuted();
            }
        } catch (RemoteException e) {
            zzawr.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        zza(zzaza.zza(this.zzvf, view), zzaza.zza(this.zzvf, map, map2, view), zzaza.zzs(view), zzaza.zzb(this.zzvf, view), zzx(view), null);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzakn() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzfpz);
            zzbaf.zza(this.zzfqa.zzc("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            zzazw.zzc("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final boolean zzi(Bundle bundle) {
        if (!zzfw("impression_reporting")) {
            zzawr.zzfa("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return zza(null, null, null, null, null, com.google.android.gms.ads.internal.zzq.zzkw().zza(bundle, (JSONObject) null));
    }

    private final boolean zza(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5) {
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzfpz);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcol)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            this.zzfqa.zza("/logScionEvent", new zzbyz(this));
            this.zzfqa.zza("/nativeImpression", new zzbyy(this));
            zzbaf.zza(this.zzfqa.zzc("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzfqh || this.zzfkd.zzgtw == null) {
                return true;
            }
            this.zzfqh |= com.google.android.gms.ads.internal.zzq.zzlg().zzb(this.zzvf, this.zzbmo.zzbnd, this.zzfkd.zzgtw.toString(), this.zzfll.zzgux);
            return true;
        } catch (JSONException e) {
            zzawr.zzc("Unable to create impression JSON.", e);
            return false;
        }
    }

    private final String zzw(View view) {
        try {
            JSONObject optJSONObject = this.zzfpz.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return this.zzejl.zzcb().zza(this.zzvf, optJSONObject.optString("click_string"), view);
        } catch (Exception e) {
            zzawr.zzc("Exception obtaining click signals", e);
            return null;
        }
    }

    private final String zzx(View view) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcol)).booleanValue()) {
            try {
                return this.zzejl.zzcb().zza(this.zzvf, view, (Activity) null);
            } catch (Exception unused) {
                zzawr.zzfa("Exception getting data.");
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void destroy() {
        this.zzfqa.destroy();
    }
}
