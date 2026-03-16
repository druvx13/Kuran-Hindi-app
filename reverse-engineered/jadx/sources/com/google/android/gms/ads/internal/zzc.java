package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzaxa;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzc {
    private boolean zzblu;
    private zzaun zzblv;
    private zzaqy zzblw;
    private final Context zzvf;

    public zzc(Context context, zzaun zzaunVar, zzaqy zzaqyVar) {
        this.zzvf = context;
        this.zzblv = zzaunVar;
        this.zzblw = null;
        if (0 == 0) {
            this.zzblw = new zzaqy();
        }
    }

    private final boolean zzjw() {
        zzaun zzaunVar = this.zzblv;
        return (zzaunVar != null && zzaunVar.zzvf().zzdsi) || this.zzblw.zzdox;
    }

    public final void recordClick() {
        this.zzblu = true;
    }

    public final boolean zzjx() {
        return !zzjw() || this.zzblu;
    }

    public final void zzbm(String str) {
        if (zzjw()) {
            if (str == null) {
                str = "";
            }
            zzaun zzaunVar = this.zzblv;
            if (zzaunVar != null) {
                zzaunVar.zza(str, null, 3);
            } else if (this.zzblw.zzdox && this.zzblw.zzdoy != null) {
                for (String str2 : this.zzblw.zzdoy) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzq.zzkw();
                        zzaxa.zzb(this.zzvf, "", replace);
                    }
                }
            }
        }
    }
}
