package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzml implements zzmk {
    private final zzmk[] zzbch;
    private final ArrayList<zzmk> zzbci;
    private zzmj zzbcj;
    private zzhp zzbck;
    private Object zzbcl;
    private zzmn zzbcn;
    private final zzhq zzady = new zzhq();
    private int zzbcm = -1;

    public zzml(zzmk... zzmkVarArr) {
        this.zzbch = zzmkVarArr;
        this.zzbci = new ArrayList<>(Arrays.asList(zzmkVarArr));
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final void zza(zzgt zzgtVar, boolean z, zzmj zzmjVar) {
        this.zzbcj = zzmjVar;
        int i = 0;
        while (true) {
            zzmk[] zzmkVarArr = this.zzbch;
            if (i >= zzmkVarArr.length) {
                return;
            }
            zzmkVarArr[i].zza(zzgtVar, false, new zzmo(this, i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final void zzhy() throws IOException {
        zzmn zzmnVar = this.zzbcn;
        if (zzmnVar != null) {
            throw zzmnVar;
        }
        for (zzmk zzmkVar : this.zzbch) {
            zzmkVar.zzhy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final zzmi zza(int i, zzns zznsVar) {
        int length = this.zzbch.length;
        zzmi[] zzmiVarArr = new zzmi[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzmiVarArr[i2] = this.zzbch[i2].zza(i, zznsVar);
        }
        return new zzmm(zzmiVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final void zzb(zzmi zzmiVar) {
        zzmm zzmmVar = (zzmm) zzmiVar;
        int i = 0;
        while (true) {
            zzmk[] zzmkVarArr = this.zzbch;
            if (i >= zzmkVarArr.length) {
                return;
            }
            zzmkVarArr[i].zzb(zzmmVar.zzbco[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final void zzhz() {
        for (zzmk zzmkVar : this.zzbch) {
            zzmkVar.zzhz();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i, zzhp zzhpVar, Object obj) {
        zzmn zzmnVar;
        if (this.zzbcn == null) {
            int zzfe = zzhpVar.zzfe();
            int i2 = 0;
            while (true) {
                if (i2 < zzfe) {
                    if (zzhpVar.zza(i2, this.zzady, false).zzahp) {
                        zzmnVar = new zzmn(0);
                        break;
                    }
                    i2++;
                } else {
                    if (this.zzbcm == -1) {
                        this.zzbcm = zzhpVar.zzff();
                    } else if (zzhpVar.zzff() != this.zzbcm) {
                        zzmnVar = new zzmn(1);
                    }
                    zzmnVar = null;
                }
            }
            this.zzbcn = zzmnVar;
        }
        if (this.zzbcn != null) {
            return;
        }
        this.zzbci.remove(this.zzbch[i]);
        if (i == 0) {
            this.zzbck = zzhpVar;
            this.zzbcl = obj;
        }
        if (this.zzbci.isEmpty()) {
            this.zzbcj.zzb(this.zzbck, this.zzbcl);
        }
    }
}
