package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzczm implements zzdak<zzczj> {
    private final ScheduledExecutorService zzfky;
    private final zzdhe zzfll;
    private final zzdrh zzfur;
    private final zzcsx zzghn;
    private String zzgla;
    private final zzcsz zzgns;
    private final Context zzvf;

    public zzczm(zzdrh zzdrhVar, ScheduledExecutorService scheduledExecutorService, String str, zzcsz zzcszVar, Context context, zzdhe zzdheVar, zzcsx zzcsxVar) {
        this.zzfur = zzdrhVar;
        this.zzfky = scheduledExecutorService;
        this.zzgla = str;
        this.zzgns = zzcszVar;
        this.zzvf = context;
        this.zzfll = zzdheVar;
        this.zzghn = zzcsxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzczj> zzaqa() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcnb)).booleanValue()) {
            return zzdqw.zza(new zzdqh(this) { // from class: com.google.android.gms.internal.ads.zzczl
                private final zzczm zzgnr;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgnr = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdqh
                public final zzdri zzaql() {
                    return this.zzgnr.zzaqm();
                }
            }, this.zzfur);
        }
        return zzdqw.zzag(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(String str, List list, Bundle bundle) throws Exception {
        zzbaj zzbajVar = new zzbaj();
        this.zzghn.zzgm(str);
        zzanv zzgn = this.zzghn.zzgn(str);
        if (zzgn == null) {
            throw null;
        }
        zzgn.zza(ObjectWrapper.wrap(this.zzvf), this.zzgla, bundle, (Bundle) list.get(0), this.zzfll.zzbmp, new zzctf(str, zzgn, zzbajVar));
        return zzbajVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzaqm() {
        Map<String, List<Bundle>> zzs = this.zzgns.zzs(this.zzgla, this.zzfll.zzgux);
        final ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<Bundle>> entry : zzs.entrySet()) {
            final String key = entry.getKey();
            final List<Bundle> value = entry.getValue();
            final Bundle bundle = this.zzfll.zzguw.zzcen != null ? this.zzfll.zzguw.zzcen.getBundle(key) : null;
            arrayList.add(zzdqr.zzg(zzdqw.zza(new zzdqh(this, key, value, bundle) { // from class: com.google.android.gms.internal.ads.zzczo
                private final String zzdbv;
                private final zzczm zzgnr;
                private final List zzgnt;
                private final Bundle zzgnu;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgnr = this;
                    this.zzdbv = key;
                    this.zzgnt = value;
                    this.zzgnu = bundle;
                }

                @Override // com.google.android.gms.internal.ads.zzdqh
                public final zzdri zzaql() {
                    return this.zzgnr.zza(this.zzdbv, this.zzgnt, this.zzgnu);
                }
            }, this.zzfur)).zza(((Long) zzvj.zzpv().zzd(zzzz.zzcna)).longValue(), TimeUnit.MILLISECONDS, this.zzfky).zza(Throwable.class, new zzdnx(key) { // from class: com.google.android.gms.internal.ads.zzczn
                private final String zzdcd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdcd = key;
                }

                @Override // com.google.android.gms.internal.ads.zzdnx
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    String valueOf = String.valueOf(this.zzdcd);
                    zzawr.zzfa(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "));
                    return null;
                }
            }, this.zzfur));
        }
        return zzdqw.zzk(arrayList).zza(new Callable(arrayList) { // from class: com.google.android.gms.internal.ads.zzczq
            private final List zzgnv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgnv = arrayList;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzdri> list = this.zzgnv;
                JSONArray jSONArray = new JSONArray();
                for (zzdri zzdriVar : list) {
                    if (((JSONObject) zzdriVar.get()) != null) {
                        jSONArray.put(zzdriVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzczj(jSONArray.toString());
            }
        }, this.zzfur);
    }
}
