package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzeeh extends InputStream {
    private int mark;
    private final /* synthetic */ zzeed zzibj;
    private zzeei zzibk;
    private zzebb zzibl;
    private int zzibm;
    private int zzibn;
    private int zzibo;

    public zzeeh(zzeed zzeedVar) {
        this.zzibj = zzeedVar;
        initialize();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw null;
        }
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        int zzl = zzl(bArr, i, i2);
        if (zzl == 0) {
            return -1;
        }
        return zzl;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return zzl(null, 0, (int) j);
    }

    private final int zzl(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            zzbgp();
            if (this.zzibl == null) {
                break;
            }
            int min = Math.min(this.zzibm - this.zzibn, i3);
            if (bArr != null) {
                this.zzibl.zza(bArr, this.zzibn, i, min);
                i += min;
            }
            this.zzibn += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        zzbgp();
        zzebb zzebbVar = this.zzibl;
        if (zzebbVar == null) {
            return -1;
        }
        int i = this.zzibn;
        this.zzibn = i + 1;
        return zzebbVar.zzfo(i) & 255;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.zzibj.size() - (this.zzibo + this.zzibn);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.mark = this.zzibo + this.zzibn;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        initialize();
        zzl(null, 0, this.mark);
    }

    private final void initialize() {
        zzeei zzeeiVar = new zzeei(this.zzibj, null);
        this.zzibk = zzeeiVar;
        zzebb zzebbVar = (zzebb) zzeeiVar.next();
        this.zzibl = zzebbVar;
        this.zzibm = zzebbVar.size();
        this.zzibn = 0;
        this.zzibo = 0;
    }

    private final void zzbgp() {
        if (this.zzibl != null) {
            int i = this.zzibn;
            int i2 = this.zzibm;
            if (i == i2) {
                this.zzibo += i2;
                this.zzibn = 0;
                if (this.zzibk.hasNext()) {
                    zzebb zzebbVar = (zzebb) this.zzibk.next();
                    this.zzibl = zzebbVar;
                    this.zzibm = zzebbVar.size();
                    return;
                }
                this.zzibl = null;
                this.zzibm = 0;
            }
        }
    }
}
