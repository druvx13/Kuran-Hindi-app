package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbdm implements Iterable<zzbdk> {
    private final List<zzbdk> zzegp = new ArrayList();

    public static boolean zzc(zzbbx zzbbxVar) {
        zzbdk zzd = zzd(zzbbxVar);
        if (zzd != null) {
            zzd.zzegn.abort();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbdk zzd(zzbbx zzbbxVar) {
        Iterator<zzbdk> it = com.google.android.gms.ads.internal.zzq.zzls().iterator();
        while (it.hasNext()) {
            zzbdk next = it.next();
            if (next.zzebj == zzbbxVar) {
                return next;
            }
        }
        return null;
    }

    public final void zza(zzbdk zzbdkVar) {
        this.zzegp.add(zzbdkVar);
    }

    public final void zzb(zzbdk zzbdkVar) {
        this.zzegp.remove(zzbdkVar);
    }

    @Override // java.lang.Iterable
    public final Iterator<zzbdk> iterator() {
        return this.zzegp.iterator();
    }
}
