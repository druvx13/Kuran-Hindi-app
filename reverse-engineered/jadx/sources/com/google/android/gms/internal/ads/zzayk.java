package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzayk {
    public final int count;
    public final String name;
    private final double zzdxo;
    private final double zzdxp;
    public final double zzdxq;

    public zzayk(String str, double d, double d2, double d3, int i) {
        this.name = str;
        this.zzdxp = d;
        this.zzdxo = d2;
        this.zzdxq = d3;
        this.count = i;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.name).add("minBound", Double.valueOf(this.zzdxp)).add("maxBound", Double.valueOf(this.zzdxo)).add("percent", Double.valueOf(this.zzdxq)).add("count", Integer.valueOf(this.count)).toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzayk) {
            zzayk zzaykVar = (zzayk) obj;
            return Objects.equal(this.name, zzaykVar.name) && this.zzdxo == zzaykVar.zzdxo && this.zzdxp == zzaykVar.zzdxp && this.count == zzaykVar.count && Double.compare(this.zzdxq, zzaykVar.zzdxq) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.name, Double.valueOf(this.zzdxo), Double.valueOf(this.zzdxp), Double.valueOf(this.zzdxq), Integer.valueOf(this.count));
    }
}
