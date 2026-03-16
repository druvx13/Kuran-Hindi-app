package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcn {
    private static boolean zznf = false;
    private static MessageDigest zzng;
    private static final Object zznh = new Object();
    private static final Object zzni = new Object();
    static CountDownLatch zznj = new CountDownLatch(1);

    public static void zzbp() {
        synchronized (zzni) {
            if (!zznf) {
                zznf = true;
                new Thread(new zzcp()).start();
            }
        }
    }

    private static MessageDigest zzbq() {
        boolean z;
        MessageDigest messageDigest;
        zzbp();
        try {
            z = zznj.await(2L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && (messageDigest = zzng) != null) {
            return messageDigest;
        }
        return null;
    }

    public static String zzj(zzbv.zza zzaVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zza;
        byte[] byteArray = zzaVar.toByteArray();
        if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcoa)).booleanValue()) {
            if (zzer.zzza == null) {
                throw new GeneralSecurityException();
            }
            zza = ((zzbv.zzf) ((zzecd) zzbv.zzf.zzbm().zzj(zzeaq.zzu(zzer.zzza.zzc(byteArray, str != null ? str.getBytes() : new byte[0]))).zzb(zzcc.TINK_HYBRID).zzbet())).toByteArray();
        } else {
            Vector<byte[]> zza2 = zza(byteArray, 255);
            if (zza2 == null || zza2.size() == 0) {
                zza = zza(zza(zzbv.zza.zzd.PSN_ENCODE_SIZE_FAIL).toByteArray(), str, true);
            } else {
                zzbv.zzf.zza zzbm = zzbv.zzf.zzbm();
                Iterator<byte[]> it = zza2.iterator();
                while (it.hasNext()) {
                    zzbm.zzj(zzeaq.zzu(zza(it.next(), str, false)));
                }
                zzbm.zzk(zzeaq.zzu(zzb(byteArray)));
                zza = ((zzbv.zzf) ((zzecd) zzbm.zzbet())).toByteArray();
            }
        }
        return zzcl.zza(zza, true);
    }

    private static Vector<byte[]> zza(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    private static zzbv.zza zza(zzbv.zza.zzd zzdVar) {
        zzbv.zza.C0010zza zzar = zzbv.zza.zzar();
        zzar.zzn(zzdVar.zzw());
        return (zzbv.zza) ((zzecd) zzar.zzbet());
    }

    private static byte[] zza(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] array;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = zza(zzbv.zza.zzd.PSN_ENCODE_SIZE_FAIL).toByteArray();
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[i - bArr.length];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(zzb(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        for (zzcu zzcuVar : new zzcs().zzvc) {
            zzcuVar.zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzeah(str.getBytes("UTF-8")).zzt(bArr3);
        }
        return bArr3;
    }

    public static byte[] zzb(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (zznh) {
            MessageDigest zzbq = zzbq();
            if (zzbq == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            zzbq.reset();
            zzbq.update(bArr);
            digest = zzng.digest();
        }
        return digest;
    }
}
