package com.google.android.gms.internal.ads;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzidt uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public class zzefp {
    public static final zzefp zzidl = new zzefp("DOUBLE", 0, zzefw.DOUBLE, 1);
    public static final zzefp zzidm = new zzefp("FLOAT", 1, zzefw.FLOAT, 5);
    public static final zzefp zzidn = new zzefp("INT64", 2, zzefw.LONG, 0);
    public static final zzefp zzido = new zzefp("UINT64", 3, zzefw.LONG, 0);
    public static final zzefp zzidp = new zzefp("INT32", 4, zzefw.INT, 0);
    public static final zzefp zzidq = new zzefp("FIXED64", 5, zzefw.LONG, 1);
    public static final zzefp zzidr = new zzefp("FIXED32", 6, zzefw.INT, 5);
    public static final zzefp zzids = new zzefp("BOOL", 7, zzefw.BOOLEAN, 0);
    public static final zzefp zzidt;
    public static final zzefp zzidu;
    public static final zzefp zzidv;
    public static final zzefp zzidw;
    public static final zzefp zzidx;
    public static final zzefp zzidy;
    public static final zzefp zzidz;
    public static final zzefp zziea;
    public static final zzefp zzieb;
    public static final zzefp zziec;
    private static final /* synthetic */ zzefp[] zzief;
    private final zzefw zzied;
    private final int zziee;

    public static zzefp[] values() {
        return (zzefp[]) zzief.clone();
    }

    private zzefp(String str, int i, zzefw zzefwVar, int i2) {
        this.zzied = zzefwVar;
        this.zziee = i2;
    }

    public final zzefw zzbhn() {
        return this.zzied;
    }

    public final int zzbho() {
        return this.zziee;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzefp(String str, int i, zzefw zzefwVar, int i2, zzefq zzefqVar) {
        this(str, i, zzefwVar, i2);
    }

    static {
        final zzefw zzefwVar = zzefw.STRING;
        zzidt = new zzefp("STRING", 8, zzefwVar, 2) { // from class: com.google.android.gms.internal.ads.zzefs
        };
        final zzefw zzefwVar2 = zzefw.MESSAGE;
        zzidu = new zzefp("GROUP", 9, zzefwVar2, 3) { // from class: com.google.android.gms.internal.ads.zzefr
        };
        final zzefw zzefwVar3 = zzefw.MESSAGE;
        zzidv = new zzefp("MESSAGE", 10, zzefwVar3, 2) { // from class: com.google.android.gms.internal.ads.zzefu
        };
        final zzefw zzefwVar4 = zzefw.BYTE_STRING;
        zzidw = new zzefp("BYTES", 11, zzefwVar4, 2) { // from class: com.google.android.gms.internal.ads.zzeft
        };
        zzidx = new zzefp("UINT32", 12, zzefw.INT, 0);
        zzidy = new zzefp("ENUM", 13, zzefw.ENUM, 0);
        zzidz = new zzefp("SFIXED32", 14, zzefw.INT, 5);
        zziea = new zzefp("SFIXED64", 15, zzefw.LONG, 1);
        zzieb = new zzefp("SINT32", 16, zzefw.INT, 0);
        zzefp zzefpVar = new zzefp("SINT64", 17, zzefw.LONG, 0);
        zziec = zzefpVar;
        zzief = new zzefp[]{zzidl, zzidm, zzidn, zzido, zzidp, zzidq, zzidr, zzids, zzidt, zzidu, zzidv, zzidw, zzidx, zzidy, zzidz, zziea, zzieb, zzefpVar};
    }
}
