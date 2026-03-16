package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzax extends zzq<String> {
    private final Object mLock;
    private zzab<String> zzcn;

    public zzax(int i, String str, zzab<String> zzabVar, zzy zzyVar) {
        super(i, str, zzyVar);
        this.mLock = new Object();
        this.zzcn = zzabVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzq
    /* renamed from: zzh */
    public void zza(String str) {
        zzab<String> zzabVar;
        synchronized (this.mLock) {
            zzabVar = this.zzcn;
        }
        if (zzabVar != null) {
            zzabVar.zzb(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzq
    public final zzz<String> zza(zzo zzoVar) {
        String str;
        try {
            byte[] bArr = zzoVar.data;
            String str2 = "ISO-8859-1";
            String str3 = zzoVar.zzab.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzoVar.data);
        }
        return zzz.zza(str, zzas.zzb(zzoVar));
    }
}
