package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaqe extends zzavl {
    private final /* synthetic */ QueryInfoGenerationCallback zzdlk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqe(zzaqc zzaqcVar, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.zzdlk = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzavm
    public final void zzk(String str, String str2) {
        QueryInfo queryInfo = new QueryInfo(new zzyh(str, null));
        zzvj.zzpz().put(queryInfo, str2);
        this.zzdlk.onSuccess(queryInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzavm
    public final void onError(String str) {
        this.zzdlk.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzavm
    public final void zza(String str, String str2, Bundle bundle) {
        QueryInfo queryInfo = new QueryInfo(new zzyh(str, bundle));
        zzvj.zzpz().put(queryInfo, str2);
        this.zzdlk.onSuccess(queryInfo);
    }
}
