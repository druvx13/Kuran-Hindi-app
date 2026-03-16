package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcvs implements zzdah<Bundle> {
    private final String zzacf;
    private final zzum zzbmp;
    private final float zzbpk;
    private final boolean zzcey;
    private final int zzdji;
    private final int zzdjj;
    private final String zzgls;
    private final String zzglt;
    private final boolean zzglu;

    public zzcvs(zzum zzumVar, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        Preconditions.checkNotNull(zzumVar, "the adSize must not be null");
        this.zzbmp = zzumVar;
        this.zzacf = str;
        this.zzcey = z;
        this.zzgls = str2;
        this.zzbpk = f;
        this.zzdji = i;
        this.zzdjj = i2;
        this.zzglt = str3;
        this.zzglu = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        String str;
        zzum[] zzumVarArr;
        Bundle bundle2 = bundle;
        zzdhj.zza(bundle2, "smart_w", "full", this.zzbmp.width == -1);
        zzdhj.zza(bundle2, "smart_h", "auto", this.zzbmp.height == -2);
        zzdhj.zza(bundle2, "ene", (Boolean) true, this.zzbmp.zzcez);
        zzdhj.zza(bundle2, "rafmt", "102", this.zzbmp.zzcfc);
        zzdhj.zza(bundle2, "rafmt", "103", this.zzbmp.zzcfd);
        zzdhj.zza(bundle2, "inline_adaptive_slot", (Boolean) true, this.zzglu);
        zzdhj.zza(bundle2, "format", this.zzacf);
        zzdhj.zza(bundle2, "fluid", "height", this.zzcey);
        zzdhj.zza(bundle2, "sz", this.zzgls, !TextUtils.isEmpty(str));
        bundle2.putFloat("u_sd", this.zzbpk);
        bundle2.putInt("sw", this.zzdji);
        bundle2.putInt("sh", this.zzdjj);
        String str2 = this.zzglt;
        zzdhj.zza(bundle2, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (this.zzbmp.zzcex == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("height", this.zzbmp.height);
            bundle3.putInt("width", this.zzbmp.width);
            bundle3.putBoolean("is_fluid_height", this.zzbmp.zzcey);
            arrayList.add(bundle3);
        } else {
            for (zzum zzumVar : this.zzbmp.zzcex) {
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("is_fluid_height", zzumVar.zzcey);
                bundle4.putInt("height", zzumVar.height);
                bundle4.putInt("width", zzumVar.width);
                arrayList.add(bundle4);
            }
        }
        bundle2.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
