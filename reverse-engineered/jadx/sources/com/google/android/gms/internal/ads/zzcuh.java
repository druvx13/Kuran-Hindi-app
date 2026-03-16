package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqj;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzcuu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcuh extends zzavq {
    private static final List<String> zzgkq = new ArrayList(Arrays.asList("/aclk", "/pcs/click"));
    private static final List<String> zzgkr = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    private static final List<String> zzgks = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion"));
    private static final List<String> zzgkt = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    private zzazz zzbml;
    private zzdt zzfgm;
    private final ScheduledExecutorService zzfky;
    private Point zzfql = new Point();
    private Point zzfqm = new Point();
    private final zzdrh zzfur;
    private zzdhp<zzcdt> zzgga;
    private zzbgy zzgku;
    private zzaqh zzgkv;
    private Context zzvf;

    public zzcuh(zzbgy zzbgyVar, Context context, zzdt zzdtVar, zzazz zzazzVar, zzdhp<zzcdt> zzdhpVar, zzdrh zzdrhVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzgku = zzbgyVar;
        this.zzvf = context;
        this.zzfgm = zzdtVar;
        this.zzbml = zzazzVar;
        this.zzgga = zzdhpVar;
        this.zzfur = zzdrhVar;
        this.zzfky = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final IObjectWrapper zzao(IObjectWrapper iObjectWrapper) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final IObjectWrapper zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zza(IObjectWrapper iObjectWrapper, zzavt zzavtVar, zzavm zzavmVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzvf = context;
        String str = zzavtVar.zzbsc;
        String str2 = zzavtVar.zzbna;
        zzum zzumVar = zzavtVar.zzdtf;
        zzuj zzujVar = zzavtVar.zzdtg;
        zzcue zzadj = this.zzgku.zzadj();
        zzbqj.zza zzcb = new zzbqj.zza().zzcb(context);
        zzdhg zzdhgVar = new zzdhg();
        if (str == null) {
            str = "adUnitId";
        }
        zzdhg zzgr = zzdhgVar.zzgr(str);
        if (zzujVar == null) {
            zzujVar = new zzui().zzpg();
        }
        zzdhg zzh = zzgr.zzh(zzujVar);
        if (zzumVar == null) {
            zzumVar = new zzum();
        }
        zzdqw.zza(zzadj.zzf(zzcb.zza(zzh.zzd(zzumVar).zzasc()).zzair()).zza(new zzcuu(new zzcuu.zza().zzgq(str2))).zzf(new zzbuj.zza().zzajm()).zzafv().zzagb(), new zzcuq(this, zzavmVar), this.zzgku.zzacv());
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zzan(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcue)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzaqh zzaqhVar = this.zzgkv;
            this.zzfql = zzaza.zza(motionEvent, zzaqhVar == null ? null : zzaqhVar.zzaae);
            if (motionEvent.getAction() == 0) {
                this.zzfqm = this.zzfql;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(this.zzfql.x, this.zzfql.y);
            this.zzfgm.zza(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zza(zzaqh zzaqhVar) {
        this.zzgkv = zzaqhVar;
        this.zzgga.zzdw(1);
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zza(final List<Uri> list, final IObjectWrapper iObjectWrapper, zzapx zzapxVar) {
        if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcue)).booleanValue()) {
            try {
                zzapxVar.onError("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzazw.zzc("", e);
                return;
            }
        }
        zzdri zzd = this.zzfur.zzd(new Callable(this, list, iObjectWrapper) { // from class: com.google.android.gms.internal.ads.zzcug
            private final zzcuh zzgkn;
            private final List zzgko;
            private final IObjectWrapper zzgkp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgkn = this;
                this.zzgko = list;
                this.zzgkp = iObjectWrapper;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgkn.zza(this.zzgko, this.zzgkp);
            }
        });
        if (zzapw()) {
            zzd = zzdqw.zzb(zzd, new zzdqj(this) { // from class: com.google.android.gms.internal.ads.zzcuj
                private final zzcuh zzgkn;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgkn = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdqj
                public final zzdri zzf(Object obj) {
                    return this.zzgkn.zzb((ArrayList) obj);
                }
            }, this.zzfur);
        } else {
            zzawr.zzfb("Asset view map is empty.");
        }
        zzdqw.zza(zzd, new zzcut(this, zzapxVar), this.zzgku.zzacv());
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zzb(List<Uri> list, final IObjectWrapper iObjectWrapper, zzapx zzapxVar) {
        try {
            if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcue)).booleanValue()) {
                zzapxVar.onError("The updating URL feature is not enabled.");
            } else if (list.size() != 1) {
                zzapxVar.onError("There should be only 1 click URL.");
            } else {
                final Uri uri = list.get(0);
                if (!zza(uri, zzgkq, zzgkr)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    zzawr.zzfc(sb.toString());
                    zzapxVar.onSuccess(list);
                    return;
                }
                zzdri zzd = this.zzfur.zzd(new Callable(this, uri, iObjectWrapper) { // from class: com.google.android.gms.internal.ads.zzcui
                    private final Uri zzdwc;
                    private final zzcuh zzgkn;
                    private final IObjectWrapper zzgkp;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgkn = this;
                        this.zzdwc = uri;
                        this.zzgkp = iObjectWrapper;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zzgkn.zzb(this.zzdwc, this.zzgkp);
                    }
                });
                if (zzapw()) {
                    zzd = zzdqw.zzb(zzd, new zzdqj(this) { // from class: com.google.android.gms.internal.ads.zzcul
                        private final zzcuh zzgkn;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzgkn = this;
                        }

                        @Override // com.google.android.gms.internal.ads.zzdqj
                        public final zzdri zzf(Object obj) {
                            return this.zzgkn.zzl((Uri) obj);
                        }
                    }, this.zzfur);
                } else {
                    zzawr.zzfb("Asset view map is empty.");
                }
                zzdqw.zza(zzd, new zzcus(this, zzapxVar), this.zzgku.zzacv());
            }
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    private static boolean zzk(Uri uri) {
        return zza(uri, zzgks, zzgkt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zza */
    public final Uri zzb(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzfgm.zza(uri, this.zzvf, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzdw e) {
            zzazw.zzd("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    private static boolean zza(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            for (String str : list) {
                if (path.contains(str)) {
                    for (String str2 : list2) {
                        if (host.endsWith(str2)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    private final zzdri<String> zzgp(final String str) {
        final zzcdt[] zzcdtVarArr = new zzcdt[1];
        zzdri zzb = zzdqw.zzb(this.zzgga.zzasg(), new zzdqj(this, zzcdtVarArr, str) { // from class: com.google.android.gms.internal.ads.zzcuo
            private final String zzdep;
            private final zzcuh zzgkn;
            private final zzcdt[] zzgkw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgkn = this;
                this.zzgkw = zzcdtVarArr;
                this.zzdep = str;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgkn.zza(this.zzgkw, this.zzdep, (zzcdt) obj);
            }
        }, this.zzfur);
        zzb.addListener(new Runnable(this, zzcdtVarArr) { // from class: com.google.android.gms.internal.ads.zzcur
            private final zzcuh zzgkn;
            private final zzcdt[] zzgkw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgkn = this;
                this.zzgkw = zzcdtVarArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgkn.zza(this.zzgkw);
            }
        }, this.zzfur);
        return zzdqr.zzg(zzb).zza(((Integer) zzvj.zzpv().zzd(zzzz.zzcuf)).intValue(), TimeUnit.MILLISECONDS, this.zzfky).zza(zzcum.zzdsc, this.zzfur).zza(Exception.class, zzcup.zzdsc, this.zzfur);
    }

    private static Uri zza(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private final boolean zzapw() {
        zzaqh zzaqhVar = this.zzgkv;
        return (zzaqhVar == null || zzaqhVar.zzdli == null || this.zzgkv.zzdli.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzcdt[] zzcdtVarArr) {
        if (zzcdtVarArr[0] != null) {
            this.zzgga.zzd(zzdqw.zzag(zzcdtVarArr[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(zzcdt[] zzcdtVarArr, String str, zzcdt zzcdtVar) throws Exception {
        zzcdtVarArr[0] = zzcdtVar;
        JSONObject zza = zzaza.zza(this.zzvf, this.zzgkv.zzdli, this.zzgkv.zzdli, this.zzgkv.zzaae);
        JSONObject zza2 = zzaza.zza(this.zzvf, this.zzgkv.zzaae);
        JSONObject zzs = zzaza.zzs(this.zzgkv.zzaae);
        JSONObject zzb = zzaza.zzb(this.zzvf, this.zzgkv.zzaae);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zza);
        jSONObject.put("ad_view_signal", zza2);
        jSONObject.put("scroll_view_signal", zzs);
        jSONObject.put("lock_screen_signal", zzb);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", zzaza.zza((String) null, this.zzvf, this.zzfqm, this.zzfql));
        }
        return zzcdtVar.zzc(str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ String zza(Exception exc) {
        zzazw.zzc("", exc);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Uri zzc(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zza(uri, "nas", str) : uri;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ArrayList zza(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzk(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zza(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzl(final Uri uri) throws Exception {
        return zzdqw.zzb(zzgp("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzdnx(this, uri) { // from class: com.google.android.gms.internal.ads.zzcun
            private final Uri zzdwc;
            private final zzcuh zzgkn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgkn = this;
                this.zzdwc = uri;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj) {
                return zzcuh.zzc(this.zzdwc, (String) obj);
            }
        }, this.zzfur);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzb(final ArrayList arrayList) throws Exception {
        return zzdqw.zzb(zzgp("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzdnx(this, arrayList) { // from class: com.google.android.gms.internal.ads.zzcuk
            private final zzcuh zzgkn;
            private final List zzgko;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgkn = this;
                this.zzgko = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj) {
                return zzcuh.zza(this.zzgko, (String) obj);
            }
        }, this.zzfur);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zza(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String zza = this.zzfgm.zzcb() != null ? this.zzfgm.zzcb().zza(this.zzvf, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null) : "";
        if (TextUtils.isEmpty(zza)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzk(uri)) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Not a Google URL: ");
                sb.append(valueOf);
                zzawr.zzfc(sb.toString());
                arrayList.add(uri);
            } else {
                arrayList.add(zza(uri, "ms", zza));
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }
}
