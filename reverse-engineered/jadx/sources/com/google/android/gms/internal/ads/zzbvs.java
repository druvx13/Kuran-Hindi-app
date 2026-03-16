package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbvs extends zzbui<zzpz> implements zzpz {
    private final zzdgo zzfkd;
    private Map<View, zzpv> zzfol;
    private final Context zzvf;

    public zzbvs(Context context, Set<zzbvt<zzpz>> set, zzdgo zzdgoVar) {
        super(set);
        this.zzfol = new WeakHashMap(1);
        this.zzvf = context;
        this.zzfkd = zzdgoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final synchronized void zza(final zzqa zzqaVar) {
        zza(new zzbuk(zzqaVar) { // from class: com.google.android.gms.internal.ads.zzbvv
            private final zzqa zzfon;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfon = zzqaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                ((zzpz) obj).zza(this.zzfon);
            }
        });
    }

    public final synchronized void zzu(View view) {
        zzpv zzpvVar = this.zzfol.get(view);
        if (zzpvVar == null) {
            zzpvVar = new zzpv(this.zzvf, view);
            zzpvVar.zza(this);
            this.zzfol.put(view, zzpvVar);
        }
        if (this.zzfkd != null && this.zzfkd.zzdow) {
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcmw)).booleanValue()) {
                zzpvVar.zzen(((Long) zzvj.zzpv().zzd(zzzz.zzcmv)).longValue());
                return;
            }
        }
        zzpvVar.zzlv();
    }

    public final synchronized void zzv(View view) {
        if (this.zzfol.containsKey(view)) {
            this.zzfol.get(view).zzb(this);
            this.zzfol.remove(view);
        }
    }
}
