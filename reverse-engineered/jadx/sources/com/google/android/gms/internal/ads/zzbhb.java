package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzbhb {
    private final zzazz zzbml;
    private final WeakReference<Context> zzenh;
    private final Context zzzo;

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static class zza {
        private zzazz zzbml;
        private WeakReference<Context> zzenh;
        private Context zzzo;

        public final zza zza(zzazz zzazzVar) {
            this.zzbml = zzazzVar;
            return this;
        }

        public final zza zzbu(Context context) {
            this.zzenh = new WeakReference<>(context);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzzo = context;
            return this;
        }
    }

    private zzbhb(zza zzaVar) {
        this.zzbml = zzaVar.zzbml;
        this.zzzo = zzaVar.zzzo;
        this.zzenh = zzaVar.zzenh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zzadl() {
        return this.zzzo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final WeakReference<Context> zzadm() {
        return this.zzenh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzazz zzadn() {
        return this.zzbml;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzado() {
        return com.google.android.gms.ads.internal.zzq.zzkw().zzr(this.zzzo, this.zzbml.zzbnd);
    }

    public final zzdt zzadp() {
        return new zzdt(new com.google.android.gms.ads.internal.zzh(this.zzzo, this.zzbml));
    }
}
