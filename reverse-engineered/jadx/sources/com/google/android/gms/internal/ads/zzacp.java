package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzacp extends NativeAd.AdChoicesInfo {
    private String text;
    private final List<NativeAd.Image> zzcym = new ArrayList();
    private final zzack zzcyw;

    public zzacp(zzack zzackVar) {
        zzacs zzacsVar;
        IBinder iBinder;
        this.zzcyw = zzackVar;
        try {
            this.text = zzackVar.getText();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            this.text = "";
        }
        try {
            for (zzacs zzacsVar2 : zzackVar.zzrr()) {
                if (!(zzacsVar2 instanceof IBinder) || (iBinder = (IBinder) zzacsVar2) == null) {
                    zzacsVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    if (queryLocalInterface instanceof zzacs) {
                        zzacsVar = (zzacs) queryLocalInterface;
                    } else {
                        zzacsVar = new zzacu(iBinder);
                    }
                }
                if (zzacsVar != null) {
                    this.zzcym.add(new zzacx(zzacsVar));
                }
            }
        } catch (RemoteException e2) {
            zzazw.zzc("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.text;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzcym;
    }
}
