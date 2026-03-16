package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zziv implements zzhv {
    private ByteBuffer zzakn;
    private ByteBuffer zzalo;
    private boolean zzalp;
    private zzis zzamw;
    private ShortBuffer zzamx;
    private long zzamy;
    private long zzamz;
    private float zzahf = 1.0f;
    private float zzahg = 1.0f;
    private int zzags = -1;
    private int zzalk = -1;

    public zziv() {
        ByteBuffer byteBuffer = zzaig;
        this.zzalo = byteBuffer;
        this.zzamx = byteBuffer.asShortBuffer();
        this.zzakn = zzaig;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final int zzfj() {
        return 2;
    }

    public final float zzb(float f) {
        float zza = zzov.zza(f, 0.1f, 8.0f);
        this.zzahf = zza;
        return zza;
    }

    public final float zzc(float f) {
        this.zzahg = zzov.zza(f, 0.1f, 8.0f);
        return f;
    }

    public final long zzgj() {
        return this.zzamy;
    }

    public final long zzgk() {
        return this.zzamz;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final boolean zzb(int i, int i2, int i3) throws zzhu {
        if (i3 != 2) {
            throw new zzhu(i, i2, i3);
        }
        if (this.zzalk == i && this.zzags == i2) {
            return false;
        }
        this.zzalk = i;
        this.zzags = i2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final boolean isActive() {
        return Math.abs(this.zzahf - 1.0f) >= 0.01f || Math.abs(this.zzahg - 1.0f) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final int zzfi() {
        return this.zzags;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final void zzi(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzamy += remaining;
            this.zzamw.zza(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int zzge = (this.zzamw.zzge() * this.zzags) << 1;
        if (zzge > 0) {
            if (this.zzalo.capacity() < zzge) {
                ByteBuffer order = ByteBuffer.allocateDirect(zzge).order(ByteOrder.nativeOrder());
                this.zzalo = order;
                this.zzamx = order.asShortBuffer();
            } else {
                this.zzalo.clear();
                this.zzamx.clear();
            }
            this.zzamw.zzb(this.zzamx);
            this.zzamz += zzge;
            this.zzalo.limit(zzge);
            this.zzakn = this.zzalo;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final void zzfk() {
        this.zzamw.zzfk();
        this.zzalp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final ByteBuffer zzfl() {
        ByteBuffer byteBuffer = this.zzakn;
        this.zzakn = zzaig;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final boolean zzfd() {
        if (this.zzalp) {
            zzis zzisVar = this.zzamw;
            return zzisVar == null || zzisVar.zzge() == 0;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final void flush() {
        zzis zzisVar = new zzis(this.zzalk, this.zzags);
        this.zzamw = zzisVar;
        zzisVar.setSpeed(this.zzahf);
        this.zzamw.zza(this.zzahg);
        this.zzakn = zzaig;
        this.zzamy = 0L;
        this.zzamz = 0L;
        this.zzalp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final void reset() {
        this.zzamw = null;
        ByteBuffer byteBuffer = zzaig;
        this.zzalo = byteBuffer;
        this.zzamx = byteBuffer.asShortBuffer();
        this.zzakn = zzaig;
        this.zzags = -1;
        this.zzalk = -1;
        this.zzamy = 0L;
        this.zzamz = 0L;
        this.zzalp = false;
    }
}
