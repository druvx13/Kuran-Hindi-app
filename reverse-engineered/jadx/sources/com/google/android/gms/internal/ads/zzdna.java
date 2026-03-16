package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzbv;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
final class zzdna implements zzdlq {
    private final Object zzhcv;
    private final zzdmz zzhcw;
    private final zzdnm zzhcx;
    private final zzdlk zzvj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdna(Object obj, zzdmz zzdmzVar, zzdnm zzdnmVar, zzdlk zzdlkVar) {
        this.zzhcv = obj;
        this.zzhcw = zzdmzVar;
        this.zzhcx = zzdnmVar;
        this.zzvj = zzdlkVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdmz zzave() {
        return this.zzhcw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzavf() throws zzdnk {
        try {
        } catch (Exception e) {
            throw new zzdnk(2001, e);
        }
        return ((Boolean) this.zzhcv.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zzhcv, new Object[0])).booleanValue();
    }

    public final synchronized void close() throws zzdnk {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zzhcv.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zzhcv, new Object[0]);
            this.zzvj.zzg(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzdnk(2003, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlq
    public final synchronized String zzu(Context context, String str) {
        Map<String, Object> zzcd;
        zzcd = this.zzhcx.zzcd();
        zzcd.put("f", "q");
        zzcd.put("ctx", context);
        zzcd.put("aid", null);
        return zzk(zzb(null, zzcd));
    }

    @Override // com.google.android.gms.internal.ads.zzdlq
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map<String, Object> zzce;
        zzce = this.zzhcx.zzce();
        zzce.put("f", "v");
        zzce.put("ctx", context);
        zzce.put("aid", null);
        zzce.put("view", view);
        zzce.put("act", activity);
        return zzk(zzb(null, zzce));
    }

    @Override // com.google.android.gms.internal.ads.zzdlq
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> zzcf;
        zzcf = this.zzhcx.zzcf();
        zzcf.put("f", "c");
        zzcf.put("ctx", context);
        zzcf.put("cs", str2);
        zzcf.put("aid", null);
        zzcf.put("view", view);
        zzcf.put("act", activity);
        return zzk(zzb(null, zzcf));
    }

    @Override // com.google.android.gms.internal.ads.zzdlq
    public final synchronized void zza(String str, MotionEvent motionEvent) throws zzdnk {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zzhcv.getClass().getDeclaredMethod("he", Map.class).invoke(this.zzhcv, hashMap);
            this.zzvj.zzg(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzdnk(2005, e);
        }
    }

    public final synchronized int zzavg() throws zzdnk {
        try {
        } catch (Exception e) {
            throw new zzdnk(2006, e);
        }
        return ((Integer) this.zzhcv.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zzhcv, new Object[0])).intValue();
    }

    private static String zzk(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(((zzbv.zzf) ((zzecd) zzbv.zzf.zzbm().zzb(zzcc.DG).zzj(zzeaq.zzu(bArr)).zzbet())).toByteArray(), 11);
    }

    private final synchronized byte[] zzb(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.zzvj.zza(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.zzhcv.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zzhcv, null, map2);
    }
}
