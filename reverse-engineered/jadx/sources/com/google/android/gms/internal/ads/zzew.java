package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzew extends zzck<Integer, Long> {
    public Long zzaaa;
    public Long zzaab;
    public Long zzzy;
    public Long zzzz;

    public zzew() {
    }

    public zzew(String str) {
        zzal(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzck
    public final void zzal(String str) {
        HashMap zzam = zzam(str);
        if (zzam != null) {
            this.zzzy = (Long) zzam.get(0);
            this.zzzz = (Long) zzam.get(1);
            this.zzaaa = (Long) zzam.get(2);
            this.zzaab = (Long) zzam.get(3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzck
    protected final HashMap<Integer, Long> zzbo() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzzy);
        hashMap.put(1, this.zzzz);
        hashMap.put(2, this.zzaaa);
        hashMap.put(3, this.zzaab);
        return hashMap;
    }
}
