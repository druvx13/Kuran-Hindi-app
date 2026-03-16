package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzeax extends zzeba {
    private final int zzhtj;
    private final int zzhtk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeax(byte[] bArr, int i, int i2) {
        super(bArr);
        zzi(i, i + i2, bArr.length);
        this.zzhtj = i;
        this.zzhtk = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzeba, com.google.android.gms.internal.ads.zzeaq
    public final byte zzfo(int i) {
        zzaa(i, size());
        return this.zzhtm[this.zzhtj + i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeba, com.google.android.gms.internal.ads.zzeaq
    public final byte zzfp(int i) {
        return this.zzhtm[this.zzhtj + i];
    }

    @Override // com.google.android.gms.internal.ads.zzeba, com.google.android.gms.internal.ads.zzeaq
    public final int size() {
        return this.zzhtk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeba
    public final int zzbcv() {
        return this.zzhtj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeba, com.google.android.gms.internal.ads.zzeaq
    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzhtm, zzbcv() + i, bArr, i2, i3);
    }
}
