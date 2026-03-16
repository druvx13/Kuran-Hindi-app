package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaxa {
    public static final zzdns zzdwf = new zzawu(Looper.getMainLooper());
    private String zzbft;
    private AtomicReference<Pattern> zzdwd = new AtomicReference<>(null);
    private AtomicReference<Pattern> zzdwe = new AtomicReference<>(null);
    private boolean zzyg = true;
    private final Object zzdwg = new Object();
    private boolean zzdwh = false;
    private boolean zzdwi = false;

    public final void zza(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", zzr(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public static boolean zzq(Context context, String str) {
        Context zzaa = zzase.zzaa(context);
        return Wrappers.packageManager(zzaa).checkPermission(str, zzaa.getPackageName()) == 0;
    }

    public static void zzb(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            new zzayz(context, str, (String) obj).zzwn();
        }
    }

    public static String zza(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                return sb.toString();
            }
        }
    }

    public final boolean zzao(Context context) {
        if (this.zzdwh) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new zzaxg(this, null), intentFilter);
        this.zzdwh = true;
        return true;
    }

    public final boolean zzap(Context context) {
        if (this.zzdwi) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new zzaxd(this, null), intentFilter);
        this.zzdwi = true;
        return true;
    }

    public final void zza(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(zzr(context, str));
    }

    private static String zzxf() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public final String zzr(Context context, String str) {
        synchronized (this.zzdwg) {
            if (this.zzbft != null) {
                return this.zzbft;
            } else if (str == null) {
                return zzxf();
            } else {
                try {
                    this.zzbft = com.google.android.gms.ads.internal.zzq.zzky().getDefaultUserAgent(context);
                } catch (Exception unused) {
                }
                if (TextUtils.isEmpty(this.zzbft)) {
                    zzvj.zzpr();
                    if (!zzazm.zzye()) {
                        this.zzbft = null;
                        zzdwf.post(new zzaxb(this, context));
                        while (this.zzbft == null) {
                            try {
                                this.zzdwg.wait();
                            } catch (InterruptedException unused2) {
                                String zzxf = zzxf();
                                this.zzbft = zzxf;
                                String valueOf = String.valueOf(zzxf);
                                zzawr.zzfc(valueOf.length() != 0 ? "Interrupted, use default user agent: ".concat(valueOf) : new String("Interrupted, use default user agent: "));
                            }
                        }
                    } else {
                        this.zzbft = zzaq(context);
                    }
                }
                String valueOf2 = String.valueOf(this.zzbft);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 10 + String.valueOf(str).length());
                sb.append(valueOf2);
                sb.append(" (Mobile; ");
                sb.append(str);
                this.zzbft = sb.toString();
                try {
                    if (Wrappers.packageManager(context).isCallerInstantApp()) {
                        this.zzbft = String.valueOf(this.zzbft).concat(";aia");
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzq.zzla().zza(e, "AdUtil.getUserAgent");
                }
                String concat = String.valueOf(this.zzbft).concat(")");
                this.zzbft = concat;
                return concat;
            }
        }
    }

    public static String zzaq(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return zzxf();
        }
    }

    public final JSONObject zzj(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zza(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    public final JSONObject zza(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return zzd(bundle);
            } catch (JSONException e) {
                zzawr.zzc("Error converting Bundle to JSON", e);
            }
        }
        return null;
    }

    public final JSONObject zzd(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zza(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    private final JSONArray zza(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            zza(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void zza(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(zzd((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(zzj((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(zza((Collection) obj));
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object obj2 : (Object[]) obj) {
                zza(jSONArray2, obj2);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    private final void zza(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzd((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, zzj((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, zza((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, zza(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    private static int zza(char c) {
        if (c < '0' || c > '9') {
            char c2 = 'A';
            if (c < 'A' || c > 'F') {
                c2 = 'a';
                if (c < 'a' || c > 'f') {
                    throw new IllegalArgumentException("Invalid Hex.");
                }
            }
            return (c - c2) + 10;
        }
        return c - '0';
    }

    public final zzdri<Map<String, String>> zzi(Uri uri) {
        return zzdqw.zzb(zzdqw.zzag(null), new zzdqj(this, uri) { // from class: com.google.android.gms.internal.ads.zzawz
            private final zzaxa zzdwb;
            private final Uri zzdwc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdwb = this;
                this.zzdwc = uri;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return zzdqw.zzag(zzaxa.zzj(this.zzdwc));
            }
        }, zzbab.zzdzr);
    }

    public static Map<String, String> zzj(Uri uri) {
        if (!zzabj.zzcwk.get().booleanValue()) {
            if (uri == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            com.google.android.gms.ads.internal.zzq.zzky();
            for (String str : uri.getQueryParameterNames()) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
            return hashMap;
        } else if (uri == null) {
            return null;
        } else {
            HashMap hashMap2 = new HashMap(20);
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery == null) {
                return hashMap2;
            }
            int length = encodedQuery.length();
            StringBuilder sb = new StringBuilder(100);
            StringBuilder sb2 = new StringBuilder(length);
            StringBuilder sb3 = sb;
            int i = 0;
            while (i < length) {
                char charAt = encodedQuery.charAt(i);
                if (charAt == '%') {
                    byte[] bArr = new byte[(length - i) / 3];
                    int i2 = 0;
                    while (i < length - 2 && charAt == '%') {
                        try {
                            bArr[i2] = (byte) ((zza(encodedQuery.charAt(i + 1)) << 4) + zza(encodedQuery.charAt(i + 2)));
                            i2++;
                        } catch (IllegalArgumentException unused) {
                        }
                        i += 3;
                        if (i < length) {
                            charAt = encodedQuery.charAt(i);
                        }
                    }
                    try {
                        sb3.append(new String(bArr, 0, i2, "UTF-8"));
                    } catch (UnsupportedEncodingException unused2) {
                    }
                    if (charAt != '%') {
                    }
                } else if (charAt == '&') {
                    if (sb.length() > 0 && sb3 != sb) {
                        hashMap2.put(sb.toString(), sb2.toString());
                        sb.setLength(0);
                        sb2.setLength(0);
                    }
                    sb3 = sb;
                } else if (charAt == '+') {
                    sb3.append(' ');
                } else if (charAt != '=') {
                    sb3.append(charAt);
                } else if (sb3 != sb2) {
                    sb3 = sb2;
                } else {
                    sb3.append(charAt);
                }
                i++;
            }
            if (sb.length() > 0 && sb3 != sb) {
                hashMap2.put(sb.toString(), sb2.toString());
            }
            return hashMap2;
        }
    }

    public static String zzxg() {
        return UUID.randomUUID().toString();
    }

    public static int zzel(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            zzawr.zzfc(sb.toString());
            return 0;
        }
    }

    public static String zzxh() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    private static int[] zzxi() {
        return new int[]{0, 0};
    }

    public static int[] zzd(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(16908290)) == null) ? zzxi() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public final int[] zze(Activity activity) {
        int[] zzd = zzd(activity);
        return new int[]{zzvj.zzpr().zzb(activity, zzd[0]), zzvj.zzpr().zzb(activity, zzd[1])};
    }

    public final int[] zzf(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] zzxi = (window == null || (findViewById = window.findViewById(16908290)) == null) ? zzxi() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{zzvj.zzpr().zzb(activity, zzxi[0]), zzvj.zzpr().zzb(activity, zzxi[1])};
    }

    public static boolean zzem(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static DisplayMetrics zza(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static AlertDialog.Builder zzar(Context context) {
        return new AlertDialog.Builder(context);
    }

    public static zzzg zzas(Context context) {
        return new zzzg(context);
    }

    public static Bitmap zzm(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public static PopupWindow zza(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    public static String zzat(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                return runningTaskInfo.topActivity.getClassName();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean zzau(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return true;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    return !(powerManager == null ? false : powerManager.isScreenOn());
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public final void zza(Context context, String str, String str2, Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.zzq.zzkw();
        bundle.putString("device", zzxh());
        bundle.putString("eids", TextUtils.join(",", zzzz.zzra()));
        zzvj.zzpr();
        zzazm.zza(context, str, str2, bundle, true, new zzaxe(this, context, str));
    }

    public static void zzc(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzbab.zzdzr.execute(runnable);
        }
    }

    public static Bitmap zzn(View view) {
        if (view == null) {
            return null;
        }
        Bitmap zzp = zzp(view);
        return zzp == null ? zzo(view) : zzp;
    }

    private static Bitmap zzo(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0 && height != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(createBitmap);
                view.layout(0, 0, width, height);
                view.draw(canvas);
                return createBitmap;
            }
            zzawr.zzfc("Width or height of view is zero");
            return null;
        } catch (RuntimeException e) {
            zzawr.zzc("Fail to capture the webview", e);
            return null;
        }
    }

    private static Bitmap zzp(View view) {
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            r0 = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e) {
            zzawr.zzc("Fail to capture the web view", e);
        }
        return r0;
    }

    public static void zza(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static int zzav(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    public final boolean zza(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zza(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzaw(context));
    }

    private static KeyguardManager zzaw(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    public final boolean zza(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z;
        if (!com.google.android.gms.ads.internal.zzq.zzkw().zzyg) {
            if ((keyguardManager == null ? false : keyguardManager.inKeyguardRestrictedInputMode()) && !zzq(view)) {
                z = false;
                if (view.getVisibility() == 0 && view.isShown()) {
                    if ((powerManager != null || powerManager.isScreenOn()) && z) {
                        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcmt)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        z = true;
        if (view.getVisibility() == 0) {
            if (powerManager != null || powerManager.isScreenOn()) {
                if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcmt)).booleanValue()) {
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzq(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L12
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L12
            android.app.Activity r2 = (android.app.Activity) r2
            goto L13
        L12:
            r2 = r0
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxa.zzq(android.view.View):boolean");
    }

    public static boolean zzax(Context context) {
        KeyguardManager zzaw;
        return context != null && PlatformVersion.isAtLeastJellyBean() && (zzaw = zzaw(context)) != null && zzaw.isKeyguardLocked();
    }

    public static int zzr(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    public static boolean zzay(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzawr.zzc("Error loading class.", th);
            com.google.android.gms.ads.internal.zzq.zzla().zza(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static void zza(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzb(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            zzawr.zzed(sb.toString());
        } catch (ActivityNotFoundException e) {
            zzawr.zzc("No browser is found.", e);
        }
    }

    public static void zzb(Context context, Intent intent) {
        if (intent != null && PlatformVersion.isAtLeastJellyBeanMR2()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static void zzc(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e) {
            zzawr.zzc("Error writing to file in internal storage.", e);
        }
    }

    public static String zzs(Context context, String str) {
        try {
            return new String(IOUtils.readInputStreamFully(context.openFileInput(str), true), "UTF-8");
        } catch (IOException unused) {
            zzawr.zzed("Error reading from internal storage.");
            return "";
        }
    }

    public final boolean zzen(String str) {
        return zza(str, this.zzdwd, (String) zzvj.zzpv().zzd(zzzz.zzckn));
    }

    public final boolean zzeo(String str) {
        return zza(str, this.zzdwe, (String) zzvj.zzpv().zzd(zzzz.zzcko));
    }

    private static boolean zza(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String zzxj() {
        Resources resources = com.google.android.gms.ads.internal.zzq.zzla().getResources();
        return resources != null ? resources.getString(R.string.s7) : "Test Ad";
    }

    public static WebResourceResponse zzd(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzq.zzkw().zzr(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = new zzaym(context).zzc(str2, hashMap).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            zzawr.zzd("Could not fetch MRAID JS.", e);
            return null;
        }
    }

    public static WebResourceResponse zzd(HttpURLConnection httpURLConnection) throws IOException {
        com.google.android.gms.ads.internal.zzq.zzkw();
        String contentType = httpURLConnection.getContentType();
        String str = "";
        String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
        com.google.android.gms.ads.internal.zzq.zzkw();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str2 = str;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && entry.getValue().size() > 0) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return com.google.android.gms.ads.internal.zzq.zzky().zza(trim, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static void zza(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        boolean z = false;
        try {
            z = zzabt.zzcxo.get().booleanValue();
        } catch (IllegalStateException unused) {
        }
        if (z) {
            CrashUtils.addDynamiteErrorToDropBox(context, th);
        }
    }

    public static String zzaz(Context context) {
        return !((Boolean) zzvj.zzpv().zzd(zzzz.zzcss)).booleanValue() ? "" : context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
    }

    public static Bundle zzba(Context context) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcst)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            Bundle bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
            return bundle;
        }
        return null;
    }

    public static boolean zzbb(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzep(String str) {
        if (zzazq.isEnabled()) {
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcqs)).booleanValue()) {
                String str2 = (String) zzvj.zzpv().zzd(zzzz.zzcqu);
                if (!str2.isEmpty()) {
                    for (String str3 : str2.split(";")) {
                        if (str3.equals(str)) {
                            return false;
                        }
                    }
                }
                String str4 = (String) zzvj.zzpv().zzd(zzzz.zzcqt);
                if (str4.isEmpty()) {
                    return true;
                }
                for (String str5 : str4.split(";")) {
                    if (str5.equals(str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static String zzbc(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zze(zzg(context));
    }

    public static boolean zzbd(Context context) {
        Bundle zzg = zzg(context);
        return TextUtils.isEmpty(zze(zzg)) && !TextUtils.isEmpty(zzg.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    private static String zze(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    private static Bundle zzg(Context context) {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zzawr.zza("Error getting metadata", e);
            return null;
        }
    }
}
