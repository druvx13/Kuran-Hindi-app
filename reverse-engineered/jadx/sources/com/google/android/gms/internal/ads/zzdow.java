package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdow<E> extends zzdop<E> {
    private final zzdou<E> zzhfg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdow(zzdou<E> zzdouVar, int i) {
        super(zzdouVar.size(), i);
        this.zzhfg = zzdouVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    protected final E get(int i) {
        return this.zzhfg.get(i);
    }
}
