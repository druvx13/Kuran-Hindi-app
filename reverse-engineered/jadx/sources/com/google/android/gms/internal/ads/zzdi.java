package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdi implements Runnable {
    private final /* synthetic */ zzdf zzvu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdi(zzdf zzdfVar) {
        this.zzvu = zzdfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzdlk zzdlkVar;
        Object obj2;
        obj = this.zzvu.zzvn;
        synchronized (obj) {
            z = this.zzvu.zzvo;
            if (z) {
                return;
            }
            this.zzvu.zzvo = true;
            try {
                this.zzvu.zzbt();
            } catch (Exception e) {
                zzdlkVar = this.zzvu.zzvj;
                zzdlkVar.zza(2023, -1L, e);
            }
            obj2 = this.zzvu.zzvn;
            synchronized (obj2) {
                this.zzvu.zzvo = false;
            }
        }
    }
}
