package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbiv;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzbgy implements zzbjv {
    private static zzbgy zzeng;

    protected abstract zzdbc zza(zzdcl zzdclVar);

    public abstract Executor zzacv();

    public abstract ScheduledExecutorService zzacw();

    public abstract Executor zzacx();

    public abstract zzdrh zzacy();

    public abstract zzbte zzacz();

    public abstract zzcfz zzada();

    public abstract zzbja zzadb();

    public abstract zzbms zzadc();

    public abstract zzblk zzadd();

    public abstract zzddo zzade();

    public abstract zzbxq zzadf();

    public abstract zzbyo zzadg();

    public abstract zzcer zzadh();

    public abstract zzdgf zzadi();

    public abstract zzcue zzadj();

    public abstract zzdhp<zzcdt> zzadk();

    public static zzbgy zza(Context context, zzalp zzalpVar, int i) {
        zzbgy zzf = zzf(context, i);
        zzf.zzada().zzb(zzalpVar);
        return zzf;
    }

    @Deprecated
    public static zzbgy zzf(Context context, int i) {
        synchronized (zzbgy.class) {
            if (zzeng != null) {
                return zzeng;
            }
            return zza(new zzazz(201004000, i, true, false), context, new zzbht());
        }
    }

    @Deprecated
    private static zzbgy zza(zzazz zzazzVar, Context context, zzbiv.zza zzaVar) {
        zzbgy zzbgyVar;
        synchronized (zzbgy.class) {
            if (zzeng == null) {
                zzeng = new zzbim().zzc(new zzbhb(new zzbhb.zza().zza(zzazzVar).zzbu(context))).zza(new zzbiv(zzaVar)).zzafn();
                zzzz.initialize(context);
                com.google.android.gms.ads.internal.zzq.zzla().zzd(context, zzazzVar);
                com.google.android.gms.ads.internal.zzq.zzlc().initialize(context);
                com.google.android.gms.ads.internal.zzq.zzkw().zzao(context);
                com.google.android.gms.ads.internal.zzq.zzkw().zzap(context);
                zzawp.zzan(context);
                com.google.android.gms.ads.internal.zzq.zzkz().initialize(context);
                com.google.android.gms.ads.internal.zzq.zzlr().initialize(context);
                if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsz)).booleanValue()) {
                    new zzcnf(context, zzazzVar, new zzst(new zzsy(context)), new zzcmp(new zzcmn(context), zzeng.zzacy())).zzapc();
                }
            }
            zzbgyVar = zzeng;
        }
        return zzbgyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjv
    public final zzdbc zza(zzarj zzarjVar, int i) {
        return zza(new zzdcl(zzarjVar, i));
    }
}
