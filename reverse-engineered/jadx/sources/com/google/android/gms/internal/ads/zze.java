package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zze implements zzs {
    private final Map<String, List<zzq<?>>> zzn = new HashMap();
    private final zzc zzo;

    public zze(zzc zzcVar) {
        this.zzo = zzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzs
    public final void zza(zzq<?> zzqVar, zzz<?> zzzVar) {
        List<zzq<?>> remove;
        zzaa zzaaVar;
        if (zzzVar.zzbh == null || zzzVar.zzbh.zza()) {
            zza(zzqVar);
            return;
        }
        String zze = zzqVar.zze();
        synchronized (this) {
            remove = this.zzn.remove(zze);
        }
        if (remove != null) {
            if (zzag.DEBUG) {
                zzag.v("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), zze);
            }
            for (zzq<?> zzqVar2 : remove) {
                zzaaVar = this.zzo.zzd;
                zzaaVar.zzb(zzqVar2, zzzVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzs
    public final synchronized void zza(zzq<?> zzqVar) {
        BlockingQueue blockingQueue;
        String zze = zzqVar.zze();
        List<zzq<?>> remove = this.zzn.remove(zze);
        if (remove != null && !remove.isEmpty()) {
            if (zzag.DEBUG) {
                zzag.v("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), zze);
            }
            zzq<?> remove2 = remove.remove(0);
            this.zzn.put(zze, remove);
            remove2.zza((zzs) this);
            try {
                blockingQueue = this.zzo.zzb;
                blockingQueue.put(remove2);
            } catch (InterruptedException e) {
                zzag.e("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.zzo.quit();
            }
        }
    }

    public final synchronized boolean zzb(zzq<?> zzqVar) {
        String zze = zzqVar.zze();
        if (this.zzn.containsKey(zze)) {
            List<zzq<?>> list = this.zzn.get(zze);
            if (list == null) {
                list = new ArrayList<>();
            }
            zzqVar.zzb("waiting-for-response");
            list.add(zzqVar);
            this.zzn.put(zze, list);
            if (zzag.DEBUG) {
                zzag.d("Request for cacheKey=%s is in flight, putting on hold.", zze);
            }
            return true;
        }
        this.zzn.put(zze, null);
        zzqVar.zza((zzs) this);
        if (zzag.DEBUG) {
            zzag.d("new request, sending to network %s", zze);
        }
        return false;
    }
}
