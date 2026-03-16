package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbbk extends FrameLayout implements zzbbf {
    private final zzbbx zzebj;
    private final FrameLayout zzebk;
    private final zzaam zzebl;
    private final zzbbz zzebm;
    private final long zzebn;
    private zzbbi zzebo;
    private boolean zzebp;
    private boolean zzebq;
    private boolean zzebr;
    private boolean zzebs;
    private long zzebt;
    private long zzebu;
    private String zzebv;
    private String[] zzebw;
    private Bitmap zzebx;
    private ImageView zzeby;
    private boolean zzebz;

    public static void zzb(zzbbx zzbbxVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
        zzbbxVar.zza("onVideoEvent", hashMap);
    }

    public static void zza(zzbbx zzbbxVar, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("mimeTypes", map);
        zzbbxVar.zza("onVideoEvent", hashMap);
    }

    public static void zza(zzbbx zzbbxVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("error", str);
        zzbbxVar.zza("onVideoEvent", hashMap);
    }

    public zzbbk(Context context, zzbbx zzbbxVar, int i, boolean z, zzaam zzaamVar, zzbby zzbbyVar) {
        super(context);
        this.zzebj = zzbbxVar;
        this.zzebl = zzaamVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzebk = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzbbxVar.zzzi());
        zzbbi zza = zzbbxVar.zzzi().zzblq.zza(context, zzbbxVar, i, z, zzaamVar, zzbbyVar);
        this.zzebo = zza;
        if (zza != null) {
            this.zzebk.addView(zza, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcjp)).booleanValue()) {
                zzyw();
            }
        }
        this.zzeby = new ImageView(context);
        this.zzebn = ((Long) zzvj.zzpv().zzd(zzzz.zzcjt)).longValue();
        boolean booleanValue = ((Boolean) zzvj.zzpv().zzd(zzzz.zzcjr)).booleanValue();
        this.zzebs = booleanValue;
        zzaam zzaamVar2 = this.zzebl;
        if (zzaamVar2 != null) {
            zzaamVar2.zzh("spinner_used", booleanValue ? "1" : "0");
        }
        this.zzebm = new zzbbz(this);
        zzbbi zzbbiVar = this.zzebo;
        if (zzbbiVar != null) {
            zzbbiVar.zza(this);
        }
        if (this.zzebo == null) {
            zzm("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public final void zzd(int i, int i2, int i3, int i4) {
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzebk.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzc(String str, String[] strArr) {
        this.zzebv = str;
        this.zzebw = strArr;
    }

    public final void zza(float f, float f2) {
        zzbbi zzbbiVar = this.zzebo;
        if (zzbbiVar != null) {
            zzbbiVar.zza(f, f2);
        }
    }

    public final void zzhx() {
        if (this.zzebo == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.zzebv)) {
            this.zzebo.zzb(this.zzebv, this.zzebw);
        } else {
            zzd("no_src", new String[0]);
        }
    }

    public final void pause() {
        zzbbi zzbbiVar = this.zzebo;
        if (zzbbiVar == null) {
            return;
        }
        zzbbiVar.pause();
    }

    public final void play() {
        zzbbi zzbbiVar = this.zzebo;
        if (zzbbiVar == null) {
            return;
        }
        zzbbiVar.play();
    }

    public final void seekTo(int i) {
        zzbbi zzbbiVar = this.zzebo;
        if (zzbbiVar == null) {
            return;
        }
        zzbbiVar.seekTo(i);
    }

    public final void zzyu() {
        zzbbi zzbbiVar = this.zzebo;
        if (zzbbiVar == null) {
            return;
        }
        zzbbiVar.zzebh.setMuted(true);
        zzbbiVar.zzyo();
    }

    public final void zzyv() {
        zzbbi zzbbiVar = this.zzebo;
        if (zzbbiVar == null) {
            return;
        }
        zzbbiVar.zzebh.setMuted(false);
        zzbbiVar.zzyo();
    }

    public final void setVolume(float f) {
        zzbbi zzbbiVar = this.zzebo;
        if (zzbbiVar == null) {
            return;
        }
        zzbbiVar.zzebh.setVolume(f);
        zzbbiVar.zzyo();
    }

    public final void zzde(int i) {
        this.zzebo.zzde(i);
    }

    public final void zzdf(int i) {
        this.zzebo.zzdf(i);
    }

    public final void zzdg(int i) {
        this.zzebo.zzdg(i);
    }

    public final void zzdh(int i) {
        this.zzebo.zzdh(i);
    }

    public final void zzdi(int i) {
        this.zzebo.zzdi(i);
    }

    public final void zze(MotionEvent motionEvent) {
        zzbbi zzbbiVar = this.zzebo;
        if (zzbbiVar == null) {
            return;
        }
        zzbbiVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzyw() {
        zzbbi zzbbiVar = this.zzebo;
        if (zzbbiVar == null) {
            return;
        }
        TextView textView = new TextView(zzbbiVar.getContext());
        String valueOf = String.valueOf(this.zzebo.zzyk());
        textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        this.zzebk.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzebk.bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzbbf
    public final void zzyp() {
        this.zzebm.resume();
        zzaxa.zzdwf.post(new zzbbl(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbbf
    public final void zzfa() {
        zzbbi zzbbiVar = this.zzebo;
        if (zzbbiVar != null && this.zzebu == 0) {
            zzd("canplaythrough", "duration", String.valueOf(zzbbiVar.getDuration() / 1000.0f), "videoWidth", String.valueOf(this.zzebo.getVideoWidth()), "videoHeight", String.valueOf(this.zzebo.getVideoHeight()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbf
    public final void zzyq() {
        if (this.zzebj.zzzh() != null && !this.zzebq) {
            boolean z = (this.zzebj.zzzh().getWindow().getAttributes().flags & 128) != 0;
            this.zzebr = z;
            if (!z) {
                this.zzebj.zzzh().getWindow().addFlags(128);
                this.zzebq = true;
            }
        }
        this.zzebp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbbf
    public final void onPaused() {
        zzd("pause", new String[0]);
        zzyz();
        this.zzebp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbbf
    public final void zzyr() {
        zzd("ended", new String[0]);
        zzyz();
    }

    @Override // com.google.android.gms.internal.ads.zzbbf
    public final void zzm(String str, String str2) {
        zzd("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbbf
    public final void zzys() {
        if (this.zzebz && this.zzebx != null && !zzyy()) {
            this.zzeby.setImageBitmap(this.zzebx);
            this.zzeby.invalidate();
            this.zzebk.addView(this.zzeby, new FrameLayout.LayoutParams(-1, -1));
            this.zzebk.bringChildToFront(this.zzeby);
        }
        this.zzebm.pause();
        this.zzebu = this.zzebt;
        zzaxa.zzdwf.post(new zzbbo(this));
    }

    public final void destroy() {
        this.zzebm.pause();
        zzbbi zzbbiVar = this.zzebo;
        if (zzbbiVar != null) {
            zzbbiVar.stop();
        }
        zzyz();
    }

    public final void finalize() throws Throwable {
        try {
            this.zzebm.pause();
            if (this.zzebo != null) {
                zzbbi zzbbiVar = this.zzebo;
                zzdrh zzdrhVar = zzbab.zzdzv;
                zzbbiVar.getClass();
                zzdrhVar.execute(zzbbj.zza(zzbbiVar));
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzyx() {
        zzbbi zzbbiVar = this.zzebo;
        if (zzbbiVar == null) {
            return;
        }
        long currentPosition = zzbbiVar.getCurrentPosition();
        if (this.zzebt == currentPosition || currentPosition <= 0) {
            return;
        }
        zzd("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
        this.zzebt = currentPosition;
    }

    @Override // com.google.android.gms.internal.ads.zzbbf
    public final void zzyt() {
        if (this.zzebp && zzyy()) {
            this.zzebk.removeView(this.zzeby);
        }
        if (this.zzebx != null) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime();
            if (this.zzebo.getBitmap(this.zzebx) != null) {
                this.zzebz = true;
            }
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - elapsedRealtime;
            if (zzawr.zzwo()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(elapsedRealtime2);
                sb.append("ms");
                zzawr.zzeg(sb.toString());
            }
            if (elapsedRealtime2 > this.zzebn) {
                zzawr.zzfc("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzebs = false;
                this.zzebx = null;
                zzaam zzaamVar = this.zzebl;
                if (zzaamVar != null) {
                    zzaamVar.zzh("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbf
    public final void zzk(int i, int i2) {
        if (this.zzebs) {
            int max = Math.max(i / ((Integer) zzvj.zzpv().zzd(zzzz.zzcjs)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzvj.zzpv().zzd(zzzz.zzcjs)).intValue(), 1);
            Bitmap bitmap = this.zzebx;
            if (bitmap != null && bitmap.getWidth() == max && this.zzebx.getHeight() == max2) {
                return;
            }
            this.zzebx = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzebz = false;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zzebm.resume();
        } else {
            this.zzebm.pause();
            this.zzebu = this.zzebt;
        }
        zzaxa.zzdwf.post(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzbbm
            private final zzbbk zzecb;
            private final boolean zzecc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzecb = this;
                this.zzecc = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzecb.zzau(this.zzecc);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbbf
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zzebm.resume();
            z = true;
        } else {
            this.zzebm.pause();
            this.zzebu = this.zzebt;
            z = false;
        }
        zzaxa.zzdwf.post(new zzbbn(this, z));
    }

    private final boolean zzyy() {
        return this.zzeby.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzebj.zza("onVideoEvent", hashMap);
    }

    private final void zzyz() {
        if (this.zzebj.zzzh() == null || !this.zzebq || this.zzebr) {
            return;
        }
        this.zzebj.zzzh().getWindow().clearFlags(128);
        this.zzebq = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzau(boolean z) {
        zzd("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }
}
