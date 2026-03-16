package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzeff implements Iterator<String> {
    private Iterator<String> zzicm;
    private final /* synthetic */ zzefd zzicn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeff(zzefd zzefdVar) {
        zzecv zzecvVar;
        this.zzicn = zzefdVar;
        zzecvVar = this.zzicn.zzicl;
        this.zzicm = zzecvVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzicm.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzicm.next();
    }
}
