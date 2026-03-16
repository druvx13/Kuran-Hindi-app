package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
abstract class zzefc<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, zzeaq zzeaqVar);

    abstract void zza(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(T t, zzefv zzefvVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzeee zzeeeVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzak(Object obj);

    abstract T zzaq(B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzau(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzay(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzaz(Object obj);

    abstract void zzb(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzba(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzbhg();

    abstract void zzc(B b, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(T t, zzefv zzefvVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzh(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzi(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzj(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(B b, zzeee zzeeeVar) throws IOException {
        int tag = zzeeeVar.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            zza((zzefc<T, B>) b, i, zzeeeVar.zzbda());
            return true;
        } else if (i2 == 1) {
            zzb(b, i, zzeeeVar.zzbdc());
            return true;
        } else if (i2 == 2) {
            zza((zzefc<T, B>) b, i, zzeeeVar.zzbdg());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzc(b, i, zzeeeVar.zzbdd());
                    return true;
                }
                throw zzeco.zzbfl();
            }
            return false;
        } else {
            B zzbhg = zzbhg();
            int i3 = 4 | (i << 3);
            while (zzeeeVar.zzbdw() != Integer.MAX_VALUE && zza((zzefc<T, B>) zzbhg, zzeeeVar)) {
            }
            if (i3 != zzeeeVar.getTag()) {
                throw zzeco.zzbfk();
            }
            zza((zzefc<T, B>) b, i, (int) zzaq(zzbhg));
            return true;
        }
    }
}
