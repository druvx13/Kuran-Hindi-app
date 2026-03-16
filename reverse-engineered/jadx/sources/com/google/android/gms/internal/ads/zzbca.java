package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbca {
    private final zzazz zzdls;
    private final String zzdmh;
    private final zzaam zzebl;
    private boolean zzebp;
    private final zzaak zzeec;
    private final long[] zzeee;
    private final String[] zzeef;
    private zzbbi zzeek;
    private boolean zzeel;
    private boolean zzeem;
    private final Context zzvf;
    private final zzayi zzeed = new zzayj().zza("min_1", Double.MIN_VALUE, 1.0d).zza("1_5", 1.0d, 5.0d).zza("5_10", 5.0d, 10.0d).zza("10_20", 10.0d, 20.0d).zza("20_30", 20.0d, 30.0d).zza("30_max", 30.0d, Double.MAX_VALUE).zzxw();
    private boolean zzeeg = false;
    private boolean zzeeh = false;
    private boolean zzeei = false;
    private boolean zzeej = false;
    private long zzeen = -1;

    public zzbca(Context context, zzazz zzazzVar, String str, zzaam zzaamVar, zzaak zzaakVar) {
        this.zzvf = context;
        this.zzdls = zzazzVar;
        this.zzdmh = str;
        this.zzebl = zzaamVar;
        this.zzeec = zzaakVar;
        String str2 = (String) zzvj.zzpv().zzd(zzzz.zzcjn);
        if (str2 == null) {
            this.zzeef = new String[0];
            this.zzeee = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.zzeef = new String[split.length];
        this.zzeee = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzeee[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                zzawr.zzd("Unable to parse frame hash target time number.", e);
                this.zzeee[i] = -1;
            }
        }
    }

    public final void zzb(zzbbi zzbbiVar) {
        zzaah.zza(this.zzebl, this.zzeec, "vpc2");
        this.zzeeg = true;
        zzaam zzaamVar = this.zzebl;
        if (zzaamVar != null) {
            zzaamVar.zzh("vpn", zzbbiVar.zzyk());
        }
        this.zzeek = zzbbiVar;
    }

    public final void zzfa() {
        if (!this.zzeeg || this.zzeeh) {
            return;
        }
        zzaah.zza(this.zzebl, this.zzeec, "vfr2");
        this.zzeeh = true;
    }

    public final void onStop() {
        if (!zzabw.zzcxw.get().booleanValue() || this.zzeel) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzdmh);
        bundle.putString("player", this.zzeek.zzyk());
        for (zzayk zzaykVar : this.zzeed.zzxv()) {
            String valueOf = String.valueOf(zzaykVar.name);
            bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(zzaykVar.count));
            String valueOf2 = String.valueOf(zzaykVar.name);
            bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(zzaykVar.zzdxq));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.zzeee;
            if (i < jArr.length) {
                String str = this.zzeef[i];
                if (str != null) {
                    String valueOf3 = String.valueOf(Long.valueOf(jArr[i]));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 3);
                    sb.append("fh_");
                    sb.append(valueOf3);
                    bundle.putString(sb.toString(), str);
                }
                i++;
            } else {
                com.google.android.gms.ads.internal.zzq.zzkw().zza(this.zzvf, this.zzdls.zzbnd, "gmob-apps", bundle, true);
                this.zzeel = true;
                return;
            }
        }
    }

    public final void zzc(zzbbi zzbbiVar) {
        if (this.zzeei && !this.zzeej) {
            if (zzawr.zzwo() && !this.zzeej) {
                zzawr.zzeg("VideoMetricsMixin first frame");
            }
            zzaah.zza(this.zzebl, this.zzeec, "vff2");
            this.zzeej = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzq.zzld().nanoTime();
        if (this.zzebp && this.zzeem && this.zzeen != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L);
            double d = nanoTime - this.zzeen;
            Double.isNaN(nanos);
            Double.isNaN(d);
            this.zzeed.zza(nanos / d);
        }
        this.zzeem = this.zzebp;
        this.zzeen = nanoTime;
        long longValue = ((Long) zzvj.zzpv().zzd(zzzz.zzcjo)).longValue();
        long currentPosition = zzbbiVar.getCurrentPosition();
        int i = 0;
        while (true) {
            String[] strArr = this.zzeef;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(currentPosition - this.zzeee[i])) {
                String[] strArr2 = this.zzeef;
                int i2 = 8;
                Bitmap bitmap = zzbbiVar.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j);
                        i4++;
                        j--;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            i++;
        }
    }

    public final void zzzp() {
        this.zzebp = true;
        if (!this.zzeeh || this.zzeei) {
            return;
        }
        zzaah.zza(this.zzebl, this.zzeec, "vfp2");
        this.zzeei = true;
    }

    public final void zzzq() {
        this.zzebp = false;
    }
}
