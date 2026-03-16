package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzeeo<FieldDescriptorType> extends zzeel<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeeo(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeel
    public final void zzbcj() {
        if (!isImmutable()) {
            for (int i = 0; i < zzbgq(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzhj = zzhj(i);
                if (((zzebv) zzhj.getKey()).zzbel()) {
                    zzhj.setValue(Collections.unmodifiableList((List) zzhj.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : zzbgr()) {
                if (((zzebv) entry.getKey()).zzbel()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzbcj();
    }
}
