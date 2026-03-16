package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzdpw<V> extends zzdrz implements zzdri<V> {
    private static final boolean GENERATE_CANCELLATION_CAUSES;
    private static final Object NULL;
    private static final Logger zzhgm;
    private static final zza zzhgn;
    @NullableDecl
    private volatile zzd listeners;
    @NullableDecl
    private volatile Object value;
    @NullableDecl
    private volatile zzk waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static abstract class zza {
        private zza() {
        }

        abstract void zza(zzk zzkVar, zzk zzkVar2);

        abstract void zza(zzk zzkVar, Thread thread);

        abstract boolean zza(zzdpw<?> zzdpwVar, zzd zzdVar, zzd zzdVar2);

        abstract boolean zza(zzdpw<?> zzdpwVar, zzk zzkVar, zzk zzkVar2);

        abstract boolean zza(zzdpw<?> zzdpwVar, Object obj, Object obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zzb {
        static final zzb zzhgo = new zzb(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzdpw.zzb.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable exception;

        zzb(Throwable th) {
            this.exception = (Throwable) zzdoj.checkNotNull(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zzd {
        static final zzd zzhgr = new zzd(null, null);
        final Executor executor;
        @NullableDecl
        zzd next;
        final Runnable task;

        zzd(Runnable runnable, Executor executor) {
            this.task = runnable;
            this.executor = executor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public interface zzg<V> extends zzdri<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    static final class zzh extends zza {
        private zzh() {
            super();
        }

        @Override // com.google.android.gms.internal.ads.zzdpw.zza
        final void zza(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzdpw.zza
        final void zza(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzdpw.zza
        final boolean zza(zzdpw<?> zzdpwVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzdpwVar) {
                if (((zzdpw) zzdpwVar).waiters == zzkVar) {
                    ((zzdpw) zzdpwVar).waiters = zzkVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdpw.zza
        final boolean zza(zzdpw<?> zzdpwVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzdpwVar) {
                if (((zzdpw) zzdpwVar).listeners == zzdVar) {
                    ((zzdpw) zzdpwVar).listeners = zzdVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdpw.zza
        final boolean zza(zzdpw<?> zzdpwVar, Object obj, Object obj2) {
            synchronized (zzdpwVar) {
                if (((zzdpw) zzdpwVar).value == obj) {
                    ((zzdpw) zzdpwVar).value = obj2;
                    return true;
                }
                return false;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    static final class zzi extends zza {
        static final Unsafe zzhgt;
        static final long zzhgu;
        static final long zzhgv;
        static final long zzhgw;
        static final long zzhgx;
        static final long zzhgy;

        private zzi() {
            super();
        }

        @Override // com.google.android.gms.internal.ads.zzdpw.zza
        final void zza(zzk zzkVar, Thread thread) {
            zzhgt.putObject(zzkVar, zzhgx, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzdpw.zza
        final void zza(zzk zzkVar, zzk zzkVar2) {
            zzhgt.putObject(zzkVar, zzhgy, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzdpw.zza
        final boolean zza(zzdpw<?> zzdpwVar, zzk zzkVar, zzk zzkVar2) {
            return zzhgt.compareAndSwapObject(zzdpwVar, zzhgv, zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzdpw.zza
        final boolean zza(zzdpw<?> zzdpwVar, zzd zzdVar, zzd zzdVar2) {
            return zzhgt.compareAndSwapObject(zzdpwVar, zzhgu, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzdpw.zza
        final boolean zza(zzdpw<?> zzdpwVar, Object obj, Object obj2) {
            return zzhgt.compareAndSwapObject(zzdpwVar, zzhgw, obj, obj2);
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzdpw.zzi.1
                    @Override // java.security.PrivilegedExceptionAction
                    public /* synthetic */ Unsafe run() throws Exception {
                        Field[] declaredFields;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                zzhgv = unsafe.objectFieldOffset(zzdpw.class.getDeclaredField("waiters"));
                zzhgu = unsafe.objectFieldOffset(zzdpw.class.getDeclaredField("listeners"));
                zzhgw = unsafe.objectFieldOffset(zzdpw.class.getDeclaredField("value"));
                zzhgx = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzhgy = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                zzhgt = unsafe;
            } catch (Exception e2) {
                zzdom.zzg(e2);
                throw new RuntimeException(e2);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    static abstract class zzj<V> extends zzdpw<V> implements zzg<V> {
        @Override // com.google.android.gms.internal.ads.zzdpw, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zzk {
        static final zzk zzhgz = new zzk(false);
        @NullableDecl
        volatile zzk next;
        @NullableDecl
        volatile Thread thread;

        private zzk(boolean z) {
        }

        zzk() {
            zzdpw.zzhgn.zza(this, Thread.currentThread());
        }

        final void zzb(zzk zzkVar) {
            zzdpw.zzhgn.zza(this, zzkVar);
        }
    }

    private final void zza(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 == zzk.zzhgz) {
                return;
            }
            zzk zzkVar3 = null;
            while (zzkVar2 != null) {
                zzk zzkVar4 = zzkVar2.next;
                if (zzkVar2.thread != null) {
                    zzkVar3 = zzkVar2;
                } else if (zzkVar3 != null) {
                    zzkVar3.next = zzkVar4;
                    if (zzkVar3.thread == null) {
                        break;
                    }
                } else if (zzhgn.zza((zzdpw<?>) this, zzkVar2, zzkVar4)) {
                }
                zzkVar2 = zzkVar4;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void afterDone() {
    }

    protected void interruptTask() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zzc {
        static final zzc zzhgp;
        static final zzc zzhgq;
        @NullableDecl
        final Throwable cause;
        final boolean wasInterrupted;

        zzc(boolean z, @NullableDecl Throwable th) {
            this.wasInterrupted = z;
            this.cause = th;
        }

        static {
            if (zzdpw.GENERATE_CANCELLATION_CAUSES) {
                zzhgq = null;
                zzhgp = null;
                return;
            }
            zzhgq = new zzc(false, null);
            zzhgp = new zzc(true, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zze<V> implements Runnable {
        final zzdri<? extends V> future;
        final zzdpw<V> zzhgs;

        zze(zzdpw<V> zzdpwVar, zzdri<? extends V> zzdriVar) {
            this.zzhgs = zzdpwVar;
            this.future = zzdriVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzdpw) this.zzhgs).value != this) {
                return;
            }
            if (zzdpw.zzhgn.zza((zzdpw<?>) this.zzhgs, (Object) this, zzdpw.getFutureValue(this.future))) {
                zzdpw.zza((zzdpw<?>) this.zzhgs);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    static final class zzf extends zza {
        final AtomicReferenceFieldUpdater<zzdpw, zzd> listenersUpdater;
        final AtomicReferenceFieldUpdater<zzdpw, Object> valueUpdater;
        final AtomicReferenceFieldUpdater<zzk, zzk> waiterNextUpdater;
        final AtomicReferenceFieldUpdater<zzk, Thread> waiterThreadUpdater;
        final AtomicReferenceFieldUpdater<zzdpw, zzk> waitersUpdater;

        zzf(AtomicReferenceFieldUpdater<zzk, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<zzk, zzk> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<zzdpw, zzk> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<zzdpw, zzd> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<zzdpw, Object> atomicReferenceFieldUpdater5) {
            super();
            this.waiterThreadUpdater = atomicReferenceFieldUpdater;
            this.waiterNextUpdater = atomicReferenceFieldUpdater2;
            this.waitersUpdater = atomicReferenceFieldUpdater3;
            this.listenersUpdater = atomicReferenceFieldUpdater4;
            this.valueUpdater = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzdpw.zza
        final void zza(zzk zzkVar, Thread thread) {
            this.waiterThreadUpdater.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzdpw.zza
        final void zza(zzk zzkVar, zzk zzkVar2) {
            this.waiterNextUpdater.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzdpw.zza
        final boolean zza(zzdpw<?> zzdpwVar, zzk zzkVar, zzk zzkVar2) {
            return this.waitersUpdater.compareAndSet(zzdpwVar, zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzdpw.zza
        final boolean zza(zzdpw<?> zzdpwVar, zzd zzdVar, zzd zzdVar2) {
            return this.listenersUpdater.compareAndSet(zzdpwVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzdpw.zza
        final boolean zza(zzdpw<?> zzdpwVar, Object obj, Object obj2) {
            return this.valueUpdater.compareAndSet(zzdpwVar, obj, obj2);
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) & (!(obj instanceof zze))) {
            return (V) zzaf(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zzhgz) {
                zzk zzkVar2 = new zzk();
                do {
                    zzkVar2.zzb(zzkVar);
                    if (zzhgn.zza((zzdpw<?>) this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                zza(zzkVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) & (!(obj2 instanceof zze))) {
                                return (V) zzaf(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzkVar2);
                    } else {
                        zzkVar = this.waiters;
                    }
                } while (zzkVar != zzk.zzhgz);
                return (V) zzaf(this.value);
            }
            return (V) zzaf(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) & (!(obj3 instanceof zze))) {
                return (V) zzaf(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String zzdpwVar = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            String concat = String.valueOf(sb2).concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String valueOf = String.valueOf(concat);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                sb3.append(valueOf);
                sb3.append(convert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (z) {
                    sb4 = String.valueOf(sb4).concat(",");
                }
                concat = String.valueOf(sb4).concat(" ");
            }
            if (z) {
                String valueOf2 = String.valueOf(concat);
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                sb5.append(valueOf2);
                sb5.append(nanos2);
                sb5.append(" nanoseconds ");
                concat = sb5.toString();
            }
            sb2 = String.valueOf(concat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(zzdpwVar).length());
        sb6.append(sb2);
        sb6.append(" for ");
        sb6.append(zzdpwVar);
        throw new TimeoutException(sb6.toString());
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) & (!(obj2 instanceof zze))) {
            return (V) zzaf(obj2);
        }
        zzk zzkVar = this.waiters;
        if (zzkVar != zzk.zzhgz) {
            zzk zzkVar2 = new zzk();
            do {
                zzkVar2.zzb(zzkVar);
                if (zzhgn.zza((zzdpw<?>) this, zzkVar, zzkVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzkVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof zze))));
                    return (V) zzaf(obj);
                }
                zzkVar = this.waiters;
            } while (zzkVar != zzk.zzhgz);
            return (V) zzaf(this.value);
        }
        return (V) zzaf(this.value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static V zzaf(Object obj) throws ExecutionException {
        if (obj instanceof zzc) {
            Throwable th = ((zzc) obj).cause;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzb) {
            throw new ExecutionException(((zzb) obj).exception);
        } else {
            if (obj == NULL) {
                return null;
            }
            return obj;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof zze)) & (obj != null);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzc;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        zzc zzcVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof zze)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            zzcVar = new zzc(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            zzcVar = zzc.zzhgp;
        } else {
            zzcVar = zzc.zzhgq;
        }
        boolean z2 = false;
        zzdpw<V> zzdpwVar = this;
        while (true) {
            if (zzhgn.zza((zzdpw<?>) zzdpwVar, obj, (Object) zzcVar)) {
                if (z) {
                    zzdpwVar.interruptTask();
                }
                zza((zzdpw<?>) zzdpwVar);
                if (!(obj instanceof zze)) {
                    return true;
                }
                zzdri<? extends V> zzdriVar = ((zze) obj).future;
                if (zzdriVar instanceof zzg) {
                    zzdpwVar = (zzdpw) zzdriVar;
                    obj = zzdpwVar.value;
                    if (!(obj == null) && !(obj instanceof zze)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    zzdriVar.cancel(z);
                    return true;
                }
            } else {
                obj = zzdpwVar.value;
                if (!(obj instanceof zze)) {
                    return z2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof zzc) && ((zzc) obj).wasInterrupted;
    }

    @Override // com.google.android.gms.internal.ads.zzdri
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzdoj.checkNotNull(runnable, "Runnable was null.");
        zzdoj.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zzhgr) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzhgn.zza((zzdpw<?>) this, zzdVar, zzdVar2)) {
                    return;
                }
                zzdVar = this.listeners;
            } while (zzdVar != zzd.zzhgr);
            zza(runnable, executor);
        }
        zza(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean set(@NullableDecl V v) {
        if (v == null) {
            v = (V) NULL;
        }
        if (zzhgn.zza((zzdpw<?>) this, (Object) null, (Object) v)) {
            zza((zzdpw<?>) this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean setException(Throwable th) {
        if (zzhgn.zza((zzdpw<?>) this, (Object) null, (Object) new zzb((Throwable) zzdoj.checkNotNull(th)))) {
            zza((zzdpw<?>) this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean setFuture(zzdri<? extends V> zzdriVar) {
        zzb zzbVar;
        zzdoj.checkNotNull(zzdriVar);
        Object obj = this.value;
        if (obj == null) {
            if (zzdriVar.isDone()) {
                if (zzhgn.zza((zzdpw<?>) this, (Object) null, getFutureValue(zzdriVar))) {
                    zza((zzdpw<?>) this);
                    return true;
                }
                return false;
            }
            zze zzeVar = new zze(this, zzdriVar);
            if (zzhgn.zza((zzdpw<?>) this, (Object) null, (Object) zzeVar)) {
                try {
                    zzdriVar.addListener(zzeVar, zzdqp.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzbVar = new zzb(th);
                    } catch (Throwable unused) {
                        zzbVar = zzb.zzhgo;
                    }
                    zzhgn.zza((zzdpw<?>) this, (Object) zzeVar, (Object) zzbVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzc) {
            zzdriVar.cancel(((zzc) obj).wasInterrupted);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getFutureValue(zzdri<?> zzdriVar) {
        Throwable zza2;
        if (zzdriVar instanceof zzg) {
            Object obj = ((zzdpw) zzdriVar).value;
            if (obj instanceof zzc) {
                zzc zzcVar = (zzc) obj;
                if (zzcVar.wasInterrupted) {
                    if (zzcVar.cause != null) {
                        return new zzc(false, zzcVar.cause);
                    }
                    return zzc.zzhgq;
                }
                return obj;
            }
            return obj;
        } else if ((zzdriVar instanceof zzdrz) && (zza2 = zzdsc.zza((zzdrz) zzdriVar)) != null) {
            return new zzb(zza2);
        } else {
            boolean isCancelled = zzdriVar.isCancelled();
            if ((!GENERATE_CANCELLATION_CAUSES) & isCancelled) {
                return zzc.zzhgq;
            }
            try {
                Object uninterruptibly = getUninterruptibly(zzdriVar);
                if (!isCancelled) {
                    return uninterruptibly == null ? NULL : uninterruptibly;
                }
                String valueOf = String.valueOf(zzdriVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new zzc(false, new IllegalArgumentException(sb.toString()));
            } catch (CancellationException e) {
                if (!isCancelled) {
                    String valueOf2 = String.valueOf(zzdriVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 77);
                    sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                    sb2.append(valueOf2);
                    return new zzb(new IllegalArgumentException(sb2.toString(), e));
                }
                return new zzc(false, e);
            } catch (ExecutionException e2) {
                if (isCancelled) {
                    String valueOf3 = String.valueOf(zzdriVar);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 84);
                    sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                    sb3.append(valueOf3);
                    return new zzc(false, new IllegalArgumentException(sb3.toString(), e2));
                }
                return new zzb(e2.getCause());
            } catch (Throwable th) {
                return new zzb(th);
            }
        }
    }

    private static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.zzdpw$zza] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.zzdpw<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzdpw] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.zzdpw<V>, com.google.android.gms.internal.ads.zzdpw] */
    public static void zza(zzdpw<?> zzdpwVar) {
        zzd zzdVar;
        zzd zzdVar2;
        zzd zzdVar3 = null;
        while (true) {
            zzk zzkVar = ((zzdpw) zzdpwVar).waiters;
            if (zzhgn.zza((zzdpw) zzdpwVar, zzkVar, zzk.zzhgz)) {
                while (zzkVar != null) {
                    Thread thread = zzkVar.thread;
                    if (thread != null) {
                        zzkVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    zzkVar = zzkVar.next;
                }
                ((zzdpw) zzdpwVar).afterDone();
                do {
                    zzdVar = ((zzdpw) zzdpwVar).listeners;
                } while (!zzhgn.zza((zzdpw) zzdpwVar, zzdVar, zzd.zzhgr));
                while (true) {
                    zzdVar2 = zzdVar3;
                    zzdVar3 = zzdVar;
                    if (zzdVar3 == null) {
                        break;
                    }
                    zzdVar = zzdVar3.next;
                    zzdVar3.next = zzdVar2;
                }
                while (zzdVar2 != null) {
                    zzdVar3 = zzdVar2.next;
                    Runnable runnable = zzdVar2.task;
                    if (runnable instanceof zze) {
                        zze zzeVar = (zze) runnable;
                        zzdpwVar = zzeVar.zzhgs;
                        if (((zzdpw) zzdpwVar).value == zzeVar) {
                            if (!zzhgn.zza(zzdpwVar, zzeVar, getFutureValue(zzeVar.future))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        zza(runnable, zzdVar2.executor);
                    }
                    zzdVar2 = zzdVar3;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdrz
    @NullableDecl
    public final Throwable zzawf() {
        if (this instanceof zzg) {
            Object obj = this.value;
            if (obj instanceof zzb) {
                return ((zzb) obj).exception;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void maybePropagateCancellationTo(@NullableDecl Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    public String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zza(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.value;
            if (obj instanceof zze) {
                sb2.append(", setFuture=[");
                zza(sb2, ((zze) obj).future);
                sb2.append("]");
            } else {
                try {
                    sb = zzdok.emptyToNull(pendingToString());
                } catch (RuntimeException | StackOverflowError e) {
                    String valueOf = String.valueOf(e.getClass());
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                    sb3.append("Exception thrown from implementation: ");
                    sb3.append(valueOf);
                    sb = sb3.toString();
                }
                if (sb != null) {
                    sb2.append(", info=[");
                    sb2.append(sb);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                zza(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NullableDecl
    public String pendingToString() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb = new StringBuilder(41);
            sb.append("remaining delay=[");
            sb.append(delay);
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }

    private final void zza(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            zza(sb, uninterruptibly);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private final void zza(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    private static void zza(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = zzhgm;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e);
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzhVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        GENERATE_CANCELLATION_CAUSES = z;
        zzhgm = Logger.getLogger(zzdpw.class.getName());
        try {
            zzhVar = new zzi();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th2 = th3;
                zzhVar = new zzf(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzdpw.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzdpw.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzdpw.class, Object.class, "value"));
                th = null;
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                zzhVar = new zzh();
            }
        }
        zzhgn = zzhVar;
        if (th != null) {
            zzhgm.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzhgm.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }
}
