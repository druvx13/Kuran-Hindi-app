package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzpv implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final long zzbon = ((Long) zzvj.zzpv().zzd(zzzz.zzcmu)).longValue();
    private final WindowManager zzboo;
    private BroadcastReceiver zzbop;
    private WeakReference<View> zzboq;
    private zzqc zzbor;
    private final Rect zzbov;
    private final DisplayMetrics zzwz;
    private Application zzxv;
    private final Context zzzo;
    private final PowerManager zzzp;
    private final KeyguardManager zzzq;
    private WeakReference<ViewTreeObserver> zzzs;
    private zzazc zzbos = new zzazc(zzbon);
    private boolean zzbot = false;
    private int zzzw = -1;
    private final HashSet<zzpz> zzbou = new HashSet<>();

    public zzpv(Context context, View view) {
        this.zzzo = context.getApplicationContext();
        this.zzboo = (WindowManager) context.getSystemService("window");
        this.zzzp = (PowerManager) this.zzzo.getSystemService("power");
        this.zzzq = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.zzzo;
        if (context2 instanceof Application) {
            this.zzxv = (Application) context2;
            this.zzbor = new zzqc((Application) context2, this);
        }
        this.zzwz = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.zzbov = rect;
        rect.right = this.zzboo.getDefaultDisplay().getWidth();
        this.zzbov.bottom = this.zzboo.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.zzboq;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzg(view2);
        }
        this.zzboq = new WeakReference<>(view);
        if (view != null) {
            if (com.google.android.gms.ads.internal.zzq.zzky().isAttachedToWindow(view)) {
                zzf(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final void zza(zzpz zzpzVar) {
        this.zzbou.add(zzpzVar);
        zzbo(3);
    }

    public final void zzb(zzpz zzpzVar) {
        this.zzbou.remove(zzpzVar);
    }

    private final void zzcu() {
        zzaxa.zzdwf.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzpy
            private final zzpv zzbpa;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbpa = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzbpa.zzlw();
            }
        });
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzzw = -1;
        zzf(view);
        zzbo(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzzw = -1;
        zzbo(3);
        zzcu();
        zzg(view);
    }

    private final void zza(Activity activity, int i) {
        Window window;
        if (this.zzboq == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = this.zzboq.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.zzzw = i;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(activity, 0);
        zzbo(3);
        zzcu();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(activity, 0);
        zzbo(3);
        zzcu();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(activity, 0);
        zzbo(3);
        zzcu();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(activity, 4);
        zzbo(3);
        zzcu();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzbo(3);
        zzcu();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzbo(3);
        zzcu();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzbo(3);
        zzcu();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzbo(2);
        zzcu();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzbo(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbo(int i) {
        WeakReference<View> weakReference;
        boolean z;
        boolean z2;
        List<Rect> emptyList;
        if (this.zzbou.size() == 0 || (weakReference = this.zzboq) == null) {
            return;
        }
        View view = weakReference.get();
        boolean z3 = i == 1;
        boolean z4 = view == null;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
            boolean localVisibleRect = view.getLocalVisibleRect(rect3);
            view.getHitRect(rect4);
            try {
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr2);
            } catch (Exception e) {
                zzawr.zzc("Failure getting view location.", e);
            }
            rect.left = iArr[0];
            rect.top = iArr[1];
            rect.right = rect.left + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
            z = globalVisibleRect;
            z2 = localVisibleRect;
        } else {
            z = false;
            z2 = false;
        }
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcmx)).booleanValue() && view != null) {
            emptyList = zzi(view);
        } else {
            emptyList = Collections.emptyList();
        }
        List<Rect> list = emptyList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i2 = this.zzzw;
        if (i2 != -1) {
            windowVisibility = i2;
        }
        boolean z5 = !z4 && com.google.android.gms.ads.internal.zzq.zzkw().zza(view, this.zzzp, this.zzzq) && z && z2 && windowVisibility == 0;
        if (z3 && !this.zzbos.tryAcquire() && z5 == this.zzbot) {
            return;
        }
        if (z5 || this.zzbot || i != 1) {
            zzqa zzqaVar = new zzqa(com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime(), this.zzzp.isScreenOn(), view != null && com.google.android.gms.ads.internal.zzq.zzky().isAttachedToWindow(view), view != null ? view.getWindowVisibility() : 8, zza(this.zzbov), zza(rect), zza(rect2), z, zza(rect3), z2, zza(rect4), this.zzwz.density, z5, list);
            Iterator<zzpz> it = this.zzbou.iterator();
            while (it.hasNext()) {
                it.next().zza(zzqaVar);
            }
            this.zzbot = z5;
        }
    }

    private final Rect zza(Rect rect) {
        return new Rect(zzbp(rect.left), zzbp(rect.top), zzbp(rect.right), zzbp(rect.bottom));
    }

    private final int zzbp(int i) {
        return (int) (i / this.zzwz.density);
    }

    private final List<Rect> zzi(View view) {
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (view2.isScrollContainer() && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(zza(rect));
                }
            }
            return arrayList;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzq.zzla().zza(e, "PositionWatcher.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    private final void zzf(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzzs = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzbop == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zzbop = new zzpx(this);
            com.google.android.gms.ads.internal.zzq.zzlr().zza(this.zzzo, this.zzbop, intentFilter);
        }
        Application application = this.zzxv;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzbor);
            } catch (Exception e) {
                zzawr.zzc("Error registering activity lifecycle callbacks.", e);
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
        } catch (Exception e) {
            zzawr.zzc("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            zzawr.zzc("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.zzbop != null) {
            try {
                com.google.android.gms.ads.internal.zzq.zzlr().zza(this.zzzo, this.zzbop);
            } catch (IllegalStateException e3) {
                zzawr.zzc("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.zzq.zzla().zza(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zzbop = null;
        }
        Application application = this.zzxv;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzbor);
            } catch (Exception e5) {
                zzawr.zzc("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    public final void zzen(long j) {
        this.zzbos.zzfb(j);
    }

    public final void zzlv() {
        this.zzbos.zzfb(zzbon);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzlw() {
        zzbo(3);
    }
}
