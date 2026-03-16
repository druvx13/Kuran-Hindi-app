package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzss extends PushbackInputStream {
    private final /* synthetic */ zzsn zzbtd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzss(zzsn zzsnVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zzbtd = zzsnVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.zzbtd.zzbsw.disconnect();
        super.close();
    }
}
