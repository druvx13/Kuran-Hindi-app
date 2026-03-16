package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzmb implements zzog {
    private final Uri uri;
    private final zznu zzans;
    private final /* synthetic */ zzly zzbau;
    private final zzme zzbbc;
    private final zzoj zzbbd;
    private volatile boolean zzbbx;
    private long zzbbz;
    private final zzjs zzbbw = new zzjs();
    private boolean zzbby = true;
    private long zzce = -1;

    public zzmb(zzly zzlyVar, Uri uri, zznu zznuVar, zzme zzmeVar, zzoj zzojVar) {
        this.zzbau = zzlyVar;
        this.uri = (Uri) zzoh.checkNotNull(uri);
        this.zzans = (zznu) zzoh.checkNotNull(zznuVar);
        this.zzbbc = (zzme) zzoh.checkNotNull(zzmeVar);
        this.zzbbd = zzojVar;
    }

    public final void zze(long j, long j2) {
        this.zzbbw.position = j;
        this.zzbbz = j2;
        this.zzbby = true;
    }

    @Override // com.google.android.gms.internal.ads.zzog
    public final void cancelLoad() {
        this.zzbbx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzog
    public final boolean zzhw() {
        return this.zzbbx;
    }

    @Override // com.google.android.gms.internal.ads.zzog
    public final void zzhx() throws IOException, InterruptedException {
        long j;
        zzjj zzjjVar;
        int i = 0;
        while (i == 0 && !this.zzbbx) {
            zzjj zzjjVar2 = null;
            try {
                j = this.zzbbw.position;
                long zza = this.zzans.zza(new zznv(this.uri, j, -1L, zzly.zzf(this.zzbau)));
                this.zzce = zza;
                if (zza != -1) {
                    this.zzce = zza + j;
                }
                zzjjVar = new zzjj(this.zzans, j, this.zzce);
            } catch (Throwable th) {
                th = th;
            }
            try {
                zzjm zza2 = this.zzbbc.zza(zzjjVar, this.zzans.getUri());
                if (this.zzbby) {
                    zza2.zzc(j, this.zzbbz);
                    this.zzbby = false;
                }
                while (i == 0 && !this.zzbbx) {
                    this.zzbbd.block();
                    i = zza2.zza(zzjjVar, this.zzbbw);
                    if (zzjjVar.getPosition() > zzly.zzg(this.zzbau) + j) {
                        j = zzjjVar.getPosition();
                        this.zzbbd.zzit();
                        zzly.zzi(this.zzbau).post(zzly.zzh(this.zzbau));
                    }
                }
                if (i == 1) {
                    i = 0;
                } else {
                    this.zzbbw.position = zzjjVar.getPosition();
                }
                zzov.zza(this.zzans);
            } catch (Throwable th2) {
                th = th2;
                zzjjVar2 = zzjjVar;
                if (i != 1 && zzjjVar2 != null) {
                    this.zzbbw.position = zzjjVar2.getPosition();
                }
                zzov.zza(this.zzans);
                throw th;
            }
        }
    }
}
