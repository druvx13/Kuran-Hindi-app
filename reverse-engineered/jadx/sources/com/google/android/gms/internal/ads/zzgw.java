package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzgw implements zzgt {
    private int repeatMode;
    private final zzhk[] zzads;
    private final zzno zzadt;
    private final zznl zzadu;
    private final zzdns zzadv;
    private final zzgy zzadw;
    private final CopyOnWriteArraySet<zzgs> zzadx;
    private final zzhq zzady;
    private final zzhr zzadz;
    private boolean zzaea;
    private boolean zzaeb;
    private int zzaec;
    private int zzaed;
    private int zzaee;
    private boolean zzaef;
    private zzhp zzaeg;
    private Object zzaeh;
    private zzna zzaei;
    private zznl zzaej;
    private zzhl zzaek;
    private zzha zzael;
    private int zzaem;
    private int zzaen;
    private long zzaeo;

    public zzgw(zzhk[] zzhkVarArr, zzno zznoVar, zzhj zzhjVar) {
        String str = zzov.zzbhv;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        zzoh.checkState(zzhkVarArr.length > 0);
        this.zzads = (zzhk[]) zzoh.checkNotNull(zzhkVarArr);
        this.zzadt = (zzno) zzoh.checkNotNull(zznoVar);
        this.zzaeb = false;
        this.repeatMode = 0;
        this.zzaec = 1;
        this.zzadx = new CopyOnWriteArraySet<>();
        this.zzadu = new zznl(new zznj[zzhkVarArr.length]);
        this.zzaeg = zzhp.zzahk;
        this.zzady = new zzhq();
        this.zzadz = new zzhr();
        this.zzaei = zzna.zzbee;
        this.zzaej = this.zzadu;
        this.zzaek = zzhl.zzahe;
        this.zzadv = new zzgz(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        zzha zzhaVar = new zzha(0, 0L);
        this.zzael = zzhaVar;
        this.zzadw = new zzgy(zzhkVarArr, zznoVar, zzhjVar, this.zzaeb, 0, this.zzadv, zzhaVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    public final void zza(zzgs zzgsVar) {
        this.zzadx.add(zzgsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    public final void zzb(zzgs zzgsVar) {
        this.zzadx.remove(zzgsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    public final int getPlaybackState() {
        return this.zzaec;
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    public final void zza(zzmk zzmkVar) {
        if (!this.zzaeg.isEmpty() || this.zzaeh != null) {
            this.zzaeg = zzhp.zzahk;
            this.zzaeh = null;
            Iterator<zzgs> it = this.zzadx.iterator();
            while (it.hasNext()) {
                it.next().zza(this.zzaeg, this.zzaeh);
            }
        }
        if (this.zzaea) {
            this.zzaea = false;
            this.zzaei = zzna.zzbee;
            this.zzaej = this.zzadu;
            this.zzadt.zzd(null);
            Iterator<zzgs> it2 = this.zzadx.iterator();
            while (it2.hasNext()) {
                it2.next().zza(this.zzaei, this.zzaej);
            }
        }
        this.zzaee++;
        this.zzadw.zza(zzmkVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    public final void zzg(boolean z) {
        if (this.zzaeb != z) {
            this.zzaeb = z;
            this.zzadw.zzg(z);
            Iterator<zzgs> it = this.zzadx.iterator();
            while (it.hasNext()) {
                it.next().zza(z, this.zzaec);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    public final boolean zzek() {
        return this.zzaeb;
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    public final void seekTo(long j) {
        long zzdp;
        int zzen = zzen();
        if (zzen < 0 || (!this.zzaeg.isEmpty() && zzen >= this.zzaeg.zzfe())) {
            throw new zzhg(this.zzaeg, zzen, j);
        }
        this.zzaed++;
        this.zzaem = zzen;
        if (!this.zzaeg.isEmpty()) {
            this.zzaeg.zza(zzen, this.zzady, false);
            if (j == -9223372036854775807L) {
                zzdp = this.zzady.zzahs;
            } else {
                zzdp = zzgr.zzdp(j);
            }
            long j2 = this.zzady.zzahu + zzdp;
            long j3 = this.zzaeg.zza(0, this.zzadz, false).zzaht;
            if (j3 != -9223372036854775807L) {
                int i = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
            }
        }
        this.zzaen = 0;
        if (j == -9223372036854775807L) {
            this.zzaeo = 0L;
            this.zzadw.zza(this.zzaeg, zzen, -9223372036854775807L);
            return;
        }
        this.zzaeo = j;
        this.zzadw.zza(this.zzaeg, zzen, zzgr.zzdp(j));
        Iterator<zzgs> it = this.zzadx.iterator();
        while (it.hasNext()) {
            it.next().zzej();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    public final void stop() {
        this.zzadw.stop();
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    public final void release() {
        this.zzadw.release();
        this.zzadv.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    public final void zza(zzgu... zzguVarArr) {
        this.zzadw.zza(zzguVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    public final void zzb(zzgu... zzguVarArr) {
        this.zzadw.zzb(zzguVarArr);
    }

    private final int zzen() {
        if (this.zzaeg.isEmpty() || this.zzaed > 0) {
            return this.zzaem;
        }
        this.zzaeg.zza(this.zzael.zzafl, this.zzadz, false);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    public final long getDuration() {
        if (this.zzaeg.isEmpty()) {
            return -9223372036854775807L;
        }
        return zzgr.zzdo(this.zzaeg.zza(zzen(), this.zzady, false).zzaht);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    public final long zzem() {
        if (this.zzaeg.isEmpty() || this.zzaed > 0) {
            return this.zzaeo;
        }
        this.zzaeg.zza(this.zzael.zzafl, this.zzadz, false);
        return this.zzadz.zzfg() + zzgr.zzdo(this.zzael.zzafn);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    public final long getBufferedPosition() {
        if (this.zzaeg.isEmpty() || this.zzaed > 0) {
            return this.zzaeo;
        }
        this.zzaeg.zza(this.zzael.zzafl, this.zzadz, false);
        return this.zzadz.zzfg() + zzgr.zzdo(this.zzael.zzafo);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    public final int zzel() {
        return this.zzads.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Message message) {
        switch (message.what) {
            case 0:
                this.zzaee--;
                return;
            case 1:
                this.zzaec = message.arg1;
                Iterator<zzgs> it = this.zzadx.iterator();
                while (it.hasNext()) {
                    it.next().zza(this.zzaeb, this.zzaec);
                }
                return;
            case 2:
                this.zzaef = message.arg1 != 0;
                Iterator<zzgs> it2 = this.zzadx.iterator();
                while (it2.hasNext()) {
                    it2.next().zzf(this.zzaef);
                }
                return;
            case 3:
                if (this.zzaee == 0) {
                    zznq zznqVar = (zznq) message.obj;
                    this.zzaea = true;
                    this.zzaei = zznqVar.zzbfg;
                    this.zzaej = zznqVar.zzbfh;
                    this.zzadt.zzd(zznqVar.zzbfi);
                    Iterator<zzgs> it3 = this.zzadx.iterator();
                    while (it3.hasNext()) {
                        it3.next().zza(this.zzaei, this.zzaej);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.zzaed - 1;
                this.zzaed = i;
                if (i == 0) {
                    this.zzael = (zzha) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<zzgs> it4 = this.zzadx.iterator();
                        while (it4.hasNext()) {
                            it4.next().zzej();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.zzaed == 0) {
                    this.zzael = (zzha) message.obj;
                    Iterator<zzgs> it5 = this.zzadx.iterator();
                    while (it5.hasNext()) {
                        it5.next().zzej();
                    }
                    return;
                }
                return;
            case 6:
                zzhc zzhcVar = (zzhc) message.obj;
                this.zzaed -= zzhcVar.zzaga;
                if (this.zzaee == 0) {
                    this.zzaeg = zzhcVar.zzaeg;
                    this.zzaeh = zzhcVar.zzaeh;
                    this.zzael = zzhcVar.zzael;
                    Iterator<zzgs> it6 = this.zzadx.iterator();
                    while (it6.hasNext()) {
                        it6.next().zza(this.zzaeg, this.zzaeh);
                    }
                    return;
                }
                return;
            case 7:
                zzhl zzhlVar = (zzhl) message.obj;
                if (this.zzaek.equals(zzhlVar)) {
                    return;
                }
                this.zzaek = zzhlVar;
                Iterator<zzgs> it7 = this.zzadx.iterator();
                while (it7.hasNext()) {
                    it7.next().zza(zzhlVar);
                }
                return;
            case 8:
                zzgq zzgqVar = (zzgq) message.obj;
                Iterator<zzgs> it8 = this.zzadx.iterator();
                while (it8.hasNext()) {
                    it8.next().zza(zzgqVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
