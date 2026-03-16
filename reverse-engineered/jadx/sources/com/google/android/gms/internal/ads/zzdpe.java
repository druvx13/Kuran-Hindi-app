package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdpe<E> extends zzdou<E> {
    static final zzdou<Object> zzhfq = new zzdpe(new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzhfr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpe(Object[] objArr, int i) {
        this.zzhfr = objArr;
        this.size = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final int zzavu() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final boolean zzavx() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final Object[] zzavt() {
        return this.zzhfr;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    final int zzavv() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdou, com.google.android.gms.internal.ads.zzdot
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzhfr, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzdoj.zzs(i, this.size);
        return (E) this.zzhfr[i];
    }
}
