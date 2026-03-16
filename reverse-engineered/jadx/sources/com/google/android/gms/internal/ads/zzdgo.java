package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdgo {
    public final String zzagd;
    public final boolean zzbmh;
    public final List<String> zzdeu;
    public final List<String> zzdev;
    public final String zzdfa;
    public final boolean zzdfh;
    public final boolean zzdfi;
    public final boolean zzdfj;
    public final String zzdfq;
    public final String zzdgb;
    public final String zzdgc;
    public final String zzdhp;
    public final List<String> zzdnv;
    public final String zzdny;
    public final String zzdob;
    public final zzatc zzdoi;
    public final List<String> zzdoj;
    public final List<String> zzdok;
    public final boolean zzdos;
    public final boolean zzdov;
    public final boolean zzdow;
    public final boolean zzdpp;
    public final boolean zzejq;
    public final String zzelw;
    public final int zzfil;
    public final boolean zzfim;
    public final boolean zzfin;
    public final String zzfnb;
    public final List<String> zzgtk;
    public final int zzgtl;
    public final int zzgtm;
    public final List<String> zzgtn;
    public final List<String> zzgto;
    public final List<String> zzgtp;
    public final List<zzdgn> zzgtq;
    public final zzdgs zzgtr;
    public final List<String> zzgts;
    public final List<zzdgn> zzgtt;
    public final JSONObject zzgtu;
    public final zzaum zzgtv;
    public final JSONObject zzgtw;
    public final JSONObject zzgtx;
    public final int zzgty;
    public final int zzgtz;
    public final JSONObject zzgua;
    public final int zzgub;
    public final boolean zzguc;
    public final zzapl zzgud;
    public final zzuo zzgue;
    public final String zzguf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdgo(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject jSONObject;
        char c;
        List<zzdgn> list;
        List<String> emptyList = Collections.emptyList();
        List<String> emptyList2 = Collections.emptyList();
        List<String> emptyList3 = Collections.emptyList();
        List<String> emptyList4 = Collections.emptyList();
        List<String> emptyList5 = Collections.emptyList();
        Collections.emptyList();
        List<String> emptyList6 = Collections.emptyList();
        List<String> emptyList7 = Collections.emptyList();
        List<String> emptyList8 = Collections.emptyList();
        List<String> emptyList9 = Collections.emptyList();
        List<zzdgn> emptyList10 = Collections.emptyList();
        List<String> emptyList11 = Collections.emptyList();
        List<zzdgn> emptyList12 = Collections.emptyList();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        jsonReader.beginObject();
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        JSONObject jSONObject6 = jSONObject3;
        JSONObject jSONObject7 = jSONObject4;
        JSONObject jSONObject8 = jSONObject5;
        zzatc zzatcVar = null;
        zzdgs zzdgsVar = null;
        zzaum zzaumVar = null;
        zzapl zzaplVar = null;
        zzuo zzuoVar = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i3 = -1;
        int i4 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int i5 = 0;
        boolean z10 = false;
        int i6 = -1;
        boolean z11 = false;
        boolean z12 = true;
        List<zzdgn> list2 = emptyList12;
        JSONObject jSONObject9 = jSONObject2;
        List<zzdgn> list3 = emptyList10;
        List<String> list4 = emptyList11;
        List<String> list5 = emptyList8;
        List<String> list6 = emptyList9;
        List<String> list7 = emptyList6;
        List<String> list8 = emptyList7;
        List<String> list9 = emptyList4;
        List<String> list10 = emptyList5;
        List<String> list11 = emptyList2;
        List<String> list12 = emptyList3;
        List<String> list13 = emptyList;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str12 = nextName == null ? "" : nextName;
            switch (str12.hashCode()) {
                case -1980587809:
                    jSONObject = jSONObject9;
                    if (str12.equals("debug_signals")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case -1965512151:
                    jSONObject = jSONObject9;
                    if (str12.equals("omid_settings")) {
                        c = '&';
                        break;
                    }
                    c = 65535;
                    break;
                case -1812055556:
                    jSONObject = jSONObject9;
                    if (str12.equals("play_prewarm_options")) {
                        c = '/';
                        break;
                    }
                    c = 65535;
                    break;
                case -1620470467:
                    jSONObject = jSONObject9;
                    if (str12.equals("backend_query_id")) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case -1440104884:
                    jSONObject = jSONObject9;
                    if (str12.equals("is_custom_close_blocked")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case -1439500848:
                    jSONObject = jSONObject9;
                    if (str12.equals("orientation")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case -1428969291:
                    jSONObject = jSONObject9;
                    if (str12.equals("enable_omid")) {
                        c = '$';
                        break;
                    }
                    c = 65535;
                    break;
                case -1403779768:
                    jSONObject = jSONObject9;
                    if (str12.equals("showable_impression_type")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case -1360811658:
                    jSONObject = jSONObject9;
                    if (str12.equals("ad_sizes")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -1306015996:
                    jSONObject = jSONObject9;
                    if (str12.equals("adapters")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1289032093:
                    jSONObject = jSONObject9;
                    if (str12.equals("extras")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case -1240082064:
                    jSONObject = jSONObject9;
                    if (str12.equals("ad_event_value")) {
                        c = '1';
                        break;
                    }
                    c = 65535;
                    break;
                case -1234181075:
                    jSONObject = jSONObject9;
                    if (str12.equals("allow_pub_rendered_attribution")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -1181000426:
                    jSONObject = jSONObject9;
                    if (str12.equals("is_augmented_reality_ad")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case -1152230954:
                    jSONObject = jSONObject9;
                    if (str12.equals("ad_type")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146534047:
                    jSONObject = jSONObject9;
                    if (str12.equals("is_scroll_aware")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case -1115838944:
                    jSONObject = jSONObject9;
                    if (str12.equals("fill_urls")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1081936678:
                    jSONObject = jSONObject9;
                    if (str12.equals("allocation_id")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -1078050970:
                    jSONObject = jSONObject9;
                    if (str12.equals("video_complete_urls")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1051269058:
                    jSONObject = jSONObject9;
                    if (str12.equals("active_view")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -982608540:
                    jSONObject = jSONObject9;
                    if (str12.equals("valid_from_timestamp")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -776859333:
                    jSONObject = jSONObject9;
                    if (str12.equals("click_urls")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -544216775:
                    jSONObject = jSONObject9;
                    if (str12.equals("safe_browsing")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case -437057161:
                    jSONObject = jSONObject9;
                    if (str12.equals("imp_urls")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -404326515:
                    jSONObject = jSONObject9;
                    if (str12.equals("render_timeout_ms")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case -397704715:
                    jSONObject = jSONObject9;
                    if (str12.equals("ad_close_time_ms")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case -369773488:
                    jSONObject = jSONObject9;
                    if (str12.equals("is_close_button_enabled")) {
                        c = '0';
                        break;
                    }
                    c = 65535;
                    break;
                case -213424028:
                    jSONObject = jSONObject9;
                    if (str12.equals("watermark")) {
                        c = ',';
                        break;
                    }
                    c = 65535;
                    break;
                case -29338502:
                    jSONObject = jSONObject9;
                    if (str12.equals("allow_custom_click_gesture")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 3107:
                    jSONObject = jSONObject9;
                    if (str12.equals("ad")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    jSONObject = jSONObject9;
                    if (str12.equals("id")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 3076010:
                    jSONObject = jSONObject9;
                    if (str12.equals("data")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 63195984:
                    jSONObject = jSONObject9;
                    if (str12.equals("render_test_label")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 107433883:
                    jSONObject = jSONObject9;
                    if (str12.equals("qdata")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 230323073:
                    jSONObject = jSONObject9;
                    if (str12.equals("ad_load_urls")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 418392395:
                    jSONObject = jSONObject9;
                    if (str12.equals("is_closable_area_disabled")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 597473788:
                    jSONObject = jSONObject9;
                    if (str12.equals("debug_dialog_string")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 673261304:
                    jSONObject = jSONObject9;
                    if (str12.equals("reward_granted_urls")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 754887508:
                    jSONObject = jSONObject9;
                    if (str12.equals("container_sizes")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 791122864:
                    jSONObject = jSONObject9;
                    if (str12.equals("impression_type")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1010584092:
                    jSONObject = jSONObject9;
                    if (str12.equals(FirebaseAnalytics.Param.TRANSACTION_ID)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1100650276:
                    jSONObject = jSONObject9;
                    if (str12.equals("rewards")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1321720943:
                    jSONObject = jSONObject9;
                    if (str12.equals("allow_pub_owned_ad_view")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 1637553475:
                    jSONObject = jSONObject9;
                    if (str12.equals("bid_response")) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case 1638957285:
                    jSONObject = jSONObject9;
                    if (str12.equals("video_start_urls")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1688341040:
                    jSONObject = jSONObject9;
                    if (str12.equals("video_reward_urls")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1799285870:
                    jSONObject = jSONObject9;
                    if (str12.equals("use_third_party_container_height")) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case 1839650832:
                    jSONObject = jSONObject9;
                    if (str12.equals("renderers")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1875425491:
                    jSONObject = jSONObject9;
                    if (str12.equals("is_analytics_logging_enabled")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case 2068142375:
                    jSONObject = jSONObject9;
                    if (str12.equals("rule_line_external_id")) {
                        c = '2';
                        break;
                    }
                    c = 65535;
                    break;
                case 2072888499:
                    jSONObject = jSONObject9;
                    if (str12.equals("manual_tracking_urls")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    jSONObject = jSONObject9;
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    list = list2;
                    list13 = zzayu.zza(jsonReader);
                    list2 = list;
                    break;
                case 1:
                    list = list2;
                    String nextString = jsonReader.nextString();
                    if ("banner".equals(nextString)) {
                        i = 1;
                    } else if ("interstitial".equals(nextString)) {
                        i = 2;
                    } else if ("native_express".equals(nextString)) {
                        i = 3;
                    } else if ("native".equals(nextString)) {
                        i = 4;
                    } else {
                        i = "rewarded".equals(nextString) ? 5 : 0;
                    }
                    list2 = list;
                    break;
                case 2:
                    list = list2;
                    list11 = zzayu.zza(jsonReader);
                    list2 = list;
                    break;
                case 3:
                    list = list2;
                    list12 = zzayu.zza(jsonReader);
                    list2 = list;
                    break;
                case 4:
                    list = list2;
                    list9 = zzayu.zza(jsonReader);
                    list2 = list;
                    break;
                case 5:
                    list = list2;
                    int nextInt = jsonReader.nextInt();
                    i2 = (nextInt == 0 || nextInt == 1) ? nextInt : 0;
                    list2 = list;
                    break;
                case 6:
                    list = list2;
                    list10 = zzayu.zza(jsonReader);
                    list2 = list;
                    break;
                case 7:
                    list = list2;
                    zzayu.zza(jsonReader);
                    list2 = list;
                    break;
                case '\b':
                    list = list2;
                    list7 = zzayu.zza(jsonReader);
                    list2 = list;
                    break;
                case '\t':
                    list = list2;
                    list8 = zzayu.zza(jsonReader);
                    list2 = list;
                    break;
                case '\n':
                    list = list2;
                    str = jsonReader.nextString();
                    list2 = list;
                    break;
                case 11:
                    list = list2;
                    str2 = jsonReader.nextString();
                    list2 = list;
                    break;
                case '\f':
                    list = list2;
                    zzatcVar = zzatc.zza(zzayu.zzd(jsonReader));
                    list2 = list;
                    break;
                case '\r':
                    list = list2;
                    list5 = zzayu.zza(jsonReader);
                    list2 = list;
                    break;
                case 14:
                    list = list2;
                    list6 = zzayu.zza(jsonReader);
                    list2 = list;
                    break;
                case 15:
                    list = list2;
                    list3 = zzdgn.zze(jsonReader);
                    list2 = list;
                    break;
                case 16:
                    list = list2;
                    zzdgsVar = new zzdgs(jsonReader);
                    list2 = list;
                    break;
                case 17:
                    list2 = zzdgn.zze(jsonReader);
                    break;
                case 18:
                    list4 = zzayu.zza(jsonReader);
                    break;
                case 19:
                    str3 = jsonReader.nextString();
                    break;
                case 20:
                    jSONObject9 = zzayu.zzc(jsonReader);
                    continue;
                case 21:
                    str4 = jsonReader.nextString();
                    break;
                case 22:
                    str5 = jsonReader.nextString();
                    break;
                case 23:
                    str6 = zzayu.zzc(jsonReader).toString();
                    break;
                case 24:
                    zzaumVar = zzaum.zzg(zzayu.zzc(jsonReader));
                    break;
                case 25:
                    str7 = jsonReader.nextString();
                    break;
                case 26:
                    jSONObject6 = zzayu.zzc(jsonReader);
                    break;
                case 27:
                    jSONObject7 = zzayu.zzc(jsonReader);
                    break;
                case 28:
                    z = jsonReader.nextBoolean();
                    break;
                case 29:
                    z2 = jsonReader.nextBoolean();
                    break;
                case 30:
                    z3 = jsonReader.nextBoolean();
                    break;
                case 31:
                    z4 = jsonReader.nextBoolean();
                    break;
                case ' ':
                    z5 = jsonReader.nextBoolean();
                    break;
                case '!':
                    z6 = jsonReader.nextBoolean();
                    break;
                case '\"':
                    list = list2;
                    String nextString2 = jsonReader.nextString();
                    if ("landscape".equalsIgnoreCase(nextString2)) {
                        com.google.android.gms.ads.internal.zzq.zzky();
                        i3 = 6;
                    } else if ("portrait".equalsIgnoreCase(nextString2)) {
                        com.google.android.gms.ads.internal.zzq.zzky();
                        i3 = 7;
                    } else {
                        i3 = -1;
                    }
                    list2 = list;
                    break;
                case '#':
                    i4 = jsonReader.nextInt();
                    break;
                case '$':
                    z7 = jsonReader.nextBoolean();
                    break;
                case '%':
                    str8 = jsonReader.nextString();
                    break;
                case '&':
                    jSONObject8 = zzayu.zzc(jsonReader);
                    break;
                case '\'':
                    z8 = jsonReader.nextBoolean();
                    break;
                case '(':
                    z9 = jsonReader.nextBoolean();
                    break;
                case ')':
                    i5 = jsonReader.nextInt();
                    break;
                case '*':
                    z10 = jsonReader.nextBoolean();
                    break;
                case '+':
                    i6 = jsonReader.nextInt();
                    break;
                case ',':
                    str9 = jsonReader.nextString();
                    break;
                case '-':
                    str10 = jsonReader.nextString();
                    break;
                case '.':
                    z11 = jsonReader.nextBoolean();
                    break;
                case '/':
                    JSONObject zzc = zzayu.zzc(jsonReader);
                    if (zzc == null) {
                        list = list2;
                        zzaplVar = null;
                    } else {
                        list = list2;
                        zzaplVar = new zzapl(zzc.optBoolean("enable_prewarming", false), zzc.optString("prefetch_url", ""));
                    }
                    list2 = list;
                    break;
                case '0':
                    z12 = jsonReader.nextBoolean();
                    break;
                case '1':
                    zzuoVar = zzuo.zza(zzayu.zzc(jsonReader));
                    break;
                case '2':
                    str11 = jsonReader.nextString();
                    break;
                default:
                    list = list2;
                    jsonReader.skipValue();
                    list2 = list;
                    break;
            }
            jSONObject9 = jSONObject;
        }
        jsonReader.endObject();
        this.zzgtk = list13;
        this.zzgtl = i;
        this.zzdeu = list11;
        this.zzdev = list12;
        this.zzgtn = list9;
        this.zzgtm = i2;
        this.zzdoj = list10;
        this.zzdok = list7;
        this.zzgto = list8;
        this.zzdgb = str;
        this.zzdgc = str2;
        this.zzdoi = zzatcVar;
        this.zzgtp = list5;
        this.zzdnv = list6;
        this.zzgtq = list3;
        this.zzgtr = zzdgsVar;
        this.zzgts = list4;
        this.zzgtt = list2;
        this.zzdfq = str3;
        this.zzgtu = jSONObject9;
        this.zzagd = str4;
        this.zzdfa = str5;
        this.zzdob = str6;
        this.zzgtv = zzaumVar;
        this.zzdny = str7;
        this.zzgtw = jSONObject6;
        this.zzgtx = jSONObject7;
        this.zzdfh = z;
        this.zzdfi = z2;
        this.zzdfj = z3;
        this.zzdpp = z4;
        this.zzfin = z5;
        this.zzbmh = z6;
        this.zzgty = i3;
        this.zzgtz = i4;
        this.zzdos = z7;
        this.zzelw = str8;
        this.zzgua = jSONObject8;
        this.zzdov = z8;
        this.zzdow = z9;
        this.zzgub = i5;
        this.zzejq = z10;
        this.zzdhp = str9;
        this.zzfil = i6;
        this.zzfnb = str10;
        this.zzguc = z11;
        this.zzgud = zzaplVar;
        this.zzfim = z12;
        this.zzgue = zzuoVar;
        this.zzguf = str11;
    }
}
