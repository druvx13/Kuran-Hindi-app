package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzcqd<AdT> implements zzcnj<AdT> {
    protected abstract zzdri<AdT> zza(zzdhe zzdheVar, Bundle bundle);

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final boolean zza(zzdha zzdhaVar, zzdgo zzdgoVar) {
        return !TextUtils.isEmpty(zzdgoVar.zzgtu.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final zzdri<AdT> zzb(zzdha zzdhaVar, zzdgo zzdgoVar) {
        String optString = zzdgoVar.zzgtu.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzdhe zzdheVar = zzdhaVar.zzgur.zzfll;
        zzdhg zzgr = new zzdhg().zzc(zzdheVar).zzgr(optString);
        Bundle zzn = zzn(zzdheVar.zzguw.zzcen);
        Bundle zzn2 = zzn(zzn.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzn2.putInt("gw", 1);
        String optString2 = zzdgoVar.zzgtu.optString("mad_hac", null);
        if (optString2 != null) {
            zzn2.putString("mad_hac", optString2);
        }
        String optString3 = zzdgoVar.zzgtu.optString("adJson", null);
        if (optString3 != null) {
            zzn2.putString("_ad", optString3);
        }
        zzn2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzdgoVar.zzgtx.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzdgoVar.zzgtx.optString(next, null);
            if (next != null) {
                zzn2.putString(next, optString4);
            }
        }
        zzn.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzn2);
        zzdhe zzasc = zzgr.zzh(new zzuj(zzdheVar.zzguw.versionCode, zzdheVar.zzguw.zzceg, zzn2, zzdheVar.zzguw.zzceh, zzdheVar.zzguw.zzcei, zzdheVar.zzguw.zzcej, zzdheVar.zzguw.zzacq, zzdheVar.zzguw.zzbli, zzdheVar.zzguw.zzcek, zzdheVar.zzguw.zzcel, zzdheVar.zzguw.zzmp, zzdheVar.zzguw.zzcem, zzn, zzdheVar.zzguw.zzceo, zzdheVar.zzguw.zzcep, zzdheVar.zzguw.zzceq, zzdheVar.zzguw.zzcer, zzdheVar.zzguw.zzces, zzdheVar.zzguw.zzceu, zzdheVar.zzguw.zzacr, zzdheVar.zzguw.zzacs, zzdheVar.zzguw.zzcet)).zzasc();
        Bundle bundle = new Bundle();
        zzdgq zzdgqVar = zzdhaVar.zzgus.zzgup;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzdgqVar.zzdex));
        bundle2.putInt("refresh_interval", zzdgqVar.zzgug);
        bundle2.putString("gws_query_id", zzdgqVar.zzdoh);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzdhaVar.zzgur.zzfll.zzgux;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzdgoVar.zzdfq);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzdgoVar.zzdeu));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzdgoVar.zzdev));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzdgoVar.zzdnv));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzdgoVar.zzgtp));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzdgoVar.zzdoj));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzdgoVar.zzdok));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzdgoVar.zzgto));
        bundle3.putString(FirebaseAnalytics.Param.TRANSACTION_ID, zzdgoVar.zzdgb);
        bundle3.putString("valid_from_timestamp", zzdgoVar.zzdgc);
        bundle3.putBoolean("is_closable_area_disabled", zzdgoVar.zzbmh);
        if (zzdgoVar.zzdoi != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzdgoVar.zzdoi.zzdqy);
            bundle4.putString("rb_type", zzdgoVar.zzdoi.type);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zza(zzasc, bundle);
    }

    private static Bundle zzn(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }
}
