package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfc extends zzfz {
    private static zzgc<String> zzaai = new zzgc<>();
    private final Context zzaag;

    public zzfc(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2, Context context) {
        super(zzeoVar, str, str2, c0010zza, i, 29);
        this.zzaag = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        this.zzaam.zzv("E");
        AtomicReference<String> zzar = zzaai.zzar(this.zzaag.getPackageName());
        if (zzar.get() == null) {
            synchronized (zzar) {
                if (zzar.get() == null) {
                    zzar.set((String) this.zzaaw.invoke(null, this.zzaag));
                }
            }
        }
        String str = zzar.get();
        synchronized (this.zzaam) {
            this.zzaam.zzv(zzcl.zza(str.getBytes(), true));
        }
    }
}
