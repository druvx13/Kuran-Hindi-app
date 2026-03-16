package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcij {
    private List<Map<String, String>> zzfzo = new ArrayList();
    private boolean zzfzp = false;
    private boolean zzfzq = false;
    private String zzfzr;
    private zzcie zzfzs;

    public zzcij(String str, zzcie zzcieVar) {
        this.zzfzr = str;
        this.zzfzs = zzcieVar;
    }

    public final synchronized void zzgh(String str) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcnj)).booleanValue()) {
            Map<String, String> zzaof = zzaof();
            zzaof.put("action", "adapter_init_started");
            zzaof.put("ancn", str);
            this.zzfzo.add(zzaof);
        }
    }

    public final synchronized void zzgi(String str) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcnj)).booleanValue()) {
            Map<String, String> zzaof = zzaof();
            zzaof.put("action", "adapter_init_finished");
            zzaof.put("ancn", str);
            this.zzfzo.add(zzaof);
        }
    }

    public final synchronized void zzr(String str, String str2) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcnj)).booleanValue()) {
            Map<String, String> zzaof = zzaof();
            zzaof.put("action", "adapter_init_finished");
            zzaof.put("ancn", str);
            zzaof.put("rqe", str2);
            this.zzfzo.add(zzaof);
        }
    }

    public final synchronized void zzaod() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcnj)).booleanValue()) {
            if (!this.zzfzp) {
                Map<String, String> zzaof = zzaof();
                zzaof.put("action", "init_started");
                this.zzfzo.add(zzaof);
                this.zzfzp = true;
            }
        }
    }

    public final synchronized void zzaoe() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcnj)).booleanValue()) {
            if (!this.zzfzq) {
                Map<String, String> zzaof = zzaof();
                zzaof.put("action", "init_finished");
                this.zzfzo.add(zzaof);
                for (Map<String, String> map : this.zzfzo) {
                    this.zzfzs.zzn(map);
                }
                this.zzfzq = true;
            }
        }
    }

    private final Map<String, String> zzaof() {
        Map<String, String> zzaob = this.zzfzs.zzaob();
        zzaob.put("tms", Long.toString(com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime(), 10));
        zzaob.put("tid", this.zzfzr);
        return zzaob;
    }
}
