package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzqy {
    private final int zzbrk;
    private final zzqv zzbrm = new zzrc();
    private final int zzbrj = 6;
    private final int zzbrl = 0;

    public zzqy(int i) {
        this.zzbrk = i;
    }

    public final String zza(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            String str = arrayList2.get(i);
            i++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append('\n');
        }
        return zzbs(sb.toString());
    }

    private final String zzbs(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        zzra zzraVar = new zzra();
        PriorityQueue priorityQueue = new PriorityQueue(this.zzbrk, new zzqx(this));
        for (String str2 : split) {
            String[] zzd = zzqz.zzd(str2, false);
            if (zzd.length != 0) {
                zzre.zza(zzd, this.zzbrk, this.zzbrj, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzraVar.write(this.zzbrm.zzbr(((zzrd) it.next()).zzbrq));
            } catch (IOException e) {
                zzawr.zzc("Error while writing hash to byteStream", e);
            }
        }
        return zzraVar.toString();
    }
}
