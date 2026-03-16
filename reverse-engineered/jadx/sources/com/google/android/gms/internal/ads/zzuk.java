package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzuk {
    public static final zzuk zzcev = new zzuk();

    protected zzuk() {
    }

    public static zzuj zza(Context context, zzxt zzxtVar) {
        Context context2;
        List list;
        zzud zzudVar;
        String str;
        Date birthday = zzxtVar.getBirthday();
        long time = birthday != null ? birthday.getTime() : -1L;
        String contentUrl = zzxtVar.getContentUrl();
        int gender = zzxtVar.getGender();
        Set<String> keywords = zzxtVar.getKeywords();
        if (keywords.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(keywords));
            context2 = context;
        }
        boolean isTestDevice = zzxtVar.isTestDevice(context2);
        Location location = zzxtVar.getLocation();
        Bundle networkExtrasBundle = zzxtVar.getNetworkExtrasBundle(AdMobAdapter.class);
        if (zzxtVar.zzqo() != null) {
            zzudVar = new zzud(zzxtVar.zzqo().getAdString(), zzvj.zzpz().containsKey(zzxtVar.zzqo().getQueryInfo()) ? zzvj.zzpz().get(zzxtVar.zzqo().getQueryInfo()) : "");
        } else {
            zzudVar = null;
        }
        boolean manualImpressionsEnabled = zzxtVar.getManualImpressionsEnabled();
        String publisherProvidedId = zzxtVar.getPublisherProvidedId();
        SearchAdRequest zzqj = zzxtVar.zzqj();
        zzza zzzaVar = zzqj != null ? new zzza(zzqj) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzvj.zzpr();
            str = zzazm.zza(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean isDesignedForFamilies = zzxtVar.isDesignedForFamilies();
        RequestConfiguration requestConfiguration = zzxw.zzqq().getRequestConfiguration();
        return new zzuj(8, time, networkExtrasBundle, gender, list, isTestDevice, Math.max(zzxtVar.zzqm(), requestConfiguration.getTagForChildDirectedTreatment()), manualImpressionsEnabled, publisherProvidedId, zzzaVar, location, contentUrl, zzxtVar.zzql(), zzxtVar.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzxtVar.zzqn())), zzxtVar.zzqi(), str, isDesignedForFamilies, zzudVar, Math.max(zzxtVar.zzqp(), requestConfiguration.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(zzxtVar.getMaxAdContentRating(), requestConfiguration.getMaxAdContentRating()), zzun.zzcfe), zzxtVar.zzqh());
    }

    public static zzast zza(Context context, zzxt zzxtVar, String str) {
        return new zzast(zza(context, zzxtVar), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ int zzd(String str, String str2) {
        return RequestConfiguration.zzacu.indexOf(str) - RequestConfiguration.zzacu.indexOf(str2);
    }
}
