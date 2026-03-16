package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
final class zzdpl extends zzdou<Object> {
    private final transient int offset;
    private final transient int size;
    private final transient Object[] zzhft;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpl(Object[] objArr, int i, int i2) {
        this.zzhft = objArr;
        this.offset = i;
        this.size = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final boolean zzavx() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzdoj.zzs(i, this.size);
        return this.zzhft[(i * 2) + this.offset];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }
}
