package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzun implements Comparator {
    static final Comparator zzcfe = new zzun();

    private zzun() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return zzuk.zzd((String) obj, (String) obj2);
    }
}
