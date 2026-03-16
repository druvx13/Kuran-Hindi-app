package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzxs {
    private String zzacs;
    private String zzcek;
    private String zzcem;
    private String zzceq;
    private boolean zzces;
    private AdInfo zzcgr;
    private Date zzml;
    private Location zzmp;
    private final HashSet<String> zzcgm = new HashSet<>();
    private final Bundle zzcgn = new Bundle();
    private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> zzcgo = new HashMap<>();
    private final HashSet<String> zzcgp = new HashSet<>();
    private final Bundle zzceo = new Bundle();
    private final HashSet<String> zzcgq = new HashSet<>();
    private final List<String> zzcet = new ArrayList();
    private int zzceh = -1;
    private boolean zzbli = false;
    private int zzacq = -1;
    private int zzacr = -1;

    public final void zzch(String str) {
        this.zzcgm.add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final void zza(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            zza(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.zzcgo.put(networkExtras.getClass(), networkExtras);
        }
    }

    public final void zza(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        this.zzcgn.putBundle(cls.getName(), bundle);
    }

    public final void zzb(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.zzcgn.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.zzcgn.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.zzcgn.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    public final void zzci(String str) {
        this.zzcgp.add(str);
    }

    public final void zzcj(String str) {
        this.zzcgp.remove(str);
    }

    @Deprecated
    public final void zza(Date date) {
        this.zzml = date;
    }

    public final void zzck(String str) {
        this.zzcem = str;
    }

    public final void zzb(List<String> list) {
        this.zzcet.clear();
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                zzazw.zzfc("neighboring content URL should not be null or empty");
            } else {
                this.zzcet.add(str);
            }
        }
    }

    @Deprecated
    public final void zzct(int i) {
        this.zzceh = i;
    }

    public final void zza(Location location) {
        this.zzmp = location;
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzbli = z;
    }

    public final void zzcl(String str) {
        this.zzcek = str;
    }

    public final void zzcm(String str) {
        this.zzceq = str;
    }

    @Deprecated
    public final void zzz(boolean z) {
        this.zzacq = z ? 1 : 0;
    }

    public final void zze(String str, String str2) {
        this.zzceo.putString(str, str2);
    }

    public final void zzcn(String str) {
        this.zzcgq.add(str);
    }

    @Deprecated
    public final void zzaa(boolean z) {
        this.zzces = z;
    }

    public final void zza(AdInfo adInfo) {
        this.zzcgr = adInfo;
    }

    @Deprecated
    public final void zzcu(int i) {
        if (i == -1 || i == 0 || i == 1) {
            this.zzacr = i;
        }
    }

    @Deprecated
    public final void zzco(String str) {
        if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
            this.zzacs = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Date zza(zzxs zzxsVar) {
        return zzxsVar.zzml;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzb(zzxs zzxsVar) {
        return zzxsVar.zzcem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List zzc(zzxs zzxsVar) {
        return zzxsVar.zzcet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzd(zzxs zzxsVar) {
        return zzxsVar.zzceh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashSet zze(zzxs zzxsVar) {
        return zzxsVar.zzcgm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Location zzf(zzxs zzxsVar) {
        return zzxsVar.zzmp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzg(zzxs zzxsVar) {
        return zzxsVar.zzbli;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bundle zzh(zzxs zzxsVar) {
        return zzxsVar.zzcgn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashMap zzi(zzxs zzxsVar) {
        return zzxsVar.zzcgo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzj(zzxs zzxsVar) {
        return zzxsVar.zzcek;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzk(zzxs zzxsVar) {
        return zzxsVar.zzceq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzl(zzxs zzxsVar) {
        return zzxsVar.zzacq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashSet zzm(zzxs zzxsVar) {
        return zzxsVar.zzcgp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bundle zzn(zzxs zzxsVar) {
        return zzxsVar.zzceo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashSet zzo(zzxs zzxsVar) {
        return zzxsVar.zzcgq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzp(zzxs zzxsVar) {
        return zzxsVar.zzces;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AdInfo zzq(zzxs zzxsVar) {
        return zzxsVar.zzcgr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzr(zzxs zzxsVar) {
        return zzxsVar.zzacr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzs(zzxs zzxsVar) {
        return zzxsVar.zzacs;
    }
}
