package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcvr implements zzdak<zzcvs> {
    private final zzawd zzbnp;
    private final zzdhe zzfll;
    private final zzdak<zzdan> zzglr;
    private final Context zzvf;

    public zzcvr(zzcxg<zzdan> zzcxgVar, zzdhe zzdheVar, Context context, zzawd zzawdVar) {
        this.zzglr = zzcxgVar;
        this.zzfll = zzdheVar;
        this.zzvf = context;
        this.zzbnp = zzawdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzcvs> zzaqa() {
        return zzdqw.zzb(this.zzglr.zzaqa(), new zzdnx(this) { // from class: com.google.android.gms.internal.ads.zzcvu
            private final zzcvr zzglw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzglw = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj) {
                return this.zzglw.zza((zzdan) obj);
            }
        }, zzbab.zzdzw);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcvs zza(zzdan zzdanVar) {
        zzum[] zzumVarArr;
        String str;
        boolean z;
        String str2;
        float f;
        int i;
        int i2;
        zzum[] zzumVarArr2;
        int i3;
        int i4;
        int i5;
        DisplayMetrics displayMetrics;
        zzum zzumVar = this.zzfll.zzbmp;
        if (zzumVar.zzcex == null) {
            str = zzumVar.zzacf;
            z = zzumVar.zzcey;
        } else {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzum zzumVar2 : zzumVar.zzcex) {
                if (!zzumVar2.zzcey && !z2) {
                    str = zzumVar2.zzacf;
                    z2 = true;
                }
                if (zzumVar2.zzcey && !z3) {
                    z3 = true;
                    z = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        }
        Resources resources = this.zzvf.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        } else {
            float f2 = displayMetrics.density;
            int i6 = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
            str2 = this.zzbnp.zzwb().zzxc();
            i = i6;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        if (zzumVar.zzcex != null) {
            boolean z4 = false;
            for (zzum zzumVar3 : zzumVar.zzcex) {
                if (zzumVar3.zzcey) {
                    z4 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    if (zzumVar3.width == -1 && f != 0.0f) {
                        i4 = (int) (zzumVar3.widthPixels / f);
                    } else {
                        i4 = zzumVar3.width;
                    }
                    sb.append(i4);
                    sb.append("x");
                    if (zzumVar3.height == -2 && f != 0.0f) {
                        i5 = (int) (zzumVar3.heightPixels / f);
                        sb.append(i5);
                    }
                    i5 = zzumVar3.height;
                    sb.append(i5);
                }
            }
            if (z4) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzcvs(zzumVar, str, z, sb.toString(), f, i, i2, str2, this.zzfll.zzglu);
    }
}
