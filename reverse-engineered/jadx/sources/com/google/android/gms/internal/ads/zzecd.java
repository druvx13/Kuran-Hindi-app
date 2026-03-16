package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
import com.google.android.gms.internal.ads.zzecd.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzecd<MessageType extends zzecd<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzeag<MessageType, BuilderType> {
    private static Map<Object, zzecd<?, ?>> zzhxx = new ConcurrentHashMap();
    protected zzefb zzhxv = zzefb.zzbhd();
    private int zzhxw = -1;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    public static class zzc<T extends zzecd<T, ?>> extends zzeal<T> {
        private final T zzhxs;

        public zzc(T t) {
            this.zzhxs = t;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    public static class zzd<ContainingType extends zzedo, Type> extends zzebo<ContainingType, Type> {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    static final class zze implements zzebv<zze> {
        @Override // com.google.android.gms.internal.ads.zzebv
        public final int zzw() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzebv
        public final zzefp zzbej() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzebv
        public final zzefw zzbek() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzebv
        public final boolean zzbel() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzebv
        public final boolean zzbem() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzebv
        public final zzedn zza(zzedn zzednVar, zzedo zzedoVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzebv
        public final zzedt zza(zzedt zzedtVar, zzedt zzedtVar2) {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    public enum zzf {
        public static final int zzhyb = 1;
        public static final int zzhyc = 2;
        public static final int zzhyd = 3;
        public static final int zzhye = 4;
        public static final int zzhyf = 5;
        public static final int zzhyg = 6;
        public static final int zzhyh = 7;
        public static final int zzhyj = 1;
        public static final int zzhyk = 2;
        public static final int zzhym = 1;
        public static final int zzhyn = 2;
        private static final /* synthetic */ int[] zzhyi = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzhyl = {1, 2};
        private static final /* synthetic */ int[] zzhyo = {1, 2};

        public static int[] zzbff() {
            return (int[]) zzhyi.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzecd<MessageType, BuilderType> implements zzedq {
        protected zzebt<zze> zzhxy = zzebt.zzbee();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final zzebt<zze> zzbfd() {
            if (this.zzhxy.isImmutable()) {
                this.zzhxy = (zzebt) this.zzhxy.clone();
            }
            return this.zzhxy;
        }
    }

    public String toString() {
        return zzedp.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzhsq != 0) {
            return this.zzhsq;
        }
        this.zzhsq = zzedz.zzbgk().zzax(this).hashCode(this);
        return this.zzhsq;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    public static abstract class zza<MessageType extends zzecd<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzeaj<MessageType, BuilderType> {
        private final MessageType zzhxs;
        protected MessageType zzhxt;
        protected boolean zzhxu = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public zza(MessageType messagetype) {
            this.zzhxs = messagetype;
            this.zzhxt = (MessageType) messagetype.zza(zzf.zzhye, null, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void zzbep() {
            MessageType messagetype = (MessageType) this.zzhxt.zza(zzf.zzhye, null, null);
            zza(messagetype, this.zzhxt);
            this.zzhxt = messagetype;
        }

        @Override // com.google.android.gms.internal.ads.zzedq
        public final boolean isInitialized() {
            return zzecd.zza(this.zzhxt, false);
        }

        @Override // com.google.android.gms.internal.ads.zzedn
        /* renamed from: zzbeq */
        public MessageType zzbes() {
            if (this.zzhxu) {
                return this.zzhxt;
            }
            MessageType messagetype = this.zzhxt;
            zzedz.zzbgk().zzax(messagetype).zzak(messagetype);
            this.zzhxu = true;
            return this.zzhxt;
        }

        @Override // com.google.android.gms.internal.ads.zzedn
        /* renamed from: zzber */
        public final MessageType zzbet() {
            MessageType messagetype = (MessageType) zzbes();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new zzeez(messagetype);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            zza(this.zzhxt, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzedz.zzbgk().zzax(messagetype).zzf(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzebq zzebqVar) throws zzeco {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            try {
                zzedz.zzbgk().zzax(this.zzhxt).zza(this.zzhxt, bArr, 0, i2 + 0, new zzeap(zzebqVar));
                return this;
            } catch (zzeco e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzeco.zzbfg();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.ads.zzeaj
        /* renamed from: zzb */
        public final BuilderType zza(zzebf zzebfVar, zzebq zzebqVar) throws IOException {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            try {
                zzedz.zzbgk().zzax(this.zzhxt).zza(this.zzhxt, zzebi.zza(zzebfVar), zzebqVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.ads.zzeaj
        protected final /* synthetic */ zzeaj zza(zzeag zzeagVar) {
            return zza((zza<MessageType, BuilderType>) ((zzecd) zzeagVar));
        }

        @Override // com.google.android.gms.internal.ads.zzeaj
        public final /* synthetic */ zzeaj zza(byte[] bArr, int i, int i2, zzebq zzebqVar) throws zzeco {
            return zzb(bArr, 0, i2, zzebqVar);
        }

        @Override // com.google.android.gms.internal.ads.zzeaj
        public final /* synthetic */ zzeaj zzbch() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.ads.zzedq
        public final /* synthetic */ zzedo zzbeu() {
            return this.zzhxs;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.ads.zzeaj
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zzaVar = (zza) this.zzhxs.zza(zzf.zzhyf, null, null);
            zzaVar.zza((zza) ((zzecd) zzbes()));
            return zzaVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzedz.zzbgk().zzax(this).equals(this, (zzecd) obj);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends zzecd<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzbev() {
        return (BuilderType) zza(zzf.zzhyf, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.ads.zzedq
    public final boolean isInitialized() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    public final BuilderType zzbew() {
        BuilderType buildertype = (BuilderType) zza(zzf.zzhyf, (Object) null, (Object) null);
        buildertype.zza(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzeag
    final int zzbcf() {
        return this.zzhxw;
    }

    @Override // com.google.android.gms.internal.ads.zzeag
    final void zzfk(int i) {
        this.zzhxw = i;
    }

    @Override // com.google.android.gms.internal.ads.zzedo
    public final void zzb(zzebk zzebkVar) throws IOException {
        zzedz.zzbgk().zzax(this).zza(this, zzebn.zza(zzebkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzedo
    public final int zzbex() {
        if (this.zzhxw == -1) {
            this.zzhxw = zzedz.zzbgk().zzax(this).zzau(this);
        }
        return this.zzhxw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzecd<?, ?>> T zzf(Class<T> cls) {
        zzecd<?, ?> zzecdVar = zzhxx.get(cls);
        if (zzecdVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzecdVar = zzhxx.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzecdVar == null) {
            zzecdVar = (T) ((zzecd) zzefi.zzj(cls)).zza(zzf.zzhyg, (Object) null, (Object) null);
            if (zzecdVar == null) {
                throw new IllegalStateException();
            }
            zzhxx.put(cls, zzecdVar);
        }
        return (T) zzecdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzecd<?, ?>> void zza(Class<T> cls, T t) {
        zzhxx.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zza(zzedo zzedoVar, String str, Object[] objArr) {
        return new zzeeb(zzedoVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends zzecd<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzf.zzhyb, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzaw = zzedz.zzbgk().zzax(t).zzaw(t);
        if (z) {
            t.zza(zzf.zzhyc, zzaw ? t : null, null);
        }
        return zzaw;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzeck zzbey() {
        return zzece.zzbfe();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzeck zza(zzeck zzeckVar) {
        int size = zzeckVar.size();
        return zzeckVar.zzgv(size == 0 ? 10 : size << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzecm zzbez() {
        return zzedc.zzbfx();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzecl<E> zzbfa() {
        return zzeec.zzbgn();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzecl<E> zza(zzecl<E> zzeclVar) {
        int size = zzeclVar.size();
        return zzeclVar.zzfn(size == 0 ? 10 : size << 1);
    }

    private static <T extends zzecd<T, ?>> T zza(T t, zzebf zzebfVar, zzebq zzebqVar) throws zzeco {
        T t2 = (T) t.zza(zzf.zzhye, null, null);
        try {
            zzeek zzax = zzedz.zzbgk().zzax(t2);
            zzax.zza(t2, zzebi.zza(zzebfVar), zzebqVar);
            zzax.zzak(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof zzeco) {
                throw ((zzeco) e.getCause());
            }
            throw new zzeco(e.getMessage()).zzl(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzeco) {
                throw ((zzeco) e2.getCause());
            }
            throw e2;
        }
    }

    private static <T extends zzecd<T, ?>> T zza(T t, byte[] bArr, int i, int i2, zzebq zzebqVar) throws zzeco {
        T t2 = (T) t.zza(zzf.zzhye, null, null);
        try {
            zzeek zzax = zzedz.zzbgk().zzax(t2);
            zzax.zza(t2, bArr, 0, i2, new zzeap(zzebqVar));
            zzax.zzak(t2);
            if (t2.zzhsq == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzeco) {
                throw ((zzeco) e.getCause());
            }
            throw new zzeco(e.getMessage()).zzl(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzeco.zzbfg().zzl(t2);
        }
    }

    private static <T extends zzecd<T, ?>> T zzb(T t) throws zzeco {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw new zzeco(new zzeez(t).getMessage()).zzl(t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzecd<T, ?>> T zza(T t, zzeaq zzeaqVar) throws zzeco {
        return (T) zzb(zzb(zzb(t, zzeaqVar, zzebq.zzbec())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzecd<T, ?>> T zza(T t, zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (T) zzb(zzb(t, zzeaqVar, zzebqVar));
    }

    private static <T extends zzecd<T, ?>> T zzb(T t, zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        try {
            zzebf zzbcq = zzeaqVar.zzbcq();
            T t2 = (T) zza(t, zzbcq, zzebqVar);
            try {
                zzbcq.zzfs(0);
                return t2;
            } catch (zzeco e) {
                throw e.zzl(t2);
            }
        } catch (zzeco e2) {
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzecd<T, ?>> T zza(T t, byte[] bArr) throws zzeco {
        return (T) zzb(zza(t, bArr, 0, bArr.length, zzebq.zzbec()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzecd<T, ?>> T zza(T t, byte[] bArr, zzebq zzebqVar) throws zzeco {
        return (T) zzb(zza(t, bArr, 0, bArr.length, zzebqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzedo
    public final /* synthetic */ zzedn zzbfb() {
        zza zzaVar = (zza) zza(zzf.zzhyf, (Object) null, (Object) null);
        zzaVar.zza((zza) this);
        return zzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedo
    public final /* synthetic */ zzedn zzbfc() {
        return (zza) zza(zzf.zzhyf, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.ads.zzedq
    public final /* synthetic */ zzedo zzbeu() {
        return (zzecd) zza(zzf.zzhyg, (Object) null, (Object) null);
    }
}
