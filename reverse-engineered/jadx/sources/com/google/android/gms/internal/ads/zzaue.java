package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzefy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaue implements zzaun {
    private static List<Future<Void>> zzdro = Collections.synchronizedList(new ArrayList());
    private final zzaum zzdon;
    private final zzefy.zzb.C0017zzb zzdrp;
    private final LinkedHashMap<String, zzefy.zzb.zzh.C0023zzb> zzdrq;
    private final zzaup zzdrt;
    private boolean zzdru;
    private final zzaus zzdrv;
    private final Context zzvf;
    private final List<String> zzdrr = new ArrayList();
    private final List<String> zzdrs = new ArrayList();
    private final Object lock = new Object();
    private HashSet<String> zzdrw = new HashSet<>();
    private boolean zzdrx = false;
    private boolean zzdry = false;
    private boolean zzdrz = false;

    public zzaue(Context context, zzazz zzazzVar, zzaum zzaumVar, String str, zzaup zzaupVar) {
        Preconditions.checkNotNull(zzaumVar, "SafeBrowsing config is not present.");
        this.zzvf = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzdrq = new LinkedHashMap<>();
        this.zzdrt = zzaupVar;
        this.zzdon = zzaumVar;
        for (String str2 : zzaumVar.zzdsh) {
            this.zzdrw.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.zzdrw.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzefy.zzb.C0017zzb zzbhu = zzefy.zzb.zzbhu();
        zzbhu.zzb(zzefy.zzb.zzg.OCTAGON_AD);
        zzbhu.zzhw(str);
        zzbhu.zzhx(str);
        zzefy.zzb.zza.C0016zza zzbhw = zzefy.zzb.zza.zzbhw();
        if (this.zzdon.zzdsd != null) {
            zzbhw.zzhz(this.zzdon.zzdsd);
        }
        zzbhu.zzb((zzefy.zzb.zza) ((zzecd) zzbhw.zzbet()));
        zzefy.zzb.zzi.zza zzbw = zzefy.zzb.zzi.zzbil().zzbw(Wrappers.packageManager(this.zzvf).isCallerInstantApp());
        if (zzazzVar.zzbnd != null) {
            zzbw.zzie(zzazzVar.zzbnd);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzvf);
        if (apkVersion > 0) {
            zzbw.zzft(apkVersion);
        }
        zzbhu.zzb((zzefy.zzb.zzi) ((zzecd) zzbw.zzbet()));
        this.zzdrp = zzbhu;
        this.zzdrv = new zzaus(this.zzvf, this.zzdon.zzdsk, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Void zzec(String str) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final zzaum zzvf() {
        return this.zzdon;
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final void zzdy(String str) {
        synchronized (this.lock) {
            if (str == null) {
                this.zzdrp.zzbhy();
            } else {
                this.zzdrp.zzhy(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final boolean zzvg() {
        return PlatformVersion.isAtLeastKitKat() && this.zzdon.zzdsf && !this.zzdry;
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final void zzl(View view) {
        if (this.zzdon.zzdsf && !this.zzdry) {
            com.google.android.gms.ads.internal.zzq.zzkw();
            final Bitmap zzn = zzaxa.zzn(view);
            if (zzn == null) {
                zzauo.zzed("Failed to capture the webview bitmap.");
                return;
            }
            this.zzdry = true;
            zzaxa.zzc(new Runnable(this, zzn) { // from class: com.google.android.gms.internal.ads.zzaud
                private final zzaue zzdrm;
                private final Bitmap zzdrn;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdrm = this;
                    this.zzdrn = zzn;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzdrm.zza(this.zzdrn);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final void zza(String str, Map<String, String> map, int i) {
        synchronized (this.lock) {
            if (i == 3) {
                this.zzdrz = true;
            }
            if (this.zzdrq.containsKey(str)) {
                if (i == 3) {
                    this.zzdrq.get(str).zzb(zzefy.zzb.zzh.zza.zzhq(i));
                }
                return;
            }
            zzefy.zzb.zzh.C0023zzb zzbij = zzefy.zzb.zzh.zzbij();
            zzefy.zzb.zzh.zza zzhq = zzefy.zzb.zzh.zza.zzhq(i);
            if (zzhq != null) {
                zzbij.zzb(zzhq);
            }
            zzbij.zzhr(this.zzdrq.size());
            zzbij.zzic(str);
            zzefy.zzb.zzd.C0019zzb zzbib = zzefy.zzb.zzd.zzbib();
            if (this.zzdrw.size() > 0 && map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey() != null ? entry.getKey() : "";
                    String value = entry.getValue() != null ? entry.getValue() : "";
                    if (this.zzdrw.contains(key.toLowerCase(Locale.ENGLISH))) {
                        zzbib.zzb((zzefy.zzb.zzc) ((zzecd) zzefy.zzb.zzc.zzbhz().zzao(zzeaq.zzhq(key)).zzap(zzeaq.zzhq(value)).zzbet()));
                    }
                }
            }
            zzbij.zzb((zzefy.zzb.zzd) ((zzecd) zzbib.zzbet()));
            this.zzdrq.put(str, zzbij);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzdz(String str) {
        synchronized (this.lock) {
            this.zzdrr.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzea(String str) {
        synchronized (this.lock) {
            this.zzdrs.add(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final String[] zza(String[] strArr) {
        return (String[]) this.zzdrv.zzb(strArr).toArray(new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final void zzvh() {
        this.zzdrx = true;
    }

    private final zzefy.zzb.zzh.C0023zzb zzeb(String str) {
        zzefy.zzb.zzh.C0023zzb c0023zzb;
        synchronized (this.lock) {
            c0023zzb = this.zzdrq.get(str);
        }
        return c0023zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaun
    public final void zzvi() {
        synchronized (this.lock) {
            zzdri zzb = zzdqw.zzb(this.zzdrt.zza(this.zzvf, this.zzdrq.keySet()), new zzdqj(this) { // from class: com.google.android.gms.internal.ads.zzaug
                private final zzaue zzdrm;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdrm = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdqj
                public final zzdri zzf(Object obj) {
                    return this.zzdrm.zzi((Map) obj);
                }
            }, zzbab.zzdzw);
            zzdri zza = zzdqw.zza(zzb, 10L, TimeUnit.SECONDS, zzbab.zzdzu);
            zzdqw.zza(zzb, new zzauh(this, zza), zzbab.zzdzw);
            zzdro.add(zza);
        }
    }

    private final zzdri<Void> zzvj() {
        zzdri<Void> zzb;
        if (!((this.zzdru && this.zzdon.zzdsj) || (this.zzdrz && this.zzdon.zzdsi) || (!this.zzdru && this.zzdon.zzdsg))) {
            return zzdqw.zzag(null);
        }
        synchronized (this.lock) {
            for (zzefy.zzb.zzh.C0023zzb c0023zzb : this.zzdrq.values()) {
                this.zzdrp.zzb((zzefy.zzb.zzh) ((zzecd) c0023zzb.zzbet()));
            }
            this.zzdrp.zzo(this.zzdrr);
            this.zzdrp.zzp(this.zzdrs);
            if (zzauo.isEnabled()) {
                String url = this.zzdrp.getUrl();
                String zzbhs = this.zzdrp.zzbhs();
                StringBuilder sb = new StringBuilder(String.valueOf(url).length() + 53 + String.valueOf(zzbhs).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(url);
                sb.append("\n  clickUrl: ");
                sb.append(zzbhs);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (zzefy.zzb.zzh zzhVar : this.zzdrp.zzbhr()) {
                    sb2.append("    [");
                    sb2.append(zzhVar.zzbii());
                    sb2.append("] ");
                    sb2.append(zzhVar.getUrl());
                }
                zzauo.zzed(sb2.toString());
            }
            zzdri<String> zza = new zzaym(this.zzvf).zza(1, this.zzdon.zzdse, null, ((zzefy.zzb) ((zzecd) this.zzdrp.zzbet())).toByteArray());
            if (zzauo.isEnabled()) {
                zza.addListener(zzauf.zzdsa, zzbab.zzdzr);
            }
            zzb = zzdqw.zzb(zza, zzaui.zzdsc, zzbab.zzdzw);
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzi(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.lock) {
                            int length = optJSONArray.length();
                            zzefy.zzb.zzh.C0023zzb zzeb = zzeb(str);
                            if (zzeb == null) {
                                String valueOf = String.valueOf(str);
                                zzauo.zzed(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzeb.zzid(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zzdru = (length > 0) | this.zzdru;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (zzabq.zzcxh.get().booleanValue()) {
                    zzawr.zzb("Failed to get SafeBrowsing metadata", e);
                }
                return zzdqw.immediateFailedFuture(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zzdru) {
            synchronized (this.lock) {
                this.zzdrp.zzb(zzefy.zzb.zzg.OCTAGON_AD_SB_MATCH);
            }
        }
        return zzvj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Bitmap bitmap) {
        zzebd zzbcr = zzeaq.zzbcr();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzbcr);
        synchronized (this.lock) {
            this.zzdrp.zzb((zzefy.zzb.zzf) ((zzecd) zzefy.zzb.zzf.zzbig().zzar(zzbcr.zzbce()).zzia("image/png").zzb(zzefy.zzb.zzf.zza.TYPE_CREATIVE).zzbet()));
        }
    }
}
