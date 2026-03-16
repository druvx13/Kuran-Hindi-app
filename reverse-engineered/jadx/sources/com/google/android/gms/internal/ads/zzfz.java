package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzfz implements Callable {
    private final String TAG = getClass().getSimpleName();
    private final String className;
    protected final zzbv.zza.C0010zza zzaam;
    private final String zzaau;
    protected Method zzaaw;
    private final int zzaaz;
    private final int zzaba;
    protected final zzeo zzvp;

    public zzfz(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2) {
        this.zzvp = zzeoVar;
        this.className = str;
        this.zzaau = str2;
        this.zzaam = c0010zza;
        this.zzaaz = i;
        this.zzaba = i2;
    }

    protected abstract void zzcx() throws IllegalAccessException, InvocationTargetException;

    @Override // java.util.concurrent.Callable
    /* renamed from: zzcz */
    public Void call() throws Exception {
        long nanoTime;
        Method zza;
        try {
            nanoTime = System.nanoTime();
            zza = this.zzvp.zza(this.className, this.zzaau);
            this.zzaaw = zza;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zza == null) {
            return null;
        }
        zzcx();
        zzdh zzcm = this.zzvp.zzcm();
        if (zzcm != null && this.zzaaz != Integer.MIN_VALUE) {
            zzcm.zza(this.zzaba, this.zzaaz, (System.nanoTime() - nanoTime) / 1000);
        }
        return null;
    }
}
