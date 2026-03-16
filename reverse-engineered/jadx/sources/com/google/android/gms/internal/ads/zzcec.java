package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcec<T> implements zzaga<Object> {
    private final WeakReference<T> zzfwp;
    private final String zzfwq;
    private final zzaga<T> zzfwr;
    private final /* synthetic */ zzcdt zzfws;

    private zzcec(zzcdt zzcdtVar, WeakReference<T> weakReference, String str, zzaga<T> zzagaVar) {
        this.zzfws = zzcdtVar;
        this.zzfwp = weakReference;
        this.zzfwq = str;
        this.zzfwr = zzagaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(Object obj, Map<String, String> map) {
        T t = this.zzfwp.get();
        if (t == null) {
            this.zzfws.zzb(this.zzfwq, this);
        } else {
            this.zzfwr.zza(t, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcec(zzcdt zzcdtVar, WeakReference weakReference, String str, zzaga zzagaVar, zzcdu zzcduVar) {
        this(zzcdtVar, weakReference, str, zzagaVar);
    }
}
