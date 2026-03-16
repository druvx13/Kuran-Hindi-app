package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzdpy<I, O, F, T> extends zzdqq<O> implements Runnable {
    @NullableDecl
    private zzdri<? extends I> zzhgj;
    @NullableDecl
    private F zzhha;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <I, O> zzdri<O> zza(zzdri<I> zzdriVar, zzdqj<? super I, ? extends O> zzdqjVar, Executor executor) {
        zzdoj.checkNotNull(executor);
        zzdqb zzdqbVar = new zzdqb(zzdriVar, zzdqjVar);
        zzdriVar.addListener(zzdqbVar, zzdrk.zza(executor, zzdqbVar));
        return zzdqbVar;
    }

    abstract void setResult(@NullableDecl T t);

    @NullableDecl
    abstract T zzc(F f, @NullableDecl I i) throws Exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <I, O> zzdri<O> zza(zzdri<I> zzdriVar, zzdnx<? super I, ? extends O> zzdnxVar, Executor executor) {
        zzdoj.checkNotNull(zzdnxVar);
        zzdqa zzdqaVar = new zzdqa(zzdriVar, zzdnxVar);
        zzdriVar.addListener(zzdqaVar, zzdrk.zza(executor, zzdqaVar));
        return zzdqaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpy(zzdri<? extends I> zzdriVar, F f) {
        this.zzhgj = (zzdri) zzdoj.checkNotNull(zzdriVar);
        this.zzhha = (F) zzdoj.checkNotNull(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zzdri<? extends I> zzdriVar = this.zzhgj;
        F f = this.zzhha;
        if ((isCancelled() | (zzdriVar == null)) || (f == null)) {
            return;
        }
        this.zzhgj = null;
        if (zzdriVar.isCancelled()) {
            setFuture(zzdriVar);
            return;
        }
        try {
            try {
                Object zzc = zzc(f, zzdqw.zza(zzdriVar));
                this.zzhha = null;
                setResult(zzc);
            } catch (Throwable th) {
                try {
                    setException(th);
                } finally {
                    this.zzhha = null;
                }
            }
        } catch (Error e) {
            setException(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            setException(e2);
        } catch (ExecutionException e3) {
            setException(e3.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdpw
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzhgj);
        this.zzhgj = null;
        this.zzhha = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdpw
    public final String pendingToString() {
        String str;
        zzdri<? extends I> zzdriVar = this.zzhgj;
        F f = this.zzhha;
        String pendingToString = super.pendingToString();
        if (zzdriVar != null) {
            String valueOf = String.valueOf(zzdriVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f == null) {
            if (pendingToString != null) {
                String valueOf2 = String.valueOf(str);
                String valueOf3 = String.valueOf(pendingToString);
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            return null;
        }
        String valueOf4 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf4).length());
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(valueOf4);
        sb2.append("]");
        return sb2.toString();
    }
}
