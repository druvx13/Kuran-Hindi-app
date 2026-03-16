package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzog;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzod<T extends zzog> extends zzdns implements Runnable {
    private volatile boolean zzaez;
    private final T zzbgt;
    private final zzoe<T> zzbgu;
    public final int zzbgv;
    private final long zzbgw;
    private IOException zzbgx;
    private int zzbgy;
    private volatile Thread zzbgz;
    private final /* synthetic */ zzob zzbha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzod(zzob zzobVar, Looper looper, T t, zzoe<T> zzoeVar, int i, long j) {
        super(looper);
        this.zzbha = zzobVar;
        this.zzbgt = t;
        this.zzbgu = zzoeVar;
        this.zzbgv = i;
        this.zzbgw = j;
    }

    public final void zzbd(int i) throws IOException {
        IOException iOException = this.zzbgx;
        if (iOException != null && this.zzbgy > i) {
            throw iOException;
        }
    }

    public final void zzek(long j) {
        zzod zzodVar;
        zzodVar = this.zzbha.zzbgp;
        zzoh.checkState(zzodVar == null);
        this.zzbha.zzbgp = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            execute();
        }
    }

    public final void zzl(boolean z) {
        this.zzaez = z;
        this.zzbgx = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.zzbgt.cancelLoad();
            if (this.zzbgz != null) {
                this.zzbgz.interrupt();
            }
        }
        if (z) {
            finish();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzbgu.zza((zzoe<T>) this.zzbgt, elapsedRealtime, elapsedRealtime - this.zzbgw, true);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzbgz = Thread.currentThread();
            if (!this.zzbgt.zzhw()) {
                String valueOf = String.valueOf(this.zzbgt.getClass().getSimpleName());
                zzow.beginSection(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
                try {
                    this.zzbgt.zzhx();
                    zzow.endSection();
                } catch (Throwable th) {
                    zzow.endSection();
                    throw th;
                }
            }
            if (this.zzaez) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.zzaez) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (this.zzaez) {
                return;
            }
            obtainMessage(3, new zzof(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (this.zzaez) {
                return;
            }
            obtainMessage(3, new zzof(e3)).sendToTarget();
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.zzaez) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (InterruptedException unused) {
            zzoh.checkState(this.zzbgt.zzhw());
            if (this.zzaez) {
                return;
            }
            sendEmptyMessage(2);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzaez) {
            return;
        }
        if (message.what == 0) {
            execute();
        } else if (message.what == 4) {
            throw ((Error) message.obj);
        } else {
            finish();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.zzbgw;
            if (this.zzbgt.zzhw()) {
                this.zzbgu.zza((zzoe<T>) this.zzbgt, elapsedRealtime, j, false);
                return;
            }
            int i = message.what;
            if (i == 1) {
                this.zzbgu.zza((zzoe<T>) this.zzbgt, elapsedRealtime, j, false);
            } else if (i == 2) {
                this.zzbgu.zza(this.zzbgt, elapsedRealtime, j);
            } else if (i != 3) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zzbgx = iOException;
                int zza = this.zzbgu.zza((zzoe<T>) this.zzbgt, elapsedRealtime, j, iOException);
                if (zza == 3) {
                    this.zzbha.zzbgq = this.zzbgx;
                } else if (zza != 2) {
                    int i2 = zza == 1 ? 1 : this.zzbgy + 1;
                    this.zzbgy = i2;
                    zzek(Math.min((i2 - 1) * 1000, 5000));
                }
            }
        }
    }

    private final void execute() {
        ExecutorService executorService;
        zzod zzodVar;
        this.zzbgx = null;
        executorService = this.zzbha.zzbgo;
        zzodVar = this.zzbha.zzbgp;
        executorService.execute(zzodVar);
    }

    private final void finish() {
        this.zzbha.zzbgp = null;
    }
}
