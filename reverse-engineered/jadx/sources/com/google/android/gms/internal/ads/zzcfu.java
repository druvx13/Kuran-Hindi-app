package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcfu {
    private final Map<String, zzcfv> zzfxo = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zza(String str, zzdhq zzdhqVar) {
        if (this.zzfxo.containsKey(str)) {
            return;
        }
        try {
            this.zzfxo.put(str, new zzcfv(str, zzdhqVar.zztn(), zzdhqVar.zzto()));
        } catch (zzdhk unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zza(String str, zzanv zzanvVar) {
        if (this.zzfxo.containsKey(str)) {
            return;
        }
        try {
            this.zzfxo.put(str, new zzcfv(str, zzanvVar.zztn(), zzanvVar.zzto()));
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final synchronized zzcfv zzge(String str) {
        return this.zzfxo.get(str);
    }
}
