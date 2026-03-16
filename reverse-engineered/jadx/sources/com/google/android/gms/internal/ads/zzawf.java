package com.google.android.gms.internal.ads;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzawf extends zzawn {
    private final /* synthetic */ zzawd zzdui;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawf(zzawd zzawdVar) {
        this.zzdui = zzawdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzawn
    public final void zzup() {
        Context context;
        zzazz zzazzVar;
        Object obj;
        zzaac zzaacVar;
        context = this.zzdui.zzvf;
        zzazzVar = this.zzdui.zzbmo;
        zzaad zzaadVar = new zzaad(context, zzazzVar.zzbnd);
        obj = this.zzdui.lock;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzq.zzlf();
                zzaacVar = this.zzdui.zzdtv;
                zzaae.zza(zzaacVar, zzaadVar);
            } catch (IllegalArgumentException e) {
                zzawr.zzd("Cannot config CSI reporter.", e);
            }
        }
    }
}
