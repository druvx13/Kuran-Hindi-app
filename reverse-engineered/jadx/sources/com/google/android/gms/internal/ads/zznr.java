package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zznr implements zznu {
    private final byte[] data;
    private Uri uri;
    private int zzbfk;
    private int zzbfl;

    public zznr(byte[] bArr) {
        zzoh.checkNotNull(bArr);
        zzoh.checkArgument(bArr.length > 0);
        this.data = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final long zza(zznv zznvVar) throws IOException {
        this.uri = zznvVar.uri;
        this.zzbfk = (int) zznvVar.position;
        int length = (int) (zznvVar.zzce == -1 ? this.data.length - zznvVar.position : zznvVar.zzce);
        this.zzbfl = length;
        if (length <= 0 || this.zzbfk + length > this.data.length) {
            int i = this.zzbfk;
            long j = zznvVar.zzce;
            int length2 = this.data.length;
            StringBuilder sb = new StringBuilder(77);
            sb.append("Unsatisfiable range: [");
            sb.append(i);
            sb.append(", ");
            sb.append(j);
            sb.append("], length: ");
            sb.append(length2);
            throw new IOException(sb.toString());
        }
        return length;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzbfl;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.data, this.zzbfk, bArr, i, min);
        this.zzbfk += min;
        this.zzbfl -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void close() throws IOException {
        this.uri = null;
    }
}
