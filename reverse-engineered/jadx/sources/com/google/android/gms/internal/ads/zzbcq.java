package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbcq extends SSLSocketFactory {
    private SSLSocketFactory zzefj = (SSLSocketFactory) SSLSocketFactory.getDefault();
    private final /* synthetic */ zzbcn zzefk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcq(zzbcn zzbcnVar) {
        this.zzefk = zzbcnVar;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.zzefj.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.zzefj.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return zzb(this.zzefj.createSocket(socket, str, i, z));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        return zzb(this.zzefj.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return zzb(this.zzefj.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return zzb(this.zzefj.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return zzb(this.zzefj.createSocket(inetAddress, i, inetAddress2, i2));
    }

    private final Socket zzb(Socket socket) throws SocketException {
        int i;
        int i2;
        i = this.zzefk.zzefc;
        if (i > 0) {
            i2 = this.zzefk.zzefc;
            socket.setReceiveBufferSize(i2);
        }
        this.zzefk.zza(socket);
        return socket;
    }
}
