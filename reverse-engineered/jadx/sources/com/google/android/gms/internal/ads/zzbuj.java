package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.util.Clock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzbuj {
    private final zzder zzfks;
    private final Set<zzbvt<zzub>> zzfnu;
    private final Set<zzbvt<zzbqx>> zzfnv;
    private final Set<zzbvt<zzbrp>> zzfnw;
    private final Set<zzbvt<zzbsr>> zzfnx;
    private final Set<zzbvt<zzbsm>> zzfny;
    private final Set<zzbvt<zzbrc>> zzfnz;
    private final Set<zzbvt<zzbrl>> zzfoa;
    private final Set<zzbvt<AdMetadataListener>> zzfob;
    private final Set<zzbvt<AppEventListener>> zzfoc;
    private final Set<zzbvt<zzbtb>> zzfod;
    private zzbra zzfoe;
    private zzcqi zzfof;

    private zzbuj(zza zzaVar) {
        this.zzfnu = zzaVar.zzfnu;
        this.zzfnw = zzaVar.zzfnw;
        this.zzfnx = zzaVar.zzfnx;
        this.zzfnv = zzaVar.zzfnv;
        this.zzfny = zzaVar.zzfny;
        this.zzfnz = zzaVar.zzfnz;
        this.zzfoa = zzaVar.zzfoa;
        this.zzfob = zzaVar.zzfob;
        this.zzfoc = zzaVar.zzfoc;
        this.zzfod = zzaVar.zzfog;
        this.zzfks = zzaVar.zzfks;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static class zza {
        private zzder zzfks;
        private Set<zzbvt<zzub>> zzfnu = new HashSet();
        private Set<zzbvt<zzbqx>> zzfnv = new HashSet();
        private Set<zzbvt<zzbrp>> zzfnw = new HashSet();
        private Set<zzbvt<zzbsr>> zzfnx = new HashSet();
        private Set<zzbvt<zzbsm>> zzfny = new HashSet();
        private Set<zzbvt<zzbrc>> zzfnz = new HashSet();
        private Set<zzbvt<AdMetadataListener>> zzfob = new HashSet();
        private Set<zzbvt<AppEventListener>> zzfoc = new HashSet();
        private Set<zzbvt<zzbrl>> zzfoa = new HashSet();
        private Set<zzbvt<zzbtb>> zzfog = new HashSet();

        public final zza zza(zzbqx zzbqxVar, Executor executor) {
            this.zzfnv.add(new zzbvt<>(zzbqxVar, executor));
            return this;
        }

        public final zza zza(zzbsm zzbsmVar, Executor executor) {
            this.zzfny.add(new zzbvt<>(zzbsmVar, executor));
            return this;
        }

        public final zza zza(zzbrc zzbrcVar, Executor executor) {
            this.zzfnz.add(new zzbvt<>(zzbrcVar, executor));
            return this;
        }

        public final zza zza(zzbrl zzbrlVar, Executor executor) {
            this.zzfoa.add(new zzbvt<>(zzbrlVar, executor));
            return this;
        }

        public final zza zza(AdMetadataListener adMetadataListener, Executor executor) {
            this.zzfob.add(new zzbvt<>(adMetadataListener, executor));
            return this;
        }

        public final zza zza(AppEventListener appEventListener, Executor executor) {
            this.zzfoc.add(new zzbvt<>(appEventListener, executor));
            return this;
        }

        public final zza zza(zzwh zzwhVar, Executor executor) {
            if (this.zzfoc != null) {
                zzcto zzctoVar = new zzcto();
                zzctoVar.zzb(zzwhVar);
                this.zzfoc.add(new zzbvt<>(zzctoVar, executor));
            }
            return this;
        }

        public final zza zza(zzub zzubVar, Executor executor) {
            this.zzfnu.add(new zzbvt<>(zzubVar, executor));
            return this;
        }

        public final zza zza(zzbrp zzbrpVar, Executor executor) {
            this.zzfnw.add(new zzbvt<>(zzbrpVar, executor));
            return this;
        }

        public final zza zza(zzbsr zzbsrVar, Executor executor) {
            this.zzfnx.add(new zzbvt<>(zzbsrVar, executor));
            return this;
        }

        public final zza zza(zzbtb zzbtbVar, Executor executor) {
            this.zzfog.add(new zzbvt<>(zzbtbVar, executor));
            return this;
        }

        public final zza zza(zzder zzderVar) {
            this.zzfks = zzderVar;
            return this;
        }

        public final zzbuj zzajm() {
            return new zzbuj(this);
        }
    }

    public final Set<zzbvt<zzbqx>> zzajb() {
        return this.zzfnv;
    }

    public final Set<zzbvt<zzbsm>> zzajc() {
        return this.zzfny;
    }

    public final Set<zzbvt<zzbrc>> zzajd() {
        return this.zzfnz;
    }

    public final Set<zzbvt<zzbrl>> zzaje() {
        return this.zzfoa;
    }

    public final Set<zzbvt<AdMetadataListener>> zzajf() {
        return this.zzfob;
    }

    public final Set<zzbvt<AppEventListener>> zzajg() {
        return this.zzfoc;
    }

    public final Set<zzbvt<zzub>> zzajh() {
        return this.zzfnu;
    }

    public final Set<zzbvt<zzbrp>> zzaji() {
        return this.zzfnw;
    }

    public final Set<zzbvt<zzbsr>> zzajj() {
        return this.zzfnx;
    }

    public final Set<zzbvt<zzbtb>> zzajk() {
        return this.zzfod;
    }

    public final zzder zzajl() {
        return this.zzfks;
    }

    public final zzbra zzc(Set<zzbvt<zzbrc>> set) {
        if (this.zzfoe == null) {
            this.zzfoe = new zzbra(set);
        }
        return this.zzfoe;
    }

    public final zzcqi zza(Clock clock, zzcqk zzcqkVar) {
        if (this.zzfof == null) {
            this.zzfof = new zzcqi(clock, zzcqkVar);
        }
        return this.zzfof;
    }
}
