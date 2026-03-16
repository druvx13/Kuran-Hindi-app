package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbkn implements zzaki<zzbkr> {
    private final zzpu zzfhc;
    private final Context zzvf;
    private final PowerManager zzzp;

    public zzbkn(Context context, zzpu zzpuVar) {
        this.zzvf = context;
        this.zzfhc = zzpuVar;
        this.zzzp = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    /* renamed from: zza */
    public final JSONObject zzj(zzbkr zzbkrVar) throws JSONException {
        boolean isScreenOn;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        if (zzbkrVar.zzfhu == null) {
            jSONObject = new JSONObject();
        } else {
            zzqa zzqaVar = zzbkrVar.zzfhu;
            if (this.zzfhc.zzks() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzqaVar.zzbpc;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.zzfhc.zzkr()).put("activeViewJSON", this.zzfhc.zzks()).put("timestamp", zzbkrVar.timestamp).put("adFormat", this.zzfhc.zzkq()).put("hashCode", this.zzfhc.zzkt()).put("isMraid", false).put("isStopped", false).put("isPaused", zzbkrVar.zzfhr).put("isNative", this.zzfhc.isNative());
            if (Build.VERSION.SDK_INT >= 20) {
                isScreenOn = this.zzzp.isInteractive();
            } else {
                isScreenOn = this.zzzp.isScreenOn();
            }
            put.put("isScreenOn", isScreenOn).put("appMuted", com.google.android.gms.ads.internal.zzq.zzlb().zzqc()).put("appVolume", com.google.android.gms.ads.internal.zzq.zzlb().zzqb()).put("deviceVolume", zzaxs.zzbg(this.zzvf.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zzvf.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzqaVar.zzzw).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzqaVar.zzbpd.top).put("bottom", zzqaVar.zzbpd.bottom).put("left", zzqaVar.zzbpd.left).put("right", zzqaVar.zzbpd.right)).put("adBox", new JSONObject().put("top", zzqaVar.zzbpe.top).put("bottom", zzqaVar.zzbpe.bottom).put("left", zzqaVar.zzbpe.left).put("right", zzqaVar.zzbpe.right)).put("globalVisibleBox", new JSONObject().put("top", zzqaVar.zzbpf.top).put("bottom", zzqaVar.zzbpf.bottom).put("left", zzqaVar.zzbpf.left).put("right", zzqaVar.zzbpf.right)).put("globalVisibleBoxVisible", zzqaVar.zzbpg).put("localVisibleBox", new JSONObject().put("top", zzqaVar.zzbph.top).put("bottom", zzqaVar.zzbph.bottom).put("left", zzqaVar.zzbph.left).put("right", zzqaVar.zzbph.right)).put("localVisibleBoxVisible", zzqaVar.zzbpi).put("hitBox", new JSONObject().put("top", zzqaVar.zzbpj.top).put("bottom", zzqaVar.zzbpj.bottom).put("left", zzqaVar.zzbpj.left).put("right", zzqaVar.zzbpj.right)).put("screenDensity", this.zzvf.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzbkrVar.zzbot);
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcmx)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                if (zzqaVar.zzbpl != null) {
                    for (Rect rect2 : zzqaVar.zzbpl) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzbkrVar.zzfht)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
