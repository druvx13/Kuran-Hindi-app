package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzeay {
    private final byte[] buffer;
    private final zzebk zzhtl;

    private zzeay(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzhtl = zzebk.zzw(bArr);
    }

    public final zzeaq zzbcw() {
        this.zzhtl.zzbdz();
        return new zzeba(this.buffer);
    }

    public final zzebk zzbcx() {
        return this.zzhtl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeay(int i, zzeat zzeatVar) {
        this(i);
    }
}
