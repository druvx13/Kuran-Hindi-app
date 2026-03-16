package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbft;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbff<WebViewT extends zzbfj & zzbfr & zzbft> {
    private final zzbfk zzeld;
    private final WebViewT zzele;

    public static zzbff<zzbek> zzc(final zzbek zzbekVar) {
        return new zzbff<>(zzbekVar, new zzbfk(zzbekVar) { // from class: com.google.android.gms.internal.ads.zzbfi
            private final zzbek zzelg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzelg = zzbekVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbfk
            public final void zzh(Uri uri) {
                zzbfw zzabj = this.zzelg.zzabj();
                if (zzabj == null) {
                    zzawr.zzfa("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                } else {
                    zzabj.zzh(uri);
                }
            }
        });
    }

    private zzbff(WebViewT webviewt, zzbfk zzbfkVar) {
        this.zzeld = zzbfkVar;
        this.zzele = webviewt;
    }

    @JavascriptInterface
    public final void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            zzawr.zzfc("URL is empty, ignoring message");
        } else {
            zzaxa.zzdwf.post(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzbfh
                private final String zzdbv;
                private final zzbff zzelf;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzelf = this;
                    this.zzdbv = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzelf.zzfs(this.zzdbv);
                }
            });
        }
    }

    @JavascriptInterface
    public final String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zzawr.zzeg("Click string is empty, not proceeding.");
            return "";
        }
        zzdt zzabm = this.zzele.zzabm();
        if (zzabm == null) {
            zzawr.zzeg("Signal utils is empty, ignoring.");
            return "";
        }
        zzdj zzcb = zzabm.zzcb();
        if (zzcb == null) {
            zzawr.zzeg("Signals object is empty, ignoring.");
            return "";
        } else if (this.zzele.getContext() == null) {
            zzawr.zzeg("Context is null, ignoring.");
            return "";
        } else {
            return zzcb.zza(this.zzele.getContext(), str, this.zzele.getView(), this.zzele.zzzh());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzfs(String str) {
        this.zzeld.zzh(Uri.parse(str));
    }
}
