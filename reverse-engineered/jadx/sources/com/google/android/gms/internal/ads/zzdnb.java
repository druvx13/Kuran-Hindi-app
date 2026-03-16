package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdnb {
    public static File zza(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(zza(str, file), str2);
    }

    public static boolean zza(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                IOUtils.closeQuietly(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                IOUtils.closeQuietly(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                IOUtils.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static File zza(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return zza(new File(file, str), false);
    }

    public static File zza(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean zzd(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    zzd(file2);
                }
            }
            return file.delete();
        }
        return true;
    }

    public static byte[] zze(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (IOException unused) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] byteArray = zzeaq.zzf(fileInputStream).toByteArray();
            IOUtils.closeQuietly(fileInputStream);
            return byteArray;
        } catch (IOException unused2) {
            IOUtils.closeQuietly(fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            IOUtils.closeQuietly(fileInputStream2);
            throw th;
        }
    }
}
