package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads-base@@19.1.0 */
/* loaded from: classes.dex */
final class zzeae extends WeakReference<Throwable> {
    private final int zzhsp;

    public zzeae(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.zzhsp = System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.zzhsp;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            zzeae zzeaeVar = (zzeae) obj;
            if (this.zzhsp == zzeaeVar.zzhsp && get() == zzeaeVar.get()) {
                return true;
            }
        }
        return false;
    }
}
