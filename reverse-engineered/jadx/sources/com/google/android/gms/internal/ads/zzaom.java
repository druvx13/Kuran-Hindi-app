package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaom extends zzapb {
    private final Map<String, String> zzcux;
    private String zzdic;
    private long zzdid;
    private long zzdie;
    private String zzdif;
    private String zzdig;
    private final Context zzvf;

    public zzaom(zzbek zzbekVar, Map<String, String> map) {
        super(zzbekVar, "createCalendarEvent");
        this.zzcux = map;
        this.zzvf = zzbekVar.zzzh();
        this.zzdic = zzdt("description");
        this.zzdif = zzdt("summary");
        this.zzdid = zzdu("start_ticks");
        this.zzdie = zzdu("end_ticks");
        this.zzdig = zzdt(FirebaseAnalytics.Param.LOCATION);
    }

    private final String zzdt(String str) {
        return TextUtils.isEmpty(this.zzcux.get(str)) ? "" : this.zzcux.get(str);
    }

    private final long zzdu(String str) {
        String str2 = this.zzcux.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void execute() {
        if (this.zzvf == null) {
            zzdv("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzq.zzkw();
        if (!zzaxa.zzas(this.zzvf).zzqy()) {
            zzdv("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzq.zzkw();
        AlertDialog.Builder zzar = zzaxa.zzar(this.zzvf);
        Resources resources = com.google.android.gms.ads.internal.zzq.zzla().getResources();
        zzar.setTitle(resources != null ? resources.getString(R.string.s5) : "Create calendar event");
        zzar.setMessage(resources != null ? resources.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        zzar.setPositiveButton(resources != null ? resources.getString(R.string.s3) : "Accept", new zzaop(this));
        zzar.setNegativeButton(resources != null ? resources.getString(R.string.s4) : "Decline", new zzaoo(this));
        zzar.create().show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Intent createIntent() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzdic);
        data.putExtra("eventLocation", this.zzdig);
        data.putExtra("description", this.zzdif);
        long j = this.zzdid;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zzdie;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }
}
