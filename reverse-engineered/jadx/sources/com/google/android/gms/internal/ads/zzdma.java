package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdma {
    private final zzdmd zzhbr;
    private final Task<zzbv.zza> zzhbs;
    private final zzdmg zzhbt;
    private final Task<zzbv.zza> zzhbu;
    private final Context zzvf;
    private final zzdlk zzvj;
    private final zzdlo zzxy;

    public zzdma(Context context, Executor executor, zzdlk zzdlkVar, zzdlo zzdloVar) {
        this(context, executor, zzdlkVar, zzdloVar, new zzdmg(), new zzdmd());
    }

    private zzdma(Context context, Executor executor, zzdlk zzdlkVar, zzdlo zzdloVar, zzdmg zzdmgVar, zzdmd zzdmdVar) {
        this.zzvf = context;
        this.zzvj = zzdlkVar;
        this.zzxy = zzdloVar;
        this.zzhbt = zzdmgVar;
        this.zzhbr = zzdmdVar;
        this.zzhbs = Tasks.call(executor, new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdlz
            private final zzdma zzhbq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhbq = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzhbq.zzaup();
            }
        }).addOnFailureListener(new OnFailureListener(this) { // from class: com.google.android.gms.internal.ads.zzdmc
            private final zzdma zzhbq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhbq = this;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.zzhbq.zze(exc);
            }
        });
        this.zzhbu = Tasks.call(executor, new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdmb
            private final zzdma zzhbq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhbq = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzhbq.zzauo();
            }
        }).addOnFailureListener(new OnFailureListener(this) { // from class: com.google.android.gms.internal.ads.zzdme
            private final zzdma zzhbq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhbq = this;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.zzhbq.zzd(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzc */
    public final void zze(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzvj.zza(2025, -1L, exc);
    }

    private final synchronized zzbv.zza zza(Task<zzbv.zza> task) {
        if (!task.isComplete()) {
            try {
                Tasks.await(task, 200L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                zze(e);
            }
        }
        if (!task.isSuccessful()) {
            return (zzbv.zza) ((zzecd) zzbv.zza.zzar().zzu("E").zzbet());
        }
        return task.getResult();
    }

    private final synchronized zzbv.zza zzcp() {
        return zza(this.zzhbu);
    }

    private final synchronized zzbv.zza zzaum() {
        return zza(this.zzhbs);
    }

    public final String zzag() {
        return zzcp().zzag();
    }

    public final String zzam() {
        return zzaum().zzam();
    }

    public final int zzaun() {
        return zzaum().zzan().zzw();
    }

    public final boolean zzao() {
        return zzaum().zzao();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbv.zza zzauo() throws Exception {
        PackageInfo packageInfo = this.zzvf.getPackageManager().getPackageInfo(this.zzvf.getPackageName(), 0);
        Context context = this.zzvf;
        return zzdlu.zzj(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbv.zza zzaup() throws Exception {
        if (this.zzxy.zzaug()) {
            Context context = this.zzvf;
            zzbv.zza.C0010zza zzar = zzbv.zza.zzar();
            AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context);
            advertisingIdClient.start();
            AdvertisingIdClient.Info info = advertisingIdClient.getInfo();
            String id = info.getId();
            if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID fromString = UUID.fromString(id);
                byte[] bArr = new byte[16];
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.putLong(fromString.getMostSignificantBits());
                wrap.putLong(fromString.getLeastSignificantBits());
                id = Base64.encodeToString(bArr, 11);
            }
            if (id != null) {
                zzar.zzaa(id);
                zzar.zza(info.isLimitAdTrackingEnabled());
                zzar.zza(zzbv.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
            }
            return (zzbv.zza) ((zzecd) zzar.zzbet());
        }
        return zzbv.zza.zzas();
    }
}
