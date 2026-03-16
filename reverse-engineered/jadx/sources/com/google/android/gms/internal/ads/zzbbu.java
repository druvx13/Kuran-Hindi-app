package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbbu implements SensorEventListener {
    private final SensorManager zzeck;
    private final Display zzecm;
    private float[] zzecp;
    private Handler zzecq;
    private zzbbw zzecr;
    private final float[] zzecn = new float[9];
    private final float[] zzeco = new float[9];
    private final Object zzecl = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbu(Context context) {
        this.zzeck = (SensorManager) context.getSystemService("sensor");
        this.zzecm = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void start() {
        if (this.zzecq != null) {
            return;
        }
        Sensor defaultSensor = this.zzeck.getDefaultSensor(11);
        if (defaultSensor == null) {
            zzawr.zzfa("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        zzdns zzdnsVar = new zzdns(handlerThread.getLooper());
        this.zzecq = zzdnsVar;
        if (this.zzeck.registerListener(this, defaultSensor, 0, zzdnsVar)) {
            return;
        }
        zzawr.zzfa("SensorManager.registerListener failed.");
        stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void stop() {
        if (this.zzecq == null) {
            return;
        }
        this.zzeck.unregisterListener(this);
        this.zzecq.post(new zzbbt(this));
        this.zzecq = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzbbw zzbbwVar) {
        this.zzecr = zzbbwVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.zzecl) {
            if (this.zzecp == null) {
                this.zzecp = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.zzecn, fArr);
        int rotation = this.zzecm.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.zzecn, 2, 129, this.zzeco);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.zzecn, 129, 130, this.zzeco);
        } else if (rotation == 3) {
            SensorManager.remapCoordinateSystem(this.zzecn, 130, 1, this.zzeco);
        } else {
            System.arraycopy(this.zzecn, 0, this.zzeco, 0, 9);
        }
        zzl(1, 3);
        zzl(2, 6);
        zzl(5, 7);
        synchronized (this.zzecl) {
            System.arraycopy(this.zzeco, 0, this.zzecp, 0, 9);
        }
        zzbbw zzbbwVar = this.zzecr;
        if (zzbbwVar != null) {
            zzbbwVar.zzul();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(float[] fArr) {
        synchronized (this.zzecl) {
            if (this.zzecp == null) {
                return false;
            }
            System.arraycopy(this.zzecp, 0, fArr, 0, this.zzecp.length);
            return true;
        }
    }

    private final void zzl(int i, int i2) {
        float[] fArr = this.zzeco;
        float f = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f;
    }
}
