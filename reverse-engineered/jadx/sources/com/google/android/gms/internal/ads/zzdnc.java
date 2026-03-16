package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdnc {
    private final SharedPreferences zzcip;
    private final File zzhcy;
    private final File zzhcz;
    private final zzgb zzvl;

    public zzdnc(Context context, zzgb zzgbVar) {
        this.zzcip = context.getSharedPreferences("pcvmspf", 0);
        this.zzhcy = zzdnb.zza(context.getDir("pccache", 0), false);
        this.zzhcz = zzdnb.zza(context.getDir("tmppccache", 0), true);
        this.zzvl = zzgbVar;
    }

    public final zzdmz zzeb(int i) {
        zzgh zzec = zzec(i);
        if (zzec == null) {
            return null;
        }
        String zzdh = zzec.zzdh();
        return new zzdmz(zzec, zzdnb.zza(zzdh, "pcam", zzavh()), zzdnb.zza(zzdh, "pcbc", zzavh()), zzdnb.zza(zzdh, "pcopt", zzavh()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0135, code lost:
        if (r0.commit() != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzgd r8, com.google.android.gms.internal.ads.zzdni r9) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdnc.zza(com.google.android.gms.internal.ads.zzgd, com.google.android.gms.internal.ads.zzdni):boolean");
    }

    private final File zzavh() {
        File file = new File(this.zzhcy, Integer.toString(this.zzvl.zzw()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private static String zza(zzgh zzghVar) {
        return Hex.bytesToStringLowercase(zzghVar.zzbce().toByteArray());
    }

    private final String zzavi() {
        int zzw = this.zzvl.zzw();
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(zzw);
        return sb.toString();
    }

    private final String zzavj() {
        int zzw = this.zzvl.zzw();
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(zzw);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzgh zzec(int r6) {
        /*
            r5 = this;
            int r0 = com.google.android.gms.internal.ads.zzdnh.zzhdc
            r1 = 0
            if (r6 != r0) goto L10
            android.content.SharedPreferences r6 = r5.zzcip
            java.lang.String r0 = r5.zzavj()
            java.lang.String r6 = r6.getString(r0, r1)
            goto L20
        L10:
            int r0 = com.google.android.gms.internal.ads.zzdnh.zzhdd
            if (r6 != r0) goto L1f
            android.content.SharedPreferences r6 = r5.zzcip
            java.lang.String r0 = r5.zzavi()
            java.lang.String r6 = r6.getString(r0, r1)
            goto L20
        L1f:
            r6 = r1
        L20:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L27
            return r1
        L27:
            byte[] r6 = com.google.android.gms.common.util.Hex.stringToBytes(r6)     // Catch: com.google.android.gms.internal.ads.zzeco -> L5d
            com.google.android.gms.internal.ads.zzeaq r6 = com.google.android.gms.internal.ads.zzeaq.zzu(r6)     // Catch: com.google.android.gms.internal.ads.zzeco -> L5d
            com.google.android.gms.internal.ads.zzgh r6 = com.google.android.gms.internal.ads.zzgh.zzl(r6)     // Catch: com.google.android.gms.internal.ads.zzeco -> L5d
            java.lang.String r0 = r6.zzdh()     // Catch: com.google.android.gms.internal.ads.zzeco -> L5d
            java.lang.String r2 = "pcam"
            java.io.File r3 = r5.zzavh()     // Catch: com.google.android.gms.internal.ads.zzeco -> L5d
            java.io.File r2 = com.google.android.gms.internal.ads.zzdnb.zza(r0, r2, r3)     // Catch: com.google.android.gms.internal.ads.zzeco -> L5d
            java.lang.String r3 = "pcbc"
            java.io.File r4 = r5.zzavh()     // Catch: com.google.android.gms.internal.ads.zzeco -> L5d
            java.io.File r0 = com.google.android.gms.internal.ads.zzdnb.zza(r0, r3, r4)     // Catch: com.google.android.gms.internal.ads.zzeco -> L5d
            boolean r2 = r2.exists()     // Catch: com.google.android.gms.internal.ads.zzeco -> L5d
            if (r2 == 0) goto L59
            boolean r0 = r0.exists()     // Catch: com.google.android.gms.internal.ads.zzeco -> L5d
            if (r0 == 0) goto L59
            r0 = 1
            goto L5a
        L59:
            r0 = 0
        L5a:
            if (r0 == 0) goto L5d
            return r6
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdnc.zzec(int):com.google.android.gms.internal.ads.zzgh");
    }
}
