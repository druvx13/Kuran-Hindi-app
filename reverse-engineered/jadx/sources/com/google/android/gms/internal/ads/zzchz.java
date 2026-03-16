package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzchz {
    private final Executor executor;
    private final zzcie zzfyx;
    private final Map<String, String> zzfzb;

    public zzchz(zzcie zzcieVar, Executor executor) {
        this.zzfyx = zzcieVar;
        this.zzfzb = zzcieVar.zzaob();
        this.executor = executor;
    }

    public final zzchy zzaoa() {
        return zzchy.zza(new zzchy(this));
    }
}
