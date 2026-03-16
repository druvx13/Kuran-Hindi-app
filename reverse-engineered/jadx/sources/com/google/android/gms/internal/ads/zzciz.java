package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzciz {
    private final Executor executor;
    private final zzazz zzbml;
    private final Context zzciq;
    private final Executor zzfhi;
    private final ScheduledExecutorService zzfif;
    private final WeakReference<Context> zzgab;
    private final zzcfz zzgac;
    private final zzcij zzgad;
    private boolean zzfzx = false;
    private boolean zzfzy = false;
    private final zzbaj<Boolean> zzgaa = new zzbaj<>();
    private Map<String, zzaha> zzgae = new ConcurrentHashMap();
    private final long zzfzz = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime();

    public zzciz(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, zzcfz zzcfzVar, ScheduledExecutorService scheduledExecutorService, zzcij zzcijVar, zzazz zzazzVar) {
        this.zzgac = zzcfzVar;
        this.zzciq = context;
        this.zzgab = weakReference;
        this.executor = executor2;
        this.zzfif = scheduledExecutorService;
        this.zzfhi = executor;
        this.zzgad = zzcijVar;
        this.zzbml = zzazzVar;
        zza("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public final void zzb(final zzahh zzahhVar) {
        this.zzgaa.addListener(new Runnable(this, zzahhVar) { // from class: com.google.android.gms.internal.ads.zzciy
            private final zzciz zzfzv;
            private final zzahh zzfzw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfzv = this;
                this.zzfzw = zzahhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfzv.zzc(this.zzfzw);
            }
        }, this.zzfhi);
    }

    public final void zzaog() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcnf)).booleanValue() && !zzabp.zzcxd.get().booleanValue()) {
            if (this.zzbml.zzdzo >= ((Integer) zzvj.zzpv().zzd(zzzz.zzcng)).intValue()) {
                if (this.zzfzx) {
                    return;
                }
                synchronized (this) {
                    if (this.zzfzx) {
                        return;
                    }
                    this.zzgad.zzaod();
                    this.zzgaa.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcjb
                        private final zzciz zzfzv;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzfzv = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzfzv.zzaol();
                        }
                    }, this.executor);
                    this.zzfzx = true;
                    zzdri<String> zzaoi = zzaoi();
                    this.zzfif.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcjd
                        private final zzciz zzfzv;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzfzv = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzfzv.zzaok();
                        }
                    }, ((Long) zzvj.zzpv().zzd(zzzz.zzcni)).longValue(), TimeUnit.SECONDS);
                    zzdqw.zza(zzaoi, new zzcjg(this), this.executor);
                    return;
                }
            }
        }
        zza("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zzgaa.set(false);
    }

    public final List<zzaha> zzaoh() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzgae.keySet()) {
            zzaha zzahaVar = this.zzgae.get(str);
            arrayList.add(new zzaha(str, zzahaVar.zzdbh, zzahaVar.zzdbi, zzahaVar.description));
        }
        return arrayList;
    }

    private final synchronized zzdri<String> zzaoi() {
        String zzwh = com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzww().zzwh();
        if (!TextUtils.isEmpty(zzwh)) {
            return zzdqw.zzag(zzwh);
        }
        final zzbaj zzbajVar = new zzbaj();
        com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzb(new Runnable(this, zzbajVar) { // from class: com.google.android.gms.internal.ads.zzcja
            private final zzciz zzfzv;
            private final zzbaj zzgaf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfzv = this;
                this.zzgaf = zzbajVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfzv.zza(this.zzgaf);
            }
        });
        return zzbajVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzgj(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final Object obj = new Object();
                final zzbaj zzbajVar = new zzbaj();
                zzdri zza = zzdqw.zza(zzbajVar, ((Long) zzvj.zzpv().zzd(zzzz.zzcnh)).longValue(), TimeUnit.SECONDS, this.zzfif);
                this.zzgad.zzgh(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime();
                Iterator<String> it = keys;
                zza.addListener(new Runnable(this, obj, zzbajVar, next, elapsedRealtime) { // from class: com.google.android.gms.internal.ads.zzcjc
                    private final Object zzdel;
                    private final String zzfya;
                    private final zzciz zzfzv;
                    private final zzbaj zzgag;
                    private final long zzgah;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfzv = this;
                        this.zzdel = obj;
                        this.zzgag = zzbajVar;
                        this.zzfya = next;
                        this.zzgah = elapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzfzv.zza(this.zzdel, this.zzgag, this.zzfya, this.zzgah);
                    }
                }, this.executor);
                arrayList.add(zza);
                final zzcji zzcjiVar = new zzcji(this, obj, next, elapsedRealtime, zzbajVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                }
                            }
                            arrayList2.add(new zzahk(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                zza(next, false, "", 0);
                try {
                    try {
                        final zzdhq zzd = this.zzgac.zzd(next, new JSONObject());
                        this.zzfhi.execute(new Runnable(this, zzd, zzcjiVar, arrayList2, next) { // from class: com.google.android.gms.internal.ads.zzcje
                            private final String zzeir;
                            private final zzciz zzfzv;
                            private final zzdhq zzgai;
                            private final zzahc zzgaj;
                            private final List zzgak;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zzfzv = this;
                                this.zzgai = zzd;
                                this.zzgaj = zzcjiVar;
                                this.zzgak = arrayList2;
                                this.zzeir = next;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zzfzv.zza(this.zzgai, this.zzgaj, this.zzgak, this.zzeir);
                            }
                        });
                    } catch (zzdhk unused2) {
                        zzcjiVar.onInitializationFailed("Failed to create Adapter.");
                    }
                } catch (RemoteException e) {
                    zzazw.zzc("", e);
                }
                keys = it;
            }
            zzdqw.zzj(arrayList).zza(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcjf
                private final zzciz zzfzv;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfzv = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zzfzv.zzaoj();
                }
            }, this.executor);
        } catch (JSONException e2) {
            zzawr.zza("Malformed CLD response", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str, boolean z, String str2, int i) {
        this.zzgae.put(str, new zzaha(str, z, i, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzdhq zzdhqVar, zzahc zzahcVar, List list, String str) {
        try {
            try {
                Context context = this.zzgab.get();
                if (context == null) {
                    context = this.zzciq;
                }
                zzdhqVar.zza(context, zzahcVar, list);
            } catch (zzdhk unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
                sb.append("Failed to initialize adapter. ");
                sb.append(str);
                sb.append(" does not implement the initialize() method.");
                zzahcVar.onInitializationFailed(sb.toString());
            }
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzaoj() throws Exception {
        this.zzgaa.set(true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, zzbaj zzbajVar, String str, long j) {
        synchronized (obj) {
            if (!zzbajVar.isDone()) {
                zza(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - j));
                this.zzgad.zzr(str, "timeout");
                zzbajVar.set(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaok() {
        synchronized (this) {
            if (this.zzfzy) {
                return;
            }
            zza("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - this.zzfzz));
            this.zzgaa.setException(new Exception());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(final zzbaj zzbajVar) {
        this.executor.execute(new Runnable(this, zzbajVar) { // from class: com.google.android.gms.internal.ads.zzcjh
            private final zzciz zzfzv;
            private final zzbaj zzgaf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfzv = this;
                this.zzgaf = zzbajVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbaj zzbajVar2 = this.zzgaf;
                String zzwh = com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzww().zzwh();
                if (!TextUtils.isEmpty(zzwh)) {
                    zzbajVar2.set(zzwh);
                } else {
                    zzbajVar2.setException(new Exception());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaol() {
        this.zzgad.zzaoe();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzahh zzahhVar) {
        try {
            zzahhVar.zzd(zzaoh());
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zza(zzciz zzcizVar, boolean z) {
        zzcizVar.zzfzy = true;
        return true;
    }
}
