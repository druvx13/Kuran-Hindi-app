package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcvz implements zzdak<zzcvx> {
    private final String zzdma;
    private final zzcfz zzgac;
    private final zzdrh zzglk;

    public zzcvz(String str, zzdrh zzdrhVar, zzcfz zzcfzVar) {
        this.zzdma = str;
        this.zzglk = zzdrhVar;
        this.zzgac = zzcfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzcvx> zzaqa() {
        if (new BigInteger(this.zzdma).equals(BigInteger.ONE)) {
            if (!zzdok.zzaq((String) zzvj.zzpv().zzd(zzzz.zzcmz))) {
                return this.zzglk.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcwc
                    private final zzcvz zzgmc;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgmc = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zzgmc.zzaqc();
                    }
                });
            }
        }
        return zzdqw.zzag(new zzcvx(new Bundle()));
    }

    private static Bundle zzb(zzdhq zzdhqVar) {
        Bundle bundle = new Bundle();
        try {
            if (zzdhqVar.zzto() != null) {
                bundle.putString("sdk_version", zzdhqVar.zzto().toString());
            }
        } catch (zzdhk unused) {
        }
        try {
            if (zzdhqVar.zztn() != null) {
                bundle.putString("adapter_version", zzdhqVar.zztn().toString());
            }
        } catch (zzdhk unused2) {
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcvx zzaqc() throws Exception {
        List<String> asList = Arrays.asList(((String) zzvj.zzpv().zzd(zzzz.zzcmz)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                bundle.putBundle(str, zzb(this.zzgac.zzd(str, new JSONObject())));
            } catch (zzdhk unused) {
            }
        }
        return new zzcvx(bundle);
    }
}
