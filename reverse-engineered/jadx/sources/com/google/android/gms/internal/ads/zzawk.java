package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzawk {
    private final String zzduv;
    private final zzawt zzduw;
    private long zzduq = -1;
    private long zzdur = -1;
    private int zzdus = -1;
    int zzdut = -1;
    private long zzduu = 0;
    private final Object lock = new Object();
    private int zzdux = 0;
    private int zzduy = 0;

    public zzawk(String str, zzawt zzawtVar) {
        this.zzduv = str;
        this.zzduw = zzawtVar;
    }

    public final void zzvs() {
        synchronized (this.lock) {
            this.zzdux++;
        }
    }

    public final void zzvr() {
        synchronized (this.lock) {
            this.zzduy++;
        }
    }

    public final void zza(zzuj zzujVar, long j) {
        synchronized (this.lock) {
            long zzwx = this.zzduw.zzwx();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis();
            if (this.zzdur == -1) {
                if (currentTimeMillis - zzwx > ((Long) zzvj.zzpv().zzd(zzzz.zzclp)).longValue()) {
                    this.zzdut = -1;
                } else {
                    this.zzdut = this.zzduw.zzwy();
                }
                this.zzdur = j;
                this.zzduq = j;
            } else {
                this.zzduq = j;
            }
            if (zzujVar == null || zzujVar.extras == null || zzujVar.extras.getInt("gw", 2) != 1) {
                this.zzdus++;
                int i = this.zzdut + 1;
                this.zzdut = i;
                if (i == 0) {
                    this.zzduu = 0L;
                    this.zzduw.zzfa(currentTimeMillis);
                } else {
                    this.zzduu = currentTimeMillis - this.zzduw.zzwz();
                }
            }
        }
    }

    public final Bundle zzo(Context context, String str) {
        Bundle bundle;
        synchronized (this.lock) {
            bundle = new Bundle();
            bundle.putString("session_id", this.zzduv);
            bundle.putLong("basets", this.zzdur);
            bundle.putLong("currts", this.zzduq);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzdus);
            bundle.putInt("preqs_in_session", this.zzdut);
            bundle.putLong("time_in_session", this.zzduu);
            bundle.putInt("pclick", this.zzdux);
            bundle.putInt("pimp", this.zzduy);
            bundle.putBoolean("support_transparent_background", zzam(context));
        }
        return bundle;
    }

    private static boolean zzam(Context context) {
        Context zzaa = zzase.zzaa(context);
        int identifier = zzaa.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            zzawr.zzfb("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == zzaa.getPackageManager().getActivityInfo(new ComponentName(zzaa.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            zzawr.zzfb("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            zzawr.zzfc("Fail to fetch AdActivity theme");
            zzawr.zzfb("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }
}
