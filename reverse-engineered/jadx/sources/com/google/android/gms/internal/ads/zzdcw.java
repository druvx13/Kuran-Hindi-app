package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdcw implements zzegz<zzdaj<JSONObject>> {
    public static zzdaj<JSONObject> zza(zzavv zzavvVar, Object obj, zzdbe zzdbeVar, zzdcb zzdcbVar, zzegt<zzday> zzegtVar, zzegt<zzdbi> zzegtVar2, zzegt<zzdbm> zzegtVar3, zzegt<zzdbs> zzegtVar4, zzegt<zzdbx> zzegtVar5, zzegt<zzdcg> zzegtVar6, zzegt<zzdck> zzegtVar7, zzegt<zzdcy> zzegtVar8, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzdbt) obj);
        hashSet.add(zzdbeVar);
        hashSet.add(zzdcbVar);
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsa)).booleanValue()) {
            hashSet.add(zzegtVar.get());
        }
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsb)).booleanValue()) {
            hashSet.add(zzegtVar2.get());
        }
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsc)).booleanValue()) {
            hashSet.add(zzegtVar3.get());
        }
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsd)).booleanValue()) {
            hashSet.add(zzegtVar4.get());
        }
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsh)).booleanValue()) {
            hashSet.add(new zzcyv(zzegtVar6.get(), ((Long) zzvj.zzpv().zzd(zzzz.zzcpg)).longValue(), scheduledExecutorService));
        }
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsj)).booleanValue()) {
            hashSet.add(zzegtVar7.get());
        }
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsk)).booleanValue()) {
            hashSet.add(zzegtVar8.get());
        }
        return (zzdaj) zzehf.zza(new zzdaj(executor, hashSet), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        throw new NoSuchMethodError();
    }
}
