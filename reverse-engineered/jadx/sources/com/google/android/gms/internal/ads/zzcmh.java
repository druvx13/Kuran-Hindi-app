package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcmh implements zzdkb<zzcmg, zzcmj> {
    private final String zzdms;
    private final zzasa zzgci;
    private final String zzgcy;
    private final Context zzvf;

    public zzcmh(Context context, String str, zzasa zzasaVar, String str2) {
        this.zzvf = context;
        this.zzgcy = str;
        this.zzgci = zzasaVar;
        this.zzdms = str2;
    }

    private final zzcmj zza(String str, zzarp zzarpVar, JSONObject jSONObject, String str2) throws zzclp {
        byte[] bArr;
        int responseCode;
        InputStreamReader inputStreamReader;
        BufferedOutputStream bufferedOutputStream;
        String str3 = "doritos_v2";
        String str4 = "doritos";
        String str5 = "";
        try {
            boolean z = false;
            if (zzarpVar.getErrorCode() != -2) {
                if (zzarpVar.getErrorCode() == 1) {
                    if (zzarpVar.zzuv() != null) {
                        zzawr.zzfa(TextUtils.join(", ", zzarpVar.zzuv()));
                    }
                    throw new zzclp("Error building request URL.", zzarpVar.getErrorCode());
                }
                throw new zzclp("Internal error.", 0);
            }
            zzcmj zzcmjVar = new zzcmj();
            String valueOf = String.valueOf(this.zzgcy);
            zzawr.zzfb(valueOf.length() != 0 ? "SDK version: ".concat(valueOf) : new String("SDK version: "));
            String valueOf2 = String.valueOf(str);
            zzawr.zzed(valueOf2.length() != 0 ? "AdRequestServiceImpl: Sending request: ".concat(valueOf2) : new String("AdRequestServiceImpl: Sending request: "));
            URL url = new URL(str);
            HashMap hashMap = new HashMap();
            long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime();
            int i = 0;
            while (true) {
                this.zzgci.zzvd();
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                com.google.android.gms.ads.internal.zzq.zzkw().zza(this.zzvf, this.zzgcy, z, httpURLConnection);
                if (!TextUtils.isEmpty(str2)) {
                    httpURLConnection.addRequestProperty("Cookie", str2);
                }
                if (zzarpVar.zzuy()) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("pii");
                    if (optJSONObject != null) {
                        if (!TextUtils.isEmpty(optJSONObject.optString(str4, str5))) {
                            httpURLConnection.addRequestProperty("x-afma-drt-cookie", optJSONObject.optString(str4, str5));
                        }
                        if (!TextUtils.isEmpty(optJSONObject.optString(str3, str5))) {
                            httpURLConnection.addRequestProperty("x-afma-drt-v2-cookie", optJSONObject.optString(str3, str5));
                        }
                    } else {
                        zzawr.zzeg("DSID signal does not exist.");
                    }
                }
                if (zzarpVar == null || TextUtils.isEmpty(zzarpVar.zzux())) {
                    bArr = null;
                } else {
                    httpURLConnection.setDoOutput(true);
                    bArr = zzarpVar.zzux().getBytes();
                    httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        try {
                            bufferedOutputStream2.write(bArr);
                            IOUtils.closeQuietly(bufferedOutputStream2);
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream = bufferedOutputStream2;
                            IOUtils.closeQuietly(bufferedOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = null;
                    }
                }
                zzazq zzazqVar = new zzazq();
                zzazqVar.zza(httpURLConnection, bArr);
                responseCode = httpURLConnection.getResponseCode();
                for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
                    String str6 = str3;
                    String key = entry.getKey();
                    String str7 = str4;
                    List<String> value = entry.getValue();
                    if (hashMap.containsKey(key)) {
                        ((List) hashMap.get(key)).addAll(value);
                    } else {
                        hashMap.put(key, new ArrayList(value));
                        str5 = str5;
                    }
                    str4 = str7;
                    str3 = str6;
                }
                String str8 = str3;
                String str9 = str4;
                String str10 = str5;
                zzazqVar.zza(httpURLConnection, responseCode);
                if (responseCode >= 200 && responseCode < 300) {
                    try {
                        InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                        try {
                            com.google.android.gms.ads.internal.zzq.zzkw();
                            String zza = zzaxa.zza(inputStreamReader2);
                            IOUtils.closeQuietly(inputStreamReader2);
                            zzazqVar.zzex(zza);
                            zzcmjVar.zzgcz = responseCode;
                            zzcmjVar.zzdnr = zza;
                            zzcmjVar.zzab = hashMap;
                            if (TextUtils.isEmpty(zza)) {
                                if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcro)).booleanValue()) {
                                    throw new zzclp("No Fill", 3);
                                }
                            }
                            zzcmjVar.zzgda = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - elapsedRealtime;
                            httpURLConnection.disconnect();
                            this.zzgci.zzve();
                            return zzcmjVar;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStreamReader = inputStreamReader2;
                            IOUtils.closeQuietly(inputStreamReader);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamReader = null;
                    }
                } else if (responseCode < 300 || responseCode >= 400) {
                    break;
                } else {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (TextUtils.isEmpty(headerField)) {
                        zzawr.zzfc("No location header to follow redirect.");
                        throw new zzclp("No location header to follow redirect");
                    }
                    URL url2 = new URL(headerField);
                    i++;
                    if (i > ((Integer) zzvj.zzpv().zzd(zzzz.zzcqv)).intValue()) {
                        zzawr.zzfc("Too many redirects.");
                        throw new zzclp("Too many redirects");
                    }
                    httpURLConnection.disconnect();
                    this.zzgci.zzve();
                    url = url2;
                    str5 = str10;
                    str4 = str9;
                    str3 = str8;
                    z = false;
                }
            }
            StringBuilder sb = new StringBuilder(46);
            sb.append("Received error HTTP response code: ");
            sb.append(responseCode);
            zzawr.zzfc(sb.toString());
            StringBuilder sb2 = new StringBuilder(46);
            sb2.append("Received error HTTP response code: ");
            sb2.append(responseCode);
            throw new zzclp(sb2.toString());
        } catch (IOException e) {
            String valueOf3 = String.valueOf(e.getMessage());
            zzawr.zzfc(valueOf3.length() != 0 ? "Error while connecting to ad server: ".concat(valueOf3) : new String("Error while connecting to ad server: "));
            String valueOf4 = String.valueOf(e.getMessage());
            throw new zzclp(valueOf4.length() != 0 ? "Error connecting to ad server:".concat(valueOf4) : new String("Error connecting to ad server:"), 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkb
    public final /* synthetic */ zzcmj apply(zzcmg zzcmgVar) throws Exception {
        zzarp zzarpVar;
        zzarp zzarpVar2;
        JSONObject jSONObject;
        zzcmg zzcmgVar2 = zzcmgVar;
        zzarpVar = zzcmgVar2.zzgcs;
        String url = zzarpVar.getUrl();
        zzarpVar2 = zzcmgVar2.zzgcs;
        jSONObject = zzcmgVar2.zzgcr;
        return zza(url, zzarpVar2, jSONObject, this.zzdms);
    }
}
