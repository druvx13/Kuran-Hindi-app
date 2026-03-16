package com.google.android.gms.internal.ads;

import java.security.SecureRandom;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdzw extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SecureRandom initialValue() {
        SecureRandom zzbca;
        zzbca = zzdzt.zzbca();
        return zzbca;
    }
}
