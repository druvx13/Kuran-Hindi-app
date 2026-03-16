package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzawc {
    private final Clock zzbnt;
    private final String zzdmj;
    private final zzawo zzdtl;
    private final String zzdtn;
    private final Object lock = new Object();
    private long zzdnx = -1;
    private long zzdto = -1;
    private boolean zzdnt = false;
    private long zzdtp = -1;
    private long zzdtq = 0;
    private long zzdtr = -1;
    private long zzdts = -1;
    private final LinkedList<zzawb> zzdtm = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawc(Clock clock, zzawo zzawoVar, String str, String str2) {
        this.zzbnt = clock;
        this.zzdtl = zzawoVar;
        this.zzdtn = str;
        this.zzdmj = str2;
    }

    public final void zze(zzuj zzujVar) {
        synchronized (this.lock) {
            long elapsedRealtime = this.zzbnt.elapsedRealtime();
            this.zzdtr = elapsedRealtime;
            this.zzdtl.zza(zzujVar, elapsedRealtime);
        }
    }

    public final void zzey(long j) {
        synchronized (this.lock) {
            this.zzdts = j;
            if (j != -1) {
                this.zzdtl.zzb(this);
            }
        }
    }

    public final void zzvr() {
        synchronized (this.lock) {
            if (this.zzdts != -1 && this.zzdto == -1) {
                this.zzdto = this.zzbnt.elapsedRealtime();
                this.zzdtl.zzb(this);
            }
            this.zzdtl.zzvr();
        }
    }

    public final void zzvs() {
        synchronized (this.lock) {
            if (this.zzdts != -1) {
                zzawb zzawbVar = new zzawb(this);
                zzawbVar.zzvq();
                this.zzdtm.add(zzawbVar);
                this.zzdtq++;
                this.zzdtl.zzvs();
                this.zzdtl.zzb(this);
            }
        }
    }

    public final void zzvt() {
        synchronized (this.lock) {
            if (this.zzdts != -1 && !this.zzdtm.isEmpty()) {
                zzawb last = this.zzdtm.getLast();
                if (last.zzvo() == -1) {
                    last.zzvp();
                    this.zzdtl.zzb(this);
                }
            }
        }
    }

    public final void zzan(boolean z) {
        synchronized (this.lock) {
            if (this.zzdts != -1) {
                this.zzdtp = this.zzbnt.elapsedRealtime();
            }
        }
    }

    public final Bundle toBundle() {
        Bundle bundle;
        synchronized (this.lock) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.zzdtn);
            bundle.putString("slotid", this.zzdmj);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.zzdtr);
            bundle.putLong("tresponse", this.zzdts);
            bundle.putLong("timp", this.zzdto);
            bundle.putLong("tload", this.zzdtp);
            bundle.putLong("pcc", this.zzdtq);
            bundle.putLong("tfetch", this.zzdnx);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<zzawb> it = this.zzdtm.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toBundle());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String zzvu() {
        return this.zzdtn;
    }
}
