package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbic extends zzdbc {
    private zzehm<String> zzeqh;
    private zzehm<zzchl> zzeqx;
    private zzehm<Map<zzdkr, zzchl>> zzeqz;
    private zzehm<Set<zzbvt<zzdla>>> zzerb;
    private zzehm<Set<zzbvt<zzdla>>> zzeri;
    private zzehm zzerj;
    private zzehm<zzdku> zzerk;
    private zzehm<ApplicationInfo> zzeru;
    private zzehm<zzdcg> zzesz;
    private final /* synthetic */ zzbhw zzewb;
    private final zzdcl zzezu;
    private zzehm<zzday> zzezv;
    private zzehm<String> zzezw;
    private zzehm<zzdbi> zzezx;
    private zzehm<Integer> zzezy;
    private zzehm<zzdbm> zzezz;
    private zzehm<zzdbs> zzfaa;
    private zzehm<zzdbx> zzfab;
    private zzehm<Boolean> zzfac;
    private zzehm<zzdck> zzfad;
    private zzehm<zzdcy> zzfae;
    private zzehm<zzchl> zzfaf;
    private zzehm<zzchl> zzfag;
    private zzehm<zzchl> zzfah;

    private zzbic(zzbhw zzbhwVar, zzdcl zzdclVar) {
        zzbjq zzbjqVar;
        zzehm zzehmVar;
        zzehm zzehmVar2;
        zzbho zzbhoVar;
        zzehm zzehmVar3;
        zzbjq zzbjqVar2;
        zzehm zzehmVar4;
        zzehm zzehmVar5;
        zzehm zzehmVar6;
        zzbjk zzbjkVar;
        zzehm zzehmVar7;
        zzbjm zzbjmVar;
        zzehm zzehmVar8;
        zzehm zzehmVar9;
        zzbjo zzbjoVar;
        zzehm zzehmVar10;
        zzehm zzehmVar11;
        zzehm zzehmVar12;
        zzehm zzehmVar13;
        this.zzewb = zzbhwVar;
        this.zzezu = zzdclVar;
        zzbjqVar = zzbjt.zzfgf;
        zzehmVar = this.zzewb.zzeoa;
        zzehmVar2 = this.zzewb.zzenv;
        this.zzezv = new zzdaz(zzbjqVar, zzehmVar, zzehmVar2, zzdjt.zzatr());
        this.zzezw = new zzdco(zzdclVar);
        zzbhoVar = zzbhn.zzenn;
        zzehmVar3 = this.zzewb.zzeoa;
        this.zzezx = new zzdbk(zzbhoVar, zzehmVar3, this.zzezw, zzdjt.zzatr());
        this.zzezy = new zzdcp(zzdclVar);
        zzbjqVar2 = zzbjt.zzfgf;
        zzehm<Integer> zzehmVar14 = this.zzezy;
        zzehmVar4 = this.zzewb.zzeoa;
        zzehmVar5 = this.zzewb.zzeot;
        zzehmVar6 = this.zzewb.zzenv;
        this.zzezz = new zzdbq(zzbjqVar2, zzehmVar14, zzehmVar4, zzehmVar5, zzehmVar6, zzdjt.zzatr());
        zzbjkVar = zzbjn.zzfgb;
        zzdjt zzatr = zzdjt.zzatr();
        zzehmVar7 = this.zzewb.zzeoa;
        this.zzfaa = new zzdbu(zzbjkVar, zzatr, zzehmVar7);
        zzbjmVar = zzbjp.zzfgc;
        this.zzfab = new zzdbz(zzbjmVar, zzdjt.zzatr(), this.zzezw);
        this.zzfac = new zzdcq(zzdclVar);
        this.zzeru = new zzdcn(zzdclVar);
        zzehmVar8 = this.zzewb.zzeov;
        zzehmVar9 = this.zzewb.zzenv;
        this.zzesz = new zzdci(zzehmVar8, zzehmVar9, this.zzfac, this.zzeru);
        zzbjoVar = zzbjr.zzfgd;
        zzehmVar10 = this.zzewb.zzenv;
        zzehmVar11 = this.zzewb.zzeoa;
        this.zzfad = new zzdcm(zzbjoVar, zzehmVar10, zzehmVar11);
        this.zzfae = new zzdda(zzdjt.zzatr());
        this.zzeqh = new zzdcs(zzdclVar);
        this.zzeqx = zzeha.zzar(zzcha.zzann());
        this.zzfaf = zzeha.zzar(zzcgy.zzanm());
        this.zzfag = zzeha.zzar(zzchc.zzanp());
        this.zzfah = zzeha.zzar(zzche.zzanr());
        this.zzeqz = ((zzehd) ((zzehd) ((zzehd) ((zzehd) zzehb.zzhw(4).zza(zzdkr.GMS_SIGNALS, this.zzeqx)).zza(zzdkr.BUILD_URL, this.zzfaf)).zza(zzdkr.HTTP, this.zzfag)).zza(zzdkr.PRE_PROCESS, this.zzfah)).zzbis();
        zzehm<String> zzehmVar15 = this.zzeqh;
        zzehmVar12 = this.zzewb.zzeoa;
        this.zzerb = zzeha.zzar(new zzchg(zzehmVar15, zzehmVar12, zzdjt.zzatr(), this.zzeqz));
        zzehi zzbit = zzehi.zzar(0, 1).zzau(this.zzerb).zzbit();
        this.zzeri = zzbit;
        this.zzerj = zzdlc.zzaq(zzbit);
        zzdjt zzatr2 = zzdjt.zzatr();
        zzehmVar13 = this.zzewb.zzenv;
        this.zzerk = zzeha.zzar(zzdkz.zzv(zzatr2, zzehmVar13, this.zzerj));
    }

    private final zzdcb zzaet() {
        return new zzdcb((zzzi) zzehf.zza(new zzzi(), "Cannot return null from a non-@Nullable @Provides method"), zzdjt.zzats(), (List) zzehf.zza(this.zzezu.zzaqz(), "Cannot return null from a non-@Nullable @Provides method"));
    }

    private final zzdbe zzaeu() {
        return new zzdbe(zzbjq.zzagi(), zzdjt.zzats(), (String) zzehf.zza(this.zzezu.zzaqw(), "Cannot return null from a non-@Nullable @Provides method"), this.zzezu.zzaqx());
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final zzdaj<JSONObject> zzaev() {
        zzehm zzehmVar;
        zzbiv zzbivVar;
        zzehm zzehmVar2;
        zzehm zzehmVar3;
        zzehm zzehmVar4;
        zzbhb zzbhbVar;
        zzehm zzehmVar5;
        zzbhb zzbhbVar2;
        zzehm zzehmVar6;
        zzehm zzehmVar7;
        zzehm zzehmVar8;
        zzbhb zzbhbVar3;
        zzbhb zzbhbVar4;
        zzbhb zzbhbVar5;
        zzehm zzehmVar9;
        zzehm zzehmVar10;
        zzehm zzehmVar11;
        zzdrh zzats = zzdjt.zzats();
        zzdbx zzdbxVar = new zzdbx(zzbjm.zzage(), zzdjt.zzats(), zzdco.zzc(this.zzezu));
        zzehmVar = this.zzewb.zzenv;
        zzdak zzdakVar = (zzdak) zzehf.zza(new zzcyv(zzdbxVar, 0L, (ScheduledExecutorService) zzehmVar.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzbivVar = this.zzewb.zzenr;
        zzalc zzb = zzbiz.zzb(zzbivVar);
        zzehmVar2 = this.zzewb.zzenv;
        zzdcg zzdcgVar = new zzdcg(zzb, (ScheduledExecutorService) zzehmVar2.get(), this.zzezu.zzaqy(), zzdcn.zzb(this.zzezu));
        zzehmVar3 = this.zzewb.zzenv;
        zzdak zzdakVar2 = (zzdak) zzehf.zza(new zzcyv(zzdcgVar, ((Long) zzvj.zzpv().zzd(zzzz.zzcpg)).longValue(), (ScheduledExecutorService) zzehmVar3.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzapj zzagg = zzbjo.zzagg();
        zzehmVar4 = this.zzewb.zzenv;
        zzbhbVar = this.zzewb.zzens;
        zzdck zzdckVar = new zzdck(zzagg, (ScheduledExecutorService) zzehmVar4.get(), zzbhe.zza(zzbhbVar));
        zzehmVar5 = this.zzewb.zzenv;
        zzdak zzdakVar3 = (zzdak) zzehf.zza(new zzcyv(zzdckVar, ((Long) zzvj.zzpv().zzd(zzzz.zzcpo)).longValue(), (ScheduledExecutorService) zzehmVar5.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzavz zzagi = zzbjq.zzagi();
        zzbhbVar2 = this.zzewb.zzens;
        Context zza = zzbhe.zza(zzbhbVar2);
        zzehmVar6 = this.zzewb.zzenv;
        zzday zzdayVar = new zzday(zzagi, zza, (ScheduledExecutorService) zzehmVar6.get(), zzdjt.zzats());
        zzehmVar7 = this.zzewb.zzenv;
        zzdak zzdakVar4 = (zzdak) zzehf.zza(new zzcyv(zzdayVar, 0L, (ScheduledExecutorService) zzehmVar7.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzdcy zzdcyVar = new zzdcy(zzdjt.zzats());
        zzehmVar8 = this.zzewb.zzenv;
        zzdak zzdakVar5 = (zzdak) zzehf.zza(new zzcyv(zzdcyVar, 0L, (ScheduledExecutorService) zzehmVar8.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzdak zzdakVar6 = (zzdak) zzehf.zza(zzdcr.zzard(), "Cannot return null from a non-@Nullable @Provides method");
        zzbhbVar3 = this.zzewb.zzens;
        zzsm zzagc = zzbjk.zzagc();
        zzdrh zzats2 = zzdjt.zzats();
        zzbhbVar4 = this.zzewb.zzens;
        zzavz zzagi2 = zzbjq.zzagi();
        int zzarc = this.zzezu.zzarc();
        zzbhbVar5 = this.zzewb.zzens;
        Context zza2 = zzbhe.zza(zzbhbVar5);
        zzehmVar9 = this.zzewb.zzeot;
        zzawd zzawdVar = (zzawd) zzehmVar9.get();
        zzehmVar10 = this.zzewb.zzenv;
        zzehmVar11 = this.zzewb.zzeou;
        return zzdao.zza(zzats, zzdpb.zza(zzdakVar, zzdakVar2, zzdakVar3, zzdakVar4, zzdakVar5, zzdakVar6, new zzdbi(null, zzbhe.zza(zzbhbVar3), zzdco.zzc(this.zzezu), zzdjt.zzats()), new zzdbs(zzagc, zzats2, zzbhe.zza(zzbhbVar4)), zzaet(), zzaeu(), new zzdbm(zzagi2, zzarc, zza2, zzawdVar, (ScheduledExecutorService) zzehmVar10.get(), zzdjt.zzats()), (zzdak) zzehmVar11.get()));
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final zzdaj<JSONObject> zzaew() {
        zzehm zzehmVar;
        zzehm zzehmVar2;
        zzavy zzage = zzbjm.zzage();
        zzehmVar = this.zzewb.zzeou;
        Object obj = zzehmVar.get();
        zzdbe zzaeu = zzaeu();
        zzdcb zzaet = zzaet();
        zzegt zzas = zzeha.zzas(this.zzezv);
        zzegt zzas2 = zzeha.zzas(this.zzezx);
        zzegt zzas3 = zzeha.zzas(this.zzezz);
        zzegt zzas4 = zzeha.zzas(this.zzfaa);
        zzegt zzas5 = zzeha.zzas(this.zzfab);
        zzegt zzas6 = zzeha.zzas(this.zzesz);
        zzegt zzas7 = zzeha.zzas(this.zzfad);
        zzegt zzas8 = zzeha.zzas(this.zzfae);
        zzdrh zzats = zzdjt.zzats();
        zzehmVar2 = this.zzewb.zzenv;
        return zzdcw.zza(zzage, obj, zzaeu, zzaet, zzas, zzas2, zzas3, zzas4, zzas5, zzas6, zzas7, zzas8, zzats, (ScheduledExecutorService) zzehmVar2.get());
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final zzdku zzaex() {
        return this.zzerk.get();
    }
}
