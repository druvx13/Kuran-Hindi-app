package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfa extends zzfz {
    private final Activity zzaad;
    private final View zzaae;

    public zzfa(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2, View view, Activity activity) {
        super(zzeoVar, str, str2, c0010zza, i, 62);
        this.zzaae = view;
        this.zzaad = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        if (this.zzaae == null) {
            return;
        }
        boolean booleanValue = ((Boolean) zzvj.zzpv().zzd(zzzz.zzcns)).booleanValue();
        Object[] objArr = (Object[]) this.zzaaw.invoke(null, this.zzaae, this.zzaad, Boolean.valueOf(booleanValue));
        synchronized (this.zzaam) {
            this.zzaam.zzai(((Long) objArr[0]).longValue());
            this.zzaam.zzaj(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.zzaam.zzz((String) objArr[2]);
            }
        }
    }
}
