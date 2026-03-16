package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzegi implements zzbf {
    private static zzegr zzcr = zzegr.zzn(zzegi.class);
    private String type;
    private long zzavy;
    private zzbi zziic;
    private ByteBuffer zziig;
    private long zziih;
    private zzegl zziij;
    private long zziii = -1;
    private ByteBuffer zziik = null;
    private boolean zziif = true;
    boolean zziie = true;

    private final synchronized void zzbin() {
        if (!this.zziif) {
            try {
                zzegr zzegrVar = zzcr;
                String valueOf = String.valueOf(this.type);
                zzegrVar.zzig(valueOf.length() != 0 ? "mem mapping ".concat(valueOf) : new String("mem mapping "));
                this.zziig = this.zziij.zzh(this.zziih, this.zziii);
                this.zziif = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    protected abstract void zzg(ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: protected */
    public zzegi(String str) {
        this.type = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final void zza(zzegl zzeglVar, ByteBuffer byteBuffer, long j, zzbe zzbeVar) throws IOException {
        long position = zzeglVar.position();
        this.zziih = position;
        this.zzavy = position - byteBuffer.remaining();
        this.zziii = j;
        this.zziij = zzeglVar;
        zzeglVar.zzfc(zzeglVar.position() + j);
        this.zziif = false;
        this.zziie = false;
        zzbio();
    }

    public final synchronized void zzbio() {
        zzbin();
        zzegr zzegrVar = zzcr;
        String valueOf = String.valueOf(this.type);
        zzegrVar.zzig(valueOf.length() != 0 ? "parsing details of ".concat(valueOf) : new String("parsing details of "));
        if (this.zziig != null) {
            ByteBuffer byteBuffer = this.zziig;
            this.zziie = true;
            byteBuffer.rewind();
            zzg(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zziik = byteBuffer.slice();
            }
            this.zziig = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final String getType() {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final void zza(zzbi zzbiVar) {
        this.zziic = zzbiVar;
    }
}
