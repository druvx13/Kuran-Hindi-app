package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzcu implements zzcb {
    private static final Map<String, zzcu> zza = new ArrayMap();
    private final SharedPreferences zzb;
    private volatile Map<String, ?> zze;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: com.google.android.gms.internal.measurement.zzct
        private final zzcu zza;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.zza = this;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            this.zza.zza(sharedPreferences, str);
        }
    };
    private final Object zzd = new Object();
    private final List<zzcc> zzf = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcu zza(Context context, String str) {
        zzcu zzcuVar;
        if ((!zzby.zza() || str.startsWith("direct_boot:")) ? true : zzby.zza(context)) {
            synchronized (zzcu.class) {
                zzcuVar = zza.get(str);
                if (zzcuVar == null) {
                    zzcuVar = new zzcu(zzb(context, str));
                    zza.put(str, zzcuVar);
                }
            }
            return zzcuVar;
        }
        return null;
    }

    private static SharedPreferences zzb(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (zzby.zza()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                return context.getSharedPreferences(str.substring(12), 0);
            }
            return context.getSharedPreferences(str, 0);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private zzcu(SharedPreferences sharedPreferences) {
        this.zzb = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final Object zza(String str) {
        Map<String, ?> map = this.zze;
        if (map == null) {
            synchronized (this.zzd) {
                map = this.zze;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    Map<String, ?> all = this.zzb.getAll();
                    this.zze = all;
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    map = all;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zza() {
        synchronized (zzcu.class) {
            for (zzcu zzcuVar : zza.values()) {
                zzcuVar.zzb.unregisterOnSharedPreferenceChangeListener(zzcuVar.zzc);
            }
            zza.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zzd) {
            this.zze = null;
            zzcl.zza();
        }
        synchronized (this) {
            for (zzcc zzccVar : this.zzf) {
                zzccVar.zza();
            }
        }
    }
}
