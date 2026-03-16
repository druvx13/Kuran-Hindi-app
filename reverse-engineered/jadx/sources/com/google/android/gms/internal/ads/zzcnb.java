package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zztf;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcnb implements zzdqx<Bundle> {
    private final /* synthetic */ boolean zzgec;
    final /* synthetic */ zzcmy zzged;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnb(zzcmy zzcmyVar, boolean z) {
        this.zzged = zzcmyVar;
        this.zzgec = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        zzawr.zzfa("Failed to get signals bundle");
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(Bundle bundle) {
        final ArrayList zzm;
        final zztf.zzo.zzc zzl;
        final zztf.zzm zzk;
        zzcmp zzcmpVar;
        Bundle bundle2 = bundle;
        zzcmy zzcmyVar = this.zzged;
        zzm = zzcmy.zzm(bundle2);
        zzcmy zzcmyVar2 = this.zzged;
        zzl = zzcmy.zzl(bundle2);
        zzk = this.zzged.zzk(bundle2);
        zzcmpVar = this.zzged.zzgdu;
        final boolean z = this.zzgec;
        zzcmpVar.zza(new zzdkb(this, z, zzm, zzk, zzl) { // from class: com.google.android.gms.internal.ads.zzcna
            private final boolean zzecc;
            private final zzcnb zzgdy;
            private final ArrayList zzgdz;
            private final zztf.zzm zzgea;
            private final zztf.zzo.zzc zzgeb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgdy = this;
                this.zzecc = z;
                this.zzgdz = zzm;
                this.zzgea = zzk;
                this.zzgeb = zzl;
            }

            @Override // com.google.android.gms.internal.ads.zzdkb
            public final Object apply(Object obj) {
                byte[] zza;
                zzcnb zzcnbVar = this.zzgdy;
                boolean z2 = this.zzecc;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                zza = zzcnbVar.zzged.zza(z2, this.zzgdz, this.zzgea, this.zzgeb);
                ContentValues contentValues = new ContentValues();
                contentValues.put("timestamp", Long.valueOf(com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis()));
                contentValues.put("serialized_proto_data", zza);
                sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
                if (!z2) {
                    sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
                }
                return null;
            }
        });
    }
}
