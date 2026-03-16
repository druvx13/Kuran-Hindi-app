package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaam {
    private zzaam zzcuy;
    private final List<zzaak> zzcuw = new LinkedList();
    private final Map<String, String> zzcux = new LinkedHashMap();
    private final Object lock = new Object();
    boolean zzcuv = true;

    public zzaam(boolean z, String str, String str2) {
        this.zzcux.put("action", str);
        this.zzcux.put("ad_format", str2);
    }

    public final void zzc(zzaam zzaamVar) {
        synchronized (this.lock) {
            this.zzcuy = zzaamVar;
        }
    }

    public final zzaak zzex(long j) {
        if (this.zzcuv) {
            return new zzaak(j, null, null);
        }
        return null;
    }

    public final boolean zza(zzaak zzaakVar, long j, String... strArr) {
        synchronized (this.lock) {
            for (String str : strArr) {
                this.zzcuw.add(new zzaak(j, str, zzaakVar));
            }
        }
        return true;
    }

    public final String zzrl() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.lock) {
            for (zzaak zzaakVar : this.zzcuw) {
                long time = zzaakVar.getTime();
                String zzrj = zzaakVar.zzrj();
                zzaak zzrk = zzaakVar.zzrk();
                if (zzrk != null && time > 0) {
                    sb2.append(zzrj);
                    sb2.append('.');
                    sb2.append(time - zzrk.getTime());
                    sb2.append(',');
                }
            }
            this.zzcuw.clear();
            if (!TextUtils.isEmpty(null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    public final void zzh(String str, String str2) {
        zzaac zzvv;
        if (!this.zzcuv || TextUtils.isEmpty(str2) || (zzvv = com.google.android.gms.ads.internal.zzq.zzla().zzvv()) == null) {
            return;
        }
        synchronized (this.lock) {
            zzaag zzcs = zzvv.zzcs(str);
            Map<String, String> map = this.zzcux;
            map.put(str, zzcs.zzg(map.get(str), str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zzrm() {
        synchronized (this.lock) {
            zzaac zzvv = com.google.android.gms.ads.internal.zzq.zzla().zzvv();
            if (zzvv != null && this.zzcuy != null) {
                return zzvv.zza(this.zzcux, this.zzcuy.zzrm());
            }
            return this.zzcux;
        }
    }
}
