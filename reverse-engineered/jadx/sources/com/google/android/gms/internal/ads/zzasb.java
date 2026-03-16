package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzasb extends zzasg {
    private final String type;
    private final int zzdqy;

    public zzasb(String str, int i) {
        this.type = str;
        this.zzdqy = i;
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final String getType() {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final int getAmount() {
        return this.zzdqy;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzasb)) {
            zzasb zzasbVar = (zzasb) obj;
            if (Objects.equal(this.type, zzasbVar.type) && Objects.equal(Integer.valueOf(this.zzdqy), Integer.valueOf(zzasbVar.zzdqy))) {
                return true;
            }
        }
        return false;
    }
}
