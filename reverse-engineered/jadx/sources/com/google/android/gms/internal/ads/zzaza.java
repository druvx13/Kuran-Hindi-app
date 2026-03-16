package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaza {
    public static boolean zzdb(int i) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcoj)).booleanValue()) {
            return ((Boolean) zzvj.zzpv().zzd(zzzz.zzcok)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de A[Catch: JSONException -> 0x00fa, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00fa, blocks: (B:27:0x00c5, B:41:0x00ed, B:42:0x00f1, B:43:0x00f6, B:32:0x00d4, B:35:0x00de), top: B:49:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6 A[Catch: JSONException -> 0x00fa, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00fa, blocks: (B:27:0x00c5, B:41:0x00ed, B:42:0x00f1, B:43:0x00f6, B:32:0x00d4, B:35:0x00de), top: B:49:0x00c5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject zza(android.content.Context r12, android.view.View r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaza.zza(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject zzs(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.zzq.zzkw();
            jSONObject.put("contained_in_scroll_view", zzaxa.zzr(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject zzb(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.zzq.zzkw();
            jSONObject.put("can_show_on_lock_screen", zzaxa.zzq(view));
            com.google.android.gms.ads.internal.zzq.zzkw();
            jSONObject.put("is_keyguard_locked", zzaxa.zzax(context));
        } catch (JSONException unused) {
            zzawr.zzfc("Unable to get lock screen information");
        }
        return jSONObject;
    }

    public static JSONObject zza(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        String str;
        String str2;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] zzt = zzt(view);
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, WeakReference<View>> next = it.next();
                View view2 = next.getValue().get();
                if (view2 != null) {
                    int[] zzt2 = zzt(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                    try {
                        jSONObject4.put("width", zzb(context, view2.getMeasuredWidth()));
                        jSONObject4.put("height", zzb(context, view2.getMeasuredHeight()));
                        jSONObject4.put("x", zzb(context, zzt2[0] - zzt[0]));
                        jSONObject4.put("y", zzb(context, zzt2[1] - zzt[1]));
                        jSONObject4.put(str4, str3);
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = zza(context, rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", zzb(context, zzt2[0] - zzt[0]));
                            jSONObject.put("y", zzb(context, zzt2[1] - zzt[1]));
                            jSONObject.put(str4, str3);
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            str = str3;
                            str2 = str4;
                            try {
                                jSONObject3.put("font_size", textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            } catch (JSONException unused) {
                                zzawr.zzfc("Unable to get asset views information");
                                it = it2;
                                str3 = str;
                                str4 = str2;
                            }
                        } else {
                            str = str3;
                            str2 = str4;
                        }
                        jSONObject3.put("is_clickable", map2 != null && map2.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject2.put(next.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        str = str3;
                        str2 = str4;
                    }
                    it = it2;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject zza(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e) {
            e = e;
        }
        try {
            jSONObject.put("click_point", zza(context, point, point2));
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            jSONObject2 = jSONObject;
            zzawr.zzc("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    private static int[] zzt(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static Point zza(MotionEvent motionEvent, View view) {
        int[] zzt = zzt(view);
        return new Point(((int) motionEvent.getRawX()) - zzt[0], ((int) motionEvent.getRawY()) - zzt[1]);
    }

    private static JSONObject zza(Context context, Point point, Point point2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", zzb(context, point2.x));
            jSONObject.put("y", zzb(context, point2.y));
            jSONObject.put("start_x", zzb(context, point.x));
            jSONObject.put("start_y", zzb(context, point.y));
            return jSONObject;
        } catch (JSONException e) {
            zzawr.zzc("Error occurred while putting signals into JSON object.", e);
            return null;
        }
    }

    private static int zzb(Context context, int i) {
        return zzvj.zzpr().zzb(context, i);
    }

    private static JSONObject zza(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", zzb(context, rect.right - rect.left));
        jSONObject.put("height", zzb(context, rect.bottom - rect.top));
        jSONObject.put("x", zzb(context, rect.left));
        jSONObject.put("y", zzb(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }
}
