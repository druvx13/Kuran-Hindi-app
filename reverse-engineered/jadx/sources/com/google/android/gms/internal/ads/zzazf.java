package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzazf implements Callable<String> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ Context zzdyn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazf(zzazd zzazdVar, Context context, Context context2) {
        this.zzdyn = context;
        this.val$context = context2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.zzdyn != null) {
            zzawr.zzeg("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.zzdyn.getSharedPreferences("admob_user_agent", 0);
        } else {
            zzawr.zzeg("Attempting to read user agent from local cache.");
            sharedPreferences = this.val$context.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            zzawr.zzeg("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.val$context);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                zzawr.zzeg("Persisting user agent.");
            }
        }
        return string;
    }
}
