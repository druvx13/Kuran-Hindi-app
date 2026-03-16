package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfy extends zzfz {
    private final View zzaae;

    public zzfy(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2, View view) {
        super(zzeoVar, str, str2, c0010zza, i, 57);
        this.zzaae = view;
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        if (this.zzaae != null) {
            Boolean bool = (Boolean) zzvj.zzpv().zzd(zzzz.zzcoi);
            zzew zzewVar = new zzew((String) this.zzaaw.invoke(null, this.zzaae, this.zzvp.getContext().getResources().getDisplayMetrics(), bool));
            zzbv.zza.zzf.C0012zza zzay = zzbv.zza.zzf.zzay();
            zzay.zzcy(zzewVar.zzzy.longValue()).zzcz(zzewVar.zzzz.longValue()).zzda(zzewVar.zzaaa.longValue());
            if (bool.booleanValue()) {
                zzay.zzdb(zzewVar.zzaab.longValue());
            }
            this.zzaam.zza((zzbv.zza.zzf) ((zzecd) zzay.zzbet()));
        }
    }
}
