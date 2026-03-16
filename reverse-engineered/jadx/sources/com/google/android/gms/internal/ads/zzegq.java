package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzegq extends zzegr {
    private Logger logger;

    public zzegq(String str) {
        this.logger = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.zzegr
    public final void zzig(String str) {
        this.logger.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
