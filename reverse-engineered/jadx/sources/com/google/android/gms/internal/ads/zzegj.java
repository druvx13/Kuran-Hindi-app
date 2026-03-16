package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzegj implements zzbi, Closeable, Iterator<zzbf> {
    protected zzegl zziij;
    protected zzbe zziim;
    private static final zzbf zziil = new zzegm("eof ");
    private static zzegr zzcr = zzegr.zzn(zzegj.class);
    private zzbf zziin = null;
    long zziio = 0;
    long zzbdj = 0;
    long zzarx = 0;
    private List<zzbf> zziip = new ArrayList();

    public final List<zzbf> zzbip() {
        if (this.zziij != null && this.zziin != zziil) {
            return new zzegp(this.zziip, this);
        }
        return this.zziip;
    }

    public void zza(zzegl zzeglVar, long j, zzbe zzbeVar) throws IOException {
        this.zziij = zzeglVar;
        long position = zzeglVar.position();
        this.zzbdj = position;
        this.zziio = position;
        zzeglVar.zzfc(zzeglVar.position() + j);
        this.zzarx = zzeglVar.position();
        this.zziim = zzbeVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        zzbf zzbfVar = this.zziin;
        if (zzbfVar == zziil) {
            return false;
        }
        if (zzbfVar != null) {
            return true;
        }
        try {
            this.zziin = (zzbf) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zziin = zziil;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Iterator
    /* renamed from: zzbiq */
    public final zzbf next() {
        zzbf zza;
        zzbf zzbfVar = this.zziin;
        if (zzbfVar != null && zzbfVar != zziil) {
            this.zziin = null;
            return zzbfVar;
        }
        zzegl zzeglVar = this.zziij;
        if (zzeglVar == null || this.zziio >= this.zzarx) {
            this.zziin = zziil;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzeglVar) {
                this.zziij.zzfc(this.zziio);
                zza = this.zziim.zza(this.zziij, this);
                this.zziio = this.zziij.position();
            }
            return zza;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zziip.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.zziip.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public void close() throws IOException {
        this.zziij.close();
    }
}
