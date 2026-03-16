package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzkq implements zzkl {
    private final zzos zzavw;
    private final int zzawf;
    private final int zzawi;
    private int zzawj;
    private int zzawk;

    public zzkq(zzkk zzkkVar) {
        zzos zzosVar = zzkkVar.zzavw;
        this.zzavw = zzosVar;
        zzosVar.zzbi(12);
        this.zzawi = this.zzavw.zzje() & 255;
        this.zzawf = this.zzavw.zzje();
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzgy() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final int zzgw() {
        return this.zzawf;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final int zzgx() {
        int i = this.zzawi;
        if (i == 8) {
            return this.zzavw.readUnsignedByte();
        }
        if (i == 16) {
            return this.zzavw.readUnsignedShort();
        }
        int i2 = this.zzawj;
        this.zzawj = i2 + 1;
        if (i2 % 2 == 0) {
            int readUnsignedByte = this.zzavw.readUnsignedByte();
            this.zzawk = readUnsignedByte;
            return (readUnsignedByte & 240) >> 4;
        }
        return this.zzawk & 15;
    }
}
