package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdaj<T> {
    private final Executor executor;
    private final Set<zzdak<? extends zzdah<T>>> zzgoo;

    public zzdaj(Executor executor, Set<zzdak<? extends zzdah<T>>> set) {
        this.executor = executor;
        this.zzgoo = set;
    }

    public final zzdri<T> zzt(final T t) {
        final ArrayList arrayList = new ArrayList(this.zzgoo.size());
        for (final zzdak<? extends zzdah<T>> zzdakVar : this.zzgoo) {
            zzdri<? extends zzdah<T>> zzaqa = zzdakVar.zzaqa();
            if (zzabn.zzcxb.get().booleanValue()) {
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime();
                zzaqa.addListener(new Runnable(zzdakVar, elapsedRealtime) { // from class: com.google.android.gms.internal.ads.zzdam
                    private final zzdak zzgop;
                    private final long zzgoq;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgop = zzdakVar;
                        this.zzgoq = elapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdak zzdakVar2 = this.zzgop;
                        long j = this.zzgoq;
                        String canonicalName = zzdakVar2.getClass().getCanonicalName();
                        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - j;
                        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
                        sb.append("Signal runtime : ");
                        sb.append(canonicalName);
                        sb.append(" = ");
                        sb.append(elapsedRealtime2);
                        zzawr.zzeg(sb.toString());
                    }
                }, zzbab.zzdzw);
            }
            arrayList.add(zzaqa);
        }
        return zzdqw.zzk(arrayList).zza(new Callable(arrayList, t) { // from class: com.google.android.gms.internal.ads.zzdal
            private final Object zzdel;
            private final List zzgnv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgnv = arrayList;
                this.zzdel = t;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzdri> list = this.zzgnv;
                Object obj = this.zzdel;
                for (zzdri zzdriVar : list) {
                    zzdah zzdahVar = (zzdah) zzdriVar.get();
                    if (zzdahVar != null) {
                        zzdahVar.zzs(obj);
                    }
                }
                return obj;
            }
        }, this.executor);
    }
}
