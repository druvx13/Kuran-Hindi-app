package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzawr;
import com.google.android.gms.internal.ads.zzvm;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzk extends WebViewClient {
    private final /* synthetic */ zzl zzbmn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzk(zzl zzlVar) {
        this.zzbmn = zzlVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzvm zzvmVar;
        zzvm zzvmVar2;
        String zzbp;
        zzvm zzvmVar3;
        zzvm zzvmVar4;
        zzvm zzvmVar5;
        zzvm zzvmVar6;
        zzvm zzvmVar7;
        zzvm zzvmVar8;
        if (str.startsWith(this.zzbmn.zzkm())) {
            return false;
        }
        if (!str.startsWith("gmsg://noAdLoaded")) {
            if (!str.startsWith("gmsg://scriptLoadFailed")) {
                if (!str.startsWith("gmsg://adResized")) {
                    if (str.startsWith("gmsg://")) {
                        return true;
                    }
                    zzvmVar = this.zzbmn.zzbmt;
                    if (zzvmVar != null) {
                        try {
                            zzvmVar2 = this.zzbmn.zzbmt;
                            zzvmVar2.onAdLeftApplication();
                        } catch (RemoteException e) {
                            zzawr.zze("#007 Could not call remote method.", e);
                        }
                    }
                    zzbp = this.zzbmn.zzbp(str);
                    this.zzbmn.zzbq(zzbp);
                    return true;
                }
                zzvmVar3 = this.zzbmn.zzbmt;
                if (zzvmVar3 != null) {
                    try {
                        zzvmVar4 = this.zzbmn.zzbmt;
                        zzvmVar4.onAdLoaded();
                    } catch (RemoteException e2) {
                        zzawr.zze("#007 Could not call remote method.", e2);
                    }
                }
                this.zzbmn.zzbn(this.zzbmn.zzbo(str));
                return true;
            }
            zzvmVar5 = this.zzbmn.zzbmt;
            if (zzvmVar5 != null) {
                try {
                    zzvmVar6 = this.zzbmn.zzbmt;
                    zzvmVar6.onAdFailedToLoad(0);
                } catch (RemoteException e3) {
                    zzawr.zze("#007 Could not call remote method.", e3);
                }
            }
            this.zzbmn.zzbn(0);
            return true;
        }
        zzvmVar7 = this.zzbmn.zzbmt;
        if (zzvmVar7 != null) {
            try {
                zzvmVar8 = this.zzbmn.zzbmt;
                zzvmVar8.onAdFailedToLoad(3);
            } catch (RemoteException e4) {
                zzawr.zze("#007 Could not call remote method.", e4);
            }
        }
        this.zzbmn.zzbn(0);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzvm zzvmVar;
        zzvm zzvmVar2;
        zzvmVar = this.zzbmn.zzbmt;
        if (zzvmVar != null) {
            try {
                zzvmVar2 = this.zzbmn.zzbmt;
                zzvmVar2.onAdFailedToLoad(0);
            } catch (RemoteException e) {
                zzawr.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
