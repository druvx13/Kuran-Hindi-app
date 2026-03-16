package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzco extends zzck<Integer, Object> {
    public String zznk;
    public long zznl;
    public String zznm;
    public String zznn;
    public String zzno;

    public zzco(String str) {
        this();
        zzal(str);
    }

    public zzco() {
        this.zznk = "E";
        this.zznl = -1L;
        this.zznm = "E";
        this.zznn = "E";
        this.zzno = "E";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzck
    public final void zzal(String str) {
        HashMap zzam = zzam(str);
        if (zzam != null) {
            this.zznk = zzam.get(0) == null ? "E" : (String) zzam.get(0);
            this.zznl = zzam.get(1) == null ? -1L : ((Long) zzam.get(1)).longValue();
            this.zznm = zzam.get(2) == null ? "E" : (String) zzam.get(2);
            this.zznn = zzam.get(3) == null ? "E" : (String) zzam.get(3);
            this.zzno = zzam.get(4) != null ? (String) zzam.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzck
    protected final HashMap<Integer, Object> zzbo() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.zznk);
        hashMap.put(4, this.zzno);
        hashMap.put(3, this.zznn);
        hashMap.put(2, this.zznm);
        hashMap.put(1, Long.valueOf(this.zznl));
        return hashMap;
    }
}
