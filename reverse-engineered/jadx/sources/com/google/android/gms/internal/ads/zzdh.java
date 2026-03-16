package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import com.google.android.gms.internal.ads.zzbm;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzdh {
    private static final ConditionVariable zzvq = new ConditionVariable();
    protected static volatile zzsy zzvr = null;
    private static volatile Random zzvt = null;
    private zzeo zzvp;
    protected volatile Boolean zzvs;

    public zzdh(zzeo zzeoVar) {
        this.zzvp = zzeoVar;
        zzeoVar.zzch().execute(new zzdk(this));
    }

    public final void zza(int i, int i2, long j) {
        zza(i, i2, j, null, null);
    }

    public final void zza(int i, int i2, long j, String str) {
        zza(i, -1, j, str, null);
    }

    public final void zza(int i, int i2, long j, String str, Exception exc) {
        try {
            zzvq.block();
            if (!this.zzvs.booleanValue() || zzvr == null) {
                return;
            }
            zzbm.zza.C0007zza zzc = zzbm.zza.zzt().zzi(this.zzvp.zzvf.getPackageName()).zzc(j);
            if (str != null) {
                zzc.zzl(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                zzdzz.zza(exc, new PrintWriter(stringWriter));
                zzc.zzj(stringWriter.toString()).zzk(exc.getClass().getName());
            }
            zztc zzf = zzvr.zzf(((zzbm.zza) ((zzecd) zzc.zzbet())).toByteArray());
            zzf.zzbs(i);
            if (i2 != -1) {
                zzf.zzbr(i2);
            }
            zzf.zzdx();
        } catch (Exception unused) {
        }
    }

    public static int zzbv() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return zzbw().nextInt();
        } catch (RuntimeException unused) {
            return zzbw().nextInt();
        }
    }

    private static Random zzbw() {
        if (zzvt == null) {
            synchronized (zzdh.class) {
                if (zzvt == null) {
                    zzvt = new Random();
                }
            }
        }
        return zzvt;
    }
}
