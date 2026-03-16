package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzegh extends zzegj implements zzbf {
    private String type;
    private long zzavy;
    private zzbi zziic;
    private boolean zziid;

    public zzegh(String str) {
        this.type = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final void zza(zzbi zzbiVar) {
        this.zziic = zzbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final String getType() {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final void zza(zzegl zzeglVar, ByteBuffer byteBuffer, long j, zzbe zzbeVar) throws IOException {
        this.zzavy = zzeglVar.position() - byteBuffer.remaining();
        this.zziid = byteBuffer.remaining() == 16;
        zza(zzeglVar, j, zzbeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final void zza(zzegl zzeglVar, long j, zzbe zzbeVar) throws IOException {
        this.zziij = zzeglVar;
        this.zziio = zzeglVar.position();
        this.zzbdj = this.zziio - ((this.zziid || 8 + j >= 4294967296L) ? 16 : 8);
        zzeglVar.zzfc(zzeglVar.position() + j);
        this.zzarx = zzeglVar.position();
        this.zziim = zzbeVar;
    }
}
