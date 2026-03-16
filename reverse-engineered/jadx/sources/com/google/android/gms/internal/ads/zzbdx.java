package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbdx extends zzbdl implements zzoi<zznu> {
    private String url;
    private ByteBuffer zzalo;
    private final zzbby zzeet;
    private boolean zzehc;
    private final zzbdy zzehd;
    private final zzbdd zzehe;
    private boolean zzehf;
    private final Object zzehg;
    private boolean zzehh;

    public zzbdx(zzbbx zzbbxVar, zzbby zzbbyVar) {
        super(zzbbxVar);
        this.zzeet = zzbbyVar;
        this.zzehd = new zzbdy();
        this.zzehe = new zzbdd();
        this.zzehg = new Object();
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final /* bridge */ /* synthetic */ void zzc(zznu zznuVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final /* bridge */ /* synthetic */ void zze(zznu zznuVar) {
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean zzaal() {
        return this.zzehh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbdl
    public final String zzfm(String str) {
        String valueOf = String.valueOf(super.zzfm(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    private final void zzyx() {
        int zzaam = (int) this.zzehd.zzaam();
        int zzl = (int) this.zzehe.zzl(this.zzalo);
        int position = this.zzalo.position();
        int round = Math.round(zzl * (position / zzaam));
        boolean z = round > 0;
        int zzaai = zzbcu.zzaai();
        int zzaaj = zzbcu.zzaaj();
        String str = this.url;
        zza(str, zzfm(str), position, zzaam, round, zzl, z, zzaai, zzaaj);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:? -> B:53:0x013a). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzbdl
    public final boolean zzfl(String str) {
        String str2;
        this.url = str;
        String zzfm = zzfm(str);
        String str3 = "error";
        int i = 0;
        try {
            zznu zznxVar = new zznx(this.zzdym, null, this, this.zzeet.zzedu, this.zzeet.zzedw, true, null);
            if (this.zzeet.zzeea) {
                try {
                    zznxVar = new zzbcp(this.mContext, zznxVar, null, null);
                } catch (Exception e) {
                    e = e;
                    String canonicalName = e.getClass().getCanonicalName();
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length());
                    sb.append(canonicalName);
                    sb.append(":");
                    sb.append(message);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(sb2).length());
                    sb3.append("Failed to preload url ");
                    sb3.append(str);
                    sb3.append(" Exception: ");
                    sb3.append(sb2);
                    zzawr.zzfc(sb3.toString());
                    zza(str, zzfm, str3, sb2);
                    return false;
                }
            }
            zznxVar.zza(new zznv(Uri.parse(str)));
            zzbbx zzbbxVar = this.zzego.get();
            if (zzbbxVar != null) {
                zzbbxVar.zza(zzfm, this);
            }
            Clock zzld = com.google.android.gms.ads.internal.zzq.zzld();
            long currentTimeMillis = zzld.currentTimeMillis();
            long longValue = ((Long) zzvj.zzpv().zzd(zzzz.zzcjl)).longValue();
            long longValue2 = ((Long) zzvj.zzpv().zzd(zzzz.zzcjk)).longValue();
            this.zzalo = ByteBuffer.allocate(this.zzeet.zzedt);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j = currentTimeMillis;
            while (true) {
                int read = zznxVar.read(bArr, i, Math.min(this.zzalo.remaining(), i2));
                if (read == -1) {
                    this.zzehh = true;
                    zzb(str, zzfm, (int) this.zzehe.zzl(this.zzalo));
                    return true;
                }
                synchronized (this.zzehg) {
                    try {
                        if (this.zzehc) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                this.zzalo.put(bArr, 0, read);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.zzalo.remaining() <= 0) {
                                zzyx();
                                return true;
                            } else if (this.zzehc) {
                                int limit = this.zzalo.limit();
                                StringBuilder sb4 = new StringBuilder(35);
                                sb4.append("Precache abort at ");
                                sb4.append(limit);
                                sb4.append(" bytes");
                                throw new IOException(sb4.toString());
                            } else {
                                long currentTimeMillis2 = zzld.currentTimeMillis();
                                if (currentTimeMillis2 - j >= longValue) {
                                    zzyx();
                                    j = currentTimeMillis2;
                                }
                                if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                                    StringBuilder sb5 = new StringBuilder(49);
                                    sb5.append("Timeout exceeded. Limit: ");
                                    sb5.append(longValue2);
                                    sb5.append(" sec");
                                    throw new IOException(sb5.toString());
                                }
                                str3 = str2;
                                i2 = 8192;
                                i = 0;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = str2;
                            String canonicalName2 = e.getClass().getCanonicalName();
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length());
                            sb6.append(canonicalName2);
                            sb6.append(":");
                            sb6.append(message2);
                            String sb22 = sb6.toString();
                            StringBuilder sb32 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(sb22).length());
                            sb32.append("Failed to preload url ");
                            sb32.append(str);
                            sb32.append(" Exception: ");
                            sb32.append(sb22);
                            zzawr.zzfc(sb32.toString());
                            zza(str, zzfm, str3, sb22);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdl
    public final void abort() {
        this.zzehc = true;
    }

    public final ByteBuffer getByteBuffer() {
        synchronized (this.zzehg) {
            if (this.zzalo != null && !this.zzehf) {
                this.zzalo.flip();
                this.zzehf = true;
            }
            this.zzehc = true;
        }
        return this.zzalo;
    }

    @Override // com.google.android.gms.internal.ads.zzoi
    public final /* synthetic */ void zza(zznu zznuVar, zznv zznvVar) {
        zznu zznuVar2 = zznuVar;
        if (zznuVar2 instanceof zznx) {
            this.zzehd.zza((zznx) zznuVar2);
        }
    }
}
