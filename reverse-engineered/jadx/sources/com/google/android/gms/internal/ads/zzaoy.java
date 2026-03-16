package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaoy extends zzapb implements zzaga<zzbek> {
    private float density;
    private int maxHeight;
    private int maxWidth;
    private int rotation;
    private final WindowManager zzboo;
    private final zzbek zzdce;
    private final zzzg zzdjh;
    private int zzdji;
    private int zzdjj;
    private int zzdjk;
    private int zzdjl;
    private final Context zzvf;
    private DisplayMetrics zzwz;

    public zzaoy(zzbek zzbekVar, Context context, zzzg zzzgVar) {
        super(zzbekVar);
        this.zzdji = -1;
        this.zzdjj = -1;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.zzdjk = -1;
        this.zzdjl = -1;
        this.zzdce = zzbekVar;
        this.zzvf = context;
        this.zzdjh = zzzgVar;
        this.zzboo = (WindowManager) context.getSystemService("window");
    }

    public final void zzj(int i, int i2) {
        int i3 = this.zzvf instanceof Activity ? com.google.android.gms.ads.internal.zzq.zzkw().zzf((Activity) this.zzvf)[0] : 0;
        if (this.zzdce.zzabh() == null || !this.zzdce.zzabh().zzaco()) {
            int width = this.zzdce.getWidth();
            int height = this.zzdce.getHeight();
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzckd)).booleanValue()) {
                if (width == 0 && this.zzdce.zzabh() != null) {
                    width = this.zzdce.zzabh().widthPixels;
                }
                if (height == 0 && this.zzdce.zzabh() != null) {
                    height = this.zzdce.zzabh().heightPixels;
                }
            }
            this.zzdjk = zzvj.zzpr().zzb(this.zzvf, width);
            this.zzdjl = zzvj.zzpr().zzb(this.zzvf, height);
        }
        zzc(i, i2 - i3, this.zzdjk, this.zzdjl);
        this.zzdce.zzabj().zzi(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ void zza(zzbek zzbekVar, Map map) {
        this.zzwz = new DisplayMetrics();
        Display defaultDisplay = this.zzboo.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zzwz);
        this.density = this.zzwz.density;
        this.rotation = defaultDisplay.getRotation();
        zzvj.zzpr();
        DisplayMetrics displayMetrics = this.zzwz;
        this.zzdji = zzazm.zzb(displayMetrics, displayMetrics.widthPixels);
        zzvj.zzpr();
        DisplayMetrics displayMetrics2 = this.zzwz;
        this.zzdjj = zzazm.zzb(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzzh = this.zzdce.zzzh();
        if (zzzh == null || zzzh.getWindow() == null) {
            this.maxWidth = this.zzdji;
            this.maxHeight = this.zzdjj;
        } else {
            com.google.android.gms.ads.internal.zzq.zzkw();
            int[] zzd = zzaxa.zzd(zzzh);
            zzvj.zzpr();
            this.maxWidth = zzazm.zzb(this.zzwz, zzd[0]);
            zzvj.zzpr();
            this.maxHeight = zzazm.zzb(this.zzwz, zzd[1]);
        }
        if (this.zzdce.zzabh().zzaco()) {
            this.zzdjk = this.zzdji;
            this.zzdjl = this.zzdjj;
        } else {
            this.zzdce.measure(0, 0);
        }
        zza(this.zzdji, this.zzdjj, this.maxWidth, this.maxHeight, this.density, this.rotation);
        this.zzdce.zzb("onDeviceFeaturesReceived", new zzaox(new zzaoz().zzae(this.zzdjh.zzqv()).zzad(this.zzdjh.zzqw()).zzaf(this.zzdjh.zzqy()).zzag(this.zzdjh.zzqx()).zzah(true)).zzuc());
        int[] iArr = new int[2];
        this.zzdce.getLocationOnScreen(iArr);
        zzj(zzvj.zzpr().zzb(this.zzvf, iArr[0]), zzvj.zzpr().zzb(this.zzvf, iArr[1]));
        if (zzawr.isLoggable(2)) {
            zzawr.zzfb("Dispatching Ready Event.");
        }
        zzdw(this.zzdce.zzzk().zzbnd);
    }
}
