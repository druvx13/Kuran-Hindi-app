package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zztf;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdin implements zzdio {
    private final ConcurrentHashMap<zzdiy, zzdil> zzgwg;
    private zzdir zzgwh;
    private zzdip zzgwi = new zzdip();

    public zzdin(zzdir zzdirVar) {
        this.zzgwg = new ConcurrentHashMap<>(zzdirVar.zzgww);
        this.zzgwh = zzdirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdio
    public final synchronized zzdiv<?> zza(zzdiy zzdiyVar) {
        zzdiv<?> zzdivVar;
        zzdil zzdilVar = this.zzgwg.get(zzdiyVar);
        zzdivVar = null;
        if (zzdilVar != null) {
            zzdivVar = zzdilVar.zzask();
            if (zzdivVar == null) {
                this.zzgwi.zzast();
            }
            zza(zzdivVar, zzdilVar.zzaso());
        } else {
            this.zzgwi.zzass();
            zza((zzdiv<?>) null, (zzdjl) null);
        }
        return zzdivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdio
    public final synchronized boolean zza(zzdiy zzdiyVar, zzdiv<?> zzdivVar) {
        boolean zzb;
        zzdil zzdilVar = this.zzgwg.get(zzdiyVar);
        zzdivVar.zzgxv = com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis();
        if (zzdilVar == null) {
            zzdilVar = new zzdil(this.zzgwh.zzgww, this.zzgwh.zzgwx * 1000);
            if (this.zzgwg.size() == this.zzgwh.zzgwv) {
                int i = zzdiq.zzgwp[this.zzgwh.zzgxa - 1];
                long j = Long.MAX_VALUE;
                zzdiy zzdiyVar2 = null;
                if (i == 1) {
                    for (Map.Entry<zzdiy, zzdil> entry : this.zzgwg.entrySet()) {
                        if (entry.getValue().getCreationTimeMillis() < j) {
                            j = entry.getValue().getCreationTimeMillis();
                            zzdiyVar2 = entry.getKey();
                        }
                    }
                    if (zzdiyVar2 != null) {
                        this.zzgwg.remove(zzdiyVar2);
                    }
                } else if (i == 2) {
                    for (Map.Entry<zzdiy, zzdil> entry2 : this.zzgwg.entrySet()) {
                        if (entry2.getValue().zzasl() < j) {
                            j = entry2.getValue().zzasl();
                            zzdiyVar2 = entry2.getKey();
                        }
                    }
                    if (zzdiyVar2 != null) {
                        this.zzgwg.remove(zzdiyVar2);
                    }
                } else if (i == 3) {
                    int i2 = Integer.MAX_VALUE;
                    for (Map.Entry<zzdiy, zzdil> entry3 : this.zzgwg.entrySet()) {
                        if (entry3.getValue().zzasm() < i2) {
                            i2 = entry3.getValue().zzasm();
                            zzdiyVar2 = entry3.getKey();
                        }
                    }
                    if (zzdiyVar2 != null) {
                        this.zzgwg.remove(zzdiyVar2);
                    }
                }
                this.zzgwi.zzasv();
            }
            this.zzgwg.put(zzdiyVar, zzdilVar);
            this.zzgwi.zzasu();
        }
        zzb = zzdilVar.zzb(zzdivVar);
        this.zzgwi.zzasw();
        zzdis zzasx = this.zzgwi.zzasx();
        zzdjl zzaso = zzdilVar.zzaso();
        if (zzdivVar != null) {
            zzdivVar.zzgxt.zzaij().zzd((zztf.zzb) ((zzecd) zztf.zzb.zznf().zza(zztf.zzb.zza.zznh().zza(zztf.zzb.EnumC0027zzb.IN_MEMORY).zza(zztf.zzb.zze.zznl().zzs(zzasx.zzgxd).zzt(zzasx.zzgxe).zzbx(zzaso.zzgym))).zzbet()));
        }
        dumpToLog();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdio
    public final synchronized boolean zzb(zzdiy zzdiyVar) {
        zzdil zzdilVar = this.zzgwg.get(zzdiyVar);
        if (zzdilVar != null) {
            return zzdilVar.size() < this.zzgwh.zzgww;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdio
    @Deprecated
    public final zzdiy zza(zzuj zzujVar, String str, zzut zzutVar) {
        return new zzdix(zzujVar, str, new zzarr(this.zzgwh.zzvf).zzvb().zzdpy, this.zzgwh.zzgwy, zzutVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdio
    public final zzdir zzasr() {
        return this.zzgwh;
    }

    private final void zza(zzdiv<?> zzdivVar, zzdjl zzdjlVar) {
        if (zzdivVar != null) {
            zzdivVar.zzgxt.zzaij().zzc((zztf.zzb) ((zzecd) zztf.zzb.zznf().zza(zztf.zzb.zza.zznh().zza(zztf.zzb.EnumC0027zzb.IN_MEMORY).zza(zztf.zzb.zzd.zznj().zzq(zzdjlVar.zzgyl).zzbv(zzdjlVar.zzgym))).zzbet()));
        }
        dumpToLog();
    }

    private final void dumpToLog() {
        if (zzdir.zzasz()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzgwh.zzgwu);
            sb.append(" PoolCollection");
            sb.append(this.zzgwi.zzasy());
            int i = 0;
            for (Map.Entry<zzdiy, zzdil> entry : this.zzgwg.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(entry.getKey().hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < entry.getValue().size(); i2++) {
                    sb.append("[O]");
                }
                for (int size = entry.getValue().size(); size < this.zzgwh.zzgww; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(entry.getValue().zzasn());
                sb.append("\n");
            }
            while (i < this.zzgwh.zzgwv) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzawr.zzed(sb.toString());
        }
    }
}
