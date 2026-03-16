package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbo;
import com.google.android.gms.internal.ads.zzbv;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdu extends zzdl {
    public static zzdu zzb(String str, Context context, boolean z) {
        return zzb(str, context, false, zzcm.zzmx);
    }

    public static zzdu zzb(String str, Context context, boolean z, int i) {
        zza(context, z);
        zza(str, context, z, i);
        return new zzdu(context, str, z, i);
    }

    private zzdu(Context context, String str, boolean z, int i) {
        super(context, str, z, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdl
    public final List<Callable<Void>> zza(zzeo zzeoVar, Context context, zzbv.zza.C0010zza c0010zza, zzbo.zza zzaVar) {
        if (zzeoVar.zzch() == null || !this.zzwb) {
            return super.zza(zzeoVar, context, c0010zza, zzaVar);
        }
        int zzbv = zzeoVar.zzbv();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zza(zzeoVar, context, c0010zza, zzaVar));
        arrayList.add(new zzfi(zzeoVar, "hYPTVQdTm2q1YMo1lUce4yXfJpjfBpohGFUC3CCt6OsJQwu7mUSAt5mBInaYKugO", "pf4sJGlvLCh5M9DSeQtdmDF5FY3IMGGhi6Z7oCoKXow=", c0010zza, zzbv, 24));
        return arrayList;
    }
}
