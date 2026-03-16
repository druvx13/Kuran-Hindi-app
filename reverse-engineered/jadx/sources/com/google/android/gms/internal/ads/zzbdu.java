package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbdu implements zzaga<zzbbx> {
    private static Integer zzb(Map<String, String> map, String str) {
        if (map.containsKey(str)) {
            try {
                return Integer.valueOf(Integer.parseInt(map.get(str)));
            } catch (NumberFormatException unused) {
                String str2 = map.get(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
                sb.append("Precache invalid numeric parameter '");
                sb.append(str);
                sb.append("': ");
                sb.append(str2);
                zzawr.zzfc(sb.toString());
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ void zza(zzbbx zzbbxVar, Map map) {
        zzbdl zzbdlVar;
        zzbbx zzbbxVar2 = zzbbxVar;
        if (zzawr.isLoggable(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(valueOf);
            zzawr.zzed(sb.toString());
        }
        com.google.android.gms.ads.internal.zzq.zzls();
        if (map.containsKey("abort")) {
            if (zzbdm.zzc(zzbbxVar2)) {
                return;
            }
            zzawr.zzfc("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    String valueOf2 = String.valueOf(str2);
                    zzawr.zzfc(valueOf2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(valueOf2) : new String("Malformed demuxed URL list for precache: "));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (zzbdm.zzd(zzbbxVar2) != null) {
                zzawr.zzfc("Precache task is already running.");
                return;
            } else if (zzbbxVar2.zzzi() == null) {
                zzawr.zzfc("Precache requires a dependency provider.");
                return;
            } else {
                zzbby zzbbyVar = new zzbby((String) map.get("flags"));
                Integer zzb = zzb(map, "player");
                if (zzb == null) {
                    zzb = 0;
                }
                zzbdlVar = zzbbxVar2.zzzi().zzblp.zza(zzbbxVar2, zzb.intValue(), null, zzbbyVar);
                new zzbdk(zzbbxVar2, zzbdlVar, str, strArr).zzwn();
            }
        } else {
            zzbdk zzd = zzbdm.zzd(zzbbxVar2);
            if (zzd != null) {
                zzbdlVar = zzd.zzegn;
            } else {
                zzawr.zzfc("Precache must specify a source.");
                return;
            }
        }
        Integer zzb2 = zzb(map, "minBufferMs");
        if (zzb2 != null) {
            zzbdlVar.zzde(zzb2.intValue());
        }
        Integer zzb3 = zzb(map, "maxBufferMs");
        if (zzb3 != null) {
            zzbdlVar.zzdf(zzb3.intValue());
        }
        Integer zzb4 = zzb(map, "bufferForPlaybackMs");
        if (zzb4 != null) {
            zzbdlVar.zzdg(zzb4.intValue());
        }
        Integer zzb5 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb5 != null) {
            zzbdlVar.zzdh(zzb5.intValue());
        }
    }
}
