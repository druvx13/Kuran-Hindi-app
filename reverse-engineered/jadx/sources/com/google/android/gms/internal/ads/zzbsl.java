package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbsl extends zzbui<AdMetadataListener> implements zzafj {
    private Bundle zzfnk;

    public zzbsl(Set<zzbvt<AdMetadataListener>> set) {
        super(set);
        this.zzfnk = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzfnk.putAll(bundle);
        zza(zzbso.zzfnf);
    }

    public final synchronized Bundle getAdMetadata() {
        return new Bundle(this.zzfnk);
    }
}
