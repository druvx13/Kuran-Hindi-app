package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzzv implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzciq;
    private final Object lock = new Object();
    private final ConditionVariable zzcin = new ConditionVariable();
    private volatile boolean zzyw = false;
    private volatile boolean zzcio = false;
    private SharedPreferences zzcip = null;
    private Bundle metaData = new Bundle();
    private JSONObject zzcir = new JSONObject();

    public final void initialize(Context context) {
        if (this.zzyw) {
            return;
        }
        synchronized (this.lock) {
            if (this.zzyw) {
                return;
            }
            if (!this.zzcio) {
                this.zzcio = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.zzciq = applicationContext;
            try {
                this.metaData = Wrappers.packageManager(applicationContext).getApplicationInfo(this.zzciq.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null && context != null) {
                Context applicationContext2 = context.getApplicationContext();
                if (applicationContext2 != null) {
                    context = applicationContext2;
                }
                remoteContext = context;
            }
            if (remoteContext == null) {
                this.zzcio = false;
                this.zzcin.open();
                return;
            }
            zzvj.zzpt();
            SharedPreferences sharedPreferences = remoteContext.getSharedPreferences("google_ads_flags", 0);
            this.zzcip = sharedPreferences;
            if (sharedPreferences != null) {
                sharedPreferences.registerOnSharedPreferenceChangeListener(this);
            }
            zzacb.zza(new zzzw(this));
            zzrc();
            this.zzyw = true;
            this.zzcio = false;
            this.zzcin.open();
        }
    }

    public final <T> T zzd(final zzzk<T> zzzkVar) {
        if (!this.zzcin.block(5000L)) {
            synchronized (this.lock) {
                if (!this.zzcio) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzyw || this.zzcip == null) {
            synchronized (this.lock) {
                if (this.zzyw && this.zzcip != null) {
                }
                return zzzkVar.zzqz();
            }
        }
        if (zzzkVar.getSource() == 2) {
            Bundle bundle = this.metaData;
            if (bundle == null) {
                return zzzkVar.zzqz();
            }
            return zzzkVar.zza(bundle);
        } else if (zzzkVar.getSource() == 1 && this.zzcir.has(zzzkVar.getKey())) {
            return zzzkVar.zzb(this.zzcir);
        } else {
            return (T) zzaze.zza(new zzdon(this, zzzkVar) { // from class: com.google.android.gms.internal.ads.zzzu
                private final zzzv zzcil;
                private final zzzk zzcim;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzcil = this;
                    this.zzcim = zzzkVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdon
                public final Object get() {
                    return this.zzcil.zze(this.zzcim);
                }
            });
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzrc();
        }
    }

    private final void zzrc() {
        if (this.zzcip == null) {
            return;
        }
        try {
            this.zzcir = new JSONObject((String) zzaze.zza(new zzdon(this) { // from class: com.google.android.gms.internal.ads.zzzx
                private final zzzv zzcil;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzcil = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdon
                public final Object get() {
                    return this.zzcil.zzrd();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzrd() {
        return this.zzcip.getString("flag_configuration", "{}");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zze(zzzk zzzkVar) {
        return zzzkVar.zza(this.zzcip);
    }
}
