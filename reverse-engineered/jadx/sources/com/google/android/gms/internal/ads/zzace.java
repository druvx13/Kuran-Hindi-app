package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzace extends zzacv {
    private final int height;
    private final Uri uri;
    private final int width;
    private final Drawable zzcyr;
    private final double zzcys;

    public zzace(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.zzcyr = drawable;
        this.uri = uri;
        this.zzcys = d;
        this.width = i;
        this.height = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final IObjectWrapper zzrv() throws RemoteException {
        return ObjectWrapper.wrap(this.zzcyr);
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final Uri getUri() throws RemoteException {
        return this.uri;
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final double getScale() {
        return this.zzcys;
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final int getWidth() {
        return this.width;
    }

    @Override // com.google.android.gms.internal.ads.zzacs
    public final int getHeight() {
        return this.height;
    }
}
