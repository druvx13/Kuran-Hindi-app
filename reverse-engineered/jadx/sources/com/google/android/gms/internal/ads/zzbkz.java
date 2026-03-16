package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbkz implements zzegz<Set<zzbvt<com.google.android.gms.ads.internal.overlay.zzo>>> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzbkp> zzfhv;
    private final zzehm<JSONObject> zzfhw;

    private zzbkz(zzehm<zzbkp> zzehmVar, zzehm<Executor> zzehmVar2, zzehm<JSONObject> zzehmVar3) {
        this.zzfhv = zzehmVar;
        this.zzenm = zzehmVar2;
        this.zzfhw = zzehmVar3;
    }

    public static zzbkz zze(zzehm<zzbkp> zzehmVar, zzehm<Executor> zzehmVar2, zzehm<JSONObject> zzehmVar3) {
        return new zzbkz(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        Set singleton;
        zzbkp zzbkpVar = this.zzfhv.get();
        Executor executor = this.zzenm.get();
        if (this.zzfhw.get() == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new zzbvt(zzbkpVar, executor));
        }
        return (Set) zzehf.zza(singleton, "Cannot return null from a non-@Nullable @Provides method");
    }
}
