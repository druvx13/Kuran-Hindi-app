package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzgy implements Handler.Callback, zzmh, zzmj, zznn {
    private int repeatMode = 0;
    private int state = 1;
    private final zzhk[] zzads;
    private final zzno zzadt;
    private final zzdns zzadv;
    private final zzhq zzady;
    private final zzhr zzadz;
    private boolean zzaeb;
    private boolean zzaef;
    private zzhp zzaeg;
    private zzhl zzaek;
    private zzha zzael;
    private final zzhn[] zzaep;
    private final zzhj zzaeq;
    private final zzot zzaer;
    private final zzdns zzaes;
    private final HandlerThread zzaet;
    private final zzgt zzaeu;
    private zzhk zzaev;
    private zzol zzaew;
    private zzmk zzaex;
    private zzhk[] zzaey;
    private boolean zzaez;
    private boolean zzafa;
    private int zzafb;
    private int zzafc;
    private long zzafd;
    private int zzafe;
    private zzhd zzaff;
    private long zzafg;
    private zzhb zzafh;
    private zzhb zzafi;
    private zzhb zzafj;

    public zzgy(zzhk[] zzhkVarArr, zzno zznoVar, zzhj zzhjVar, boolean z, int i, zzdns zzdnsVar, zzha zzhaVar, zzgt zzgtVar) {
        this.zzads = zzhkVarArr;
        this.zzadt = zznoVar;
        this.zzaeq = zzhjVar;
        this.zzaeb = z;
        this.zzadv = zzdnsVar;
        this.zzael = zzhaVar;
        this.zzaeu = zzgtVar;
        this.zzaep = new zzhn[zzhkVarArr.length];
        for (int i2 = 0; i2 < zzhkVarArr.length; i2++) {
            zzhkVarArr[i2].setIndex(i2);
            this.zzaep[i2] = zzhkVarArr[i2].zzdy();
        }
        this.zzaer = new zzot();
        this.zzaey = new zzhk[0];
        this.zzady = new zzhq();
        this.zzadz = new zzhr();
        zznoVar.zza(this);
        this.zzaek = zzhl.zzahe;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.zzaet = handlerThread;
        handlerThread.start();
        this.zzaes = new zzdns(this.zzaet.getLooper(), this);
    }

    public final void zza(zzmk zzmkVar, boolean z) {
        this.zzaes.obtainMessage(0, 1, 0, zzmkVar).sendToTarget();
    }

    public final void zzg(boolean z) {
        this.zzaes.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void zza(zzhp zzhpVar, int i, long j) {
        this.zzaes.obtainMessage(3, new zzhd(zzhpVar, i, j)).sendToTarget();
    }

    public final void stop() {
        this.zzaes.sendEmptyMessage(5);
    }

    public final void zza(zzgu... zzguVarArr) {
        if (this.zzaez) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.zzafb++;
        this.zzaes.obtainMessage(11, zzguVarArr).sendToTarget();
    }

    public final synchronized void zzb(zzgu... zzguVarArr) {
        if (this.zzaez) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        int i = this.zzafb;
        this.zzafb = i + 1;
        this.zzaes.obtainMessage(11, zzguVarArr).sendToTarget();
        while (this.zzafc <= i) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final synchronized void release() {
        if (this.zzaez) {
            return;
        }
        this.zzaes.sendEmptyMessage(6);
        while (!this.zzaez) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.zzaet.quit();
    }

    @Override // com.google.android.gms.internal.ads.zzmj
    public final void zzb(zzhp zzhpVar, Object obj) {
        this.zzaes.obtainMessage(7, Pair.create(zzhpVar, obj)).sendToTarget();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zza(zzmi zzmiVar) {
        this.zzaes.obtainMessage(8, zzmiVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zznn
    public final void zzeo() {
        this.zzaes.sendEmptyMessage(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0287 A[Catch: IOException -> 0x089e, zzgq -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x028a A[Catch: IOException -> 0x089e, zzgq -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028e A[Catch: IOException -> 0x089e, zzgq -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x052c A[Catch: IOException -> 0x089e, zzgq -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0533 A[Catch: IOException -> 0x089e, zzgq -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0550 A[Catch: IOException -> 0x089e, zzgq -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x058b A[Catch: IOException -> 0x089e, zzgq -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x059d A[Catch: IOException -> 0x089e, zzgq -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05b9 A[Catch: IOException -> 0x089e, zzgq -> 0x08a3, RuntimeException -> 0x08a8, LOOP:9: B:318:0x05b9->B:322:0x05cb, LOOP_START, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0718 A[Catch: IOException -> 0x089e, zzgq -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x07d1  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r35) {
        /*
            Method dump skipped, instructions count: 2326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgy.handleMessage(android.os.Message):boolean");
    }

    private final void setState(int i) {
        if (this.state != i) {
            this.state = i;
            this.zzadv.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    private final void zzh(boolean z) {
        if (this.zzaef != z) {
            this.zzaef = z;
            this.zzadv.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    private final void zzep() throws zzgq {
        this.zzafa = false;
        this.zzaer.start();
        for (zzhk zzhkVar : this.zzaey) {
            zzhkVar.start();
        }
    }

    private final void zzeq() throws zzgq {
        this.zzaer.stop();
        for (zzhk zzhkVar : this.zzaey) {
            zza(zzhkVar);
        }
    }

    private final void zzer() throws zzgq {
        zzhb zzhbVar = this.zzafj;
        if (zzhbVar == null) {
            return;
        }
        long zzhp = zzhbVar.zzafp.zzhp();
        if (zzhp != -9223372036854775807L) {
            zzdq(zzhp);
        } else {
            zzhk zzhkVar = this.zzaev;
            if (zzhkVar != null && !zzhkVar.zzfd()) {
                long zzgb = this.zzaew.zzgb();
                this.zzafg = zzgb;
                this.zzaer.zzel(zzgb);
            } else {
                this.zzafg = this.zzaer.zzgb();
            }
            zzhp = this.zzafg - this.zzafj.zzev();
        }
        this.zzael.zzafn = zzhp;
        this.zzafd = SystemClock.elapsedRealtime() * 1000;
        long zzhq = this.zzaey.length == 0 ? Long.MIN_VALUE : this.zzafj.zzafp.zzhq();
        zzha zzhaVar = this.zzael;
        if (zzhq == Long.MIN_VALUE) {
            zzhq = this.zzaeg.zza(this.zzafj.zzafl, this.zzadz, false).zzaht;
        }
        zzhaVar.zzafo = zzhq;
    }

    private final void zza(long j, long j2) {
        this.zzaes.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.zzaes.sendEmptyMessage(2);
        } else {
            this.zzaes.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private final long zza(int i, long j) throws zzgq {
        zzhb zzhbVar;
        zzeq();
        this.zzafa = false;
        setState(2);
        zzhb zzhbVar2 = this.zzafj;
        if (zzhbVar2 == null) {
            zzhb zzhbVar3 = this.zzafh;
            if (zzhbVar3 != null) {
                zzhbVar3.release();
            }
            zzhbVar = null;
        } else {
            zzhbVar = null;
            while (zzhbVar2 != null) {
                if (zzhbVar2.zzafl == i && zzhbVar2.zzafv) {
                    zzhbVar = zzhbVar2;
                } else {
                    zzhbVar2.release();
                }
                zzhbVar2 = zzhbVar2.zzafx;
            }
        }
        zzhb zzhbVar4 = this.zzafj;
        if (zzhbVar4 != zzhbVar || zzhbVar4 != this.zzafi) {
            for (zzhk zzhkVar : this.zzaey) {
                zzhkVar.disable();
            }
            this.zzaey = new zzhk[0];
            this.zzaew = null;
            this.zzaev = null;
            this.zzafj = null;
        }
        if (zzhbVar != null) {
            zzhbVar.zzafx = null;
            this.zzafh = zzhbVar;
            this.zzafi = zzhbVar;
            zzb(zzhbVar);
            if (this.zzafj.zzafw) {
                j = this.zzafj.zzafp.zzeg(j);
            }
            zzdq(j);
            zzeu();
        } else {
            this.zzafh = null;
            this.zzafi = null;
            this.zzafj = null;
            zzdq(j);
        }
        this.zzaes.sendEmptyMessage(2);
        return j;
    }

    private final void zzdq(long j) throws zzgq {
        zzhb zzhbVar = this.zzafj;
        long zzev = j + (zzhbVar == null ? 60000000L : zzhbVar.zzev());
        this.zzafg = zzev;
        this.zzaer.zzel(zzev);
        for (zzhk zzhkVar : this.zzaey) {
            zzhkVar.zzdm(this.zzafg);
        }
    }

    private final void zzes() {
        zzi(true);
        this.zzaeq.onStopped();
        setState(1);
    }

    private final void zzi(boolean z) {
        zzhk[] zzhkVarArr;
        this.zzaes.removeMessages(2);
        this.zzafa = false;
        this.zzaer.stop();
        this.zzaew = null;
        this.zzaev = null;
        this.zzafg = 60000000L;
        for (zzhk zzhkVar : this.zzaey) {
            try {
                zza(zzhkVar);
                zzhkVar.disable();
            } catch (zzgq | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.zzaey = new zzhk[0];
        zzhb zzhbVar = this.zzafj;
        if (zzhbVar == null) {
            zzhbVar = this.zzafh;
        }
        zza(zzhbVar);
        this.zzafh = null;
        this.zzafi = null;
        this.zzafj = null;
        zzh(false);
        if (z) {
            zzmk zzmkVar = this.zzaex;
            if (zzmkVar != null) {
                zzmkVar.zzhz();
                this.zzaex = null;
            }
            this.zzaeg = null;
        }
    }

    private static void zza(zzhk zzhkVar) throws zzgq {
        if (zzhkVar.getState() == 2) {
            zzhkVar.stop();
        }
    }

    private final boolean zzdr(long j) {
        if (j == -9223372036854775807L || this.zzael.zzafn < j) {
            return true;
        }
        return this.zzafj.zzafx != null && this.zzafj.zzafx.zzafv;
    }

    private final void zzet() throws IOException {
        zzhb zzhbVar = this.zzafh;
        if (zzhbVar == null || zzhbVar.zzafv) {
            return;
        }
        zzhb zzhbVar2 = this.zzafi;
        if (zzhbVar2 == null || zzhbVar2.zzafx == this.zzafh) {
            for (zzhk zzhkVar : this.zzaey) {
                if (!zzhkVar.zzeb()) {
                    return;
                }
            }
            this.zzafh.zzafp.zzhn();
        }
    }

    private final void zza(Object obj, int i) {
        this.zzael = new zzha(0, 0L);
        zzb(obj, i);
        this.zzael = new zzha(0, -9223372036854775807L);
        setState(4);
        zzi(false);
    }

    private final void zzb(Object obj, int i) {
        this.zzadv.obtainMessage(6, new zzhc(this.zzaeg, obj, this.zzael, i)).sendToTarget();
    }

    private final int zza(int i, zzhp zzhpVar, zzhp zzhpVar2) {
        int zzff = zzhpVar.zzff();
        int i2 = -1;
        for (int i3 = 0; i3 < zzff && i2 == -1; i3++) {
            i = zzhpVar.zza(i, this.zzadz, this.zzady, this.repeatMode);
            i2 = zzhpVar2.zzc(zzhpVar.zza(i, this.zzadz, true).zzafq);
        }
        return i2;
    }

    private final boolean zzq(int i) {
        this.zzaeg.zza(i, this.zzadz, false);
        return !this.zzaeg.zza(0, this.zzady, false).zzahp && this.zzaeg.zza(i, this.zzadz, this.zzady, this.repeatMode) == -1;
    }

    private final Pair<Integer, Long> zza(zzhd zzhdVar) {
        zzhp zzhpVar = zzhdVar.zzaeg;
        if (zzhpVar.isEmpty()) {
            zzhpVar = this.zzaeg;
        }
        try {
            Pair<Integer, Long> zzb = zzb(zzhpVar, zzhdVar.zzagb, zzhdVar.zzagc);
            zzhp zzhpVar2 = this.zzaeg;
            if (zzhpVar2 == zzhpVar) {
                return zzb;
            }
            int zzc = zzhpVar2.zzc(zzhpVar.zza(((Integer) zzb.first).intValue(), this.zzadz, true).zzafq);
            if (zzc != -1) {
                return Pair.create(Integer.valueOf(zzc), (Long) zzb.second);
            }
            int zza = zza(((Integer) zzb.first).intValue(), zzhpVar, this.zzaeg);
            if (zza != -1) {
                this.zzaeg.zza(zza, this.zzadz, false);
                return zzb(0, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new zzhg(this.zzaeg, zzhdVar.zzagb, zzhdVar.zzagc);
        }
    }

    private final Pair<Integer, Long> zzb(int i, long j) {
        return zzb(this.zzaeg, i, -9223372036854775807L);
    }

    private final Pair<Integer, Long> zzb(zzhp zzhpVar, int i, long j) {
        return zza(zzhpVar, i, j, 0L);
    }

    private final Pair<Integer, Long> zza(zzhp zzhpVar, int i, long j, long j2) {
        zzoh.zzc(i, 0, zzhpVar.zzfe());
        zzhpVar.zza(i, this.zzady, false, j2);
        if (j == -9223372036854775807L) {
            j = this.zzady.zzahs;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        long j3 = this.zzady.zzahu + j;
        long j4 = zzhpVar.zza(0, this.zzadz, false).zzaht;
        if (j4 != -9223372036854775807L) {
            int i2 = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j3));
    }

    private final void zzeu() {
        long zzhm = !this.zzafh.zzafv ? 0L : this.zzafh.zzafp.zzhm();
        if (zzhm == Long.MIN_VALUE) {
            zzh(false);
            return;
        }
        long zzev = this.zzafg - this.zzafh.zzev();
        boolean zzdt = this.zzaeq.zzdt(zzhm - zzev);
        zzh(zzdt);
        if (zzdt) {
            this.zzafh.zzafp.zzee(zzev);
        }
    }

    private static void zza(zzhb zzhbVar) {
        while (zzhbVar != null) {
            zzhbVar.release();
            zzhbVar = zzhbVar.zzafx;
        }
    }

    private final void zzb(zzhb zzhbVar) throws zzgq {
        if (this.zzafj == zzhbVar) {
            return;
        }
        boolean[] zArr = new boolean[this.zzads.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            zzhk[] zzhkVarArr = this.zzads;
            if (i < zzhkVarArr.length) {
                zzhk zzhkVar = zzhkVarArr[i];
                zArr[i] = zzhkVar.getState() != 0;
                zznj zzba = zzhbVar.zzafy.zzbfh.zzba(i);
                if (zzba != null) {
                    i2++;
                }
                if (zArr[i] && (zzba == null || (zzhkVar.zzed() && zzhkVar.zzea() == this.zzafj.zzafr[i]))) {
                    if (zzhkVar == this.zzaev) {
                        this.zzaer.zza(this.zzaew);
                        this.zzaew = null;
                        this.zzaev = null;
                    }
                    zza(zzhkVar);
                    zzhkVar.disable();
                }
                i++;
            } else {
                this.zzafj = zzhbVar;
                this.zzadv.obtainMessage(3, zzhbVar.zzafy).sendToTarget();
                zza(zArr, i2);
                return;
            }
        }
    }

    private final void zza(boolean[] zArr, int i) throws zzgq {
        this.zzaey = new zzhk[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzhk[] zzhkVarArr = this.zzads;
            if (i2 >= zzhkVarArr.length) {
                return;
            }
            zzhk zzhkVar = zzhkVarArr[i2];
            zznj zzba = this.zzafj.zzafy.zzbfh.zzba(i2);
            if (zzba != null) {
                int i4 = i3 + 1;
                this.zzaey[i3] = zzhkVar;
                if (zzhkVar.getState() == 0) {
                    zzhm zzhmVar = this.zzafj.zzafy.zzbfj[i2];
                    boolean z = this.zzaeb && this.state == 3;
                    boolean z2 = !zArr[i2] && z;
                    int length = zzba.length();
                    zzhf[] zzhfVarArr = new zzhf[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        zzhfVarArr[i5] = zzba.zzax(i5);
                    }
                    zzhkVar.zza(zzhmVar, zzhfVarArr, this.zzafj.zzafr[i2], this.zzafg, z2, this.zzafj.zzev());
                    zzol zzdz = zzhkVar.zzdz();
                    if (zzdz != null) {
                        if (this.zzaew != null) {
                            throw zzgq.zza(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        this.zzaew = zzdz;
                        this.zzaev = zzhkVar;
                        zzdz.zzb(this.zzaek);
                    }
                    if (z) {
                        zzhkVar.start();
                    }
                }
                i3 = i4;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmv
    public final /* synthetic */ void zza(zzmi zzmiVar) {
        this.zzaes.obtainMessage(9, zzmiVar).sendToTarget();
    }
}
