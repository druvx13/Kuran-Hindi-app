package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdmq {
    private final Context zzvf;
    private final zzdlk zzvj;

    public zzdmq(Context context, zzdlk zzdlkVar) {
        this.zzvf = context;
        this.zzvj = zzdlkVar;
    }

    private final void zzj(byte[] bArr) {
        if (this.zzvj == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(zzdol.OS_ARCH.value());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";");
        sb.append("CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        this.zzvj.zzi(4007, sb.toString());
    }

    private final String zzauu() {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String value = zzdol.OS_ARCH.value();
        if (TextUtils.isEmpty(value) || !hashSet.contains(value)) {
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null && strArr.length > 0) {
                    return strArr[0];
                }
            } catch (IllegalAccessException e) {
                zzdlk zzdlkVar = this.zzvj;
                if (zzdlkVar != null) {
                    zzdlkVar.zza(2024, 0L, e);
                }
            } catch (NoSuchFieldException e2) {
                zzdlk zzdlkVar2 = this.zzvj;
                if (zzdlkVar2 != null) {
                    zzdlkVar2.zza(2024, 0L, e2);
                }
            }
            if (Build.CPU_ABI != null) {
                return Build.CPU_ABI;
            }
            return Build.CPU_ABI2;
        }
        return value;
    }

    private final zzgb zzauv() {
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(this.zzvf.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            return zzgb.UNSUPPORTED;
        }
        File[] listFiles = file.listFiles(new zzdpt(Pattern.compile(".*\\.so$", 2)));
        if (listFiles == null || listFiles.length == 0) {
            return zzgb.UNSUPPORTED;
        }
        try {
            fileInputStream = new FileInputStream(listFiles[0]);
            bArr = new byte[20];
        } catch (IOException unused) {
        }
        if (fileInputStream.read(bArr) == 20) {
            byte[] bArr2 = {0, 0};
            if (bArr[5] == 2) {
                zzj(bArr);
                zzgb zzgbVar = zzgb.UNSUPPORTED;
                fileInputStream.close();
                return zzgbVar;
            }
            bArr2[0] = bArr[19];
            bArr2[1] = bArr[18];
            short s = ByteBuffer.wrap(bArr2).getShort();
            if (s == 3) {
                zzgb zzgbVar2 = zzgb.X86;
                fileInputStream.close();
                return zzgbVar2;
            } else if (s == 40) {
                zzgb zzgbVar3 = zzgb.ARM7;
                fileInputStream.close();
                return zzgbVar3;
            } else if (s == 62) {
                zzgb zzgbVar4 = zzgb.X86_64;
                fileInputStream.close();
                return zzgbVar4;
            } else if (s == 183) {
                zzgb zzgbVar5 = zzgb.ARM64;
                fileInputStream.close();
                return zzgbVar5;
            } else {
                zzgb zzgbVar6 = zzgb.UNSUPPORTED;
                fileInputStream.close();
                return zzgbVar6;
            }
        }
        fileInputStream.close();
        return zzgb.UNSUPPORTED;
    }

    public final zzgb zzauw() {
        zzgb zzauv = zzauv();
        if (zzauv == zzgb.UNSUPPORTED) {
            String zzauu = zzauu();
            if (!TextUtils.isEmpty(zzauu)) {
                if (zzauu.equalsIgnoreCase("i686") || zzauu.equalsIgnoreCase("x86")) {
                    return zzgb.X86;
                }
                if (zzauu.equalsIgnoreCase("x86_64")) {
                    return zzgb.X86_64;
                }
                if (zzauu.equalsIgnoreCase("arm64-v8a")) {
                    return zzgb.ARM64;
                }
                if (zzauu.equalsIgnoreCase("armeabi-v7a") || zzauu.equalsIgnoreCase("armv71")) {
                    return zzgb.ARM7;
                }
            }
            zzj(null);
            return zzgb.UNSUPPORTED;
        }
        return zzauv;
    }
}
