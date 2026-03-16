package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zznx implements zznu {
    private static final Pattern zzbfo = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> zzbfp = new AtomicReference<>();
    private final int zzbfr;
    private final int zzbfs;
    private final String zzbft;
    private final zzoi<? super zznx> zzbfx;
    private zznv zzbfy;
    private HttpURLConnection zzbfz;
    private InputStream zzbga;
    private boolean zzbgb;
    private long zzbgc;
    private long zzbgd;
    private long zzbge;
    private long zzcf;
    private final zzou<String> zzbfu = null;
    private final zzoc zzbfw = new zzoc();
    private final boolean zzbfq = true;
    private final zzoc zzbfv = null;

    public zznx(String str, zzou<String> zzouVar, zzoi<? super zznx> zzoiVar, int i, int i2, boolean z, zzoc zzocVar) {
        this.zzbft = zzoh.checkNotEmpty(str);
        this.zzbfx = zzoiVar;
        this.zzbfr = i;
        this.zzbfs = i2;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.zzbfz;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.zzbfz;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        r0 = r1;
     */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zza(com.google.android.gms.internal.ads.zznv r25) throws com.google.android.gms.internal.ads.zzoa {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznx.zza(com.google.android.gms.internal.ads.zznv):long");
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int read(byte[] bArr, int i, int i2) throws zzoa {
        try {
            if (this.zzbge != this.zzbgc) {
                byte[] andSet = zzbfp.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (this.zzbge != this.zzbgc) {
                    int read = this.zzbga.read(andSet, 0, (int) Math.min(this.zzbgc - this.zzbge, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.zzbge += read;
                    if (this.zzbfx != null) {
                        this.zzbfx.zzc(this, read);
                    }
                }
                zzbfp.set(andSet);
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.zzbgd != -1) {
                long j = this.zzbgd - this.zzcf;
                if (j == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j);
            }
            int read2 = this.zzbga.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzbgd == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzcf += read2;
            if (this.zzbfx != null) {
                this.zzbfx.zzc(this, read2);
            }
            return read2;
        } catch (IOException e) {
            throw new zzoa(e, this.zzbfy, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r3 > 2048) goto L26;
     */
    @Override // com.google.android.gms.internal.ads.zznu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws com.google.android.gms.internal.ads.zzoa {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.zzbga     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L7b
            java.net.HttpURLConnection r2 = r9.zzbfz     // Catch: java.lang.Throwable -> L8e
            long r3 = r9.zzbgd     // Catch: java.lang.Throwable -> L8e
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L13
            long r3 = r9.zzbgd     // Catch: java.lang.Throwable -> L8e
            goto L18
        L13:
            long r3 = r9.zzbgd     // Catch: java.lang.Throwable -> L8e
            long r7 = r9.zzcf     // Catch: java.lang.Throwable -> L8e
            long r3 = r3 - r7
        L18:
            int r7 = com.google.android.gms.internal.ads.zzov.SDK_INT     // Catch: java.lang.Throwable -> L8e
            r8 = 19
            if (r7 == r8) goto L24
            int r7 = com.google.android.gms.internal.ads.zzov.SDK_INT     // Catch: java.lang.Throwable -> L8e
            r8 = 20
            if (r7 != r8) goto L6b
        L24:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L34
            int r3 = r2.read()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            r4 = -1
            if (r3 != r4) goto L3a
            goto L6b
        L34:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L6b
        L3a:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            if (r4 != 0) goto L52
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            if (r3 == 0) goto L6b
        L52:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
        L6b:
            java.io.InputStream r2 = r9.zzbga     // Catch: java.io.IOException -> L71 java.lang.Throwable -> L8e
            r2.close()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> L8e
            goto L7b
        L71:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzoa r3 = new com.google.android.gms.internal.ads.zzoa     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zznv r4 = r9.zzbfy     // Catch: java.lang.Throwable -> L8e
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L8e
            throw r3     // Catch: java.lang.Throwable -> L8e
        L7b:
            r9.zzbga = r0
            r9.zzip()
            boolean r0 = r9.zzbgb
            if (r0 == 0) goto L8d
            r9.zzbgb = r1
            com.google.android.gms.internal.ads.zzoi<? super com.google.android.gms.internal.ads.zznx> r0 = r9.zzbfx
            if (r0 == 0) goto L8d
            r0.zze(r9)
        L8d:
            return
        L8e:
            r2 = move-exception
            r9.zzbga = r0
            r9.zzip()
            boolean r0 = r9.zzbgb
            if (r0 == 0) goto La1
            r9.zzbgb = r1
            com.google.android.gms.internal.ads.zzoi<? super com.google.android.gms.internal.ads.zznx> r0 = r9.zzbfx
            if (r0 == 0) goto La1
            r0.zze(r9)
        La1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznx.close():void");
    }

    private final HttpURLConnection zza(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzbfr);
        httpURLConnection.setReadTimeout(this.zzbfs);
        for (Map.Entry<String, String> entry : this.zzbfw.zzis().entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        if (j != 0 || j2 != -1) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            String sb2 = sb.toString();
            if (j2 != -1) {
                String valueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb3.append(valueOf);
                sb3.append((j + j2) - 1);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.zzbft);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long zzc(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L36
            long r4 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L15
            goto L38
        L15:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 28
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Length ["
            r4.append(r1)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            android.util.Log.e(r3, r1)
        L36:
            r4 = -1
        L38:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto Lcb
            java.util.regex.Pattern r1 = com.google.android.gms.internal.ads.zznx.zzbfo
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto Lcb
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch: java.lang.NumberFormatException -> Laa
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> Laa
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch: java.lang.NumberFormatException -> Laa
            long r8 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> Laa
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L6e
            r4 = r6
            goto Lcb
        L6e:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto Lcb
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Laa
            int r1 = r1.length()     // Catch: java.lang.NumberFormatException -> Laa
            int r1 = r1 + 26
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch: java.lang.NumberFormatException -> Laa
            int r8 = r8.length()     // Catch: java.lang.NumberFormatException -> Laa
            int r1 = r1 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Laa
            r8.<init>(r1)     // Catch: java.lang.NumberFormatException -> Laa
            java.lang.String r1 = "Inconsistent headers ["
            r8.append(r1)     // Catch: java.lang.NumberFormatException -> Laa
            r8.append(r0)     // Catch: java.lang.NumberFormatException -> Laa
            java.lang.String r0 = "] ["
            r8.append(r0)     // Catch: java.lang.NumberFormatException -> Laa
            r8.append(r10)     // Catch: java.lang.NumberFormatException -> Laa
            r8.append(r2)     // Catch: java.lang.NumberFormatException -> Laa
            java.lang.String r0 = r8.toString()     // Catch: java.lang.NumberFormatException -> Laa
            android.util.Log.w(r3, r0)     // Catch: java.lang.NumberFormatException -> Laa
            long r0 = java.lang.Math.max(r4, r6)     // Catch: java.lang.NumberFormatException -> Laa
            r4 = r0
            goto Lcb
        Laa:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            int r0 = r0 + 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r1.append(r0)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = r1.toString()
            android.util.Log.e(r3, r10)
        Lcb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznx.zzc(java.net.HttpURLConnection):long");
    }

    private final void zzip() {
        HttpURLConnection httpURLConnection = this.zzbfz;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzbfz = null;
        }
    }
}
