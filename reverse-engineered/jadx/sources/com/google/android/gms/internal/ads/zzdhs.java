package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdhs {
    public static ParcelFileDescriptor zze(final InputStream inputStream) throws IOException {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
        zzbab.zzdzr.execute(new Runnable(inputStream, parcelFileDescriptor2) { // from class: com.google.android.gms.internal.ads.zzdhr
            private final InputStream zzgvl;
            private final ParcelFileDescriptor zzgvm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgvl = inputStream;
                this.zzgvm = parcelFileDescriptor2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InputStream inputStream2 = this.zzgvl;
                try {
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.zzgvm);
                    try {
                        IOUtils.copyStream(inputStream2, autoCloseOutputStream);
                        autoCloseOutputStream.close();
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                    } catch (Throwable th) {
                        try {
                            autoCloseOutputStream.close();
                        } catch (Throwable th2) {
                            zzdzz.zza(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                }
            }
        });
        return parcelFileDescriptor;
    }
}
