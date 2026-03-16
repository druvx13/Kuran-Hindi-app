package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzfm implements Runnable {
    private final /* synthetic */ int zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Object zzc;
    private final /* synthetic */ Object zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ zzfj zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfm(zzfj zzfjVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzfjVar;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        zzfv zzc = this.zzf.zzx.zzc();
        if (!zzc.zzz()) {
            this.zzf.zza(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c = this.zzf.zza;
        if (c == 0) {
            if (this.zzf.zzt().zzg()) {
                zzfj zzfjVar = this.zzf;
                zzfjVar.zzu();
                zzfjVar.zza = 'C';
            } else {
                zzfj zzfjVar2 = this.zzf;
                zzfjVar2.zzu();
                zzfjVar2.zza = 'c';
            }
        }
        j = this.zzf.zzb;
        if (j < 0) {
            zzfj zzfjVar3 = this.zzf;
            zzfjVar3.zzb = zzfjVar3.zzt().zzf();
        }
        char charAt = "01VDIWEA?".charAt(this.zza);
        c2 = this.zzf.zza;
        j2 = this.zzf.zzb;
        String zza = zzfj.zza(true, this.zzb, this.zzc, this.zzd, this.zze);
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(c2);
        sb.append(j2);
        sb.append(":");
        sb.append(zza);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.zzb.substring(0, 1024);
        }
        zzc.zzb.zza(sb2, 1L);
    }
}
