package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzmq {
    private int length;
    private int zzbdb;
    private int zzbdc;
    private int zzbdd;
    private zzhf zzbdi;
    private int zzbcx = 1000;
    private int[] zzbcy = new int[1000];
    private long[] zzany = new long[1000];
    private long[] zzaoa = new long[1000];
    private int[] zzawn = new int[1000];
    private int[] zzanx = new int[1000];
    private zzjw[] zzbcz = new zzjw[1000];
    private zzhf[] zzbda = new zzhf[1000];
    private long zzbde = Long.MIN_VALUE;
    private long zzbdf = Long.MIN_VALUE;
    private boolean zzbdh = true;
    private boolean zzbdg = true;

    public final void zzia() {
        this.zzbdb = 0;
        this.zzbdc = 0;
        this.zzbdd = 0;
        this.length = 0;
        this.zzbdg = true;
    }

    public final void zzib() {
        this.zzbde = Long.MIN_VALUE;
        this.zzbdf = Long.MIN_VALUE;
    }

    public final int zzic() {
        return this.zzbdb + this.length;
    }

    public final synchronized boolean zzid() {
        return this.length != 0;
    }

    public final synchronized zzhf zzie() {
        if (this.zzbdh) {
            return null;
        }
        return this.zzbdi;
    }

    public final synchronized long zzhu() {
        return Math.max(this.zzbde, this.zzbdf);
    }

    public final synchronized int zza(zzhh zzhhVar, zzjb zzjbVar, boolean z, boolean z2, zzhf zzhfVar, zzmp zzmpVar) {
        if (!zzid()) {
            if (z2) {
                zzjbVar.setFlags(4);
                return -4;
            } else if (this.zzbdi == null || (!z && this.zzbdi == zzhfVar)) {
                return -3;
            } else {
                zzhhVar.zzahd = this.zzbdi;
                return -5;
            }
        }
        if (!z && this.zzbda[this.zzbdc] == zzhfVar) {
            if (zzjbVar.zzcs == null) {
                return -3;
            }
            zzjbVar.timeUs = this.zzaoa[this.zzbdc];
            zzjbVar.setFlags(this.zzawn[this.zzbdc]);
            zzmpVar.size = this.zzanx[this.zzbdc];
            zzmpVar.zzavy = this.zzany[this.zzbdc];
            zzmpVar.zzaqs = this.zzbcz[this.zzbdc];
            this.zzbde = Math.max(this.zzbde, zzjbVar.timeUs);
            this.length--;
            int i = this.zzbdc + 1;
            this.zzbdc = i;
            this.zzbdb++;
            if (i == this.zzbcx) {
                this.zzbdc = 0;
            }
            zzmpVar.zzbcw = this.length > 0 ? this.zzany[this.zzbdc] : zzmpVar.zzavy + zzmpVar.size;
            return -4;
        }
        zzhhVar.zzahd = this.zzbda[this.zzbdc];
        return -5;
    }

    public final synchronized long zzif() {
        if (zzid()) {
            int i = ((this.zzbdc + this.length) - 1) % this.zzbcx;
            this.zzbdc = (this.zzbdc + this.length) % this.zzbcx;
            this.zzbdb += this.length;
            this.length = 0;
            return this.zzany[i] + this.zzanx[i];
        }
        return -1L;
    }

    public final synchronized long zzd(long j, boolean z) {
        if (zzid() && j >= this.zzaoa[this.zzbdc]) {
            if (j <= this.zzbdf || z) {
                int i = 0;
                int i2 = this.zzbdc;
                int i3 = -1;
                while (i2 != this.zzbdd && this.zzaoa[i2] <= j) {
                    if ((this.zzawn[i2] & 1) != 0) {
                        i3 = i;
                    }
                    i2 = (i2 + 1) % this.zzbcx;
                    i++;
                }
                if (i3 == -1) {
                    return -1L;
                }
                int i4 = (this.zzbdc + i3) % this.zzbcx;
                this.zzbdc = i4;
                this.zzbdb += i3;
                this.length -= i3;
                return this.zzany[i4];
            }
            return -1L;
        }
        return -1L;
    }

    public final synchronized boolean zzg(zzhf zzhfVar) {
        if (zzhfVar == null) {
            this.zzbdh = true;
            return false;
        }
        this.zzbdh = false;
        if (zzov.zza(zzhfVar, this.zzbdi)) {
            return false;
        }
        this.zzbdi = zzhfVar;
        return true;
    }

    public final synchronized void zza(long j, int i, long j2, int i2, zzjw zzjwVar) {
        if (this.zzbdg) {
            if ((i & 1) == 0) {
                return;
            }
            this.zzbdg = false;
        }
        zzoh.checkState(!this.zzbdh);
        zzei(j);
        this.zzaoa[this.zzbdd] = j;
        this.zzany[this.zzbdd] = j2;
        this.zzanx[this.zzbdd] = i2;
        this.zzawn[this.zzbdd] = i;
        this.zzbcz[this.zzbdd] = zzjwVar;
        this.zzbda[this.zzbdd] = this.zzbdi;
        this.zzbcy[this.zzbdd] = 0;
        int i3 = this.length + 1;
        this.length = i3;
        if (i3 == this.zzbcx) {
            int i4 = this.zzbcx + 1000;
            int[] iArr = new int[i4];
            long[] jArr = new long[i4];
            long[] jArr2 = new long[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            zzjw[] zzjwVarArr = new zzjw[i4];
            zzhf[] zzhfVarArr = new zzhf[i4];
            int i5 = this.zzbcx - this.zzbdc;
            System.arraycopy(this.zzany, this.zzbdc, jArr, 0, i5);
            System.arraycopy(this.zzaoa, this.zzbdc, jArr2, 0, i5);
            System.arraycopy(this.zzawn, this.zzbdc, iArr2, 0, i5);
            System.arraycopy(this.zzanx, this.zzbdc, iArr3, 0, i5);
            System.arraycopy(this.zzbcz, this.zzbdc, zzjwVarArr, 0, i5);
            System.arraycopy(this.zzbda, this.zzbdc, zzhfVarArr, 0, i5);
            System.arraycopy(this.zzbcy, this.zzbdc, iArr, 0, i5);
            int i6 = this.zzbdc;
            System.arraycopy(this.zzany, 0, jArr, i5, i6);
            System.arraycopy(this.zzaoa, 0, jArr2, i5, i6);
            System.arraycopy(this.zzawn, 0, iArr2, i5, i6);
            System.arraycopy(this.zzanx, 0, iArr3, i5, i6);
            System.arraycopy(this.zzbcz, 0, zzjwVarArr, i5, i6);
            System.arraycopy(this.zzbda, 0, zzhfVarArr, i5, i6);
            System.arraycopy(this.zzbcy, 0, iArr, i5, i6);
            this.zzany = jArr;
            this.zzaoa = jArr2;
            this.zzawn = iArr2;
            this.zzanx = iArr3;
            this.zzbcz = zzjwVarArr;
            this.zzbda = zzhfVarArr;
            this.zzbcy = iArr;
            this.zzbdc = 0;
            this.zzbdd = this.zzbcx;
            this.length = this.zzbcx;
            this.zzbcx = i4;
            return;
        }
        int i7 = this.zzbdd + 1;
        this.zzbdd = i7;
        if (i7 == this.zzbcx) {
            this.zzbdd = 0;
        }
    }

    public final synchronized void zzei(long j) {
        this.zzbdf = Math.max(this.zzbdf, j);
    }
}
