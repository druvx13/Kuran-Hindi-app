package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbo;
import com.google.android.gms.internal.ads.zzbv;
import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfb extends zzfz {
    private static final zzgc<zzco> zzaaf = new zzgc<>();
    private final Context zzaag;
    private zzbo.zza zzaah;

    public zzfb(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2, Context context, zzbo.zza zzaVar) {
        super(zzeoVar, str, str2, c0010zza, i, 27);
        this.zzaah = null;
        this.zzaag = context;
        this.zzaah = zzaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: all -> 0x011e, TryCatch #1 {, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001f, B:10:0x0029, B:16:0x0039, B:18:0x0045, B:34:0x0082, B:37:0x0091, B:39:0x00b7, B:49:0x00e7, B:41:0x00c1, B:45:0x00ce, B:47:0x00d8, B:48:0x00db, B:19:0x0048, B:22:0x0056, B:24:0x005c, B:28:0x006b, B:30:0x0075, B:32:0x007d, B:33:0x0080, B:50:0x00ea, B:51:0x00f0), top: B:66:0x000d }] */
    @Override // com.google.android.gms.internal.ads.zzfz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzcx() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfb.zzcx():void");
    }

    private static String zza(zzbo.zza zzaVar) {
        if (zzaVar == null || !zzaVar.zzaa() || zzet.zzaq(zzaVar.zzab().zzag())) {
            return null;
        }
        return zzaVar.zzab().zzag();
    }

    private final String zzcy() {
        try {
            if (this.zzvp.zzcq() != null) {
                this.zzvp.zzcq().get();
            }
            zzbv.zza zzcp = this.zzvp.zzcp();
            if (zzcp == null || !zzcp.zzak()) {
                return null;
            }
            return zzcp.zzag();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
