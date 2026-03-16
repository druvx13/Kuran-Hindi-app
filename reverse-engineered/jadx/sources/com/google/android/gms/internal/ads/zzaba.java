package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaba<T> extends zzaaz<T> {
    public static zzaaz<Boolean> zzf(String str, boolean z) {
        return new zzaba(str, true, zzabb.zzcvh);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Ljava/lang/Integer;)V */
    public zzaba(String str, Object obj, int i) {
        super(str, obj, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final T get() {
        if (!zzacb.zzcye.get()) {
            throw new IllegalStateException("Striped code is accessed: 54c42518-856a-44fb-aae0-cd6676d514e5");
        }
        return (T) super.get();
    }
}
