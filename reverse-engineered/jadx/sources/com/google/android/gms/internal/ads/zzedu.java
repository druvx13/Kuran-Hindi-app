package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzedu<T> implements zzeek<T> {
    private final zzedo zziah;
    private final boolean zziai;
    private final zzefc<?, ?> zziar;
    private final zzebs<?> zzias;

    private zzedu(zzefc<?, ?> zzefcVar, zzebs<?> zzebsVar, zzedo zzedoVar) {
        this.zziar = zzefcVar;
        this.zziai = zzebsVar.zzj(zzedoVar);
        this.zzias = zzebsVar;
        this.zziah = zzedoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzedu<T> zza(zzefc<?, ?> zzefcVar, zzebs<?> zzebsVar, zzedo zzedoVar) {
        return new zzedu<>(zzefcVar, zzebsVar, zzedoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final T newInstance() {
        return (T) this.zziah.zzbfc().zzbes();
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final boolean equals(T t, T t2) {
        if (this.zziar.zzay(t).equals(this.zziar.zzay(t2))) {
            if (this.zziai) {
                return this.zzias.zzai(t).equals(this.zzias.zzai(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final int hashCode(T t) {
        int hashCode = this.zziar.zzay(t).hashCode();
        return this.zziai ? (hashCode * 53) + this.zzias.zzai(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zzf(T t, T t2) {
        zzeem.zza(this.zziar, t, t2);
        if (this.zziai) {
            zzeem.zza(this.zzias, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zza(T t, zzefv zzefvVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it = this.zzias.zzai(t).iterator();
        while (it.hasNext()) {
            Map.Entry<?, Object> next = it.next();
            zzebv zzebvVar = (zzebv) next.getKey();
            if (zzebvVar.zzbek() != zzefw.MESSAGE || zzebvVar.zzbel() || zzebvVar.zzbem()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzecr) {
                zzefvVar.zzc(zzebvVar.zzw(), ((zzecr) next).zzbfr().zzbce());
            } else {
                zzefvVar.zzc(zzebvVar.zzw(), next.getValue());
            }
        }
        zzefc<?, ?> zzefcVar = this.zziar;
        zzefcVar.zzc(zzefcVar.zzay(t), zzefvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099 A[EDGE_INSN: B:58:0x0099->B:34:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzeek
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.ads.zzeap r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.ads.zzecd r0 = (com.google.android.gms.internal.ads.zzecd) r0
            com.google.android.gms.internal.ads.zzefb r1 = r0.zzhxv
            com.google.android.gms.internal.ads.zzefb r2 = com.google.android.gms.internal.ads.zzefb.zzbhd()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.ads.zzefb r1 = com.google.android.gms.internal.ads.zzefb.zzbhe()
            r0.zzhxv = r1
        L11:
            com.google.android.gms.internal.ads.zzecd$zzb r10 = (com.google.android.gms.internal.ads.zzecd.zzb) r10
            r10.zzbfd()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.ads.zzeam.zza(r11, r12, r14)
            int r2 = r14.zzhtb
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.ads.zzebs<?> r12 = r9.zzias
            com.google.android.gms.internal.ads.zzebq r0 = r14.zzhte
            com.google.android.gms.internal.ads.zzedo r3 = r9.zziah
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.ads.zzecd$zzd r0 = (com.google.android.gms.internal.ads.zzecd.zzd) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.ads.zzeam.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.ads.zzedz.zzbgk()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.ads.zzeam.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.ads.zzeam.zza(r11, r4, r14)
            int r5 = r14.zzhtb
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.ads.zzeam.zze(r11, r4, r14)
            java.lang.Object r2 = r14.zzhtd
            com.google.android.gms.internal.ads.zzeaq r2 = (com.google.android.gms.internal.ads.zzeaq) r2
            goto L53
        L72:
            com.google.android.gms.internal.ads.zzedz.zzbgk()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.ads.zzeam.zza(r11, r4, r14)
            int r12 = r14.zzhtb
            com.google.android.gms.internal.ads.zzebs<?> r0 = r9.zzias
            com.google.android.gms.internal.ads.zzebq r5 = r14.zzhte
            com.google.android.gms.internal.ads.zzedo r6 = r9.zziah
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.ads.zzecd$zzd r0 = (com.google.android.gms.internal.ads.zzecd.zzd) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.ads.zzeam.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zzd(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.ads.zzeco r10 = com.google.android.gms.internal.ads.zzeco.zzbfn()
            goto Lad
        Lac:
            throw r10
        Lad:
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzedu.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzeap):void");
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zza(T t, zzeee zzeeeVar, zzebq zzebqVar) throws IOException {
        boolean z;
        zzefc<?, ?> zzefcVar = this.zziar;
        zzebs<?> zzebsVar = this.zzias;
        Object zzaz = zzefcVar.zzaz(t);
        zzebt<?> zzaj = zzebsVar.zzaj(t);
        do {
            try {
                if (zzeeeVar.zzbdw() == Integer.MAX_VALUE) {
                    return;
                }
                int tag = zzeeeVar.getTag();
                if (tag == 11) {
                    int i = 0;
                    Object obj = null;
                    zzeaq zzeaqVar = null;
                    while (zzeeeVar.zzbdw() != Integer.MAX_VALUE) {
                        int tag2 = zzeeeVar.getTag();
                        if (tag2 == 16) {
                            i = zzeeeVar.zzbdh();
                            obj = zzebsVar.zza(zzebqVar, this.zziah, i);
                        } else if (tag2 == 26) {
                            if (obj != null) {
                                zzebsVar.zza(zzeeeVar, obj, zzebqVar, zzaj);
                            } else {
                                zzeaqVar = zzeeeVar.zzbdg();
                            }
                        } else if (!zzeeeVar.zzbdx()) {
                            break;
                        }
                    }
                    if (zzeeeVar.getTag() != 12) {
                        throw zzeco.zzbfk();
                    } else if (zzeaqVar != null) {
                        if (obj != null) {
                            zzebsVar.zza(zzeaqVar, obj, zzebqVar, zzaj);
                        } else {
                            zzefcVar.zza((zzefc<?, ?>) zzaz, i, zzeaqVar);
                        }
                    }
                } else if ((tag & 7) == 2) {
                    Object zza = zzebsVar.zza(zzebqVar, this.zziah, tag >>> 3);
                    if (zza != null) {
                        zzebsVar.zza(zzeeeVar, zza, zzebqVar, zzaj);
                    } else {
                        z = zzefcVar.zza((zzefc<?, ?>) zzaz, zzeeeVar);
                        continue;
                    }
                } else {
                    z = zzeeeVar.zzbdx();
                    continue;
                }
                z = true;
                continue;
            } finally {
                zzefcVar.zzi(t, zzaz);
            }
        } while (z);
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zzak(T t) {
        this.zziar.zzak(t);
        this.zzias.zzak(t);
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final boolean zzaw(T t) {
        return this.zzias.zzai(t).isInitialized();
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final int zzau(T t) {
        zzefc<?, ?> zzefcVar = this.zziar;
        int zzba = zzefcVar.zzba(zzefcVar.zzay(t)) + 0;
        return this.zziai ? zzba + this.zzias.zzai(t).zzbef() : zzba;
    }
}
