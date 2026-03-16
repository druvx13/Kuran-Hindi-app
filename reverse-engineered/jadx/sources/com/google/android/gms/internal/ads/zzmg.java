package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzmg implements zzmj, zzmk {
    private final Uri uri;
    private final zzdns zzadv;
    private zzhp zzaeg;
    private final int zzbav;
    private final zzmf zzbaw;
    private zzmj zzbax;
    private final zznt zzbcd;
    private final zzjn zzbce;
    private final int zzbcf;
    private boolean zzbcg;
    private final String zzbaz = null;
    private final zzhr zzadz = new zzhr();

    public zzmg(Uri uri, zznt zzntVar, zzjn zzjnVar, int i, zzdns zzdnsVar, zzmf zzmfVar, String str, int i2) {
        this.uri = uri;
        this.zzbcd = zzntVar;
        this.zzbce = zzjnVar;
        this.zzbav = i;
        this.zzadv = zzdnsVar;
        this.zzbaw = zzmfVar;
        this.zzbcf = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final void zzhy() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final void zza(zzgt zzgtVar, boolean z, zzmj zzmjVar) {
        this.zzbax = zzmjVar;
        zzmy zzmyVar = new zzmy(-9223372036854775807L, false);
        this.zzaeg = zzmyVar;
        zzmjVar.zzb(zzmyVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final zzmi zza(int i, zzns zznsVar) {
        zzoh.checkArgument(i == 0);
        return new zzly(this.uri, this.zzbcd.zzio(), this.zzbce.zzgq(), this.zzbav, this.zzadv, this.zzbaw, this, zznsVar, null, this.zzbcf);
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final void zzb(zzmi zzmiVar) {
        ((zzly) zzmiVar).release();
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final void zzhz() {
        this.zzbax = null;
    }

    @Override // com.google.android.gms.internal.ads.zzmj
    public final void zzb(zzhp zzhpVar, Object obj) {
        boolean z = zzhpVar.zza(0, this.zzadz, false).zzaht != -9223372036854775807L;
        if (!this.zzbcg || z) {
            this.zzaeg = zzhpVar;
            this.zzbcg = z;
            this.zzbax.zzb(zzhpVar, null);
        }
    }
}
