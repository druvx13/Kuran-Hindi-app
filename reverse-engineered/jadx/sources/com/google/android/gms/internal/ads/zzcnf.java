package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.internal.ads.zzsv;
import com.google.android.gms.internal.ads.zztf;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcnf {
    private zzazz zzdls;
    private zzcmp zzgdu;
    private zzst zzgeg;
    private Context zzvf;

    public zzcnf(Context context, zzazz zzazzVar, zzst zzstVar, zzcmp zzcmpVar) {
        this.zzvf = context;
        this.zzdls = zzazzVar;
        this.zzgeg = zzstVar;
        this.zzgdu = zzcmpVar;
    }

    public final void zzapc() {
        try {
            this.zzgdu.zza(new zzdkb(this) { // from class: com.google.android.gms.internal.ads.zzcne
                private final zzcnf zzgef;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgef = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdkb
                public final Object apply(Object obj) {
                    return this.zzgef.zzb((SQLiteDatabase) obj);
                }
            });
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzawr.zzfa(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zzb(SQLiteDatabase sQLiteDatabase) throws Exception {
        ArrayList<zztf.zzo.zza> zza = zzcnc.zza(sQLiteDatabase);
        final zztf.zzo zzoVar = (zztf.zzo) ((zzecd) zztf.zzo.zzoi().zzcc(this.zzvf.getPackageName()).zzcd(Build.MODEL).zzcg(zzcnc.zza(sQLiteDatabase, 0)).zze(zza).zzch(zzcnc.zza(sQLiteDatabase, 1)).zzes(com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis()).zzet(zzcnc.zzb(sQLiteDatabase, 2)).zzbet());
        ArrayList<zztf.zzo.zza> arrayList = zza;
        int size = arrayList.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            zztf.zzo.zza zzaVar = arrayList.get(i);
            i++;
            zztf.zzo.zza zzaVar2 = zzaVar;
            if (zzaVar2.zzok() == zztp.ENUM_TRUE && zzaVar2.getTimestamp() > j) {
                j = zzaVar2.getTimestamp();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        this.zzgeg.zza(new zzsw(zzoVar) { // from class: com.google.android.gms.internal.ads.zzcnh
            private final zztf.zzo zzgei;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgei = zzoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzsw
            public final void zza(zztf.zzi.zza zzaVar3) {
                zzaVar3.zzb(this.zzgei);
            }
        });
        final zztf.zzu zzuVar = (zztf.zzu) ((zzecd) zztf.zzu.zzos().zzcn(this.zzdls.zzdzn).zzco(this.zzdls.zzdzo).zzcp(this.zzdls.zzdzp ? 0 : 2).zzbet());
        this.zzgeg.zza(new zzsw(zzuVar) { // from class: com.google.android.gms.internal.ads.zzcng
            private final zztf.zzu zzgeh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgeh = zzuVar;
            }

            @Override // com.google.android.gms.internal.ads.zzsw
            public final void zza(zztf.zzi.zza zzaVar3) {
                zzaVar3.zza(zzaVar3.zznx().zzbew().zzb(this.zzgeh));
            }
        });
        this.zzgeg.zza(zzsv.zza.EnumC0024zza.OFFLINE_UPLOAD);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues3, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }
}
