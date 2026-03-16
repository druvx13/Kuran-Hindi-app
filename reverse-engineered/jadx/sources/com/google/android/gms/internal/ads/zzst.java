package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzsv;
import com.google.android.gms.internal.ads.zztf;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzst {
    private final zzsy zzbte;
    private final zztf.zzi.zza zzbtf;
    private final boolean zzbtg;

    public static zzst zzmz() {
        return new zzst();
    }

    public zzst(zzsy zzsyVar) {
        this.zzbtf = zztf.zzi.zznz();
        this.zzbte = zzsyVar;
        this.zzbtg = ((Boolean) zzvj.zzpv().zzd(zzzz.zzcqq)).booleanValue();
    }

    private zzst() {
        this.zzbtf = zztf.zzi.zznz();
        this.zzbtg = false;
        this.zzbte = new zzsy();
    }

    public final synchronized void zza(zzsv.zza.EnumC0024zza enumC0024zza) {
        if (this.zzbtg) {
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcqr)).booleanValue()) {
                zzc(enumC0024zza);
            } else {
                zzb(enumC0024zza);
            }
        }
    }

    private final synchronized void zzb(zzsv.zza.EnumC0024zza enumC0024zza) {
        this.zzbtf.zzoc().zzb(zzna());
        this.zzbte.zzf(((zztf.zzi) ((zzecd) this.zzbtf.zzbet())).toByteArray()).zzbs(enumC0024zza.zzw()).zzdx();
        String valueOf = String.valueOf(Integer.toString(enumC0024zza.zzw(), 10));
        zzawr.zzeg(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void zzc(zzsv.zza.EnumC0024zza enumC0024zza) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(zzd(enumC0024zza).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zzawr.zzeg("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zzawr.zzeg("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zzawr.zzeg("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    zzawr.zzeg("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            zzawr.zzeg("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzd(zzsv.zza.EnumC0024zza enumC0024zza) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzbtf.zznv(), Long.valueOf(com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime()), Integer.valueOf(enumC0024zza.zzw()), Base64.encodeToString(((zztf.zzi) ((zzecd) this.zzbtf.zzbet())).toByteArray(), 3));
    }

    public final synchronized void zza(zzsw zzswVar) {
        if (this.zzbtg) {
            try {
                zzswVar.zza(this.zzbtf);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzq.zzla().zza(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    private static List<Long> zzna() {
        List<String> zzrb = zzzz.zzrb();
        ArrayList arrayList = new ArrayList();
        for (String str : zzrb) {
            for (String str2 : str.split(",")) {
                try {
                    arrayList.add(Long.valueOf(str2));
                } catch (NumberFormatException unused) {
                    zzawr.zzeg("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }
}
