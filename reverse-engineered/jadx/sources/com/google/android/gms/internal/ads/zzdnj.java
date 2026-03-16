package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdnj {
    private static final HashMap<String, Class<?>> zzhdg = new HashMap<>();
    private final zzdnm zzhcx;
    private zzdna zzhdh;
    private final Object zzhdi = new Object();
    private final Context zzvf;
    private final zzdlk zzvj;

    public zzdnj(Context context, zzdnm zzdnmVar, zzdlk zzdlkVar) {
        this.zzvf = context;
        this.zzhcx = zzdnmVar;
        this.zzvj = zzdlkVar;
    }

    private final synchronized Class<?> zza(zzdmz zzdmzVar) throws zzdnk {
        if (zzdmzVar.zzava() == null) {
            throw new zzdnk(4010, "mc");
        }
        String zzdh = zzdmzVar.zzava().zzdh();
        Class<?> cls = zzhdg.get(zzdh);
        if (cls != null) {
            return cls;
        }
        try {
            File zzavc = zzdmzVar.zzavc();
            if (!zzavc.exists()) {
                zzavc.mkdirs();
            }
            Class<?> loadClass = new DexClassLoader(zzdmzVar.zzavb().getAbsolutePath(), zzavc.getAbsolutePath(), null, this.zzvf.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
            zzhdg.put(zzdh, loadClass);
            return loadClass;
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
            throw new zzdnk(2008, e);
        }
    }

    private final Object zza(Class<?> cls, zzdmz zzdmzVar) throws zzdnk {
        try {
            return cls.getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzvf, "msa-r", zzdmzVar.zzavd(), null, new Bundle(), 2);
        } catch (Exception e) {
            throw new zzdnk(2004, e);
        }
    }

    public final void zzb(zzdmz zzdmzVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzdna zzdnaVar = new zzdna(zza(zza(zzdmzVar), zzdmzVar), zzdmzVar, this.zzhcx, this.zzvj);
            if (!zzdnaVar.zzavf()) {
                throw new zzdnk(4000, "init failed");
            }
            int zzavg = zzdnaVar.zzavg();
            if (zzavg != 0) {
                StringBuilder sb = new StringBuilder(15);
                sb.append("ci: ");
                sb.append(zzavg);
                throw new zzdnk(4001, sb.toString());
            }
            synchronized (this.zzhdi) {
                if (this.zzhdh != null) {
                    try {
                        this.zzhdh.close();
                    } catch (zzdnk e) {
                        this.zzvj.zza(e.zzavm(), -1L, e);
                    }
                }
                this.zzhdh = zzdnaVar;
            }
            this.zzvj.zzg(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - currentTimeMillis);
        } catch (zzdnk e2) {
            this.zzvj.zza(e2.zzavm(), System.currentTimeMillis() - currentTimeMillis, e2);
        } catch (Exception e3) {
            this.zzvj.zza(4010, System.currentTimeMillis() - currentTimeMillis, e3);
        }
    }

    public final zzdlq zzavk() {
        zzdna zzdnaVar;
        synchronized (this.zzhdi) {
            zzdnaVar = this.zzhdh;
        }
        return zzdnaVar;
    }

    public final zzdmz zzavl() {
        synchronized (this.zzhdi) {
            if (this.zzhdh != null) {
                return this.zzhdh.zzave();
            }
            return null;
        }
    }
}
