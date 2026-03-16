package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.mediation.Adapter;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class RtbAdapter extends Adapter {
    public abstract void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks);
}
