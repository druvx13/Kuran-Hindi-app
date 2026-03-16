package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzclo extends zzaqz {
    private final Executor zzfhi;
    private final zzasa zzgci;
    private final zzarx zzgcj;
    private final zzbjv zzgck;
    private final HashMap<String, zzcmd> zzgcl;
    private final Context zzvf;

    public zzclo(Context context, Executor executor, zzasa zzasaVar, zzbjv zzbjvVar, zzarx zzarxVar, HashMap<String, zzcmd> hashMap) {
        zzzz.initialize(context);
        this.zzvf = context;
        this.zzfhi = executor;
        this.zzgci = zzasaVar;
        this.zzgcj = zzarxVar;
        this.zzgck = zzbjvVar;
        this.zzgcl = hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final zzaqw zza(zzaqu zzaquVar) throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zzaqu zzaquVar, zzarb zzarbVar) throws RemoteException {
    }

    public final zzdri<InputStream> zzb(zzarj zzarjVar, int i) {
        zzakp zza = com.google.android.gms.ads.internal.zzq.zzlj().zza(this.zzvf, zzazz.zzyi());
        zzdbc zza2 = this.zzgck.zza(zzarjVar, i);
        zzakh zza3 = zza.zza("google.afma.response.normalize", zzcmc.zzgct, zzakk.zzddv);
        zzcmh zzcmhVar = new zzcmh(this.zzvf, zzarjVar.zzdls.zzbnd, this.zzgci, zzarjVar.zzdms);
        zzdku zzaex = zza2.zzaex();
        zzcmd zzcmdVar = null;
        if (!zzabo.zzcxc.get().booleanValue()) {
            if (zzarjVar.zzdpi != null && !zzarjVar.zzdpi.isEmpty()) {
                zzawr.zzeg("Request contained a PoolKey but split request is disabled.");
            }
        } else if (zzarjVar.zzdpi != null && !zzarjVar.zzdpi.isEmpty() && (zzcmdVar = this.zzgcl.remove(zzarjVar.zzdpi)) == null) {
            zzawr.zzeg("Request contained a PoolKey but no matching parameters were found.");
        }
        if (zzcmdVar == null) {
            final zzdri<JSONObject> zza4 = zza(zzarjVar, zzaex, zza2);
            final zzdri<zzarp> zza5 = zza(zza4, zzaex, zza);
            final zzdkd zzaud = zzaex.zza((zzdku) zzdkr.HTTP, zza5, zza4).zzb(new Callable(zza4, zza5) { // from class: com.google.android.gms.internal.ads.zzclr
                private final zzdri zzfmu;
                private final zzdri zzfvm;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfvm = zza4;
                    this.zzfmu = zza5;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzcmg((JSONObject) this.zzfvm.get(), (zzarp) this.zzfmu.get());
                }
            }).zzb(zzcmhVar).zzaud();
            return zzaex.zza((zzdku) zzdkr.PRE_PROCESS, zza4, zza5, zzaud).zzb(new Callable(zzaud, zza4, zza5) { // from class: com.google.android.gms.internal.ads.zzclq
                private final zzdri zzflc;
                private final zzdri zzfmu;
                private final zzdri zzfvm;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfvm = zzaud;
                    this.zzfmu = zza4;
                    this.zzflc = zza5;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzcmc((zzcmj) this.zzfvm.get(), (JSONObject) this.zzfmu.get(), (zzarp) this.zzflc.get());
                }
            }).zza(zza3).zzaud();
        }
        final zzdkd zzaud2 = zzaex.zza((zzdku) zzdkr.HTTP, zzdqw.zzag(new zzcmg(zzcmdVar.zzgcr, zzcmdVar.zzgcs))).zzb(zzcmhVar).zzaud();
        final zzdri<?> zzag = zzdqw.zzag(zzcmdVar);
        return zzaex.zza((zzdku) zzdkr.PRE_PROCESS, zzaud2, zzag).zzb(new Callable(zzaud2, zzag) { // from class: com.google.android.gms.internal.ads.zzclt
            private final zzdri zzfmu;
            private final zzdri zzfvm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvm = zzaud2;
                this.zzfmu = zzag;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdri zzdriVar = this.zzfvm;
                zzdri zzdriVar2 = this.zzfmu;
                return new zzcmc((zzcmj) zzdriVar.get(), ((zzcmd) zzdriVar2.get()).zzgcr, ((zzcmd) zzdriVar2.get()).zzgcs);
            }
        }).zza(zza3).zzaud();
    }

    private static zzdri<JSONObject> zza(zzarj zzarjVar, zzdku zzdkuVar, final zzdbc zzdbcVar) {
        zzdqj zzdqjVar = new zzdqj(zzdbcVar) { // from class: com.google.android.gms.internal.ads.zzcls
            private final zzdbc zzgcm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgcm = zzdbcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgcm.zzaev().zzt(com.google.android.gms.ads.internal.zzq.zzkw().zzd((Bundle) obj));
            }
        };
        return zzdkuVar.zza((zzdku) zzdkr.GMS_SIGNALS, zzdqw.zzag(zzarjVar.zzdpe)).zza(zzdqjVar).zzb(zzclv.zzgaz).zzaud();
    }

    private static zzdri<zzarp> zza(zzdri<JSONObject> zzdriVar, zzdku zzdkuVar, zzakp zzakpVar) {
        return zzdkuVar.zza((zzdku) zzdkr.BUILD_URL, (zzdri) zzdriVar).zza(zzakpVar.zza("AFMA_getAdDictionary", zzakk.zzddu, zzclu.zzddw)).zzaud();
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zzarj zzarjVar, zzard zzardVar) {
        zzdri<InputStream> zzb = zzb(zzarjVar, Binder.getCallingUid());
        zza(zzb, zzardVar);
        zzb.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzclx
            private final zzclo zzgcn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgcn = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgcn.zzaou();
            }
        }, this.zzfhi);
    }

    public final zzdri<InputStream> zzc(zzarj zzarjVar, int i) {
        if (!zzabo.zzcxc.get().booleanValue()) {
            return zzdqw.immediateFailedFuture(new Exception("Split request is disabled."));
        }
        if (zzarjVar.zzdph == null) {
            return zzdqw.immediateFailedFuture(new Exception("Pool configuration missing from request."));
        }
        if (zzarjVar.zzdph.zzgwv == 0 || zzarjVar.zzdph.zzgww == 0) {
            return zzdqw.immediateFailedFuture(new Exception("Caching is disabled."));
        }
        zzakp zza = com.google.android.gms.ads.internal.zzq.zzlj().zza(this.zzvf, zzazz.zzyi());
        zzdbc zza2 = this.zzgck.zza(zzarjVar, i);
        zzdku zzaex = zza2.zzaex();
        final zzdri<JSONObject> zza3 = zza(zzarjVar, zzaex, zza2);
        final zzdri<zzarp> zza4 = zza(zza3, zzaex, zza);
        return zzaex.zza((zzdku) zzdkr.GET_URL_AND_CACHE_KEY, zza3, zza4).zzb(new Callable(this, zza4, zza3) { // from class: com.google.android.gms.internal.ads.zzclw
            private final zzdri zzflc;
            private final zzdri zzfmu;
            private final zzclo zzgcn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgcn = this;
                this.zzfmu = zza4;
                this.zzflc = zza3;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgcn.zza(this.zzfmu, this.zzflc);
            }
        }).zzaud();
    }

    public final zzdri<InputStream> zzgl(String str) {
        if (!zzabo.zzcxc.get().booleanValue()) {
            return zzdqw.immediateFailedFuture(new Exception("Split request is disabled."));
        }
        zzcmb zzcmbVar = new zzcmb(this);
        if (this.zzgcl.remove(str) == null) {
            String valueOf = String.valueOf(str);
            return zzdqw.immediateFailedFuture(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
        }
        return zzdqw.zzag(zzcmbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zzc(zzarj zzarjVar, zzard zzardVar) {
        zza(zzc(zzarjVar, Binder.getCallingUid()), zzardVar);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(String str, zzard zzardVar) {
        zza(zzgl(str), zzardVar);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zzb(zzarj zzarjVar, zzard zzardVar) {
        zzdri<InputStream> zzaud;
        int callingUid = Binder.getCallingUid();
        zzakp zza = com.google.android.gms.ads.internal.zzq.zzlj().zza(this.zzvf, zzazz.zzyi());
        if (!zzabu.zzcxu.get().booleanValue()) {
            zzaud = zzdqw.immediateFailedFuture(new Exception("Signal collection disabled."));
        } else {
            zzdbc zza2 = this.zzgck.zza(zzarjVar, callingUid);
            final zzdaj<JSONObject> zzaew = zza2.zzaew();
            zzaud = zza2.zzaex().zza((zzdku) zzdkr.GET_SIGNALS, zzdqw.zzag(zzarjVar.zzdpe)).zza(new zzdqj(zzaew) { // from class: com.google.android.gms.internal.ads.zzclz
                private final zzdaj zzgco;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgco = zzaew;
                }

                @Override // com.google.android.gms.internal.ads.zzdqj
                public final zzdri zzf(Object obj) {
                    return this.zzgco.zzt(com.google.android.gms.ads.internal.zzq.zzkw().zzd((Bundle) obj));
                }
            }).zzw(zzdkr.JS_SIGNALS).zza(zza.zza("google.afma.request.getSignals", zzakk.zzddu, zzakk.zzddv)).zzaud();
        }
        zza(zzaud, zzardVar);
    }

    private final void zza(zzdri<InputStream> zzdriVar, zzard zzardVar) {
        zzdqw.zza(zzdqw.zzb(zzdriVar, new zzdqj(this) { // from class: com.google.android.gms.internal.ads.zzcly
            private final zzclo zzgcn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgcn = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return zzdqw.zzag(zzdhs.zze((InputStream) obj));
            }
        }, zzbab.zzdzr), new zzcma(this, zzardVar), zzbab.zzdzw);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zza(zzdri zzdriVar, zzdri zzdriVar2) throws Exception {
        String zzva = ((zzarp) zzdriVar.get()).zzva();
        this.zzgcl.put(zzva, new zzcmd((zzarp) zzdriVar.get(), (JSONObject) zzdriVar2.get()));
        return new ByteArrayInputStream(zzva.getBytes(zzdnv.UTF_8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaou() {
        zzbaf.zza(this.zzgcj.zzvc(), "persistFlags");
    }
}
