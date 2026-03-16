package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public class zzeco extends IOException {
    private zzedo zzhyr;

    public zzeco(String str) {
        super(str);
        this.zzhyr = null;
    }

    public final zzeco zzl(zzedo zzedoVar) {
        this.zzhyr = zzedoVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeco zzbfg() {
        return new zzeco("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeco zzbfh() {
        return new zzeco("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeco zzbfi() {
        return new zzeco("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeco zzbfj() {
        return new zzeco("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeco zzbfk() {
        return new zzeco("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzecn zzbfl() {
        return new zzecn("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeco zzbfm() {
        return new zzeco("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeco zzbfn() {
        return new zzeco("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeco zzbfo() {
        return new zzeco("Protocol message had invalid UTF-8.");
    }
}
