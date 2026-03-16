package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcbb {
    private final zzcaf zzfra;
    private final zzcdt zzftu;
    private final zzcey zzfud;
    private final zzbky zzfue;

    public zzcbb(zzcey zzceyVar, zzcdt zzcdtVar, zzbky zzbkyVar, zzcaf zzcafVar) {
        this.zzfud = zzceyVar;
        this.zzftu = zzcdtVar;
        this.zzfue = zzbkyVar;
        this.zzfra = zzcafVar;
    }

    public final View zzamh() throws zzbew {
        zzbek zza = this.zzfud.zza(zzum.zzph(), false);
        zza.getView().setVisibility(8);
        zza.zza("/sendMessageToSdk", new zzaga(this) { // from class: com.google.android.gms.internal.ads.zzcba
            private final zzcbb zzfuc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfuc = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaga
            public final void zza(Object obj, Map map) {
                this.zzfuc.zzd((zzbek) obj, map);
            }
        });
        zza.zza("/adMuted", new zzaga(this) { // from class: com.google.android.gms.internal.ads.zzcbd
            private final zzcbb zzfuc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfuc = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaga
            public final void zza(Object obj, Map map) {
                this.zzfuc.zzc((zzbek) obj, map);
            }
        });
        this.zzftu.zza(new WeakReference(zza), "/loadHtml", new zzaga(this) { // from class: com.google.android.gms.internal.ads.zzcbc
            private final zzcbb zzfuc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfuc = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaga
            public final void zza(Object obj, final Map map) {
                final zzcbb zzcbbVar = this.zzfuc;
                zzbek zzbekVar = (zzbek) obj;
                zzbekVar.zzabj().zza(new zzbfv(zzcbbVar, map) { // from class: com.google.android.gms.internal.ads.zzcbh
                    private final Map zzdzm;
                    private final zzcbb zzfuc;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfuc = zzcbbVar;
                        this.zzdzm = map;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbfv
                    public final void zzak(boolean z) {
                        this.zzfuc.zza(this.zzdzm, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzbekVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzbekVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzftu.zza(new WeakReference(zza), "/showOverlay", new zzaga(this) { // from class: com.google.android.gms.internal.ads.zzcbf
            private final zzcbb zzfuc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfuc = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaga
            public final void zza(Object obj, Map map) {
                this.zzfuc.zzb((zzbek) obj, map);
            }
        });
        this.zzftu.zza(new WeakReference(zza), "/hideOverlay", new zzaga(this) { // from class: com.google.android.gms.internal.ads.zzcbe
            private final zzcbb zzfuc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfuc = this;
            }

            @Override // com.google.android.gms.internal.ads.zzaga
            public final void zza(Object obj, Map map) {
                this.zzfuc.zza((zzbek) obj, map);
            }
        });
        return zza.getView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbek zzbekVar, Map map) {
        zzawr.zzfb("Hiding native ads overlay.");
        zzbekVar.getView().setVisibility(8);
        this.zzfue.zzbf(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzbek zzbekVar, Map map) {
        zzawr.zzfb("Showing native ads overlay.");
        zzbekVar.getView().setVisibility(0);
        this.zzfue.zzbf(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzftu.zza("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbek zzbekVar, Map map) {
        this.zzfra.zzakm();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzbek zzbekVar, Map map) {
        this.zzftu.zza("sendMessageToNativeJs", map);
    }
}
