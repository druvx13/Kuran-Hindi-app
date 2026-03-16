package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zztf;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzchg implements zzegz<Set<zzbvt<zzdla>>> {
    private final zzehm<Executor> zzenm;
    private final zzehm<Context> zzenp;
    private final zzehm<String> zzfyk;
    private final zzehm<Map<zzdkr, zzchl>> zzfyl;

    public zzchg(zzehm<String> zzehmVar, zzehm<Context> zzehmVar2, zzehm<Executor> zzehmVar3, zzehm<Map<zzdkr, zzchl>> zzehmVar4) {
        this.zzfyk = zzehmVar;
        this.zzenp = zzehmVar2;
        this.zzenm = zzehmVar3;
        this.zzfyl = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        Set emptySet;
        final String str = this.zzfyk.get();
        Context context = this.zzenp.get();
        Executor executor = this.zzenm.get();
        Map<zzdkr, zzchl> map = this.zzfyl.get();
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcqq)).booleanValue()) {
            zzst zzstVar = new zzst(new zzsy(context));
            zzstVar.zza(new zzsw(str) { // from class: com.google.android.gms.internal.ads.zzchi
                private final String zzdcd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdcd = str;
                }

                @Override // com.google.android.gms.internal.ads.zzsw
                public final void zza(zztf.zzi.zza zzaVar) {
                    zzaVar.zzca(this.zzdcd);
                }
            });
            emptySet = Collections.singleton(new zzbvt(new zzchj(zzstVar, map), executor));
        } else {
            emptySet = Collections.emptySet();
        }
        return (Set) zzehf.zza(emptySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}
