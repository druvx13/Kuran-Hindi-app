package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzms implements zzjt {
    private final zzns zzbay;
    private final int zzbdn;
    private zzmr zzbdr;
    private zzmr zzbds;
    private zzhf zzbdt;
    private boolean zzbdu;
    private zzhf zzbdv;
    private long zzbdw;
    private int zzbdx;
    private zzmu zzbdy;
    private final zzmq zzbdo = new zzmq();
    private final zzmp zzbdp = new zzmp();
    private final zzos zzaow = new zzos(32);
    private final AtomicInteger zzbdq = new AtomicInteger();

    public zzms(zzns zznsVar) {
        this.zzbay = zznsVar;
        this.zzbdn = zznsVar.zzin();
        int i = this.zzbdn;
        this.zzbdx = i;
        zzmr zzmrVar = new zzmr(0L, i);
        this.zzbdr = zzmrVar;
        this.zzbds = zzmrVar;
    }

    public final void zzk(boolean z) {
        int andSet = this.zzbdq.getAndSet(z ? 0 : 2);
        zzia();
        this.zzbdo.zzib();
        if (andSet == 2) {
            this.zzbdt = null;
        }
    }

    public final int zzic() {
        return this.zzbdo.zzic();
    }

    public final void disable() {
        if (this.zzbdq.getAndSet(2) == 0) {
            zzia();
        }
    }

    public final boolean zzid() {
        return this.zzbdo.zzid();
    }

    public final zzhf zzie() {
        return this.zzbdo.zzie();
    }

    public final long zzhu() {
        return this.zzbdo.zzhu();
    }

    public final void zzih() {
        long zzif = this.zzbdo.zzif();
        if (zzif != -1) {
            zzej(zzif);
        }
    }

    public final boolean zze(long j, boolean z) {
        long zzd = this.zzbdo.zzd(j, z);
        if (zzd == -1) {
            return false;
        }
        zzej(zzd);
        return true;
    }

    public final int zza(zzhh zzhhVar, zzjb zzjbVar, boolean z, boolean z2, long j) {
        int i;
        int zza = this.zzbdo.zza(zzhhVar, zzjbVar, z, z2, this.zzbdt, this.zzbdp);
        if (zza == -5) {
            this.zzbdt = zzhhVar.zzahd;
            return -5;
        } else if (zza == -4) {
            if (!zzjbVar.zzgh()) {
                if (zzjbVar.timeUs < j) {
                    zzjbVar.zzy(Integer.MIN_VALUE);
                }
                if (zzjbVar.isEncrypted()) {
                    zzmp zzmpVar = this.zzbdp;
                    long j2 = zzmpVar.zzavy;
                    this.zzaow.reset(1);
                    zza(j2, this.zzaow.data, 1);
                    long j3 = j2 + 1;
                    byte b = this.zzaow.data[0];
                    boolean z3 = (b & 128) != 0;
                    int i2 = b & Byte.MAX_VALUE;
                    if (zzjbVar.zzano.iv == null) {
                        zzjbVar.zzano.iv = new byte[16];
                    }
                    zza(j3, zzjbVar.zzano.iv, i2);
                    long j4 = j3 + i2;
                    if (z3) {
                        this.zzaow.reset(2);
                        zza(j4, this.zzaow.data, 2);
                        j4 += 2;
                        i = this.zzaow.readUnsignedShort();
                    } else {
                        i = 1;
                    }
                    int[] iArr = zzjbVar.zzano.numBytesOfClearData;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzjbVar.zzano.numBytesOfEncryptedData;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (z3) {
                        int i3 = i * 6;
                        this.zzaow.reset(i3);
                        zza(j4, this.zzaow.data, i3);
                        j4 += i3;
                        this.zzaow.zzbi(0);
                        for (int i4 = 0; i4 < i; i4++) {
                            iArr2[i4] = this.zzaow.readUnsignedShort();
                            iArr4[i4] = this.zzaow.zzje();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzmpVar.size - ((int) (j4 - zzmpVar.zzavy));
                    }
                    zzjw zzjwVar = zzmpVar.zzaqs;
                    zzjbVar.zzano.set(i, iArr2, iArr4, zzjwVar.zzaol, zzjbVar.zzano.iv, zzjwVar.zzaok);
                    int i5 = (int) (j4 - zzmpVar.zzavy);
                    zzmpVar.zzavy += i5;
                    zzmpVar.size -= i5;
                }
                zzjbVar.zzab(this.zzbdp.size);
                long j5 = this.zzbdp.zzavy;
                ByteBuffer byteBuffer = zzjbVar.zzcs;
                int i6 = this.zzbdp.size;
                zzej(j5);
                while (i6 > 0) {
                    int i7 = (int) (j5 - this.zzbdr.zzbdj);
                    int min = Math.min(i6, this.zzbdn - i7);
                    zznp zznpVar = this.zzbdr.zzbdl;
                    byteBuffer.put(zznpVar.data, zznpVar.zzbb(i7), min);
                    j5 += min;
                    i6 -= min;
                    if (j5 == this.zzbdr.zzarx) {
                        this.zzbay.zza(zznpVar);
                        this.zzbdr = this.zzbdr.zzig();
                    }
                }
                zzej(this.zzbdp.zzbcw);
            }
            return -4;
        } else {
            if (zza == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
    }

    private final void zza(long j, byte[] bArr, int i) {
        zzej(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zzbdr.zzbdj);
            int min = Math.min(i - i2, this.zzbdn - i3);
            zznp zznpVar = this.zzbdr.zzbdl;
            System.arraycopy(zznpVar.data, zznpVar.zzbb(i3), bArr, i2, min);
            j += min;
            i2 += min;
            if (j == this.zzbdr.zzarx) {
                this.zzbay.zza(zznpVar);
                this.zzbdr = this.zzbdr.zzig();
            }
        }
    }

    private final void zzej(long j) {
        while (j >= this.zzbdr.zzarx) {
            this.zzbay.zza(this.zzbdr.zzbdl);
            this.zzbdr = this.zzbdr.zzig();
        }
    }

    public final void zza(zzmu zzmuVar) {
        this.zzbdy = zzmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zze(zzhf zzhfVar) {
        zzhf zzhfVar2 = zzhfVar == null ? null : zzhfVar;
        boolean zzg = this.zzbdo.zzg(zzhfVar2);
        this.zzbdv = zzhfVar;
        this.zzbdu = false;
        zzmu zzmuVar = this.zzbdy;
        if (zzmuVar == null || !zzg) {
            return;
        }
        zzmuVar.zzf(zzhfVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final int zza(zzjl zzjlVar, int i, boolean z) throws IOException, InterruptedException {
        if (!zzii()) {
            int zzad = zzjlVar.zzad(i);
            if (zzad != -1) {
                return zzad;
            }
            throw new EOFException();
        }
        try {
            int zzaw = zzaw(i);
            zznp zznpVar = this.zzbds.zzbdl;
            int read = zzjlVar.read(zznpVar.data, zznpVar.zzbb(this.zzbdx), zzaw);
            if (read == -1) {
                throw new EOFException();
            }
            this.zzbdx += read;
            this.zzbdw += read;
            return read;
        } finally {
            zzij();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zza(zzos zzosVar, int i) {
        if (!zzii()) {
            zzosVar.zzbj(i);
            return;
        }
        while (i > 0) {
            int zzaw = zzaw(i);
            zznp zznpVar = this.zzbds.zzbdl;
            zzosVar.zze(zznpVar.data, zznpVar.zzbb(this.zzbdx), zzaw);
            this.zzbdx += zzaw;
            this.zzbdw += zzaw;
            i -= zzaw;
        }
        zzij();
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public final void zza(long j, int i, int i2, int i3, zzjw zzjwVar) {
        if (!zzii()) {
            this.zzbdo.zzei(j);
            return;
        }
        try {
            this.zzbdo.zza(j, i, this.zzbdw - i2, i2, zzjwVar);
        } finally {
            zzij();
        }
    }

    private final boolean zzii() {
        return this.zzbdq.compareAndSet(0, 1);
    }

    private final void zzij() {
        if (this.zzbdq.compareAndSet(1, 0)) {
            return;
        }
        zzia();
    }

    private final void zzia() {
        this.zzbdo.zzia();
        zzmr zzmrVar = this.zzbdr;
        if (zzmrVar.zzbdk) {
            int i = (this.zzbds.zzbdk ? 1 : 0) + (((int) (this.zzbds.zzbdj - zzmrVar.zzbdj)) / this.zzbdn);
            zznp[] zznpVarArr = new zznp[i];
            for (int i2 = 0; i2 < i; i2++) {
                zznpVarArr[i2] = zzmrVar.zzbdl;
                zzmrVar = zzmrVar.zzig();
            }
            this.zzbay.zza(zznpVarArr);
        }
        zzmr zzmrVar2 = new zzmr(0L, this.zzbdn);
        this.zzbdr = zzmrVar2;
        this.zzbds = zzmrVar2;
        this.zzbdw = 0L;
        this.zzbdx = this.zzbdn;
        this.zzbay.zzn();
    }

    private final int zzaw(int i) {
        if (this.zzbdx == this.zzbdn) {
            this.zzbdx = 0;
            if (this.zzbds.zzbdk) {
                this.zzbds = this.zzbds.zzbdm;
            }
            zzmr zzmrVar = this.zzbds;
            zznp zzim = this.zzbay.zzim();
            zzmr zzmrVar2 = new zzmr(this.zzbds.zzarx, this.zzbdn);
            zzmrVar.zzbdl = zzim;
            zzmrVar.zzbdm = zzmrVar2;
            zzmrVar.zzbdk = true;
        }
        return Math.min(i, this.zzbdn - this.zzbdx);
    }
}
