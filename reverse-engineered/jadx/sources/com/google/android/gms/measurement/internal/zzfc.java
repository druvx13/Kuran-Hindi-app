package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzfc<V> {
    private static final Object zzf = new Object();
    private final String zza;
    private final zzfa<V> zzb;
    private final V zzc;
    private final V zzd;
    private final Object zze;
    private volatile V zzg;
    private volatile V zzh;

    private zzfc(String str, V v, V v2, zzfa<V> zzfaVar) {
        this.zze = new Object();
        this.zzg = null;
        this.zzh = null;
        this.zza = str;
        this.zzc = v;
        this.zzd = v2;
        this.zzb = zzfaVar;
    }

    public final String zza() {
        return this.zza;
    }

    public final V zza(V v) {
        synchronized (this.zze) {
        }
        if (v != null) {
            return v;
        }
        if (zzez.zza == null) {
            return this.zzc;
        }
        zzw zzwVar = zzez.zza;
        synchronized (zzf) {
            if (zzw.zza()) {
                return this.zzh == null ? this.zzc : this.zzh;
            }
            try {
                for (zzfc zzfcVar : zzap.zzdh()) {
                    if (zzw.zza()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V v2 = null;
                    try {
                        if (zzfcVar.zzb != null) {
                            v2 = zzfcVar.zzb.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (zzf) {
                        zzfcVar.zzh = v2;
                    }
                }
            } catch (SecurityException unused2) {
            }
            zzfa<V> zzfaVar = this.zzb;
            if (zzfaVar == null) {
                zzw zzwVar2 = zzez.zza;
                return this.zzc;
            }
            try {
                return zzfaVar.zza();
            } catch (IllegalStateException unused3) {
                zzw zzwVar3 = zzez.zza;
                return this.zzc;
            } catch (SecurityException unused4) {
                zzw zzwVar4 = zzez.zza;
                return this.zzc;
            }
        }
    }
}
