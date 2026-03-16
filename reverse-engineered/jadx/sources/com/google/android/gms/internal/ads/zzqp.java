package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzqp extends Thread {
    private final Object lock;
    private boolean started;
    private final int zzbpm;
    private final int zzbpo;
    private final boolean zzbpp;
    private boolean zzbqm;
    private boolean zzbqn;
    private final zzqm zzbqo;
    private final int zzbqp;
    private final int zzbqq;
    private final int zzbqr;
    private final int zzbqs;
    private final int zzbqt;
    private final int zzbqu;
    private final String zzbqv;
    private final boolean zzbqw;
    private final boolean zzbqx;

    public zzqp() {
        this(new zzqm());
    }

    private zzqp(zzqm zzqmVar) {
        this.started = false;
        this.zzbqm = false;
        this.zzbqn = false;
        this.zzbqo = zzqmVar;
        this.lock = new Object();
        this.zzbpm = zzabh.zzcwe.get().intValue();
        this.zzbqq = zzabh.zzcwb.get().intValue();
        this.zzbpo = zzabh.zzcwf.get().intValue();
        this.zzbqr = zzabh.zzcwd.get().intValue();
        this.zzbqs = ((Integer) zzvj.zzpv().zzd(zzzz.zzcke)).intValue();
        this.zzbqt = ((Integer) zzvj.zzpv().zzd(zzzz.zzckf)).intValue();
        this.zzbqu = ((Integer) zzvj.zzpv().zzd(zzzz.zzckg)).intValue();
        this.zzbqp = zzabh.zzcwg.get().intValue();
        this.zzbqv = (String) zzvj.zzpv().zzd(zzzz.zzcki);
        this.zzbqw = ((Boolean) zzvj.zzpv().zzd(zzzz.zzckj)).booleanValue();
        this.zzbpp = ((Boolean) zzvj.zzpv().zzd(zzzz.zzckk)).booleanValue();
        this.zzbqx = ((Boolean) zzvj.zzpv().zzd(zzzz.zzckl)).booleanValue();
        setName("ContentFetchTask");
    }

    public final void zzmh() {
        synchronized (this.lock) {
            if (this.started) {
                zzawr.zzed("Content hash thread already started, quiting...");
                return;
            }
            this.started = true;
            start();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                if (zzmi()) {
                    Activity activity = com.google.android.gms.ads.internal.zzq.zzkz().getActivity();
                    if (activity == null) {
                        zzawr.zzed("ContentFetchThread: no activity. Sleeping.");
                        zzmk();
                    } else if (activity != null) {
                        View view = null;
                        try {
                            if (activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
                                view = activity.getWindow().getDecorView().findViewById(16908290);
                            }
                        } catch (Exception e) {
                            com.google.android.gms.ads.internal.zzq.zzla().zza(e, "ContentFetchTask.extractContent");
                            zzawr.zzed("Failed getting root view of activity. Content not extracted.");
                        }
                        if (view != null && view != null) {
                            view.post(new zzqs(this, view));
                        }
                    }
                } else {
                    zzawr.zzed("ContentFetchTask: sleeping");
                    zzmk();
                }
                Thread.sleep(this.zzbqp * 1000);
            } catch (InterruptedException e2) {
                zzawr.zzc("Error in ContentFetchTask", e2);
            } catch (Exception e3) {
                zzawr.zzc("Error in ContentFetchTask", e3);
                com.google.android.gms.ads.internal.zzq.zzla().zza(e3, "ContentFetchTask.run");
            }
            synchronized (this.lock) {
                while (this.zzbqm) {
                    try {
                        zzawr.zzed("ContentFetchTask: waiting");
                        this.lock.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(View view) {
        try {
            zzqj zzqjVar = new zzqj(this.zzbpm, this.zzbqq, this.zzbpo, this.zzbqr, this.zzbqs, this.zzbqt, this.zzbqu, this.zzbpp);
            Context context = com.google.android.gms.ads.internal.zzq.zzkz().getContext();
            if (context != null && !TextUtils.isEmpty(this.zzbqv)) {
                String str = (String) view.getTag(context.getResources().getIdentifier((String) zzvj.zzpv().zzd(zzzz.zzckh), "id", context.getPackageName()));
                if (str != null && str.equals(this.zzbqv)) {
                    return;
                }
            }
            zzqt zza = zza(view, zzqjVar);
            zzqjVar.zzmf();
            if (zza.zzbre == 0 && zza.zzbrf == 0) {
                return;
            }
            if (zza.zzbrf == 0 && zzqjVar.zzmg() == 0) {
                return;
            }
            if (zza.zzbrf == 0 && this.zzbqo.zza(zzqjVar)) {
                return;
            }
            this.zzbqo.zzc(zzqjVar);
        } catch (Exception e) {
            zzawr.zzc("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzq.zzla().zza(e, "ContentFetchTask.fetchContent");
        }
    }

    private static boolean zzmi() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Context context = com.google.android.gms.ads.internal.zzq.zzkz().getContext();
            if (context == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    return powerManager == null ? false : powerManager.isScreenOn();
                }
            }
            return false;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzq.zzla().zza(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final zzqt zza(View view, zzqj zzqjVar) {
        boolean z;
        if (view == null) {
            return new zzqt(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (!TextUtils.isEmpty(text)) {
                zzqjVar.zzb(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                return new zzqt(this, 1, 0);
            }
            return new zzqt(this, 0, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzbek)) {
            WebView webView = (WebView) view;
            if (PlatformVersion.isAtLeastKitKat()) {
                zzqjVar.zzmd();
                webView.post(new zzqr(this, zzqjVar, webView, globalVisibleRect));
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new zzqt(this, 0, 1);
            }
            return new zzqt(this, 0, 0);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                zzqt zza = zza(viewGroup.getChildAt(i3), zzqjVar);
                i += zza.zzbre;
                i2 += zza.zzbrf;
            }
            return new zzqt(this, i, i2);
        } else {
            return new zzqt(this, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzqj zzqjVar, WebView webView, String str, boolean z) {
        zzqjVar.zzmc();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (!this.zzbqw && !TextUtils.isEmpty(webView.getTitle())) {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzqjVar.zza(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzqjVar.zza(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzqjVar.zzlx()) {
                this.zzbqo.zzb(zzqjVar);
            }
        } catch (JSONException unused) {
            zzawr.zzed("Json string may be malformed.");
        } catch (Throwable th) {
            zzawr.zzb("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzq.zzla().zza(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final zzqj zzmj() {
        return this.zzbqo.zzo(this.zzbqx);
    }

    public final void wakeup() {
        synchronized (this.lock) {
            this.zzbqm = false;
            this.lock.notifyAll();
            zzawr.zzed("ContentFetchThread: wakeup");
        }
    }

    private final void zzmk() {
        synchronized (this.lock) {
            this.zzbqm = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            zzawr.zzed(sb.toString());
        }
    }

    public final boolean zzml() {
        return this.zzbqm;
    }
}
