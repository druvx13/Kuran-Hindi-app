package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbzx {
    private Bundle extras;
    private zzack zzcyw;
    private List<?> zzemd;
    private double zzemg;
    private float zzems;
    private IObjectWrapper zzfke;
    private int zzfry;
    private zzxl zzfrz;
    private View zzfsa;
    private zzye zzfsb;
    private zzbek zzfsc;
    private zzbek zzfsd;
    private View zzfse;
    private IObjectWrapper zzfsf;
    private zzacs zzfsg;
    private zzacs zzfsh;
    private String zzfsi;
    private String zzfsl;
    private SimpleArrayMap<String, zzace> zzfsj = new SimpleArrayMap<>();
    private SimpleArrayMap<String, String> zzfsk = new SimpleArrayMap<>();
    private List<zzye> zzczk = Collections.emptyList();

    public final synchronized void zzdr(int i) {
        this.zzfry = i;
    }

    public final synchronized void zzb(zzxl zzxlVar) {
        this.zzfrz = zzxlVar;
    }

    public final synchronized void zza(zzack zzackVar) {
        this.zzcyw = zzackVar;
    }

    public final synchronized void setImages(List<zzace> list) {
        this.zzemd = list;
    }

    public final synchronized void zzg(List<zzye> list) {
        this.zzczk = list;
    }

    public final synchronized void zza(zzye zzyeVar) {
        this.zzfsb = zzyeVar;
    }

    public final synchronized void zzab(View view) {
        this.zzfse = view;
    }

    public final synchronized void setStarRating(double d) {
        this.zzemg = d;
    }

    public final synchronized void zza(zzacs zzacsVar) {
        this.zzfsg = zzacsVar;
    }

    public final synchronized void zzb(zzacs zzacsVar) {
        this.zzfsh = zzacsVar;
    }

    public final synchronized void zzfy(String str) {
        this.zzfsi = str;
    }

    public final synchronized void zzi(zzbek zzbekVar) {
        this.zzfsc = zzbekVar;
    }

    public final synchronized void zzj(zzbek zzbekVar) {
        this.zzfsd = zzbekVar;
    }

    public final synchronized void zzas(IObjectWrapper iObjectWrapper) {
        this.zzfke = iObjectWrapper;
    }

    public final synchronized void zzn(String str, String str2) {
        if (str2 == null) {
            this.zzfsk.remove(str);
        } else {
            this.zzfsk.put(str, str2);
        }
    }

    public final synchronized void zza(String str, zzace zzaceVar) {
        if (zzaceVar == null) {
            this.zzfsj.remove(str);
        } else {
            this.zzfsj.put(str, zzaceVar);
        }
    }

    private final synchronized void setMediaContentAspectRatio(float f) {
        this.zzems = f;
    }

    public final synchronized void zzfz(String str) {
        this.zzfsl = str;
    }

    private final synchronized String zzga(String str) {
        return this.zzfsk.get(str);
    }

    public final synchronized int zzakw() {
        return this.zzfry;
    }

    public final synchronized zzxl getVideoController() {
        return this.zzfrz;
    }

    public final synchronized zzack zzsb() {
        return this.zzcyw;
    }

    public final synchronized View zzakx() {
        return this.zzfsa;
    }

    public final synchronized String getHeadline() {
        return zzga("headline");
    }

    public final synchronized List<?> getImages() {
        return this.zzemd;
    }

    public final zzacs zzaky() {
        List<?> list = this.zzemd;
        if (list != null && list.size() != 0) {
            Object obj = this.zzemd.get(0);
            if (obj instanceof IBinder) {
                return zzacv.zzo((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized List<zzye> getMuteThisAdReasons() {
        return this.zzczk;
    }

    public final synchronized zzye zzakz() {
        return this.zzfsb;
    }

    public final synchronized String getBody() {
        return zzga("body");
    }

    public final synchronized Bundle getExtras() {
        if (this.extras == null) {
            this.extras = new Bundle();
        }
        return this.extras;
    }

    public final synchronized String getCallToAction() {
        return zzga("call_to_action");
    }

    public final synchronized View zzala() {
        return this.zzfse;
    }

    public final synchronized IObjectWrapper zzsc() {
        return this.zzfsf;
    }

    public final synchronized String getStore() {
        return zzga("store");
    }

    public final synchronized String getPrice() {
        return zzga(FirebaseAnalytics.Param.PRICE);
    }

    public final synchronized double getStarRating() {
        return this.zzemg;
    }

    public final synchronized zzacs zzsa() {
        return this.zzfsg;
    }

    public final synchronized String getAdvertiser() {
        return zzga("advertiser");
    }

    public final synchronized zzacs zzsd() {
        return this.zzfsh;
    }

    public final synchronized String getCustomTemplateId() {
        return this.zzfsi;
    }

    public final synchronized zzbek zzalb() {
        return this.zzfsc;
    }

    public final synchronized zzbek zzalc() {
        return this.zzfsd;
    }

    public final synchronized IObjectWrapper zzald() {
        return this.zzfke;
    }

    public final synchronized SimpleArrayMap<String, zzace> zzale() {
        return this.zzfsj;
    }

    public final synchronized float getMediaContentAspectRatio() {
        return this.zzems;
    }

    public final synchronized String zzalf() {
        return this.zzfsl;
    }

    public final synchronized SimpleArrayMap<String, String> zzalg() {
        return this.zzfsk;
    }

    public final synchronized void destroy() {
        if (this.zzfsc != null) {
            this.zzfsc.destroy();
            this.zzfsc = null;
        }
        if (this.zzfsd != null) {
            this.zzfsd.destroy();
            this.zzfsd = null;
        }
        this.zzfke = null;
        this.zzfsj.clear();
        this.zzfsk.clear();
        this.zzfrz = null;
        this.zzcyw = null;
        this.zzfsa = null;
        this.zzemd = null;
        this.extras = null;
        this.zzfse = null;
        this.zzfsf = null;
        this.zzfsg = null;
        this.zzfsh = null;
        this.zzfsi = null;
    }

    public static zzbzx zza(zzamd zzamdVar) {
        try {
            zzbzu zza = zza(zzamdVar.getVideoController(), (zzame) null);
            zzack zzsb = zzamdVar.zzsb();
            String headline = zzamdVar.getHeadline();
            List<?> images = zzamdVar.getImages();
            String body = zzamdVar.getBody();
            Bundle extras = zzamdVar.getExtras();
            String callToAction = zzamdVar.getCallToAction();
            IObjectWrapper zzsc = zzamdVar.zzsc();
            String advertiser = zzamdVar.getAdvertiser();
            zzacs zzsd = zzamdVar.zzsd();
            zzbzx zzbzxVar = new zzbzx();
            zzbzxVar.zzfry = 1;
            zzbzxVar.zzfrz = zza;
            zzbzxVar.zzcyw = zzsb;
            zzbzxVar.zzfsa = (View) zzat(zzamdVar.zztr());
            zzbzxVar.zzn("headline", headline);
            zzbzxVar.zzemd = images;
            zzbzxVar.zzn("body", body);
            zzbzxVar.extras = extras;
            zzbzxVar.zzn("call_to_action", callToAction);
            zzbzxVar.zzfse = (View) zzat(zzamdVar.zzts());
            zzbzxVar.zzfsf = zzsc;
            zzbzxVar.zzn("advertiser", advertiser);
            zzbzxVar.zzfsh = zzsd;
            return zzbzxVar;
        } catch (RemoteException e) {
            zzawr.zzd("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzbzx zza(zzaly zzalyVar) {
        try {
            zzbzu zza = zza(zzalyVar.getVideoController(), (zzame) null);
            zzack zzsb = zzalyVar.zzsb();
            String headline = zzalyVar.getHeadline();
            List<?> images = zzalyVar.getImages();
            String body = zzalyVar.getBody();
            Bundle extras = zzalyVar.getExtras();
            String callToAction = zzalyVar.getCallToAction();
            IObjectWrapper zzsc = zzalyVar.zzsc();
            String store = zzalyVar.getStore();
            String price = zzalyVar.getPrice();
            double starRating = zzalyVar.getStarRating();
            zzacs zzsa = zzalyVar.zzsa();
            zzbzx zzbzxVar = new zzbzx();
            zzbzxVar.zzfry = 2;
            zzbzxVar.zzfrz = zza;
            zzbzxVar.zzcyw = zzsb;
            zzbzxVar.zzfsa = (View) zzat(zzalyVar.zztr());
            zzbzxVar.zzn("headline", headline);
            zzbzxVar.zzemd = images;
            zzbzxVar.zzn("body", body);
            zzbzxVar.extras = extras;
            zzbzxVar.zzn("call_to_action", callToAction);
            zzbzxVar.zzfse = (View) zzat(zzalyVar.zzts());
            zzbzxVar.zzfsf = zzsc;
            zzbzxVar.zzn("store", store);
            zzbzxVar.zzn(FirebaseAnalytics.Param.PRICE, price);
            zzbzxVar.zzemg = starRating;
            zzbzxVar.zzfsg = zzsa;
            return zzbzxVar;
        } catch (RemoteException e) {
            zzawr.zzd("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzbzx zzb(zzame zzameVar) {
        try {
            return zza(zza(zzameVar.getVideoController(), zzameVar), zzameVar.zzsb(), (View) zzat(zzameVar.zztr()), zzameVar.getHeadline(), zzameVar.getImages(), zzameVar.getBody(), zzameVar.getExtras(), zzameVar.getCallToAction(), (View) zzat(zzameVar.zzts()), zzameVar.zzsc(), zzameVar.getStore(), zzameVar.getPrice(), zzameVar.getStarRating(), zzameVar.zzsa(), zzameVar.getAdvertiser(), zzameVar.getMediaContentAspectRatio());
        } catch (RemoteException e) {
            zzawr.zzd("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static zzbzx zzb(zzaly zzalyVar) {
        try {
            return zza(zza(zzalyVar.getVideoController(), (zzame) null), zzalyVar.zzsb(), (View) zzat(zzalyVar.zztr()), zzalyVar.getHeadline(), zzalyVar.getImages(), zzalyVar.getBody(), zzalyVar.getExtras(), zzalyVar.getCallToAction(), (View) zzat(zzalyVar.zzts()), zzalyVar.zzsc(), zzalyVar.getStore(), zzalyVar.getPrice(), zzalyVar.getStarRating(), zzalyVar.zzsa(), null, 0.0f);
        } catch (RemoteException e) {
            zzawr.zzd("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzbzx zzb(zzamd zzamdVar) {
        try {
            return zza(zza(zzamdVar.getVideoController(), (zzame) null), zzamdVar.zzsb(), (View) zzat(zzamdVar.zztr()), zzamdVar.getHeadline(), zzamdVar.getImages(), zzamdVar.getBody(), zzamdVar.getExtras(), zzamdVar.getCallToAction(), (View) zzat(zzamdVar.zzts()), zzamdVar.zzsc(), null, null, -1.0d, zzamdVar.zzsd(), zzamdVar.getAdvertiser(), 0.0f);
        } catch (RemoteException e) {
            zzawr.zzd("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzbzx zza(zzxl zzxlVar, zzack zzackVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzacs zzacsVar, String str6, float f) {
        zzbzx zzbzxVar = new zzbzx();
        zzbzxVar.zzfry = 6;
        zzbzxVar.zzfrz = zzxlVar;
        zzbzxVar.zzcyw = zzackVar;
        zzbzxVar.zzfsa = view;
        zzbzxVar.zzn("headline", str);
        zzbzxVar.zzemd = list;
        zzbzxVar.zzn("body", str2);
        zzbzxVar.extras = bundle;
        zzbzxVar.zzn("call_to_action", str3);
        zzbzxVar.zzfse = view2;
        zzbzxVar.zzfsf = iObjectWrapper;
        zzbzxVar.zzn("store", str4);
        zzbzxVar.zzn(FirebaseAnalytics.Param.PRICE, str5);
        zzbzxVar.zzemg = d;
        zzbzxVar.zzfsg = zzacsVar;
        zzbzxVar.zzn("advertiser", str6);
        zzbzxVar.setMediaContentAspectRatio(f);
        return zzbzxVar;
    }

    private static <T> T zzat(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return (T) ObjectWrapper.unwrap(iObjectWrapper);
    }

    private static zzbzu zza(zzxl zzxlVar, zzame zzameVar) {
        if (zzxlVar == null) {
            return null;
        }
        return new zzbzu(zzxlVar, zzameVar);
    }
}
