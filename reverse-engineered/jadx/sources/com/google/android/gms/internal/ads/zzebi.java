package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzebi implements zzeee {
    private int tag;
    private final zzebf zzhuf;
    private int zzhug;
    private int zzhuh = 0;

    public static zzebi zza(zzebf zzebfVar) {
        if (zzebfVar.zzhtv != null) {
            return zzebfVar.zzhtv;
        }
        return new zzebi(zzebfVar);
    }

    private zzebi(zzebf zzebfVar) {
        zzebf zzebfVar2 = (zzebf) zzecg.zza(zzebfVar, "input");
        this.zzhuf = zzebfVar2;
        zzebfVar2.zzhtv = this;
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final int zzbdw() throws IOException {
        int i = this.zzhuh;
        if (i != 0) {
            this.tag = i;
            this.zzhuh = 0;
        } else {
            this.tag = this.zzhuf.zzbcy();
        }
        int i2 = this.tag;
        if (i2 == 0 || i2 == this.zzhug) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final int getTag() {
        return this.tag;
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final boolean zzbdx() throws IOException {
        int i;
        if (this.zzhuf.zzbdo() || (i = this.tag) == this.zzhug) {
            return false;
        }
        return this.zzhuf.zzft(i);
    }

    private final void zzgc(int i) throws IOException {
        if ((this.tag & 7) != i) {
            throw zzeco.zzbfl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final double readDouble() throws IOException {
        zzgc(1);
        return this.zzhuf.readDouble();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final float readFloat() throws IOException {
        zzgc(5);
        return this.zzhuf.readFloat();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final long zzbcz() throws IOException {
        zzgc(0);
        return this.zzhuf.zzbcz();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final long zzbda() throws IOException {
        zzgc(0);
        return this.zzhuf.zzbda();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final int zzbdb() throws IOException {
        zzgc(0);
        return this.zzhuf.zzbdb();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final long zzbdc() throws IOException {
        zzgc(1);
        return this.zzhuf.zzbdc();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final int zzbdd() throws IOException {
        zzgc(5);
        return this.zzhuf.zzbdd();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final boolean zzbde() throws IOException {
        zzgc(0);
        return this.zzhuf.zzbde();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final String readString() throws IOException {
        zzgc(2);
        return this.zzhuf.readString();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final String zzbdf() throws IOException {
        zzgc(2);
        return this.zzhuf.zzbdf();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final <T> T zza(zzeek<T> zzeekVar, zzebq zzebqVar) throws IOException {
        zzgc(2);
        return (T) zzc(zzeekVar, zzebqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final <T> T zzb(zzeek<T> zzeekVar, zzebq zzebqVar) throws IOException {
        zzgc(3);
        return (T) zzd(zzeekVar, zzebqVar);
    }

    private final <T> T zzc(zzeek<T> zzeekVar, zzebq zzebqVar) throws IOException {
        int zzbdh = this.zzhuf.zzbdh();
        if (this.zzhuf.zzhts >= this.zzhuf.zzhtt) {
            throw new zzeco("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zzfu = this.zzhuf.zzfu(zzbdh);
        T newInstance = zzeekVar.newInstance();
        this.zzhuf.zzhts++;
        zzeekVar.zza(newInstance, this, zzebqVar);
        zzeekVar.zzak(newInstance);
        this.zzhuf.zzfs(0);
        zzebf zzebfVar = this.zzhuf;
        zzebfVar.zzhts--;
        this.zzhuf.zzfv(zzfu);
        return newInstance;
    }

    private final <T> T zzd(zzeek<T> zzeekVar, zzebq zzebqVar) throws IOException {
        int i = this.zzhug;
        this.zzhug = ((this.tag >>> 3) << 3) | 4;
        try {
            T newInstance = zzeekVar.newInstance();
            zzeekVar.zza(newInstance, this, zzebqVar);
            zzeekVar.zzak(newInstance);
            if (this.tag == this.zzhug) {
                return newInstance;
            }
            throw zzeco.zzbfn();
        } finally {
            this.zzhug = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final zzeaq zzbdg() throws IOException {
        zzgc(2);
        return this.zzhuf.zzbdg();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final int zzbdh() throws IOException {
        zzgc(0);
        return this.zzhuf.zzbdh();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final int zzbdi() throws IOException {
        zzgc(0);
        return this.zzhuf.zzbdi();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final int zzbdj() throws IOException {
        zzgc(5);
        return this.zzhuf.zzbdj();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final long zzbdk() throws IOException {
        zzgc(1);
        return this.zzhuf.zzbdk();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final int zzbdl() throws IOException {
        zzgc(0);
        return this.zzhuf.zzbdl();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final long zzbdm() throws IOException {
        zzgc(0);
        return this.zzhuf.zzbdm();
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzj(List<Double> list) throws IOException {
        int zzbcy;
        int zzbcy2;
        if (list instanceof zzebp) {
            zzebp zzebpVar = (zzebp) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzebpVar.zzd(this.zzhuf.readDouble());
                    if (this.zzhuf.zzbdo()) {
                        return;
                    }
                    zzbcy2 = this.zzhuf.zzbcy();
                } while (zzbcy2 == this.tag);
                this.zzhuh = zzbcy2;
                return;
            } else if (i == 2) {
                int zzbdh = this.zzhuf.zzbdh();
                zzgd(zzbdh);
                int zzbdp = this.zzhuf.zzbdp() + zzbdh;
                do {
                    zzebpVar.zzd(this.zzhuf.readDouble());
                } while (this.zzhuf.zzbdp() < zzbdp);
                return;
            } else {
                throw zzeco.zzbfl();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.zzhuf.readDouble()));
                if (this.zzhuf.zzbdo()) {
                    return;
                }
                zzbcy = this.zzhuf.zzbcy();
            } while (zzbcy == this.tag);
            this.zzhuh = zzbcy;
        } else if (i2 == 2) {
            int zzbdh2 = this.zzhuf.zzbdh();
            zzgd(zzbdh2);
            int zzbdp2 = this.zzhuf.zzbdp() + zzbdh2;
            do {
                list.add(Double.valueOf(this.zzhuf.readDouble()));
            } while (this.zzhuf.zzbdp() < zzbdp2);
        } else {
            throw zzeco.zzbfl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzk(List<Float> list) throws IOException {
        int zzbcy;
        int zzbcy2;
        if (list instanceof zzebz) {
            zzebz zzebzVar = (zzebz) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzbdh = this.zzhuf.zzbdh();
                zzge(zzbdh);
                int zzbdp = this.zzhuf.zzbdp() + zzbdh;
                do {
                    zzebzVar.zzh(this.zzhuf.readFloat());
                } while (this.zzhuf.zzbdp() < zzbdp);
                return;
            } else if (i == 5) {
                do {
                    zzebzVar.zzh(this.zzhuf.readFloat());
                    if (this.zzhuf.zzbdo()) {
                        return;
                    }
                    zzbcy2 = this.zzhuf.zzbcy();
                } while (zzbcy2 == this.tag);
                this.zzhuh = zzbcy2;
                return;
            } else {
                throw zzeco.zzbfl();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzbdh2 = this.zzhuf.zzbdh();
            zzge(zzbdh2);
            int zzbdp2 = this.zzhuf.zzbdp() + zzbdh2;
            do {
                list.add(Float.valueOf(this.zzhuf.readFloat()));
            } while (this.zzhuf.zzbdp() < zzbdp2);
        } else if (i2 == 5) {
            do {
                list.add(Float.valueOf(this.zzhuf.readFloat()));
                if (this.zzhuf.zzbdo()) {
                    return;
                }
                zzbcy = this.zzhuf.zzbcy();
            } while (zzbcy == this.tag);
            this.zzhuh = zzbcy;
        } else {
            throw zzeco.zzbfl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzl(List<Long> list) throws IOException {
        int zzbcy;
        int zzbcy2;
        if (list instanceof zzedc) {
            zzedc zzedcVar = (zzedc) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzedcVar.zzfs(this.zzhuf.zzbcz());
                    if (this.zzhuf.zzbdo()) {
                        return;
                    }
                    zzbcy2 = this.zzhuf.zzbcy();
                } while (zzbcy2 == this.tag);
                this.zzhuh = zzbcy2;
                return;
            } else if (i == 2) {
                int zzbdp = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
                do {
                    zzedcVar.zzfs(this.zzhuf.zzbcz());
                } while (this.zzhuf.zzbdp() < zzbdp);
                zzgf(zzbdp);
                return;
            } else {
                throw zzeco.zzbfl();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzhuf.zzbcz()));
                if (this.zzhuf.zzbdo()) {
                    return;
                }
                zzbcy = this.zzhuf.zzbcy();
            } while (zzbcy == this.tag);
            this.zzhuh = zzbcy;
        } else if (i2 == 2) {
            int zzbdp2 = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
            do {
                list.add(Long.valueOf(this.zzhuf.zzbcz()));
            } while (this.zzhuf.zzbdp() < zzbdp2);
            zzgf(zzbdp2);
        } else {
            throw zzeco.zzbfl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzm(List<Long> list) throws IOException {
        int zzbcy;
        int zzbcy2;
        if (list instanceof zzedc) {
            zzedc zzedcVar = (zzedc) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzedcVar.zzfs(this.zzhuf.zzbda());
                    if (this.zzhuf.zzbdo()) {
                        return;
                    }
                    zzbcy2 = this.zzhuf.zzbcy();
                } while (zzbcy2 == this.tag);
                this.zzhuh = zzbcy2;
                return;
            } else if (i == 2) {
                int zzbdp = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
                do {
                    zzedcVar.zzfs(this.zzhuf.zzbda());
                } while (this.zzhuf.zzbdp() < zzbdp);
                zzgf(zzbdp);
                return;
            } else {
                throw zzeco.zzbfl();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzhuf.zzbda()));
                if (this.zzhuf.zzbdo()) {
                    return;
                }
                zzbcy = this.zzhuf.zzbcy();
            } while (zzbcy == this.tag);
            this.zzhuh = zzbcy;
        } else if (i2 == 2) {
            int zzbdp2 = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
            do {
                list.add(Long.valueOf(this.zzhuf.zzbda()));
            } while (this.zzhuf.zzbdp() < zzbdp2);
            zzgf(zzbdp2);
        } else {
            throw zzeco.zzbfl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzn(List<Integer> list) throws IOException {
        int zzbcy;
        int zzbcy2;
        if (list instanceof zzece) {
            zzece zzeceVar = (zzece) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzeceVar.zzgw(this.zzhuf.zzbdb());
                    if (this.zzhuf.zzbdo()) {
                        return;
                    }
                    zzbcy2 = this.zzhuf.zzbcy();
                } while (zzbcy2 == this.tag);
                this.zzhuh = zzbcy2;
                return;
            } else if (i == 2) {
                int zzbdp = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
                do {
                    zzeceVar.zzgw(this.zzhuf.zzbdb());
                } while (this.zzhuf.zzbdp() < zzbdp);
                zzgf(zzbdp);
                return;
            } else {
                throw zzeco.zzbfl();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzhuf.zzbdb()));
                if (this.zzhuf.zzbdo()) {
                    return;
                }
                zzbcy = this.zzhuf.zzbcy();
            } while (zzbcy == this.tag);
            this.zzhuh = zzbcy;
        } else if (i2 == 2) {
            int zzbdp2 = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
            do {
                list.add(Integer.valueOf(this.zzhuf.zzbdb()));
            } while (this.zzhuf.zzbdp() < zzbdp2);
            zzgf(zzbdp2);
        } else {
            throw zzeco.zzbfl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzo(List<Long> list) throws IOException {
        int zzbcy;
        int zzbcy2;
        if (list instanceof zzedc) {
            zzedc zzedcVar = (zzedc) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzedcVar.zzfs(this.zzhuf.zzbdc());
                    if (this.zzhuf.zzbdo()) {
                        return;
                    }
                    zzbcy2 = this.zzhuf.zzbcy();
                } while (zzbcy2 == this.tag);
                this.zzhuh = zzbcy2;
                return;
            } else if (i == 2) {
                int zzbdh = this.zzhuf.zzbdh();
                zzgd(zzbdh);
                int zzbdp = this.zzhuf.zzbdp() + zzbdh;
                do {
                    zzedcVar.zzfs(this.zzhuf.zzbdc());
                } while (this.zzhuf.zzbdp() < zzbdp);
                return;
            } else {
                throw zzeco.zzbfl();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzhuf.zzbdc()));
                if (this.zzhuf.zzbdo()) {
                    return;
                }
                zzbcy = this.zzhuf.zzbcy();
            } while (zzbcy == this.tag);
            this.zzhuh = zzbcy;
        } else if (i2 == 2) {
            int zzbdh2 = this.zzhuf.zzbdh();
            zzgd(zzbdh2);
            int zzbdp2 = this.zzhuf.zzbdp() + zzbdh2;
            do {
                list.add(Long.valueOf(this.zzhuf.zzbdc()));
            } while (this.zzhuf.zzbdp() < zzbdp2);
        } else {
            throw zzeco.zzbfl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzp(List<Integer> list) throws IOException {
        int zzbcy;
        int zzbcy2;
        if (list instanceof zzece) {
            zzece zzeceVar = (zzece) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzbdh = this.zzhuf.zzbdh();
                zzge(zzbdh);
                int zzbdp = this.zzhuf.zzbdp() + zzbdh;
                do {
                    zzeceVar.zzgw(this.zzhuf.zzbdd());
                } while (this.zzhuf.zzbdp() < zzbdp);
                return;
            } else if (i == 5) {
                do {
                    zzeceVar.zzgw(this.zzhuf.zzbdd());
                    if (this.zzhuf.zzbdo()) {
                        return;
                    }
                    zzbcy2 = this.zzhuf.zzbcy();
                } while (zzbcy2 == this.tag);
                this.zzhuh = zzbcy2;
                return;
            } else {
                throw zzeco.zzbfl();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzbdh2 = this.zzhuf.zzbdh();
            zzge(zzbdh2);
            int zzbdp2 = this.zzhuf.zzbdp() + zzbdh2;
            do {
                list.add(Integer.valueOf(this.zzhuf.zzbdd()));
            } while (this.zzhuf.zzbdp() < zzbdp2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzhuf.zzbdd()));
                if (this.zzhuf.zzbdo()) {
                    return;
                }
                zzbcy = this.zzhuf.zzbcy();
            } while (zzbcy == this.tag);
            this.zzhuh = zzbcy;
        } else {
            throw zzeco.zzbfl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzq(List<Boolean> list) throws IOException {
        int zzbcy;
        int zzbcy2;
        if (list instanceof zzeao) {
            zzeao zzeaoVar = (zzeao) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzeaoVar.addBoolean(this.zzhuf.zzbde());
                    if (this.zzhuf.zzbdo()) {
                        return;
                    }
                    zzbcy2 = this.zzhuf.zzbcy();
                } while (zzbcy2 == this.tag);
                this.zzhuh = zzbcy2;
                return;
            } else if (i == 2) {
                int zzbdp = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
                do {
                    zzeaoVar.addBoolean(this.zzhuf.zzbde());
                } while (this.zzhuf.zzbdp() < zzbdp);
                zzgf(zzbdp);
                return;
            } else {
                throw zzeco.zzbfl();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(this.zzhuf.zzbde()));
                if (this.zzhuf.zzbdo()) {
                    return;
                }
                zzbcy = this.zzhuf.zzbcy();
            } while (zzbcy == this.tag);
            this.zzhuh = zzbcy;
        } else if (i2 == 2) {
            int zzbdp2 = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
            do {
                list.add(Boolean.valueOf(this.zzhuf.zzbde()));
            } while (this.zzhuf.zzbdp() < zzbdp2);
            zzgf(zzbdp2);
        } else {
            throw zzeco.zzbfl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void readStringList(List<String> list) throws IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzr(List<String> list) throws IOException {
        zza(list, true);
    }

    private final void zza(List<String> list, boolean z) throws IOException {
        int zzbcy;
        int zzbcy2;
        if ((this.tag & 7) != 2) {
            throw zzeco.zzbfl();
        }
        if ((list instanceof zzecv) && !z) {
            zzecv zzecvVar = (zzecv) list;
            do {
                zzecvVar.zzaj(zzbdg());
                if (this.zzhuf.zzbdo()) {
                    return;
                }
                zzbcy2 = this.zzhuf.zzbcy();
            } while (zzbcy2 == this.tag);
            this.zzhuh = zzbcy2;
            return;
        }
        do {
            list.add(z ? zzbdf() : readString());
            if (this.zzhuf.zzbdo()) {
                return;
            }
            zzbcy = this.zzhuf.zzbcy();
        } while (zzbcy == this.tag);
        this.zzhuh = zzbcy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeee
    public final <T> void zza(List<T> list, zzeek<T> zzeekVar, zzebq zzebqVar) throws IOException {
        int zzbcy;
        int i = this.tag;
        if ((i & 7) != 2) {
            throw zzeco.zzbfl();
        }
        do {
            list.add(zzc(zzeekVar, zzebqVar));
            if (this.zzhuf.zzbdo() || this.zzhuh != 0) {
                return;
            }
            zzbcy = this.zzhuf.zzbcy();
        } while (zzbcy == i);
        this.zzhuh = zzbcy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeee
    public final <T> void zzb(List<T> list, zzeek<T> zzeekVar, zzebq zzebqVar) throws IOException {
        int zzbcy;
        int i = this.tag;
        if ((i & 7) != 3) {
            throw zzeco.zzbfl();
        }
        do {
            list.add(zzd(zzeekVar, zzebqVar));
            if (this.zzhuf.zzbdo() || this.zzhuh != 0) {
                return;
            }
            zzbcy = this.zzhuf.zzbcy();
        } while (zzbcy == i);
        this.zzhuh = zzbcy;
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzs(List<zzeaq> list) throws IOException {
        int zzbcy;
        if ((this.tag & 7) != 2) {
            throw zzeco.zzbfl();
        }
        do {
            list.add(zzbdg());
            if (this.zzhuf.zzbdo()) {
                return;
            }
            zzbcy = this.zzhuf.zzbcy();
        } while (zzbcy == this.tag);
        this.zzhuh = zzbcy;
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzt(List<Integer> list) throws IOException {
        int zzbcy;
        int zzbcy2;
        if (list instanceof zzece) {
            zzece zzeceVar = (zzece) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzeceVar.zzgw(this.zzhuf.zzbdh());
                    if (this.zzhuf.zzbdo()) {
                        return;
                    }
                    zzbcy2 = this.zzhuf.zzbcy();
                } while (zzbcy2 == this.tag);
                this.zzhuh = zzbcy2;
                return;
            } else if (i == 2) {
                int zzbdp = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
                do {
                    zzeceVar.zzgw(this.zzhuf.zzbdh());
                } while (this.zzhuf.zzbdp() < zzbdp);
                zzgf(zzbdp);
                return;
            } else {
                throw zzeco.zzbfl();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzhuf.zzbdh()));
                if (this.zzhuf.zzbdo()) {
                    return;
                }
                zzbcy = this.zzhuf.zzbcy();
            } while (zzbcy == this.tag);
            this.zzhuh = zzbcy;
        } else if (i2 == 2) {
            int zzbdp2 = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
            do {
                list.add(Integer.valueOf(this.zzhuf.zzbdh()));
            } while (this.zzhuf.zzbdp() < zzbdp2);
            zzgf(zzbdp2);
        } else {
            throw zzeco.zzbfl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzu(List<Integer> list) throws IOException {
        int zzbcy;
        int zzbcy2;
        if (list instanceof zzece) {
            zzece zzeceVar = (zzece) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzeceVar.zzgw(this.zzhuf.zzbdi());
                    if (this.zzhuf.zzbdo()) {
                        return;
                    }
                    zzbcy2 = this.zzhuf.zzbcy();
                } while (zzbcy2 == this.tag);
                this.zzhuh = zzbcy2;
                return;
            } else if (i == 2) {
                int zzbdp = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
                do {
                    zzeceVar.zzgw(this.zzhuf.zzbdi());
                } while (this.zzhuf.zzbdp() < zzbdp);
                zzgf(zzbdp);
                return;
            } else {
                throw zzeco.zzbfl();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzhuf.zzbdi()));
                if (this.zzhuf.zzbdo()) {
                    return;
                }
                zzbcy = this.zzhuf.zzbcy();
            } while (zzbcy == this.tag);
            this.zzhuh = zzbcy;
        } else if (i2 == 2) {
            int zzbdp2 = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
            do {
                list.add(Integer.valueOf(this.zzhuf.zzbdi()));
            } while (this.zzhuf.zzbdp() < zzbdp2);
            zzgf(zzbdp2);
        } else {
            throw zzeco.zzbfl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzv(List<Integer> list) throws IOException {
        int zzbcy;
        int zzbcy2;
        if (list instanceof zzece) {
            zzece zzeceVar = (zzece) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzbdh = this.zzhuf.zzbdh();
                zzge(zzbdh);
                int zzbdp = this.zzhuf.zzbdp() + zzbdh;
                do {
                    zzeceVar.zzgw(this.zzhuf.zzbdj());
                } while (this.zzhuf.zzbdp() < zzbdp);
                return;
            } else if (i == 5) {
                do {
                    zzeceVar.zzgw(this.zzhuf.zzbdj());
                    if (this.zzhuf.zzbdo()) {
                        return;
                    }
                    zzbcy2 = this.zzhuf.zzbcy();
                } while (zzbcy2 == this.tag);
                this.zzhuh = zzbcy2;
                return;
            } else {
                throw zzeco.zzbfl();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzbdh2 = this.zzhuf.zzbdh();
            zzge(zzbdh2);
            int zzbdp2 = this.zzhuf.zzbdp() + zzbdh2;
            do {
                list.add(Integer.valueOf(this.zzhuf.zzbdj()));
            } while (this.zzhuf.zzbdp() < zzbdp2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzhuf.zzbdj()));
                if (this.zzhuf.zzbdo()) {
                    return;
                }
                zzbcy = this.zzhuf.zzbcy();
            } while (zzbcy == this.tag);
            this.zzhuh = zzbcy;
        } else {
            throw zzeco.zzbfl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzw(List<Long> list) throws IOException {
        int zzbcy;
        int zzbcy2;
        if (list instanceof zzedc) {
            zzedc zzedcVar = (zzedc) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzedcVar.zzfs(this.zzhuf.zzbdk());
                    if (this.zzhuf.zzbdo()) {
                        return;
                    }
                    zzbcy2 = this.zzhuf.zzbcy();
                } while (zzbcy2 == this.tag);
                this.zzhuh = zzbcy2;
                return;
            } else if (i == 2) {
                int zzbdh = this.zzhuf.zzbdh();
                zzgd(zzbdh);
                int zzbdp = this.zzhuf.zzbdp() + zzbdh;
                do {
                    zzedcVar.zzfs(this.zzhuf.zzbdk());
                } while (this.zzhuf.zzbdp() < zzbdp);
                return;
            } else {
                throw zzeco.zzbfl();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzhuf.zzbdk()));
                if (this.zzhuf.zzbdo()) {
                    return;
                }
                zzbcy = this.zzhuf.zzbcy();
            } while (zzbcy == this.tag);
            this.zzhuh = zzbcy;
        } else if (i2 == 2) {
            int zzbdh2 = this.zzhuf.zzbdh();
            zzgd(zzbdh2);
            int zzbdp2 = this.zzhuf.zzbdp() + zzbdh2;
            do {
                list.add(Long.valueOf(this.zzhuf.zzbdk()));
            } while (this.zzhuf.zzbdp() < zzbdp2);
        } else {
            throw zzeco.zzbfl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzx(List<Integer> list) throws IOException {
        int zzbcy;
        int zzbcy2;
        if (list instanceof zzece) {
            zzece zzeceVar = (zzece) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzeceVar.zzgw(this.zzhuf.zzbdl());
                    if (this.zzhuf.zzbdo()) {
                        return;
                    }
                    zzbcy2 = this.zzhuf.zzbcy();
                } while (zzbcy2 == this.tag);
                this.zzhuh = zzbcy2;
                return;
            } else if (i == 2) {
                int zzbdp = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
                do {
                    zzeceVar.zzgw(this.zzhuf.zzbdl());
                } while (this.zzhuf.zzbdp() < zzbdp);
                zzgf(zzbdp);
                return;
            } else {
                throw zzeco.zzbfl();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzhuf.zzbdl()));
                if (this.zzhuf.zzbdo()) {
                    return;
                }
                zzbcy = this.zzhuf.zzbcy();
            } while (zzbcy == this.tag);
            this.zzhuh = zzbcy;
        } else if (i2 == 2) {
            int zzbdp2 = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
            do {
                list.add(Integer.valueOf(this.zzhuf.zzbdl()));
            } while (this.zzhuf.zzbdp() < zzbdp2);
            zzgf(zzbdp2);
        } else {
            throw zzeco.zzbfl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final void zzy(List<Long> list) throws IOException {
        int zzbcy;
        int zzbcy2;
        if (list instanceof zzedc) {
            zzedc zzedcVar = (zzedc) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzedcVar.zzfs(this.zzhuf.zzbdm());
                    if (this.zzhuf.zzbdo()) {
                        return;
                    }
                    zzbcy2 = this.zzhuf.zzbcy();
                } while (zzbcy2 == this.tag);
                this.zzhuh = zzbcy2;
                return;
            } else if (i == 2) {
                int zzbdp = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
                do {
                    zzedcVar.zzfs(this.zzhuf.zzbdm());
                } while (this.zzhuf.zzbdp() < zzbdp);
                zzgf(zzbdp);
                return;
            } else {
                throw zzeco.zzbfl();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzhuf.zzbdm()));
                if (this.zzhuf.zzbdo()) {
                    return;
                }
                zzbcy = this.zzhuf.zzbcy();
            } while (zzbcy == this.tag);
            this.zzhuh = zzbcy;
        } else if (i2 == 2) {
            int zzbdp2 = this.zzhuf.zzbdp() + this.zzhuf.zzbdh();
            do {
                list.add(Long.valueOf(this.zzhuf.zzbdm()));
            } while (this.zzhuf.zzbdp() < zzbdp2);
            zzgf(zzbdp2);
        } else {
            throw zzeco.zzbfl();
        }
    }

    private static void zzgd(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzeco.zzbfn();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.ads.zzedf<K, V> r9, com.google.android.gms.internal.ads.zzebq r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.zzgc(r0)
            com.google.android.gms.internal.ads.zzebf r1 = r7.zzhuf
            int r1 = r1.zzbdh()
            com.google.android.gms.internal.ads.zzebf r2 = r7.zzhuf
            int r1 = r2.zzfu(r1)
            K r2 = r9.zzhzx
            V r3 = r9.zzcif
        L14:
            int r4 = r7.zzbdw()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            com.google.android.gms.internal.ads.zzebf r5 = r7.zzhuf     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.zzbdo()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.zzbdx()     // Catch: com.google.android.gms.internal.ads.zzecn -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.ads.zzeco r4 = new com.google.android.gms.internal.ads.zzeco     // Catch: com.google.android.gms.internal.ads.zzecn -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.ads.zzecn -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.android.gms.internal.ads.zzecn -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.ads.zzefp r4 = r9.zzhzy     // Catch: com.google.android.gms.internal.ads.zzecn -> L4e java.lang.Throwable -> L64
            V r5 = r9.zzcif     // Catch: com.google.android.gms.internal.ads.zzecn -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.android.gms.internal.ads.zzecn -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.zza(r4, r5, r10)     // Catch: com.google.android.gms.internal.ads.zzecn -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.ads.zzefp r4 = r9.zzhzw     // Catch: com.google.android.gms.internal.ads.zzecn -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.zza(r4, r5, r5)     // Catch: com.google.android.gms.internal.ads.zzecn -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.zzbdx()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.ads.zzeco r8 = new com.google.android.gms.internal.ads.zzeco     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.ads.zzebf r8 = r7.zzhuf
            r8.zzfv(r1)
            return
        L64:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzebf r9 = r7.zzhuf
            r9.zzfv(r1)
            goto L6c
        L6b:
            throw r8
        L6c:
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebi.zza(java.util.Map, com.google.android.gms.internal.ads.zzedf, com.google.android.gms.internal.ads.zzebq):void");
    }

    private final Object zza(zzefp zzefpVar, Class<?> cls, zzebq zzebqVar) throws IOException {
        switch (zzebl.zzhuk[zzefpVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzbde());
            case 2:
                return zzbdg();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzbdi());
            case 5:
                return Integer.valueOf(zzbdd());
            case 6:
                return Long.valueOf(zzbdc());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzbdb());
            case 9:
                return Long.valueOf(zzbda());
            case 10:
                zzgc(2);
                return zzc(zzedz.zzbgk().zzh(cls), zzebqVar);
            case 11:
                return Integer.valueOf(zzbdj());
            case 12:
                return Long.valueOf(zzbdk());
            case 13:
                return Integer.valueOf(zzbdl());
            case 14:
                return Long.valueOf(zzbdm());
            case 15:
                return zzbdf();
            case 16:
                return Integer.valueOf(zzbdh());
            case 17:
                return Long.valueOf(zzbcz());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void zzge(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzeco.zzbfn();
        }
    }

    private final void zzgf(int i) throws IOException {
        if (this.zzhuf.zzbdp() != i) {
            throw zzeco.zzbfg();
        }
    }
}
