package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdx extends zzck<Integer, Long> {
    public long zzxs;
    public long zzxt;

    public zzdx() {
        this.zzxs = -1L;
        this.zzxt = -1L;
    }

    public zzdx(String str) {
        this();
        zzal(str);
    }

    @Override // com.google.android.gms.internal.ads.zzck
    protected final HashMap<Integer, Long> zzbo() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.zzxs));
        hashMap.put(1, Long.valueOf(this.zzxt));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzck
    public final void zzal(String str) {
        HashMap zzam = zzam(str);
        if (zzam != null) {
            this.zzxs = ((Long) zzam.get(0)).longValue();
            this.zzxt = ((Long) zzam.get(1)).longValue();
        }
    }
}
