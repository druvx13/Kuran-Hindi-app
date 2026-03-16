package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzno {
    private zznn zzbff;

    public abstract zznq zza(zzhn[] zzhnVarArr, zzna zznaVar) throws zzgq;

    public abstract void zzd(Object obj);

    public final void zza(zznn zznnVar) {
        this.zzbff = zznnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void invalidate() {
        zznn zznnVar = this.zzbff;
        if (zznnVar != null) {
            zznnVar.zzeo();
        }
    }
}
