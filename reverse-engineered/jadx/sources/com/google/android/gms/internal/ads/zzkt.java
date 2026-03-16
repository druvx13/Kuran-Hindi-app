package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzkt implements zzjm, zzjr {
    private static final zzjn zzaon = new zzkw();
    private static final int zzawo = zzov.zzbj("qt  ");
    private long zzaht;
    private int zzaqj;
    private int zzaqk;
    private zzjo zzaqn;
    private int zzawr;
    private int zzaws;
    private long zzawt;
    private int zzawu;
    private zzos zzawv;
    private zzkv[] zzaww;
    private boolean zzawx;
    private final zzos zzawp = new zzos(16);
    private final Stack<zzkh> zzawq = new Stack<>();
    private final zzos zzaou = new zzos(zzon.zzbhb);
    private final zzos zzaov = new zzos(4);

    @Override // com.google.android.gms.internal.ads.zzjr
    public final boolean isSeekable() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzjm
    public final void release() {
    }

    @Override // com.google.android.gms.internal.ads.zzjm
    public final boolean zza(zzjl zzjlVar) throws IOException, InterruptedException {
        return zzky.zzd(zzjlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjm
    public final void zza(zzjo zzjoVar) {
        this.zzaqn = zzjoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjm
    public final void zzc(long j, long j2) {
        this.zzawq.clear();
        this.zzawu = 0;
        this.zzaqk = 0;
        this.zzaqj = 0;
        if (j == 0) {
            zzha();
            return;
        }
        zzkv[] zzkvVarArr = this.zzaww;
        if (zzkvVarArr != null) {
            for (zzkv zzkvVar : zzkvVarArr) {
                zzkz zzkzVar = zzkvVar.zzayd;
                int zzec = zzkzVar.zzec(j2);
                if (zzec == -1) {
                    zzec = zzkzVar.zzed(j2);
                }
                zzkvVar.zzawj = zzec;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzjm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(com.google.android.gms.internal.ads.zzjl r24, com.google.android.gms.internal.ads.zzjs r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkt.zza(com.google.android.gms.internal.ads.zzjl, com.google.android.gms.internal.ads.zzjs):int");
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final long getDurationUs() {
        return this.zzaht;
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final long zzdz(long j) {
        long j2 = Long.MAX_VALUE;
        for (zzkv zzkvVar : this.zzaww) {
            zzkz zzkzVar = zzkvVar.zzayd;
            int zzec = zzkzVar.zzec(j);
            if (zzec == -1) {
                zzec = zzkzVar.zzed(j);
            }
            long j3 = zzkzVar.zzany[zzec];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    private final void zzha() {
        this.zzawr = 0;
        this.zzawu = 0;
    }

    private final void zzeb(long j) throws zzhi {
        zzln zzlnVar;
        zzjq zzjqVar;
        zzkx zza;
        while (!this.zzawq.isEmpty() && this.zzawq.peek().zzarx == j) {
            zzkh pop = this.zzawq.pop();
            if (pop.type == zzki.zzatb) {
                long j2 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                long j3 = Long.MAX_VALUE;
                zzln zzlnVar2 = null;
                zzjq zzjqVar2 = new zzjq();
                zzkk zzan = pop.zzan(zzki.zzava);
                if (zzan != null && (zzlnVar2 = zzkj.zza(zzan, this.zzawx)) != null) {
                    zzjqVar2.zzb(zzlnVar2);
                }
                int i = 0;
                while (i < pop.zzarz.size()) {
                    zzkh zzkhVar = pop.zzarz.get(i);
                    if (zzkhVar.type == zzki.zzatd && (zza = zzkj.zza(zzkhVar, pop.zzan(zzki.zzatc), -9223372036854775807L, (zzja) null, this.zzawx)) != null) {
                        zzkz zza2 = zzkj.zza(zza, zzkhVar.zzao(zzki.zzate).zzao(zzki.zzatf).zzao(zzki.zzatg), zzjqVar2);
                        if (zza2.zzawf != 0) {
                            zzkv zzkvVar = new zzkv(zza, zza2, this.zzaqn.zzc(i, zza.type));
                            zzhf zzr = zza.zzahd.zzr(zza2.zzawl + 30);
                            if (zza.type == 1) {
                                if (zzjqVar2.zzgs()) {
                                    zzr = zzr.zzb(zzjqVar2.zzagv, zzjqVar2.zzagw);
                                }
                                if (zzlnVar2 != null) {
                                    zzr = zzr.zza(zzlnVar2);
                                }
                            }
                            zzkvVar.zzaye.zze(zzr);
                            zzlnVar = zzlnVar2;
                            zzjqVar = zzjqVar2;
                            j2 = Math.max(j2, zza.zzaht);
                            arrayList.add(zzkvVar);
                            long j4 = zza2.zzany[0];
                            if (j4 < j3) {
                                j3 = j4;
                            }
                            i++;
                            zzjqVar2 = zzjqVar;
                            zzlnVar2 = zzlnVar;
                        }
                    }
                    zzlnVar = zzlnVar2;
                    zzjqVar = zzjqVar2;
                    i++;
                    zzjqVar2 = zzjqVar;
                    zzlnVar2 = zzlnVar;
                }
                this.zzaht = j2;
                this.zzaww = (zzkv[]) arrayList.toArray(new zzkv[arrayList.size()]);
                this.zzaqn.zzgr();
                this.zzaqn.zza(this);
                this.zzawq.clear();
                this.zzawr = 2;
            } else if (!this.zzawq.isEmpty()) {
                this.zzawq.peek().zzarz.add(pop);
            }
        }
        if (this.zzawr != 2) {
            zzha();
        }
    }
}
