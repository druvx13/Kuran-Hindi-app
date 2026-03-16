package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaos extends zzapb {
    private final Map<String, String> zzcux;
    private final Context zzvf;

    public zzaos(zzbek zzbekVar, Map<String, String> map) {
        super(zzbekVar, "storePicture");
        this.zzcux = map;
        this.zzvf = zzbekVar.zzzh();
    }

    public final void execute() {
        if (this.zzvf == null) {
            zzdv("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzq.zzkw();
        if (!zzaxa.zzas(this.zzvf).zzqx()) {
            zzdv("Feature is not supported by the device.");
            return;
        }
        String str = this.zzcux.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzdv("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            zzdv(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            com.google.android.gms.ads.internal.zzq.zzkw();
            if (!zzaxa.zzem(lastPathSegment)) {
                String valueOf2 = String.valueOf(lastPathSegment);
                zzdv(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                return;
            }
            Resources resources = com.google.android.gms.ads.internal.zzq.zzla().getResources();
            com.google.android.gms.ads.internal.zzq.zzkw();
            AlertDialog.Builder zzar = zzaxa.zzar(this.zzvf);
            zzar.setTitle(resources != null ? resources.getString(R.string.s1) : "Save image");
            zzar.setMessage(resources != null ? resources.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
            zzar.setPositiveButton(resources != null ? resources.getString(R.string.s3) : "Accept", new zzaov(this, str, lastPathSegment));
            zzar.setNegativeButton(resources != null ? resources.getString(R.string.s4) : "Decline", new zzaou(this));
            zzar.create().show();
        }
    }
}
