package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzme {
    private final zzjo zzaqn;
    private final zzjm[] zzbcb;
    private zzjm zzbcc;

    public zzme(zzjm[] zzjmVarArr, zzjo zzjoVar) {
        this.zzbcb = zzjmVarArr;
        this.zzaqn = zzjoVar;
    }

    public final zzjm zza(zzjl zzjlVar, Uri uri) throws IOException, InterruptedException {
        zzjm zzjmVar = this.zzbcc;
        if (zzjmVar != null) {
            return zzjmVar;
        }
        zzjm[] zzjmVarArr = this.zzbcb;
        int length = zzjmVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzjm zzjmVar2 = zzjmVarArr[i];
            try {
            } catch (EOFException unused) {
            } finally {
                zzjlVar.zzgp();
            }
            if (zzjmVar2.zza(zzjlVar)) {
                this.zzbcc = zzjmVar2;
                break;
            }
            i++;
        }
        zzjm zzjmVar3 = this.zzbcc;
        if (zzjmVar3 == null) {
            String zza = zzov.zza(this.zzbcb);
            StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 58);
            sb.append("None of the available extractors (");
            sb.append(zza);
            sb.append(") could read the stream.");
            throw new zzmz(sb.toString(), uri);
        }
        zzjmVar3.zza(this.zzaqn);
        return this.zzbcc;
    }

    public final void release() {
        zzjm zzjmVar = this.zzbcc;
        if (zzjmVar != null) {
            zzjmVar.release();
            this.zzbcc = null;
        }
    }
}
