package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzev implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final Handler zzzn = new Handler(Looper.getMainLooper());
    private Application zzxv;
    private final zzem zzya;
    private final Context zzzo;
    private final PowerManager zzzp;
    private final KeyguardManager zzzq;
    private BroadcastReceiver zzzr;
    private WeakReference<ViewTreeObserver> zzzs;
    private WeakReference<View> zzzt;
    private zzea zzzu;
    private byte zzzv = -1;
    private int zzzw = -1;
    private long zzzx = -3;

    public zzev(Context context, zzem zzemVar) {
        Context applicationContext = context.getApplicationContext();
        this.zzzo = applicationContext;
        this.zzya = zzemVar;
        this.zzzp = (PowerManager) applicationContext.getSystemService("power");
        this.zzzq = (KeyguardManager) this.zzzo.getSystemService("keyguard");
        Context context2 = this.zzzo;
        if (context2 instanceof Application) {
            this.zzxv = (Application) context2;
            this.zzzu = new zzea((Application) context2, this);
        }
        zze(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(View view) {
        View currentView = getCurrentView();
        if (currentView != null) {
            currentView.removeOnAttachStateChangeListener(this);
            zzg(currentView);
        }
        this.zzzt = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                zzf(view);
            }
            view.addOnAttachStateChangeListener(this);
            this.zzzx = -2L;
            return;
        }
        this.zzzx = -3L;
    }

    private final View getCurrentView() {
        WeakReference<View> weakReference = this.zzzt;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private final void zzcu() {
        zzzn.post(new zzey(this));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzzw = -1;
        zzf(view);
        zzcw();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzzw = -1;
        zzcw();
        zzcu();
        zzg(view);
    }

    private final void zza(Activity activity, int i) {
        Window window;
        if (this.zzzt == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View currentView = getCurrentView();
        if (currentView == null || peekDecorView == null || currentView.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.zzzw = i;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(activity, 0);
        zzcw();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(activity, 0);
        zzcw();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(activity, 0);
        zzcw();
        zzcu();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(activity, 4);
        zzcw();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzcw();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzcw();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzcw();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzcw();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzcw();
    }

    public final long zzcv() {
        if (this.zzzx <= -2 && getCurrentView() == null) {
            this.zzzx = -3L;
        }
        return this.zzzx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0064, code lost:
        if (r7 == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzcw() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.zzzt
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View r0 = r9.getCurrentView()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L13
            r9.zzzx = r2
            r9.zzzv = r1
            return
        L13:
            int r4 = r0.getVisibility()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L1d
            r4 = 1
            goto L1e
        L1d:
            r4 = 0
        L1e:
            boolean r7 = r0.isShown()
            if (r7 != 0) goto L27
            r4 = r4 | 2
            byte r4 = (byte) r4
        L27:
            android.os.PowerManager r7 = r9.zzzp
            if (r7 == 0) goto L34
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L34
            r4 = r4 | 4
            byte r4 = (byte) r4
        L34:
            com.google.android.gms.internal.ads.zzem r7 = r9.zzya
            boolean r7 = r7.zzcg()
            if (r7 != 0) goto L68
            android.app.KeyguardManager r7 = r9.zzzq
            if (r7 == 0) goto L67
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L67
            android.app.Activity r7 = com.google.android.gms.internal.ads.zzet.zzd(r0)
            if (r7 == 0) goto L63
            android.view.Window r7 = r7.getWindow()
            if (r7 != 0) goto L54
            r7 = 0
            goto L58
        L54:
            android.view.WindowManager$LayoutParams r7 = r7.getAttributes()
        L58:
            if (r7 == 0) goto L63
            int r7 = r7.flags
            r8 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 & r8
            if (r7 == 0) goto L63
            r7 = 1
            goto L64
        L63:
            r7 = 0
        L64:
            if (r7 == 0) goto L67
            goto L68
        L67:
            r5 = 0
        L68:
            if (r5 != 0) goto L6d
            r4 = r4 | 8
            byte r4 = (byte) r4
        L6d:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L7b
            r4 = r4 | 16
            byte r4 = (byte) r4
        L7b:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L89
            r4 = r4 | 32
            byte r4 = (byte) r4
        L89:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.zzzw
            if (r5 == r1) goto L92
            r0 = r5
        L92:
            if (r0 == 0) goto L97
            r0 = r4 | 64
            byte r4 = (byte) r0
        L97:
            byte r0 = r9.zzzv
            if (r0 == r4) goto La9
            r9.zzzv = r4
            if (r4 != 0) goto La4
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto La7
        La4:
            long r0 = (long) r4
            long r0 = r2 - r0
        La7:
            r9.zzzx = r0
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzev.zzcw():void");
    }

    private final void zzf(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzzs = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzzr == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            zzex zzexVar = new zzex(this);
            this.zzzr = zzexVar;
            this.zzzo.registerReceiver(zzexVar, intentFilter);
        }
        Application application = this.zzxv;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzzu);
            } catch (Exception unused) {
            }
        }
    }

    private final void zzg(View view) {
        try {
            if (this.zzzs != null) {
                ViewTreeObserver viewTreeObserver = this.zzzs.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzzs = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.zzzr;
        if (broadcastReceiver != null) {
            try {
                this.zzzo.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.zzzr = null;
        }
        Application application = this.zzxv;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzzu);
            } catch (Exception unused4) {
            }
        }
    }
}
