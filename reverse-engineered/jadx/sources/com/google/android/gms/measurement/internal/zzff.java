package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzff extends zze {
    private final zzfi zza;
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzff(zzgq zzgqVar) {
        super(zzgqVar);
        this.zza = new zzfi(this, zzn(), "google_app_measurement_local.db");
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    public final void zzab() {
        zzb();
        zzd();
        try {
            int delete = zzae().delete("messages", null, null) + 0;
            if (delete > 0) {
                zzr().zzx().zza("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error resetting local analytics data. error", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0128  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zza(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzff.zza(int, byte[]):boolean");
    }

    public final boolean zza(zzan zzanVar) {
        Parcel obtain = Parcel.obtain();
        zzanVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            zzr().zzg().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zza(0, marshall);
    }

    public final boolean zza(zzkz zzkzVar) {
        Parcel obtain = Parcel.obtain();
        zzkzVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            zzr().zzg().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return zza(1, marshall);
    }

    public final boolean zza(zzv zzvVar) {
        zzp();
        byte[] zza = zzla.zza((Parcelable) zzvVar);
        if (zza.length > 131072) {
            zzr().zzg().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return zza(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0202 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable>] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> zza(int r25) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzff.zza(int):java.util.List");
    }

    public final boolean zzac() {
        return zza(3, new byte[0]);
    }

    public final boolean zzad() {
        zzd();
        zzb();
        if (!this.zzb && zzaf()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase zzae = zzae();
                        if (zzae == null) {
                            this.zzb = true;
                            if (zzae != null) {
                                zzae.close();
                            }
                            return false;
                        }
                        zzae.beginTransaction();
                        zzae.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        zzae.setTransactionSuccessful();
                        zzae.endTransaction();
                        if (zzae != null) {
                            zzae.close();
                        }
                        return true;
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        zzr().zzf().zza("Error deleting app launch break from local database", e);
                        this.zzb = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e2) {
                    zzr().zzf().zza("Error deleting app launch break from local database", e2);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            zzr().zzi().zza("Error deleting app launch break from local database in reasonable time");
            return false;
        }
        return false;
    }

    private static long zza(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                return cursor.getLong(0);
            }
            if (cursor != null) {
                cursor.close();
                return -1L;
            }
            return -1L;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private final SQLiteDatabase zzae() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase == null) {
            this.zzb = true;
            return null;
        }
        return writableDatabase;
    }

    private final boolean zzaf() {
        return zzn().getDatabasePath("google_app_measurement_local.db").exists();
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
