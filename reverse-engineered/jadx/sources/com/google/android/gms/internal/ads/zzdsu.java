package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdsu<P> {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final Class<P> zzhix;
    private ConcurrentMap<String, List<zzdst<P>>> zzhji = new ConcurrentHashMap();
    private zzdst<P> zzhjj;

    public final zzdst<P> zzaxh() {
        return this.zzhjj;
    }

    private zzdsu(Class<P> cls) {
        this.zzhix = cls;
    }

    public static <P> zzdsu<P> zza(Class<P> cls) {
        return new zzdsu<>(cls);
    }

    public final void zza(zzdst<P> zzdstVar) {
        if (zzdstVar == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        }
        if (zzdstVar.zzaxe() != zzdxj.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        List<zzdst<P>> list = this.zzhji.get(new String(zzdstVar.zzaxg(), UTF_8));
        if (list == null) {
            list = Collections.emptyList();
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.zzhjj = zzdstVar;
    }

    public final zzdst<P> zza(P p, zzdxp.zza zzaVar) throws GeneralSecurityException {
        byte[] array;
        if (zzaVar.zzaxe() != zzdxj.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int i = zzdsg.zzhiu[zzaVar.zzaxf().ordinal()];
        if (i == 1 || i == 2) {
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzaVar.zzbaw()).array();
        } else if (i == 3) {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzaVar.zzbaw()).array();
        } else if (i == 4) {
            array = zzdsd.zzhit;
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        zzdst<P> zzdstVar = new zzdst<>(p, array, zzaVar.zzaxe(), zzaVar.zzaxf(), zzaVar.zzbaw());
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzdstVar);
        String str = new String(zzdstVar.zzaxg(), UTF_8);
        List<zzdst<P>> put = this.zzhji.put(str, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(zzdstVar);
            this.zzhji.put(str, Collections.unmodifiableList(arrayList2));
        }
        return zzdstVar;
    }

    public final Class<P> zzawu() {
        return this.zzhix;
    }
}
