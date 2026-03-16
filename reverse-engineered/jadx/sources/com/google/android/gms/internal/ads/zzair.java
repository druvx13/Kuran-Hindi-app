package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzair<ReferenceT> implements zzaio {
    private final Map<String, CopyOnWriteArrayList<zzaga<? super ReferenceT>>> zzdcb = new HashMap();
    private ReferenceT zzdcc;

    public final void zzg(ReferenceT referencet) {
        this.zzdcc = referencet;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final boolean zzde(String str) {
        return str != null && zzg(Uri.parse(str));
    }

    public final boolean zzg(Uri uri) {
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzh(uri);
            return true;
        }
        return false;
    }

    public final void zzh(Uri uri) {
        String path = uri.getPath();
        com.google.android.gms.ads.internal.zzq.zzkw();
        zzb(path, zzaxa.zzj(uri));
    }

    private final synchronized void zzb(final String str, final Map<String, String> map) {
        if (zzawr.isLoggable(2)) {
            String valueOf = String.valueOf(str);
            zzawr.zzeg(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                zzawr.zzeg(sb.toString());
            }
        }
        CopyOnWriteArrayList<zzaga<? super ReferenceT>> copyOnWriteArrayList = this.zzdcb.get(str);
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<zzaga<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                final zzaga<? super ReferenceT> next = it.next();
                zzbab.zzdzv.execute(new Runnable(this, next, map) { // from class: com.google.android.gms.internal.ads.zzaiq
                    private final zzair zzdby;
                    private final zzaga zzdbz;
                    private final Map zzdca;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdby = this;
                        this.zzdbz = next;
                        this.zzdca = map;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzdby.zza(this.zzdbz, this.zzdca);
                    }
                });
            }
            return;
        }
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzctz)).booleanValue() && com.google.android.gms.ads.internal.zzq.zzla().zzvv() != null) {
            zzbab.zzdzr.execute(new Runnable(str) { // from class: com.google.android.gms.internal.ads.zzait
                private final String zzdcd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdcd = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzq.zzla().zzvv().zzct(this.zzdcd.substring(1));
                }
            });
        }
    }

    public final synchronized void zza(String str, zzaga<? super ReferenceT> zzagaVar) {
        CopyOnWriteArrayList<zzaga<? super ReferenceT>> copyOnWriteArrayList = this.zzdcb.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.zzdcb.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(zzagaVar);
    }

    public final synchronized void zzb(String str, zzaga<? super ReferenceT> zzagaVar) {
        CopyOnWriteArrayList<zzaga<? super ReferenceT>> copyOnWriteArrayList = this.zzdcb.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.remove(zzagaVar);
    }

    public final synchronized void zza(String str, Predicate<zzaga<? super ReferenceT>> predicate) {
        CopyOnWriteArrayList<zzaga<? super ReferenceT>> copyOnWriteArrayList = this.zzdcb.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<zzaga<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzaga<? super ReferenceT> next = it.next();
            if (predicate.apply(next)) {
                arrayList.add(next);
            }
        }
        copyOnWriteArrayList.removeAll(arrayList);
    }

    public final synchronized void reset() {
        this.zzdcb.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzaga zzagaVar, Map map) {
        zzagaVar.zza(this.zzdcc, map);
    }
}
