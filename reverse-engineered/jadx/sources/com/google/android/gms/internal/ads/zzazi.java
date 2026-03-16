package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzazi {
    private boolean zzdyr;
    private Context zzzo;
    private boolean zzyw = false;
    private final Map<BroadcastReceiver, IntentFilter> zzdyq = new WeakHashMap();
    private final BroadcastReceiver zzdyp = new zzazh(this);

    public final synchronized void initialize(Context context) {
        if (this.zzyw) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.zzzo = applicationContext;
        if (applicationContext == null) {
            this.zzzo = context;
        }
        zzzz.initialize(this.zzzo);
        this.zzdyr = ((Boolean) zzvj.zzpv().zzd(zzzz.zzcoz)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.zzzo.registerReceiver(this.zzdyp, intentFilter);
        this.zzyw = true;
    }

    public final synchronized void zza(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.zzdyr) {
            this.zzdyq.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final synchronized void zza(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.zzdyr) {
            this.zzdyq.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzc(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<BroadcastReceiver, IntentFilter> entry : this.zzdyq.entrySet()) {
            if (entry.getValue().hasAction(intent.getAction())) {
                arrayList.add(entry.getKey());
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((BroadcastReceiver) obj).onReceive(context, intent);
        }
    }
}
