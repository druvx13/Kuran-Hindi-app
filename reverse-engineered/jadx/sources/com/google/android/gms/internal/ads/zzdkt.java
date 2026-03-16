package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdkt extends zzbui<zzdla> implements zzdks<zzdkr> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdkt(Set<zzbvt<zzdla>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zza(final zzdkd<zzdkr, ?> zzdkdVar) {
        zza(new zzbuk(zzdkdVar) { // from class: com.google.android.gms.internal.ads.zzdkw
            private final zzdkd zzham;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzham = zzdkdVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                zzdkd zzdkdVar2 = this.zzham;
                ((zzdla) obj).zza((zzdkr) zzdkdVar2.zzaua(), zzdkdVar2.zzaub());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzb(final zzdkd<zzdkr, ?> zzdkdVar) {
        zza(new zzbuk(zzdkdVar) { // from class: com.google.android.gms.internal.ads.zzdkv
            private final zzdkd zzham;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzham = zzdkdVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                zzdkd zzdkdVar2 = this.zzham;
                ((zzdla) obj).zzb((zzdkr) zzdkdVar2.zzaua(), zzdkdVar2.zzaub());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zza(final zzdkd<zzdkr, ?> zzdkdVar, final Throwable th) {
        zza(new zzbuk(zzdkdVar, th) { // from class: com.google.android.gms.internal.ads.zzdky
            private final zzdkd zzham;
            private final Throwable zzhan;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzham = zzdkdVar;
                this.zzhan = th;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                zzdkd zzdkdVar2 = this.zzham;
                ((zzdla) obj).zza((zzdkr) zzdkdVar2.zzaua(), zzdkdVar2.zzaub(), this.zzhan);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdks
    public final void zzc(final zzdkd<zzdkr, ?> zzdkdVar) {
        zza(new zzbuk(zzdkdVar) { // from class: com.google.android.gms.internal.ads.zzdkx
            private final zzdkd zzham;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzham = zzdkdVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                zzdkd zzdkdVar2 = this.zzham;
                ((zzdla) obj).zzc((zzdkr) zzdkdVar2.zzaua(), zzdkdVar2.zzaub());
            }
        });
    }
}
