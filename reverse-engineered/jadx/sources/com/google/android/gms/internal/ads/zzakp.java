package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzakp {
    private static final zzayf<zzais> zzddx = new zzako();
    private static final zzayf<zzais> zzddy = new zzakr();
    private final zzajf zzddz;

    public zzakp(Context context, zzazz zzazzVar, String str) {
        this.zzddz = new zzajf(context, zzazzVar, str, zzddx, zzddy);
    }

    public final <I, O> zzakh<I, O> zza(String str, zzaki<I> zzakiVar, zzakj<O> zzakjVar) {
        return new zzakq(this.zzddz, str, zzakiVar, zzakjVar);
    }

    public final zzaku zztc() {
        return new zzaku(this.zzddz);
    }
}
