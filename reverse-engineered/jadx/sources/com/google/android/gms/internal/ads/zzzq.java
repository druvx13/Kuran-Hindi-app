package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzzq {
    private final Collection<zzzk<?>> zzcig = new ArrayList();
    private final Collection<zzzk<String>> zzcih = new ArrayList();
    private final Collection<zzzk<String>> zzcii = new ArrayList();

    public final void zza(zzzk zzzkVar) {
        this.zzcig.add(zzzkVar);
    }

    public final void zzb(zzzk<String> zzzkVar) {
        this.zzcih.add(zzzkVar);
    }

    public final void zzc(zzzk<String> zzzkVar) {
        this.zzcii.add(zzzkVar);
    }

    public final void zza(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzzk<?> zzzkVar : this.zzcig) {
            if (zzzkVar.getSource() == 1) {
                zzzkVar.zza(editor, zzzkVar.zzb(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzazw.zzfa("Flag Json is null.");
        }
    }

    public final List<String> zzra() {
        ArrayList arrayList = new ArrayList();
        for (zzzk<String> zzzkVar : this.zzcih) {
            String str = (String) zzvj.zzpv().zzd(zzzkVar);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzaaa.zzre());
        return arrayList;
    }

    public final List<String> zzrb() {
        List<String> zzra = zzra();
        for (zzzk<String> zzzkVar : this.zzcii) {
            String str = (String) zzvj.zzpv().zzd(zzzkVar);
            if (!TextUtils.isEmpty(str)) {
                zzra.add(str);
            }
        }
        zzra.addAll(zzaaa.zzrf());
        return zzra;
    }
}
