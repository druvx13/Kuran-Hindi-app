package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcyl implements zzdak<zzcym> {
    private final PackageInfo zzdly;
    private final zzawt zzduw;
    private final zzdhe zzfll;
    private final zzdrh zzfur;

    public zzcyl(zzdrh zzdrhVar, zzdhe zzdheVar, PackageInfo packageInfo, zzawt zzawtVar) {
        this.zzfur = zzdrhVar;
        this.zzfll = zzdheVar;
        this.zzdly = packageInfo;
        this.zzduw = zzawtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzcym> zzaqa() {
        return this.zzfur.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcyo
            private final zzcyl zzgni;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgni = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgni.zzaqi();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f9, code lost:
        if (r9 == 3) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void zza(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcyl.zza(java.util.ArrayList, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcym zzaqi() throws Exception {
        final ArrayList<String> arrayList = this.zzfll.zzguy;
        if (arrayList == null) {
            return zzcyn.zzgnh;
        }
        if (arrayList.isEmpty()) {
            return zzcyq.zzgnh;
        }
        return new zzcym(this, arrayList) { // from class: com.google.android.gms.internal.ads.zzcyp
            private final zzcyl zzgni;
            private final ArrayList zzgnj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgni = this;
                this.zzgnj = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzdah
            public final void zzs(Bundle bundle) {
                this.zzgni.zza(this.zzgnj, bundle);
            }
        };
    }
}
