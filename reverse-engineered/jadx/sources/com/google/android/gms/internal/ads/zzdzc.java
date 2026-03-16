package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdzc {
    private final zzdzp zzhrc;
    private final zzdzp zzhrd;

    public zzdzc(byte[] bArr, byte[] bArr2) {
        this.zzhrc = zzdzp.zzs(bArr);
        this.zzhrd = zzdzp.zzs(bArr2);
    }

    public final byte[] zzbby() {
        zzdzp zzdzpVar = this.zzhrc;
        if (zzdzpVar == null) {
            return null;
        }
        return zzdzpVar.getBytes();
    }

    public final byte[] zzbbz() {
        zzdzp zzdzpVar = this.zzhrd;
        if (zzdzpVar == null) {
            return null;
        }
        return zzdzpVar.getBytes();
    }
}
