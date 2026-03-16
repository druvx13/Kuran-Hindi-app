package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbpy implements zzegz<zzdnx<zzdgo, zzaxr>> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzazz> zzffv;
    private final zzehm<zzdhe> zzfjq;

    public zzbpy(zzehm<Context> zzehmVar, zzehm<zzazz> zzehmVar2, zzehm<zzdhe> zzehmVar3) {
        this.zzenp = zzehmVar;
        this.zzffv = zzehmVar2;
        this.zzfjq = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        final Context context = this.zzenp.get();
        final zzazz zzazzVar = this.zzffv.get();
        final zzdhe zzdheVar = this.zzfjq.get();
        return (zzdnx) zzehf.zza(new zzdnx(context, zzazzVar, zzdheVar) { // from class: com.google.android.gms.internal.ads.zzbpz
            private final Context zzcit;
            private final zzazz zzfjl;
            private final zzdhe zzfmh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcit = context;
                this.zzfjl = zzazzVar;
                this.zzfmh = zzdheVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj) {
                Context context2 = this.zzcit;
                zzazz zzazzVar2 = this.zzfjl;
                zzdhe zzdheVar2 = this.zzfmh;
                zzdgo zzdgoVar = (zzdgo) obj;
                zzaxr zzaxrVar = new zzaxr(context2);
                zzaxrVar.zzer(zzdgoVar.zzdny);
                zzaxrVar.zzes(zzdgoVar.zzgtw.toString());
                zzaxrVar.zzac(zzazzVar2.zzbnd);
                zzaxrVar.setAdUnitId(zzdheVar2.zzgux);
                return zzaxrVar;
            }
        }, "Cannot return null from a non-@Nullable @Provides method");
    }
}
