package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzedd implements zzedl {
    private zzedl[] zzhzv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedd(zzedl... zzedlVarArr) {
        this.zzhzv = zzedlVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final boolean zzc(Class<?> cls) {
        for (zzedl zzedlVar : this.zzhzv) {
            if (zzedlVar.zzc(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final zzedm zzd(Class<?> cls) {
        zzedl[] zzedlVarArr;
        for (zzedl zzedlVar : this.zzhzv) {
            if (zzedlVar.zzc(cls)) {
                return zzedlVar.zzd(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
