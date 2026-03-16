package com.google.android.gms.internal.ads;

import java.util.LinkedList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdil {
    private final int maxEntries;
    private final int zzgwd;
    private final LinkedList<zzdiv<?>> zzgwc = new LinkedList<>();
    private final zzdjm zzgwe = new zzdjm();

    public zzdil(int i, int i2) {
        this.maxEntries = i;
        this.zzgwd = i2;
    }

    public final boolean zzb(zzdiv<?> zzdivVar) {
        this.zzgwe.zzati();
        zzasp();
        if (this.zzgwc.size() == this.maxEntries) {
            return false;
        }
        this.zzgwc.add(zzdivVar);
        return true;
    }

    public final zzdiv<?> zzask() {
        this.zzgwe.zzati();
        zzasp();
        if (this.zzgwc.isEmpty()) {
            return null;
        }
        zzdiv<?> remove = this.zzgwc.remove();
        if (remove != null) {
            this.zzgwe.zzatj();
        }
        return remove;
    }

    public final int size() {
        zzasp();
        return this.zzgwc.size();
    }

    public final long getCreationTimeMillis() {
        return this.zzgwe.getCreationTimeMillis();
    }

    public final long zzasl() {
        return this.zzgwe.zzasl();
    }

    public final int zzasm() {
        return this.zzgwe.zzasm();
    }

    public final String zzasn() {
        return this.zzgwe.zzasy();
    }

    public final zzdjl zzaso() {
        return this.zzgwe.zzatl();
    }

    private final void zzasp() {
        while (!this.zzgwc.isEmpty()) {
            if (!(com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis() - this.zzgwc.getFirst().zzgxv >= ((long) this.zzgwd))) {
                return;
            }
            this.zzgwe.zzatk();
            this.zzgwc.remove();
        }
    }
}
