package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzqm {
    private int zzbqe;
    private final Object lock = new Object();
    private List<zzqj> zzbqf = new LinkedList();

    public final zzqj zzo(boolean z) {
        synchronized (this.lock) {
            zzqj zzqjVar = null;
            if (this.zzbqf.size() == 0) {
                zzawr.zzed("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzbqf.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (zzqj zzqjVar2 : this.zzbqf) {
                    int score = zzqjVar2.getScore();
                    if (score > i2) {
                        i = i3;
                        zzqjVar = zzqjVar2;
                        i2 = score;
                    }
                    i3++;
                }
                this.zzbqf.remove(i);
                return zzqjVar;
            }
            zzqj zzqjVar3 = this.zzbqf.get(0);
            if (z) {
                this.zzbqf.remove(0);
            } else {
                zzqjVar3.zzmb();
            }
            return zzqjVar3;
        }
    }

    public final boolean zza(zzqj zzqjVar) {
        synchronized (this.lock) {
            return this.zzbqf.contains(zzqjVar);
        }
    }

    public final boolean zzb(zzqj zzqjVar) {
        synchronized (this.lock) {
            Iterator<zzqj> it = this.zzbqf.iterator();
            while (it.hasNext()) {
                zzqj next = it.next();
                if (!com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzwq()) {
                    if (zzqjVar != next && next.zzly().equals(zzqjVar.zzly())) {
                        it.remove();
                        return true;
                    }
                } else if (!com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzws() && zzqjVar != next && next.zzma().equals(zzqjVar.zzma())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzc(zzqj zzqjVar) {
        synchronized (this.lock) {
            if (this.zzbqf.size() >= 10) {
                int size = this.zzbqf.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                zzawr.zzed(sb.toString());
                this.zzbqf.remove(0);
            }
            int i = this.zzbqe;
            this.zzbqe = i + 1;
            zzqjVar.zzbq(i);
            zzqjVar.zzme();
            this.zzbqf.add(zzqjVar);
        }
    }
}
