package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdek {
    public static <T> void zza(AtomicReference<T> atomicReference, zzdej<T> zzdejVar) {
        T t = atomicReference.get();
        if (t == null) {
            return;
        }
        try {
            zzdejVar.zzr(t);
        } catch (RemoteException e) {
            zzawr.zze("#007 Could not call remote method.", e);
        }
    }
}
