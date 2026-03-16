package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.StatFs;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzaxj extends zzaxk {
    @Override // com.google.android.gms.internal.ads.zzaxf
    public final int zzxk() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzaxf
    public boolean isAttachedToWindow(View view) {
        return super.isAttachedToWindow(view) || view.getWindowId() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzaxf
    public final long zzxo() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcom)).booleanValue()) {
            return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        }
        return -1L;
    }
}
