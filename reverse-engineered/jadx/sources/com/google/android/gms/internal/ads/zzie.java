package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzie extends Thread {
    private final /* synthetic */ AudioTrack zzait;
    private final /* synthetic */ zzif zzaiu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzie(zzif zzifVar, AudioTrack audioTrack) {
        this.zzaiu = zzifVar;
        this.zzait = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.zzait.flush();
            this.zzait.release();
        } finally {
            conditionVariable = this.zzaiu.zzajc;
            conditionVariable.open();
        }
    }
}
