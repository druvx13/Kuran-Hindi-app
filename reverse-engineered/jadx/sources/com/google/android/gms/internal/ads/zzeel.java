package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public class zzeel<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzhuu;
    private final int zzibr;
    private List<zzeeu> zzibs;
    private Map<K, V> zzibt;
    private volatile zzeew zzibu;
    private Map<K, V> zzibv;
    private volatile zzeeq zzibw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends zzebv<FieldDescriptorType>> zzeel<FieldDescriptorType, Object> zzhi(int i) {
        return new zzeeo(i);
    }

    private zzeel(int i) {
        this.zzibr = i;
        this.zzibs = Collections.emptyList();
        this.zzibt = Collections.emptyMap();
        this.zzibv = Collections.emptyMap();
    }

    public void zzbcj() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.zzhuu) {
            return;
        }
        if (this.zzibt.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.zzibt);
        }
        this.zzibt = unmodifiableMap;
        if (this.zzibv.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.zzibv);
        }
        this.zzibv = unmodifiableMap2;
        this.zzhuu = true;
    }

    public final boolean isImmutable() {
        return this.zzhuu;
    }

    public final int zzbgq() {
        return this.zzibs.size();
    }

    public final Map.Entry<K, V> zzhj(int i) {
        return this.zzibs.get(i);
    }

    public final Iterable<Map.Entry<K, V>> zzbgr() {
        if (this.zzibt.isEmpty()) {
            return zzeep.zzbhb();
        }
        return this.zzibt.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzibs.size() + this.zzibt.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzeel<K, V>) comparable) >= 0 || this.zzibt.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzeel<K, V>) comparable);
        if (zza >= 0) {
            return (V) this.zzibs.get(zza).getValue();
        }
        return this.zzibt.get(comparable);
    }

    public final V zza(K k, V v) {
        zzbgt();
        int zza = zza((zzeel<K, V>) k);
        if (zza >= 0) {
            return (V) this.zzibs.get(zza).setValue(v);
        }
        zzbgt();
        if (this.zzibs.isEmpty() && !(this.zzibs instanceof ArrayList)) {
            this.zzibs = new ArrayList(this.zzibr);
        }
        int i = -(zza + 1);
        if (i >= this.zzibr) {
            return zzbgu().put(k, v);
        }
        int size = this.zzibs.size();
        int i2 = this.zzibr;
        if (size == i2) {
            zzeeu remove = this.zzibs.remove(i2 - 1);
            zzbgu().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.zzibs.add(i, new zzeeu(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzbgt();
        if (!this.zzibs.isEmpty()) {
            this.zzibs.clear();
        }
        if (this.zzibt.isEmpty()) {
            return;
        }
        this.zzibt.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzbgt();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzeel<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzhk(zza);
        }
        if (this.zzibt.isEmpty()) {
            return null;
        }
        return this.zzibt.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzhk(int i) {
        zzbgt();
        V v = (V) this.zzibs.remove(i).getValue();
        if (!this.zzibt.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzbgu().entrySet().iterator();
            this.zzibs.add(new zzeeu(this, it.next()));
            it.remove();
        }
        return v;
    }

    private final int zza(K k) {
        int size = this.zzibs.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzibs.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzibs.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzibu == null) {
            this.zzibu = new zzeew(this, null);
        }
        return this.zzibu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzbgs() {
        if (this.zzibw == null) {
            this.zzibw = new zzeeq(this, null);
        }
        return this.zzibw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbgt() {
        if (this.zzhuu) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzbgu() {
        zzbgt();
        if (this.zzibt.isEmpty() && !(this.zzibt instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzibt = treeMap;
            this.zzibv = treeMap.descendingMap();
        }
        return (SortedMap) this.zzibt;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzeel)) {
            return super.equals(obj);
        }
        zzeel zzeelVar = (zzeel) obj;
        int size = size();
        if (size != zzeelVar.size()) {
            return false;
        }
        int zzbgq = zzbgq();
        if (zzbgq != zzeelVar.zzbgq()) {
            return entrySet().equals(zzeelVar.entrySet());
        }
        for (int i = 0; i < zzbgq; i++) {
            if (!zzhj(i).equals(zzeelVar.zzhj(i))) {
                return false;
            }
        }
        if (zzbgq != size) {
            return this.zzibt.equals(zzeelVar.zzibt);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zzbgq = zzbgq();
        int i = 0;
        for (int i2 = 0; i2 < zzbgq; i2++) {
            i += this.zzibs.get(i2).hashCode();
        }
        return this.zzibt.size() > 0 ? i + this.zzibt.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzeel<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeel(int i, zzeeo zzeeoVar) {
        this(i);
    }
}
