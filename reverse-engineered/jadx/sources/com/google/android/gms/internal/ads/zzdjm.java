package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdjm {
    private final long zzgyn;
    private long zzgyp;
    private final zzdjl zzgyo = new zzdjl();
    private int zzgyq = 0;
    private int zzgyr = 0;
    private int zzgym = 0;

    public zzdjm() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis();
        this.zzgyn = currentTimeMillis;
        this.zzgyp = currentTimeMillis;
    }

    public final void zzati() {
        this.zzgyp = com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis();
        this.zzgyq++;
    }

    public final void zzatj() {
        this.zzgyr++;
        this.zzgyo.zzgyl = true;
    }

    public final void zzatk() {
        this.zzgym++;
        this.zzgyo.zzgym++;
    }

    public final long getCreationTimeMillis() {
        return this.zzgyn;
    }

    public final long zzasl() {
        return this.zzgyp;
    }

    public final int zzasm() {
        return this.zzgyq;
    }

    public final zzdjl zzatl() {
        zzdjl zzdjlVar = (zzdjl) this.zzgyo.clone();
        zzdjl zzdjlVar2 = this.zzgyo;
        zzdjlVar2.zzgyl = false;
        zzdjlVar2.zzgym = 0;
        return zzdjlVar;
    }

    public final String zzasy() {
        return "Created: " + this.zzgyn + " Last accessed: " + this.zzgyp + " Accesses: " + this.zzgyq + "\nEntries retrieved: Valid: " + this.zzgyr + " Stale: " + this.zzgym;
    }
}
