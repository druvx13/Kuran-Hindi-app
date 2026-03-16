package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzase extends ContextWrapper {
    private Context zzdra;
    private WeakReference<Activity> zzdrb;

    private zzase(Context context) {
        super(context);
        this.zzdrb = new WeakReference<>(null);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this;
    }

    public final synchronized void setAppPackageName(String str) throws PackageManager.NameNotFoundException {
        this.zzdra = super.createPackageContext(str, 0);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized ApplicationInfo getApplicationInfo() {
        if (this.zzdra != null) {
            return this.zzdra.getApplicationInfo();
        }
        return super.getApplicationInfo();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageName() {
        if (this.zzdra != null) {
            return this.zzdra.getPackageName();
        }
        return super.getPackageName();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageResourcePath() {
        if (this.zzdra != null) {
            return this.zzdra.getPackageResourcePath();
        }
        return super.getPackageResourcePath();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized void startActivity(Intent intent) {
        zze(zzd(intent));
    }

    private final synchronized Intent zzd(Intent intent) {
        if (this.zzdra != null && intent.getComponent() != null && intent.getComponent().getPackageName().equals(this.zzdra.getPackageName())) {
            Intent intent2 = (Intent) intent.clone();
            intent2.setClassName(super.getPackageName(), intent.getComponent().getClassName());
            return intent2;
        }
        return intent;
    }

    private final synchronized void zze(Intent intent) {
        Activity activity = this.zzdrb.get();
        if (activity == null) {
            intent.addFlags(268435456);
            super.startActivity(intent);
            return;
        }
        Intent intent2 = (Intent) intent.clone();
        intent2.setFlags(intent.getFlags() & (-268435457));
        activity.startActivity(intent2);
    }

    public static zzase zzz(Context context) {
        return new zzase(zzk(context));
    }

    public static Context zzaa(Context context) {
        if (context instanceof zzase) {
            return ((zzase) context).getBaseContext();
        }
        return zzk(context);
    }

    private static Context zzk(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
