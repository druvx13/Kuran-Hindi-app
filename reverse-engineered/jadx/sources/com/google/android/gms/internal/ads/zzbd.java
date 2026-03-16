package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzbd extends zzegj implements Closeable {
    private static zzegr zzcr = zzegr.zzn(zzbd.class);

    public zzbd(zzegl zzeglVar, zzbe zzbeVar) throws IOException {
        zza(zzeglVar, zzeglVar.size(), zzbeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzegj, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.zziij.close();
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public String toString() {
        String obj = this.zziij.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
