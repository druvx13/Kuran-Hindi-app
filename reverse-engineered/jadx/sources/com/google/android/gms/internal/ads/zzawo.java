package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzawo implements zzqq {
    private final zzawt zzduw;
    private final zzawk zzdvd;
    private final Object lock = new Object();
    private final HashSet<zzawc> zzdve = new HashSet<>();
    private final HashSet<zzawl> zzdvf = new HashSet<>();
    private final zzawm zzdvc = new zzawm();

    public zzawo(String str, zzawt zzawtVar) {
        this.zzdvd = new zzawk(str, zzawtVar);
        this.zzduw = zzawtVar;
    }

    public final void zzb(zzawc zzawcVar) {
        synchronized (this.lock) {
            this.zzdve.add(zzawcVar);
        }
    }

    public final void zzb(HashSet<zzawc> hashSet) {
        synchronized (this.lock) {
            this.zzdve.addAll(hashSet);
        }
    }

    public final Bundle zza(Context context, zzawj zzawjVar) {
        HashSet<zzawc> hashSet = new HashSet<>();
        synchronized (this.lock) {
            hashSet.addAll(this.zzdve);
            this.zzdve.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zzdvd.zzo(context, this.zzdvc.zzwm()));
        Bundle bundle2 = new Bundle();
        Iterator<zzawl> it = this.zzdvf.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NoSuchMethodError();
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<zzawc> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().toBundle());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzawjVar.zza(hashSet);
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    public final void zzp(boolean z) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis();
        if (z) {
            if (currentTimeMillis - this.zzduw.zzwx() > ((Long) zzvj.zzpv().zzd(zzzz.zzclp)).longValue()) {
                this.zzdvd.zzdut = -1;
                return;
            }
            this.zzdvd.zzdut = this.zzduw.zzwy();
            return;
        }
        this.zzduw.zzez(currentTimeMillis);
        this.zzduw.zzcz(this.zzdvd.zzdut);
    }

    public final void zzvs() {
        synchronized (this.lock) {
            this.zzdvd.zzvs();
        }
    }

    public final void zzvr() {
        synchronized (this.lock) {
            this.zzdvd.zzvr();
        }
    }

    public final void zza(zzuj zzujVar, long j) {
        synchronized (this.lock) {
            this.zzdvd.zza(zzujVar, j);
        }
    }

    public final zzawc zza(Clock clock, String str) {
        return new zzawc(clock, this, this.zzdvc.zzwl(), str);
    }
}
