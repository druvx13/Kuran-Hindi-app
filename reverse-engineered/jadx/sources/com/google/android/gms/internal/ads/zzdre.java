package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
abstract class zzdre<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable zzhib = new zzdrf();
    private static final Runnable zzhic = new zzdrf();
    private static final Runnable zzhid = new zzdrf();

    abstract boolean isDone();

    abstract T zzawn() throws Exception;

    abstract String zzawo();

    abstract void zzb(@NullableDecl T t, @NullableDecl Throwable th);

    @Override // java.lang.Runnable
    public final void run() {
        T zzawn;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            boolean z = !isDone();
            if (z) {
                try {
                    zzawn = zzawn();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, zzhib)) {
                        Runnable runnable = get();
                        boolean z2 = false;
                        int i = 0;
                        while (true) {
                            if (runnable != zzhic && runnable != zzhid) {
                                break;
                            }
                            i++;
                            if (i > 1000) {
                                Runnable runnable2 = zzhid;
                                if (runnable == runnable2 || compareAndSet(zzhic, runnable2)) {
                                    z2 = Thread.interrupted() || z2;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = get();
                        }
                        if (z2) {
                            currentThread.interrupt();
                        }
                    }
                    if (z) {
                        zzb(null, th);
                        return;
                    }
                    return;
                }
            } else {
                zzawn = null;
            }
            if (!compareAndSet(currentThread, zzhib)) {
                Runnable runnable3 = get();
                boolean z3 = false;
                int i2 = 0;
                while (true) {
                    if (runnable3 != zzhic && runnable3 != zzhid) {
                        break;
                    }
                    i2++;
                    if (i2 > 1000) {
                        Runnable runnable4 = zzhid;
                        if (runnable3 == runnable4 || compareAndSet(zzhic, runnable4)) {
                            z3 = Thread.interrupted() || z3;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable3 = get();
                }
                if (z3) {
                    currentThread.interrupt();
                }
            }
            if (z) {
                zzb(zzawn, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void interruptTask() {
        Runnable runnable = get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, zzhic)) {
            try {
                ((Thread) runnable).interrupt();
            } finally {
                if (getAndSet(zzhib) == zzhid) {
                    LockSupport.unpark((Thread) runnable);
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == zzhib) {
            str = "running=[DONE]";
        } else if (runnable == zzhic) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String zzawo = zzawo();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(zzawo).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(zzawo);
        return sb2.toString();
    }
}
