package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzbo;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzlx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
public class zzks implements zzhj {
    private static volatile zzks zza;
    private zzgk zzb;
    private zzfq zzc;
    private zzac zzd;
    private zzft zze;
    private zzko zzf;
    private zzn zzg;
    private final zzkw zzh;
    private zzit zzi;
    private final zzgq zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private List<Runnable> zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private FileLock zzt;
    private FileChannel zzu;
    private List<Long> zzv;
    private List<Long> zzw;
    private long zzx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    /* loaded from: classes.dex */
    public class zza implements zzae {
        zzbr.zzg zza;
        List<Long> zzb;
        List<zzbr.zzc> zzc;
        private long zzd;

        private zza() {
        }

        @Override // com.google.android.gms.measurement.internal.zzae
        public final void zza(zzbr.zzg zzgVar) {
            Preconditions.checkNotNull(zzgVar);
            this.zza = zzgVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzae
        public final boolean zza(long j, zzbr.zzc zzcVar) {
            Preconditions.checkNotNull(zzcVar);
            if (this.zzc == null) {
                this.zzc = new ArrayList();
            }
            if (this.zzb == null) {
                this.zzb = new ArrayList();
            }
            if (this.zzc.size() <= 0 || zza(this.zzc.get(0)) == zza(zzcVar)) {
                long zzbn = this.zzd + zzcVar.zzbn();
                if (zzbn >= Math.max(0, zzap.zzh.zza(null).intValue())) {
                    return false;
                }
                this.zzd = zzbn;
                this.zzc.add(zzcVar);
                this.zzb.add(Long.valueOf(j));
                return this.zzc.size() < Math.max(1, zzap.zzi.zza(null).intValue());
            }
            return false;
        }

        private static long zza(zzbr.zzc zzcVar) {
            return ((zzcVar.zze() / 1000) / 60) / 60;
        }

        /* synthetic */ zza(zzks zzksVar, zzkr zzkrVar) {
            this();
        }
    }

    public static zzks zza(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zza == null) {
            synchronized (zzks.class) {
                if (zza == null) {
                    zza = new zzks(new zzkx(context));
                }
            }
        }
        return zza;
    }

    private zzks(zzkx zzkxVar) {
        this(zzkxVar, null);
    }

    private zzks(zzkx zzkxVar, zzgq zzgqVar) {
        this.zzk = false;
        Preconditions.checkNotNull(zzkxVar);
        this.zzj = zzgq.zza(zzkxVar.zza, (com.google.android.gms.internal.measurement.zzv) null);
        this.zzx = -1L;
        zzkw zzkwVar = new zzkw(this);
        zzkwVar.zzal();
        this.zzh = zzkwVar;
        zzfq zzfqVar = new zzfq(this);
        zzfqVar.zzal();
        this.zzc = zzfqVar;
        zzgk zzgkVar = new zzgk(this);
        zzgkVar.zzal();
        this.zzb = zzgkVar;
        this.zzj.zzq().zza(new zzkr(this, zzkxVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzkx zzkxVar) {
        this.zzj.zzq().zzd();
        zzac zzacVar = new zzac(this);
        zzacVar.zzal();
        this.zzd = zzacVar;
        this.zzj.zzb().zza(this.zzb);
        zzn zznVar = new zzn(this);
        zznVar.zzal();
        this.zzg = zznVar;
        zzit zzitVar = new zzit(this);
        zzitVar.zzal();
        this.zzi = zzitVar;
        zzko zzkoVar = new zzko(this);
        zzkoVar.zzal();
        this.zzf = zzkoVar;
        this.zze = new zzft(this);
        if (this.zzo != this.zzp) {
            this.zzj.zzr().zzf().zza("Not all upload components initialized", Integer.valueOf(this.zzo), Integer.valueOf(this.zzp));
        }
        this.zzk = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza() {
        this.zzj.zzq().zzd();
        zze().zzv();
        if (this.zzj.zzc().zzc.zza() == 0) {
            this.zzj.zzc().zzc.zza(this.zzj.zzm().currentTimeMillis());
        }
        zzz();
    }

    @Override // com.google.android.gms.measurement.internal.zzhj
    public final zzw zzu() {
        return this.zzj.zzu();
    }

    public final zzx zzb() {
        return this.zzj.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzhj
    public final zzfj zzr() {
        return this.zzj.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzhj
    public final zzgj zzq() {
        return this.zzj.zzq();
    }

    public final zzgk zzc() {
        zzb(this.zzb);
        return this.zzb;
    }

    public final zzfq zzd() {
        zzb(this.zzc);
        return this.zzc;
    }

    public final zzac zze() {
        zzb(this.zzd);
        return this.zzd;
    }

    private final zzft zzt() {
        zzft zzftVar = this.zze;
        if (zzftVar != null) {
            return zzftVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final zzko zzv() {
        zzb(this.zzf);
        return this.zzf;
    }

    public final zzn zzf() {
        zzb(this.zzg);
        return this.zzg;
    }

    public final zzit zzg() {
        zzb(this.zzi);
        return this.zzi;
    }

    public final zzkw zzh() {
        zzb(this.zzh);
        return this.zzh;
    }

    public final zzfh zzi() {
        return this.zzj.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzhj
    public final Context zzn() {
        return this.zzj.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzhj
    public final Clock zzm() {
        return this.zzj.zzm();
    }

    public final zzla zzj() {
        return this.zzj.zzi();
    }

    private final void zzw() {
        this.zzj.zzq().zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzk() {
        if (!this.zzk) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    private static void zzb(zzkp zzkpVar) {
        if (zzkpVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzkpVar.zzaj()) {
            return;
        }
        String valueOf = String.valueOf(zzkpVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private final long zzx() {
        long currentTimeMillis = this.zzj.zzm().currentTimeMillis();
        zzfv zzc = this.zzj.zzc();
        zzc.zzaa();
        zzc.zzd();
        long zza2 = zzc.zzg.zza();
        if (zza2 == 0) {
            zza2 = 1 + zzc.zzp().zzh().nextInt(86400000);
            zzc.zzg.zza(zza2);
        }
        return ((((currentTimeMillis + zza2) / 1000) / 60) / 60) / 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzan zzanVar, String str) {
        zzg zzb = zze().zzb(str);
        if (zzb == null || TextUtils.isEmpty(zzb.zzl())) {
            this.zzj.zzr().zzw().zza("No app data available; dropping event", str);
            return;
        }
        Boolean zzb2 = zzb(zzb);
        if (zzb2 == null) {
            if (!"_ui".equals(zzanVar.zza)) {
                this.zzj.zzr().zzi().zza("Could not find package. appId", zzfj.zza(str));
            }
        } else if (!zzb2.booleanValue()) {
            this.zzj.zzr().zzf().zza("App version does not match; dropping event. appId", zzfj.zza(str));
            return;
        }
        zza(zzanVar, new zzm(str, zzb.zze(), zzb.zzl(), zzb.zzm(), zzb.zzn(), zzb.zzo(), zzb.zzp(), (String) null, zzb.zzr(), false, zzb.zzi(), zzb.zzae(), 0L, 0, zzb.zzaf(), zzb.zzag(), false, zzb.zzf(), zzb.zzah(), zzb.zzq(), zzb.zzai(), (zzll.zzb() && this.zzj.zzb().zze(zzb.zzc(), zzap.zzch)) ? zzb.zzg() : null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzan zzanVar, zzm zzmVar) {
        List<zzv> zza2;
        List<zzv> zza3;
        List<zzv> zza4;
        zzan zzanVar2 = zzanVar;
        Preconditions.checkNotNull(zzmVar);
        Preconditions.checkNotEmpty(zzmVar.zza);
        zzw();
        zzk();
        String str = zzmVar.zza;
        long j = zzanVar2.zzd;
        if (zzh().zza(zzanVar2, zzmVar)) {
            if (!zzmVar.zzh) {
                zzc(zzmVar);
                return;
            }
            if (this.zzj.zzb().zze(str, zzap.zzbl) && zzmVar.zzu != null) {
                if (zzmVar.zzu.contains(zzanVar2.zza)) {
                    Bundle zzb = zzanVar2.zzb.zzb();
                    zzb.putLong("ga_safelisted", 1L);
                    zzanVar2 = new zzan(zzanVar2.zza, new zzam(zzb), zzanVar2.zzc, zzanVar2.zzd);
                } else {
                    this.zzj.zzr().zzw().zza("Dropping non-safelisted event. appId, event name, origin", str, zzanVar2.zza, zzanVar2.zzc);
                    return;
                }
            }
            zze().zzf();
            try {
                zzac zze = zze();
                Preconditions.checkNotEmpty(str);
                zze.zzd();
                zze.zzak();
                if (j < 0) {
                    zze.zzr().zzi().zza("Invalid time querying timed out conditional properties", zzfj.zza(str), Long.valueOf(j));
                    zza2 = Collections.emptyList();
                } else {
                    zza2 = zze.zza("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzv zzvVar : zza2) {
                    if (zzvVar != null) {
                        if (com.google.android.gms.internal.measurement.zzkz.zzb() && this.zzj.zzb().zze(zzmVar.zza, zzap.zzcy)) {
                            this.zzj.zzr().zzx().zza("User property timed out", zzvVar.zza, this.zzj.zzj().zzc(zzvVar.zzc.zza), zzvVar.zzc.zza());
                        } else {
                            this.zzj.zzr().zzw().zza("User property timed out", zzvVar.zza, this.zzj.zzj().zzc(zzvVar.zzc.zza), zzvVar.zzc.zza());
                        }
                        if (zzvVar.zzg != null) {
                            zzb(new zzan(zzvVar.zzg, j), zzmVar);
                        }
                        zze().zze(str, zzvVar.zzc.zza);
                    }
                }
                zzac zze2 = zze();
                Preconditions.checkNotEmpty(str);
                zze2.zzd();
                zze2.zzak();
                if (j < 0) {
                    zze2.zzr().zzi().zza("Invalid time querying expired conditional properties", zzfj.zza(str), Long.valueOf(j));
                    zza3 = Collections.emptyList();
                } else {
                    zza3 = zze2.zza("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(zza3.size());
                for (zzv zzvVar2 : zza3) {
                    if (zzvVar2 != null) {
                        if (com.google.android.gms.internal.measurement.zzkz.zzb() && this.zzj.zzb().zze(zzmVar.zza, zzap.zzcy)) {
                            this.zzj.zzr().zzx().zza("User property expired", zzvVar2.zza, this.zzj.zzj().zzc(zzvVar2.zzc.zza), zzvVar2.zzc.zza());
                        } else {
                            this.zzj.zzr().zzw().zza("User property expired", zzvVar2.zza, this.zzj.zzj().zzc(zzvVar2.zzc.zza), zzvVar2.zzc.zza());
                        }
                        zze().zzb(str, zzvVar2.zzc.zza);
                        if (zzvVar2.zzk != null) {
                            arrayList.add(zzvVar2.zzk);
                        }
                        zze().zze(str, zzvVar2.zzc.zza);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    zzb(new zzan((zzan) obj, j), zzmVar);
                }
                zzac zze3 = zze();
                String str2 = zzanVar2.zza;
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotEmpty(str2);
                zze3.zzd();
                zze3.zzak();
                if (j < 0) {
                    zze3.zzr().zzi().zza("Invalid time querying triggered conditional properties", zzfj.zza(str), zze3.zzo().zza(str2), Long.valueOf(j));
                    zza4 = Collections.emptyList();
                } else {
                    zza4 = zze3.zza("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList3 = new ArrayList(zza4.size());
                for (zzv zzvVar3 : zza4) {
                    if (zzvVar3 != null) {
                        zzkz zzkzVar = zzvVar3.zzc;
                        zzlb zzlbVar = new zzlb(zzvVar3.zza, zzvVar3.zzb, zzkzVar.zza, j, zzkzVar.zza());
                        if (zze().zza(zzlbVar)) {
                            if (com.google.android.gms.internal.measurement.zzkz.zzb() && this.zzj.zzb().zze(zzmVar.zza, zzap.zzcy)) {
                                this.zzj.zzr().zzx().zza("User property triggered", zzvVar3.zza, this.zzj.zzj().zzc(zzlbVar.zzc), zzlbVar.zze);
                            } else {
                                this.zzj.zzr().zzw().zza("User property triggered", zzvVar3.zza, this.zzj.zzj().zzc(zzlbVar.zzc), zzlbVar.zze);
                            }
                        } else {
                            this.zzj.zzr().zzf().zza("Too many active user properties, ignoring", zzfj.zza(zzvVar3.zza), this.zzj.zzj().zzc(zzlbVar.zzc), zzlbVar.zze);
                        }
                        if (zzvVar3.zzi != null) {
                            arrayList3.add(zzvVar3.zzi);
                        }
                        zzvVar3.zzc = new zzkz(zzlbVar);
                        zzvVar3.zze = true;
                        zze().zza(zzvVar3);
                    }
                }
                zzb(zzanVar2, zzmVar);
                ArrayList arrayList4 = arrayList3;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    zzb(new zzan((zzan) obj2, j), zzmVar);
                }
                zze().b_();
            } finally {
                zze().zzh();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:97|(1:99)(1:318)|100|(5:105|106|(1:108)|109|(0))|304|305|306|307|308|309|310|106|(0)|109|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0360, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0362, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0365, code lost:
        r7.zzr().zzf().zza("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzfj.zza(r15), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x039d A[Catch: all -> 0x0a81, TryCatch #1 {all -> 0x0a81, blocks: (B:48:0x01e8, B:50:0x01f1, B:54:0x0202, B:58:0x0210, B:60:0x021a, B:65:0x0226, B:72:0x0238, B:75:0x0244, B:77:0x025b, B:83:0x0277, B:85:0x0281, B:87:0x028f, B:92:0x02c0, B:94:0x02c6, B:96:0x02d4, B:98:0x02e0, B:100:0x02ea, B:102:0x02f5, B:105:0x02fc, B:118:0x0393, B:120:0x039d, B:124:0x03d4, B:128:0x03e6, B:130:0x03fa, B:132:0x040a, B:134:0x041b, B:136:0x044d, B:138:0x0452, B:139:0x046b, B:143:0x047c, B:145:0x0492, B:147:0x0497, B:148:0x04b0, B:153:0x04d5, B:157:0x04fb, B:158:0x0514, B:162:0x0524, B:165:0x0547, B:166:0x0563, B:169:0x056d, B:171:0x057d, B:173:0x0589, B:175:0x058f, B:176:0x059a, B:178:0x05a2, B:180:0x05b2, B:182:0x05c2, B:183:0x05ca, B:185:0x05d6, B:186:0x05ed, B:188:0x0617, B:191:0x0630, B:194:0x0673, B:196:0x069a, B:198:0x06d4, B:199:0x06d9, B:201:0x06e1, B:202:0x06e6, B:204:0x06ee, B:205:0x06f3, B:207:0x06fc, B:208:0x0702, B:210:0x070f, B:211:0x0714, B:213:0x071a, B:215:0x072a, B:217:0x0734, B:219:0x073c, B:220:0x0741, B:222:0x074b, B:224:0x0755, B:226:0x075d, B:232:0x077a, B:234:0x0782, B:235:0x0787, B:237:0x079c, B:239:0x07a6, B:240:0x07a9, B:242:0x07b7, B:244:0x07c1, B:246:0x07c5, B:248:0x07d0, B:260:0x083e, B:262:0x0886, B:263:0x088b, B:265:0x0893, B:267:0x089c, B:268:0x089f, B:270:0x08ab, B:272:0x090f, B:273:0x0914, B:274:0x0920, B:276:0x092a, B:277:0x0931, B:279:0x093b, B:280:0x0942, B:281:0x094d, B:283:0x0953, B:285:0x0984, B:286:0x0994, B:288:0x099c, B:289:0x09a2, B:291:0x09a8, B:300:0x09f0, B:302:0x09f6, B:305:0x0a12, B:307:0x0a1f, B:309:0x0a2f, B:311:0x0a3c, B:294:0x09b5, B:296:0x09db, B:304:0x09fa, B:249:0x07dc, B:251:0x07ee, B:253:0x07f2, B:255:0x0804, B:259:0x083b, B:256:0x081e, B:258:0x0824, B:227:0x0763, B:229:0x076d, B:231:0x0775, B:195:0x068c, B:106:0x0328, B:107:0x0346, B:109:0x035a, B:117:0x0376, B:116:0x0365, B:99:0x02e5, B:90:0x0299, B:91:0x02b6), top: B:320:0x01e8, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03d4 A[Catch: all -> 0x0a81, TRY_LEAVE, TryCatch #1 {all -> 0x0a81, blocks: (B:48:0x01e8, B:50:0x01f1, B:54:0x0202, B:58:0x0210, B:60:0x021a, B:65:0x0226, B:72:0x0238, B:75:0x0244, B:77:0x025b, B:83:0x0277, B:85:0x0281, B:87:0x028f, B:92:0x02c0, B:94:0x02c6, B:96:0x02d4, B:98:0x02e0, B:100:0x02ea, B:102:0x02f5, B:105:0x02fc, B:118:0x0393, B:120:0x039d, B:124:0x03d4, B:128:0x03e6, B:130:0x03fa, B:132:0x040a, B:134:0x041b, B:136:0x044d, B:138:0x0452, B:139:0x046b, B:143:0x047c, B:145:0x0492, B:147:0x0497, B:148:0x04b0, B:153:0x04d5, B:157:0x04fb, B:158:0x0514, B:162:0x0524, B:165:0x0547, B:166:0x0563, B:169:0x056d, B:171:0x057d, B:173:0x0589, B:175:0x058f, B:176:0x059a, B:178:0x05a2, B:180:0x05b2, B:182:0x05c2, B:183:0x05ca, B:185:0x05d6, B:186:0x05ed, B:188:0x0617, B:191:0x0630, B:194:0x0673, B:196:0x069a, B:198:0x06d4, B:199:0x06d9, B:201:0x06e1, B:202:0x06e6, B:204:0x06ee, B:205:0x06f3, B:207:0x06fc, B:208:0x0702, B:210:0x070f, B:211:0x0714, B:213:0x071a, B:215:0x072a, B:217:0x0734, B:219:0x073c, B:220:0x0741, B:222:0x074b, B:224:0x0755, B:226:0x075d, B:232:0x077a, B:234:0x0782, B:235:0x0787, B:237:0x079c, B:239:0x07a6, B:240:0x07a9, B:242:0x07b7, B:244:0x07c1, B:246:0x07c5, B:248:0x07d0, B:260:0x083e, B:262:0x0886, B:263:0x088b, B:265:0x0893, B:267:0x089c, B:268:0x089f, B:270:0x08ab, B:272:0x090f, B:273:0x0914, B:274:0x0920, B:276:0x092a, B:277:0x0931, B:279:0x093b, B:280:0x0942, B:281:0x094d, B:283:0x0953, B:285:0x0984, B:286:0x0994, B:288:0x099c, B:289:0x09a2, B:291:0x09a8, B:300:0x09f0, B:302:0x09f6, B:305:0x0a12, B:307:0x0a1f, B:309:0x0a2f, B:311:0x0a3c, B:294:0x09b5, B:296:0x09db, B:304:0x09fa, B:249:0x07dc, B:251:0x07ee, B:253:0x07f2, B:255:0x0804, B:259:0x083b, B:256:0x081e, B:258:0x0824, B:227:0x0763, B:229:0x076d, B:231:0x0775, B:195:0x068c, B:106:0x0328, B:107:0x0346, B:109:0x035a, B:117:0x0376, B:116:0x0365, B:99:0x02e5, B:90:0x0299, B:91:0x02b6), top: B:320:0x01e8, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03fa A[Catch: all -> 0x0a81, TryCatch #1 {all -> 0x0a81, blocks: (B:48:0x01e8, B:50:0x01f1, B:54:0x0202, B:58:0x0210, B:60:0x021a, B:65:0x0226, B:72:0x0238, B:75:0x0244, B:77:0x025b, B:83:0x0277, B:85:0x0281, B:87:0x028f, B:92:0x02c0, B:94:0x02c6, B:96:0x02d4, B:98:0x02e0, B:100:0x02ea, B:102:0x02f5, B:105:0x02fc, B:118:0x0393, B:120:0x039d, B:124:0x03d4, B:128:0x03e6, B:130:0x03fa, B:132:0x040a, B:134:0x041b, B:136:0x044d, B:138:0x0452, B:139:0x046b, B:143:0x047c, B:145:0x0492, B:147:0x0497, B:148:0x04b0, B:153:0x04d5, B:157:0x04fb, B:158:0x0514, B:162:0x0524, B:165:0x0547, B:166:0x0563, B:169:0x056d, B:171:0x057d, B:173:0x0589, B:175:0x058f, B:176:0x059a, B:178:0x05a2, B:180:0x05b2, B:182:0x05c2, B:183:0x05ca, B:185:0x05d6, B:186:0x05ed, B:188:0x0617, B:191:0x0630, B:194:0x0673, B:196:0x069a, B:198:0x06d4, B:199:0x06d9, B:201:0x06e1, B:202:0x06e6, B:204:0x06ee, B:205:0x06f3, B:207:0x06fc, B:208:0x0702, B:210:0x070f, B:211:0x0714, B:213:0x071a, B:215:0x072a, B:217:0x0734, B:219:0x073c, B:220:0x0741, B:222:0x074b, B:224:0x0755, B:226:0x075d, B:232:0x077a, B:234:0x0782, B:235:0x0787, B:237:0x079c, B:239:0x07a6, B:240:0x07a9, B:242:0x07b7, B:244:0x07c1, B:246:0x07c5, B:248:0x07d0, B:260:0x083e, B:262:0x0886, B:263:0x088b, B:265:0x0893, B:267:0x089c, B:268:0x089f, B:270:0x08ab, B:272:0x090f, B:273:0x0914, B:274:0x0920, B:276:0x092a, B:277:0x0931, B:279:0x093b, B:280:0x0942, B:281:0x094d, B:283:0x0953, B:285:0x0984, B:286:0x0994, B:288:0x099c, B:289:0x09a2, B:291:0x09a8, B:300:0x09f0, B:302:0x09f6, B:305:0x0a12, B:307:0x0a1f, B:309:0x0a2f, B:311:0x0a3c, B:294:0x09b5, B:296:0x09db, B:304:0x09fa, B:249:0x07dc, B:251:0x07ee, B:253:0x07f2, B:255:0x0804, B:259:0x083b, B:256:0x081e, B:258:0x0824, B:227:0x0763, B:229:0x076d, B:231:0x0775, B:195:0x068c, B:106:0x0328, B:107:0x0346, B:109:0x035a, B:117:0x0376, B:116:0x0365, B:99:0x02e5, B:90:0x0299, B:91:0x02b6), top: B:320:0x01e8, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x044d A[Catch: all -> 0x0a81, TryCatch #1 {all -> 0x0a81, blocks: (B:48:0x01e8, B:50:0x01f1, B:54:0x0202, B:58:0x0210, B:60:0x021a, B:65:0x0226, B:72:0x0238, B:75:0x0244, B:77:0x025b, B:83:0x0277, B:85:0x0281, B:87:0x028f, B:92:0x02c0, B:94:0x02c6, B:96:0x02d4, B:98:0x02e0, B:100:0x02ea, B:102:0x02f5, B:105:0x02fc, B:118:0x0393, B:120:0x039d, B:124:0x03d4, B:128:0x03e6, B:130:0x03fa, B:132:0x040a, B:134:0x041b, B:136:0x044d, B:138:0x0452, B:139:0x046b, B:143:0x047c, B:145:0x0492, B:147:0x0497, B:148:0x04b0, B:153:0x04d5, B:157:0x04fb, B:158:0x0514, B:162:0x0524, B:165:0x0547, B:166:0x0563, B:169:0x056d, B:171:0x057d, B:173:0x0589, B:175:0x058f, B:176:0x059a, B:178:0x05a2, B:180:0x05b2, B:182:0x05c2, B:183:0x05ca, B:185:0x05d6, B:186:0x05ed, B:188:0x0617, B:191:0x0630, B:194:0x0673, B:196:0x069a, B:198:0x06d4, B:199:0x06d9, B:201:0x06e1, B:202:0x06e6, B:204:0x06ee, B:205:0x06f3, B:207:0x06fc, B:208:0x0702, B:210:0x070f, B:211:0x0714, B:213:0x071a, B:215:0x072a, B:217:0x0734, B:219:0x073c, B:220:0x0741, B:222:0x074b, B:224:0x0755, B:226:0x075d, B:232:0x077a, B:234:0x0782, B:235:0x0787, B:237:0x079c, B:239:0x07a6, B:240:0x07a9, B:242:0x07b7, B:244:0x07c1, B:246:0x07c5, B:248:0x07d0, B:260:0x083e, B:262:0x0886, B:263:0x088b, B:265:0x0893, B:267:0x089c, B:268:0x089f, B:270:0x08ab, B:272:0x090f, B:273:0x0914, B:274:0x0920, B:276:0x092a, B:277:0x0931, B:279:0x093b, B:280:0x0942, B:281:0x094d, B:283:0x0953, B:285:0x0984, B:286:0x0994, B:288:0x099c, B:289:0x09a2, B:291:0x09a8, B:300:0x09f0, B:302:0x09f6, B:305:0x0a12, B:307:0x0a1f, B:309:0x0a2f, B:311:0x0a3c, B:294:0x09b5, B:296:0x09db, B:304:0x09fa, B:249:0x07dc, B:251:0x07ee, B:253:0x07f2, B:255:0x0804, B:259:0x083b, B:256:0x081e, B:258:0x0824, B:227:0x0763, B:229:0x076d, B:231:0x0775, B:195:0x068c, B:106:0x0328, B:107:0x0346, B:109:0x035a, B:117:0x0376, B:116:0x0365, B:99:0x02e5, B:90:0x0299, B:91:0x02b6), top: B:320:0x01e8, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0238 A[Catch: all -> 0x0a81, TRY_LEAVE, TryCatch #1 {all -> 0x0a81, blocks: (B:48:0x01e8, B:50:0x01f1, B:54:0x0202, B:58:0x0210, B:60:0x021a, B:65:0x0226, B:72:0x0238, B:75:0x0244, B:77:0x025b, B:83:0x0277, B:85:0x0281, B:87:0x028f, B:92:0x02c0, B:94:0x02c6, B:96:0x02d4, B:98:0x02e0, B:100:0x02ea, B:102:0x02f5, B:105:0x02fc, B:118:0x0393, B:120:0x039d, B:124:0x03d4, B:128:0x03e6, B:130:0x03fa, B:132:0x040a, B:134:0x041b, B:136:0x044d, B:138:0x0452, B:139:0x046b, B:143:0x047c, B:145:0x0492, B:147:0x0497, B:148:0x04b0, B:153:0x04d5, B:157:0x04fb, B:158:0x0514, B:162:0x0524, B:165:0x0547, B:166:0x0563, B:169:0x056d, B:171:0x057d, B:173:0x0589, B:175:0x058f, B:176:0x059a, B:178:0x05a2, B:180:0x05b2, B:182:0x05c2, B:183:0x05ca, B:185:0x05d6, B:186:0x05ed, B:188:0x0617, B:191:0x0630, B:194:0x0673, B:196:0x069a, B:198:0x06d4, B:199:0x06d9, B:201:0x06e1, B:202:0x06e6, B:204:0x06ee, B:205:0x06f3, B:207:0x06fc, B:208:0x0702, B:210:0x070f, B:211:0x0714, B:213:0x071a, B:215:0x072a, B:217:0x0734, B:219:0x073c, B:220:0x0741, B:222:0x074b, B:224:0x0755, B:226:0x075d, B:232:0x077a, B:234:0x0782, B:235:0x0787, B:237:0x079c, B:239:0x07a6, B:240:0x07a9, B:242:0x07b7, B:244:0x07c1, B:246:0x07c5, B:248:0x07d0, B:260:0x083e, B:262:0x0886, B:263:0x088b, B:265:0x0893, B:267:0x089c, B:268:0x089f, B:270:0x08ab, B:272:0x090f, B:273:0x0914, B:274:0x0920, B:276:0x092a, B:277:0x0931, B:279:0x093b, B:280:0x0942, B:281:0x094d, B:283:0x0953, B:285:0x0984, B:286:0x0994, B:288:0x099c, B:289:0x09a2, B:291:0x09a8, B:300:0x09f0, B:302:0x09f6, B:305:0x0a12, B:307:0x0a1f, B:309:0x0a2f, B:311:0x0a3c, B:294:0x09b5, B:296:0x09db, B:304:0x09fa, B:249:0x07dc, B:251:0x07ee, B:253:0x07f2, B:255:0x0804, B:259:0x083b, B:256:0x081e, B:258:0x0824, B:227:0x0763, B:229:0x076d, B:231:0x0775, B:195:0x068c, B:106:0x0328, B:107:0x0346, B:109:0x035a, B:117:0x0376, B:116:0x0365, B:99:0x02e5, B:90:0x0299, B:91:0x02b6), top: B:320:0x01e8, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzb(com.google.android.gms.measurement.internal.zzan r31, com.google.android.gms.measurement.internal.zzm r32) {
        /*
            Method dump skipped, instructions count: 2701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzks.zzb(com.google.android.gms.measurement.internal.zzan, com.google.android.gms.measurement.internal.zzm):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzl() {
        zzg zzb;
        String str;
        zzw();
        zzk();
        this.zzs = true;
        try {
            this.zzj.zzu();
            Boolean zzag = this.zzj.zzw().zzag();
            if (zzag == null) {
                this.zzj.zzr().zzi().zza("Upload data called on the client side before use of service was decided");
            } else if (zzag.booleanValue()) {
                this.zzj.zzr().zzf().zza("Upload called in the client side when service should be used");
            } else if (this.zzm > 0) {
                zzz();
            } else {
                zzw();
                if (this.zzv != null) {
                    this.zzj.zzr().zzx().zza("Uploading requested multiple times");
                } else if (!zzd().zzf()) {
                    this.zzj.zzr().zzx().zza("Network not connected, ignoring upload request");
                    zzz();
                } else {
                    long currentTimeMillis = this.zzj.zzm().currentTimeMillis();
                    int zzb2 = zzlx.zzb() ? this.zzj.zzb().zzb(null, zzap.zzap) : 1;
                    if (zzb2 > 1) {
                        long zzv = currentTimeMillis - zzx.zzv();
                        for (int i = 0; i < zzb2 && zza((String) null, zzv); i++) {
                        }
                    } else {
                        zza((String) null, currentTimeMillis - zzx.zzv());
                    }
                    long zza2 = this.zzj.zzc().zzc.zza();
                    if (zza2 != 0) {
                        this.zzj.zzr().zzw().zza("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - zza2)));
                    }
                    String d_ = zze().d_();
                    if (!TextUtils.isEmpty(d_)) {
                        if (this.zzx == -1) {
                            this.zzx = zze().zzaa();
                        }
                        List<Pair<zzbr.zzg, Long>> zza3 = zze().zza(d_, this.zzj.zzb().zzb(d_, zzap.zzf), Math.max(0, this.zzj.zzb().zzb(d_, zzap.zzg)));
                        if (!zza3.isEmpty()) {
                            Iterator<Pair<zzbr.zzg, Long>> it = zza3.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    str = null;
                                    break;
                                }
                                zzbr.zzg zzgVar = (zzbr.zzg) it.next().first;
                                if (!TextUtils.isEmpty(zzgVar.zzad())) {
                                    str = zzgVar.zzad();
                                    break;
                                }
                            }
                            if (str != null) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= zza3.size()) {
                                        break;
                                    }
                                    zzbr.zzg zzgVar2 = (zzbr.zzg) zza3.get(i2).first;
                                    if (!TextUtils.isEmpty(zzgVar2.zzad()) && !zzgVar2.zzad().equals(str)) {
                                        zza3 = zza3.subList(0, i2);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            zzbr.zzf.zza zzb3 = zzbr.zzf.zzb();
                            int size = zza3.size();
                            ArrayList arrayList = new ArrayList(zza3.size());
                            boolean zzf = this.zzj.zzb().zzf(d_);
                            for (int i3 = 0; i3 < size; i3++) {
                                zzbr.zzg.zza zzbm = ((zzbr.zzg) zza3.get(i3).first).zzbm();
                                arrayList.add((Long) zza3.get(i3).second);
                                zzbr.zzg.zza zza4 = zzbm.zzg(this.zzj.zzb().zzf()).zza(currentTimeMillis);
                                this.zzj.zzu();
                                zza4.zzb(false);
                                if (!zzf) {
                                    zzbm.zzn();
                                }
                                if (this.zzj.zzb().zze(d_, zzap.zzbh)) {
                                    zzbm.zzl(zzh().zza(((zzbr.zzg) ((com.google.android.gms.internal.measurement.zzfd) zzbm.zzu())).zzbi()));
                                }
                                zzb3.zza(zzbm);
                            }
                            String zza5 = this.zzj.zzr().zza(2) ? zzh().zza((zzbr.zzf) ((com.google.android.gms.internal.measurement.zzfd) zzb3.zzu())) : null;
                            zzh();
                            byte[] zzbi = ((zzbr.zzf) ((com.google.android.gms.internal.measurement.zzfd) zzb3.zzu())).zzbi();
                            String zza6 = zzap.zzp.zza(null);
                            try {
                                URL url = new URL(zza6);
                                Preconditions.checkArgument(!arrayList.isEmpty());
                                if (this.zzv != null) {
                                    this.zzj.zzr().zzf().zza("Set uploading progress before finishing the previous upload");
                                } else {
                                    this.zzv = new ArrayList(arrayList);
                                }
                                this.zzj.zzc().zzd.zza(currentTimeMillis);
                                this.zzj.zzr().zzx().zza("Uploading data. app, uncompressed size, data", size > 0 ? zzb3.zza(0).zzx() : "?", Integer.valueOf(zzbi.length), zza5);
                                this.zzr = true;
                                zzfq zzd = zzd();
                                zzku zzkuVar = new zzku(this, d_);
                                zzd.zzd();
                                zzd.zzak();
                                Preconditions.checkNotNull(url);
                                Preconditions.checkNotNull(zzbi);
                                Preconditions.checkNotNull(zzkuVar);
                                zzd.zzq().zzb(new zzfu(zzd, d_, url, zzbi, null, zzkuVar));
                            } catch (MalformedURLException unused) {
                                this.zzj.zzr().zzf().zza("Failed to parse upload URL. Not uploading. appId", zzfj.zza(d_), zza6);
                            }
                        }
                    } else {
                        this.zzx = -1L;
                        String zza7 = zze().zza(currentTimeMillis - zzx.zzv());
                        if (!TextUtils.isEmpty(zza7) && (zzb = zze().zzb(zza7)) != null) {
                            zza(zzb);
                        }
                    }
                }
            }
        } finally {
            this.zzs = false;
            zzaa();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0264 A[Catch: all -> 0x1037, TRY_ENTER, TryCatch #4 {all -> 0x1037, blocks: (B:3:0x000d, B:23:0x0086, B:101:0x0267, B:103:0x026b, B:109:0x0279, B:110:0x02a2, B:113:0x02ba, B:116:0x02e2, B:118:0x0319, B:124:0x032f, B:126:0x0339, B:308:0x08bb, B:128:0x035f, B:131:0x0377, B:160:0x03da, B:163:0x03e4, B:165:0x03f2, B:170:0x0443, B:166:0x0413, B:168:0x0422, B:174:0x0450, B:177:0x0489, B:179:0x04ba, B:181:0x04ee, B:183:0x04f4, B:186:0x0500, B:188:0x0535, B:189:0x0552, B:191:0x0558, B:193:0x0566, B:197:0x057c, B:194:0x0571, B:200:0x0583, B:202:0x0589, B:203:0x05a7, B:205:0x05c2, B:206:0x05ce, B:209:0x05d8, B:215:0x05fb, B:212:0x05ea, B:218:0x0601, B:220:0x060d, B:222:0x0619, B:238:0x0668, B:241:0x0685, B:243:0x0699, B:245:0x06a4, B:248:0x06b7, B:250:0x06ca, B:252:0x06d8, B:297:0x0840, B:299:0x084a, B:301:0x0850, B:302:0x086a, B:304:0x087e, B:305:0x0898, B:307:0x08a1, B:257:0x06fe, B:259:0x070e, B:262:0x0723, B:264:0x0736, B:266:0x0744, B:269:0x0757, B:271:0x076f, B:273:0x077b, B:276:0x078e, B:278:0x07a2, B:280:0x07ed, B:282:0x07f4, B:284:0x07fa, B:286:0x0805, B:288:0x080c, B:290:0x0812, B:292:0x081d, B:293:0x082e, B:226:0x063a, B:230:0x064e, B:232:0x0654, B:235:0x065f, B:138:0x0399, B:141:0x03a3, B:144:0x03ad, B:313:0x08d5, B:315:0x08e3, B:317:0x08ec, B:328:0x091e, B:318:0x08f4, B:320:0x08fd, B:322:0x0903, B:325:0x090f, B:327:0x0919, B:331:0x0925, B:334:0x093d, B:335:0x0945, B:337:0x094b, B:342:0x0962, B:343:0x096d, B:345:0x0973, B:347:0x0985, B:352:0x0992, B:354:0x0998, B:357:0x09a3, B:359:0x09b7, B:360:0x09cf, B:365:0x0a09, B:367:0x0a1b, B:369:0x0a3a, B:371:0x0a48, B:373:0x0a4e, B:375:0x0a58, B:376:0x0a8a, B:378:0x0a90, B:380:0x0a9e, B:384:0x0aa9, B:381:0x0aa3, B:385:0x0aac, B:387:0x0abe, B:388:0x0ac1, B:390:0x0afe, B:391:0x0b13, B:393:0x0b19, B:396:0x0b33, B:398:0x0b4f, B:399:0x0b60, B:401:0x0b64, B:403:0x0b70, B:404:0x0b79, B:406:0x0b7d, B:408:0x0b85, B:409:0x0b94, B:410:0x0b9f, B:487:0x0e3a, B:412:0x0baa, B:416:0x0be0, B:417:0x0be8, B:419:0x0bee, B:421:0x0c00, B:423:0x0c04, B:437:0x0c3a, B:440:0x0c50, B:441:0x0c77, B:443:0x0c83, B:445:0x0c97, B:447:0x0cc6, B:450:0x0d12, B:454:0x0d2b, B:456:0x0d32, B:458:0x0d43, B:460:0x0d47, B:462:0x0d4b, B:464:0x0d4f, B:465:0x0d5b, B:466:0x0d60, B:468:0x0d66, B:470:0x0d83, B:471:0x0d8c, B:486:0x0e37, B:472:0x0da5, B:474:0x0dad, B:478:0x0dd7, B:480:0x0e03, B:481:0x0e11, B:482:0x0e21, B:484:0x0e27, B:475:0x0dbe, B:448:0x0cec, B:425:0x0c12, B:427:0x0c16, B:429:0x0c20, B:431:0x0c24, B:488:0x0e43, B:490:0x0e50, B:491:0x0e57, B:492:0x0e5f, B:494:0x0e65, B:496:0x0e7c, B:498:0x0e8e, B:499:0x0e91, B:501:0x0ea3, B:521:0x0f18, B:523:0x0f1e, B:525:0x0f33, B:528:0x0f3a, B:533:0x0f6d, B:529:0x0f42, B:531:0x0f4e, B:532:0x0f54, B:534:0x0f7e, B:535:0x0f95, B:538:0x0f9d, B:539:0x0fa2, B:540:0x0fb2, B:542:0x0fcc, B:543:0x0fe5, B:544:0x0fed, B:549:0x100f, B:548:0x0ffe, B:502:0x0ebd, B:504:0x0ec3, B:506:0x0ecd, B:508:0x0ed4, B:514:0x0ee4, B:516:0x0eeb, B:518:0x0f0a, B:520:0x0f11, B:519:0x0f0e, B:515:0x0ee8, B:507:0x0ed1, B:361:0x09e7, B:362:0x09ec, B:364:0x09fe, B:552:0x101f, B:49:0x0127, B:64:0x01cc, B:73:0x0206, B:81:0x0225, B:87:0x023e, B:100:0x0264, B:558:0x1033, B:559:0x1036, B:41:0x00dd, B:52:0x0130), top: B:572:0x000d, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x026b A[Catch: all -> 0x1037, TryCatch #4 {all -> 0x1037, blocks: (B:3:0x000d, B:23:0x0086, B:101:0x0267, B:103:0x026b, B:109:0x0279, B:110:0x02a2, B:113:0x02ba, B:116:0x02e2, B:118:0x0319, B:124:0x032f, B:126:0x0339, B:308:0x08bb, B:128:0x035f, B:131:0x0377, B:160:0x03da, B:163:0x03e4, B:165:0x03f2, B:170:0x0443, B:166:0x0413, B:168:0x0422, B:174:0x0450, B:177:0x0489, B:179:0x04ba, B:181:0x04ee, B:183:0x04f4, B:186:0x0500, B:188:0x0535, B:189:0x0552, B:191:0x0558, B:193:0x0566, B:197:0x057c, B:194:0x0571, B:200:0x0583, B:202:0x0589, B:203:0x05a7, B:205:0x05c2, B:206:0x05ce, B:209:0x05d8, B:215:0x05fb, B:212:0x05ea, B:218:0x0601, B:220:0x060d, B:222:0x0619, B:238:0x0668, B:241:0x0685, B:243:0x0699, B:245:0x06a4, B:248:0x06b7, B:250:0x06ca, B:252:0x06d8, B:297:0x0840, B:299:0x084a, B:301:0x0850, B:302:0x086a, B:304:0x087e, B:305:0x0898, B:307:0x08a1, B:257:0x06fe, B:259:0x070e, B:262:0x0723, B:264:0x0736, B:266:0x0744, B:269:0x0757, B:271:0x076f, B:273:0x077b, B:276:0x078e, B:278:0x07a2, B:280:0x07ed, B:282:0x07f4, B:284:0x07fa, B:286:0x0805, B:288:0x080c, B:290:0x0812, B:292:0x081d, B:293:0x082e, B:226:0x063a, B:230:0x064e, B:232:0x0654, B:235:0x065f, B:138:0x0399, B:141:0x03a3, B:144:0x03ad, B:313:0x08d5, B:315:0x08e3, B:317:0x08ec, B:328:0x091e, B:318:0x08f4, B:320:0x08fd, B:322:0x0903, B:325:0x090f, B:327:0x0919, B:331:0x0925, B:334:0x093d, B:335:0x0945, B:337:0x094b, B:342:0x0962, B:343:0x096d, B:345:0x0973, B:347:0x0985, B:352:0x0992, B:354:0x0998, B:357:0x09a3, B:359:0x09b7, B:360:0x09cf, B:365:0x0a09, B:367:0x0a1b, B:369:0x0a3a, B:371:0x0a48, B:373:0x0a4e, B:375:0x0a58, B:376:0x0a8a, B:378:0x0a90, B:380:0x0a9e, B:384:0x0aa9, B:381:0x0aa3, B:385:0x0aac, B:387:0x0abe, B:388:0x0ac1, B:390:0x0afe, B:391:0x0b13, B:393:0x0b19, B:396:0x0b33, B:398:0x0b4f, B:399:0x0b60, B:401:0x0b64, B:403:0x0b70, B:404:0x0b79, B:406:0x0b7d, B:408:0x0b85, B:409:0x0b94, B:410:0x0b9f, B:487:0x0e3a, B:412:0x0baa, B:416:0x0be0, B:417:0x0be8, B:419:0x0bee, B:421:0x0c00, B:423:0x0c04, B:437:0x0c3a, B:440:0x0c50, B:441:0x0c77, B:443:0x0c83, B:445:0x0c97, B:447:0x0cc6, B:450:0x0d12, B:454:0x0d2b, B:456:0x0d32, B:458:0x0d43, B:460:0x0d47, B:462:0x0d4b, B:464:0x0d4f, B:465:0x0d5b, B:466:0x0d60, B:468:0x0d66, B:470:0x0d83, B:471:0x0d8c, B:486:0x0e37, B:472:0x0da5, B:474:0x0dad, B:478:0x0dd7, B:480:0x0e03, B:481:0x0e11, B:482:0x0e21, B:484:0x0e27, B:475:0x0dbe, B:448:0x0cec, B:425:0x0c12, B:427:0x0c16, B:429:0x0c20, B:431:0x0c24, B:488:0x0e43, B:490:0x0e50, B:491:0x0e57, B:492:0x0e5f, B:494:0x0e65, B:496:0x0e7c, B:498:0x0e8e, B:499:0x0e91, B:501:0x0ea3, B:521:0x0f18, B:523:0x0f1e, B:525:0x0f33, B:528:0x0f3a, B:533:0x0f6d, B:529:0x0f42, B:531:0x0f4e, B:532:0x0f54, B:534:0x0f7e, B:535:0x0f95, B:538:0x0f9d, B:539:0x0fa2, B:540:0x0fb2, B:542:0x0fcc, B:543:0x0fe5, B:544:0x0fed, B:549:0x100f, B:548:0x0ffe, B:502:0x0ebd, B:504:0x0ec3, B:506:0x0ecd, B:508:0x0ed4, B:514:0x0ee4, B:516:0x0eeb, B:518:0x0f0a, B:520:0x0f11, B:519:0x0f0e, B:515:0x0ee8, B:507:0x0ed1, B:361:0x09e7, B:362:0x09ec, B:364:0x09fe, B:552:0x101f, B:49:0x0127, B:64:0x01cc, B:73:0x0206, B:81:0x0225, B:87:0x023e, B:100:0x0264, B:558:0x1033, B:559:0x1036, B:41:0x00dd, B:52:0x0130), top: B:572:0x000d, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0279 A[Catch: all -> 0x1037, TryCatch #4 {all -> 0x1037, blocks: (B:3:0x000d, B:23:0x0086, B:101:0x0267, B:103:0x026b, B:109:0x0279, B:110:0x02a2, B:113:0x02ba, B:116:0x02e2, B:118:0x0319, B:124:0x032f, B:126:0x0339, B:308:0x08bb, B:128:0x035f, B:131:0x0377, B:160:0x03da, B:163:0x03e4, B:165:0x03f2, B:170:0x0443, B:166:0x0413, B:168:0x0422, B:174:0x0450, B:177:0x0489, B:179:0x04ba, B:181:0x04ee, B:183:0x04f4, B:186:0x0500, B:188:0x0535, B:189:0x0552, B:191:0x0558, B:193:0x0566, B:197:0x057c, B:194:0x0571, B:200:0x0583, B:202:0x0589, B:203:0x05a7, B:205:0x05c2, B:206:0x05ce, B:209:0x05d8, B:215:0x05fb, B:212:0x05ea, B:218:0x0601, B:220:0x060d, B:222:0x0619, B:238:0x0668, B:241:0x0685, B:243:0x0699, B:245:0x06a4, B:248:0x06b7, B:250:0x06ca, B:252:0x06d8, B:297:0x0840, B:299:0x084a, B:301:0x0850, B:302:0x086a, B:304:0x087e, B:305:0x0898, B:307:0x08a1, B:257:0x06fe, B:259:0x070e, B:262:0x0723, B:264:0x0736, B:266:0x0744, B:269:0x0757, B:271:0x076f, B:273:0x077b, B:276:0x078e, B:278:0x07a2, B:280:0x07ed, B:282:0x07f4, B:284:0x07fa, B:286:0x0805, B:288:0x080c, B:290:0x0812, B:292:0x081d, B:293:0x082e, B:226:0x063a, B:230:0x064e, B:232:0x0654, B:235:0x065f, B:138:0x0399, B:141:0x03a3, B:144:0x03ad, B:313:0x08d5, B:315:0x08e3, B:317:0x08ec, B:328:0x091e, B:318:0x08f4, B:320:0x08fd, B:322:0x0903, B:325:0x090f, B:327:0x0919, B:331:0x0925, B:334:0x093d, B:335:0x0945, B:337:0x094b, B:342:0x0962, B:343:0x096d, B:345:0x0973, B:347:0x0985, B:352:0x0992, B:354:0x0998, B:357:0x09a3, B:359:0x09b7, B:360:0x09cf, B:365:0x0a09, B:367:0x0a1b, B:369:0x0a3a, B:371:0x0a48, B:373:0x0a4e, B:375:0x0a58, B:376:0x0a8a, B:378:0x0a90, B:380:0x0a9e, B:384:0x0aa9, B:381:0x0aa3, B:385:0x0aac, B:387:0x0abe, B:388:0x0ac1, B:390:0x0afe, B:391:0x0b13, B:393:0x0b19, B:396:0x0b33, B:398:0x0b4f, B:399:0x0b60, B:401:0x0b64, B:403:0x0b70, B:404:0x0b79, B:406:0x0b7d, B:408:0x0b85, B:409:0x0b94, B:410:0x0b9f, B:487:0x0e3a, B:412:0x0baa, B:416:0x0be0, B:417:0x0be8, B:419:0x0bee, B:421:0x0c00, B:423:0x0c04, B:437:0x0c3a, B:440:0x0c50, B:441:0x0c77, B:443:0x0c83, B:445:0x0c97, B:447:0x0cc6, B:450:0x0d12, B:454:0x0d2b, B:456:0x0d32, B:458:0x0d43, B:460:0x0d47, B:462:0x0d4b, B:464:0x0d4f, B:465:0x0d5b, B:466:0x0d60, B:468:0x0d66, B:470:0x0d83, B:471:0x0d8c, B:486:0x0e37, B:472:0x0da5, B:474:0x0dad, B:478:0x0dd7, B:480:0x0e03, B:481:0x0e11, B:482:0x0e21, B:484:0x0e27, B:475:0x0dbe, B:448:0x0cec, B:425:0x0c12, B:427:0x0c16, B:429:0x0c20, B:431:0x0c24, B:488:0x0e43, B:490:0x0e50, B:491:0x0e57, B:492:0x0e5f, B:494:0x0e65, B:496:0x0e7c, B:498:0x0e8e, B:499:0x0e91, B:501:0x0ea3, B:521:0x0f18, B:523:0x0f1e, B:525:0x0f33, B:528:0x0f3a, B:533:0x0f6d, B:529:0x0f42, B:531:0x0f4e, B:532:0x0f54, B:534:0x0f7e, B:535:0x0f95, B:538:0x0f9d, B:539:0x0fa2, B:540:0x0fb2, B:542:0x0fcc, B:543:0x0fe5, B:544:0x0fed, B:549:0x100f, B:548:0x0ffe, B:502:0x0ebd, B:504:0x0ec3, B:506:0x0ecd, B:508:0x0ed4, B:514:0x0ee4, B:516:0x0eeb, B:518:0x0f0a, B:520:0x0f11, B:519:0x0f0e, B:515:0x0ee8, B:507:0x0ed1, B:361:0x09e7, B:362:0x09ec, B:364:0x09fe, B:552:0x101f, B:49:0x0127, B:64:0x01cc, B:73:0x0206, B:81:0x0225, B:87:0x023e, B:100:0x0264, B:558:0x1033, B:559:0x1036, B:41:0x00dd, B:52:0x0130), top: B:572:0x000d, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05c2 A[Catch: all -> 0x1037, TryCatch #4 {all -> 0x1037, blocks: (B:3:0x000d, B:23:0x0086, B:101:0x0267, B:103:0x026b, B:109:0x0279, B:110:0x02a2, B:113:0x02ba, B:116:0x02e2, B:118:0x0319, B:124:0x032f, B:126:0x0339, B:308:0x08bb, B:128:0x035f, B:131:0x0377, B:160:0x03da, B:163:0x03e4, B:165:0x03f2, B:170:0x0443, B:166:0x0413, B:168:0x0422, B:174:0x0450, B:177:0x0489, B:179:0x04ba, B:181:0x04ee, B:183:0x04f4, B:186:0x0500, B:188:0x0535, B:189:0x0552, B:191:0x0558, B:193:0x0566, B:197:0x057c, B:194:0x0571, B:200:0x0583, B:202:0x0589, B:203:0x05a7, B:205:0x05c2, B:206:0x05ce, B:209:0x05d8, B:215:0x05fb, B:212:0x05ea, B:218:0x0601, B:220:0x060d, B:222:0x0619, B:238:0x0668, B:241:0x0685, B:243:0x0699, B:245:0x06a4, B:248:0x06b7, B:250:0x06ca, B:252:0x06d8, B:297:0x0840, B:299:0x084a, B:301:0x0850, B:302:0x086a, B:304:0x087e, B:305:0x0898, B:307:0x08a1, B:257:0x06fe, B:259:0x070e, B:262:0x0723, B:264:0x0736, B:266:0x0744, B:269:0x0757, B:271:0x076f, B:273:0x077b, B:276:0x078e, B:278:0x07a2, B:280:0x07ed, B:282:0x07f4, B:284:0x07fa, B:286:0x0805, B:288:0x080c, B:290:0x0812, B:292:0x081d, B:293:0x082e, B:226:0x063a, B:230:0x064e, B:232:0x0654, B:235:0x065f, B:138:0x0399, B:141:0x03a3, B:144:0x03ad, B:313:0x08d5, B:315:0x08e3, B:317:0x08ec, B:328:0x091e, B:318:0x08f4, B:320:0x08fd, B:322:0x0903, B:325:0x090f, B:327:0x0919, B:331:0x0925, B:334:0x093d, B:335:0x0945, B:337:0x094b, B:342:0x0962, B:343:0x096d, B:345:0x0973, B:347:0x0985, B:352:0x0992, B:354:0x0998, B:357:0x09a3, B:359:0x09b7, B:360:0x09cf, B:365:0x0a09, B:367:0x0a1b, B:369:0x0a3a, B:371:0x0a48, B:373:0x0a4e, B:375:0x0a58, B:376:0x0a8a, B:378:0x0a90, B:380:0x0a9e, B:384:0x0aa9, B:381:0x0aa3, B:385:0x0aac, B:387:0x0abe, B:388:0x0ac1, B:390:0x0afe, B:391:0x0b13, B:393:0x0b19, B:396:0x0b33, B:398:0x0b4f, B:399:0x0b60, B:401:0x0b64, B:403:0x0b70, B:404:0x0b79, B:406:0x0b7d, B:408:0x0b85, B:409:0x0b94, B:410:0x0b9f, B:487:0x0e3a, B:412:0x0baa, B:416:0x0be0, B:417:0x0be8, B:419:0x0bee, B:421:0x0c00, B:423:0x0c04, B:437:0x0c3a, B:440:0x0c50, B:441:0x0c77, B:443:0x0c83, B:445:0x0c97, B:447:0x0cc6, B:450:0x0d12, B:454:0x0d2b, B:456:0x0d32, B:458:0x0d43, B:460:0x0d47, B:462:0x0d4b, B:464:0x0d4f, B:465:0x0d5b, B:466:0x0d60, B:468:0x0d66, B:470:0x0d83, B:471:0x0d8c, B:486:0x0e37, B:472:0x0da5, B:474:0x0dad, B:478:0x0dd7, B:480:0x0e03, B:481:0x0e11, B:482:0x0e21, B:484:0x0e27, B:475:0x0dbe, B:448:0x0cec, B:425:0x0c12, B:427:0x0c16, B:429:0x0c20, B:431:0x0c24, B:488:0x0e43, B:490:0x0e50, B:491:0x0e57, B:492:0x0e5f, B:494:0x0e65, B:496:0x0e7c, B:498:0x0e8e, B:499:0x0e91, B:501:0x0ea3, B:521:0x0f18, B:523:0x0f1e, B:525:0x0f33, B:528:0x0f3a, B:533:0x0f6d, B:529:0x0f42, B:531:0x0f4e, B:532:0x0f54, B:534:0x0f7e, B:535:0x0f95, B:538:0x0f9d, B:539:0x0fa2, B:540:0x0fb2, B:542:0x0fcc, B:543:0x0fe5, B:544:0x0fed, B:549:0x100f, B:548:0x0ffe, B:502:0x0ebd, B:504:0x0ec3, B:506:0x0ecd, B:508:0x0ed4, B:514:0x0ee4, B:516:0x0eeb, B:518:0x0f0a, B:520:0x0f11, B:519:0x0f0e, B:515:0x0ee8, B:507:0x0ed1, B:361:0x09e7, B:362:0x09ec, B:364:0x09fe, B:552:0x101f, B:49:0x0127, B:64:0x01cc, B:73:0x0206, B:81:0x0225, B:87:0x023e, B:100:0x0264, B:558:0x1033, B:559:0x1036, B:41:0x00dd, B:52:0x0130), top: B:572:0x000d, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0699 A[Catch: all -> 0x1037, TryCatch #4 {all -> 0x1037, blocks: (B:3:0x000d, B:23:0x0086, B:101:0x0267, B:103:0x026b, B:109:0x0279, B:110:0x02a2, B:113:0x02ba, B:116:0x02e2, B:118:0x0319, B:124:0x032f, B:126:0x0339, B:308:0x08bb, B:128:0x035f, B:131:0x0377, B:160:0x03da, B:163:0x03e4, B:165:0x03f2, B:170:0x0443, B:166:0x0413, B:168:0x0422, B:174:0x0450, B:177:0x0489, B:179:0x04ba, B:181:0x04ee, B:183:0x04f4, B:186:0x0500, B:188:0x0535, B:189:0x0552, B:191:0x0558, B:193:0x0566, B:197:0x057c, B:194:0x0571, B:200:0x0583, B:202:0x0589, B:203:0x05a7, B:205:0x05c2, B:206:0x05ce, B:209:0x05d8, B:215:0x05fb, B:212:0x05ea, B:218:0x0601, B:220:0x060d, B:222:0x0619, B:238:0x0668, B:241:0x0685, B:243:0x0699, B:245:0x06a4, B:248:0x06b7, B:250:0x06ca, B:252:0x06d8, B:297:0x0840, B:299:0x084a, B:301:0x0850, B:302:0x086a, B:304:0x087e, B:305:0x0898, B:307:0x08a1, B:257:0x06fe, B:259:0x070e, B:262:0x0723, B:264:0x0736, B:266:0x0744, B:269:0x0757, B:271:0x076f, B:273:0x077b, B:276:0x078e, B:278:0x07a2, B:280:0x07ed, B:282:0x07f4, B:284:0x07fa, B:286:0x0805, B:288:0x080c, B:290:0x0812, B:292:0x081d, B:293:0x082e, B:226:0x063a, B:230:0x064e, B:232:0x0654, B:235:0x065f, B:138:0x0399, B:141:0x03a3, B:144:0x03ad, B:313:0x08d5, B:315:0x08e3, B:317:0x08ec, B:328:0x091e, B:318:0x08f4, B:320:0x08fd, B:322:0x0903, B:325:0x090f, B:327:0x0919, B:331:0x0925, B:334:0x093d, B:335:0x0945, B:337:0x094b, B:342:0x0962, B:343:0x096d, B:345:0x0973, B:347:0x0985, B:352:0x0992, B:354:0x0998, B:357:0x09a3, B:359:0x09b7, B:360:0x09cf, B:365:0x0a09, B:367:0x0a1b, B:369:0x0a3a, B:371:0x0a48, B:373:0x0a4e, B:375:0x0a58, B:376:0x0a8a, B:378:0x0a90, B:380:0x0a9e, B:384:0x0aa9, B:381:0x0aa3, B:385:0x0aac, B:387:0x0abe, B:388:0x0ac1, B:390:0x0afe, B:391:0x0b13, B:393:0x0b19, B:396:0x0b33, B:398:0x0b4f, B:399:0x0b60, B:401:0x0b64, B:403:0x0b70, B:404:0x0b79, B:406:0x0b7d, B:408:0x0b85, B:409:0x0b94, B:410:0x0b9f, B:487:0x0e3a, B:412:0x0baa, B:416:0x0be0, B:417:0x0be8, B:419:0x0bee, B:421:0x0c00, B:423:0x0c04, B:437:0x0c3a, B:440:0x0c50, B:441:0x0c77, B:443:0x0c83, B:445:0x0c97, B:447:0x0cc6, B:450:0x0d12, B:454:0x0d2b, B:456:0x0d32, B:458:0x0d43, B:460:0x0d47, B:462:0x0d4b, B:464:0x0d4f, B:465:0x0d5b, B:466:0x0d60, B:468:0x0d66, B:470:0x0d83, B:471:0x0d8c, B:486:0x0e37, B:472:0x0da5, B:474:0x0dad, B:478:0x0dd7, B:480:0x0e03, B:481:0x0e11, B:482:0x0e21, B:484:0x0e27, B:475:0x0dbe, B:448:0x0cec, B:425:0x0c12, B:427:0x0c16, B:429:0x0c20, B:431:0x0c24, B:488:0x0e43, B:490:0x0e50, B:491:0x0e57, B:492:0x0e5f, B:494:0x0e65, B:496:0x0e7c, B:498:0x0e8e, B:499:0x0e91, B:501:0x0ea3, B:521:0x0f18, B:523:0x0f1e, B:525:0x0f33, B:528:0x0f3a, B:533:0x0f6d, B:529:0x0f42, B:531:0x0f4e, B:532:0x0f54, B:534:0x0f7e, B:535:0x0f95, B:538:0x0f9d, B:539:0x0fa2, B:540:0x0fb2, B:542:0x0fcc, B:543:0x0fe5, B:544:0x0fed, B:549:0x100f, B:548:0x0ffe, B:502:0x0ebd, B:504:0x0ec3, B:506:0x0ecd, B:508:0x0ed4, B:514:0x0ee4, B:516:0x0eeb, B:518:0x0f0a, B:520:0x0f11, B:519:0x0f0e, B:515:0x0ee8, B:507:0x0ed1, B:361:0x09e7, B:362:0x09ec, B:364:0x09fe, B:552:0x101f, B:49:0x0127, B:64:0x01cc, B:73:0x0206, B:81:0x0225, B:87:0x023e, B:100:0x0264, B:558:0x1033, B:559:0x1036, B:41:0x00dd, B:52:0x0130), top: B:572:0x000d, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0840 A[Catch: all -> 0x1037, TryCatch #4 {all -> 0x1037, blocks: (B:3:0x000d, B:23:0x0086, B:101:0x0267, B:103:0x026b, B:109:0x0279, B:110:0x02a2, B:113:0x02ba, B:116:0x02e2, B:118:0x0319, B:124:0x032f, B:126:0x0339, B:308:0x08bb, B:128:0x035f, B:131:0x0377, B:160:0x03da, B:163:0x03e4, B:165:0x03f2, B:170:0x0443, B:166:0x0413, B:168:0x0422, B:174:0x0450, B:177:0x0489, B:179:0x04ba, B:181:0x04ee, B:183:0x04f4, B:186:0x0500, B:188:0x0535, B:189:0x0552, B:191:0x0558, B:193:0x0566, B:197:0x057c, B:194:0x0571, B:200:0x0583, B:202:0x0589, B:203:0x05a7, B:205:0x05c2, B:206:0x05ce, B:209:0x05d8, B:215:0x05fb, B:212:0x05ea, B:218:0x0601, B:220:0x060d, B:222:0x0619, B:238:0x0668, B:241:0x0685, B:243:0x0699, B:245:0x06a4, B:248:0x06b7, B:250:0x06ca, B:252:0x06d8, B:297:0x0840, B:299:0x084a, B:301:0x0850, B:302:0x086a, B:304:0x087e, B:305:0x0898, B:307:0x08a1, B:257:0x06fe, B:259:0x070e, B:262:0x0723, B:264:0x0736, B:266:0x0744, B:269:0x0757, B:271:0x076f, B:273:0x077b, B:276:0x078e, B:278:0x07a2, B:280:0x07ed, B:282:0x07f4, B:284:0x07fa, B:286:0x0805, B:288:0x080c, B:290:0x0812, B:292:0x081d, B:293:0x082e, B:226:0x063a, B:230:0x064e, B:232:0x0654, B:235:0x065f, B:138:0x0399, B:141:0x03a3, B:144:0x03ad, B:313:0x08d5, B:315:0x08e3, B:317:0x08ec, B:328:0x091e, B:318:0x08f4, B:320:0x08fd, B:322:0x0903, B:325:0x090f, B:327:0x0919, B:331:0x0925, B:334:0x093d, B:335:0x0945, B:337:0x094b, B:342:0x0962, B:343:0x096d, B:345:0x0973, B:347:0x0985, B:352:0x0992, B:354:0x0998, B:357:0x09a3, B:359:0x09b7, B:360:0x09cf, B:365:0x0a09, B:367:0x0a1b, B:369:0x0a3a, B:371:0x0a48, B:373:0x0a4e, B:375:0x0a58, B:376:0x0a8a, B:378:0x0a90, B:380:0x0a9e, B:384:0x0aa9, B:381:0x0aa3, B:385:0x0aac, B:387:0x0abe, B:388:0x0ac1, B:390:0x0afe, B:391:0x0b13, B:393:0x0b19, B:396:0x0b33, B:398:0x0b4f, B:399:0x0b60, B:401:0x0b64, B:403:0x0b70, B:404:0x0b79, B:406:0x0b7d, B:408:0x0b85, B:409:0x0b94, B:410:0x0b9f, B:487:0x0e3a, B:412:0x0baa, B:416:0x0be0, B:417:0x0be8, B:419:0x0bee, B:421:0x0c00, B:423:0x0c04, B:437:0x0c3a, B:440:0x0c50, B:441:0x0c77, B:443:0x0c83, B:445:0x0c97, B:447:0x0cc6, B:450:0x0d12, B:454:0x0d2b, B:456:0x0d32, B:458:0x0d43, B:460:0x0d47, B:462:0x0d4b, B:464:0x0d4f, B:465:0x0d5b, B:466:0x0d60, B:468:0x0d66, B:470:0x0d83, B:471:0x0d8c, B:486:0x0e37, B:472:0x0da5, B:474:0x0dad, B:478:0x0dd7, B:480:0x0e03, B:481:0x0e11, B:482:0x0e21, B:484:0x0e27, B:475:0x0dbe, B:448:0x0cec, B:425:0x0c12, B:427:0x0c16, B:429:0x0c20, B:431:0x0c24, B:488:0x0e43, B:490:0x0e50, B:491:0x0e57, B:492:0x0e5f, B:494:0x0e65, B:496:0x0e7c, B:498:0x0e8e, B:499:0x0e91, B:501:0x0ea3, B:521:0x0f18, B:523:0x0f1e, B:525:0x0f33, B:528:0x0f3a, B:533:0x0f6d, B:529:0x0f42, B:531:0x0f4e, B:532:0x0f54, B:534:0x0f7e, B:535:0x0f95, B:538:0x0f9d, B:539:0x0fa2, B:540:0x0fb2, B:542:0x0fcc, B:543:0x0fe5, B:544:0x0fed, B:549:0x100f, B:548:0x0ffe, B:502:0x0ebd, B:504:0x0ec3, B:506:0x0ecd, B:508:0x0ed4, B:514:0x0ee4, B:516:0x0eeb, B:518:0x0f0a, B:520:0x0f11, B:519:0x0f0e, B:515:0x0ee8, B:507:0x0ed1, B:361:0x09e7, B:362:0x09ec, B:364:0x09fe, B:552:0x101f, B:49:0x0127, B:64:0x01cc, B:73:0x0206, B:81:0x0225, B:87:0x023e, B:100:0x0264, B:558:0x1033, B:559:0x1036, B:41:0x00dd, B:52:0x0130), top: B:572:0x000d, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0850 A[Catch: all -> 0x1037, TryCatch #4 {all -> 0x1037, blocks: (B:3:0x000d, B:23:0x0086, B:101:0x0267, B:103:0x026b, B:109:0x0279, B:110:0x02a2, B:113:0x02ba, B:116:0x02e2, B:118:0x0319, B:124:0x032f, B:126:0x0339, B:308:0x08bb, B:128:0x035f, B:131:0x0377, B:160:0x03da, B:163:0x03e4, B:165:0x03f2, B:170:0x0443, B:166:0x0413, B:168:0x0422, B:174:0x0450, B:177:0x0489, B:179:0x04ba, B:181:0x04ee, B:183:0x04f4, B:186:0x0500, B:188:0x0535, B:189:0x0552, B:191:0x0558, B:193:0x0566, B:197:0x057c, B:194:0x0571, B:200:0x0583, B:202:0x0589, B:203:0x05a7, B:205:0x05c2, B:206:0x05ce, B:209:0x05d8, B:215:0x05fb, B:212:0x05ea, B:218:0x0601, B:220:0x060d, B:222:0x0619, B:238:0x0668, B:241:0x0685, B:243:0x0699, B:245:0x06a4, B:248:0x06b7, B:250:0x06ca, B:252:0x06d8, B:297:0x0840, B:299:0x084a, B:301:0x0850, B:302:0x086a, B:304:0x087e, B:305:0x0898, B:307:0x08a1, B:257:0x06fe, B:259:0x070e, B:262:0x0723, B:264:0x0736, B:266:0x0744, B:269:0x0757, B:271:0x076f, B:273:0x077b, B:276:0x078e, B:278:0x07a2, B:280:0x07ed, B:282:0x07f4, B:284:0x07fa, B:286:0x0805, B:288:0x080c, B:290:0x0812, B:292:0x081d, B:293:0x082e, B:226:0x063a, B:230:0x064e, B:232:0x0654, B:235:0x065f, B:138:0x0399, B:141:0x03a3, B:144:0x03ad, B:313:0x08d5, B:315:0x08e3, B:317:0x08ec, B:328:0x091e, B:318:0x08f4, B:320:0x08fd, B:322:0x0903, B:325:0x090f, B:327:0x0919, B:331:0x0925, B:334:0x093d, B:335:0x0945, B:337:0x094b, B:342:0x0962, B:343:0x096d, B:345:0x0973, B:347:0x0985, B:352:0x0992, B:354:0x0998, B:357:0x09a3, B:359:0x09b7, B:360:0x09cf, B:365:0x0a09, B:367:0x0a1b, B:369:0x0a3a, B:371:0x0a48, B:373:0x0a4e, B:375:0x0a58, B:376:0x0a8a, B:378:0x0a90, B:380:0x0a9e, B:384:0x0aa9, B:381:0x0aa3, B:385:0x0aac, B:387:0x0abe, B:388:0x0ac1, B:390:0x0afe, B:391:0x0b13, B:393:0x0b19, B:396:0x0b33, B:398:0x0b4f, B:399:0x0b60, B:401:0x0b64, B:403:0x0b70, B:404:0x0b79, B:406:0x0b7d, B:408:0x0b85, B:409:0x0b94, B:410:0x0b9f, B:487:0x0e3a, B:412:0x0baa, B:416:0x0be0, B:417:0x0be8, B:419:0x0bee, B:421:0x0c00, B:423:0x0c04, B:437:0x0c3a, B:440:0x0c50, B:441:0x0c77, B:443:0x0c83, B:445:0x0c97, B:447:0x0cc6, B:450:0x0d12, B:454:0x0d2b, B:456:0x0d32, B:458:0x0d43, B:460:0x0d47, B:462:0x0d4b, B:464:0x0d4f, B:465:0x0d5b, B:466:0x0d60, B:468:0x0d66, B:470:0x0d83, B:471:0x0d8c, B:486:0x0e37, B:472:0x0da5, B:474:0x0dad, B:478:0x0dd7, B:480:0x0e03, B:481:0x0e11, B:482:0x0e21, B:484:0x0e27, B:475:0x0dbe, B:448:0x0cec, B:425:0x0c12, B:427:0x0c16, B:429:0x0c20, B:431:0x0c24, B:488:0x0e43, B:490:0x0e50, B:491:0x0e57, B:492:0x0e5f, B:494:0x0e65, B:496:0x0e7c, B:498:0x0e8e, B:499:0x0e91, B:501:0x0ea3, B:521:0x0f18, B:523:0x0f1e, B:525:0x0f33, B:528:0x0f3a, B:533:0x0f6d, B:529:0x0f42, B:531:0x0f4e, B:532:0x0f54, B:534:0x0f7e, B:535:0x0f95, B:538:0x0f9d, B:539:0x0fa2, B:540:0x0fb2, B:542:0x0fcc, B:543:0x0fe5, B:544:0x0fed, B:549:0x100f, B:548:0x0ffe, B:502:0x0ebd, B:504:0x0ec3, B:506:0x0ecd, B:508:0x0ed4, B:514:0x0ee4, B:516:0x0eeb, B:518:0x0f0a, B:520:0x0f11, B:519:0x0f0e, B:515:0x0ee8, B:507:0x0ed1, B:361:0x09e7, B:362:0x09ec, B:364:0x09fe, B:552:0x101f, B:49:0x0127, B:64:0x01cc, B:73:0x0206, B:81:0x0225, B:87:0x023e, B:100:0x0264, B:558:0x1033, B:559:0x1036, B:41:0x00dd, B:52:0x0130), top: B:572:0x000d, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x086a A[Catch: all -> 0x1037, TryCatch #4 {all -> 0x1037, blocks: (B:3:0x000d, B:23:0x0086, B:101:0x0267, B:103:0x026b, B:109:0x0279, B:110:0x02a2, B:113:0x02ba, B:116:0x02e2, B:118:0x0319, B:124:0x032f, B:126:0x0339, B:308:0x08bb, B:128:0x035f, B:131:0x0377, B:160:0x03da, B:163:0x03e4, B:165:0x03f2, B:170:0x0443, B:166:0x0413, B:168:0x0422, B:174:0x0450, B:177:0x0489, B:179:0x04ba, B:181:0x04ee, B:183:0x04f4, B:186:0x0500, B:188:0x0535, B:189:0x0552, B:191:0x0558, B:193:0x0566, B:197:0x057c, B:194:0x0571, B:200:0x0583, B:202:0x0589, B:203:0x05a7, B:205:0x05c2, B:206:0x05ce, B:209:0x05d8, B:215:0x05fb, B:212:0x05ea, B:218:0x0601, B:220:0x060d, B:222:0x0619, B:238:0x0668, B:241:0x0685, B:243:0x0699, B:245:0x06a4, B:248:0x06b7, B:250:0x06ca, B:252:0x06d8, B:297:0x0840, B:299:0x084a, B:301:0x0850, B:302:0x086a, B:304:0x087e, B:305:0x0898, B:307:0x08a1, B:257:0x06fe, B:259:0x070e, B:262:0x0723, B:264:0x0736, B:266:0x0744, B:269:0x0757, B:271:0x076f, B:273:0x077b, B:276:0x078e, B:278:0x07a2, B:280:0x07ed, B:282:0x07f4, B:284:0x07fa, B:286:0x0805, B:288:0x080c, B:290:0x0812, B:292:0x081d, B:293:0x082e, B:226:0x063a, B:230:0x064e, B:232:0x0654, B:235:0x065f, B:138:0x0399, B:141:0x03a3, B:144:0x03ad, B:313:0x08d5, B:315:0x08e3, B:317:0x08ec, B:328:0x091e, B:318:0x08f4, B:320:0x08fd, B:322:0x0903, B:325:0x090f, B:327:0x0919, B:331:0x0925, B:334:0x093d, B:335:0x0945, B:337:0x094b, B:342:0x0962, B:343:0x096d, B:345:0x0973, B:347:0x0985, B:352:0x0992, B:354:0x0998, B:357:0x09a3, B:359:0x09b7, B:360:0x09cf, B:365:0x0a09, B:367:0x0a1b, B:369:0x0a3a, B:371:0x0a48, B:373:0x0a4e, B:375:0x0a58, B:376:0x0a8a, B:378:0x0a90, B:380:0x0a9e, B:384:0x0aa9, B:381:0x0aa3, B:385:0x0aac, B:387:0x0abe, B:388:0x0ac1, B:390:0x0afe, B:391:0x0b13, B:393:0x0b19, B:396:0x0b33, B:398:0x0b4f, B:399:0x0b60, B:401:0x0b64, B:403:0x0b70, B:404:0x0b79, B:406:0x0b7d, B:408:0x0b85, B:409:0x0b94, B:410:0x0b9f, B:487:0x0e3a, B:412:0x0baa, B:416:0x0be0, B:417:0x0be8, B:419:0x0bee, B:421:0x0c00, B:423:0x0c04, B:437:0x0c3a, B:440:0x0c50, B:441:0x0c77, B:443:0x0c83, B:445:0x0c97, B:447:0x0cc6, B:450:0x0d12, B:454:0x0d2b, B:456:0x0d32, B:458:0x0d43, B:460:0x0d47, B:462:0x0d4b, B:464:0x0d4f, B:465:0x0d5b, B:466:0x0d60, B:468:0x0d66, B:470:0x0d83, B:471:0x0d8c, B:486:0x0e37, B:472:0x0da5, B:474:0x0dad, B:478:0x0dd7, B:480:0x0e03, B:481:0x0e11, B:482:0x0e21, B:484:0x0e27, B:475:0x0dbe, B:448:0x0cec, B:425:0x0c12, B:427:0x0c16, B:429:0x0c20, B:431:0x0c24, B:488:0x0e43, B:490:0x0e50, B:491:0x0e57, B:492:0x0e5f, B:494:0x0e65, B:496:0x0e7c, B:498:0x0e8e, B:499:0x0e91, B:501:0x0ea3, B:521:0x0f18, B:523:0x0f1e, B:525:0x0f33, B:528:0x0f3a, B:533:0x0f6d, B:529:0x0f42, B:531:0x0f4e, B:532:0x0f54, B:534:0x0f7e, B:535:0x0f95, B:538:0x0f9d, B:539:0x0fa2, B:540:0x0fb2, B:542:0x0fcc, B:543:0x0fe5, B:544:0x0fed, B:549:0x100f, B:548:0x0ffe, B:502:0x0ebd, B:504:0x0ec3, B:506:0x0ecd, B:508:0x0ed4, B:514:0x0ee4, B:516:0x0eeb, B:518:0x0f0a, B:520:0x0f11, B:519:0x0f0e, B:515:0x0ee8, B:507:0x0ed1, B:361:0x09e7, B:362:0x09ec, B:364:0x09fe, B:552:0x101f, B:49:0x0127, B:64:0x01cc, B:73:0x0206, B:81:0x0225, B:87:0x023e, B:100:0x0264, B:558:0x1033, B:559:0x1036, B:41:0x00dd, B:52:0x0130), top: B:572:0x000d, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:552:0x101f A[Catch: all -> 0x1037, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x1037, blocks: (B:3:0x000d, B:23:0x0086, B:101:0x0267, B:103:0x026b, B:109:0x0279, B:110:0x02a2, B:113:0x02ba, B:116:0x02e2, B:118:0x0319, B:124:0x032f, B:126:0x0339, B:308:0x08bb, B:128:0x035f, B:131:0x0377, B:160:0x03da, B:163:0x03e4, B:165:0x03f2, B:170:0x0443, B:166:0x0413, B:168:0x0422, B:174:0x0450, B:177:0x0489, B:179:0x04ba, B:181:0x04ee, B:183:0x04f4, B:186:0x0500, B:188:0x0535, B:189:0x0552, B:191:0x0558, B:193:0x0566, B:197:0x057c, B:194:0x0571, B:200:0x0583, B:202:0x0589, B:203:0x05a7, B:205:0x05c2, B:206:0x05ce, B:209:0x05d8, B:215:0x05fb, B:212:0x05ea, B:218:0x0601, B:220:0x060d, B:222:0x0619, B:238:0x0668, B:241:0x0685, B:243:0x0699, B:245:0x06a4, B:248:0x06b7, B:250:0x06ca, B:252:0x06d8, B:297:0x0840, B:299:0x084a, B:301:0x0850, B:302:0x086a, B:304:0x087e, B:305:0x0898, B:307:0x08a1, B:257:0x06fe, B:259:0x070e, B:262:0x0723, B:264:0x0736, B:266:0x0744, B:269:0x0757, B:271:0x076f, B:273:0x077b, B:276:0x078e, B:278:0x07a2, B:280:0x07ed, B:282:0x07f4, B:284:0x07fa, B:286:0x0805, B:288:0x080c, B:290:0x0812, B:292:0x081d, B:293:0x082e, B:226:0x063a, B:230:0x064e, B:232:0x0654, B:235:0x065f, B:138:0x0399, B:141:0x03a3, B:144:0x03ad, B:313:0x08d5, B:315:0x08e3, B:317:0x08ec, B:328:0x091e, B:318:0x08f4, B:320:0x08fd, B:322:0x0903, B:325:0x090f, B:327:0x0919, B:331:0x0925, B:334:0x093d, B:335:0x0945, B:337:0x094b, B:342:0x0962, B:343:0x096d, B:345:0x0973, B:347:0x0985, B:352:0x0992, B:354:0x0998, B:357:0x09a3, B:359:0x09b7, B:360:0x09cf, B:365:0x0a09, B:367:0x0a1b, B:369:0x0a3a, B:371:0x0a48, B:373:0x0a4e, B:375:0x0a58, B:376:0x0a8a, B:378:0x0a90, B:380:0x0a9e, B:384:0x0aa9, B:381:0x0aa3, B:385:0x0aac, B:387:0x0abe, B:388:0x0ac1, B:390:0x0afe, B:391:0x0b13, B:393:0x0b19, B:396:0x0b33, B:398:0x0b4f, B:399:0x0b60, B:401:0x0b64, B:403:0x0b70, B:404:0x0b79, B:406:0x0b7d, B:408:0x0b85, B:409:0x0b94, B:410:0x0b9f, B:487:0x0e3a, B:412:0x0baa, B:416:0x0be0, B:417:0x0be8, B:419:0x0bee, B:421:0x0c00, B:423:0x0c04, B:437:0x0c3a, B:440:0x0c50, B:441:0x0c77, B:443:0x0c83, B:445:0x0c97, B:447:0x0cc6, B:450:0x0d12, B:454:0x0d2b, B:456:0x0d32, B:458:0x0d43, B:460:0x0d47, B:462:0x0d4b, B:464:0x0d4f, B:465:0x0d5b, B:466:0x0d60, B:468:0x0d66, B:470:0x0d83, B:471:0x0d8c, B:486:0x0e37, B:472:0x0da5, B:474:0x0dad, B:478:0x0dd7, B:480:0x0e03, B:481:0x0e11, B:482:0x0e21, B:484:0x0e27, B:475:0x0dbe, B:448:0x0cec, B:425:0x0c12, B:427:0x0c16, B:429:0x0c20, B:431:0x0c24, B:488:0x0e43, B:490:0x0e50, B:491:0x0e57, B:492:0x0e5f, B:494:0x0e65, B:496:0x0e7c, B:498:0x0e8e, B:499:0x0e91, B:501:0x0ea3, B:521:0x0f18, B:523:0x0f1e, B:525:0x0f33, B:528:0x0f3a, B:533:0x0f6d, B:529:0x0f42, B:531:0x0f4e, B:532:0x0f54, B:534:0x0f7e, B:535:0x0f95, B:538:0x0f9d, B:539:0x0fa2, B:540:0x0fb2, B:542:0x0fcc, B:543:0x0fe5, B:544:0x0fed, B:549:0x100f, B:548:0x0ffe, B:502:0x0ebd, B:504:0x0ec3, B:506:0x0ecd, B:508:0x0ed4, B:514:0x0ee4, B:516:0x0eeb, B:518:0x0f0a, B:520:0x0f11, B:519:0x0f0e, B:515:0x0ee8, B:507:0x0ed1, B:361:0x09e7, B:362:0x09ec, B:364:0x09fe, B:552:0x101f, B:49:0x0127, B:64:0x01cc, B:73:0x0206, B:81:0x0225, B:87:0x023e, B:100:0x0264, B:558:0x1033, B:559:0x1036, B:41:0x00dd, B:52:0x0130), top: B:572:0x000d, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:558:0x1033 A[Catch: all -> 0x1037, TRY_ENTER, TryCatch #4 {all -> 0x1037, blocks: (B:3:0x000d, B:23:0x0086, B:101:0x0267, B:103:0x026b, B:109:0x0279, B:110:0x02a2, B:113:0x02ba, B:116:0x02e2, B:118:0x0319, B:124:0x032f, B:126:0x0339, B:308:0x08bb, B:128:0x035f, B:131:0x0377, B:160:0x03da, B:163:0x03e4, B:165:0x03f2, B:170:0x0443, B:166:0x0413, B:168:0x0422, B:174:0x0450, B:177:0x0489, B:179:0x04ba, B:181:0x04ee, B:183:0x04f4, B:186:0x0500, B:188:0x0535, B:189:0x0552, B:191:0x0558, B:193:0x0566, B:197:0x057c, B:194:0x0571, B:200:0x0583, B:202:0x0589, B:203:0x05a7, B:205:0x05c2, B:206:0x05ce, B:209:0x05d8, B:215:0x05fb, B:212:0x05ea, B:218:0x0601, B:220:0x060d, B:222:0x0619, B:238:0x0668, B:241:0x0685, B:243:0x0699, B:245:0x06a4, B:248:0x06b7, B:250:0x06ca, B:252:0x06d8, B:297:0x0840, B:299:0x084a, B:301:0x0850, B:302:0x086a, B:304:0x087e, B:305:0x0898, B:307:0x08a1, B:257:0x06fe, B:259:0x070e, B:262:0x0723, B:264:0x0736, B:266:0x0744, B:269:0x0757, B:271:0x076f, B:273:0x077b, B:276:0x078e, B:278:0x07a2, B:280:0x07ed, B:282:0x07f4, B:284:0x07fa, B:286:0x0805, B:288:0x080c, B:290:0x0812, B:292:0x081d, B:293:0x082e, B:226:0x063a, B:230:0x064e, B:232:0x0654, B:235:0x065f, B:138:0x0399, B:141:0x03a3, B:144:0x03ad, B:313:0x08d5, B:315:0x08e3, B:317:0x08ec, B:328:0x091e, B:318:0x08f4, B:320:0x08fd, B:322:0x0903, B:325:0x090f, B:327:0x0919, B:331:0x0925, B:334:0x093d, B:335:0x0945, B:337:0x094b, B:342:0x0962, B:343:0x096d, B:345:0x0973, B:347:0x0985, B:352:0x0992, B:354:0x0998, B:357:0x09a3, B:359:0x09b7, B:360:0x09cf, B:365:0x0a09, B:367:0x0a1b, B:369:0x0a3a, B:371:0x0a48, B:373:0x0a4e, B:375:0x0a58, B:376:0x0a8a, B:378:0x0a90, B:380:0x0a9e, B:384:0x0aa9, B:381:0x0aa3, B:385:0x0aac, B:387:0x0abe, B:388:0x0ac1, B:390:0x0afe, B:391:0x0b13, B:393:0x0b19, B:396:0x0b33, B:398:0x0b4f, B:399:0x0b60, B:401:0x0b64, B:403:0x0b70, B:404:0x0b79, B:406:0x0b7d, B:408:0x0b85, B:409:0x0b94, B:410:0x0b9f, B:487:0x0e3a, B:412:0x0baa, B:416:0x0be0, B:417:0x0be8, B:419:0x0bee, B:421:0x0c00, B:423:0x0c04, B:437:0x0c3a, B:440:0x0c50, B:441:0x0c77, B:443:0x0c83, B:445:0x0c97, B:447:0x0cc6, B:450:0x0d12, B:454:0x0d2b, B:456:0x0d32, B:458:0x0d43, B:460:0x0d47, B:462:0x0d4b, B:464:0x0d4f, B:465:0x0d5b, B:466:0x0d60, B:468:0x0d66, B:470:0x0d83, B:471:0x0d8c, B:486:0x0e37, B:472:0x0da5, B:474:0x0dad, B:478:0x0dd7, B:480:0x0e03, B:481:0x0e11, B:482:0x0e21, B:484:0x0e27, B:475:0x0dbe, B:448:0x0cec, B:425:0x0c12, B:427:0x0c16, B:429:0x0c20, B:431:0x0c24, B:488:0x0e43, B:490:0x0e50, B:491:0x0e57, B:492:0x0e5f, B:494:0x0e65, B:496:0x0e7c, B:498:0x0e8e, B:499:0x0e91, B:501:0x0ea3, B:521:0x0f18, B:523:0x0f1e, B:525:0x0f33, B:528:0x0f3a, B:533:0x0f6d, B:529:0x0f42, B:531:0x0f4e, B:532:0x0f54, B:534:0x0f7e, B:535:0x0f95, B:538:0x0f9d, B:539:0x0fa2, B:540:0x0fb2, B:542:0x0fcc, B:543:0x0fe5, B:544:0x0fed, B:549:0x100f, B:548:0x0ffe, B:502:0x0ebd, B:504:0x0ec3, B:506:0x0ecd, B:508:0x0ed4, B:514:0x0ee4, B:516:0x0eeb, B:518:0x0f0a, B:520:0x0f11, B:519:0x0f0e, B:515:0x0ee8, B:507:0x0ed1, B:361:0x09e7, B:362:0x09ec, B:364:0x09fe, B:552:0x101f, B:49:0x0127, B:64:0x01cc, B:73:0x0206, B:81:0x0225, B:87:0x023e, B:100:0x0264, B:558:0x1033, B:559:0x1036, B:41:0x00dd, B:52:0x0130), top: B:572:0x000d, inners: #0, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zza(java.lang.String r61, long r62) {
        /*
            Method dump skipped, instructions count: 4163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzks.zza(java.lang.String, long):boolean");
    }

    private static void zza(zzbr.zzg.zza zzaVar) {
        zzaVar.zzb(Long.MAX_VALUE).zzc(Long.MIN_VALUE);
        for (int i = 0; i < zzaVar.zzb(); i++) {
            zzbr.zzc zzb = zzaVar.zzb(i);
            if (zzb.zze() < zzaVar.zzf()) {
                zzaVar.zzb(zzb.zze());
            }
            if (zzb.zze() > zzaVar.zzg()) {
                zzaVar.zzc(zzb.zze());
            }
        }
    }

    private final void zza(zzbr.zzg.zza zzaVar, long j, boolean z) {
        zzlb zzlbVar;
        String str = z ? "_se" : "_lte";
        zzlb zzc = zze().zzc(zzaVar.zzj(), str);
        if (zzc == null || zzc.zze == null) {
            zzlbVar = new zzlb(zzaVar.zzj(), "auto", str, this.zzj.zzm().currentTimeMillis(), Long.valueOf(j));
        } else {
            zzlbVar = new zzlb(zzaVar.zzj(), "auto", str, this.zzj.zzm().currentTimeMillis(), Long.valueOf(((Long) zzc.zze).longValue() + j));
        }
        zzbr.zzk zzkVar = (zzbr.zzk) ((com.google.android.gms.internal.measurement.zzfd) zzbr.zzk.zzj().zza(str).zza(this.zzj.zzm().currentTimeMillis()).zzb(((Long) zzlbVar.zze).longValue()).zzu());
        boolean z2 = false;
        int zza2 = zzkw.zza(zzaVar, str);
        if (zza2 >= 0) {
            zzaVar.zza(zza2, zzkVar);
            z2 = true;
        }
        if (!z2) {
            zzaVar.zza(zzkVar);
        }
        if (j > 0) {
            zze().zza(zzlbVar);
            String str2 = z ? "session-scoped" : "lifetime";
            if (com.google.android.gms.internal.measurement.zzkz.zzb() && this.zzj.zzb().zze(zzaVar.zzj(), zzap.zzcy)) {
                this.zzj.zzr().zzx().zza("Updated engagement user property. scope, value", str2, zzlbVar.zze);
            } else {
                this.zzj.zzr().zzw().zza("Updated engagement user property. scope, value", str2, zzlbVar.zze);
            }
        }
    }

    private final boolean zza(zzbr.zzc.zza zzaVar, zzbr.zzc.zza zzaVar2) {
        Preconditions.checkArgument("_e".equals(zzaVar.zzd()));
        zzh();
        zzbr.zze zza2 = zzkw.zza((zzbr.zzc) ((com.google.android.gms.internal.measurement.zzfd) zzaVar.zzu()), "_sc");
        String zzd = zza2 == null ? null : zza2.zzd();
        zzh();
        zzbr.zze zza3 = zzkw.zza((zzbr.zzc) ((com.google.android.gms.internal.measurement.zzfd) zzaVar2.zzu()), "_pc");
        String zzd2 = zza3 != null ? zza3.zzd() : null;
        if (zzd2 == null || !zzd2.equals(zzd)) {
            return false;
        }
        zzb(zzaVar, zzaVar2);
        return true;
    }

    private final void zzb(zzbr.zzc.zza zzaVar, zzbr.zzc.zza zzaVar2) {
        Preconditions.checkArgument("_e".equals(zzaVar.zzd()));
        zzh();
        zzbr.zze zza2 = zzkw.zza((zzbr.zzc) ((com.google.android.gms.internal.measurement.zzfd) zzaVar.zzu()), "_et");
        if (!zza2.zze() || zza2.zzf() <= 0) {
            return;
        }
        long zzf = zza2.zzf();
        zzh();
        zzbr.zze zza3 = zzkw.zza((zzbr.zzc) ((com.google.android.gms.internal.measurement.zzfd) zzaVar2.zzu()), "_et");
        if (zza3 != null && zza3.zzf() > 0) {
            zzf += zza3.zzf();
        }
        zzh().zza(zzaVar2, "_et", Long.valueOf(zzf));
        zzh().zza(zzaVar, "_fr", (Object) 1L);
    }

    private static void zza(zzbr.zzc.zza zzaVar, String str) {
        List<zzbr.zze> zza2 = zzaVar.zza();
        for (int i = 0; i < zza2.size(); i++) {
            if (str.equals(zza2.get(i).zzb())) {
                zzaVar.zzb(i);
                return;
            }
        }
    }

    private static void zza(zzbr.zzc.zza zzaVar, int i, String str) {
        List<zzbr.zze> zza2 = zzaVar.zza();
        for (int i2 = 0; i2 < zza2.size(); i2++) {
            if ("_err".equals(zza2.get(i2).zzb())) {
                return;
            }
        }
        zzaVar.zza((zzbr.zze) ((com.google.android.gms.internal.measurement.zzfd) zzbr.zze.zzk().zza("_err").zza(Long.valueOf(i).longValue()).zzu())).zza((zzbr.zze) ((com.google.android.gms.internal.measurement.zzfd) zzbr.zze.zzk().zza("_ev").zzb(str).zzu()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0158, code lost:
        r8.zzj.zzc().zze.zza(r8.zzj.zzm().currentTimeMillis());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(int r9, java.lang.Throwable r10, byte[] r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzks.zza(int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    private final boolean zzy() {
        zzw();
        zzk();
        return zze().zzy() || !TextUtils.isEmpty(zze().d_());
    }

    private final void zza(zzg zzgVar) {
        ArrayMap arrayMap;
        zzw();
        if (zzll.zzb() && this.zzj.zzb().zze(zzgVar.zzc(), zzap.zzch)) {
            if (TextUtils.isEmpty(zzgVar.zze()) && TextUtils.isEmpty(zzgVar.zzg()) && TextUtils.isEmpty(zzgVar.zzf())) {
                zza(zzgVar.zzc(), 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(zzgVar.zze()) && TextUtils.isEmpty(zzgVar.zzf())) {
            zza(zzgVar.zzc(), 204, null, null, null);
            return;
        }
        String zza2 = this.zzj.zzb().zza(zzgVar);
        try {
            URL url = new URL(zza2);
            this.zzj.zzr().zzx().zza("Fetching remote configuration", zzgVar.zzc());
            zzbo.zzb zza3 = zzc().zza(zzgVar.zzc());
            String zzb = zzc().zzb(zzgVar.zzc());
            if (zza3 == null || TextUtils.isEmpty(zzb)) {
                arrayMap = null;
            } else {
                ArrayMap arrayMap2 = new ArrayMap();
                arrayMap2.put("If-Modified-Since", zzb);
                arrayMap = arrayMap2;
            }
            this.zzq = true;
            zzfq zzd = zzd();
            String zzc = zzgVar.zzc();
            zzkt zzktVar = new zzkt(this);
            zzd.zzd();
            zzd.zzak();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzktVar);
            zzd.zzq().zzb(new zzfu(zzd, zzc, url, null, arrayMap, zzktVar));
        } catch (MalformedURLException unused) {
            this.zzj.zzr().zzf().zza("Failed to parse config URL. Not fetching. appId", zzfj.zza(zzgVar.zzc()), zza2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
        r6.zzj.zzc().zze.zza(r6.zzj.zzm().currentTimeMillis());
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a A[Catch: all -> 0x018d, TryCatch #2 {all -> 0x0196, blocks: (B:4:0x000c, B:5:0x000e, B:64:0x0180, B:43:0x00f6, B:50:0x0117, B:6:0x0029, B:15:0x0045, B:63:0x0179, B:20:0x0061, B:27:0x00b0, B:28:0x00c5, B:31:0x00cd, B:34:0x00d9, B:36:0x00df, B:41:0x00ec, B:53:0x0124, B:55:0x013a, B:57:0x0162, B:59:0x016c, B:61:0x0172, B:62:0x0176, B:56:0x014a, B:46:0x0103, B:48:0x010d), top: B:73:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a A[Catch: all -> 0x018d, TryCatch #2 {all -> 0x0196, blocks: (B:4:0x000c, B:5:0x000e, B:64:0x0180, B:43:0x00f6, B:50:0x0117, B:6:0x0029, B:15:0x0045, B:63:0x0179, B:20:0x0061, B:27:0x00b0, B:28:0x00c5, B:31:0x00cd, B:34:0x00d9, B:36:0x00df, B:41:0x00ec, B:53:0x0124, B:55:0x013a, B:57:0x0162, B:59:0x016c, B:61:0x0172, B:62:0x0176, B:56:0x014a, B:46:0x0103, B:48:0x010d), top: B:73:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzks.zza(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzz() {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzks.zzz():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Runnable runnable) {
        zzw();
        if (this.zzn == null) {
            this.zzn = new ArrayList();
        }
        this.zzn.add(runnable);
    }

    private final void zzaa() {
        zzw();
        if (this.zzq || this.zzr || this.zzs) {
            this.zzj.zzr().zzx().zza("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzq), Boolean.valueOf(this.zzr), Boolean.valueOf(this.zzs));
            return;
        }
        this.zzj.zzr().zzx().zza("Stopping uploading service(s)");
        List<Runnable> list = this.zzn;
        if (list == null) {
            return;
        }
        for (Runnable runnable : list) {
            runnable.run();
        }
        this.zzn.clear();
    }

    private final Boolean zzb(zzg zzgVar) {
        try {
            if (zzgVar.zzm() != -2147483648L) {
                if (zzgVar.zzm() == Wrappers.packageManager(this.zzj.zzn()).getPackageInfo(zzgVar.zzc(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzj.zzn()).getPackageInfo(zzgVar.zzc(), 0).versionName;
                if (zzgVar.zzl() != null && zzgVar.zzl().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzo() {
        zzw();
        zzk();
        if (this.zzl) {
            return;
        }
        this.zzl = true;
        if (zzab()) {
            int zza2 = zza(this.zzu);
            int zzaf = this.zzj.zzy().zzaf();
            zzw();
            if (zza2 > zzaf) {
                this.zzj.zzr().zzf().zza("Panic: can't downgrade version. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzaf));
            } else if (zza2 < zzaf) {
                if (zza(zzaf, this.zzu)) {
                    this.zzj.zzr().zzx().zza("Storage version upgraded. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzaf));
                } else {
                    this.zzj.zzr().zzf().zza("Storage version upgrade failed. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzaf));
                }
            }
        }
    }

    private final boolean zzab() {
        FileLock fileLock;
        zzw();
        if (this.zzj.zzb().zza(zzap.zzcf) && (fileLock = this.zzt) != null && fileLock.isValid()) {
            this.zzj.zzr().zzx().zza("Storage concurrent access okay");
            return true;
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzj.zzn().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzu = channel;
            FileLock tryLock = channel.tryLock();
            this.zzt = tryLock;
            if (tryLock != null) {
                this.zzj.zzr().zzx().zza("Storage concurrent access okay");
                return true;
            }
            this.zzj.zzr().zzf().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            this.zzj.zzr().zzf().zza("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            this.zzj.zzr().zzf().zza("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            this.zzj.zzr().zzi().zza("Storage lock already acquired", e3);
            return false;
        }
    }

    private final int zza(FileChannel fileChannel) {
        zzw();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzj.zzr().zzf().zza("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int read = fileChannel.read(allocate);
            if (read == 4) {
                allocate.flip();
                return allocate.getInt();
            }
            if (read != -1) {
                this.zzj.zzr().zzi().zza("Unexpected data length. Bytes read", Integer.valueOf(read));
            }
            return 0;
        } catch (IOException e) {
            this.zzj.zzr().zzf().zza("Failed to read from channel", e);
            return 0;
        }
    }

    private final boolean zza(int i, FileChannel fileChannel) {
        zzw();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzj.zzr().zzf().zza("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            if (this.zzj.zzb().zza(zzap.zzcu) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0L);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.zzj.zzr().zzf().zza("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.zzj.zzr().zzf().zza("Failed to write to channel", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzm zzmVar) {
        if (this.zzv != null) {
            ArrayList arrayList = new ArrayList();
            this.zzw = arrayList;
            arrayList.addAll(this.zzv);
        }
        zzac zze = zze();
        String str = zzmVar.zza;
        Preconditions.checkNotEmpty(str);
        zze.zzd();
        zze.zzak();
        try {
            SQLiteDatabase c_ = zze.c_();
            String[] strArr = {str};
            int delete = c_.delete("apps", "app_id=?", strArr) + 0 + c_.delete("events", "app_id=?", strArr) + c_.delete("user_attributes", "app_id=?", strArr) + c_.delete("conditional_properties", "app_id=?", strArr) + c_.delete("raw_events", "app_id=?", strArr) + c_.delete("raw_events_metadata", "app_id=?", strArr) + c_.delete("queue", "app_id=?", strArr) + c_.delete("audience_filter_values", "app_id=?", strArr) + c_.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zze.zzr().zzx().zza("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zze.zzr().zzf().zza("Error resetting analytics data. appId, error", zzfj.zza(str), e);
        }
        if (com.google.android.gms.internal.measurement.zzks.zzb() && this.zzj.zzb().zza(zzap.zzcm)) {
            if (zzmVar.zzh) {
                zzb(zzmVar);
                return;
            }
            return;
        }
        zzm zza2 = zza(this.zzj.zzn(), zzmVar.zza, zzmVar.zzb, zzmVar.zzh, zzmVar.zzo, zzmVar.zzp, zzmVar.zzm, zzmVar.zzr, zzmVar.zzv);
        if (zzmVar.zzh) {
            zzb(zza2);
        }
    }

    private final zzm zza(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j, String str3, String str4) {
        String str5;
        String str6;
        int i;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.zzj.zzr().zzf().zza("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str5 = packageManager.getInstallerPackageName(str);
        } catch (IllegalArgumentException unused) {
            this.zzj.zzr().zzf().zza("Error retrieving installer package name. appId", zzfj.zza(str));
            str5 = "Unknown";
        }
        if (str5 == null) {
            str5 = "manual_install";
        } else if ("com.android.vending".equals(str5)) {
            str5 = "";
        }
        String str7 = str5;
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 0);
            if (packageInfo != null) {
                CharSequence applicationLabel = Wrappers.packageManager(context).getApplicationLabel(str);
                if (!TextUtils.isEmpty(applicationLabel)) {
                    applicationLabel.toString();
                }
                str6 = packageInfo.versionName;
                i = packageInfo.versionCode;
            } else {
                str6 = "Unknown";
                i = Integer.MIN_VALUE;
            }
            return new zzm(str, str2, str6, i, str7, this.zzj.zzb().zzf(), this.zzj.zzi().zza(context, str), (String) null, z, false, "", 0L, j, 0, z2, z3, false, str3, (Boolean) null, 0L, (List<String>) null, (zzll.zzb() && this.zzj.zzb().zze(str, zzap.zzch)) ? str4 : null);
        } catch (PackageManager.NameNotFoundException unused2) {
            this.zzj.zzr().zzf().zza("Error retrieving newly installed package info. appId, appName", zzfj.zza(str), "Unknown");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzkz zzkzVar, zzm zzmVar) {
        zzaj zza2;
        zzw();
        zzk();
        if (zze(zzmVar)) {
            if (!zzmVar.zzh) {
                zzc(zzmVar);
                return;
            }
            int zzc = this.zzj.zzi().zzc(zzkzVar.zza);
            if (zzc != 0) {
                this.zzj.zzi();
                this.zzj.zzi().zza(zzmVar.zza, zzc, "_ev", zzla.zza(zzkzVar.zza, 24, true), zzkzVar.zza != null ? zzkzVar.zza.length() : 0);
                return;
            }
            int zzb = this.zzj.zzi().zzb(zzkzVar.zza, zzkzVar.zza());
            if (zzb != 0) {
                this.zzj.zzi();
                String zza3 = zzla.zza(zzkzVar.zza, 24, true);
                Object zza4 = zzkzVar.zza();
                this.zzj.zzi().zza(zzmVar.zza, zzb, "_ev", zza3, (zza4 == null || !((zza4 instanceof String) || (zza4 instanceof CharSequence))) ? 0 : String.valueOf(zza4).length());
                return;
            }
            Object zzc2 = this.zzj.zzi().zzc(zzkzVar.zza, zzkzVar.zza());
            if (zzc2 == null) {
                return;
            }
            if ("_sid".equals(zzkzVar.zza) && this.zzj.zzb().zze(zzmVar.zza, zzap.zzat)) {
                long j = zzkzVar.zzb;
                String str = zzkzVar.zze;
                long j2 = 0;
                zzlb zzc3 = zze().zzc(zzmVar.zza, "_sno");
                if (zzc3 != null && (zzc3.zze instanceof Long)) {
                    j2 = ((Long) zzc3.zze).longValue();
                } else {
                    if (zzc3 != null) {
                        this.zzj.zzr().zzi().zza("Retrieved last session number from database does not contain a valid (long) value", zzc3.zze);
                    }
                    if (this.zzj.zzb().zze(zzmVar.zza, zzap.zzaw) && (zza2 = zze().zza(zzmVar.zza, "_s")) != null) {
                        j2 = zza2.zzc;
                        this.zzj.zzr().zzx().zza("Backfill the session number. Last used session number", Long.valueOf(j2));
                    }
                }
                zza(new zzkz("_sno", j, Long.valueOf(j2 + 1), str), zzmVar);
            }
            zzlb zzlbVar = new zzlb(zzmVar.zza, zzkzVar.zze, zzkzVar.zza, zzkzVar.zzb, zzc2);
            if (com.google.android.gms.internal.measurement.zzkz.zzb() && this.zzj.zzb().zze(zzmVar.zza, zzap.zzcy)) {
                this.zzj.zzr().zzx().zza("Setting user property", this.zzj.zzj().zzc(zzlbVar.zzc), zzc2);
            } else {
                this.zzj.zzr().zzw().zza("Setting user property", this.zzj.zzj().zzc(zzlbVar.zzc), zzc2);
            }
            zze().zzf();
            try {
                zzc(zzmVar);
                boolean zza5 = zze().zza(zzlbVar);
                zze().b_();
                if (zza5) {
                    if (!com.google.android.gms.internal.measurement.zzkz.zzb() || !this.zzj.zzb().zze(zzmVar.zza, zzap.zzcy)) {
                        this.zzj.zzr().zzw().zza("User property set", this.zzj.zzj().zzc(zzlbVar.zzc), zzlbVar.zze);
                    }
                } else {
                    this.zzj.zzr().zzf().zza("Too many unique user properties are set. Ignoring user property", this.zzj.zzj().zzc(zzlbVar.zzc), zzlbVar.zze);
                    this.zzj.zzi().zza(zzmVar.zza, 9, (String) null, (String) null, 0);
                }
            } finally {
                zze().zzh();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzkz zzkzVar, zzm zzmVar) {
        zzw();
        zzk();
        if (zze(zzmVar)) {
            if (!zzmVar.zzh) {
                zzc(zzmVar);
            } else if (this.zzj.zzb().zze(zzmVar.zza, zzap.zzbd)) {
                if ("_npa".equals(zzkzVar.zza) && zzmVar.zzs != null) {
                    this.zzj.zzr().zzw().zza("Falling back to manifest metadata value for ad personalization");
                    zza(new zzkz("_npa", this.zzj.zzm().currentTimeMillis(), Long.valueOf(zzmVar.zzs.booleanValue() ? 1L : 0L), "auto"), zzmVar);
                    return;
                }
                this.zzj.zzr().zzw().zza("Removing user property", this.zzj.zzj().zzc(zzkzVar.zza));
                zze().zzf();
                try {
                    zzc(zzmVar);
                    zze().zzb(zzmVar.zza, zzkzVar.zza);
                    zze().b_();
                    this.zzj.zzr().zzw().zza("User property removed", this.zzj.zzj().zzc(zzkzVar.zza));
                } finally {
                }
            } else {
                this.zzj.zzr().zzw().zza("Removing user property", this.zzj.zzj().zzc(zzkzVar.zza));
                zze().zzf();
                try {
                    zzc(zzmVar);
                    zze().zzb(zzmVar.zza, zzkzVar.zza);
                    zze().b_();
                    this.zzj.zzr().zzw().zza("User property removed", this.zzj.zzj().zzc(zzkzVar.zza));
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzkp zzkpVar) {
        this.zzo++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzp() {
        this.zzp++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgq zzs() {
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0222 A[Catch: all -> 0x04d5, TryCatch #2 {all -> 0x04d5, blocks: (B:27:0x00af, B:29:0x00bf, B:31:0x00cd, B:33:0x00d7, B:35:0x00db, B:39:0x00ec, B:41:0x0104, B:48:0x012c, B:50:0x0138, B:52:0x014f, B:53:0x0177, B:55:0x01c1, B:58:0x01d4, B:61:0x01e8, B:63:0x01f3, B:68:0x0202, B:70:0x020a, B:72:0x0210, B:76:0x021f, B:78:0x0222, B:80:0x0246, B:82:0x024b, B:88:0x026b, B:91:0x027f, B:93:0x02a2, B:94:0x02b0, B:96:0x02e3, B:98:0x02eb, B:100:0x02ef, B:101:0x02f2, B:103:0x0313, B:142:0x03ef, B:143:0x03f2, B:154:0x0463, B:156:0x0473, B:158:0x048d, B:159:0x0494, B:163:0x04c6, B:105:0x032c, B:110:0x0357, B:112:0x035f, B:114:0x0369, B:118:0x037d, B:122:0x038b, B:126:0x0396, B:129:0x03a8, B:132:0x03bb, B:134:0x03d3, B:136:0x03d9, B:137:0x03de, B:139:0x03e4, B:119:0x0383, B:108:0x033f, B:146:0x040a, B:148:0x0440, B:150:0x0448, B:152:0x044c, B:153:0x044f, B:160:0x04a9, B:162:0x04ad, B:85:0x025b, B:43:0x010e, B:46:0x0118), top: B:174:0x00af, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(com.google.android.gms.measurement.internal.zzm r22) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzks.zzb(com.google.android.gms.measurement.internal.zzm):void");
    }

    private final zzm zza(String str) {
        zzg zzb = zze().zzb(str);
        if (zzb == null || TextUtils.isEmpty(zzb.zzl())) {
            this.zzj.zzr().zzw().zza("No app data available; dropping", str);
            return null;
        }
        Boolean zzb2 = zzb(zzb);
        if (zzb2 != null && !zzb2.booleanValue()) {
            this.zzj.zzr().zzf().zza("App version does not match; dropping. appId", zzfj.zza(str));
            return null;
        }
        return new zzm(str, zzb.zze(), zzb.zzl(), zzb.zzm(), zzb.zzn(), zzb.zzo(), zzb.zzp(), (String) null, zzb.zzr(), false, zzb.zzi(), zzb.zzae(), 0L, 0, zzb.zzaf(), zzb.zzag(), false, zzb.zzf(), zzb.zzah(), zzb.zzq(), zzb.zzai(), (zzll.zzb() && this.zzj.zzb().zze(str, zzap.zzch)) ? zzb.zzg() : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzv zzvVar) {
        zzm zza2 = zza(zzvVar.zza);
        if (zza2 != null) {
            zza(zzvVar, zza2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzv zzvVar, zzm zzmVar) {
        Preconditions.checkNotNull(zzvVar);
        Preconditions.checkNotEmpty(zzvVar.zza);
        Preconditions.checkNotNull(zzvVar.zzb);
        Preconditions.checkNotNull(zzvVar.zzc);
        Preconditions.checkNotEmpty(zzvVar.zzc.zza);
        zzw();
        zzk();
        if (zze(zzmVar)) {
            if (!zzmVar.zzh) {
                zzc(zzmVar);
                return;
            }
            zzv zzvVar2 = new zzv(zzvVar);
            boolean z = false;
            zzvVar2.zze = false;
            zze().zzf();
            try {
                zzv zzd = zze().zzd(zzvVar2.zza, zzvVar2.zzc.zza);
                if (zzd != null && !zzd.zzb.equals(zzvVar2.zzb)) {
                    this.zzj.zzr().zzi().zza("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzj.zzj().zzc(zzvVar2.zzc.zza), zzvVar2.zzb, zzd.zzb);
                }
                if (zzd != null && zzd.zze) {
                    zzvVar2.zzb = zzd.zzb;
                    zzvVar2.zzd = zzd.zzd;
                    zzvVar2.zzh = zzd.zzh;
                    zzvVar2.zzf = zzd.zzf;
                    zzvVar2.zzi = zzd.zzi;
                    zzvVar2.zze = zzd.zze;
                    zzvVar2.zzc = new zzkz(zzvVar2.zzc.zza, zzd.zzc.zzb, zzvVar2.zzc.zza(), zzd.zzc.zze);
                } else if (TextUtils.isEmpty(zzvVar2.zzf)) {
                    zzvVar2.zzc = new zzkz(zzvVar2.zzc.zza, zzvVar2.zzd, zzvVar2.zzc.zza(), zzvVar2.zzc.zze);
                    zzvVar2.zze = true;
                    z = true;
                }
                if (zzvVar2.zze) {
                    zzkz zzkzVar = zzvVar2.zzc;
                    zzlb zzlbVar = new zzlb(zzvVar2.zza, zzvVar2.zzb, zzkzVar.zza, zzkzVar.zzb, zzkzVar.zza());
                    if (zze().zza(zzlbVar)) {
                        this.zzj.zzr().zzw().zza("User property updated immediately", zzvVar2.zza, this.zzj.zzj().zzc(zzlbVar.zzc), zzlbVar.zze);
                    } else {
                        this.zzj.zzr().zzf().zza("(2)Too many active user properties, ignoring", zzfj.zza(zzvVar2.zza), this.zzj.zzj().zzc(zzlbVar.zzc), zzlbVar.zze);
                    }
                    if (z && zzvVar2.zzi != null) {
                        zzb(new zzan(zzvVar2.zzi, zzvVar2.zzd), zzmVar);
                    }
                }
                if (zze().zza(zzvVar2)) {
                    this.zzj.zzr().zzw().zza("Conditional property added", zzvVar2.zza, this.zzj.zzj().zzc(zzvVar2.zzc.zza), zzvVar2.zzc.zza());
                } else {
                    this.zzj.zzr().zzf().zza("Too many conditional properties, ignoring", zzfj.zza(zzvVar2.zza), this.zzj.zzj().zzc(zzvVar2.zzc.zza), zzvVar2.zzc.zza());
                }
                zze().b_();
            } finally {
                zze().zzh();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzv zzvVar) {
        zzm zza2 = zza(zzvVar.zza);
        if (zza2 != null) {
            zzb(zzvVar, zza2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzv zzvVar, zzm zzmVar) {
        Preconditions.checkNotNull(zzvVar);
        Preconditions.checkNotEmpty(zzvVar.zza);
        Preconditions.checkNotNull(zzvVar.zzc);
        Preconditions.checkNotEmpty(zzvVar.zzc.zza);
        zzw();
        zzk();
        if (zze(zzmVar)) {
            if (!zzmVar.zzh) {
                zzc(zzmVar);
                return;
            }
            zze().zzf();
            try {
                zzc(zzmVar);
                zzv zzd = zze().zzd(zzvVar.zza, zzvVar.zzc.zza);
                if (zzd != null) {
                    this.zzj.zzr().zzw().zza("Removing conditional user property", zzvVar.zza, this.zzj.zzj().zzc(zzvVar.zzc.zza));
                    zze().zze(zzvVar.zza, zzvVar.zzc.zza);
                    if (zzd.zze) {
                        zze().zzb(zzvVar.zza, zzvVar.zzc.zza);
                    }
                    if (zzvVar.zzk != null) {
                        zzb(this.zzj.zzi().zza(zzvVar.zza, zzvVar.zzk.zza, zzvVar.zzk.zzb != null ? zzvVar.zzk.zzb.zzb() : null, zzd.zzb, zzvVar.zzk.zzd, true, false), zzmVar);
                    }
                } else {
                    this.zzj.zzr().zzi().zza("Conditional user property doesn't exist", zzfj.zza(zzvVar.zza), this.zzj.zzj().zzc(zzvVar.zzc.zza));
                }
                zze().b_();
            } finally {
                zze().zzh();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.measurement.internal.zzg zza(com.google.android.gms.measurement.internal.zzm r9, com.google.android.gms.measurement.internal.zzg r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzks.zza(com.google.android.gms.measurement.internal.zzm, com.google.android.gms.measurement.internal.zzg, java.lang.String):com.google.android.gms.measurement.internal.zzg");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzg zzc(zzm zzmVar) {
        zzw();
        zzk();
        Preconditions.checkNotNull(zzmVar);
        Preconditions.checkNotEmpty(zzmVar.zza);
        zzg zzb = zze().zzb(zzmVar.zza);
        String zzb2 = this.zzj.zzc().zzb(zzmVar.zza);
        if (com.google.android.gms.internal.measurement.zzkt.zzb() && this.zzj.zzb().zza(zzap.zzcp)) {
            if (zzb == null) {
                zzb = new zzg(this.zzj, zzmVar.zza);
                zzb.zza(this.zzj.zzi().zzk());
                zzb.zze(zzb2);
            } else if (!zzb2.equals(zzb.zzh())) {
                zzb.zze(zzb2);
                zzb.zza(this.zzj.zzi().zzk());
            }
            zzb.zzb(zzmVar.zzb);
            zzb.zzc(zzmVar.zzr);
            if (zzll.zzb() && this.zzj.zzb().zze(zzb.zzc(), zzap.zzch)) {
                zzb.zzd(zzmVar.zzv);
            }
            if (!TextUtils.isEmpty(zzmVar.zzk)) {
                zzb.zzf(zzmVar.zzk);
            }
            if (zzmVar.zze != 0) {
                zzb.zzd(zzmVar.zze);
            }
            if (!TextUtils.isEmpty(zzmVar.zzc)) {
                zzb.zzg(zzmVar.zzc);
            }
            zzb.zzc(zzmVar.zzj);
            if (zzmVar.zzd != null) {
                zzb.zzh(zzmVar.zzd);
            }
            zzb.zze(zzmVar.zzf);
            zzb.zza(zzmVar.zzh);
            if (!TextUtils.isEmpty(zzmVar.zzg)) {
                zzb.zzi(zzmVar.zzg);
            }
            if (!this.zzj.zzb().zza(zzap.zzdh)) {
                zzb.zzp(zzmVar.zzl);
            }
            zzb.zzb(zzmVar.zzo);
            zzb.zzc(zzmVar.zzp);
            if (this.zzj.zzb().zze(zzmVar.zza, zzap.zzbd)) {
                zzb.zza(zzmVar.zzs);
            }
            zzb.zzf(zzmVar.zzt);
            if (zzb.zza()) {
                zze().zza(zzb);
            }
            return zzb;
        }
        return zza(zzmVar, zzb, zzb2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd(zzm zzmVar) {
        try {
            return (String) this.zzj.zzq().zza(new zzkv(this, zzmVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.zzj.zzr().zzf().zza("Failed to get app instance id. appId", zzfj.zza(zzmVar.zza), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(boolean z) {
        zzz();
    }

    private final boolean zze(zzm zzmVar) {
        return (zzll.zzb() && this.zzj.zzb().zze(zzmVar.zza, zzap.zzch)) ? (TextUtils.isEmpty(zzmVar.zzb) && TextUtils.isEmpty(zzmVar.zzv) && TextUtils.isEmpty(zzmVar.zzr)) ? false : true : (TextUtils.isEmpty(zzmVar.zzb) && TextUtils.isEmpty(zzmVar.zzr)) ? false : true;
    }
}
