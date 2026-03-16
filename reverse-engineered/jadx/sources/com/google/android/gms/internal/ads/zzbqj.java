package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzbqj {
    private final zzdhe zzfll;
    private Bundle zzfmv;
    private final String zzfmw;
    private final zzdgz zzfmx;
    private final Context zzvf;

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static class zza {
        private zzdhe zzfll;
        private Bundle zzfmv;
        private String zzfmw;
        private zzdgz zzfmx;
        private Context zzvf;

        public final zza zzcb(Context context) {
            this.zzvf = context;
            return this;
        }

        public final zza zza(zzdhe zzdheVar) {
            this.zzfll = zzdheVar;
            return this;
        }

        public final zza zzf(Bundle bundle) {
            this.zzfmv = bundle;
            return this;
        }

        public final zza zzfv(String str) {
            this.zzfmw = str;
            return this;
        }

        public final zzbqj zzair() {
            return new zzbqj(this);
        }

        public final zza zza(zzdgz zzdgzVar) {
            this.zzfmx = zzdgzVar;
            return this;
        }
    }

    private zzbqj(zza zzaVar) {
        this.zzvf = zzaVar.zzvf;
        this.zzfll = zzaVar.zzfll;
        this.zzfmv = zzaVar.zzfmv;
        this.zzfmw = zzaVar.zzfmw;
        this.zzfmx = zzaVar.zzfmx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zza zzaim() {
        return new zza().zzcb(this.zzvf).zza(this.zzfll).zzfv(this.zzfmw).zzf(this.zzfmv);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdhe zzain() {
        return this.zzfll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdgz zzaio() {
        return this.zzfmx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle zzaip() {
        return this.zzfmv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzaiq() {
        return this.zzfmw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zzca(Context context) {
        return this.zzfmw != null ? context : this.zzvf;
    }
}
