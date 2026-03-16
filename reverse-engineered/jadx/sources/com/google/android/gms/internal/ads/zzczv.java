package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzczv implements zzdak<zzczw> {
    private final zzazz zzbmo;
    private final zzdrh zzfur;
    private final Context zzvf;

    public zzczv(zzdrh zzdrhVar, Context context, zzazz zzazzVar) {
        this.zzfur = zzdrhVar;
        this.zzvf = context;
        this.zzbmo = zzazzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzczw> zzaqa() {
        return this.zzfur.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzczy
            private final zzczv zzgoe;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgoe = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgoe.zzaqo();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzczw zzaqo() throws Exception {
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzvf).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzq.zzkw();
        boolean zzay = zzaxa.zzay(this.zzvf);
        String str = this.zzbmo.zzbnd;
        com.google.android.gms.ads.internal.zzq.zzky();
        boolean zzxm = zzaxf.zzxm();
        com.google.android.gms.ads.internal.zzq.zzkw();
        return new zzczw(isCallerInstantApp, zzay, str, zzxm, zzaxa.zzav(this.zzvf), DynamiteModule.getRemoteVersion(this.zzvf, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(this.zzvf, ModuleDescriptor.MODULE_ID));
    }
}
