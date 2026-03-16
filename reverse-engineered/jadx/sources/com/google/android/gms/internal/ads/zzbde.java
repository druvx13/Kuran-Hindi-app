package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbde implements zzegl {
    private final ByteBuffer zzalo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbde(ByteBuffer byteBuffer) {
        this.zzalo = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.zzegl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.zzalo.remaining() != 0 || byteBuffer.remaining() <= 0) {
            int min = Math.min(byteBuffer.remaining(), this.zzalo.remaining());
            byte[] bArr = new byte[min];
            this.zzalo.get(bArr);
            byteBuffer.put(bArr);
            return min;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final long size() throws IOException {
        return this.zzalo.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final long position() throws IOException {
        return this.zzalo.position();
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final void zzfc(long j) throws IOException {
        this.zzalo.position((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final ByteBuffer zzh(long j, long j2) throws IOException {
        int position = this.zzalo.position();
        this.zzalo.position((int) j);
        ByteBuffer slice = this.zzalo.slice();
        slice.limit((int) j2);
        this.zzalo.position(position);
        return slice;
    }
}
