package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbft;
import java.net.URISyntaxException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzage<T extends zzbfj & zzbfm & zzbfq & zzbfr & zzbft> implements zzaga<T> {
    private final com.google.android.gms.ads.internal.zzc zzdaq;
    private final zzaor zzdar;

    public zzage(com.google.android.gms.ads.internal.zzc zzcVar, zzaor zzaorVar) {
        this.zzdaq = zzcVar;
        this.zzdar = zzaorVar;
    }

    private static boolean zzc(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int zzd(Map<String, String> map) {
        String str = map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                com.google.android.gms.ads.internal.zzq.zzky();
                return 7;
            } else if ("l".equalsIgnoreCase(str)) {
                com.google.android.gms.ads.internal.zzq.zzky();
                return 6;
            } else if ("c".equalsIgnoreCase(str)) {
                return com.google.android.gms.ads.internal.zzq.zzky().zzxk();
            } else {
                return -1;
            }
        }
        return -1;
    }

    private final void zzab(boolean z) {
        zzaor zzaorVar = this.zzdar;
        if (zzaorVar != null) {
            zzaorVar.zzac(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri zza(Context context, zzdt zzdtVar, Uri uri, View view, Activity activity) {
        if (zzdtVar == null) {
            return uri;
        }
        try {
            return zzdtVar.zzc(uri) ? zzdtVar.zza(uri, context, view, activity) : uri;
        } catch (zzdw unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzq.zzla().zza(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            zzawr.zzc(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e);
        }
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbfj zzbfjVar = (zzbfj) obj;
        String zzc = zzavj.zzc((String) map.get("u"), zzbfjVar.getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            zzawr.zzfc("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzc zzcVar = this.zzdaq;
        if (zzcVar != null && !zzcVar.zzjx()) {
            this.zzdaq.zzbm(zzc);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((zzbfm) zzbfjVar).zzabo()) {
                zzawr.zzfc("Cannot expand WebView that is already expanded.");
                return;
            }
            zzab(false);
            ((zzbfq) zzbfjVar).zzb(zzc(map), zzd(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            zzab(false);
            if (zzc != null) {
                ((zzbfq) zzbfjVar).zza(zzc(map), zzd(map), zzc);
            } else {
                ((zzbfq) zzbfjVar).zza(zzc(map), zzd(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzab(true);
            if (TextUtils.isEmpty(zzc)) {
                zzawr.zzfc("Destination url cannot be empty.");
                return;
            }
            try {
                ((zzbfq) zzbfjVar).zza(new com.google.android.gms.ads.internal.overlay.zzd(new zzagh(zzbfjVar.getContext(), ((zzbfr) zzbfjVar).zzabm(), ((zzbft) zzbfjVar).getView()).zze(map)));
            } catch (ActivityNotFoundException e) {
                zzawr.zzfc(e.getMessage());
            }
        } else {
            zzab(true);
            String str2 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    intent = Intent.parseUri(str2, 0);
                } catch (URISyntaxException e2) {
                    String valueOf = String.valueOf(str2);
                    zzawr.zzc(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e2);
                }
            }
            if (intent != null && intent.getData() != null) {
                Uri data = intent.getData();
                if (!Uri.EMPTY.equals(data)) {
                    intent.setData(zze(zza(zzbfjVar.getContext(), ((zzbfr) zzbfjVar).zzabm(), data, ((zzbft) zzbfjVar).getView(), zzbfjVar.zzzh())));
                }
            }
            if (intent != null) {
                ((zzbfq) zzbfjVar).zza(new com.google.android.gms.ads.internal.overlay.zzd(intent));
                return;
            }
            if (!TextUtils.isEmpty(zzc)) {
                zzc = zze(zza(zzbfjVar.getContext(), ((zzbfr) zzbfjVar).zzabm(), Uri.parse(zzc), ((zzbft) zzbfjVar).getView(), zzbfjVar.zzzh())).toString();
            }
            ((zzbfq) zzbfjVar).zza(new com.google.android.gms.ads.internal.overlay.zzd((String) map.get("i"), zzc, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
        }
    }
}
