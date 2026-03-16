package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaov implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzaos zzdiz;
    private final /* synthetic */ String zzdja;
    private final /* synthetic */ String zzdjb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaov(zzaos zzaosVar, String str, String str2) {
        this.zzdiz = zzaosVar;
        this.zzdja = str;
        this.zzdjb = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        context = this.zzdiz.zzvf;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        try {
            String str = this.zzdja;
            String str2 = this.zzdjb;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            com.google.android.gms.ads.internal.zzq.zzky();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.zzdiz.zzdv("Could not store picture.");
        }
    }
}
