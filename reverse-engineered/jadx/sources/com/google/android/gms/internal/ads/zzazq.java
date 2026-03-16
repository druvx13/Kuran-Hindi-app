package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzazq {
    private final List<String> zzdzj;
    private static Object lock = new Object();
    private static boolean zzdzh = false;
    private static boolean enabled = false;
    private static Clock zzbnt = DefaultClock.getInstance();
    private static final Set<String> zzdzi = new HashSet(Arrays.asList(new String[0]));

    public zzazq() {
        this(null);
    }

    public zzazq(String str) {
        List<String> asList;
        if (!isEnabled()) {
            asList = new ArrayList<>();
        } else {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            asList = Arrays.asList(strArr);
        }
        this.zzdzj = asList;
    }

    public final void zza(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (isEnabled()) {
            zzb(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zza(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (isEnabled()) {
            zzb(str, str2, map, bArr);
        }
    }

    private final void zzb(final String str, final String str2, final Map<String, ?> map, final byte[] bArr) {
        zza("onNetworkRequest", new zzazt(str, str2, map, bArr) { // from class: com.google.android.gms.internal.ads.zzazp
            private final String zzdbv;
            private final Map zzdca;
            private final String zzdcd;
            private final byte[] zzdzg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdcd = str;
                this.zzdbv = str2;
                this.zzdca = map;
                this.zzdzg = bArr;
            }

            @Override // com.google.android.gms.internal.ads.zzazt
            public final void zzb(JsonWriter jsonWriter) {
                zzazq.zza(this.zzdcd, this.zzdbv, this.zzdca, this.zzdzg, jsonWriter);
            }
        });
    }

    public final void zza(HttpURLConnection httpURLConnection, int i) {
        if (isEnabled()) {
            String str = null;
            zzb(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    zzazw.zzfc(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                zzey(str);
            }
        }
    }

    public final void zza(Map<String, ?> map, int i) {
        if (isEnabled()) {
            zzb(map, i);
            if (i < 200 || i >= 300) {
                zzey(null);
            }
        }
    }

    private final void zzb(final Map<String, ?> map, final int i) {
        zza("onNetworkResponse", new zzazt(i, map) { // from class: com.google.android.gms.internal.ads.zzazs
            private final int zzdzl;
            private final Map zzdzm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdzl = i;
                this.zzdzm = map;
            }

            @Override // com.google.android.gms.internal.ads.zzazt
            public final void zzb(JsonWriter jsonWriter) {
                zzazq.zza(this.zzdzl, this.zzdzm, jsonWriter);
            }
        });
    }

    public final void zzex(String str) {
        if (isEnabled() && str != null) {
            zzi(str.getBytes());
        }
    }

    public final void zzi(final byte[] bArr) {
        zza("onNetworkResponseBody", new zzazt(bArr) { // from class: com.google.android.gms.internal.ads.zzazr
            private final byte[] zzdzk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdzk = bArr;
            }

            @Override // com.google.android.gms.internal.ads.zzazt
            public final void zzb(JsonWriter jsonWriter) {
                zzazq.zza(this.zzdzk, jsonWriter);
            }
        });
    }

    private final void zzey(final String str) {
        zza("onNetworkRequestError", new zzazt(str) { // from class: com.google.android.gms.internal.ads.zzazu
            private final String zzdcd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdcd = str;
            }

            @Override // com.google.android.gms.internal.ads.zzazt
            public final void zzb(JsonWriter jsonWriter) {
                zzazq.zza(this.zzdcd, jsonWriter);
            }
        });
    }

    private static void zza(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (!zzdzi.contains(key)) {
                if (next.getValue() instanceof List) {
                    for (String str : (List) next.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(key);
                        jsonWriter.name("value").value(str);
                        jsonWriter.endObject();
                    }
                } else if (next.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(key);
                    jsonWriter.name("value").value((String) next.getValue());
                    jsonWriter.endObject();
                } else {
                    zzazw.zzfa("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    private final void zza(String str, zzazt zzaztVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(zzbnt.currentTimeMillis());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.zzdzj) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            zzaztVar.zzb(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzazw.zzc("unable to log", e);
        }
        zzez(stringWriter.toString());
    }

    private static synchronized void zzez(String str) {
        synchronized (zzazq.class) {
            zzazw.zzfb("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                zzazw.zzfb(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            zzazw.zzfb("GMA Debug FINISH");
        }
    }

    public static void zzyg() {
        synchronized (lock) {
            zzdzh = false;
            enabled = false;
            zzazw.zzfc("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzar(boolean z) {
        synchronized (lock) {
            zzdzh = true;
            enabled = z;
        }
    }

    public static boolean zzyh() {
        boolean z;
        synchronized (lock) {
            z = zzdzh;
        }
        return z;
    }

    public static boolean isEnabled() {
        boolean z;
        synchronized (lock) {
            z = zzdzh && enabled;
        }
        return z;
    }

    public static boolean zzbq(Context context) {
        if (Build.VERSION.SDK_INT >= 17 && zzabi.zzcwh.get().booleanValue()) {
            try {
                return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
            } catch (Exception e) {
                zzazw.zzd("Fail to determine debug setting.", e);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(String str, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String encode = Base64Utils.encode(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(encode);
        } else {
            String zzev = zzazm.zzev(encode);
            if (zzev != null) {
                jsonWriter.name("bodydigest").value(zzev);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        zza(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zza(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }
}
