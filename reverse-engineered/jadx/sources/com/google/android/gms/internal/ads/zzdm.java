package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.internal.ads.zzbo;
import com.google.android.gms.internal.ads.zzbv;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzdm implements zzdj {
    protected static volatile zzeo zzvp;
    protected MotionEvent zzwh;
    protected double zzwq;
    private double zzwr;
    private double zzws;
    protected float zzwt;
    protected float zzwu;
    protected float zzwv;
    protected float zzww;
    protected DisplayMetrics zzwz;
    protected LinkedList<MotionEvent> zzwi = new LinkedList<>();
    protected long zzwj = 0;
    protected long zzwk = 0;
    protected long zzwl = 0;
    protected long zzwm = 0;
    protected long zzwn = 0;
    protected long zzwo = 0;
    protected long zzwp = 0;
    private boolean zzwx = false;
    protected boolean zzwy = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdm(Context context) {
        try {
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcoa)).booleanValue()) {
                zzcn.zzbp();
            } else {
                zzer.zzb(zzvp);
            }
            this.zzwz = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    protected abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzeh;

    protected abstract zzbv.zza.C0010zza zza(Context context, zzbo.zza zzaVar);

    protected abstract zzbv.zza.C0010zza zzb(Context context, View view, Activity activity);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract zzeu zzb(MotionEvent motionEvent) throws zzeh;

    @Override // com.google.android.gms.internal.ads.zzdj
    public void zzb(View view) {
    }

    protected abstract zzbv.zza.C0010zza zzc(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzdj
    public String zzb(Context context) {
        if (zzet.isMainThread()) {
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcoc)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return zza(context, null, zzcm.zznb, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public String zza(Context context, View view, Activity activity) {
        return zza(context, null, zzcm.zznc, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public String zza(Context context, String str, View view, Activity activity) {
        return zza(context, str, zzcm.zznd, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public void zza(MotionEvent motionEvent) {
        boolean z = false;
        if (this.zzwx) {
            zzca();
            this.zzwx = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzwq = 0.0d;
            this.zzwr = motionEvent.getRawX();
            this.zzws = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = this.zzwr;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.zzws;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.zzwq += Math.sqrt((d2 * d2) + (d4 * d4));
            this.zzwr = rawX;
            this.zzws = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzwh = obtain;
                    this.zzwi.add(obtain);
                    if (this.zzwi.size() > 6) {
                        this.zzwi.remove().recycle();
                    }
                    this.zzwl++;
                    this.zzwn = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zzwk += motionEvent.getHistorySize() + 1;
                    zzeu zzb = zzb(motionEvent);
                    if ((zzb == null || zzb.zzzf == null || zzb.zzzi == null) ? false : true) {
                        this.zzwo += zzb.zzzf.longValue() + zzb.zzzi.longValue();
                    }
                    if (this.zzwz != null && zzb != null && zzb.zzzg != null && zzb.zzzj != null) {
                        z = true;
                    }
                    if (z) {
                        this.zzwp += zzb.zzzg.longValue() + zzb.zzzj.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzwm++;
                }
            } catch (zzeh unused) {
            }
        } else {
            this.zzwt = motionEvent.getX();
            this.zzwu = motionEvent.getY();
            this.zzwv = motionEvent.getRawX();
            this.zzww = motionEvent.getRawY();
            this.zzwj++;
        }
        this.zzwy = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public void zza(int i, int i2, int i3) {
        if (this.zzwh != null) {
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcnn)).booleanValue()) {
                zzca();
            } else {
                this.zzwh.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzwz;
        if (displayMetrics != null) {
            this.zzwh = MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, this.zzwz.density * i2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzwh = null;
        }
        this.zzwy = false;
    }

    private final void zzca() {
        this.zzwn = 0L;
        this.zzwj = 0L;
        this.zzwk = 0L;
        this.zzwl = 0L;
        this.zzwm = 0L;
        this.zzwo = 0L;
        this.zzwp = 0L;
        if (this.zzwi.size() > 0) {
            Iterator<MotionEvent> it = this.zzwi.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.zzwi.clear();
        } else {
            MotionEvent motionEvent = this.zzwh;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzwh = null;
    }

    private final String zza(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        zzdh zzdhVar;
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) zzvj.zzpv().zzd(zzzz.zzcnp)).booleanValue();
        zzbv.zza.C0010zza c0010zza = null;
        if (booleanValue) {
            zzdhVar = zzvp != null ? zzvp.zzcm() : null;
            str2 = ((Boolean) zzvj.zzpv().zzd(zzzz.zzcoa)).booleanValue() ? "be" : "te";
        } else {
            zzdhVar = null;
            str2 = null;
        }
        try {
            if (i == zzcm.zznd) {
                c0010zza = zzc(context, view, activity);
                this.zzwx = true;
                i5 = PointerIconCompat.TYPE_HAND;
            } else if (i == zzcm.zznc) {
                c0010zza = zzb(context, view, activity);
                i5 = PointerIconCompat.TYPE_TEXT;
            } else {
                c0010zza = zza(context, null);
                i5 = 1000;
            }
            if (booleanValue && zzdhVar != null) {
                zzdhVar.zza(i5, -1, System.currentTimeMillis() - currentTimeMillis, str2);
            }
        } catch (Exception e) {
            if (booleanValue && zzdhVar != null) {
                if (i == zzcm.zznd) {
                    i2 = PointerIconCompat.TYPE_HELP;
                } else if (i == zzcm.zznc) {
                    i2 = PointerIconCompat.TYPE_VERTICAL_TEXT;
                } else {
                    i2 = i == zzcm.zznb ? PointerIconCompat.TYPE_CONTEXT_MENU : -1;
                }
                zzdhVar.zza(i2, -1, System.currentTimeMillis() - currentTimeMillis, str2, e);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (c0010zza != null) {
            try {
                if (((zzbv.zza) ((zzecd) c0010zza.zzbet())).zzbex() != 0) {
                    String zzj = zzcn.zzj((zzbv.zza) ((zzecd) c0010zza.zzbet()), str);
                    if (!booleanValue || zzdhVar == null) {
                        return zzj;
                    }
                    if (i == zzcm.zznd) {
                        i4 = PointerIconCompat.TYPE_CELL;
                    } else if (i == zzcm.zznc) {
                        i4 = PointerIconCompat.TYPE_ALIAS;
                    } else {
                        i4 = i == zzcm.zznb ? PointerIconCompat.TYPE_WAIT : -1;
                    }
                    zzdhVar.zza(i4, -1, System.currentTimeMillis() - currentTimeMillis2, str2);
                    return zzj;
                }
            } catch (Exception e2) {
                String num = Integer.toString(7);
                if (!booleanValue || zzdhVar == null) {
                    return num;
                }
                if (i == zzcm.zznd) {
                    i3 = PointerIconCompat.TYPE_CROSSHAIR;
                } else if (i == zzcm.zznc) {
                    i3 = PointerIconCompat.TYPE_COPY;
                } else {
                    i3 = i == zzcm.zznb ? 1005 : -1;
                }
                zzdhVar.zza(i3, -1, System.currentTimeMillis() - currentTimeMillis2, str2, e2);
                return num;
            }
        }
        return Integer.toString(5);
    }
}
