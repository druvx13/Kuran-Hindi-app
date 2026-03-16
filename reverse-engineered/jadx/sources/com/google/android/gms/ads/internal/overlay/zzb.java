package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzawr;
import com.google.android.gms.internal.ads.zzaxa;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzzz;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzb {
    public static boolean zza(Context context, zzd zzdVar, zzt zztVar) {
        int i = 0;
        if (zzdVar == null) {
            zzawr.zzfc("No intent data for launcher overlay.");
            return false;
        }
        zzzz.initialize(context);
        if (zzdVar.intent != null) {
            return zza(context, zzdVar.intent, zztVar);
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(zzdVar.url)) {
            zzawr.zzfc("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzdVar.mimeType)) {
            intent.setDataAndType(Uri.parse(zzdVar.url), zzdVar.mimeType);
        } else {
            intent.setData(Uri.parse(zzdVar.url));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzdVar.packageName)) {
            intent.setPackage(zzdVar.packageName);
        }
        if (!TextUtils.isEmpty(zzdVar.zzdki)) {
            String[] split = zzdVar.zzdki.split("/", 2);
            if (split.length < 2) {
                String valueOf = String.valueOf(zzdVar.zzdki);
                zzawr.zzfc(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        String str = zzdVar.zzdkj;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzawr.zzfc("Could not parse intent flags.");
            }
            intent.addFlags(i);
        }
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcqe)).booleanValue()) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcqd)).booleanValue()) {
                com.google.android.gms.ads.internal.zzq.zzkw();
                zzaxa.zzb(context, intent);
            }
        }
        return zza(context, intent, zztVar);
    }

    private static boolean zza(Context context, Intent intent, zzt zztVar) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            zzawr.zzeg(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            com.google.android.gms.ads.internal.zzq.zzkw();
            zzaxa.zza(context, intent);
            if (zztVar != null) {
                zztVar.zzuq();
                return true;
            }
            return true;
        } catch (ActivityNotFoundException e) {
            zzawr.zzfc(e.getMessage());
            return false;
        }
    }
}
