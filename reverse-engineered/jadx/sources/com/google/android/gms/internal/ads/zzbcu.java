package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbcu implements zzgs, zzmf, zzoi<zznu>, zzpm {
    private static int zzefr;
    private static int zzefs;
    private int bytesTransferred;
    private final zzbby zzeet;
    private final zzhk zzefu;
    private zzgt zzefx;
    private ByteBuffer zzefy;
    private boolean zzefz;
    private zzbdc zzega;
    private final Context zzvf;
    private Set<WeakReference<zzbcn>> zzegb = new HashSet();
    private final zzbcr zzeft = new zzbcr();
    private final zzhk zzefv = new zzio(zzld.zzbad);
    private final zzni zzefw = new zznd();

    public zzbcu(Context context, zzbby zzbbyVar) {
        this.zzvf = context;
        this.zzeet = zzbbyVar;
        this.zzefu = new zzpg(this.zzvf, zzld.zzbad, 0L, zzaxa.zzdwf, this, -1);
        if (zzawr.zzwo()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            zzawr.zzeg(sb.toString());
        }
        zzefr++;
        zzgt zza = zzgx.zza(new zzhk[]{this.zzefv, this.zzefu}, this.zzefw, this.zzeft);
        this.zzefx = zza;
        zza.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    public final void zza(zzhl zzhlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    public final void zza(zzhp zzhpVar, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    public final void zza(zzna zznaVar, zznl zznlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzb(Surface surface) {
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzd(String str, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zze(zziy zziyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final /* bridge */ /* synthetic */ void zze(zznu zznuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    public final void zzej() {
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzf(int i, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzf(zziy zziyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    public final void zzf(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzk(zzhf zzhfVar) {
    }

    public final zzgt zzaah() {
        return this.zzefx;
    }

    public static int zzaai() {
        return zzefr;
    }

    public static int zzaaj() {
        return zzefs;
    }

    public final void zza(zzbdc zzbdcVar) {
        this.zzega = zzbdcVar;
    }

    public final zzbcr zzaak() {
        return this.zzeft;
    }

    public final void zza(Uri[] uriArr, String str) {
        zza(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zza(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzmk zzmlVar;
        if (this.zzefx == null) {
            return;
        }
        this.zzefy = byteBuffer;
        this.zzefz = z;
        if (uriArr.length == 1) {
            zzmlVar = zzb(uriArr[0], str);
        } else {
            zzmk[] zzmkVarArr = new zzmk[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                zzmkVarArr[i] = zzb(uriArr[i], str);
            }
            zzmlVar = new zzml(zzmkVarArr);
        }
        this.zzefx.zza(zzmlVar);
        zzefs++;
    }

    public final void release() {
        zzgt zzgtVar = this.zzefx;
        if (zzgtVar != null) {
            zzgtVar.zzb(this);
            this.zzefx.release();
            this.zzefx = null;
            zzefs--;
        }
    }

    public final long getBytesTransferred() {
        return this.bytesTransferred;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzb(IOException iOException) {
        zzbdc zzbdcVar = this.zzega;
        if (zzbdcVar != null) {
            zzbdcVar.zza("onLoadError", iOException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpm
    public final void zzb(int i, int i2, int i3, float f) {
        zzbdc zzbdcVar = this.zzega;
        if (zzbdcVar != null) {
            zzbdcVar.zzn(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    public final void zza(boolean z, int i) {
        zzbdc zzbdcVar = this.zzega;
        if (zzbdcVar != null) {
            zzbdcVar.zzdj(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgs
    public final void zza(zzgq zzgqVar) {
        zzbdc zzbdcVar = this.zzega;
        if (zzbdcVar != null) {
            zzbdcVar.zza("onPlayerError", zzgqVar);
        }
    }

    public final void zzdi(int i) {
        for (WeakReference<zzbcn> weakReference : this.zzegb) {
            zzbcn zzbcnVar = weakReference.get();
            if (zzbcnVar != null) {
                zzbcnVar.setReceiveBufferSize(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Surface surface, boolean z) {
        if (this.zzefx == null) {
            return;
        }
        zzgu zzguVar = new zzgu(this.zzefu, 1, surface);
        if (z) {
            this.zzefx.zzb(zzguVar);
        } else {
            this.zzefx.zza(zzguVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(float f, boolean z) {
        if (this.zzefx == null) {
            return;
        }
        zzgu zzguVar = new zzgu(this.zzefv, 2, Float.valueOf(f));
        if (z) {
            this.zzefx.zzb(zzguVar);
        } else {
            this.zzefx.zza(zzguVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaw(boolean z) {
        if (this.zzefx == null) {
            return;
        }
        for (int i = 0; i < this.zzefx.zzel(); i++) {
            this.zzefw.zzf(i, !z);
        }
    }

    private final zzmk zzb(Uri uri, final String str) {
        final zznt zzntVar;
        if (this.zzefz && this.zzefy.limit() > 0) {
            final byte[] bArr = new byte[this.zzefy.limit()];
            this.zzefy.get(bArr);
            zzntVar = new zznt(bArr) { // from class: com.google.android.gms.internal.ads.zzbct
                private final byte[] zzdzk;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdzk = bArr;
                }

                @Override // com.google.android.gms.internal.ads.zznt
                public final zznu zzio() {
                    return new zznr(this.zzdzk);
                }
            };
        } else {
            if (this.zzeet.zzedz > 0) {
                zzntVar = new zznt(this, str) { // from class: com.google.android.gms.internal.ads.zzbcw
                    private final String zzdbv;
                    private final zzbcu zzegc;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzegc = this;
                        this.zzdbv = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zznt
                    public final zznu zzio() {
                        return this.zzegc.zzfk(this.zzdbv);
                    }
                };
            } else {
                zzntVar = new zznt(this, str) { // from class: com.google.android.gms.internal.ads.zzbcv
                    private final String zzdbv;
                    private final zzbcu zzegc;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzegc = this;
                        this.zzdbv = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zznt
                    public final zznu zzio() {
                        return this.zzegc.zzfj(this.zzdbv);
                    }
                };
            }
            if (this.zzeet.zzeea) {
                zzntVar = new zznt(this, zzntVar) { // from class: com.google.android.gms.internal.ads.zzbcy
                    private final zzbcu zzegc;
                    private final zznt zzege;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzegc = this;
                        this.zzege = zzntVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zznt
                    public final zznu zzio() {
                        return this.zzegc.zza(this.zzege);
                    }
                };
            }
            if (this.zzefy.limit() > 0) {
                final byte[] bArr2 = new byte[this.zzefy.limit()];
                this.zzefy.get(bArr2);
                zzntVar = new zznt(zzntVar, bArr2) { // from class: com.google.android.gms.internal.ads.zzbcx
                    private final byte[] zzdpa;
                    private final zznt zzegd;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzegd = zzntVar;
                        this.zzdpa = bArr2;
                    }

                    @Override // com.google.android.gms.internal.ads.zznt
                    public final zznu zzio() {
                        zznt zzntVar2 = this.zzegd;
                        byte[] bArr3 = this.zzdpa;
                        return new zzbdb(new zznr(bArr3), bArr3.length, zzntVar2.zzio());
                    }
                };
            }
        }
        return new zzmg(uri, zzntVar, zzbda.zzegf, this.zzeet.zzeeb, zzaxa.zzdwf, this, null, this.zzeet.zzedx);
    }

    public final void finalize() throws Throwable {
        zzefr--;
        if (zzawr.zzwo()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            zzawr.zzeg(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final /* synthetic */ void zzc(zznu zznuVar, int i) {
        this.bytesTransferred += i;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final /* synthetic */ void zza(zznu zznuVar, zznv zznvVar) {
        this.bytesTransferred = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zznu zza(zznt zzntVar) {
        return new zzbcp(this.zzvf, zzntVar.zzio(), this, new zzbcs(this) { // from class: com.google.android.gms.internal.ads.zzbcz
            private final zzbcu zzegc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzegc = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbcs
            public final void zzb(boolean z, long j) {
                this.zzegc.zzd(z, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(boolean z, long j) {
        zzbdc zzbdcVar = this.zzega;
        if (zzbdcVar != null) {
            zzbdcVar.zzb(z, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zznu zzfj(String str) {
        return new zznx(str, null, this.zzeet.zzeea ? null : this, this.zzeet.zzedu, this.zzeet.zzedw, true, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zznu zzfk(String str) {
        zzbcn zzbcnVar = new zzbcn(str, this.zzeet.zzeea ? null : this, this.zzeet.zzedu, this.zzeet.zzedw, this.zzeet.zzedz);
        this.zzegb.add(new WeakReference<>(zzbcnVar));
        return zzbcnVar;
    }
}
