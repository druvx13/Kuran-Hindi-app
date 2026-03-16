package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.zzln;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzku {
    private static final int zzawy = zzov.zzbj("nam");
    private static final int zzawz = zzov.zzbj("trk");
    private static final int zzaxa = zzov.zzbj("cmt");
    private static final int zzaxb = zzov.zzbj("day");
    private static final int zzaxc = zzov.zzbj("ART");
    private static final int zzaxd = zzov.zzbj("too");
    private static final int zzaxe = zzov.zzbj("alb");
    private static final int zzaxf = zzov.zzbj("com");
    private static final int zzaxg = zzov.zzbj("wrt");
    private static final int zzaxh = zzov.zzbj("lyr");
    private static final int zzaxi = zzov.zzbj("gen");
    private static final int zzaxj = zzov.zzbj("covr");
    private static final int zzaxk = zzov.zzbj("gnre");
    private static final int zzaxl = zzov.zzbj("grp");
    private static final int zzaxm = zzov.zzbj("disk");
    private static final int zzaxn = zzov.zzbj("trkn");
    private static final int zzaxo = zzov.zzbj("tmpo");
    private static final int zzaxp = zzov.zzbj("cpil");
    private static final int zzaxq = zzov.zzbj("aART");
    private static final int zzaxr = zzov.zzbj("sonm");
    private static final int zzaxs = zzov.zzbj("soal");
    private static final int zzaxt = zzov.zzbj("soar");
    private static final int zzaxu = zzov.zzbj("soaa");
    private static final int zzaxv = zzov.zzbj("soco");
    private static final int zzaxw = zzov.zzbj("rtng");
    private static final int zzaxx = zzov.zzbj("pgap");
    private static final int zzaxy = zzov.zzbj("sosn");
    private static final int zzaxz = zzov.zzbj("tvsh");
    private static final int zzaya = zzov.zzbj("----");
    private static final String[] zzayb = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static zzln.zza zzd(zzos zzosVar) {
        int position = zzosVar.getPosition() + zzosVar.readInt();
        int readInt = zzosVar.readInt();
        int i = readInt >>> 24;
        zzlu zzluVar = null;
        try {
            if (i == 169 || i == 65533) {
                int i2 = 16777215 & readInt;
                if (i2 == zzaxa) {
                    int readInt2 = zzosVar.readInt();
                    if (zzosVar.readInt() == zzki.zzavf) {
                        zzosVar.zzbj(8);
                        String zzbk = zzosVar.zzbk(readInt2 - 16);
                        zzluVar = new zzlp("und", zzbk, zzbk);
                    } else {
                        String valueOf = String.valueOf(zzki.zzar(readInt));
                        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
                    }
                    return zzluVar;
                }
                if (i2 != zzawy && i2 != zzawz) {
                    if (i2 != zzaxf && i2 != zzaxg) {
                        if (i2 == zzaxb) {
                            return zza(readInt, "TDRC", zzosVar);
                        }
                        if (i2 == zzaxc) {
                            return zza(readInt, "TPE1", zzosVar);
                        }
                        if (i2 == zzaxd) {
                            return zza(readInt, "TSSE", zzosVar);
                        }
                        if (i2 == zzaxe) {
                            return zza(readInt, "TALB", zzosVar);
                        }
                        if (i2 == zzaxh) {
                            return zza(readInt, "USLT", zzosVar);
                        }
                        if (i2 == zzaxi) {
                            return zza(readInt, "TCON", zzosVar);
                        }
                        if (i2 == zzaxl) {
                            return zza(readInt, "TIT1", zzosVar);
                        }
                    }
                    return zza(readInt, "TCOM", zzosVar);
                }
                return zza(readInt, "TIT2", zzosVar);
            } else if (readInt == zzaxk) {
                int zze = zze(zzosVar);
                String str = (zze <= 0 || zze > zzayb.length) ? null : zzayb[zze - 1];
                if (str != null) {
                    zzluVar = new zzlt("TCON", null, str);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return zzluVar;
            } else if (readInt == zzaxm) {
                return zzb(readInt, "TPOS", zzosVar);
            } else {
                if (readInt == zzaxn) {
                    return zzb(readInt, "TRCK", zzosVar);
                }
                if (readInt == zzaxo) {
                    return zza(readInt, "TBPM", zzosVar, true, false);
                }
                if (readInt == zzaxp) {
                    return zza(readInt, "TCMP", zzosVar, true, true);
                }
                if (readInt == zzaxj) {
                    int readInt3 = zzosVar.readInt();
                    if (zzosVar.readInt() == zzki.zzavf) {
                        int zzaq = zzki.zzaq(zzosVar.readInt());
                        String str2 = zzaq == 13 ? "image/jpeg" : zzaq == 14 ? "image/png" : null;
                        if (str2 == null) {
                            StringBuilder sb = new StringBuilder(41);
                            sb.append("Unrecognized cover art flags: ");
                            sb.append(zzaq);
                            Log.w("MetadataUtil", sb.toString());
                        } else {
                            zzosVar.zzbj(4);
                            int i3 = readInt3 - 16;
                            byte[] bArr = new byte[i3];
                            zzosVar.zze(bArr, 0, i3);
                            zzluVar = new zzlo(str2, null, 3, bArr);
                        }
                    } else {
                        Log.w("MetadataUtil", "Failed to parse cover art attribute");
                    }
                    return zzluVar;
                } else if (readInt == zzaxq) {
                    return zza(readInt, "TPE2", zzosVar);
                } else {
                    if (readInt == zzaxr) {
                        return zza(readInt, "TSOT", zzosVar);
                    }
                    if (readInt == zzaxs) {
                        return zza(readInt, "TSO2", zzosVar);
                    }
                    if (readInt == zzaxt) {
                        return zza(readInt, "TSOA", zzosVar);
                    }
                    if (readInt == zzaxu) {
                        return zza(readInt, "TSOP", zzosVar);
                    }
                    if (readInt == zzaxv) {
                        return zza(readInt, "TSOC", zzosVar);
                    }
                    if (readInt == zzaxw) {
                        return zza(readInt, "ITUNESADVISORY", zzosVar, false, false);
                    }
                    if (readInt == zzaxx) {
                        return zza(readInt, "ITUNESGAPLESS", zzosVar, false, true);
                    }
                    if (readInt == zzaxy) {
                        return zza(readInt, "TVSHOWSORT", zzosVar);
                    }
                    if (readInt == zzaxz) {
                        return zza(readInt, "TVSHOW", zzosVar);
                    }
                    if (readInt == zzaya) {
                        String str3 = null;
                        String str4 = null;
                        int i4 = -1;
                        int i5 = -1;
                        while (zzosVar.getPosition() < position) {
                            int position2 = zzosVar.getPosition();
                            int readInt4 = zzosVar.readInt();
                            int readInt5 = zzosVar.readInt();
                            zzosVar.zzbj(4);
                            if (readInt5 == zzki.zzavd) {
                                str3 = zzosVar.zzbk(readInt4 - 12);
                            } else if (readInt5 == zzki.zzave) {
                                str4 = zzosVar.zzbk(readInt4 - 12);
                            } else {
                                if (readInt5 == zzki.zzavf) {
                                    i4 = position2;
                                    i5 = readInt4;
                                }
                                zzosVar.zzbj(readInt4 - 12);
                            }
                        }
                        if ("com.apple.iTunes".equals(str3) && "iTunSMPB".equals(str4) && i4 != -1) {
                            zzosVar.zzbi(i4);
                            zzosVar.zzbj(16);
                            zzluVar = new zzlp("und", str4, zzosVar.zzbk(i5 - 16));
                        }
                        return zzluVar;
                    }
                }
            }
            String valueOf2 = String.valueOf(zzki.zzar(readInt));
            Log.d("MetadataUtil", valueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf2) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            zzosVar.zzbi(position);
        }
    }

    private static zzlt zza(int i, String str, zzos zzosVar) {
        int readInt = zzosVar.readInt();
        if (zzosVar.readInt() == zzki.zzavf) {
            zzosVar.zzbj(8);
            return new zzlt(str, null, zzosVar.zzbk(readInt - 16));
        }
        String valueOf = String.valueOf(zzki.zzar(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static zzlu zza(int i, String str, zzos zzosVar, boolean z, boolean z2) {
        int zze = zze(zzosVar);
        if (z2) {
            zze = Math.min(1, zze);
        }
        if (zze >= 0) {
            if (z) {
                return new zzlt(str, null, Integer.toString(zze));
            }
            return new zzlp("und", str, Integer.toString(zze));
        }
        String valueOf = String.valueOf(zzki.zzar(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static zzlt zzb(int i, String str, zzos zzosVar) {
        int readInt = zzosVar.readInt();
        if (zzosVar.readInt() == zzki.zzavf && readInt >= 22) {
            zzosVar.zzbj(10);
            int readUnsignedShort = zzosVar.readUnsignedShort();
            if (readUnsignedShort > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(readUnsignedShort);
                String sb2 = sb.toString();
                int readUnsignedShort2 = zzosVar.readUnsignedShort();
                if (readUnsignedShort2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(readUnsignedShort2);
                    sb2 = sb3.toString();
                }
                return new zzlt(str, null, sb2);
            }
        }
        String valueOf2 = String.valueOf(zzki.zzar(i));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static int zze(zzos zzosVar) {
        zzosVar.zzbj(4);
        if (zzosVar.readInt() == zzki.zzavf) {
            zzosVar.zzbj(8);
            return zzosVar.readUnsignedByte();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
