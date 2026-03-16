package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzbek;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzi {
    public final int index;
    public final ViewGroup parent;
    public final ViewGroup.LayoutParams zzdkm;
    public final Context zzvf;

    public zzi(zzbek zzbekVar) throws zzg {
        this.zzdkm = zzbekVar.getLayoutParams();
        ViewParent parent = zzbekVar.getParent();
        this.zzvf = zzbekVar.zzabe();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.parent = viewGroup;
            this.index = viewGroup.indexOfChild(zzbekVar.getView());
            this.parent.removeView(zzbekVar.getView());
            zzbekVar.zzba(true);
            return;
        }
        throw new zzg("Could not get the parent of the WebView for an overlay.");
    }
}
