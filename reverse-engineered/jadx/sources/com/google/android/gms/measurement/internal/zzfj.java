package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzfj extends zzhk {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzfl zzd;
    private final zzfl zze;
    private final zzfl zzf;
    private final zzfl zzg;
    private final zzfl zzh;
    private final zzfl zzi;
    private final zzfl zzj;
    private final zzfl zzk;
    private final zzfl zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfj(zzgq zzgqVar) {
        super(zzgqVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzfl(this, 6, false, false);
        this.zze = new zzfl(this, 6, true, false);
        this.zzf = new zzfl(this, 6, false, true);
        this.zzg = new zzfl(this, 5, false, false);
        this.zzh = new zzfl(this, 5, true, false);
        this.zzi = new zzfl(this, 5, false, true);
        this.zzj = new zzfl(this, 4, false, false);
        this.zzk = new zzfl(this, 3, false, false);
        this.zzl = new zzfl(this, 2, false, false);
    }

    @Override // com.google.android.gms.measurement.internal.zzhk
    protected final boolean zze() {
        return false;
    }

    public final zzfl zzf() {
        return this.zzd;
    }

    public final zzfl zzg() {
        return this.zze;
    }

    public final zzfl zzh() {
        return this.zzf;
    }

    public final zzfl zzi() {
        return this.zzg;
    }

    public final zzfl zzj() {
        return this.zzh;
    }

    public final zzfl zzk() {
        return this.zzi;
    }

    public final zzfl zzv() {
        return this.zzj;
    }

    public final zzfl zzw() {
        return this.zzk;
    }

    public final zzfl zzx() {
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zza(String str) {
        if (str == null) {
            return null;
        }
        return new zzfo(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && zza(i)) {
            zza(i, zza(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzgj zzg = this.zzx.zzg();
        if (zzg == null) {
            zza(6, "Scheduler not set. Not logging error/warn");
        } else if (!zzg.zzz()) {
            zza(6, "Scheduler not initialized. Not logging error/warn");
        } else {
            if (i < 0) {
                i = 0;
            }
            zzg.zza(new zzfm(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zza(int i) {
        return Log.isLoggable(zzad(), i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(int i, String str) {
        Log.println(i, zzad(), str);
    }

    private final String zzad() {
        String str;
        String str2;
        synchronized (this) {
            if (this.zzc == null) {
                if (this.zzx.zzs() != null) {
                    str2 = this.zzx.zzs();
                } else {
                    zzt().zzu();
                    str2 = "FA";
                }
                this.zzc = str2;
            }
            str = this.zzc;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String zza = zza(z, obj);
        String zza2 = zza(z, obj2);
        String zza3 = zza(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zza)) {
            sb.append(str2);
            sb.append(zza);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(zza2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(zza2);
        }
        if (!TextUtils.isEmpty(zza3)) {
            sb.append(str3);
            sb.append(zza3);
        }
        return sb.toString();
    }

    private static String zza(boolean z, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str2 = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str2.length() + 43 + str2.length());
            sb.append(str2);
            sb.append(round);
            sb.append("...");
            sb.append(str2);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String zzb = zzb(zzgq.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzb(className).equals(zzb)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb2.toString();
            } else if (!(obj instanceof zzfo)) {
                return z ? "-" : String.valueOf(obj);
            } else {
                str = ((zzfo) obj).zza;
                return str;
            }
        }
    }

    private static String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final String zzy() {
        Pair<String, Long> zza = zzs().zzb.zza();
        if (zza == null || zza == zzfv.zza) {
            return null;
        }
        String valueOf = String.valueOf(zza.second);
        String str = (String) zza.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
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
