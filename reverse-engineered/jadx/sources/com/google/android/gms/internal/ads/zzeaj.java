package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeag;
import com.google.android.gms.internal.ads.zzeaj;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzeaj<MessageType extends zzeag<MessageType, BuilderType>, BuilderType extends zzeaj<MessageType, BuilderType>> implements zzedn {
    protected abstract BuilderType zza(MessageType messagetype);

    public abstract BuilderType zza(zzebf zzebfVar, zzebq zzebqVar) throws IOException;

    @Override // 
    /* renamed from: zzbch */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i, int i2, zzebq zzebqVar) throws zzeco {
        try {
            zzebf zzb = zzebf.zzb(bArr, 0, i2, false);
            zza(zzb, zzebqVar);
            zzb.zzfs(0);
            return this;
        } catch (zzeco e) {
            throw e;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + "byte array".length());
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzedn
    public final /* synthetic */ zzedn zzf(zzedo zzedoVar) {
        if (!zzbeu().getClass().isInstance(zzedoVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return zza((zzeag) zzedoVar);
    }
}
