package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzmm implements zzmh, zzmi {
    private zzna zzaei;
    private zzmh zzbbh;
    public final zzmi[] zzbco;
    private final IdentityHashMap<zzmt, Integer> zzbcp = new IdentityHashMap<>();
    private int zzbcq;
    private zzmi[] zzbcr;
    private zzmw zzbcs;

    public zzmm(zzmi... zzmiVarArr) {
        this.zzbco = zzmiVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zza(zzmh zzmhVar, long j) {
        this.zzbbh = zzmhVar;
        zzmi[] zzmiVarArr = this.zzbco;
        this.zzbcq = zzmiVarArr.length;
        for (zzmi zzmiVar : zzmiVarArr) {
            zzmiVar.zza(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzhn() throws IOException {
        for (zzmi zzmiVar : this.zzbco) {
            zzmiVar.zzhn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final zzna zzho() {
        return this.zzaei;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final long zza(zznj[] zznjVarArr, boolean[] zArr, zzmt[] zzmtVarArr, boolean[] zArr2, long j) {
        zzmt[] zzmtVarArr2 = zzmtVarArr;
        int[] iArr = new int[zznjVarArr.length];
        int[] iArr2 = new int[zznjVarArr.length];
        for (int i = 0; i < zznjVarArr.length; i++) {
            iArr[i] = zzmtVarArr2[i] == null ? -1 : this.zzbcp.get(zzmtVarArr2[i]).intValue();
            iArr2[i] = -1;
            if (zznjVarArr[i] != null) {
                zzmx zzik = zznjVarArr[i].zzik();
                int i2 = 0;
                while (true) {
                    zzmi[] zzmiVarArr = this.zzbco;
                    if (i2 >= zzmiVarArr.length) {
                        break;
                    } else if (zzmiVarArr[i2].zzho().zza(zzik) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.zzbcp.clear();
        int length = zznjVarArr.length;
        zzmt[] zzmtVarArr3 = new zzmt[length];
        zzmt[] zzmtVarArr4 = new zzmt[zznjVarArr.length];
        zznj[] zznjVarArr2 = new zznj[zznjVarArr.length];
        ArrayList arrayList = new ArrayList(this.zzbco.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zzbco.length) {
            for (int i4 = 0; i4 < zznjVarArr.length; i4++) {
                zznj zznjVar = null;
                zzmtVarArr4[i4] = iArr[i4] == i3 ? zzmtVarArr2[i4] : null;
                if (iArr2[i4] == i3) {
                    zznjVar = zznjVarArr[i4];
                }
                zznjVarArr2[i4] = zznjVar;
            }
            int i5 = i3;
            zznj[] zznjVarArr3 = zznjVarArr2;
            ArrayList arrayList2 = arrayList;
            long zza = this.zzbco[i3].zza(zznjVarArr2, zArr, zzmtVarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = zza;
            } else if (zza != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zznjVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zzoh.checkState(zzmtVarArr4[i6] != null);
                    zzmtVarArr3[i6] = zzmtVarArr4[i6];
                    this.zzbcp.put(zzmtVarArr4[i6], Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzoh.checkState(zzmtVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zzbco[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zznjVarArr2 = zznjVarArr3;
            zzmtVarArr2 = zzmtVarArr;
        }
        zzmt[] zzmtVarArr5 = zzmtVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzmtVarArr3, 0, zzmtVarArr5, 0, length);
        zzmi[] zzmiVarArr2 = new zzmi[arrayList3.size()];
        this.zzbcr = zzmiVarArr2;
        arrayList3.toArray(zzmiVarArr2);
        this.zzbcs = new zzlv(this.zzbcr);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final void zzef(long j) {
        for (zzmi zzmiVar : this.zzbcr) {
            zzmiVar.zzef(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmi, com.google.android.gms.internal.ads.zzmw
    public final boolean zzee(long j) {
        return this.zzbcs.zzee(j);
    }

    @Override // com.google.android.gms.internal.ads.zzmi, com.google.android.gms.internal.ads.zzmw
    public final long zzhm() {
        return this.zzbcs.zzhm();
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final long zzhp() {
        zzmi[] zzmiVarArr;
        long zzhp = this.zzbco[0].zzhp();
        int i = 1;
        while (true) {
            zzmi[] zzmiVarArr2 = this.zzbco;
            if (i >= zzmiVarArr2.length) {
                if (zzhp != -9223372036854775807L) {
                    for (zzmi zzmiVar : this.zzbcr) {
                        if (zzmiVar != this.zzbco[0] && zzmiVar.zzeg(zzhp) != zzhp) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzhp;
            } else if (zzmiVarArr2[i].zzhp() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            } else {
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final long zzhq() {
        long j = Long.MAX_VALUE;
        for (zzmi zzmiVar : this.zzbcr) {
            long zzhq = zzmiVar.zzhq();
            if (zzhq != Long.MIN_VALUE) {
                j = Math.min(j, zzhq);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final long zzeg(long j) {
        long zzeg = this.zzbcr[0].zzeg(j);
        int i = 1;
        while (true) {
            zzmi[] zzmiVarArr = this.zzbcr;
            if (i >= zzmiVarArr.length) {
                return zzeg;
            }
            if (zzmiVarArr[i].zzeg(zzeg) != zzeg) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i++;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zza(zzmi zzmiVar) {
        int i = this.zzbcq - 1;
        this.zzbcq = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (zzmi zzmiVar2 : this.zzbco) {
            i2 += zzmiVar2.zzho().length;
        }
        zzmx[] zzmxVarArr = new zzmx[i2];
        int i3 = 0;
        for (zzmi zzmiVar3 : this.zzbco) {
            zzna zzho = zzmiVar3.zzho();
            int i4 = zzho.length;
            int i5 = 0;
            while (i5 < i4) {
                zzmxVarArr[i3] = zzho.zzay(i5);
                i5++;
                i3++;
            }
        }
        this.zzaei = new zzna(zzmxVarArr);
        this.zzbbh.zza((zzmi) this);
    }

    @Override // com.google.android.gms.internal.ads.zzmv
    public final /* synthetic */ void zza(zzmi zzmiVar) {
        if (this.zzaei != null) {
            this.zzbbh.zza((zzmh) this);
        }
    }
}
