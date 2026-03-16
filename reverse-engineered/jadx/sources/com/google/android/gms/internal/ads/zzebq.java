package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.internal.ads.zzecd;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public class zzebq {
    private static volatile boolean zzhun = false;
    private static boolean zzhuo = true;
    private static volatile zzebq zzhup;
    private static volatile zzebq zzhuq;
    private static final zzebq zzhur = new zzebq(true);
    private final Map<zza, zzecd.zzd<?, ?>> zzhus;

    public static zzebq zzbec() {
        zzebq zzebqVar = zzhup;
        if (zzebqVar == null) {
            synchronized (zzebq.class) {
                zzebqVar = zzhup;
                if (zzebqVar == null) {
                    zzebqVar = zzhur;
                    zzhup = zzebqVar;
                }
            }
        }
        return zzebqVar;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    static final class zza {
        private final int number;
        private final Object object;

        zza(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * SupportMenu.USER_MASK) + this.number;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                return this.object == zzaVar.object && this.number == zzaVar.number;
            }
            return false;
        }
    }

    public static zzebq zzbed() {
        zzebq zzebqVar = zzhuq;
        if (zzebqVar != null) {
            return zzebqVar;
        }
        synchronized (zzebq.class) {
            zzebq zzebqVar2 = zzhuq;
            if (zzebqVar2 != null) {
                return zzebqVar2;
            }
            zzebq zze = zzecc.zze(zzebq.class);
            zzhuq = zze;
            return zze;
        }
    }

    public final <ContainingType extends zzedo> zzecd.zzd<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzecd.zzd<ContainingType, ?>) this.zzhus.get(new zza(containingtype, i));
    }

    zzebq() {
        this.zzhus = new HashMap();
    }

    private zzebq(boolean z) {
        this.zzhus = Collections.emptyMap();
    }
}
