package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqd;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
abstract class zzdqi<V, C> extends zzdqd<V, C> {
    private List<zzdod<V>> zzhho;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqi(zzdot<? extends zzdri<? extends V>> zzdotVar, boolean z) {
        super(zzdotVar, true, true);
        List<zzdod<V>> zzej;
        if (zzdotVar.isEmpty()) {
            zzej = zzdou.zzavy();
        } else {
            zzej = zzdpc.zzej(zzdotVar.size());
        }
        this.zzhho = zzej;
        for (int i = 0; i < zzdotVar.size(); i++) {
            this.zzhho.add(null);
        }
    }

    abstract C zzi(List<zzdod<V>> list);

    @Override // com.google.android.gms.internal.ads.zzdqd
    final void zzb(int i, @NullableDecl V v) {
        List<zzdod<V>> list = this.zzhho;
        if (list != null) {
            list.set(i, zzdod.zzz(v));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdqd
    final void zzawj() {
        List<zzdod<V>> list = this.zzhho;
        if (list != null) {
            set(zzi(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdqd
    public final void zza(zzdqd.zza zzaVar) {
        super.zza(zzaVar);
        this.zzhho = null;
    }
}
