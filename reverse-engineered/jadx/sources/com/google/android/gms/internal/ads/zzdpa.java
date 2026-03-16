package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdpa<E> extends zzdos<E> {
    private int zzahb;
    @NullableDecl
    private Object[] zzhfm;

    public zzdpa() {
        super(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpa(int i) {
        super(i);
        this.zzhfm = new Object[zzdpb.zzeh(i)];
    }

    public final zzdpb<E> zzawc() {
        zzdpb<E> zza;
        boolean zzv;
        int i = this.size;
        if (i != 0) {
            if (i == 1) {
                return zzdpb.zzae(this.zzhfc[0]);
            }
            if (this.zzhfm != null && zzdpb.zzeh(this.size) == this.zzhfm.length) {
                zzv = zzdpb.zzv(this.size, this.zzhfc.length);
                Object[] copyOf = zzv ? Arrays.copyOf(this.zzhfc, this.size) : this.zzhfc;
                int i2 = this.zzahb;
                Object[] objArr = this.zzhfm;
                zza = new zzdpk<>(copyOf, i2, objArr, objArr.length - 1, this.size);
            } else {
                zza = zzdpb.zza(this.size, this.zzhfc);
                this.size = zza.size();
            }
            this.zzhfd = true;
            this.zzhfm = null;
            return zza;
        }
        return zzdpk.zzhfy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdos, com.google.android.gms.internal.ads.zzdov
    public final /* synthetic */ zzdov zzg(Iterable iterable) {
        zzdoj.checkNotNull(iterable);
        if (this.zzhfm != null) {
            for (Object obj : iterable) {
                zzac(obj);
            }
        } else {
            super.zzg(iterable);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdos
    public final /* synthetic */ zzdos zzab(Object obj) {
        return (zzdpa) zzac(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdov
    public final /* synthetic */ zzdov zza(Iterator it) {
        zzdoj.checkNotNull(it);
        while (it.hasNext()) {
            zzac(it.next());
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdos, com.google.android.gms.internal.ads.zzdov
    public final /* synthetic */ zzdov zzac(Object obj) {
        zzdoj.checkNotNull(obj);
        if (this.zzhfm != null) {
            int zzeh = zzdpb.zzeh(this.size);
            Object[] objArr = this.zzhfm;
            if (zzeh <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int zzef = zzdoq.zzef(hashCode);
                while (true) {
                    int i = zzef & length;
                    Object[] objArr2 = this.zzhfm;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.zzahb += hashCode;
                        super.zzac(obj);
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        zzef = i + 1;
                    }
                }
                return this;
            }
        }
        this.zzhfm = null;
        super.zzac(obj);
        return this;
    }
}
