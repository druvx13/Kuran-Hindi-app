package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzny implements zzns {
    private final boolean zzbgf;
    private final int zzbgg;
    private final byte[] zzbgh;
    private final zznp[] zzbgi;
    private int zzbgj;
    private int zzbgk;
    private int zzbgl;
    private zznp[] zzbgm;

    public zzny(boolean z, int i) {
        this(true, 65536, 0);
    }

    private zzny(boolean z, int i, int i2) {
        zzoh.checkArgument(true);
        zzoh.checkArgument(true);
        this.zzbgf = true;
        this.zzbgg = 65536;
        this.zzbgl = 0;
        this.zzbgm = new zznp[100];
        this.zzbgh = null;
        this.zzbgi = new zznp[1];
    }

    public final synchronized void reset() {
        if (this.zzbgf) {
            zzbc(0);
        }
    }

    public final synchronized void zzbc(int i) {
        boolean z = i < this.zzbgj;
        this.zzbgj = i;
        if (z) {
            zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final synchronized zznp zzim() {
        zznp zznpVar;
        this.zzbgk++;
        if (this.zzbgl > 0) {
            zznp[] zznpVarArr = this.zzbgm;
            int i = this.zzbgl - 1;
            this.zzbgl = i;
            zznpVar = zznpVarArr[i];
            this.zzbgm[i] = null;
        } else {
            zznpVar = new zznp(new byte[this.zzbgg], 0);
        }
        return zznpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final synchronized void zza(zznp zznpVar) {
        this.zzbgi[0] = zznpVar;
        zza(this.zzbgi);
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final synchronized void zza(zznp[] zznpVarArr) {
        boolean z;
        if (this.zzbgl + zznpVarArr.length >= this.zzbgm.length) {
            this.zzbgm = (zznp[]) Arrays.copyOf(this.zzbgm, Math.max(this.zzbgm.length << 1, this.zzbgl + zznpVarArr.length));
        }
        for (zznp zznpVar : zznpVarArr) {
            if (zznpVar.data != null && zznpVar.data.length != this.zzbgg) {
                z = false;
                zzoh.checkArgument(z);
                zznp[] zznpVarArr2 = this.zzbgm;
                int i = this.zzbgl;
                this.zzbgl = i + 1;
                zznpVarArr2[i] = zznpVar;
            }
            z = true;
            zzoh.checkArgument(z);
            zznp[] zznpVarArr22 = this.zzbgm;
            int i2 = this.zzbgl;
            this.zzbgl = i2 + 1;
            zznpVarArr22[i2] = zznpVar;
        }
        this.zzbgk -= zznpVarArr.length;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final synchronized void zzn() {
        int max = Math.max(0, zzov.zzf(this.zzbgj, this.zzbgg) - this.zzbgk);
        if (max >= this.zzbgl) {
            return;
        }
        Arrays.fill(this.zzbgm, max, this.zzbgl, (Object) null);
        this.zzbgl = max;
    }

    public final synchronized int zziq() {
        return this.zzbgk * this.zzbgg;
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final int zzin() {
        return this.zzbgg;
    }
}
