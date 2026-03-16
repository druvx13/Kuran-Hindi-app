package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzoa extends IOException {
    private final int type;
    private final zznv zzbfy;

    public zzoa(String str, zznv zznvVar, int i) {
        super(str);
        this.zzbfy = zznvVar;
        this.type = 1;
    }

    public zzoa(IOException iOException, zznv zznvVar, int i) {
        super(iOException);
        this.zzbfy = zznvVar;
        this.type = i;
    }

    public zzoa(String str, IOException iOException, zznv zznvVar, int i) {
        super(str, iOException);
        this.zzbfy = zznvVar;
        this.type = 1;
    }
}
