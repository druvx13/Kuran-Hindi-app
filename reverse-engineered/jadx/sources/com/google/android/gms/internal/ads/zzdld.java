package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdld {
    private final Executor executor;
    private final String zzbnd;
    private final Clock zzbnt;
    private final String zzcgc;
    private final String zzdma;
    private final zzdt zzfgm;
    private final zzdgz zzfmx;
    private final zzcqi zzfof;
    private final zzbaa zzhao;
    private final Context zzvf;

    public zzdld(Executor executor, zzbaa zzbaaVar, zzcqi zzcqiVar, zzazz zzazzVar, String str, String str2, Context context, zzdgz zzdgzVar, Clock clock, zzdt zzdtVar) {
        this.executor = executor;
        this.zzhao = zzbaaVar;
        this.zzfof = zzcqiVar;
        this.zzbnd = zzazzVar.zzbnd;
        this.zzdma = str;
        this.zzcgc = str2;
        this.zzvf = context;
        this.zzfmx = zzdgzVar;
        this.zzbnt = clock;
        this.zzfgm = zzdtVar;
    }

    public final void zza(zzdha zzdhaVar, zzdgo zzdgoVar, List<String> list) {
        zza(zzdhaVar, zzdgoVar, false, "", list);
    }

    public final void zza(zzdha zzdhaVar, zzdgo zzdgoVar, boolean z, String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str2 = z ? "1" : "0";
        for (String str3 : list) {
            String zzc = zzc(zzc(zzc(str3, "@gw_adlocid@", zzdhaVar.zzgur.zzfll.zzgux), "@gw_adnetrefresh@", str2), "@gw_sdkver@", this.zzbnd);
            if (zzdgoVar != null) {
                zzc = zzavj.zzc(zzc(zzc(zzc(zzc, "@gw_qdata@", zzdgoVar.zzdfa), "@gw_adnetid@", zzdgoVar.zzagd), "@gw_allocid@", zzdgoVar.zzdfq), this.zzvf, zzdgoVar.zzdov);
            }
            String zzc2 = zzc(zzc(zzc(zzc, "@gw_adnetstatus@", this.zzfof.zzape()), "@gw_seqnum@", this.zzdma), "@gw_sessid@", this.zzcgc);
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcol)).booleanValue() && !TextUtils.isEmpty(str)) {
                if (this.zzfgm.zzb(Uri.parse(zzc2))) {
                    zzc2 = Uri.parse(zzc2).buildUpon().appendQueryParameter("ms", str).build().toString();
                }
            }
            arrayList.add(zzc2);
        }
        zzh(arrayList);
    }

    public final void zza(zzdha zzdhaVar, zzdgo zzdgoVar, List<String> list, zzasd zzasdVar) {
        long currentTimeMillis = this.zzbnt.currentTimeMillis();
        try {
            String type = zzasdVar.getType();
            String num = Integer.toString(zzasdVar.getAmount());
            ArrayList arrayList = new ArrayList();
            zzdgz zzdgzVar = this.zzfmx;
            String zzgw = zzdgzVar == null ? "" : zzgw(zzdgzVar.zzdrf);
            zzdgz zzdgzVar2 = this.zzfmx;
            String zzgw2 = zzdgzVar2 != null ? zzgw(zzdgzVar2.zzdrg) : "";
            for (String str : list) {
                arrayList.add(zzavj.zzc(zzc(zzc(zzc(zzc(zzc(zzc(str, "@gw_rwd_userid@", Uri.encode(zzgw)), "@gw_rwd_custom_data@", Uri.encode(zzgw2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(type)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzbnd), this.zzvf, zzdgoVar.zzdov));
            }
            zzh(arrayList);
        } catch (RemoteException unused) {
        }
    }

    public final void zzh(List<String> list) {
        for (String str : list) {
            zzeq(str);
        }
    }

    public final void zzeq(final String str) {
        this.executor.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzdlg
            private final String zzdbv;
            private final zzdld zzhar;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhar = this;
                this.zzdbv = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzhar.zzgx(this.zzdbv);
            }
        });
    }

    private static String zzc(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    private static String zzgw(String str) {
        return (TextUtils.isEmpty(str) || !zzazq.isEnabled()) ? str : "fakeForAdDebugLog";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzgx(String str) {
        this.zzhao.zzeq(str);
    }
}
