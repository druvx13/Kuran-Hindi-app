package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbkg {
    private final Executor executor;
    private final String zzbnc;
    private final zzaku zzfgq;
    private zzbkp zzfgr;
    private final zzaga<Object> zzfgs = new zzbkj(this);
    private final zzaga<Object> zzfgt = new zzbkl(this);

    public zzbkg(String str, zzaku zzakuVar, Executor executor) {
        this.zzbnc = str;
        this.zzfgq = zzakuVar;
        this.executor = executor;
    }

    public final void zza(zzbkp zzbkpVar) {
        this.zzfgq.zzc("/updateActiveView", this.zzfgs);
        this.zzfgq.zzc("/untrackActiveViewUnit", this.zzfgt);
        this.zzfgr = zzbkpVar;
    }

    public final void zzd(zzbek zzbekVar) {
        zzbekVar.zza("/updateActiveView", this.zzfgs);
        zzbekVar.zza("/untrackActiveViewUnit", this.zzfgt);
    }

    public final void zze(zzbek zzbekVar) {
        zzbekVar.zzb("/updateActiveView", this.zzfgs);
        zzbekVar.zzb("/untrackActiveViewUnit", this.zzfgt);
    }

    public final void zzagl() {
        this.zzfgq.zzd("/updateActiveView", this.zzfgs);
        this.zzfgq.zzd("/untrackActiveViewUnit", this.zzfgt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzm(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.zzbnc);
    }
}
