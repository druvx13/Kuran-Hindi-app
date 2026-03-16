package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public class zzaaz<T> {
    private final String zzcc;
    private final T zzcif;
    private final int zzcvg;

    public static zzaaz<Boolean> zzf(String str, boolean z) {
        return new zzaaz<>(str, Boolean.valueOf(z), zzabb.zzcvh);
    }

    public static zzaaz<Long> zzb(String str, long j) {
        return new zzaaz<>(str, Long.valueOf(j), zzabb.zzcvi);
    }

    public static zzaaz<Double> zzb(String str, double d) {
        return new zzaaz<>(str, Double.valueOf(d), zzabb.zzcvj);
    }

    public static zzaaz<String> zzi(String str, String str2) {
        return new zzaaz<>(str, str2, zzabb.zzcvk);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Ljava/lang/Integer;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public zzaaz(String str, Object obj, int i) {
        this.zzcc = str;
        this.zzcif = obj;
        this.zzcvg = i;
    }

    public T get() {
        zzaby zzrq = zzacb.zzrq();
        if (zzrq == null) {
            throw new IllegalStateException("Flag is not initialized.");
        }
        int i = zzaay.zzcvf[this.zzcvg - 1];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return (T) zzrq.get(this.zzcc, (String) this.zzcif);
                    }
                    throw new IllegalStateException();
                }
                return (T) zzrq.zza(this.zzcc, ((Double) this.zzcif).doubleValue());
            }
            return (T) zzrq.getLong(this.zzcc, ((Long) this.zzcif).longValue());
        }
        return (T) zzrq.zze(this.zzcc, ((Boolean) this.zzcif).booleanValue());
    }
}
