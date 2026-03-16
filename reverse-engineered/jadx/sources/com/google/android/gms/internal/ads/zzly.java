package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzly implements zzjo, zzmi, zzmu, zzoe<zzmb> {
    private final Uri uri;
    private final zzdns zzadv;
    private boolean zzaez;
    private boolean zzafv;
    private long zzaht;
    private final zznu zzans;
    private final int zzbav;
    private final zzmf zzbaw;
    private final zzmj zzbax;
    private final zzns zzbay;
    private final String zzbaz;
    private final long zzbba;
    private final zzme zzbbc;
    private zzmh zzbbh;
    private zzjr zzbbi;
    private boolean zzbbj;
    private boolean zzbbk;
    private boolean zzbbl;
    private int zzbbm;
    private zzna zzbbn;
    private boolean[] zzbbo;
    private boolean[] zzbbp;
    private boolean zzbbq;
    private long zzbbr;
    private int zzbbt;
    private boolean zzbbu;
    private final zzob zzbbb = new zzob("Loader:ExtractorMediaPeriod");
    private final zzoj zzbbd = new zzoj();
    private final Runnable zzbbe = new zzlx(this);
    private final Runnable zzbbf = new zzma(this);
    private final zzdns zzaes = new zzdns();
    private long zzbbs = -9223372036854775807L;
    private final SparseArray<zzms> zzbbg = new SparseArray<>();
    private long zzce = -1;

    public zzly(Uri uri, zznu zznuVar, zzjm[] zzjmVarArr, int i, zzdns zzdnsVar, zzmf zzmfVar, zzmj zzmjVar, zzns zznsVar, String str, int i2) {
        this.uri = uri;
        this.zzans = zznuVar;
        this.zzbav = i;
        this.zzadv = zzdnsVar;
        this.zzbaw = zzmfVar;
        this.zzbax = zzmjVar;
        this.zzbay = zznsVar;
        this.zzbaz = str;
        this.zzbba = i2;
        this.zzbbc = new zzme(zzjmVarArr, this);
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzef(long j) {
    }

    public final void release() {
        this.zzbbb.zza(new zzlz(this, this.zzbbc));
        this.zzaes.removeCallbacksAndMessages(null);
        this.zzaez = true;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zza(zzmh zzmhVar, long j) {
        this.zzbbh = zzmhVar;
        this.zzbbd.open();
        startLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzhn() throws IOException {
        this.zzbbb.zzbd(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final zzna zzho() {
        return this.zzbbn;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final long zza(zznj[] zznjVarArr, boolean[] zArr, zzmt[] zzmtVarArr, boolean[] zArr2, long j) {
        int i;
        zzoh.checkState(this.zzafv);
        for (int i2 = 0; i2 < zznjVarArr.length; i2++) {
            if (zzmtVarArr[i2] != null && (zznjVarArr[i2] == null || !zArr[i2])) {
                i = ((zzmd) zzmtVarArr[i2]).track;
                zzoh.checkState(this.zzbbo[i]);
                this.zzbbm--;
                this.zzbbo[i] = false;
                this.zzbbg.valueAt(i).disable();
                zzmtVarArr[i2] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < zznjVarArr.length; i3++) {
            if (zzmtVarArr[i3] == null && zznjVarArr[i3] != null) {
                zznj zznjVar = zznjVarArr[i3];
                zzoh.checkState(zznjVar.length() == 1);
                zzoh.checkState(zznjVar.zzaz(0) == 0);
                int zza = this.zzbbn.zza(zznjVar.zzik());
                zzoh.checkState(!this.zzbbo[zza]);
                this.zzbbm++;
                this.zzbbo[zza] = true;
                zzmtVarArr[i3] = new zzmd(this, zza);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.zzbbk) {
            int size = this.zzbbg.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.zzbbo[i4]) {
                    this.zzbbg.valueAt(i4).disable();
                }
            }
        }
        if (this.zzbbm == 0) {
            this.zzbbl = false;
            if (this.zzbbb.isLoading()) {
                this.zzbbb.zzir();
            }
        } else if (!this.zzbbk ? j != 0 : z) {
            j = zzeg(j);
            for (int i5 = 0; i5 < zzmtVarArr.length; i5++) {
                if (zzmtVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.zzbbk = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzmi, com.google.android.gms.internal.ads.zzmw
    public final boolean zzee(long j) {
        if (this.zzbbu) {
            return false;
        }
        if (this.zzafv && this.zzbbm == 0) {
            return false;
        }
        boolean open = this.zzbbd.open();
        if (this.zzbbb.isLoading()) {
            return open;
        }
        startLoading();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzmi, com.google.android.gms.internal.ads.zzmw
    public final long zzhm() {
        if (this.zzbbm == 0) {
            return Long.MIN_VALUE;
        }
        return zzhq();
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final long zzhp() {
        if (this.zzbbl) {
            this.zzbbl = false;
            return this.zzbbr;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final long zzhq() {
        long zzhu;
        if (this.zzbbu) {
            return Long.MIN_VALUE;
        }
        if (zzhv()) {
            return this.zzbbs;
        }
        if (this.zzbbq) {
            zzhu = Long.MAX_VALUE;
            int size = this.zzbbg.size();
            for (int i = 0; i < size; i++) {
                if (this.zzbbp[i]) {
                    zzhu = Math.min(zzhu, this.zzbbg.valueAt(i).zzhu());
                }
            }
        } else {
            zzhu = zzhu();
        }
        return zzhu == Long.MIN_VALUE ? this.zzbbr : zzhu;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final long zzeg(long j) {
        if (!this.zzbbi.isSeekable()) {
            j = 0;
        }
        this.zzbbr = j;
        int size = this.zzbbg.size();
        boolean z = !zzhv();
        for (int i = 0; z && i < size; i++) {
            if (this.zzbbo[i]) {
                z = this.zzbbg.valueAt(i).zze(j, false);
            }
        }
        if (!z) {
            this.zzbbs = j;
            this.zzbbu = false;
            if (this.zzbbb.isLoading()) {
                this.zzbbb.zzir();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    this.zzbbg.valueAt(i2).zzk(this.zzbbo[i2]);
                }
            }
        }
        this.zzbbl = false;
        return j;
    }

    public final boolean zzav(int i) {
        if (this.zzbbu) {
            return true;
        }
        return !zzhv() && this.zzbbg.valueAt(i).zzid();
    }

    public final void zzhr() throws IOException {
        this.zzbbb.zzbd(Integer.MIN_VALUE);
    }

    public final int zza(int i, zzhh zzhhVar, zzjb zzjbVar, boolean z) {
        if (this.zzbbl || zzhv()) {
            return -3;
        }
        return this.zzbbg.valueAt(i).zza(zzhhVar, zzjbVar, z, this.zzbbu, this.zzbbr);
    }

    public final void zzd(int i, long j) {
        zzms valueAt = this.zzbbg.valueAt(i);
        if (this.zzbbu && j > valueAt.zzhu()) {
            valueAt.zzih();
        } else {
            valueAt.zze(j, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjo
    public final zzjt zzc(int i, int i2) {
        zzms zzmsVar = this.zzbbg.get(i);
        if (zzmsVar == null) {
            zzms zzmsVar2 = new zzms(this.zzbay);
            zzmsVar2.zza(this);
            this.zzbbg.put(i, zzmsVar2);
            return zzmsVar2;
        }
        return zzmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjo
    public final void zzgr() {
        this.zzbbj = true;
        this.zzaes.post(this.zzbbe);
    }

    @Override // com.google.android.gms.internal.ads.zzjo
    public final void zza(zzjr zzjrVar) {
        this.zzbbi = zzjrVar;
        this.zzaes.post(this.zzbbe);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzf(zzhf zzhfVar) {
        this.zzaes.post(this.zzbbe);
    }

    public final void zzhs() {
        if (this.zzaez || this.zzafv || this.zzbbi == null || !this.zzbbj) {
            return;
        }
        int size = this.zzbbg.size();
        for (int i = 0; i < size; i++) {
            if (this.zzbbg.valueAt(i).zzie() == null) {
                return;
            }
        }
        this.zzbbd.zzit();
        zzmx[] zzmxVarArr = new zzmx[size];
        this.zzbbp = new boolean[size];
        this.zzbbo = new boolean[size];
        this.zzaht = this.zzbbi.getDurationUs();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < size) {
                zzhf zzie = this.zzbbg.valueAt(i2).zzie();
                zzmxVarArr[i2] = new zzmx(zzie);
                String str = zzie.zzagi;
                if (!zzoo.zzbe(str) && !zzoo.zzbd(str)) {
                    z = false;
                }
                this.zzbbp[i2] = z;
                this.zzbbq = z | this.zzbbq;
                i2++;
            } else {
                this.zzbbn = new zzna(zzmxVarArr);
                this.zzafv = true;
                this.zzbax.zzb(new zzmy(this.zzaht, this.zzbbi.isSeekable()), null);
                this.zzbbh.zza((zzmi) this);
                return;
            }
        }
    }

    private final void zza(zzmb zzmbVar) {
        long j;
        if (this.zzce == -1) {
            j = zzmbVar.zzce;
            this.zzce = j;
        }
    }

    private final void startLoading() {
        zzjr zzjrVar;
        zzmb zzmbVar = new zzmb(this, this.uri, this.zzans, this.zzbbc, this.zzbbd);
        if (this.zzafv) {
            zzoh.checkState(zzhv());
            long j = this.zzaht;
            if (j != -9223372036854775807L && this.zzbbs >= j) {
                this.zzbbu = true;
                this.zzbbs = -9223372036854775807L;
                return;
            }
            zzmbVar.zze(this.zzbbi.zzdz(this.zzbbs), this.zzbbs);
            this.zzbbs = -9223372036854775807L;
        }
        this.zzbbt = zzht();
        int i = this.zzbav;
        if (i == -1) {
            i = (this.zzafv && this.zzce == -1 && ((zzjrVar = this.zzbbi) == null || zzjrVar.getDurationUs() == -9223372036854775807L)) ? 6 : 3;
        }
        this.zzbbb.zza(zzmbVar, this, i);
    }

    private final int zzht() {
        int size = this.zzbbg.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.zzbbg.valueAt(i2).zzic();
        }
        return i;
    }

    private final long zzhu() {
        int size = this.zzbbg.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.zzbbg.valueAt(i).zzhu());
        }
        return j;
    }

    private final boolean zzhv() {
        return this.zzbbs != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final /* synthetic */ int zza(zzmb zzmbVar, long j, long j2, IOException iOException) {
        zzjr zzjrVar;
        zzmb zzmbVar2 = zzmbVar;
        zza(zzmbVar2);
        zzdns zzdnsVar = this.zzadv;
        if (zzdnsVar != null && this.zzbaw != null) {
            zzdnsVar.post(new zzmc(this, iOException));
        }
        if (iOException instanceof zzmz) {
            return 3;
        }
        boolean z = zzht() > this.zzbbt;
        if (this.zzce == -1 && ((zzjrVar = this.zzbbi) == null || zzjrVar.getDurationUs() == -9223372036854775807L)) {
            this.zzbbr = 0L;
            this.zzbbl = this.zzafv;
            int size = this.zzbbg.size();
            for (int i = 0; i < size; i++) {
                this.zzbbg.valueAt(i).zzk(!this.zzafv || this.zzbbo[i]);
            }
            zzmbVar2.zze(0L, 0L);
        }
        this.zzbbt = zzht();
        return z ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final /* synthetic */ void zza(zzmb zzmbVar, long j, long j2, boolean z) {
        zza(zzmbVar);
        if (z || this.zzbbm <= 0) {
            return;
        }
        int size = this.zzbbg.size();
        for (int i = 0; i < size; i++) {
            this.zzbbg.valueAt(i).zzk(this.zzbbo[i]);
        }
        this.zzbbh.zza((zzmh) this);
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final /* synthetic */ void zza(zzmb zzmbVar, long j, long j2) {
        zza(zzmbVar);
        this.zzbbu = true;
        if (this.zzaht == -9223372036854775807L) {
            long zzhu = zzhu();
            this.zzaht = zzhu == Long.MIN_VALUE ? 0L : zzhu + 10000;
            this.zzbax.zzb(new zzmy(this.zzaht, this.zzbbi.isSeekable()), null);
        }
        this.zzbbh.zza((zzmh) this);
    }
}
