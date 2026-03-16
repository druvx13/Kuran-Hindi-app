package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzbwx {
    private final zzbek zzdce;
    private final zzbxz zzfoz;

    public zzbwx(zzbxz zzbxzVar) {
        this(zzbxzVar, null);
    }

    public zzbwx(zzbxz zzbxzVar, zzbek zzbekVar) {
        this.zzfoz = zzbxzVar;
        this.zzdce = zzbekVar;
    }

    public final zzbxz zzajv() {
        return this.zzfoz;
    }

    public final zzbek zzags() {
        return this.zzdce;
    }

    public final View zzajw() {
        zzbek zzbekVar = this.zzdce;
        if (zzbekVar != null) {
            return zzbekVar.getWebView();
        }
        return null;
    }

    public final View zzajx() {
        zzbek zzbekVar = this.zzdce;
        if (zzbekVar == null) {
            return null;
        }
        return zzbekVar.getWebView();
    }

    public Set<zzbvt<zzbqx>> zza(zzbyd zzbydVar) {
        return Collections.singleton(zzbvt.zzb(zzbydVar, zzbab.zzdzw));
    }

    public final zzbvt<zzbtq> zzb(Executor executor) {
        final zzbek zzbekVar = this.zzdce;
        return new zzbvt<>(new zzbtq(zzbekVar) { // from class: com.google.android.gms.internal.ads.zzbwz
            private final zzbek zzelg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzelg = zzbekVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbtq
            public final void zzaho() {
                zzbek zzbekVar2 = this.zzelg;
                if (zzbekVar2.zzabf() != null) {
                    zzbekVar2.zzabf().close();
                }
            }
        }, executor);
    }
}
