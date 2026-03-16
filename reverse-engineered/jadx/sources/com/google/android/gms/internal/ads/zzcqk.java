package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcqk {
    private final zzchz zzfiq;
    private final zzcfu zzfxs;
    private final zzdhm zzfyt;

    public zzcqk(zzdhm zzdhmVar, zzcfu zzcfuVar, zzchz zzchzVar) {
        this.zzfyt = zzdhmVar;
        this.zzfxs = zzcfuVar;
        this.zzfiq = zzchzVar;
    }

    public final void zza(zzdgq zzdgqVar, zzdgo zzdgoVar, int i, @Nullable zzcnn zzcnnVar, long j) {
        zzcfv zzcfvVar;
        zzchy zzq = this.zzfiq.zzaoa().zza(zzdgqVar).zzc(zzdgoVar).zzq("action", "adapter_status").zzq("adapter_l", String.valueOf(j));
        zzq.zzq("sc", Integer.toString(i));
        if (zzcnnVar != null) {
            zzq.zzq("arec", Integer.toString(zzcnnVar.zzapd()));
            String zzgs = this.zzfyt.zzgs(zzcnnVar.getMessage());
            if (zzgs != null) {
                zzq.zzq("areec", zzgs);
            }
        }
        zzcfu zzcfuVar = this.zzfxs;
        Iterator<String> it = zzdgoVar.zzgts.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzcfvVar = null;
                break;
            }
            zzcfvVar = zzcfuVar.zzge(it.next());
            if (zzcfvVar != null) {
                break;
            }
        }
        if (zzcfvVar != null) {
            zzq.zzq("ancn", zzcfvVar.zzdbg);
            if (zzcfvVar.zzfxp != null) {
                zzq.zzq("adapter_v", zzcfvVar.zzfxp.toString());
            }
            if (zzcfvVar.zzfxq != null) {
                zzq.zzq("adapter_sv", zzcfvVar.zzfxq.toString());
            }
        }
        zzq.zzany();
    }
}
