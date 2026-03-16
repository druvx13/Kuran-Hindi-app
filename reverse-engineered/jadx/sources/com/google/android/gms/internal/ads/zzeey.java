package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzeey {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzam(zzeaq zzeaqVar) {
        zzeex zzeexVar = new zzeex(zzeaqVar);
        StringBuilder sb = new StringBuilder(zzeexVar.size());
        for (int i = 0; i < zzeexVar.size(); i++) {
            byte zzfo = zzeexVar.zzfo(i);
            if (zzfo == 34) {
                sb.append("\\\"");
            } else if (zzfo == 39) {
                sb.append("\\'");
            } else if (zzfo != 92) {
                switch (zzfo) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (zzfo >= 32 && zzfo <= 126) {
                            sb.append((char) zzfo);
                            continue;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zzfo >>> 6) & 3) + 48));
                            sb.append((char) (((zzfo >>> 3) & 7) + 48));
                            sb.append((char) ((zzfo & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
