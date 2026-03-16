package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzir implements Runnable {
    private final URL zza;
    private final byte[] zzb;
    private final zzis zzc;
    private final String zzd;
    private final Map<String, String> zze;
    private final /* synthetic */ zzip zzf;

    public zzir(zzip zzipVar, String str, URL url, byte[] bArr, Map<String, String> map, zzis zzisVar) {
        this.zzf = zzipVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzisVar);
        this.zza = url;
        this.zzb = null;
        this.zzc = zzisVar;
        this.zzd = str;
        this.zze = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        Map<String, List<String>> map2;
        byte[] zza;
        this.zzf.zzc();
        int i = 0;
        try {
            httpURLConnection = this.zzf.zza(this.zza);
            try {
                if (this.zze != null) {
                    for (Map.Entry<String, String> entry : this.zze.entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                i = httpURLConnection.getResponseCode();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                try {
                    zzip zzipVar = this.zzf;
                    zza = zzip.zza(httpURLConnection);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(i, null, zza, headerFields);
                } catch (IOException e) {
                    map2 = headerFields;
                    e = e;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(i, e, null, map2);
                } catch (Throwable th) {
                    map = headerFields;
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(i, null, null, map);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                map2 = null;
            } catch (Throwable th2) {
                th = th2;
                map = null;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            map = null;
        }
    }

    private final void zzb(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.zzf.zzq().zza(new Runnable(this, i, exc, bArr, map) { // from class: com.google.android.gms.measurement.internal.zziu
            private final zzir zza;
            private final int zzb;
            private final Exception zzc;
            private final byte[] zzd;
            private final Map zze;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = i;
                this.zzc = exc;
                this.zzd = bArr;
                this.zze = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i, Exception exc, byte[] bArr, Map map) {
        this.zzc.zza(this.zzd, i, exc, bArr, map);
    }
}
