package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcmo implements Callable {
    private final zzcmn zzgdb;

    private zzcmo(zzcmn zzcmnVar) {
        this.zzgdb = zzcmnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Callable zza(zzcmn zzcmnVar) {
        return new zzcmo(zzcmnVar);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.zzgdb.getWritableDatabase();
    }
}
