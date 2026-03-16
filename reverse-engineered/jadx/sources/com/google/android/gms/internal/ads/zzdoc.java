package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdoc {
    private final String className;
    private final zzdob zzhds;
    private zzdob zzhdt;
    private boolean zzhdu;

    private zzdoc(String str) {
        zzdob zzdobVar = new zzdob();
        this.zzhds = zzdobVar;
        this.zzhdt = zzdobVar;
        this.zzhdu = false;
        this.className = (String) zzdoj.checkNotNull(str);
    }

    public final zzdoc zzy(@NullableDecl Object obj) {
        zzdob zzdobVar = new zzdob();
        this.zzhdt.zzhdr = zzdobVar;
        this.zzhdt = zzdobVar;
        zzdobVar.value = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.className);
        sb.append('{');
        zzdob zzdobVar = this.zzhds.zzhdr;
        String str = "";
        while (zzdobVar != null) {
            Object obj = zzdobVar.value;
            sb.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            zzdobVar = zzdobVar.zzhdr;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
