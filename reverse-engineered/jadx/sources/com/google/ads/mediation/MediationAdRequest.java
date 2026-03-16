package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
@Deprecated
/* loaded from: classes.dex */
public class MediationAdRequest {
    private final Date zzml;
    private final AdRequest.Gender zzmm;
    private final Set<String> zzmn;
    private final boolean zzmo;
    private final Location zzmp;

    public MediationAdRequest(Date date, AdRequest.Gender gender, Set<String> set, boolean z, Location location) {
        this.zzml = date;
        this.zzmm = gender;
        this.zzmn = set;
        this.zzmo = z;
        this.zzmp = location;
    }

    public Integer getAgeInYears() {
        if (this.zzml != null) {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTime(this.zzml);
            Integer valueOf = Integer.valueOf(calendar2.get(1) - calendar.get(1));
            return (calendar2.get(2) < calendar.get(2) || (calendar2.get(2) == calendar.get(2) && calendar2.get(5) < calendar.get(5))) ? Integer.valueOf(valueOf.intValue() - 1) : valueOf;
        }
        return null;
    }

    public Date getBirthday() {
        return this.zzml;
    }

    public AdRequest.Gender getGender() {
        return this.zzmm;
    }

    public Set<String> getKeywords() {
        return this.zzmn;
    }

    public Location getLocation() {
        return this.zzmp;
    }

    public boolean isTesting() {
        return this.zzmo;
    }
}
