package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzel extends zzck<Integer, Long> {
    public Long zzye;
    public Long zzyf;

    public zzel() {
    }

    public zzel(String str) {
        zzal(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzck
    public final void zzal(String str) {
        HashMap zzam = zzam(str);
        if (zzam != null) {
            this.zzye = (Long) zzam.get(0);
            this.zzyf = (Long) zzam.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzck
    protected final HashMap<Integer, Long> zzbo() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzye);
        hashMap.put(1, this.zzyf);
        return hashMap;
    }
}
