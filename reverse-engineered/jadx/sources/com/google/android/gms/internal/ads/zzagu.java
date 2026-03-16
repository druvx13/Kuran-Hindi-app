package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzagu implements zzn {
    private volatile zzagn zzdbd;
    private final Context zzvf;

    public zzagu(Context context) {
        this.zzvf = context;
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final zzo zzc(zzq<?> zzqVar) throws zzae {
        zzagm zzh = zzagm.zzh(zzqVar);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime();
        try {
            zzbaj zzbajVar = new zzbaj();
            this.zzdbd = new zzagn(this.zzvf, com.google.android.gms.ads.internal.zzq.zzlk().zzxx(), new zzagy(this, zzbajVar), new zzahb(this, zzbajVar));
            this.zzdbd.checkAvailabilityAndConnect();
            zzdri zza = zzdqw.zza(zzdqw.zzb(zzbajVar, new zzagx(this, zzh), zzbab.zzdzr), ((Integer) zzvj.zzpv().zzd(zzzz.zzcqc)).intValue(), TimeUnit.MILLISECONDS, zzbab.zzdzu);
            zza.addListener(new zzagz(this), zzbab.zzdzr);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zza.get();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            zzawr.zzeg(sb.toString());
            zzago zzagoVar = (zzago) new zzari(parcelFileDescriptor).zza(zzago.CREATOR);
            if (zzagoVar == null) {
                return null;
            }
            if (zzagoVar.zzdbb) {
                throw new zzae(zzagoVar.zzdbc);
            }
            if (zzagoVar.zzdaz.length != zzagoVar.zzdba.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < zzagoVar.zzdaz.length; i++) {
                hashMap.put(zzagoVar.zzdaz[i], zzagoVar.zzdba[i]);
            }
            return new zzo(zzagoVar.statusCode, zzagoVar.data, hashMap, zzagoVar.zzac, zzagoVar.zzad);
        } catch (InterruptedException | ExecutionException unused) {
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - elapsedRealtime);
            sb2.append("ms");
            zzawr.zzeg(sb2.toString());
            return null;
        } catch (Throwable th) {
            long elapsedRealtime3 = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime3);
            sb3.append("ms");
            zzawr.zzeg(sb3.toString());
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        if (this.zzdbd == null) {
            return;
        }
        this.zzdbd.disconnect();
        Binder.flushPendingCommands();
    }
}
