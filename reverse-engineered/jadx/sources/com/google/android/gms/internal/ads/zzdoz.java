package com.google.android.gms.internal.ads;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdoz<E> extends zzdou<E> {
    private final transient int length;
    private final transient int offset;
    private final /* synthetic */ zzdou zzhfl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdoz(zzdou zzdouVar, int i, int i2) {
        this.zzhfl = zzdouVar;
        this.offset = i;
        this.length = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final boolean zzavx() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final Object[] zzavt() {
        return this.zzhfl.zzavt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final int zzavu() {
        return this.zzhfl.zzavu() + this.offset;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    final int zzavv() {
        return this.zzhfl.zzavu() + this.offset + this.length;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzdoj.zzs(i, this.length);
        return this.zzhfl.get(i + this.offset);
    }

    @Override // com.google.android.gms.internal.ads.zzdou
    public final zzdou<E> zzu(int i, int i2) {
        zzdoj.zzf(i, i2, this.length);
        zzdou zzdouVar = this.zzhfl;
        int i3 = this.offset;
        return (zzdou) zzdouVar.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.ads.zzdou, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
