package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzxt {
    private final int zzacq;
    private final int zzacr;
    private final String zzacs;
    private final boolean zzbli;
    private final int zzceh;
    private final String zzcek;
    private final String zzcem;
    private final Bundle zzceo;
    private final String zzceq;
    private final boolean zzces;
    private final List<String> zzcet;
    private final Bundle zzcgn;
    private final AdInfo zzcgr;
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> zzcgs;
    private final SearchAdRequest zzcgt;
    private final Set<String> zzcgu;
    private final Set<String> zzcgv;
    private final Date zzml;
    private final Set<String> zzmn;
    private final Location zzmp;

    public zzxt(zzxs zzxsVar) {
        this(zzxsVar, null);
    }

    public zzxt(zzxs zzxsVar, SearchAdRequest searchAdRequest) {
        this.zzml = zzxs.zza(zzxsVar);
        this.zzcem = zzxs.zzb(zzxsVar);
        this.zzcet = zzxs.zzc(zzxsVar);
        this.zzceh = zzxs.zzd(zzxsVar);
        this.zzmn = Collections.unmodifiableSet(zzxs.zze(zzxsVar));
        this.zzmp = zzxs.zzf(zzxsVar);
        this.zzbli = zzxs.zzg(zzxsVar);
        this.zzcgn = zzxs.zzh(zzxsVar);
        this.zzcgs = Collections.unmodifiableMap(zzxs.zzi(zzxsVar));
        this.zzcek = zzxs.zzj(zzxsVar);
        this.zzceq = zzxs.zzk(zzxsVar);
        this.zzcgt = searchAdRequest;
        this.zzacq = zzxs.zzl(zzxsVar);
        this.zzcgu = Collections.unmodifiableSet(zzxs.zzm(zzxsVar));
        this.zzceo = zzxs.zzn(zzxsVar);
        this.zzcgv = Collections.unmodifiableSet(zzxs.zzo(zzxsVar));
        this.zzces = zzxs.zzp(zzxsVar);
        this.zzcgr = zzxs.zzq(zzxsVar);
        this.zzacr = zzxs.zzr(zzxsVar);
        this.zzacs = zzxs.zzs(zzxsVar);
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zzml;
    }

    public final String getContentUrl() {
        return this.zzcem;
    }

    public final List<String> zzqh() {
        return new ArrayList(this.zzcet);
    }

    @Deprecated
    public final int getGender() {
        return this.zzceh;
    }

    public final Set<String> getKeywords() {
        return this.zzmn;
    }

    public final Location getLocation() {
        return this.zzmp;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzbli;
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.zzcgs.get(cls);
    }

    public final Bundle getNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls) {
        return this.zzcgn.getBundle(cls.getName());
    }

    public final Bundle getCustomEventExtrasBundle(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.zzcgn.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final String getPublisherProvidedId() {
        return this.zzcek;
    }

    public final String zzqi() {
        return this.zzceq;
    }

    public final SearchAdRequest zzqj() {
        return this.zzcgt;
    }

    public final boolean isTestDevice(Context context) {
        RequestConfiguration requestConfiguration = zzxw.zzqq().getRequestConfiguration();
        zzvj.zzpr();
        String zzbk = zzazm.zzbk(context);
        return this.zzcgu.contains(zzbk) || requestConfiguration.getTestDeviceIds().contains(zzbk);
    }

    public final Map<Class<? extends NetworkExtras>, NetworkExtras> zzqk() {
        return this.zzcgs;
    }

    public final Bundle zzql() {
        return this.zzcgn;
    }

    public final int zzqm() {
        return this.zzacq;
    }

    public final Bundle getCustomTargeting() {
        return this.zzceo;
    }

    public final Set<String> zzqn() {
        return this.zzcgv;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzces;
    }

    public final AdInfo zzqo() {
        return this.zzcgr;
    }

    public final int zzqp() {
        return this.zzacr;
    }

    public final String getMaxAdContentRating() {
        return this.zzacs;
    }
}
