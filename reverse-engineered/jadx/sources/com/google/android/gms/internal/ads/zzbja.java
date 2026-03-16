package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbja extends zzwo {
    private final zzazz zzbmo;
    private final zzauu zzboj;
    private final zzcfz zzffo;
    private final zzcnk<zzdhq, zzcos> zzffp;
    private final zzcsz zzffq;
    private final zzciz zzffr;
    private final zzcgb zzffs;
    private final Context zzvf;
    private boolean zzyw = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbja(Context context, zzazz zzazzVar, zzcfz zzcfzVar, zzcnk<zzdhq, zzcos> zzcnkVar, zzcsz zzcszVar, zzciz zzcizVar, zzauu zzauuVar, zzcgb zzcgbVar) {
        this.zzvf = context;
        this.zzbmo = zzazzVar;
        this.zzffo = zzcfzVar;
        this.zzffp = zzcnkVar;
        this.zzffq = zzcszVar;
        this.zzffr = zzcizVar;
        this.zzboj = zzauuVar;
        this.zzffs = zzcgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final synchronized void initialize() {
        if (this.zzyw) {
            zzawr.zzfc("Mobile ads is initialized already.");
            return;
        }
        zzzz.initialize(this.zzvf);
        com.google.android.gms.ads.internal.zzq.zzla().zzd(this.zzvf, this.zzbmo);
        com.google.android.gms.ads.internal.zzq.zzlc().initialize(this.zzvf);
        this.zzyw = true;
        this.zzffr.zzaog();
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcnc)).booleanValue()) {
            this.zzffq.zzand();
        }
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcpl)).booleanValue()) {
            this.zzffs.zzand();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final synchronized void setAppVolume(float f) {
        com.google.android.gms.ads.internal.zzq.zzlb().setAppVolume(f);
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final synchronized float zzqb() {
        return com.google.android.gms.ads.internal.zzq.zzlb().zzqb();
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final synchronized void setAppMuted(boolean z) {
        com.google.android.gms.ads.internal.zzq.zzlb().setAppMuted(z);
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final synchronized boolean zzqc() {
        return com.google.android.gms.ads.internal.zzq.zzlb().zzqc();
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final synchronized void zzcf(String str) {
        zzzz.initialize(this.zzvf);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcpk)).booleanValue()) {
                com.google.android.gms.ads.internal.zzq.zzle().zza(this.zzvf, this.zzbmo, str, (Runnable) null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zzb(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzawr.zzfa("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zzawr.zzfa("Context is null. Failed to open debug menu.");
            return;
        }
        zzaxr zzaxrVar = new zzaxr(context);
        zzaxrVar.setAdUnitId(str);
        zzaxrVar.zzac(this.zzbmo.zzbnd);
        zzaxrVar.showDialog();
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zza(String str, IObjectWrapper iObjectWrapper) {
        String str2;
        zzzz.initialize(this.zzvf);
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcpm)).booleanValue()) {
            com.google.android.gms.ads.internal.zzq.zzkw();
            str2 = zzaxa.zzbc(this.zzvf);
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean booleanValue = ((Boolean) zzvj.zzpv().zzd(zzzz.zzcpk)).booleanValue() | ((Boolean) zzvj.zzpv().zzd(zzzz.zzclk)).booleanValue();
        Runnable runnable = null;
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzclk)).booleanValue()) {
            booleanValue = true;
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable(this, runnable2) { // from class: com.google.android.gms.internal.ads.zzbjd
                private final zzbja zzfft;
                private final Runnable zzffu;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfft = this;
                    this.zzffu = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbab.zzdzv.execute(new Runnable(this.zzfft, this.zzffu) { // from class: com.google.android.gms.internal.ads.zzbjc
                        private final zzbja zzfft;
                        private final Runnable zzffu;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzfft = r1;
                            this.zzffu = r2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzfft.zzd(this.zzffu);
                        }
                    });
                }
            };
        }
        if (booleanValue) {
            com.google.android.gms.ads.internal.zzq.zzle().zza(this.zzvf, this.zzbmo, str, runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final String getVersionString() {
        return this.zzbmo.zzbnd;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zzcg(String str) {
        this.zzffq.zzgo(str);
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zza(zzalp zzalpVar) throws RemoteException {
        this.zzffo.zzb(zzalpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zza(zzahh zzahhVar) throws RemoteException {
        this.zzffr.zzb(zzahhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final List<zzaha> zzqd() throws RemoteException {
        return this.zzffr.zzaoh();
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zza(zzyy zzyyVar) throws RemoteException {
        this.zzboj.zza(this.zzvf, zzyyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map<String, zzalk> zzwj = com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzww().zzwj();
        if (zzwj == null || zzwj.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzawr.zzd("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzffo.zzanb()) {
            HashMap hashMap = new HashMap();
            for (zzalk zzalkVar : zzwj.values()) {
                for (zzall zzallVar : zzalkVar.zzdes) {
                    String str = zzallVar.zzdfx;
                    for (String str2 : zzallVar.zzdfp) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzcnl<zzdhq, zzcos> zzf = this.zzffp.zzf(str3, jSONObject);
                    if (zzf != null) {
                        zzdhq zzdhqVar = zzf.zzdgp;
                        if (!zzdhqVar.isInitialized() && zzdhqVar.zztk()) {
                            zzdhqVar.zza(this.zzvf, zzf.zzgel, (List) entry.getValue());
                            String valueOf = String.valueOf(str3);
                            zzawr.zzed(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                        }
                    }
                } catch (zzdhk e) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb.append("Failed to initialize rewarded video mediation adapter \"");
                    sb.append(str3);
                    sb.append("\"");
                    zzawr.zzd(sb.toString(), e);
                }
            }
        }
    }
}
