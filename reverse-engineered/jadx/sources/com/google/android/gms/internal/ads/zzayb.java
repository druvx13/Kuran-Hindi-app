package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzayb extends zzak {
    private final Context zzvf;

    public static zzu zzbi(Context context) {
        zzu zzuVar = new zzu(new zzal(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzayb(context, new zzat()));
        zzuVar.start();
        return zzuVar;
    }

    private zzayb(Context context, zzah zzahVar) {
        super(zzahVar);
        this.zzvf = context;
    }

    @Override // com.google.android.gms.internal.ads.zzak, com.google.android.gms.internal.ads.zzn
    public final zzo zzc(zzq<?> zzqVar) throws zzae {
        if (zzqVar.zzh() && zzqVar.getMethod() == 0) {
            if (Pattern.matches((String) zzvj.zzpv().zzd(zzzz.zzcqb), zzqVar.getUrl())) {
                zzvj.zzpr();
                if (zzazm.zzd(this.zzvf, 13400000)) {
                    zzo zzc = new zzagu(this.zzvf).zzc(zzqVar);
                    if (zzc != null) {
                        String valueOf = String.valueOf(zzqVar.getUrl());
                        zzawr.zzeg(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return zzc;
                    }
                    String valueOf2 = String.valueOf(zzqVar.getUrl());
                    zzawr.zzeg(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.zzc(zzqVar);
    }
}
