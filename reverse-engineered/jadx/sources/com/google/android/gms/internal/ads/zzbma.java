package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzbma {
    private final View view;
    private final zzbek zzdce;
    private final zzdgn zzfik;
    private final zzbnt zzfja;

    public zzbma(View view, zzbek zzbekVar, zzbnt zzbntVar, zzdgn zzdgnVar) {
        this.view = view;
        this.zzdce = zzbekVar;
        this.zzfja = zzbntVar;
        this.zzfik = zzdgnVar;
    }

    public final zzbek zzags() {
        return this.zzdce;
    }

    public final View zzahe() {
        return this.view;
    }

    public final zzbnt zzahm() {
        return this.zzfja;
    }

    public final zzdgn zzahn() {
        return this.zzfik;
    }

    public zzbsh zza(Set<zzbvt<zzbsm>> set) {
        return new zzbsh(set);
    }
}
