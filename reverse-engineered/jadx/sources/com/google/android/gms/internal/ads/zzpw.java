package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.WeakHashMap;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzpw {
    private final zzazz zzbmo;
    private final zzajf zzboy;
    private final Context zzzo;
    private final Object lock = new Object();
    private final WeakHashMap<Object, Object> zzbow = new WeakHashMap<>();
    private final ArrayList<Object> zzbox = new ArrayList<>();

    public zzpw(Context context, zzazz zzazzVar) {
        this.zzzo = context.getApplicationContext();
        this.zzbmo = zzazzVar;
        this.zzboy = new zzajf(context.getApplicationContext(), zzazzVar, (String) zzvj.zzpv().zzd(zzzz.zzciv));
    }
}
