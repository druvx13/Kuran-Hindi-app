package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public class zzect {
    private static final zzebq zzhsw = zzebq.zzbec();
    private zzeaq zzhzh;
    private volatile zzedo zzhzi;
    private volatile zzeaq zzhzj;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzect) {
            zzect zzectVar = (zzect) obj;
            zzedo zzedoVar = this.zzhzi;
            zzedo zzedoVar2 = zzectVar.zzhzi;
            if (zzedoVar == null && zzedoVar2 == null) {
                return zzbce().equals(zzectVar.zzbce());
            }
            if (zzedoVar == null || zzedoVar2 == null) {
                if (zzedoVar != null) {
                    return zzedoVar.equals(zzectVar.zzm(zzedoVar.zzbeu()));
                }
                return zzm(zzedoVar2.zzbeu()).equals(zzedoVar2);
            }
            return zzedoVar.equals(zzedoVar2);
        }
        return false;
    }

    private final zzedo zzm(zzedo zzedoVar) {
        if (this.zzhzi == null) {
            synchronized (this) {
                if (this.zzhzi == null) {
                    try {
                        this.zzhzi = zzedoVar;
                        this.zzhzj = zzeaq.zzhtf;
                    } catch (zzeco unused) {
                        this.zzhzi = zzedoVar;
                        this.zzhzj = zzeaq.zzhtf;
                    }
                }
            }
        }
        return this.zzhzi;
    }

    public final zzedo zzn(zzedo zzedoVar) {
        zzedo zzedoVar2 = this.zzhzi;
        this.zzhzh = null;
        this.zzhzj = null;
        this.zzhzi = zzedoVar;
        return zzedoVar2;
    }

    public final int zzbex() {
        if (this.zzhzj != null) {
            return this.zzhzj.size();
        }
        if (this.zzhzi != null) {
            return this.zzhzi.zzbex();
        }
        return 0;
    }

    public final zzeaq zzbce() {
        if (this.zzhzj != null) {
            return this.zzhzj;
        }
        synchronized (this) {
            if (this.zzhzj != null) {
                return this.zzhzj;
            }
            if (this.zzhzi == null) {
                this.zzhzj = zzeaq.zzhtf;
            } else {
                this.zzhzj = this.zzhzi.zzbce();
            }
            return this.zzhzj;
        }
    }
}
