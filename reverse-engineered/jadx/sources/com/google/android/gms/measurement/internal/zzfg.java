package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zznh;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzfg extends zze {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private long zzg;
    private List<String> zzh;
    private int zzi;
    private String zzj;
    private String zzk;
    private String zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfg(zzgq zzgqVar, long j) {
        super(zzgqVar);
        this.zzg = j;
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:1|(1:3)(6:118|119|(1:121)(2:136|(1:138))|122|123|(27:125|(1:127)(1:134)|129|130|5|(1:117)(1:9)|10|(1:116)(1:14)|15|(1:(1:18)(1:19))|(15:21|(2:99|(2:101|(1:103))(1:(1:(2:114|29)(1:113))(2:107|(1:109))))(2:25|26)|30|(1:32)|33|34|(1:36)(1:88)|37|38|(2:85|(1:87))(4:42|(1:44)(1:84)|45|(1:83))|(3:50|(1:52)(1:55)|53)|56|(3:58|(3:60|(1:62)(3:64|(3:67|(1:69)|65)|70)|63)|(1:72))|73|(1:(2:76|77)(2:79|80))(2:81|82))|115|30|(0)|33|34|(0)(0)|37|38|(1:40)|85|(0)|(0)|56|(0)|73|(0)(0)))|4|5|(1:7)|117|10|(1:12)|116|15|(0)|(0)|115|30|(0)|33|34|(0)(0)|37|38|(0)|85|(0)|(0)|56|(0)|73|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02a9, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02aa, code lost:
        zzr().zzf().zza("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzfj.zza(r0), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a4, code lost:
        if (r2 == 0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x027b A[Catch: IllegalStateException -> 0x02a9, TryCatch #3 {IllegalStateException -> 0x02a9, blocks: (B:81:0x0226, B:85:0x0233, B:88:0x023d, B:90:0x0249, B:94:0x0260, B:96:0x0268, B:103:0x028c, B:105:0x02a0, B:107:0x02a5, B:106:0x02a3, B:98:0x026e, B:99:0x0275, B:101:0x027b), top: B:142:0x0226 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028c A[Catch: IllegalStateException -> 0x02a9, TryCatch #3 {IllegalStateException -> 0x02a9, blocks: (B:81:0x0226, B:85:0x0233, B:88:0x023d, B:90:0x0249, B:94:0x0260, B:96:0x0268, B:103:0x028c, B:105:0x02a0, B:107:0x02a5, B:106:0x02a3, B:98:0x026e, B:99:0x0275, B:101:0x027b), top: B:142:0x0226 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023d A[Catch: IllegalStateException -> 0x02a9, TRY_ENTER, TryCatch #3 {IllegalStateException -> 0x02a9, blocks: (B:81:0x0226, B:85:0x0233, B:88:0x023d, B:90:0x0249, B:94:0x0260, B:96:0x0268, B:103:0x028c, B:105:0x02a0, B:107:0x02a5, B:106:0x02a3, B:98:0x026e, B:99:0x0275, B:101:0x027b), top: B:142:0x0226 }] */
    @Override // com.google.android.gms.measurement.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzaa() {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfg.zzaa():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzm zza(String str) {
        boolean z;
        Boolean bool;
        Boolean zzd;
        zzd();
        zzb();
        String zzab = zzab();
        String zzac = zzac();
        zzw();
        String str2 = this.zzb;
        long zzaf = zzaf();
        zzw();
        String str3 = this.zzd;
        long zzf = zzt().zzf();
        zzw();
        zzd();
        if (this.zzf == 0) {
            this.zzf = this.zzx.zzi().zza(zzn(), zzn().getPackageName());
        }
        long j = this.zzf;
        boolean zzab2 = this.zzx.zzab();
        boolean z2 = !zzs().zzs;
        zzd();
        zzb();
        String zzai = !this.zzx.zzab() ? null : zzai();
        long zzad = this.zzx.zzad();
        int zzag = zzag();
        boolean booleanValue = zzt().zzj().booleanValue();
        zzx zzt = zzt();
        zzt.zzb();
        Boolean zzd2 = zzt.zzd("google_analytics_ssaid_collection_enabled");
        boolean booleanValue2 = Boolean.valueOf(zzd2 == null || zzd2.booleanValue()).booleanValue();
        zzfv zzs = zzs();
        zzs.zzd();
        boolean z3 = zzs.zzg().getBoolean("deferred_analytics_collection", false);
        String zzad2 = zzad();
        if (!zzt().zza(zzap.zzbd) || (zzd = zzt().zzd("google_analytics_default_allow_ad_personalization_signals")) == null) {
            z = z2;
            bool = null;
        } else {
            bool = Boolean.valueOf(!zzd.booleanValue());
            z = z2;
        }
        return new zzm(zzab, zzac, str2, zzaf, str3, zzf, j, str, zzab2, z, zzai, 0L, zzad, zzag, booleanValue, booleanValue2, z3, zzad2, bool, this.zzg, zzt().zza(zzap.zzbl) ? this.zzh : null, (zzll.zzb() && zzt().zza(zzap.zzch)) ? zzae() : null);
    }

    private final String zzai() {
        if (zznh.zzb() && zzt().zza(zzap.zzck)) {
            zzr().zzx().zza("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> loadClass = zzn().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zzn());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    zzr().zzk().zza("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                zzr().zzj().zza("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzab() {
        zzw();
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzac() {
        zzw();
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzad() {
        zzw();
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzae() {
        zzw();
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzaf() {
        zzw();
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzag() {
        zzw();
        return this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<String> zzah() {
        return this.zzh;
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzhr zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfg zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zziz zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zziy zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzff zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzke zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ zzah zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh, com.google.android.gms.measurement.internal.zzhj
    public final /* bridge */ /* synthetic */ Clock zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh, com.google.android.gms.measurement.internal.zzhj
    public final /* bridge */ /* synthetic */ Context zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ zzfh zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ zzla zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh, com.google.android.gms.measurement.internal.zzhj
    public final /* bridge */ /* synthetic */ zzgj zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh, com.google.android.gms.measurement.internal.zzhj
    public final /* bridge */ /* synthetic */ zzfj zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ zzfv zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ zzx zzt() {
        return super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh, com.google.android.gms.measurement.internal.zzhj
    public final /* bridge */ /* synthetic */ zzw zzu() {
        return super.zzu();
    }
}
