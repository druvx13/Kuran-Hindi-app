package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzx;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
/* loaded from: classes.dex */
public final class zzaa extends zzx.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzx zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(zzx zzxVar, String str, String str2, Context context, Bundle bundle) {
        super(zzxVar);
        this.zzg = zzxVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:3:0x0002, B:5:0x0019, B:7:0x002a, B:13:0x003f, B:15:0x0054, B:17:0x0060, B:19:0x006e, B:30:0x0083), top: B:35:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:3:0x0002, B:5:0x0019, B:7:0x002a, B:13:0x003f, B:15:0x0054, B:17:0x0060, B:19:0x006e, B:30:0x0083), top: B:35:0x0002 }] */
    @Override // com.google.android.gms.internal.measurement.zzx.zza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.measurement.zzx r2 = r14.zzg     // Catch: java.lang.Exception -> La0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> La0
            r3.<init>()     // Catch: java.lang.Exception -> La0
            com.google.android.gms.internal.measurement.zzx.zza(r2, r3)     // Catch: java.lang.Exception -> La0
            com.google.android.gms.internal.measurement.zzx r2 = r14.zzg     // Catch: java.lang.Exception -> La0
            java.lang.String r3 = r14.zzc     // Catch: java.lang.Exception -> La0
            java.lang.String r4 = r14.zzd     // Catch: java.lang.Exception -> La0
            boolean r2 = com.google.android.gms.internal.measurement.zzx.zza(r2, r3, r4)     // Catch: java.lang.Exception -> La0
            r3 = 0
            if (r2 == 0) goto L27
            java.lang.String r3 = r14.zzd     // Catch: java.lang.Exception -> La0
            java.lang.String r2 = r14.zzc     // Catch: java.lang.Exception -> La0
            com.google.android.gms.internal.measurement.zzx r4 = r14.zzg     // Catch: java.lang.Exception -> La0
            java.lang.String r4 = com.google.android.gms.internal.measurement.zzx.zzb(r4)     // Catch: java.lang.Exception -> La0
            r10 = r2
            r11 = r3
            r9 = r4
            goto L2a
        L27:
            r9 = r3
            r10 = r9
            r11 = r10
        L2a:
            android.content.Context r2 = r14.zze     // Catch: java.lang.Exception -> La0
            com.google.android.gms.internal.measurement.zzx.zzc(r2)     // Catch: java.lang.Exception -> La0
            java.lang.Boolean r2 = com.google.android.gms.internal.measurement.zzx.zzj()     // Catch: java.lang.Exception -> La0
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> La0
            if (r2 != 0) goto L3e
            if (r10 == 0) goto L3c
            goto L3e
        L3c:
            r2 = 0
            goto L3f
        L3e:
            r2 = 1
        L3f:
            com.google.android.gms.internal.measurement.zzx r3 = r14.zzg     // Catch: java.lang.Exception -> La0
            com.google.android.gms.internal.measurement.zzx r4 = r14.zzg     // Catch: java.lang.Exception -> La0
            android.content.Context r5 = r14.zze     // Catch: java.lang.Exception -> La0
            com.google.android.gms.internal.measurement.zzm r4 = r4.zza(r5, r2)     // Catch: java.lang.Exception -> La0
            com.google.android.gms.internal.measurement.zzx.zza(r3, r4)     // Catch: java.lang.Exception -> La0
            com.google.android.gms.internal.measurement.zzx r3 = r14.zzg     // Catch: java.lang.Exception -> La0
            com.google.android.gms.internal.measurement.zzm r3 = com.google.android.gms.internal.measurement.zzx.zzc(r3)     // Catch: java.lang.Exception -> La0
            if (r3 != 0) goto L60
            com.google.android.gms.internal.measurement.zzx r2 = r14.zzg     // Catch: java.lang.Exception -> La0
            java.lang.String r2 = com.google.android.gms.internal.measurement.zzx.zzb(r2)     // Catch: java.lang.Exception -> La0
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r2, r3)     // Catch: java.lang.Exception -> La0
            return
        L60:
            android.content.Context r3 = r14.zze     // Catch: java.lang.Exception -> La0
            int r3 = com.google.android.gms.internal.measurement.zzx.zzd(r3)     // Catch: java.lang.Exception -> La0
            android.content.Context r4 = r14.zze     // Catch: java.lang.Exception -> La0
            int r4 = com.google.android.gms.internal.measurement.zzx.zze(r4)     // Catch: java.lang.Exception -> La0
            if (r2 == 0) goto L79
            int r2 = java.lang.Math.max(r3, r4)     // Catch: java.lang.Exception -> La0
            if (r4 >= r3) goto L76
            r3 = 1
            goto L77
        L76:
            r3 = 0
        L77:
            r8 = r3
            goto L83
        L79:
            if (r3 <= 0) goto L7c
            r4 = r3
        L7c:
            if (r3 <= 0) goto L80
            r2 = 1
            goto L81
        L80:
            r2 = 0
        L81:
            r8 = r2
            r2 = r4
        L83:
            com.google.android.gms.internal.measurement.zzv r13 = new com.google.android.gms.internal.measurement.zzv     // Catch: java.lang.Exception -> La0
            r4 = 25001(0x61a9, double:1.2352E-319)
            long r6 = (long) r2     // Catch: java.lang.Exception -> La0
            android.os.Bundle r12 = r14.zzf     // Catch: java.lang.Exception -> La0
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> La0
            com.google.android.gms.internal.measurement.zzx r2 = r14.zzg     // Catch: java.lang.Exception -> La0
            com.google.android.gms.internal.measurement.zzm r2 = com.google.android.gms.internal.measurement.zzx.zzc(r2)     // Catch: java.lang.Exception -> La0
            android.content.Context r3 = r14.zze     // Catch: java.lang.Exception -> La0
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: java.lang.Exception -> La0
            long r4 = r14.zza     // Catch: java.lang.Exception -> La0
            r2.initialize(r3, r13, r4)     // Catch: java.lang.Exception -> La0
            return
        La0:
            r2 = move-exception
            com.google.android.gms.internal.measurement.zzx r3 = r14.zzg
            com.google.android.gms.internal.measurement.zzx.zza(r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzaa.zza():void");
    }
}
