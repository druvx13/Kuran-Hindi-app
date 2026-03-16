package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbj;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
public final class zzac extends zzkp {
    private static final String[] zzb = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzc = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzd = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    private static final String[] zze = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zzf = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzad zzj;
    private final zzkl zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(zzks zzksVar) {
        super(zzksVar);
        this.zzk = new zzkl(zzm());
        this.zzj = new zzad(this, zzn(), "google_app_measurement.db");
    }

    @Override // com.google.android.gms.measurement.internal.zzkp
    protected final boolean zze() {
        return false;
    }

    public final void zzf() {
        zzak();
        c_().beginTransaction();
    }

    public final void b_() {
        zzak();
        c_().setTransactionSuccessful();
    }

    public final void zzh() {
        zzak();
        c_().endTransaction();
    }

    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = c_().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                zzr().zzf().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zza(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = c_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzr().zzf().zza("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase c_() {
        zzd();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e) {
            zzr().zzi().zza("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzaj zza(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzaj");
    }

    public final void zza(zzaj zzajVar) {
        Preconditions.checkNotNull(zzajVar);
        zzd();
        zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzajVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzajVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzajVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzajVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzajVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzajVar.zzg));
        contentValues.put("last_bundled_day", zzajVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzajVar.zzi);
        contentValues.put("last_sampling_rate", zzajVar.zzj);
        if (zzt().zze(zzajVar.zza, zzap.zzbn)) {
            contentValues.put("current_session_count", Long.valueOf(zzajVar.zze));
        }
        contentValues.put("last_exempt_from_sampling", (zzajVar.zzk == null || !zzajVar.zzk.booleanValue()) ? null : 1L);
        try {
            if (c_().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert/update event aggregates (got -1). appId", zzfj.zza(zzajVar.zza));
            }
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing event aggregates. appId", zzfj.zza(zzajVar.zza), e);
        }
    }

    public final void zzb(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzd();
        zzak();
        try {
            int delete = c_().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
            if (com.google.android.gms.internal.measurement.zzkz.zzb() && this.zza.zzb().zze(str, zzap.zzcy)) {
                return;
            }
            zzr().zzx().zza("Deleted user attribute rows", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            if (com.google.android.gms.internal.measurement.zzkz.zzb() && this.zza.zzb().zze(str, zzap.zzcy)) {
                zzr().zzf().zza("Error deleting user property. appId", zzfj.zza(str), zzo().zzc(str2), e);
            } else {
                zzr().zzf().zza("Error deleting user attribute. appId", zzfj.zza(str), zzo().zzc(str2), e);
            }
        }
    }

    public final boolean zza(zzlb zzlbVar) {
        Preconditions.checkNotNull(zzlbVar);
        zzd();
        zzak();
        if (zzc(zzlbVar.zza, zzlbVar.zzc) == null) {
            if (zzla.zza(zzlbVar.zzc)) {
                if (zzb("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzlbVar.zza}) >= zzt().zzc(zzlbVar.zza)) {
                    return false;
                }
            } else if (zzt().zze(zzlbVar.zza, zzap.zzbd)) {
                if (!"_npa".equals(zzlbVar.zzc) && zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzlbVar.zza, zzlbVar.zzb}) >= 25) {
                    return false;
                }
            } else if (zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzlbVar.zza, zzlbVar.zzb}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzlbVar.zza);
        contentValues.put("origin", zzlbVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzlbVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzlbVar.zzd));
        zza(contentValues, "value", zzlbVar.zze);
        try {
            if (c_().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert/update user property (got -1). appId", zzfj.zza(zzlbVar.zza));
            }
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing user property. appId", zzfj.zza(zzlbVar.zza), e);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzlb zzc(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r19)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            r18.zzd()
            r18.zzak()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.c_()     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r11 = "user_attributes"
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r0 = "set_timestamp"
            r1 = 0
            r12[r1] = r0     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r0 = "value"
            r2 = 1
            r12[r2] = r0     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r0 = "origin"
            r3 = 2
            r12[r3] = r0     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r13 = "app_id=? and name=?"
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            r14[r1] = r19     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            r14[r2] = r8     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            boolean r0 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7f
            if (r0 != 0) goto L44
            if (r10 == 0) goto L43
            r10.close()
        L43:
            return r9
        L44:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7f
            r11 = r18
            java.lang.Object r7 = r11.zza(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            java.lang.String r3 = r10.getString(r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.zzlb r0 = new com.google.android.gms.measurement.internal.zzlb     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            if (r1 == 0) goto L73
            com.google.android.gms.measurement.internal.zzfj r1 = r18.zzr()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.zzfl r1 = r1.zzf()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfj.zza(r19)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            r1.zza(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
        L73:
            if (r10 == 0) goto L78
            r10.close()
        L78:
            return r0
        L79:
            r0 = move-exception
            goto L8b
        L7b:
            r0 = move-exception
            r11 = r18
            goto Lab
        L7f:
            r0 = move-exception
            r11 = r18
            goto L8b
        L83:
            r0 = move-exception
            r11 = r18
            goto Lac
        L87:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L8b:
            com.google.android.gms.measurement.internal.zzfj r1 = r18.zzr()     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.zzfl r1 = r1.zzf()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzfj.zza(r19)     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.zzfh r4 = r18.zzo()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r4 = r4.zzc(r8)     // Catch: java.lang.Throwable -> Laa
            r1.zza(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Laa
            if (r10 == 0) goto La9
            r10.close()
        La9:
            return r9
        Laa:
            r0 = move-exception
        Lab:
            r9 = r10
        Lac:
            if (r9 == 0) goto Lb1
            r9.close()
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zzc(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzlb");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzlb> zza(java.lang.String r23) {
        /*
            r22 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23)
            r22.zzd()
            r22.zzak()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r22.c_()     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            r6[r11] = r23     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            if (r3 != 0) goto L48
            if (r2 == 0) goto L47
            r2.close()
        L47:
            return r0
        L48:
            java.lang.String r18 = r2.getString(r11)     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            java.lang.String r3 = r2.getString(r12)     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            if (r3 != 0) goto L54
            java.lang.String r3 = ""
        L54:
            r17 = r3
            long r19 = r2.getLong(r13)     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            r3 = r22
            java.lang.Object r21 = r3.zza(r2, r14)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            if (r21 != 0) goto L74
            com.google.android.gms.measurement.internal.zzfj r4 = r22.zzr()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            com.google.android.gms.measurement.internal.zzfl r4 = r4.zzf()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            java.lang.String r5 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzfj.zza(r23)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            r4.zza(r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            goto L7f
        L74:
            com.google.android.gms.measurement.internal.zzlb r4 = new com.google.android.gms.measurement.internal.zzlb     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            r15 = r4
            r16 = r23
            r15.<init>(r16, r17, r18, r19, r21)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            r0.add(r4)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
        L7f:
            boolean r4 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            if (r4 != 0) goto L48
            if (r2 == 0) goto L8a
            r2.close()
        L8a:
            return r0
        L8b:
            r0 = move-exception
            goto L9d
        L8d:
            r0 = move-exception
            r3 = r22
            goto Lb5
        L91:
            r0 = move-exception
            r3 = r22
            goto L9d
        L95:
            r0 = move-exception
            r3 = r22
            goto Lb6
        L99:
            r0 = move-exception
            r3 = r22
            r2 = r1
        L9d:
            com.google.android.gms.measurement.internal.zzfj r4 = r22.zzr()     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.measurement.internal.zzfl r4 = r4.zzf()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = "Error querying user properties. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzfj.zza(r23)     // Catch: java.lang.Throwable -> Lb4
            r4.zza(r5, r6, r0)     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto Lb3
            r2.close()
        Lb3:
            return r1
        Lb4:
            r0 = move-exception
        Lb5:
            r1 = r2
        Lb6:
            if (r1 == 0) goto Lbb
            r1.close()
        Lbb:
            goto Lbd
        Lbc:
            throw r0
        Lbd:
            goto Lbc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
        zzr().zzf().zza("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzlb> zza(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean zza(zzv zzvVar) {
        Preconditions.checkNotNull(zzvVar);
        zzd();
        zzak();
        if (zzc(zzvVar.zza, zzvVar.zzc.zza) != null || zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzvVar.zza}) < 1000) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzvVar.zza);
            contentValues.put("origin", zzvVar.zzb);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzvVar.zzc.zza);
            zza(contentValues, "value", zzvVar.zzc.zza());
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzvVar.zze));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzvVar.zzf);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzvVar.zzh));
            zzp();
            contentValues.put("timed_out_event", zzla.zza((Parcelable) zzvVar.zzg));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzvVar.zzd));
            zzp();
            contentValues.put("triggered_event", zzla.zza((Parcelable) zzvVar.zzi));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzvVar.zzc.zzb));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzvVar.zzj));
            zzp();
            contentValues.put("expired_event", zzla.zza((Parcelable) zzvVar.zzk));
            try {
                if (c_().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                    zzr().zzf().zza("Failed to insert/update conditional user property (got -1)", zzfj.zza(zzvVar.zza));
                }
            } catch (SQLiteException e) {
                zzr().zzf().zza("Error storing conditional user property", zzfj.zza(zzvVar.zza), e);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzv zzd(java.lang.String r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zzd(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzv");
    }

    public final int zze(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzd();
        zzak();
        try {
            return c_().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error deleting conditional property", zzfj.zza(str), zzo().zzc(str2), e);
            return 0;
        }
    }

    public final List<zzv> zzb(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzd();
        zzak();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return zza(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
        zzr().zzf().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzv> zza(java.lang.String r40, java.lang.String[] r41) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0196 A[Catch: SQLiteException -> 0x0277, all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:11:0x00ea, B:13:0x0147, B:18:0x0151, B:22:0x019b, B:24:0x01ce, B:28:0x01dd, B:27:0x01d9, B:29:0x01e0, B:31:0x01e8, B:36:0x01f2, B:38:0x01fd, B:41:0x0204, B:45:0x021f, B:47:0x022a, B:48:0x023c, B:50:0x0242, B:52:0x024e, B:53:0x0257, B:55:0x0260, B:44:0x021b, B:21:0x0196, B:69:0x0289), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ce A[Catch: SQLiteException -> 0x0277, all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:11:0x00ea, B:13:0x0147, B:18:0x0151, B:22:0x019b, B:24:0x01ce, B:28:0x01dd, B:27:0x01d9, B:29:0x01e0, B:31:0x01e8, B:36:0x01f2, B:38:0x01fd, B:41:0x0204, B:45:0x021f, B:47:0x022a, B:48:0x023c, B:50:0x0242, B:52:0x024e, B:53:0x0257, B:55:0x0260, B:44:0x021b, B:21:0x0196, B:69:0x0289), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01fd A[Catch: SQLiteException -> 0x0277, all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:11:0x00ea, B:13:0x0147, B:18:0x0151, B:22:0x019b, B:24:0x01ce, B:28:0x01dd, B:27:0x01d9, B:29:0x01e0, B:31:0x01e8, B:36:0x01f2, B:38:0x01fd, B:41:0x0204, B:45:0x021f, B:47:0x022a, B:48:0x023c, B:50:0x0242, B:52:0x024e, B:53:0x0257, B:55:0x0260, B:44:0x021b, B:21:0x0196, B:69:0x0289), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x021b A[Catch: SQLiteException -> 0x0277, all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:11:0x00ea, B:13:0x0147, B:18:0x0151, B:22:0x019b, B:24:0x01ce, B:28:0x01dd, B:27:0x01d9, B:29:0x01e0, B:31:0x01e8, B:36:0x01f2, B:38:0x01fd, B:41:0x0204, B:45:0x021f, B:47:0x022a, B:48:0x023c, B:50:0x0242, B:52:0x024e, B:53:0x0257, B:55:0x0260, B:44:0x021b, B:21:0x0196, B:69:0x0289), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x022a A[Catch: SQLiteException -> 0x0277, all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:11:0x00ea, B:13:0x0147, B:18:0x0151, B:22:0x019b, B:24:0x01ce, B:28:0x01dd, B:27:0x01d9, B:29:0x01e0, B:31:0x01e8, B:36:0x01f2, B:38:0x01fd, B:41:0x0204, B:45:0x021f, B:47:0x022a, B:48:0x023c, B:50:0x0242, B:52:0x024e, B:53:0x0257, B:55:0x0260, B:44:0x021b, B:21:0x0196, B:69:0x0289), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0242 A[Catch: SQLiteException -> 0x0277, all -> 0x02a0, TryCatch #0 {all -> 0x02a0, blocks: (B:11:0x00ea, B:13:0x0147, B:18:0x0151, B:22:0x019b, B:24:0x01ce, B:28:0x01dd, B:27:0x01d9, B:29:0x01e0, B:31:0x01e8, B:36:0x01f2, B:38:0x01fd, B:41:0x0204, B:45:0x021f, B:47:0x022a, B:48:0x023c, B:50:0x0242, B:52:0x024e, B:53:0x0257, B:55:0x0260, B:44:0x021b, B:21:0x0196, B:69:0x0289), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0260 A[Catch: SQLiteException -> 0x0277, all -> 0x02a0, TRY_LEAVE, TryCatch #0 {all -> 0x02a0, blocks: (B:11:0x00ea, B:13:0x0147, B:18:0x0151, B:22:0x019b, B:24:0x01ce, B:28:0x01dd, B:27:0x01d9, B:29:0x01e0, B:31:0x01e8, B:36:0x01f2, B:38:0x01fd, B:41:0x0204, B:45:0x021f, B:47:0x022a, B:48:0x023c, B:50:0x0242, B:52:0x024e, B:53:0x0257, B:55:0x0260, B:44:0x021b, B:21:0x0196, B:69:0x0289), top: B:78:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzg zzb(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zzb(java.lang.String):com.google.android.gms.measurement.internal.zzg");
    }

    public final void zza(zzg zzgVar) {
        Preconditions.checkNotNull(zzgVar);
        zzd();
        zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzgVar.zzc());
        contentValues.put("app_instance_id", zzgVar.zzd());
        contentValues.put("gmp_app_id", zzgVar.zze());
        contentValues.put("resettable_device_id_hash", zzgVar.zzh());
        contentValues.put("last_bundle_index", Long.valueOf(zzgVar.zzs()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzgVar.zzj()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzgVar.zzk()));
        contentValues.put("app_version", zzgVar.zzl());
        contentValues.put("app_store", zzgVar.zzn());
        contentValues.put("gmp_version", Long.valueOf(zzgVar.zzo()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzgVar.zzp()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzgVar.zzr()));
        contentValues.put("day", Long.valueOf(zzgVar.zzw()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzgVar.zzx()));
        contentValues.put("daily_events_count", Long.valueOf(zzgVar.zzy()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzgVar.zzz()));
        contentValues.put("config_fetched_time", Long.valueOf(zzgVar.zzt()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzgVar.zzu()));
        contentValues.put("app_version_int", Long.valueOf(zzgVar.zzm()));
        contentValues.put("firebase_instance_id", zzgVar.zzi());
        contentValues.put("daily_error_events_count", Long.valueOf(zzgVar.zzab()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzgVar.zzaa()));
        contentValues.put("health_monitor_sample", zzgVar.zzac());
        contentValues.put("android_id", Long.valueOf(zzgVar.zzae()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzgVar.zzaf()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(zzgVar.zzag()));
        contentValues.put("admob_app_id", zzgVar.zzf());
        contentValues.put("dynamite_version", Long.valueOf(zzgVar.zzq()));
        if (zzgVar.zzai() != null) {
            if (zzgVar.zzai().size() == 0) {
                zzr().zzi().zza("Safelisted events should not be an empty list. appId", zzgVar.zzc());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzgVar.zzai()));
            }
        }
        if (zzll.zzb() && zzt().zze(zzgVar.zzc(), zzap.zzch)) {
            contentValues.put("ga_app_id", zzgVar.zzg());
        }
        try {
            SQLiteDatabase c_ = c_();
            if (c_.update("apps", contentValues, "app_id = ?", new String[]{zzgVar.zzc()}) == 0 && c_.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert/update app (got -1). appId", zzfj.zza(zzgVar.zzc()));
            }
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing app. appId", zzfj.zza(zzgVar.zzc()), e);
        }
    }

    public final long zzc(String str) {
        Preconditions.checkNotEmpty(str);
        zzd();
        zzak();
        try {
            return c_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, zzt().zzb(str, zzap.zzo))))});
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error deleting over the limit events. appId", zzfj.zza(str), e);
            return 0L;
        }
    }

    public final zzab zza(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return zza(j, str, 1L, false, false, z3, false, z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzab zza(long r22, java.lang.String r24, long r25, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.zzab");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] zzd(java.lang.String r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            r11.zzd()
            r11.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.c_()     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            java.lang.String r2 = "apps"
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            java.lang.String r5 = "remote_config"
            r9 = 0
            r4[r9] = r5     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            r6[r9] = r12     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            r7 = 0
            r8 = 0
            r10 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            if (r2 != 0) goto L37
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            if (r3 == 0) goto L52
            com.google.android.gms.measurement.internal.zzfj r3 = r11.zzr()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzfl r3 = r3.zzf()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzfj.zza(r12)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            r3.zza(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
        L52:
            if (r1 == 0) goto L57
            r1.close()
        L57:
            return r2
        L58:
            r2 = move-exception
            goto L5e
        L5a:
            r12 = move-exception
            goto L77
        L5c:
            r2 = move-exception
            r1 = r0
        L5e:
            com.google.android.gms.measurement.internal.zzfj r3 = r11.zzr()     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzfl r3 = r3.zzf()     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzfj.zza(r12)     // Catch: java.lang.Throwable -> L75
            r3.zza(r4, r12, r2)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L74
            r1.close()
        L74:
            return r0
        L75:
            r12 = move-exception
            r0 = r1
        L77:
            if (r0 == 0) goto L7c
            r0.close()
        L7c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zzd(java.lang.String):byte[]");
    }

    public final boolean zza(zzbr.zzg zzgVar, boolean z) {
        zzd();
        zzak();
        Preconditions.checkNotNull(zzgVar);
        Preconditions.checkNotEmpty(zzgVar.zzx());
        Preconditions.checkState(zzgVar.zzk());
        zzv();
        long currentTimeMillis = zzm().currentTimeMillis();
        if (zzgVar.zzl() < currentTimeMillis - zzx.zzk() || zzgVar.zzl() > zzx.zzk() + currentTimeMillis) {
            zzr().zzi().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzfj.zza(zzgVar.zzx()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgVar.zzl()));
        }
        try {
            byte[] zzc2 = zzg().zzc(zzgVar.zzbi());
            zzr().zzx().zza("Saving bundle, size", Integer.valueOf(zzc2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzgVar.zzx());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzgVar.zzl()));
            contentValues.put("data", zzc2);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzgVar.zzaz()) {
                contentValues.put("retry_count", Integer.valueOf(zzgVar.zzba()));
            }
            try {
                if (c_().insert("queue", null, contentValues) == -1) {
                    zzr().zzf().zza("Failed to insert bundle (got -1). appId", zzfj.zza(zzgVar.zzx()));
                    return false;
                }
                return true;
            } catch (SQLiteException e) {
                zzr().zzf().zza("Error storing bundle. appId", zzfj.zza(zzgVar.zzx()), e);
                return false;
            }
        } catch (IOException e2) {
            zzr().zzf().zza("Data loss. Failed to serialize bundle. appId", zzfj.zza(zzgVar.zzx()), e2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d_() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.c_()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L29
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r2 == 0) goto L1c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            return r1
        L1c:
            if (r0 == 0) goto L21
            r0.close()
        L21:
            return r1
        L22:
            r2 = move-exception
            goto L2b
        L24:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3f
        L29:
            r2 = move-exception
            r0 = r1
        L2b:
            com.google.android.gms.measurement.internal.zzfj r3 = r6.zzr()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.zzfl r3 = r3.zzf()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zza(r4, r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3d
            r0.close()
        L3d:
            return r1
        L3e:
            r1 = move-exception
        L3f:
            if (r0 == 0) goto L44
            r0.close()
        L44:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.d_():java.lang.String");
    }

    public final boolean zzk() {
        return zzb("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final List<Pair<zzbr.zzg, Long>> zza(String str, int i, int i2) {
        byte[] zzb2;
        zzd();
        zzak();
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = c_().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!query.moveToFirst()) {
                    List<Pair<zzbr.zzg, Long>> emptyList = Collections.emptyList();
                    if (query != null) {
                        query.close();
                    }
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                do {
                    long j = query.getLong(0);
                    try {
                        zzb2 = zzg().zzb(query.getBlob(1));
                    } catch (IOException e) {
                        zzr().zzf().zza("Failed to unzip queued bundle. appId", zzfj.zza(str), e);
                    }
                    if (!arrayList.isEmpty() && zzb2.length + i3 > i2) {
                        break;
                    }
                    try {
                        zzbr.zzg.zza zzaVar = (zzbr.zzg.zza) zzkw.zza(zzbr.zzg.zzbf(), zzb2);
                        if (!query.isNull(2)) {
                            zzaVar.zzi(query.getInt(2));
                        }
                        i3 += zzb2.length;
                        arrayList.add(Pair.create((zzbr.zzg) ((com.google.android.gms.internal.measurement.zzfd) zzaVar.zzu()), Long.valueOf(j)));
                    } catch (IOException e2) {
                        zzr().zzf().zza("Failed to merge queued bundle. appId", zzfj.zza(str), e2);
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } while (i3 <= i2);
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e3) {
                zzr().zzf().zza("Error querying bundles. appId", zzfj.zza(str), e3);
                List<Pair<zzbr.zzg, Long>> emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzv() {
        int delete;
        zzd();
        zzak();
        if (zzam()) {
            long zza = zzs().zzf.zza();
            long elapsedRealtime = zzm().elapsedRealtime();
            if (Math.abs(elapsedRealtime - zza) > zzap.zzx.zza(null).longValue()) {
                zzs().zzf.zza(elapsedRealtime);
                zzd();
                zzak();
                if (!zzam() || (delete = c_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzm().currentTimeMillis()), String.valueOf(zzx.zzk())})) <= 0) {
                    return;
                }
                zzr().zzx().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(List<Long> list) {
        zzd();
        zzak();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzam()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zzb(sb3.toString(), (String[]) null) > 0) {
                zzr().zzi().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase c_ = c_();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                c_.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                zzr().zzf().zza("Error incrementing retry count. error", e);
            }
        }
    }

    private final boolean zza(String str, int i, zzbj.zzb zzbVar) {
        zzak();
        zzd();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbVar);
        if (TextUtils.isEmpty(zzbVar.zzc())) {
            zzr().zzi().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzfj.zza(str), Integer.valueOf(i), String.valueOf(zzbVar.zza() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] zzbi = zzbVar.zzbi();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzbVar.zza() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzc());
        if (zzt().zze(str, zzap.zzbm)) {
            contentValues.put("session_scoped", zzbVar.zzj() ? Boolean.valueOf(zzbVar.zzk()) : null);
        }
        contentValues.put("data", zzbi);
        try {
            if (c_().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert event filter (got -1). appId", zzfj.zza(str));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing event filter. appId", zzfj.zza(str), e);
            return false;
        }
    }

    private final boolean zza(String str, int i, zzbj.zze zzeVar) {
        zzak();
        zzd();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzeVar);
        if (TextUtils.isEmpty(zzeVar.zzc())) {
            zzr().zzi().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzfj.zza(str), Integer.valueOf(i), String.valueOf(zzeVar.zza() ? Integer.valueOf(zzeVar.zzb()) : null));
            return false;
        }
        byte[] zzbi = zzeVar.zzbi();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzeVar.zza() ? Integer.valueOf(zzeVar.zzb()) : null);
        contentValues.put("property_name", zzeVar.zzc());
        if (zzt().zze(str, zzap.zzbm)) {
            contentValues.put("session_scoped", zzeVar.zzg() ? Boolean.valueOf(zzeVar.zzh()) : null);
        }
        contentValues.put("data", zzbi);
        try {
            if (c_().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert property filter (got -1). appId", zzfj.zza(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing property filter. appId", zzfj.zza(str), e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zzb>> zzf(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.zzak()
            r12.zzd()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.c_()
            r9 = 0
            java.lang.String r2 = "event_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9e android.database.sqlite.SQLiteException -> La0
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch: java.lang.Throwable -> L9e android.database.sqlite.SQLiteException -> La0
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch: java.lang.Throwable -> L9e android.database.sqlite.SQLiteException -> La0
            java.lang.String r5 = "app_id=? AND event_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9e android.database.sqlite.SQLiteException -> La0
            r6[r10] = r13     // Catch: java.lang.Throwable -> L9e android.database.sqlite.SQLiteException -> La0
            r6[r11] = r14     // Catch: java.lang.Throwable -> L9e android.database.sqlite.SQLiteException -> La0
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9e android.database.sqlite.SQLiteException -> La0
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            if (r1 != 0) goto L48
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            if (r14 == 0) goto L47
            r14.close()
        L47:
            return r13
        L48:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            com.google.android.gms.internal.measurement.zzbj$zzb$zza r2 = com.google.android.gms.internal.measurement.zzbj.zzb.zzl()     // Catch: java.io.IOException -> L7e android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            com.google.android.gms.internal.measurement.zzgn r1 = com.google.android.gms.measurement.internal.zzkw.zza(r2, r1)     // Catch: java.io.IOException -> L7e android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            com.google.android.gms.internal.measurement.zzbj$zzb$zza r1 = (com.google.android.gms.internal.measurement.zzbj.zzb.zza) r1     // Catch: java.io.IOException -> L7e android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            com.google.android.gms.internal.measurement.zzgo r1 = r1.zzu()     // Catch: java.io.IOException -> L7e android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            com.google.android.gms.internal.measurement.zzfd r1 = (com.google.android.gms.internal.measurement.zzfd) r1     // Catch: java.io.IOException -> L7e android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            com.google.android.gms.internal.measurement.zzbj$zzb r1 = (com.google.android.gms.internal.measurement.zzbj.zzb) r1     // Catch: java.io.IOException -> L7e android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            if (r3 != 0) goto L7a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
        L7a:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            goto L90
        L7e:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzfj r2 = r12.zzr()     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            com.google.android.gms.measurement.internal.zzfl r2 = r2.zzf()     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfj.zza(r13)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            r2.zza(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
        L90:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            if (r1 != 0) goto L48
            if (r14 == 0) goto L9b
            r14.close()
        L9b:
            return r0
        L9c:
            r0 = move-exception
            goto La2
        L9e:
            r13 = move-exception
            goto Lbb
        La0:
            r0 = move-exception
            r14 = r9
        La2:
            com.google.android.gms.measurement.internal.zzfj r1 = r12.zzr()     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.measurement.internal.zzfl r1 = r1.zzf()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzfj.zza(r13)     // Catch: java.lang.Throwable -> Lb9
            r1.zza(r2, r13, r0)     // Catch: java.lang.Throwable -> Lb9
            if (r14 == 0) goto Lb8
            r14.close()
        Lb8:
            return r9
        Lb9:
            r13 = move-exception
            r9 = r14
        Lbb:
            if (r9 == 0) goto Lc0
            r9.close()
        Lc0:
            goto Lc2
        Lc1:
            throw r13
        Lc2:
            goto Lc1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zzf(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<zzbj.zzb>> zze(String str) {
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = c_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzbj.zzb>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        zzbj.zzb zzbVar = (zzbj.zzb) ((com.google.android.gms.internal.measurement.zzfd) ((zzbj.zzb.zza) zzkw.zza(zzbj.zzb.zzl(), query.getBlob(1))).zzu());
                        if (zzbVar.zzf()) {
                            int i = query.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), list);
                            }
                            list.add(zzbVar);
                        }
                    } catch (IOException e) {
                        zzr().zzf().zza("Failed to merge filter. appId", zzfj.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            zzr().zzf().zza("Database error querying filters. appId", zzfj.zza(str), e2);
            Map<Integer, List<zzbj.zzb>> emptyMap2 = Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            return emptyMap2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zze>> zzg(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.zzak()
            r12.zzd()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.c_()
            r9 = 0
            java.lang.String r2 = "property_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9e android.database.sqlite.SQLiteException -> La0
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch: java.lang.Throwable -> L9e android.database.sqlite.SQLiteException -> La0
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch: java.lang.Throwable -> L9e android.database.sqlite.SQLiteException -> La0
            java.lang.String r5 = "app_id=? AND property_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L9e android.database.sqlite.SQLiteException -> La0
            r6[r10] = r13     // Catch: java.lang.Throwable -> L9e android.database.sqlite.SQLiteException -> La0
            r6[r11] = r14     // Catch: java.lang.Throwable -> L9e android.database.sqlite.SQLiteException -> La0
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9e android.database.sqlite.SQLiteException -> La0
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            if (r1 != 0) goto L48
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            if (r14 == 0) goto L47
            r14.close()
        L47:
            return r13
        L48:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            com.google.android.gms.internal.measurement.zzbj$zze$zza r2 = com.google.android.gms.internal.measurement.zzbj.zze.zzi()     // Catch: java.io.IOException -> L7e android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            com.google.android.gms.internal.measurement.zzgn r1 = com.google.android.gms.measurement.internal.zzkw.zza(r2, r1)     // Catch: java.io.IOException -> L7e android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            com.google.android.gms.internal.measurement.zzbj$zze$zza r1 = (com.google.android.gms.internal.measurement.zzbj.zze.zza) r1     // Catch: java.io.IOException -> L7e android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            com.google.android.gms.internal.measurement.zzgo r1 = r1.zzu()     // Catch: java.io.IOException -> L7e android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            com.google.android.gms.internal.measurement.zzfd r1 = (com.google.android.gms.internal.measurement.zzfd) r1     // Catch: java.io.IOException -> L7e android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            com.google.android.gms.internal.measurement.zzbj$zze r1 = (com.google.android.gms.internal.measurement.zzbj.zze) r1     // Catch: java.io.IOException -> L7e android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            if (r3 != 0) goto L7a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
        L7a:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            goto L90
        L7e:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzfj r2 = r12.zzr()     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            com.google.android.gms.measurement.internal.zzfl r2 = r2.zzf()     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfj.zza(r13)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            r2.zza(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
        L90:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L9c java.lang.Throwable -> Lb9
            if (r1 != 0) goto L48
            if (r14 == 0) goto L9b
            r14.close()
        L9b:
            return r0
        L9c:
            r0 = move-exception
            goto La2
        L9e:
            r13 = move-exception
            goto Lbb
        La0:
            r0 = move-exception
            r14 = r9
        La2:
            com.google.android.gms.measurement.internal.zzfj r1 = r12.zzr()     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.measurement.internal.zzfl r1 = r1.zzf()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzfj.zza(r13)     // Catch: java.lang.Throwable -> Lb9
            r1.zza(r2, r13, r0)     // Catch: java.lang.Throwable -> Lb9
            if (r14 == 0) goto Lb8
            r14.close()
        Lb8:
            return r9
        Lb9:
            r13 = move-exception
            r9 = r14
        Lbb:
            if (r9 == 0) goto Lc0
            r9.close()
        Lc0:
            goto Lc2
        Lc1:
            throw r13
        Lc2:
            goto Lc1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zzg(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> zza(java.lang.String r14, java.util.List<java.lang.String> r15) {
        /*
            r13 = this;
            r13.zzak()
            r13.zzd()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r15)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L18
            return r0
        L18:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "app_id=? AND property_name in ("
            r1.append(r2)
            r2 = 0
            r3 = 0
        L24:
            int r4 = r15.size()
            if (r3 >= r4) goto L39
            if (r3 <= 0) goto L31
            java.lang.String r4 = ","
            r1.append(r4)
        L31:
            java.lang.String r4 = "?"
            r1.append(r4)
            int r3 = r3 + 1
            goto L24
        L39:
            java.lang.String r3 = ")"
            r1.append(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r15)
            r3.add(r2, r14)
            android.database.sqlite.SQLiteDatabase r4 = r13.c_()
            r15 = 0
            java.lang.String r5 = "property_filters"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.String r7 = "audience_id"
            r6[r2] = r7     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.String r7 = "filter_id"
            r12 = 1
            r6[r12] = r7     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            java.lang.Object[] r1 = r3.toArray(r1)     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            r8 = r1
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lae android.database.sqlite.SQLiteException -> Lb0
            boolean r3 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            if (r3 != 0) goto L79
            if (r1 == 0) goto L78
            r1.close()
        L78:
            return r0
        L79:
            int r3 = r1.getInt(r2)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            java.lang.Object r4 = r0.get(r4)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            java.util.List r4 = (java.util.List) r4     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            if (r4 != 0) goto L95
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            r0.put(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
        L95:
            int r3 = r1.getInt(r12)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            r4.add(r3)     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> Lac java.lang.Throwable -> Lc9
            if (r3 != 0) goto L79
            if (r1 == 0) goto Lab
            r1.close()
        Lab:
            return r0
        Lac:
            r0 = move-exception
            goto Lb2
        Lae:
            r14 = move-exception
            goto Lcb
        Lb0:
            r0 = move-exception
            r1 = r15
        Lb2:
            com.google.android.gms.measurement.internal.zzfj r2 = r13.zzr()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.measurement.internal.zzfl r2 = r2.zzf()     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r3 = "Database error querying filters. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzfj.zza(r14)     // Catch: java.lang.Throwable -> Lc9
            r2.zza(r3, r14, r0)     // Catch: java.lang.Throwable -> Lc9
            if (r1 == 0) goto Lc8
            r1.close()
        Lc8:
            return r15
        Lc9:
            r14 = move-exception
            r15 = r1
        Lcb:
            if (r15 == 0) goto Ld0
            r15.close()
        Ld0:
            goto Ld2
        Ld1:
            throw r14
        Ld2:
            goto Ld1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(java.lang.String, java.util.List):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> zzf(java.lang.String r8) {
        /*
            r7 = this;
            r7.zzak()
            r7.zzd()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.c_()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            r5 = 0
            r4[r5] = r8     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            r6 = 1
            r4[r6] = r8     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            boolean r3 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            if (r3 != 0) goto L32
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            if (r1 == 0) goto L31
            r1.close()
        L31:
            return r8
        L32:
            int r3 = r1.getInt(r5)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            java.lang.Object r4 = r0.get(r4)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            java.util.List r4 = (java.util.List) r4     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            if (r4 != 0) goto L4e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            r0.put(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
        L4e:
            int r3 = r1.getInt(r6)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            r4.add(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            if (r3 != 0) goto L32
            if (r1 == 0) goto L64
            r1.close()
        L64:
            return r0
        L65:
            r0 = move-exception
            goto L6b
        L67:
            r8 = move-exception
            goto L84
        L69:
            r0 = move-exception
            r1 = r2
        L6b:
            com.google.android.gms.measurement.internal.zzfj r3 = r7.zzr()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzfl r3 = r3.zzf()     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfj.zza(r8)     // Catch: java.lang.Throwable -> L82
            r3.zza(r4, r8, r0)     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L81
            r1.close()
        L81:
            return r2
        L82:
            r8 = move-exception
            r2 = r1
        L84:
            if (r2 == 0) goto L89
            r2.close()
        L89:
            goto L8b
        L8a:
            throw r8
        L8b:
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zzf(java.lang.String):java.util.Map");
    }

    private final boolean zzc(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzak();
        zzd();
        SQLiteDatabase c_ = c_();
        try {
            long zzb2 = zzb("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, zzt().zzb(str, zzap.zzae)));
            if (zzb2 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return c_.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            zzr().zzf().zza("Database error querying filters. appId", zzfj.zza(str), e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzbr.zzi> zzg(java.lang.String r12) {
        /*
            r11 = this;
            r11.zzak()
            r11.zzd()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.c_()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            java.lang.String r3 = "audience_id"
            r9 = 0
            r2[r9] = r3     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            java.lang.String r3 = "current_results"
            r10 = 1
            r2[r10] = r3     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            java.lang.String r3 = "app_id=?"
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r4[r9] = r12     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteException -> L83
            boolean r1 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            if (r1 != 0) goto L36
            if (r0 == 0) goto L35
            r0.close()
        L35:
            return r8
        L36:
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            r1.<init>()     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
        L3b:
            int r2 = r0.getInt(r9)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            byte[] r3 = r0.getBlob(r10)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            com.google.android.gms.internal.measurement.zzbr$zzi$zza r4 = com.google.android.gms.internal.measurement.zzbr.zzi.zzi()     // Catch: java.io.IOException -> L5d android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            com.google.android.gms.internal.measurement.zzgn r3 = com.google.android.gms.measurement.internal.zzkw.zza(r4, r3)     // Catch: java.io.IOException -> L5d android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            com.google.android.gms.internal.measurement.zzbr$zzi$zza r3 = (com.google.android.gms.internal.measurement.zzbr.zzi.zza) r3     // Catch: java.io.IOException -> L5d android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            com.google.android.gms.internal.measurement.zzgo r3 = r3.zzu()     // Catch: java.io.IOException -> L5d android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            com.google.android.gms.internal.measurement.zzfd r3 = (com.google.android.gms.internal.measurement.zzfd) r3     // Catch: java.io.IOException -> L5d android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            com.google.android.gms.internal.measurement.zzbr$zzi r3 = (com.google.android.gms.internal.measurement.zzbr.zzi) r3     // Catch: java.io.IOException -> L5d android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            r1.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            goto L73
        L5d:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzfj r4 = r11.zzr()     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            com.google.android.gms.measurement.internal.zzfl r4 = r4.zzf()     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzfj.zza(r12)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            r4.zza(r5, r6, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
        L73:
            boolean r2 = r0.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L7f java.lang.Throwable -> L9c
            if (r2 != 0) goto L3b
            if (r0 == 0) goto L7e
            r0.close()
        L7e:
            return r1
        L7f:
            r1 = move-exception
            goto L85
        L81:
            r12 = move-exception
            goto L9e
        L83:
            r1 = move-exception
            r0 = r8
        L85:
            com.google.android.gms.measurement.internal.zzfj r2 = r11.zzr()     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.measurement.internal.zzfl r2 = r2.zzf()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzfj.zza(r12)     // Catch: java.lang.Throwable -> L9c
            r2.zza(r3, r12, r1)     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L9b
            r0.close()
        L9b:
            return r8
        L9c:
            r12 = move-exception
            r8 = r0
        L9e:
            if (r8 == 0) goto La3
            r8.close()
        La3:
            goto La5
        La4:
            throw r12
        La5:
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zzg(java.lang.String):java.util.Map");
    }

    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzr().zzf().zza("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type == 4) {
                        zzr().zzf().zza("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    zzr().zzf().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                    return null;
                }
                return cursor.getString(i);
            }
            return Double.valueOf(cursor.getDouble(i));
        } else {
            return Long.valueOf(cursor.getLong(i));
        }
    }

    public final long zzw() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzh(String str, String str2) {
        long zza;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzd();
        zzak();
        SQLiteDatabase c_ = c_();
        c_.beginTransaction();
        long j = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            try {
                try {
                    zza = zza(sb.toString(), new String[]{str}, -1L);
                    if (zza == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (c_.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            zzr().zzf().zza("Failed to insert column (got -1). appId", zzfj.zza(str), str2);
                            c_.endTransaction();
                            return -1L;
                        }
                        zza = 0;
                    }
                } catch (SQLiteException e) {
                    e = e;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + zza));
                    if (c_.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        zzr().zzf().zza("Failed to update column (got 0). appId", zzfj.zza(str), str2);
                        c_.endTransaction();
                        return -1L;
                    }
                    c_.setTransactionSuccessful();
                    c_.endTransaction();
                    return zza;
                } catch (SQLiteException e2) {
                    e = e2;
                    j = zza;
                    zzr().zzf().zza("Error inserting column. appId", zzfj.zza(str), str2, e);
                    c_.endTransaction();
                    return j;
                }
            } catch (Throwable th) {
                th = th;
                c_.endTransaction();
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final long zzx() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final long zza(zzbr.zzg zzgVar) throws IOException {
        zzd();
        zzak();
        Preconditions.checkNotNull(zzgVar);
        Preconditions.checkNotEmpty(zzgVar.zzx());
        byte[] zzbi = zzgVar.zzbi();
        long zza = zzg().zza(zzbi);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzgVar.zzx());
        contentValues.put("metadata_fingerprint", Long.valueOf(zza));
        contentValues.put("metadata", zzbi);
        try {
            c_().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return zza;
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing raw event metadata. appId", zzfj.zza(zzgVar.zzx()), e);
            throw e;
        }
    }

    public final boolean zzy() {
        return zzb("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzz() {
        return zzb("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final long zzh(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zza(long r5) {
        /*
            r4 = this;
            r4.zzd()
            r4.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.c_()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r1 != 0) goto L34
            com.google.android.gms.measurement.internal.zzfj r6 = r4.zzr()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.zzfl r6 = r6.zzx()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.zza(r1)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L33
            r5.close()
        L33:
            return r0
        L34:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L3d
            r5.close()
        L3d:
            return r6
        L3e:
            r6 = move-exception
            goto L44
        L40:
            r6 = move-exception
            goto L59
        L42:
            r6 = move-exception
            r5 = r0
        L44:
            com.google.android.gms.measurement.internal.zzfj r1 = r4.zzr()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.zzfl r1 = r1.zzf()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "Error selecting expired configs"
            r1.zza(r2, r6)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L56
            r5.close()
        L56:
            return r0
        L57:
            r6 = move-exception
            r0 = r5
        L59:
            if (r0 == 0) goto L5e
            r0.close()
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(long):java.lang.String");
    }

    public final long zzaa() {
        Cursor cursor = null;
        try {
            try {
                cursor = c_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1L;
                }
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzr().zzf().zza("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0091: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0091 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzbr.zzc, java.lang.Long> zza(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.zzd()
            r7.zzak()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.c_()     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r2 != 0) goto L37
            com.google.android.gms.measurement.internal.zzfj r8 = r7.zzr()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzfl r8 = r8.zzx()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            java.lang.String r9 = "Main event not found"
            r8.zza(r9)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzbr$zzc$zza r4 = com.google.android.gms.internal.measurement.zzbr.zzc.zzj()     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzgn r2 = com.google.android.gms.measurement.internal.zzkw.zza(r4, r2)     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzbr$zzc$zza r2 = (com.google.android.gms.internal.measurement.zzbr.zzc.zza) r2     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzgo r2 = r2.zzu()     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzfd r2 = (com.google.android.gms.internal.measurement.zzfd) r2     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzbr$zzc r2 = (com.google.android.gms.internal.measurement.zzbr.zzc) r2     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r1 == 0) goto L5e
            r1.close()
        L5e:
            return r8
        L5f:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzfj r3 = r7.zzr()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzfl r3 = r3.zzf()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzfj.zza(r8)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            r3.zza(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r1 == 0) goto L76
            r1.close()
        L76:
            return r0
        L77:
            r8 = move-exception
            goto L7d
        L79:
            r8 = move-exception
            goto L92
        L7b:
            r8 = move-exception
            r1 = r0
        L7d:
            com.google.android.gms.measurement.internal.zzfj r9 = r7.zzr()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzfl r9 = r9.zzf()     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "Error selecting main event"
            r9.zza(r2, r8)     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L8f
            r1.close()
        L8f:
            return r0
        L90:
            r8 = move-exception
            r0 = r1
        L92:
            if (r0 == 0) goto L97
            r0.close()
        L97:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzac.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final boolean zza(String str, Long l, long j, zzbr.zzc zzcVar) {
        zzd();
        zzak();
        Preconditions.checkNotNull(zzcVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] zzbi = zzcVar.zzbi();
        zzr().zzx().zza("Saving complex main event, appId, data size", zzo().zza(str), Integer.valueOf(zzbi.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzbi);
        try {
            if (c_().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert complex main event (got -1). appId", zzfj.zza(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing complex main event. appId", zzfj.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zzak zzakVar, long j, boolean z) {
        zzd();
        zzak();
        Preconditions.checkNotNull(zzakVar);
        Preconditions.checkNotEmpty(zzakVar.zza);
        zzbr.zzc.zza zzb2 = zzbr.zzc.zzj().zzb(zzakVar.zzd);
        Iterator<String> it = zzakVar.zze.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzbr.zze.zza zza = zzbr.zze.zzk().zza(next);
            zzg().zza(zza, zzakVar.zze.zza(next));
            zzb2.zza(zza);
        }
        byte[] zzbi = ((zzbr.zzc) ((com.google.android.gms.internal.measurement.zzfd) zzb2.zzu())).zzbi();
        if (!com.google.android.gms.internal.measurement.zzkz.zzb() || !zzt().zze(zzakVar.zza, zzap.zzcy)) {
            zzr().zzx().zza("Saving event, name, data size", zzo().zza(zzakVar.zzb), Integer.valueOf(zzbi.length));
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzakVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzakVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzakVar.zzc));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", zzbi);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (c_().insert("raw_events", null, contentValues) == -1) {
                zzr().zzf().zza("Failed to insert raw event (got -1). appId", zzfj.zza(zzakVar.zza));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error storing raw event. appId", zzfj.zza(zzakVar.zza), e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(String str, List<zzbj.zza> list) {
        boolean z;
        boolean z2;
        Preconditions.checkNotNull(list);
        for (int i = 0; i < list.size(); i++) {
            zzbj.zza.C0029zza zzbm = list.get(i).zzbm();
            if (zzbm.zzb() != 0) {
                for (int i2 = 0; i2 < zzbm.zzb(); i2++) {
                    zzbj.zzb.zza zzbm2 = zzbm.zzb(i2).zzbm();
                    zzbj.zzb.zza zzaVar = (zzbj.zzb.zza) ((zzfd.zzb) zzbm2.clone());
                    String zzb2 = zzhl.zzb(zzbm2.zza());
                    if (zzb2 != null) {
                        zzaVar.zza(zzb2);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < zzbm2.zzb(); i3++) {
                        zzbj.zzc zza = zzbm2.zza(i3);
                        String zza2 = zzho.zza(zza.zzh());
                        if (zza2 != null) {
                            zzaVar.zza(i3, (zzbj.zzc) ((com.google.android.gms.internal.measurement.zzfd) zza.zzbm().zza(zza2).zzu()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        zzbm = zzbm.zza(i2, zzaVar);
                        list.set(i, (zzbj.zza) ((com.google.android.gms.internal.measurement.zzfd) zzbm.zzu()));
                    }
                }
            }
            if (zzbm.zza() != 0) {
                for (int i4 = 0; i4 < zzbm.zza(); i4++) {
                    zzbj.zze zza3 = zzbm.zza(i4);
                    String zza4 = zzhn.zza(zza3.zzc());
                    if (zza4 != null) {
                        zzbm = zzbm.zza(i4, zza3.zzbm().zza(zza4));
                        list.set(i, (zzbj.zza) ((com.google.android.gms.internal.measurement.zzfd) zzbm.zzu()));
                    }
                }
            }
        }
        zzak();
        zzd();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase c_ = c_();
        c_.beginTransaction();
        try {
            zzak();
            zzd();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase c_2 = c_();
            c_2.delete("property_filters", "app_id=?", new String[]{str});
            c_2.delete("event_filters", "app_id=?", new String[]{str});
            for (zzbj.zza zzaVar2 : list) {
                zzak();
                zzd();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzaVar2);
                if (!zzaVar2.zza()) {
                    zzr().zzi().zza("Audience with no ID. appId", zzfj.zza(str));
                } else {
                    int zzb3 = zzaVar2.zzb();
                    Iterator<zzbj.zzb> it = zzaVar2.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zza()) {
                                zzr().zzi().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzfj.zza(str), Integer.valueOf(zzb3));
                                break;
                            }
                        } else {
                            Iterator<zzbj.zze> it2 = zzaVar2.zzc().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zza()) {
                                        zzr().zzi().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzfj.zza(str), Integer.valueOf(zzb3));
                                        break;
                                    }
                                } else {
                                    Iterator<zzbj.zzb> it3 = zzaVar2.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!zza(str, zzb3, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<zzbj.zze> it4 = zzaVar2.zzc().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!zza(str, zzb3, it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        zzak();
                                        zzd();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase c_3 = c_();
                                        c_3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zzb3)});
                                        c_3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zzb3)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzbj.zza zzaVar3 : list) {
                arrayList.add(zzaVar3.zza() ? Integer.valueOf(zzaVar3.zzb()) : null);
            }
            zzc(str, arrayList);
            c_.setTransactionSuccessful();
        } finally {
            c_.endTransaction();
        }
    }

    private final boolean zzam() {
        return zzn().getDatabasePath("google_app_measurement.db").exists();
    }
}
