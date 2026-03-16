package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzdt;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzp extends AsyncTask<Void, Void, String> {
    private final /* synthetic */ zzl zzbmn;

    private zzp(zzl zzlVar) {
        this.zzbmn = zzlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        Future future;
        try {
            zzl zzlVar = this.zzbmn;
            future = this.zzbmn.zzbmq;
            zzlVar.zzbmu = (zzdt) future.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzazw.zzd("", e);
        }
        return this.zzbmn.zzkl();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(String str) {
        WebView webView;
        WebView webView2;
        String str2 = str;
        webView = this.zzbmn.zzbms;
        if (webView == null || str2 == null) {
            return;
        }
        webView2 = this.zzbmn.zzbms;
        webView2.loadUrl(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzp(zzl zzlVar, zzk zzkVar) {
        this(zzlVar);
    }
}
