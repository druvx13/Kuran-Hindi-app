package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzbr;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
public final class zzs {
    private zzbr.zzc zza;
    private Long zzb;
    private long zzc;
    private final /* synthetic */ zzn zzd;

    private zzs(zzn zznVar) {
        this.zzd = zznVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbr.zzc zza(String str, zzbr.zzc zzcVar) {
        String zzc = zzcVar.zzc();
        List<zzbr.zze> zza = zzcVar.zza();
        Long l = (Long) this.zzd.zzg().zzb(zzcVar, "_eid");
        boolean z = l != null;
        if (z && zzc.equals("_ep")) {
            String str2 = (String) this.zzd.zzg().zzb(zzcVar, "_en");
            if (TextUtils.isEmpty(str2)) {
                if (com.google.android.gms.internal.measurement.zzkz.zzb() && this.zzd.zzt().zzd(str, zzap.zzcy)) {
                    this.zzd.zzr().zzg().zza("Extra parameter without an event name. eventId", l);
                } else {
                    this.zzd.zzr().zzf().zza("Extra parameter without an event name. eventId", l);
                }
                return null;
            }
            if (this.zza == null || this.zzb == null || l.longValue() != this.zzb.longValue()) {
                Pair<zzbr.zzc, Long> zza2 = this.zzd.zzi().zza(str, l);
                if (zza2 == null || zza2.first == null) {
                    if (com.google.android.gms.internal.measurement.zzkz.zzb() && this.zzd.zzt().zzd(str, zzap.zzcy)) {
                        this.zzd.zzr().zzg().zza("Extra parameter without existing main event. eventName, eventId", str2, l);
                    } else {
                        this.zzd.zzr().zzf().zza("Extra parameter without existing main event. eventName, eventId", str2, l);
                    }
                    return null;
                }
                this.zza = (zzbr.zzc) zza2.first;
                this.zzc = ((Long) zza2.second).longValue();
                this.zzb = (Long) this.zzd.zzg().zzb(this.zza, "_eid");
            }
            long j = this.zzc - 1;
            this.zzc = j;
            if (j <= 0) {
                zzac zzi = this.zzd.zzi();
                zzi.zzd();
                zzi.zzr().zzx().zza("Clearing complex main event info. appId", str);
                try {
                    zzi.c_().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e) {
                    zzi.zzr().zzf().zza("Error clearing complex main event", e);
                }
            } else {
                this.zzd.zzi().zza(str, l, this.zzc, this.zza);
            }
            ArrayList arrayList = new ArrayList();
            for (zzbr.zze zzeVar : this.zza.zza()) {
                this.zzd.zzg();
                if (zzkw.zza(zzcVar, zzeVar.zzb()) == null) {
                    arrayList.add(zzeVar);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.addAll(zza);
                zza = arrayList;
            } else if (com.google.android.gms.internal.measurement.zzkz.zzb() && this.zzd.zzt().zzd(str, zzap.zzcy)) {
                this.zzd.zzr().zzg().zza("No unique parameters in main event. eventName", str2);
            } else {
                this.zzd.zzr().zzi().zza("No unique parameters in main event. eventName", str2);
            }
            zzc = str2;
        } else if (z) {
            this.zzb = l;
            this.zza = zzcVar;
            Object zzb = this.zzd.zzg().zzb(zzcVar, "_epc");
            long longValue = (zzb != null ? zzb : 0L).longValue();
            this.zzc = longValue;
            if (longValue <= 0) {
                if (com.google.android.gms.internal.measurement.zzkz.zzb() && this.zzd.zzt().zzd(str, zzap.zzcy)) {
                    this.zzd.zzr().zzg().zza("Complex event with zero extra param count. eventName", zzc);
                } else {
                    this.zzd.zzr().zzi().zza("Complex event with zero extra param count. eventName", zzc);
                }
            } else {
                this.zzd.zzi().zza(str, l, this.zzc, zzcVar);
            }
        }
        return (zzbr.zzc) ((com.google.android.gms.internal.measurement.zzfd) zzcVar.zzbm().zza(zzc).zzc().zza(zza).zzu());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzs(zzn zznVar, zzq zzqVar) {
        this(zznVar);
    }
}
