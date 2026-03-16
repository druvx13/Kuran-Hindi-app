package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbdd {
    private long zzcw;

    public final long zzl(ByteBuffer byteBuffer) {
        zzbk zzbkVar;
        zzbh zzbhVar;
        long j = this.zzcw;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator<zzbf> it = new zzbd(new zzbde(duplicate), zzbdf.zzegk).zzbip().iterator();
            while (true) {
                zzbkVar = null;
                if (!it.hasNext()) {
                    zzbhVar = null;
                    break;
                }
                zzbf next = it.next();
                if (next instanceof zzbh) {
                    zzbhVar = (zzbh) next;
                    break;
                }
            }
            Iterator<zzbf> it2 = zzbhVar.zzbip().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzbf next2 = it2.next();
                if (next2 instanceof zzbk) {
                    zzbkVar = (zzbk) next2;
                    break;
                }
            }
            long duration = (zzbkVar.getDuration() * 1000) / zzbkVar.zzs();
            this.zzcw = duration;
            return duration;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
