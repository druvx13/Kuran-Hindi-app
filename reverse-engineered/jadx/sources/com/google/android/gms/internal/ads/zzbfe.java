package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbfe extends zzxk {
    private boolean zzacz;
    private boolean zzada;
    private int zzaec;
    private zzxm zzdgn;
    private final zzbbx zzebj;
    private final boolean zzekv;
    private final boolean zzekw;
    private boolean zzekx;
    private float zzekz;
    private float zzela;
    private float zzelb;
    private zzaee zzelc;
    private final Object lock = new Object();
    private boolean zzeky = true;

    public zzbfe(zzbbx zzbbxVar, float f, boolean z, boolean z2) {
        this.zzebj = zzbbxVar;
        this.zzekz = f;
        this.zzekv = z;
        this.zzekw = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void play() {
        zzf("play", null);
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void pause() {
        zzf("pause", null);
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void stop() {
        zzf("stop", null);
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void mute(boolean z) {
        zzf(z ? "mute" : "unmute", null);
    }

    public final void zzb(zzze zzzeVar) {
        boolean z = zzzeVar.zzacy;
        boolean z2 = zzzeVar.zzacz;
        boolean z3 = zzzeVar.zzada;
        synchronized (this.lock) {
            this.zzacz = z2;
            this.zzada = z3;
        }
        zzf("initialState", CollectionUtils.mapOf("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    private final void zzf(String str, Map<String, String> map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzbab.zzdzv.execute(new Runnable(this, hashMap) { // from class: com.google.android.gms.internal.ads.zzbfd
            private final Map zzdzm;
            private final zzbfe zzeku;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeku = this;
                this.zzdzm = hashMap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzeku.zzk(this.zzdzm);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final boolean isMuted() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzeky;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final int getPlaybackState() {
        int i;
        synchronized (this.lock) {
            i = this.zzaec;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final float getAspectRatio() {
        float f;
        synchronized (this.lock) {
            f = this.zzelb;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final float getDuration() {
        float f;
        synchronized (this.lock) {
            f = this.zzekz;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final float getCurrentTime() {
        float f;
        synchronized (this.lock) {
            f = this.zzela;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void zza(zzxm zzxmVar) {
        synchronized (this.lock) {
            this.zzdgn = zzxmVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final zzxm zzqg() throws RemoteException {
        zzxm zzxmVar;
        synchronized (this.lock) {
            zzxmVar = this.zzdgn;
        }
        return zzxmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final boolean isCustomControlsEnabled() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzekv && this.zzacz;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final boolean isClickToExpandEnabled() {
        boolean z;
        boolean isCustomControlsEnabled = isCustomControlsEnabled();
        synchronized (this.lock) {
            if (!isCustomControlsEnabled) {
                try {
                    z = (this.zzada && this.zzekw) ? true : true;
                } finally {
                }
            }
            z = false;
        }
        return z;
    }

    public final void zze(float f) {
        synchronized (this.lock) {
            this.zzela = f;
        }
    }

    public final void zzacj() {
        boolean z;
        int i;
        synchronized (this.lock) {
            z = this.zzeky;
            i = this.zzaec;
            this.zzaec = 3;
        }
        zza(i, 3, z, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[Catch: all -> 0x004f, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:11:0x0013, B:13:0x002f, B:14:0x0038), top: B:29:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(float r4, float r5, int r6, boolean r7, float r8) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            float r1 = r3.zzekz     // Catch: java.lang.Throwable -> L4f
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L12
            float r1 = r3.zzelb     // Catch: java.lang.Throwable -> L4f
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            r3.zzekz = r5     // Catch: java.lang.Throwable -> L4f
            r3.zzela = r4     // Catch: java.lang.Throwable -> L4f
            boolean r4 = r3.zzeky     // Catch: java.lang.Throwable -> L4f
            r3.zzeky = r7     // Catch: java.lang.Throwable -> L4f
            int r5 = r3.zzaec     // Catch: java.lang.Throwable -> L4f
            r3.zzaec = r6     // Catch: java.lang.Throwable -> L4f
            float r2 = r3.zzelb     // Catch: java.lang.Throwable -> L4f
            r3.zzelb = r8     // Catch: java.lang.Throwable -> L4f
            float r8 = r8 - r2
            float r8 = java.lang.Math.abs(r8)     // Catch: java.lang.Throwable -> L4f
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L38
            com.google.android.gms.internal.ads.zzbbx r8 = r3.zzebj     // Catch: java.lang.Throwable -> L4f
            android.view.View r8 = r8.getView()     // Catch: java.lang.Throwable -> L4f
            r8.invalidate()     // Catch: java.lang.Throwable -> L4f
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzaee r8 = r3.zzelc     // Catch: android.os.RemoteException -> L45
            if (r8 == 0) goto L4b
            com.google.android.gms.internal.ads.zzaee r8 = r3.zzelc     // Catch: android.os.RemoteException -> L45
            r8.zzsj()     // Catch: android.os.RemoteException -> L45
            goto L4b
        L45:
            r8 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.zzazw.zze(r0, r8)
        L4b:
            r3.zza(r5, r6, r4, r7)
            return
        L4f:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfe.zza(float, float, int, boolean, float):void");
    }

    public final void zza(zzaee zzaeeVar) {
        synchronized (this.lock) {
            this.zzelc = zzaeeVar;
        }
    }

    private final void zza(final int i, final int i2, final boolean z, final boolean z2) {
        zzbab.zzdzv.execute(new Runnable(this, i, i2, z, z2) { // from class: com.google.android.gms.internal.ads.zzbfg
            private final int zzdwt;
            private final int zzdwu;
            private final boolean zzeiu;
            private final boolean zzeiv;
            private final zzbfe zzeku;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeku = this;
                this.zzdwt = i;
                this.zzdwu = i2;
                this.zzeiu = z;
                this.zzeiv = z2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzeku.zzb(this.zzdwt, this.zzdwu, this.zzeiu, this.zzeiv);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(int i, int i2, boolean z, boolean z2) {
        synchronized (this.lock) {
            boolean z3 = false;
            boolean z4 = i != i2;
            boolean z5 = !this.zzekx && i2 == 1;
            boolean z6 = z4 && i2 == 1;
            boolean z7 = z4 && i2 == 2;
            boolean z8 = z4 && i2 == 3;
            boolean z9 = z != z2;
            this.zzekx = (this.zzekx || z5) ? true : true;
            if (z5) {
                try {
                    if (this.zzdgn != null) {
                        this.zzdgn.onVideoStart();
                    }
                } catch (RemoteException e) {
                    zzazw.zze("#007 Could not call remote method.", e);
                }
            }
            if (z6 && this.zzdgn != null) {
                this.zzdgn.onVideoPlay();
            }
            if (z7 && this.zzdgn != null) {
                this.zzdgn.onVideoPause();
            }
            if (z8) {
                if (this.zzdgn != null) {
                    this.zzdgn.onVideoEnd();
                }
                this.zzebj.zzzn();
            }
            if (z9 && this.zzdgn != null) {
                this.zzdgn.onVideoMute(z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(Map map) {
        this.zzebj.zza("pubVideoCmd", map);
    }
}
