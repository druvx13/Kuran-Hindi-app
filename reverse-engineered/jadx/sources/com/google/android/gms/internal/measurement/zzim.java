package com.google.android.gms.internal.measurement;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzi uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
/* loaded from: classes.dex */
public class zzim {
    public static final zzim zza = new zzim("DOUBLE", 0, zzip.DOUBLE, 1);
    public static final zzim zzb = new zzim("FLOAT", 1, zzip.FLOAT, 5);
    public static final zzim zzc = new zzim("INT64", 2, zzip.LONG, 0);
    public static final zzim zzd = new zzim("UINT64", 3, zzip.LONG, 0);
    public static final zzim zze = new zzim("INT32", 4, zzip.INT, 0);
    public static final zzim zzf = new zzim("FIXED64", 5, zzip.LONG, 1);
    public static final zzim zzg = new zzim("FIXED32", 6, zzip.INT, 5);
    public static final zzim zzh = new zzim("BOOL", 7, zzip.BOOLEAN, 0);
    public static final zzim zzi;
    public static final zzim zzj;
    public static final zzim zzk;
    public static final zzim zzl;
    public static final zzim zzm;
    public static final zzim zzn;
    public static final zzim zzo;
    public static final zzim zzp;
    public static final zzim zzq;
    public static final zzim zzr;
    private static final /* synthetic */ zzim[] zzu;
    private final zzip zzs;
    private final int zzt;

    public static zzim[] values() {
        return (zzim[]) zzu.clone();
    }

    private zzim(String str, int i, zzip zzipVar, int i2) {
        this.zzs = zzipVar;
        this.zzt = i2;
    }

    public final zzip zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzim(String str, int i, zzip zzipVar, int i2, zzij zzijVar) {
        this(str, i, zzipVar, i2);
    }

    static {
        final zzip zzipVar = zzip.STRING;
        zzi = new zzim("STRING", 8, zzipVar, 2) { // from class: com.google.android.gms.internal.measurement.zzil
        };
        final zzip zzipVar2 = zzip.MESSAGE;
        zzj = new zzim("GROUP", 9, zzipVar2, 3) { // from class: com.google.android.gms.internal.measurement.zzio
        };
        final zzip zzipVar3 = zzip.MESSAGE;
        zzk = new zzim("MESSAGE", 10, zzipVar3, 2) { // from class: com.google.android.gms.internal.measurement.zzin
        };
        final zzip zzipVar4 = zzip.BYTE_STRING;
        zzl = new zzim("BYTES", 11, zzipVar4, 2) { // from class: com.google.android.gms.internal.measurement.zziq
        };
        zzm = new zzim("UINT32", 12, zzip.INT, 0);
        zzn = new zzim("ENUM", 13, zzip.ENUM, 0);
        zzo = new zzim("SFIXED32", 14, zzip.INT, 5);
        zzp = new zzim("SFIXED64", 15, zzip.LONG, 1);
        zzq = new zzim("SINT32", 16, zzip.INT, 0);
        zzim zzimVar = new zzim("SINT64", 17, zzip.LONG, 0);
        zzr = zzimVar;
        zzu = new zzim[]{zza, zzb, zzc, zzd, zze, zzf, zzg, zzh, zzi, zzj, zzk, zzl, zzm, zzn, zzo, zzp, zzq, zzimVar};
    }
}
