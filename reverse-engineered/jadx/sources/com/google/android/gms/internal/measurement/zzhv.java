package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
/* loaded from: classes.dex */
abstract class zzhv<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zza();

    abstract T zza(B b);

    abstract void zza(B b, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, zzdu zzduVar);

    abstract void zza(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(T t, zzis zzisVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzhe zzheVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzb(Object obj);

    abstract void zzb(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(T t, zzis zzisVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzc(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzc(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzd(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zze(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzf(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(B b, zzhe zzheVar) throws IOException {
        int zzb = zzheVar.zzb();
        int i = zzb >>> 3;
        int i2 = zzb & 7;
        if (i2 == 0) {
            zza((zzhv<T, B>) b, i, zzheVar.zzg());
            return true;
        } else if (i2 == 1) {
            zzb(b, i, zzheVar.zzi());
            return true;
        } else if (i2 == 2) {
            zza((zzhv<T, B>) b, i, zzheVar.zzn());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zza((zzhv<T, B>) b, i, zzheVar.zzj());
                    return true;
                }
                throw zzfo.zzf();
            }
            return false;
        } else {
            B zza = zza();
            int i3 = 4 | (i << 3);
            while (zzheVar.zza() != Integer.MAX_VALUE && zza((zzhv<T, B>) zza, zzheVar)) {
            }
            if (i3 != zzheVar.zzb()) {
                throw zzfo.zze();
            }
            zza((zzhv<T, B>) b, i, (int) zza((zzhv<T, B>) zza));
            return true;
        }
    }
}
