package com.google.firebase.iid;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-iid@@20.0.2 */
/* loaded from: classes.dex */
public final class zzax {
    private int zza = 0;
    private final Map<Integer, TaskCompletionSource<Void>> zzb = new ArrayMap();
    private final zzat zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzax(zzat zzatVar) {
        this.zzc = zzatVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Task<Void> zza(String str) {
        String zza;
        TaskCompletionSource<Void> taskCompletionSource;
        synchronized (this.zzc) {
            zza = this.zzc.zza();
            zzat zzatVar = this.zzc;
            StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 1 + String.valueOf(str).length());
            sb.append(zza);
            sb.append(",");
            sb.append(str);
            zzatVar.zza(sb.toString());
        }
        taskCompletionSource = new TaskCompletionSource<>();
        this.zzb.put(Integer.valueOf(this.zza + (TextUtils.isEmpty(zza) ? 0 : zza.split(",").length - 1)), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zza() {
        return zzb() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (com.google.firebase.iid.FirebaseInstanceId.zzd() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        android.util.Log.d("FirebaseInstanceId", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.firebase.iid.FirebaseInstanceId r5) throws java.io.IOException {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            java.lang.String r0 = r4.zzb()     // Catch: java.lang.Throwable -> L42
            r1 = 1
            if (r0 != 0) goto L17
            boolean r5 = com.google.firebase.iid.FirebaseInstanceId.zzd()     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L15
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r0 = "topic sync succeeded"
            android.util.Log.d(r5, r0)     // Catch: java.lang.Throwable -> L42
        L15:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            return r1
        L17:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            boolean r2 = zza(r5, r0)
            if (r2 != 0) goto L20
            r5 = 0
            return r5
        L20:
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> r2 = r4.zzb     // Catch: java.lang.Throwable -> L3f
            int r3 = r4.zza     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r2 = r2.remove(r3)     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.tasks.TaskCompletionSource r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2     // Catch: java.lang.Throwable -> L3f
            r4.zzb(r0)     // Catch: java.lang.Throwable -> L3f
            int r0 = r4.zza     // Catch: java.lang.Throwable -> L3f
            int r0 = r0 + r1
            r4.zza = r0     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L0
            r0 = 0
            r2.setResult(r0)
            goto L0
        L3f:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            throw r5
        L42:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            goto L46
        L45:
            throw r5
        L46:
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzax.zza(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }

    private final String zzb() {
        String zza;
        synchronized (this.zzc) {
            zza = this.zzc.zza();
        }
        if (TextUtils.isEmpty(zza)) {
            return null;
        }
        String[] split = zza.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }

    private final synchronized boolean zzb(String str) {
        synchronized (this.zzc) {
            String zza = this.zzc.zza();
            String valueOf = String.valueOf(str);
            if (zza.startsWith(valueOf.length() != 0 ? ",".concat(valueOf) : new String(","))) {
                String valueOf2 = String.valueOf(str);
                this.zzc.zza(zza.substring((valueOf2.length() != 0 ? ",".concat(valueOf2) : new String(",")).length()));
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r4 == 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        r7.zzc(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (com.google.firebase.iid.FirebaseInstanceId.zzd() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        android.util.Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean zza(com.google.firebase.iid.FirebaseInstanceId r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r1 = "!"
            java.lang.String[] r8 = r8.split(r1)
            int r1 = r8.length
            r2 = 1
            r3 = 2
            if (r1 != r3) goto La5
            r1 = 0
            r3 = r8[r1]
            r8 = r8[r2]
            r4 = -1
            int r5 = r3.hashCode()     // Catch: java.io.IOException -> L56
            r6 = 83
            if (r5 == r6) goto L2a
            r6 = 85
            if (r5 == r6) goto L20
            goto L33
        L20:
            java.lang.String r5 = "U"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L56
            if (r3 == 0) goto L33
            r4 = 1
            goto L33
        L2a:
            java.lang.String r5 = "S"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L56
            if (r3 == 0) goto L33
            r4 = 0
        L33:
            if (r4 == 0) goto L47
            if (r4 == r2) goto L38
            goto La5
        L38:
            r7.zzc(r8)     // Catch: java.io.IOException -> L56
            boolean r7 = com.google.firebase.iid.FirebaseInstanceId.zzd()     // Catch: java.io.IOException -> L56
            if (r7 == 0) goto La5
            java.lang.String r7 = "unsubscribe operation succeeded"
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L56
            goto La5
        L47:
            r7.zzb(r8)     // Catch: java.io.IOException -> L56
            boolean r7 = com.google.firebase.iid.FirebaseInstanceId.zzd()     // Catch: java.io.IOException -> L56
            if (r7 == 0) goto La5
            java.lang.String r7 = "subscribe operation succeeded"
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L56
            goto La5
        L56:
            r7 = move-exception
            java.lang.String r8 = r7.getMessage()
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L7d
            java.lang.String r8 = r7.getMessage()
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L70
            goto L7d
        L70:
            java.lang.String r8 = r7.getMessage()
            if (r8 != 0) goto L7c
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r0, r7)
            return r1
        L7c:
            throw r7
        L7d:
            java.lang.String r7 = r7.getMessage()
            java.lang.String r8 = java.lang.String.valueOf(r7)
            int r8 = r8.length()
            int r8 = r8 + 53
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            java.lang.String r8 = "Topic operation failed: "
            r2.append(r8)
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.e(r0, r7)
            return r1
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzax.zza(com.google.firebase.iid.FirebaseInstanceId, java.lang.String):boolean");
    }
}
