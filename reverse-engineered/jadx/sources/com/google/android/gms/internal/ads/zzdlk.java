package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbm;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdlk {
    private static volatile zzbm.zza.zzc zzhbc = zzbm.zza.zzc.UNKNOWN;
    private final Executor executor;
    private final Task<zzsy> zzhbb;
    private final Context zzvf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(zzbm.zza.zzc zzcVar) {
        zzhbc = zzcVar;
    }

    public static zzdlk zza(final Context context, Executor executor) {
        return new zzdlk(context, executor, Tasks.call(executor, new Callable(context) { // from class: com.google.android.gms.internal.ads.zzdlm
            private final Context zzcit;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcit = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdlk.zzcg(this.zzcit);
            }
        }));
    }

    private zzdlk(Context context, Executor executor, Task<zzsy> task) {
        this.zzvf = context;
        this.executor = executor;
        this.zzhbb = task;
    }

    public final Task<Boolean> zzg(int i, long j) {
        return zza(i, j, null, null, null, null);
    }

    public final Task<Boolean> zza(int i, long j, Exception exc) {
        return zza(i, j, exc, null, null, null);
    }

    public final Task<Boolean> zza(int i, long j, String str, Map<String, String> map) {
        return zza(i, j, null, str, null, null);
    }

    public final Task<Boolean> zzi(int i, String str) {
        return zza(4007, 0L, null, null, null, str);
    }

    private final Task<Boolean> zza(final int i, long j, Exception exc, String str, Map<String, String> map, String str2) {
        final zzbm.zza.C0007zza zzc = zzbm.zza.zzt().zzi(this.zzvf.getPackageName()).zzc(j);
        zzc.zza(zzhbc);
        if (exc != null) {
            zzc.zzj(zzdom.zza(exc)).zzk(exc.getClass().getName());
        }
        if (str2 != null) {
            zzc.zzl(str2);
        }
        if (str != null) {
            zzc.zzm(str);
        }
        return this.zzhbb.continueWith(this.executor, new Continuation(zzc, i) { // from class: com.google.android.gms.internal.ads.zzdll
            private final int zzdwt;
            private final zzbm.zza.C0007zza zzhbd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhbd = zzc;
                this.zzdwt = i;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzdlk.zza(this.zzhbd, this.zzdwt, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Boolean zza(zzbm.zza.C0007zza c0007zza, int i, Task task) throws Exception {
        if (task.isSuccessful()) {
            zztc zzf = ((zzsy) task.getResult()).zzf(((zzbm.zza) ((zzecd) c0007zza.zzbet())).toByteArray());
            zzf.zzbs(i);
            zzf.zzdx();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ zzsy zzcg(Context context) throws Exception {
        return new zzsy(context, "GLAS", null);
    }
}
