package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzra {
    private ByteArrayOutputStream zzbrn = new ByteArrayOutputStream(4096);
    private Base64OutputStream zzbro = new Base64OutputStream(this.zzbrn, 10);

    public final void write(byte[] bArr) throws IOException {
        this.zzbro.write(bArr);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ByteArrayOutputStream, android.util.Base64OutputStream] */
    public final String toString() {
        try {
            this.zzbro.close();
        } catch (IOException e) {
            zzawr.zzc("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.zzbrn.close();
            return this.zzbrn.toString();
        } catch (IOException e2) {
            zzawr.zzc("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.zzbrn = null;
            this.zzbro = null;
        }
    }
}
