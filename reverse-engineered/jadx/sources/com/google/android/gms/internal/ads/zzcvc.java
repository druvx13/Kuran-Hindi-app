package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcvc implements zzdqj<zzarj, zzcvd> {
    private Executor executor;
    private zzckv zzglf;

    public zzcvc(Executor executor, zzckv zzckvVar) {
        this.executor = executor;
        this.zzglf = zzckvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final /* synthetic */ zzdri<zzcvd> zzf(zzarj zzarjVar) throws Exception {
        final zzarj zzarjVar2 = zzarjVar;
        return zzdqw.zzb(this.zzglf.zzh(zzarjVar2), new zzdqj(zzarjVar2) { // from class: com.google.android.gms.internal.ads.zzcvb
            private final zzarj zzfnq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfnq = zzarjVar2;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return zzdqw.zzag(new zzcvd(new JsonReader(new InputStreamReader((InputStream) obj))).zzo(this.zzfnq.zzdpe));
            }
        }, this.executor);
    }
}
