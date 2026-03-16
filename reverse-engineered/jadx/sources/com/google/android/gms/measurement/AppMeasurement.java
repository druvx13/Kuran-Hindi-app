package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhl;
import com.google.android.gms.measurement.internal.zzhm;
import com.google.android.gms.measurement.internal.zzhn;
import com.google.android.gms.measurement.internal.zzho;
import com.google.android.gms.measurement.internal.zzhp;
import com.google.android.gms.measurement.internal.zzhq;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zziw;
import com.google.android.gms.measurement.internal.zzkz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {
    public static final String CRASH_ORIGIN = "crash";
    public static final String FCM_ORIGIN = "fcm";
    public static final String FIAM_ORIGIN = "fiam";
    private static volatile AppMeasurement zza;
    private final zzgq zzb;
    private final zziq zzc;
    private final boolean zzd;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            Preconditions.checkNotNull(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                Object zza = zziw.zza(obj);
                this.mValue = zza;
                if (zza == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }

        private ConditionalUserProperty(Bundle bundle) {
            Preconditions.checkNotNull(bundle);
            this.mAppId = (String) zzhm.zza(bundle, "app_id", String.class, null);
            this.mOrigin = (String) zzhm.zza(bundle, "origin", String.class, null);
            this.mName = (String) zzhm.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null);
            this.mValue = zzhm.zza(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) zzhm.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            this.mTriggerTimeout = ((Long) zzhm.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) zzhm.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            this.mTimedOutEventParams = (Bundle) zzhm.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            this.mTriggeredEventName = (String) zzhm.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            this.mTriggeredEventParams = (Bundle) zzhm.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            this.mTimeToLive = ((Long) zzhm.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) zzhm.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            this.mExpiredEventParams = (Bundle) zzhm.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle zza() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                zzhm.zza(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str4);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, this.mCreationTimestamp);
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, this.mActive);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, this.mTriggeredTimestamp);
            return bundle;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
    /* loaded from: classes.dex */
    public static final class Event extends zzhl {
        public static final String AD_REWARD = "_ar";
        public static final String APP_EXCEPTION = "_ae";

        private Event() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
    /* loaded from: classes.dex */
    public interface EventInterceptor extends zzhq {
        @Override // com.google.android.gms.measurement.internal.zzhq
        void interceptEvent(String str, String str2, Bundle bundle, long j);
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
    /* loaded from: classes.dex */
    public interface OnEventListener extends zzhp {
        @Override // com.google.android.gms.measurement.internal.zzhp
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
    /* loaded from: classes.dex */
    public static final class Param extends zzho {
        public static final String FATAL = "fatal";
        public static final String TIMESTAMP = "timestamp";
        public static final String TYPE = "type";

        private Param() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
    /* loaded from: classes.dex */
    public static final class UserProperty extends zzhn {
        public static final String FIREBASE_LAST_NOTIFICATION = "_ln";

        private UserProperty() {
        }
    }

    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return zza(context, null, null);
    }

    private static AppMeasurement zza(Context context, String str, String str2) {
        if (zza == null) {
            synchronized (AppMeasurement.class) {
                if (zza == null) {
                    zziq zzb = zzb(context, null);
                    if (zzb != null) {
                        zza = new AppMeasurement(zzb);
                    } else {
                        zza = new AppMeasurement(zzgq.zza(context, null, null, null));
                    }
                }
            }
        }
        return zza;
    }

    public static AppMeasurement zza(Context context, Bundle bundle) {
        if (zza == null) {
            synchronized (AppMeasurement.class) {
                if (zza == null) {
                    zziq zzb = zzb(context, bundle);
                    if (zzb != null) {
                        zza = new AppMeasurement(zzb);
                    } else {
                        zza = new AppMeasurement(zzgq.zza(context, null, null, bundle));
                    }
                }
            }
        }
        return zza;
    }

    private static zziq zzb(Context context, Bundle bundle) {
        try {
            return (zziq) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, bundle);
        } catch (ClassNotFoundException | Exception unused) {
            return null;
        }
    }

    @Deprecated
    public void setMeasurementEnabled(boolean z) {
        if (this.zzd) {
            this.zzc.zza(z);
        } else {
            this.zzb.zzh().zza(z);
        }
    }

    public final void zza(boolean z) {
        if (this.zzd) {
            this.zzc.zzb(z);
        } else {
            this.zzb.zzh().zzb(z);
        }
    }

    private AppMeasurement(zzgq zzgqVar) {
        Preconditions.checkNotNull(zzgqVar);
        this.zzb = zzgqVar;
        this.zzc = null;
        this.zzd = false;
    }

    private AppMeasurement(zziq zziqVar) {
        Preconditions.checkNotNull(zziqVar);
        this.zzc = zziqVar;
        this.zzb = null;
        this.zzd = true;
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.zzd) {
            this.zzc.zza(str, str2, bundle);
        } else {
            this.zzb.zzh().zza(str, str2, bundle);
        }
    }

    public void logEventInternalNoInterceptor(String str, String str2, Bundle bundle, long j) {
        if (this.zzd) {
            this.zzc.zza(str, str2, bundle, j);
        } else {
            this.zzb.zzh().zza(str, str2, bundle, true, false, j);
        }
    }

    public void setUserPropertyInternal(String str, String str2, Object obj) {
        Preconditions.checkNotEmpty(str);
        if (this.zzd) {
            this.zzc.zza(str, str2, obj);
        } else {
            this.zzb.zzh().zza(str, str2, obj, true);
        }
    }

    public Map<String, Object> getUserProperties(boolean z) {
        if (this.zzd) {
            return this.zzc.zza((String) null, (String) null, z);
        }
        List<zzkz> zzc = this.zzb.zzh().zzc(z);
        ArrayMap arrayMap = new ArrayMap(zzc.size());
        for (zzkz zzkzVar : zzc) {
            arrayMap.put(zzkzVar.zza, zzkzVar.zza());
        }
        return arrayMap;
    }

    public void setEventInterceptor(EventInterceptor eventInterceptor) {
        if (this.zzd) {
            this.zzc.zza(eventInterceptor);
        } else {
            this.zzb.zzh().zza(eventInterceptor);
        }
    }

    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        if (this.zzd) {
            this.zzc.zza(onEventListener);
        } else {
            this.zzb.zzh().zza(onEventListener);
        }
    }

    public void unregisterOnMeasurementEventListener(OnEventListener onEventListener) {
        if (this.zzd) {
            this.zzc.zzb(onEventListener);
        } else {
            this.zzb.zzh().zzb(onEventListener);
        }
    }

    public String getCurrentScreenName() {
        if (this.zzd) {
            return this.zzc.zza();
        }
        return this.zzb.zzh().zzaj();
    }

    public String getCurrentScreenClass() {
        if (this.zzd) {
            return this.zzc.zzb();
        }
        return this.zzb.zzh().zzak();
    }

    public String getAppInstanceId() {
        if (this.zzd) {
            return this.zzc.zzc();
        }
        return this.zzb.zzh().zzah();
    }

    public String getGmpAppId() {
        if (this.zzd) {
            return this.zzc.zzd();
        }
        return this.zzb.zzh().zzal();
    }

    public long generateEventId() {
        if (this.zzd) {
            return this.zzc.zze();
        }
        return this.zzb.zzi().zzg();
    }

    public void beginAdUnitExposure(String str) {
        if (this.zzd) {
            this.zzc.zza(str);
        } else {
            this.zzb.zzz().zza(str, this.zzb.zzm().elapsedRealtime());
        }
    }

    public void endAdUnitExposure(String str) {
        if (this.zzd) {
            this.zzc.zzb(str);
        } else {
            this.zzb.zzz().zzb(str, this.zzb.zzm().elapsedRealtime());
        }
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        if (this.zzd) {
            this.zzc.zza(conditionalUserProperty.zza());
        } else {
            this.zzb.zzh().zza(conditionalUserProperty.zza());
        }
    }

    protected void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        if (!this.zzd) {
            this.zzb.zzh().zzb(conditionalUserProperty.zza());
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.zzd) {
            this.zzc.zzb(str, str2, bundle);
        } else {
            this.zzb.zzh().zzc(str, str2, bundle);
        }
    }

    protected void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (this.zzd) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.zzb.zzh().zza(str, str2, str3, bundle);
    }

    protected Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        if (this.zzd) {
            return this.zzc.zza(str, str2, z);
        }
        return this.zzb.zzh().zza(str, str2, z);
    }

    protected Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.zzd) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        return this.zzb.zzh().zza(str, str2, str3, z);
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> zza2;
        if (this.zzd) {
            zza2 = this.zzc.zza(str, str2);
        } else {
            zza2 = this.zzb.zzh().zza(str, str2);
        }
        ArrayList arrayList = new ArrayList(zza2 == null ? 0 : zza2.size());
        for (Bundle bundle : zza2) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    protected List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.zzd) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        ArrayList<Bundle> zza2 = this.zzb.zzh().zza(str, str2, str3);
        int i = 0;
        ArrayList arrayList = new ArrayList(zza2 == null ? 0 : zza2.size());
        ArrayList<Bundle> arrayList2 = zza2;
        int size = arrayList2.size();
        while (i < size) {
            Bundle bundle = arrayList2.get(i);
            i++;
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    public int getMaxUserProperties(String str) {
        if (this.zzd) {
            return this.zzc.zzc(str);
        }
        this.zzb.zzh();
        Preconditions.checkNotEmpty(str);
        return 25;
    }

    public Boolean getBoolean() {
        if (this.zzd) {
            return (Boolean) this.zzc.zza(4);
        }
        return this.zzb.zzh().zzac();
    }

    public String getString() {
        if (this.zzd) {
            return (String) this.zzc.zza(0);
        }
        return this.zzb.zzh().zzad();
    }

    public Long getLong() {
        if (this.zzd) {
            return (Long) this.zzc.zza(1);
        }
        return this.zzb.zzh().zzae();
    }

    public Integer getInteger() {
        if (this.zzd) {
            return (Integer) this.zzc.zza(3);
        }
        return this.zzb.zzh().zzaf();
    }

    public Double getDouble() {
        if (this.zzd) {
            return (Double) this.zzc.zza(2);
        }
        return this.zzb.zzh().zzag();
    }
}
