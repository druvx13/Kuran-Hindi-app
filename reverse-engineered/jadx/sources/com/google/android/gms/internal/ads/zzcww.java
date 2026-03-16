package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcww implements zzdak<zzcwt> {
    private final zzdrh zzfur;
    private final Context zzvf;

    public zzcww(zzdrh zzdrhVar, Context context) {
        this.zzfur = zzdrhVar;
        this.zzvf = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzcwt> zzaqa() {
        return this.zzfur.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcwv
            private final zzcww zzgmo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmo = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgmo.zzaqe();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcwt zzaqe() throws Exception {
        AudioManager audioManager = (AudioManager) this.zzvf.getSystemService("audio");
        return new zzcwt(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzq.zzlb().zzqb(), com.google.android.gms.ads.internal.zzq.zzlb().zzqc());
    }
}
