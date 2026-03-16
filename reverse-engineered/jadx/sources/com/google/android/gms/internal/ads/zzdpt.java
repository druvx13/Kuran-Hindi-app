package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdpt implements FilenameFilter {
    private final Pattern zzgvg;

    public zzdpt(Pattern pattern) {
        this.zzgvg = (Pattern) zzdoj.checkNotNull(pattern);
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(@NullableDecl File file, String str) {
        return this.zzgvg.matcher(str).matches();
    }
}
