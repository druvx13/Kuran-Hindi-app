package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaex extends UnifiedNativeAd {
    private final zzacx zzczb;
    private final NativeAd.AdChoicesInfo zzczc;
    private final zzaes zzczj;
    private final List<NativeAd.Image> zzcza = new ArrayList();
    private final VideoController zzcgy = new VideoController();
    private final List<MuteThisAdReason> zzczk = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(3:2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6)))|24|25|(2:27|(5:30|(1:32)(1:39)|(3:34|35|36)(1:38)|37|28))|41|42|(7:44|45|46|47|(2:49|50)|52|53)|58|45|46|47|(0)|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
        com.google.android.gms.internal.ads.zzazw.zzc("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae A[Catch: RemoteException -> 0x00bb, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x00bb, blocks: (B:44:0x00a6, B:46:0x00ae), top: B:56:0x00a6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzaex(com.google.android.gms.internal.ads.zzaes r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzcza = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.zzcgy = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzczk = r1
            r5.zzczj = r6
            r1 = 0
            java.util.List r6 = r6.getImages()     // Catch: android.os.RemoteException -> L5a
            if (r6 == 0) goto L5e
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L5a
        L27:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L5a
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L5a
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L5a
            if (r3 == 0) goto L4c
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L5a
            if (r2 == 0) goto L4c
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L5a
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzacs     // Catch: android.os.RemoteException -> L5a
            if (r4 == 0) goto L46
            com.google.android.gms.internal.ads.zzacs r3 = (com.google.android.gms.internal.ads.zzacs) r3     // Catch: android.os.RemoteException -> L5a
            goto L4d
        L46:
            com.google.android.gms.internal.ads.zzacu r3 = new com.google.android.gms.internal.ads.zzacu     // Catch: android.os.RemoteException -> L5a
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L5a
            goto L4d
        L4c:
            r3 = r1
        L4d:
            if (r3 == 0) goto L27
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r5.zzcza     // Catch: android.os.RemoteException -> L5a
            com.google.android.gms.internal.ads.zzacx r4 = new com.google.android.gms.internal.ads.zzacx     // Catch: android.os.RemoteException -> L5a
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L5a
            r2.add(r4)     // Catch: android.os.RemoteException -> L5a
            goto L27
        L5a:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzazw.zzc(r0, r6)
        L5e:
            com.google.android.gms.internal.ads.zzaes r6 = r5.zzczj     // Catch: android.os.RemoteException -> L8d
            java.util.List r6 = r6.getMuteThisAdReasons()     // Catch: android.os.RemoteException -> L8d
            if (r6 == 0) goto L91
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L8d
        L6a:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L8d
            if (r2 == 0) goto L91
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L8d
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L8d
            if (r3 == 0) goto L7f
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L8d
            com.google.android.gms.internal.ads.zzww r2 = com.google.android.gms.internal.ads.zzwz.zzg(r2)     // Catch: android.os.RemoteException -> L8d
            goto L80
        L7f:
            r2 = r1
        L80:
            if (r2 == 0) goto L6a
            java.util.List<com.google.android.gms.ads.MuteThisAdReason> r3 = r5.zzczk     // Catch: android.os.RemoteException -> L8d
            com.google.android.gms.internal.ads.zzxb r4 = new com.google.android.gms.internal.ads.zzxb     // Catch: android.os.RemoteException -> L8d
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L8d
            r3.add(r4)     // Catch: android.os.RemoteException -> L8d
            goto L6a
        L8d:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzazw.zzc(r0, r6)
        L91:
            com.google.android.gms.internal.ads.zzaes r6 = r5.zzczj     // Catch: android.os.RemoteException -> L9f
            com.google.android.gms.internal.ads.zzacs r6 = r6.zzsa()     // Catch: android.os.RemoteException -> L9f
            if (r6 == 0) goto La3
            com.google.android.gms.internal.ads.zzacx r2 = new com.google.android.gms.internal.ads.zzacx     // Catch: android.os.RemoteException -> L9f
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L9f
            goto La4
        L9f:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzazw.zzc(r0, r6)
        La3:
            r2 = r1
        La4:
            r5.zzczb = r2
            com.google.android.gms.internal.ads.zzaes r6 = r5.zzczj     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzack r6 = r6.zzsb()     // Catch: android.os.RemoteException -> Lbb
            if (r6 == 0) goto Lbf
            com.google.android.gms.internal.ads.zzacp r6 = new com.google.android.gms.internal.ads.zzacp     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzaes r2 = r5.zzczj     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzack r2 = r2.zzsb()     // Catch: android.os.RemoteException -> Lbb
            r6.<init>(r2)     // Catch: android.os.RemoteException -> Lbb
            r1 = r6
            goto Lbf
        Lbb:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzazw.zzc(r0, r6)
        Lbf:
            r5.zzczc = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaex.<init>(com.google.android.gms.internal.ads.zzaes):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    /* renamed from: zzrz */
    public final IObjectWrapper zzjq() {
        try {
            return this.zzczj.zzrz();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzjv() {
        try {
            IObjectWrapper zzsc = this.zzczj.zzsc();
            if (zzsc != null) {
                return ObjectWrapper.unwrap(zzsc);
            }
            return null;
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zzczj.performClick(bundle);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzczj.recordImpression(bundle);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzczj.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getHeadline() {
        try {
            return this.zzczj.getHeadline();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<NativeAd.Image> getImages() {
        return this.zzcza;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getBody() {
        try {
            return this.zzczj.getBody();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image getIcon() {
        return this.zzczb;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getCallToAction() {
        try {
            return this.zzczj.getCallToAction();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double getStarRating() {
        try {
            double starRating = this.zzczj.getStarRating();
            if (starRating == -1.0d) {
                return null;
            }
            return Double.valueOf(starRating);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getStore() {
        try {
            return this.zzczj.getStore();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getPrice() {
        try {
            return this.zzczj.getPrice();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController getVideoController() {
        try {
            if (this.zzczj.getVideoController() != null) {
                this.zzcgy.zza(this.zzczj.getVideoController());
            }
        } catch (RemoteException e) {
            zzazw.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcgy;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzczc;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getMediationAdapterClassName() {
        try {
            return this.zzczj.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Bundle getExtras() {
        try {
            Bundle extras = this.zzczj.getExtras();
            if (extras != null) {
                return extras;
            }
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void enableCustomClickGesture() {
        try {
            this.zzczj.zzsk();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zzczj.isCustomClickGestureEnabled();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void recordCustomClickGesture() {
        try {
            this.zzczj.recordCustomClickGesture();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.zzczk;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zzczj.isCustomMuteThisAdEnabled();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void destroy() {
        try {
            this.zzczj.destroy();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.zzczj.zza(new zzafh(unconfirmedClickListener));
        } catch (RemoteException e) {
            zzazw.zzc("Failed to setUnconfirmedClickListener", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            if (!isCustomMuteThisAdEnabled()) {
                zzazw.zzfa("Ad is not custom mute enabled");
            } else if (muteThisAdReason == null) {
                this.zzczj.zza((zzww) null);
            } else if (muteThisAdReason instanceof zzxb) {
                this.zzczj.zza(((zzxb) muteThisAdReason).zzqf());
            } else {
                zzazw.zzfa("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
            }
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.zzczj.zza(new zzwx(muteThisAdListener));
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.zzczj.cancelUnconfirmedClick();
        } catch (RemoteException e) {
            zzazw.zzc("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getAdvertiser() {
        try {
            return this.zzczj.getAdvertiser();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final MediaContent getMediaContent() {
        try {
            if (this.zzczj.zzsl() != null) {
                return new zzyg(this.zzczj.zzsl());
            }
            return null;
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final ResponseInfo getResponseInfo() {
        zzxg zzxgVar;
        try {
            zzxgVar = this.zzczj.zzki();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            zzxgVar = null;
        }
        return ResponseInfo.zza(zzxgVar);
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzczj.zza(new zzyz(onPaidEventListener));
        } catch (RemoteException e) {
            zzazw.zzc("Failed to setOnPaidEventListener", e);
        }
    }
}
