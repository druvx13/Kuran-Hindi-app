package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaas;
import com.google.android.gms.internal.ads.zzabd;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzasn;
import com.google.android.gms.internal.ads.zzawr;
import com.google.android.gms.internal.ads.zzazm;
import com.google.android.gms.internal.ads.zzazz;
import com.google.android.gms.internal.ads.zzbab;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzdw;
import com.google.android.gms.internal.ads.zzrn;
import com.google.android.gms.internal.ads.zzuj;
import com.google.android.gms.internal.ads.zzum;
import com.google.android.gms.internal.ads.zzut;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzvy;
import com.google.android.gms.internal.ads.zzwc;
import com.google.android.gms.internal.ads.zzwh;
import com.google.android.gms.internal.ads.zzwn;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxg;
import com.google.android.gms.internal.ads.zzxl;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzze;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzl extends zzvy {
    private final zzazz zzbmo;
    private final zzum zzbmp;
    private final Future<zzdt> zzbmq = zzbab.zzdzr.zzd(new zzm(this));
    private final zzo zzbmr;
    private WebView zzbms;
    private zzvm zzbmt;
    private zzdt zzbmu;
    private AsyncTask<Void, Void, String> zzbmv;
    private final Context zzvf;

    public zzl(Context context, zzum zzumVar, String str, zzazz zzazzVar) {
        this.zzvf = context;
        this.zzbmo = zzazzVar;
        this.zzbmp = zzumVar;
        this.zzbms = new WebView(this.zzvf);
        this.zzbmr = new zzo(context, str);
        zzbn(0);
        this.zzbms.setVerticalScrollBarEnabled(false);
        this.zzbms.getSettings().setJavaScriptEnabled(true);
        this.zzbms.setWebViewClient(new zzk(this));
        this.zzbms.setOnTouchListener(new zzn(this));
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzxl getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean isLoading() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean isReady() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void stopLoading() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzxf zzxfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final String zzkh() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzxg zzki() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final IObjectWrapper zzke() throws RemoteException {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzbms);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzbmv.cancel(true);
        this.zzbmq.cancel(true);
        this.zzbms.destroy();
        this.zzbms = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean zza(zzuj zzujVar) throws RemoteException {
        Preconditions.checkNotNull(this.zzbms, "This Search Ad has already been torn down");
        this.zzbmr.zza(zzujVar, this.zzbmo);
        this.zzbmv = new zzp(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void pause() throws RemoteException {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void resume() throws RemoteException {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzvm zzvmVar) throws RemoteException {
        this.zzbmt = zzvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzwh zzwhVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzwc zzwcVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final Bundle getAdMetadata() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void showInterstitial() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzkf() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzum zzkg() throws RemoteException {
        return this.zzbmp;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzum zzumVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzapq zzapqVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzapw zzapwVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzwh zzkj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzvm zzkk() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzaas zzaasVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzvl zzvlVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzwn zzwnVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzasn zzasnVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void setUserId(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzbn(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzze zzzeVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzxr zzxrVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzut zzutVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzrn zzrnVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void setImmersiveMode(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzbo(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzvj.zzpr();
            return zzazm.zzc(this.zzvf, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzbn(int i) {
        if (this.zzbms == null) {
            return;
        }
        this.zzbms.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzkl() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(zzabd.zzcvr.get());
        builder.appendQueryParameter(SearchIntents.EXTRA_QUERY, this.zzbmr.getQuery());
        builder.appendQueryParameter("pubId", this.zzbmr.zzko());
        Map<String, String> zzkp = this.zzbmr.zzkp();
        for (String str : zzkp.keySet()) {
            builder.appendQueryParameter(str, zzkp.get(str));
        }
        Uri build = builder.build();
        zzdt zzdtVar = this.zzbmu;
        if (zzdtVar != null) {
            try {
                build = zzdtVar.zza(build, this.zzvf);
            } catch (zzdw e) {
                zzawr.zzd("Unable to process ad data", e);
            }
        }
        String zzkm = zzkm();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(zzkm).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(zzkm);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzkm() {
        String zzkn = this.zzbmr.zzkn();
        if (TextUtils.isEmpty(zzkn)) {
            zzkn = "www.google.com";
        }
        String str = zzabd.zzcvr.get();
        StringBuilder sb = new StringBuilder(String.valueOf(zzkn).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(zzkn);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzbp(String str) {
        if (this.zzbmu == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzbmu.zza(parse, this.zzvf, null, null);
        } catch (zzdw e) {
            zzawr.zzd("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbq(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.zzvf.startActivity(intent);
    }
}
