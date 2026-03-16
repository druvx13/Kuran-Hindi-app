package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzeat extends zzeav {
    private final int limit;
    private int position = 0;
    private final /* synthetic */ zzeaq zzhti;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeat(zzeaq zzeaqVar) {
        this.zzhti = zzeaqVar;
        this.limit = this.zzhti.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // com.google.android.gms.internal.ads.zzeaz
    public final byte nextByte() {
        int i = this.position;
        if (i >= this.limit) {
            throw new NoSuchElementException();
        }
        this.position = i + 1;
        return this.zzhti.zzfp(i);
    }
}
