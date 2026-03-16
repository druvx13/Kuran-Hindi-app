package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzpk {
    private final zzpj zzbjw;
    private final boolean zzbjx;
    private final long zzbjy;
    private final long zzbjz;
    private long zzbka;
    private long zzbkb;
    private long zzbkc;
    private boolean zzbkd;
    private long zzbke;
    private long zzbkf;
    private long zzbkg;

    public zzpk() {
        this(-1.0d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzpk(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r0 = r3.getDefaultDisplay()
            if (r0 == 0) goto L18
            android.view.Display r3 = r3.getDefaultDisplay()
            float r3 = r3.getRefreshRate()
            double r0 = (double) r3
            goto L1a
        L18:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L1a:
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpk.<init>(android.content.Context):void");
    }

    private zzpk(double d) {
        boolean z = d != -1.0d;
        this.zzbjx = z;
        if (z) {
            this.zzbjw = zzpj.zzjn();
            long j = (long) (1.0E9d / d);
            this.zzbjy = j;
            this.zzbjz = (j * 80) / 100;
            return;
        }
        this.zzbjw = null;
        this.zzbjy = -1L;
        this.zzbjz = -1L;
    }

    public final void enable() {
        this.zzbkd = false;
        if (this.zzbjx) {
            this.zzbjw.zzjo();
        }
    }

    public final void disable() {
        if (this.zzbjx) {
            this.zzbjw.zzjp();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzf(long r12, long r14) {
        /*
            r11 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            boolean r2 = r11.zzbkd
            if (r2 == 0) goto L42
            long r2 = r11.zzbka
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L19
            long r2 = r11.zzbkg
            r4 = 1
            long r2 = r2 + r4
            r11.zzbkg = r2
            long r2 = r11.zzbkc
            r11.zzbkb = r2
        L19:
            long r2 = r11.zzbkg
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L3a
            long r4 = r11.zzbkf
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r11.zzbkb
            long r2 = r2 + r4
            boolean r4 = r11.zzg(r2, r14)
            if (r4 == 0) goto L33
            r11.zzbkd = r6
            goto L42
        L33:
            long r4 = r11.zzbke
            long r4 = r4 + r2
            long r6 = r11.zzbkf
            long r4 = r4 - r6
            goto L44
        L3a:
            boolean r2 = r11.zzg(r0, r14)
            if (r2 == 0) goto L42
            r11.zzbkd = r6
        L42:
            r4 = r14
            r2 = r0
        L44:
            boolean r6 = r11.zzbkd
            r7 = 0
            if (r6 != 0) goto L53
            r11.zzbkf = r0
            r11.zzbke = r14
            r11.zzbkg = r7
            r14 = 1
            r11.zzbkd = r14
        L53:
            r11.zzbka = r12
            r11.zzbkc = r2
            com.google.android.gms.internal.ads.zzpj r12 = r11.zzbjw
            if (r12 == 0) goto L86
            long r12 = r12.zzbjr
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L62
            goto L86
        L62:
            com.google.android.gms.internal.ads.zzpj r12 = r11.zzbjw
            long r12 = r12.zzbjr
            long r14 = r11.zzbjy
            long r0 = r4 - r12
            long r0 = r0 / r14
            long r0 = r0 * r14
            long r12 = r12 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L75
            long r14 = r12 - r14
            goto L79
        L75:
            long r14 = r14 + r12
            r9 = r12
            r12 = r14
            r14 = r9
        L79:
            long r0 = r12 - r4
            long r4 = r4 - r14
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L81
            goto L82
        L81:
            r12 = r14
        L82:
            long r14 = r11.zzbjz
            long r12 = r12 - r14
            return r12
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpk.zzf(long, long):long");
    }

    private final boolean zzg(long j, long j2) {
        return Math.abs((j2 - this.zzbke) - (j - this.zzbkf)) > 20000000;
    }
}
