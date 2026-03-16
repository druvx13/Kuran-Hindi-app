package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbns;
import com.google.android.gms.internal.ads.zzbqh;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzddt<R extends zzbqh<AdT>, AdT extends zzbns> implements zzdeu<R, zzdiv<AdT>> {
    private final Executor executor = zzdrk.zzawr();
    private R zzgre;

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdri<zzdiv<AdT>> zza(zzdev zzdevVar, zzdew<R> zzdewVar) {
        zzdri<zzdha> zzaih;
        zzbqg<R> zzc = zzdewVar.zzc(zzdevVar.zzgsi);
        zzc.zza(new zzdfa(true));
        R zzaeg = zzc.zzaeg();
        this.zzgre = zzaeg;
        final zzboq zzaed = zzaeg.zzaed();
        final zzdiv zzdivVar = new zzdiv();
        if (zzdevVar.zzgsh != null) {
            zzaih = zzaed.zza(zzdevVar.zzgsh);
        } else {
            zzaih = zzaed.zzaih();
        }
        return zzdqr.zzg(zzaih).zzb(new zzdqj(this, zzdivVar, zzaed) { // from class: com.google.android.gms.internal.ads.zzddw
            private final zzddt zzgrh;
            private final zzdiv zzgri;
            private final zzboq zzgrj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgrh = this;
                this.zzgri = zzdivVar;
                this.zzgrj = zzaed;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                zzdiv zzdivVar2 = this.zzgri;
                zzboq zzboqVar = this.zzgrj;
                zzdha zzdhaVar = (zzdha) obj;
                zzdivVar2.zzepv = zzdhaVar;
                Iterator<zzdgo> it = zzdhaVar.zzgus.zzguo.iterator();
                boolean z = false;
                boolean z2 = false;
                loop0: while (true) {
                    if (!it.hasNext()) {
                        z = z2;
                        break;
                    }
                    for (String str : it.next().zzgtk) {
                        if (!str.contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z2 = true;
                    }
                }
                if (!z) {
                    return zzdqw.zzag(null);
                }
                return zzboqVar.zzb(zzdqw.zzag(zzdhaVar));
            }
        }, this.executor).zza(new zzdnx(zzdivVar) { // from class: com.google.android.gms.internal.ads.zzddv
            private final zzdiv zzgrg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgrg = zzdivVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj) {
                zzdiv zzdivVar2 = this.zzgrg;
                zzdivVar2.zzgxu = (AdT) obj;
                return zzdivVar2;
            }
        }, this.executor);
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final /* synthetic */ Object zzarj() {
        return this.zzgre;
    }
}
