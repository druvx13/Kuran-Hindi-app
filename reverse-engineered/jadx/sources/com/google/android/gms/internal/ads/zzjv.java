package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzjv implements zzka {
    private final byte[] zzaod = new byte[8];
    private final Stack<zzjx> zzaoe = new Stack<>();
    private final zzkf zzaof = new zzkf();
    private zzjz zzaog;
    private int zzaoh;
    private int zzaoi;
    private long zzaoj;

    @Override // com.google.android.gms.internal.ads.zzka
    public final void zza(zzjz zzjzVar) {
        this.zzaog = zzjzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final void reset() {
        this.zzaoh = 0;
        this.zzaoe.clear();
        this.zzaof.reset();
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final boolean zzb(zzjl zzjlVar) throws IOException, InterruptedException {
        String str;
        double longBitsToDouble;
        int zzam;
        int zza;
        long j;
        int i;
        zzoh.checkState(this.zzaog != null);
        while (true) {
            if (!this.zzaoe.isEmpty()) {
                long position = zzjlVar.getPosition();
                j = this.zzaoe.peek().zzaom;
                if (position >= j) {
                    zzjz zzjzVar = this.zzaog;
                    i = this.zzaoe.pop().zzaoi;
                    zzjzVar.zzal(i);
                    return true;
                }
            }
            if (this.zzaoh == 0) {
                long zza2 = this.zzaof.zza(zzjlVar, true, false, 4);
                if (zza2 == -2) {
                    zzjlVar.zzgp();
                    while (true) {
                        zzjlVar.zza(this.zzaod, 0, 4);
                        zzam = zzkf.zzam(this.zzaod[0]);
                        if (zzam != -1 && zzam <= 4) {
                            zza = (int) zzkf.zza(this.zzaod, zzam, false);
                            if (this.zzaog.zzak(zza)) {
                                break;
                            }
                        }
                        zzjlVar.zzae(1);
                    }
                    zzjlVar.zzae(zzam);
                    zza2 = zza;
                }
                if (zza2 == -1) {
                    return false;
                }
                this.zzaoi = (int) zza2;
                this.zzaoh = 1;
            }
            if (this.zzaoh == 1) {
                this.zzaoj = this.zzaof.zza(zzjlVar, false, true, 8);
                this.zzaoh = 2;
            }
            int zzaj = this.zzaog.zzaj(this.zzaoi);
            if (zzaj != 0) {
                if (zzaj == 1) {
                    long position2 = zzjlVar.getPosition();
                    this.zzaoe.add(new zzjx(this.zzaoi, this.zzaoj + position2));
                    this.zzaog.zzd(this.zzaoi, position2, this.zzaoj);
                    this.zzaoh = 0;
                    return true;
                } else if (zzaj == 2) {
                    long j2 = this.zzaoj;
                    if (j2 > 8) {
                        long j3 = this.zzaoj;
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Invalid integer size: ");
                        sb.append(j3);
                        throw new zzhi(sb.toString());
                    }
                    this.zzaog.zzc(this.zzaoi, zza(zzjlVar, (int) j2));
                    this.zzaoh = 0;
                    return true;
                } else if (zzaj == 3) {
                    long j4 = this.zzaoj;
                    if (j4 > 2147483647L) {
                        long j5 = this.zzaoj;
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("String element size: ");
                        sb2.append(j5);
                        throw new zzhi(sb2.toString());
                    }
                    zzjz zzjzVar2 = this.zzaog;
                    int i2 = this.zzaoi;
                    int i3 = (int) j4;
                    if (i3 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i3];
                        zzjlVar.readFully(bArr, 0, i3);
                        str = new String(bArr);
                    }
                    zzjzVar2.zza(i2, str);
                    this.zzaoh = 0;
                    return true;
                } else if (zzaj == 4) {
                    this.zzaog.zza(this.zzaoi, (int) this.zzaoj, zzjlVar);
                    this.zzaoh = 0;
                    return true;
                } else if (zzaj == 5) {
                    long j6 = this.zzaoj;
                    if (j6 != 4 && j6 != 8) {
                        long j7 = this.zzaoj;
                        StringBuilder sb3 = new StringBuilder(40);
                        sb3.append("Invalid float size: ");
                        sb3.append(j7);
                        throw new zzhi(sb3.toString());
                    }
                    zzjz zzjzVar3 = this.zzaog;
                    int i4 = this.zzaoi;
                    int i5 = (int) this.zzaoj;
                    long zza3 = zza(zzjlVar, i5);
                    if (i5 == 4) {
                        longBitsToDouble = Float.intBitsToFloat((int) zza3);
                    } else {
                        longBitsToDouble = Double.longBitsToDouble(zza3);
                    }
                    zzjzVar3.zza(i4, longBitsToDouble);
                    this.zzaoh = 0;
                    return true;
                } else {
                    StringBuilder sb4 = new StringBuilder(32);
                    sb4.append("Invalid element type ");
                    sb4.append(zzaj);
                    throw new zzhi(sb4.toString());
                }
            }
            zzjlVar.zzae((int) this.zzaoj);
            this.zzaoh = 0;
        }
    }

    private final long zza(zzjl zzjlVar, int i) throws IOException, InterruptedException {
        zzjlVar.readFully(this.zzaod, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zzaod[i2] & 255);
        }
        return j;
    }
}
