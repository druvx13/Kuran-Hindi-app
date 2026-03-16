package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzegk extends zzegi implements zzbf {
    private int flags;
    private int version;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzegk(String str) {
        super(str);
    }

    public final int getVersion() {
        if (!this.zziie) {
            zzbio();
        }
        return this.version;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzm(ByteBuffer byteBuffer) {
        this.version = zzbg.zza(byteBuffer.get());
        this.flags = (zzbg.zzb(byteBuffer) << 8) + 0 + zzbg.zza(byteBuffer.get());
        return 4L;
    }
}
