package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzeeg extends zzeav {
    private final zzeei zzibh;
    private zzeaz zzibi = zzbgo();
    private final /* synthetic */ zzeed zzibj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeeg(zzeed zzeedVar) {
        this.zzibj = zzeedVar;
        this.zzibh = new zzeei(this.zzibj, null);
    }

    private final zzeaz zzbgo() {
        if (this.zzibh.hasNext()) {
            return (zzeaz) ((zzebb) this.zzibh.next()).iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzibi != null;
    }

    @Override // com.google.android.gms.internal.ads.zzeaz
    public final byte nextByte() {
        zzeaz zzeazVar = this.zzibi;
        if (zzeazVar == null) {
            throw new NoSuchElementException();
        }
        byte nextByte = zzeazVar.nextByte();
        if (!this.zzibi.hasNext()) {
            this.zzibi = zzbgo();
        }
        return nextByte;
    }
}
