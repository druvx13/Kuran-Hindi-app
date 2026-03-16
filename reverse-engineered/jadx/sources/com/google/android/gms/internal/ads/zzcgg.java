package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zztf;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcgg implements zzegz<zzst> {
    private final zzehm<Context> zzenp;
    private final zzehm<zztf.zza.EnumC0025zza> zzfic;
    private final zzehm<String> zzfmo;
    private final zzehm<zzazz> zzfnd;
    private final zzehm<String> zzfxx;

    private zzcgg(zzehm<Context> zzehmVar, zzehm<String> zzehmVar2, zzehm<zzazz> zzehmVar3, zzehm<zztf.zza.EnumC0025zza> zzehmVar4, zzehm<String> zzehmVar5) {
        this.zzenp = zzehmVar;
        this.zzfmo = zzehmVar2;
        this.zzfnd = zzehmVar3;
        this.zzfic = zzehmVar4;
        this.zzfxx = zzehmVar5;
    }

    public static zzcgg zze(zzehm<Context> zzehmVar, zzehm<String> zzehmVar2, zzehm<zzazz> zzehmVar3, zzehm<zztf.zza.EnumC0025zza> zzehmVar4, zzehm<String> zzehmVar5) {
        return new zzcgg(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        final String str = this.zzfmo.get();
        zzazz zzazzVar = this.zzfnd.get();
        final zztf.zza.EnumC0025zza enumC0025zza = this.zzfic.get();
        final String str2 = this.zzfxx.get();
        zzst zzstVar = new zzst(new zzsy(this.zzenp.get()));
        final zztf.zzu zzuVar = (zztf.zzu) ((zzecd) zztf.zzu.zzos().zzcn(zzazzVar.zzdzn).zzco(zzazzVar.zzdzo).zzcp(zzazzVar.zzdzp ? 0 : 2).zzbet());
        zzstVar.zza(new zzsw(enumC0025zza, str, zzuVar, str2) { // from class: com.google.android.gms.internal.ads.zzcgh
            private final String zzdbv;
            private final zztf.zza.EnumC0025zza zzfxy;
            private final zztf.zzu zzfxz;
            private final String zzfya;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxy = enumC0025zza;
                this.zzdbv = str;
                this.zzfxz = zzuVar;
                this.zzfya = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzsw
            public final void zza(zztf.zzi.zza zzaVar) {
                zztf.zza.EnumC0025zza enumC0025zza2 = this.zzfxy;
                String str3 = this.zzdbv;
                zztf.zzu zzuVar2 = this.zzfxz;
                zzaVar.zza(zzaVar.zzny().zzbew().zzb(enumC0025zza2)).zza(zzaVar.zznx().zzbew().zzby(str3).zzb(zzuVar2)).zzca(this.zzfya);
            }
        });
        return (zzst) zzehf.zza(zzstVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
