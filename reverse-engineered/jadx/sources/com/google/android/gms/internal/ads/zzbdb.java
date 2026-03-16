package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbdb implements zznu {
    private Uri uri;
    private final zznu zzegg;
    private final long zzegh;
    private final zznu zzegi;
    private long zzegj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdb(zznu zznuVar, int i, zznu zznuVar2) {
        this.zzegg = zznuVar;
        this.zzegh = i;
        this.zzegi = zznuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final long zza(zznv zznvVar) throws IOException {
        long j;
        zznv zznvVar2;
        this.uri = zznvVar.uri;
        zznv zznvVar3 = null;
        if (zznvVar.position >= this.zzegh) {
            zznvVar2 = null;
        } else {
            long j2 = zznvVar.position;
            if (zznvVar.zzce != -1) {
                j = Math.min(zznvVar.zzce, this.zzegh - j2);
            } else {
                j = this.zzegh - j2;
            }
            zznvVar2 = new zznv(zznvVar.uri, j2, j, null);
        }
        if (zznvVar.zzce == -1 || zznvVar.position + zznvVar.zzce > this.zzegh) {
            zznvVar3 = new zznv(zznvVar.uri, Math.max(this.zzegh, zznvVar.position), zznvVar.zzce != -1 ? Math.min(zznvVar.zzce, (zznvVar.position + zznvVar.zzce) - this.zzegh) : -1L, null);
        }
        long zza = zznvVar2 != null ? this.zzegg.zza(zznvVar2) : 0L;
        long zza2 = zznvVar3 != null ? this.zzegi.zza(zznvVar3) : 0L;
        this.zzegj = zznvVar.position;
        if (zza == -1 || zza2 == -1) {
            return -1L;
        }
        return zza + zza2;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzegj;
        long j2 = this.zzegh;
        if (j < j2) {
            i3 = this.zzegg.read(bArr, i, (int) Math.min(i2, j2 - j));
            this.zzegj += i3;
        } else {
            i3 = 0;
        }
        if (this.zzegj >= this.zzegh) {
            int read = this.zzegi.read(bArr, i + i3, i2 - i3);
            int i4 = i3 + read;
            this.zzegj += read;
            return i4;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void close() throws IOException {
        this.zzegg.close();
        this.zzegi.close();
    }
}
