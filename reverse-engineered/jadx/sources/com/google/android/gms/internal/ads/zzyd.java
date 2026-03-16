package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzyd extends zzahg {
    private final OnInitializationCompleteListener zzcho;
    private final /* synthetic */ zzxw zzchp;

    private zzyd(zzxw zzxwVar, OnInitializationCompleteListener onInitializationCompleteListener) {
        this.zzchp = zzxwVar;
        this.zzcho = onInitializationCompleteListener;
    }

    @Override // com.google.android.gms.internal.ads.zzahh
    public final void zzd(List<zzaha> list) throws RemoteException {
        InitializationStatus zzc;
        OnInitializationCompleteListener onInitializationCompleteListener = this.zzcho;
        zzxw zzxwVar = this.zzchp;
        zzc = zzxw.zzc(list);
        onInitializationCompleteListener.onInitializationComplete(zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzyd(zzxw zzxwVar, OnInitializationCompleteListener onInitializationCompleteListener, zzya zzyaVar) {
        this(zzxwVar, onInitializationCompleteListener);
    }
}
