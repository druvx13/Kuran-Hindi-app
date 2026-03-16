package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zziz extends zze {
    private final zzjr zza;
    private zzfb zzb;
    private volatile Boolean zzc;
    private final zzaf zzd;
    private final zzkl zze;
    private final List<Runnable> zzf;
    private final zzaf zzg;

    /* JADX INFO: Access modifiers changed from: protected */
    public zziz(zzgq zzgqVar) {
        super(zzgqVar);
        this.zzf = new ArrayList();
        this.zze = new zzkl(zzgqVar.zzm());
        this.zza = new zzjr(this);
        this.zzd = new zzjc(this, zzgqVar);
        this.zzg = new zzjj(this, zzgqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    public final boolean zzab() {
        zzd();
        zzw();
        return this.zzb != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzac() {
        zzd();
        zzw();
        zza(new zzjm(this, zza(true)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzfb zzfbVar, AbstractSafeParcelable abstractSafeParcelable, zzm zzmVar) {
        int i;
        List<AbstractSafeParcelable> zza;
        zzd();
        zzb();
        zzw();
        boolean zzaj = zzaj();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!zzaj || (zza = zzj().zza(100)) == null) {
                i = 0;
            } else {
                arrayList.addAll(zza);
                i = zza.size();
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzan) {
                    try {
                        zzfbVar.zza((zzan) abstractSafeParcelable2, zzmVar);
                    } catch (RemoteException e) {
                        zzr().zzf().zza("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkz) {
                    try {
                        zzfbVar.zza((zzkz) abstractSafeParcelable2, zzmVar);
                    } catch (RemoteException e2) {
                        zzr().zzf().zza("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzv) {
                    try {
                        zzfbVar.zza((zzv) abstractSafeParcelable2, zzmVar);
                    } catch (RemoteException e3) {
                        zzr().zzf().zza("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    zzr().zzf().zza("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzan zzanVar, String str) {
        Preconditions.checkNotNull(zzanVar);
        zzd();
        zzw();
        boolean zzaj = zzaj();
        zza(new zzjl(this, zzaj, zzaj && zzj().zza(zzanVar), zzanVar, zza(true), str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzv zzvVar) {
        Preconditions.checkNotNull(zzvVar);
        zzd();
        zzw();
        zzu();
        zza(new zzjo(this, true, zzj().zza(zzvVar), new zzv(zzvVar), zza(true), zzvVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzv>> atomicReference, String str, String str2, String str3) {
        zzd();
        zzw();
        zza(new zzjn(this, atomicReference, str, str2, str3, zza(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(com.google.android.gms.internal.measurement.zzn zznVar, String str, String str2) {
        zzd();
        zzw();
        zza(new zzjq(this, str, str2, zza(false), zznVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzkz>> atomicReference, String str, String str2, String str3, boolean z) {
        zzd();
        zzw();
        zza(new zzjp(this, atomicReference, str, str2, str3, z, zza(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(com.google.android.gms.internal.measurement.zzn zznVar, String str, String str2, boolean z) {
        zzd();
        zzw();
        zza(new zzjs(this, str, str2, z, zza(false), zznVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzkz zzkzVar) {
        zzd();
        zzw();
        zza(new zzjb(this, zzaj() && zzj().zza(zzkzVar), zzkzVar, zza(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzkz>> atomicReference, boolean z) {
        zzd();
        zzw();
        zza(new zzje(this, atomicReference, zza(false), z));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzad() {
        zzd();
        zzb();
        zzw();
        zzm zza = zza(false);
        if (zzaj()) {
            zzj().zzab();
        }
        zza(new zzjd(this, zza));
    }

    private final boolean zzaj() {
        zzu();
        return true;
    }

    public final void zza(AtomicReference<String> atomicReference) {
        zzd();
        zzw();
        zza(new zzjg(this, atomicReference, zza(false)));
    }

    public final void zza(com.google.android.gms.internal.measurement.zzn zznVar) {
        zzd();
        zzw();
        zza(new zzjf(this, zza(false), zznVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzae() {
        zzd();
        zzw();
        zzm zza = zza(true);
        boolean zza2 = zzt().zza(zzap.zzbz);
        if (zza2) {
            zzj().zzac();
        }
        zza(new zzji(this, zza, zza2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zziv zzivVar) {
        zzd();
        zzw();
        zza(new zzjh(this, zzivVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzak() {
        zzd();
        this.zze.zza();
        this.zzd.zza(zzap.zzai.zza(null).longValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaf() {
        zzd();
        zzw();
        if (zzab()) {
            return;
        }
        if (zzal()) {
            this.zza.zzb();
        } else if (zzt().zzy()) {
        } else {
            zzu();
            List<ResolveInfo> queryIntentServices = zzn().getPackageManager().queryIntentServices(new Intent().setClassName(zzn(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context zzn = zzn();
                zzu();
                intent.setComponent(new ComponentName(zzn, "com.google.android.gms.measurement.AppMeasurementService"));
                this.zza.zza(intent);
                return;
            }
            zzr().zzf().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzag() {
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzal() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziz.zzal():boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzfb zzfbVar) {
        zzd();
        Preconditions.checkNotNull(zzfbVar);
        this.zzb = zzfbVar;
        zzak();
        zzan();
    }

    public final void zzah() {
        zzd();
        zzw();
        this.zza.zza();
        try {
            ConnectionTracker.getInstance().unbindService(zzn(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(ComponentName componentName) {
        zzd();
        if (this.zzb != null) {
            this.zzb = null;
            zzr().zzx().zza("Disconnected from device MeasurementService", componentName);
            zzd();
            zzaf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzam() {
        zzd();
        if (zzab()) {
            zzr().zzx().zza("Inactivity, disconnecting from the service");
            zzah();
        }
    }

    private final void zza(Runnable runnable) throws IllegalStateException {
        zzd();
        if (zzab()) {
            runnable.run();
        } else if (this.zzf.size() >= 1000) {
            zzr().zzf().zza("Discarding data. Max runnable queue size reached");
        } else {
            this.zzf.add(runnable);
            this.zzg.zza(60000L);
            zzaf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzan() {
        zzd();
        zzr().zzx().zza("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        for (Runnable runnable : this.zzf) {
            try {
                runnable.run();
            } catch (Exception e) {
                zzr().zzf().zza("Task exception while flushing queue", e);
            }
        }
        this.zzf.clear();
        this.zzg.zzc();
    }

    private final zzm zza(boolean z) {
        zzu();
        return zzg().zza(z ? zzr().zzy() : null);
    }

    public final void zza(com.google.android.gms.internal.measurement.zzn zznVar, zzan zzanVar, String str) {
        zzd();
        zzw();
        if (zzp().zza(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            zzr().zzi().zza("Not bundling data. Service unavailable or out of date");
            zzp().zza(zznVar, new byte[0]);
            return;
        }
        zza(new zzjk(this, zzanVar, str, zznVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzai() {
        zzd();
        zzw();
        return !zzal() || zzp().zzj() >= 200900;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfb zza(zziz zzizVar, zzfb zzfbVar) {
        zzizVar.zzb = null;
        return null;
    }
}
