package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbbv extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzbbw {
    private static final float[] zzecs = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private int height;
    private int width;
    private final float[] zzecp;
    private final zzbbu zzect;
    private final float[] zzecu;
    private final float[] zzecv;
    private final float[] zzecw;
    private final float[] zzecx;
    private final float[] zzecy;
    private final float[] zzecz;
    private float zzeda;
    private float zzedb;
    private float zzedc;
    private SurfaceTexture zzedd;
    private SurfaceTexture zzede;
    private int zzedf;
    private int zzedg;
    private int zzedh;
    private FloatBuffer zzedi;
    private final CountDownLatch zzedj;
    private final Object zzedk;
    private EGL10 zzedl;
    private EGLDisplay zzedm;
    private EGLContext zzedn;
    private EGLSurface zzedo;
    private volatile boolean zzedp;
    private volatile boolean zzedq;

    public zzbbv(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(zzecs.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzedi = asFloatBuffer;
        asFloatBuffer.put(zzecs).position(0);
        this.zzecp = new float[9];
        this.zzecu = new float[9];
        this.zzecv = new float[9];
        this.zzecw = new float[9];
        this.zzecx = new float[9];
        this.zzecy = new float[9];
        this.zzecz = new float[9];
        this.zzeda = Float.NaN;
        zzbbu zzbbuVar = new zzbbu(context);
        this.zzect = zzbbuVar;
        zzbbuVar.zza(this);
        this.zzedj = new CountDownLatch(1);
        this.zzedk = new Object();
    }

    public final void zza(SurfaceTexture surfaceTexture, int i, int i2) {
        this.width = i;
        this.height = i2;
        this.zzede = surfaceTexture;
    }

    public final void zzm(int i, int i2) {
        synchronized (this.zzedk) {
            this.width = i;
            this.height = i2;
            this.zzedp = true;
            this.zzedk.notifyAll();
        }
    }

    public final void zzzb() {
        synchronized (this.zzedk) {
            this.zzedq = true;
            this.zzede = null;
            this.zzedk.notifyAll();
        }
    }

    public final SurfaceTexture zzzc() {
        if (this.zzede == null) {
            return null;
        }
        try {
            this.zzedj.await();
        } catch (InterruptedException unused) {
        }
        return this.zzedd;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzedh++;
        synchronized (this.zzedk) {
            this.zzedk.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzul() {
        synchronized (this.zzedk) {
            this.zzedk.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.SurfaceTexture, android.graphics.SurfaceTexture$OnFrameAvailableListener] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbv.run():void");
    }

    public final void zzb(float f, float f2) {
        float f3;
        float f4;
        float f5;
        int i = this.width;
        int i2 = this.height;
        if (i > i2) {
            f3 = (f * 1.7453293f) / i;
            f4 = f2 * 1.7453293f;
            f5 = i;
        } else {
            f3 = (f * 1.7453293f) / i2;
            f4 = f2 * 1.7453293f;
            f5 = i2;
        }
        this.zzedb -= f3;
        float f6 = this.zzedc - (f4 / f5);
        this.zzedc = f6;
        if (f6 < -1.5707964f) {
            this.zzedc = -1.5707964f;
        }
        if (this.zzedc > 1.5707964f) {
            this.zzedc = 1.5707964f;
        }
    }

    private static void zza(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    private static void zza(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    private static void zzb(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static int zzd(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        zzfg("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            zzfg("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            zzfg("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            zzfg("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                zzfg("deleteShader");
                return 0;
            }
            return glCreateShader;
        }
        return glCreateShader;
    }

    private final boolean zzzd() {
        EGLSurface eGLSurface = this.zzedo;
        boolean z = false;
        if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
            z = this.zzedl.eglDestroySurface(this.zzedm, this.zzedo) | this.zzedl.eglMakeCurrent(this.zzedm, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | false;
            this.zzedo = null;
        }
        EGLContext eGLContext = this.zzedn;
        if (eGLContext != null) {
            z |= this.zzedl.eglDestroyContext(this.zzedm, eGLContext);
            this.zzedn = null;
        }
        EGLDisplay eGLDisplay = this.zzedm;
        if (eGLDisplay != null) {
            boolean eglTerminate = z | this.zzedl.eglTerminate(eGLDisplay);
            this.zzedm = null;
            return eglTerminate;
        }
        return z;
    }

    private static void zzfg(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }
}
