package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzeef {
    private final ArrayDeque<zzeaq> zzibg;

    private zzeef() {
        this.zzibg = new ArrayDeque<>();
    }

    public final zzeaq zzc(zzeaq zzeaqVar, zzeaq zzeaqVar2) {
        zzak(zzeaqVar);
        zzak(zzeaqVar2);
        zzeaq pop = this.zzibg.pop();
        while (!this.zzibg.isEmpty()) {
            pop = new zzeed(this.zzibg.pop(), pop, null);
        }
        return pop;
    }

    private final void zzak(zzeaq zzeaqVar) {
        zzeaq zzeaqVar2;
        while (!zzeaqVar.zzbct()) {
            if (zzeaqVar instanceof zzeed) {
                zzeed zzeedVar = (zzeed) zzeaqVar;
                zzeaqVar2 = zzeedVar.zzibc;
                zzak(zzeaqVar2);
                zzeaqVar = zzeedVar.zzibd;
            } else {
                String valueOf = String.valueOf(zzeaqVar.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int zzhh = zzhh(zzeaqVar.size());
        int zzhg = zzeed.zzhg(zzhh + 1);
        if (this.zzibg.isEmpty() || this.zzibg.peek().size() >= zzhg) {
            this.zzibg.push(zzeaqVar);
            return;
        }
        int zzhg2 = zzeed.zzhg(zzhh);
        zzeaq pop = this.zzibg.pop();
        while (!this.zzibg.isEmpty() && this.zzibg.peek().size() < zzhg2) {
            pop = new zzeed(this.zzibg.pop(), pop, null);
        }
        zzeed zzeedVar2 = new zzeed(pop, zzeaqVar, null);
        while (!this.zzibg.isEmpty()) {
            if (this.zzibg.peek().size() >= zzeed.zzhg(zzhh(zzeedVar2.size()) + 1)) {
                break;
            }
            zzeedVar2 = new zzeed(this.zzibg.pop(), zzeedVar2, null);
        }
        this.zzibg.push(zzeedVar2);
    }

    private static int zzhh(int i) {
        int binarySearch = Arrays.binarySearch(zzeed.zziba, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public /* synthetic */ zzeef(zzeeg zzeegVar) {
        this();
    }

    public static /* synthetic */ zzeaq zza(zzeef zzeefVar, zzeaq zzeaqVar, zzeaq zzeaqVar2) {
        return zzeefVar.zzc(zzeaqVar, zzeaqVar2);
    }
}
