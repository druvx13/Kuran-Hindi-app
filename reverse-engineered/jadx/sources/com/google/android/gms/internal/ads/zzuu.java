package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public class zzuu {
    private final zzuh zzcff;
    private final zzue zzcfg;
    private final zzyj zzcfh;
    private final zzaew zzcfi;
    private final zzasr zzcfj;
    private final zzatv zzcfk;
    private final zzape zzcfl;
    private final zzaez zzcfm;

    public zzuu(zzuh zzuhVar, zzue zzueVar, zzyj zzyjVar, zzaew zzaewVar, zzasr zzasrVar, zzatv zzatvVar, zzape zzapeVar, zzaez zzaezVar) {
        this.zzcff = zzuhVar;
        this.zzcfg = zzueVar;
        this.zzcfh = zzyjVar;
        this.zzcfi = zzaewVar;
        this.zzcfj = zzasrVar;
        this.zzcfk = zzatvVar;
        this.zzcfl = zzapeVar;
        this.zzcfm = zzaezVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzvj.zzpr().zza(context, zzvj.zzpx().zzbnd, "gmob-apps", bundle, true);
    }

    public final zzvz zza(Context context, zzum zzumVar, String str, zzalp zzalpVar) {
        return new zzuy(this, context, zzumVar, str, zzalpVar).zzd(context, false);
    }

    public final zzvs zzb(Context context, String str, zzalp zzalpVar) {
        return new zzvd(this, context, str, zzalpVar).zzd(context, false);
    }

    public final zzacw zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return new zzvf(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzadd zza(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return new zzve(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzatf zzc(Context context, String str, zzalp zzalpVar) {
        return new zzuw(this, context, str, zzalpVar).zzd(context, false);
    }

    public final zzapg zzb(Activity activity) {
        zzuz zzuzVar = new zzuz(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzazw.zzfa("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return zzuzVar.zzd(activity, z);
    }
}
