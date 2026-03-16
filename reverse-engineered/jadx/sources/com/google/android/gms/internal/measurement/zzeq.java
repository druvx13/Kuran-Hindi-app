package com.google.android.gms.internal.measurement;

import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.internal.measurement.zzfd;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
/* loaded from: classes.dex */
public class zzeq {
    private static volatile boolean zza = false;
    private static boolean zzb = true;
    private static volatile zzeq zzc;
    private static volatile zzeq zzd;
    private static final zzeq zze = new zzeq(true);
    private final Map<zza, zzfd.zzf<?, ?>> zzf;

    public static zzeq zza() {
        zzeq zzeqVar = zzc;
        if (zzeqVar == null) {
            synchronized (zzeq.class) {
                zzeqVar = zzc;
                if (zzeqVar == null) {
                    zzeqVar = zze;
                    zzc = zzeqVar;
                }
            }
        }
        return zzeqVar;
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
    /* loaded from: classes.dex */
    static final class zza {
        private final Object zza;
        private final int zzb;

        zza(Object obj, int i) {
            this.zza = obj;
            this.zzb = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * SupportMenu.USER_MASK) + this.zzb;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                return this.zza == zzaVar.zza && this.zzb == zzaVar.zzb;
            }
            return false;
        }
    }

    public static zzeq zzb() {
        zzeq zzeqVar = zzd;
        if (zzeqVar != null) {
            return zzeqVar;
        }
        synchronized (zzeq.class) {
            zzeq zzeqVar2 = zzd;
            if (zzeqVar2 != null) {
                return zzeqVar2;
            }
            zzeq zza2 = zzfb.zza(zzeq.class);
            zzd = zza2;
            return zza2;
        }
    }

    public final <ContainingType extends zzgo> zzfd.zzf<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzfd.zzf<ContainingType, ?>) this.zzf.get(new zza(containingtype, i));
    }

    zzeq() {
        this.zzf = new HashMap();
    }

    private zzeq(boolean z) {
        this.zzf = Collections.emptyMap();
    }
}
