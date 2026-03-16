package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcil {
    private final Clock zzbnt;

    public zzcil(Clock clock) {
        this.zzbnt = clock;
    }

    public final void zza(List<Object> list, String str, String str2, Object... objArr) {
        if (zzabn.zzcxb.get().booleanValue()) {
            long currentTimeMillis = this.zzbnt.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(currentTimeMillis);
                jsonWriter.name(FirebaseAnalytics.Param.SOURCE).value(str);
                jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[i];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                zzawr.zzc("unable to log", e);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            zzawr.zzfb(valueOf.length() != 0 ? "AD-DBG ".concat(valueOf) : new String("AD-DBG "));
        }
    }
}
