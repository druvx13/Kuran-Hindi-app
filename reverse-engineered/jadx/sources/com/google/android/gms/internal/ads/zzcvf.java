package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcvf implements zzdak<zzcvg> {
    private final zzdhe zzfll;
    private final zzdrh zzglk;
    private final View zzgll;
    private final Context zzvf;

    public zzcvf(zzdrh zzdrhVar, Context context, zzdhe zzdheVar, ViewGroup viewGroup) {
        this.zzglk = zzdrhVar;
        this.zzvf = context;
        this.zzfll = zzdheVar;
        this.zzgll = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzcvg> zzaqa() {
        return this.zzglk.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcvi
            private final zzcvf zzglo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzglo = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzglo.zzaqb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcvg zzaqb() throws Exception {
        Context context = this.zzvf;
        zzum zzumVar = this.zzfll.zzbmp;
        ArrayList arrayList = new ArrayList();
        View view = this.zzgll;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzcvg(context, zzumVar, arrayList);
    }
}
