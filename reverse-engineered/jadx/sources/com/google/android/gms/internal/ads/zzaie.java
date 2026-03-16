package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaie extends zzair<zzakd> implements zzain, zzais {
    private final zzbgn zzdbs;
    private zzaiv zzdbt;

    public zzaie(Context context, zzazz zzazzVar) throws zzbew {
        try {
            zzbgn zzbgnVar = new zzbgn(context, new zzaik(this));
            this.zzdbs = zzbgnVar;
            zzbgnVar.setWillNotDraw(true);
            this.zzdbs.addJavascriptInterface(new zzail(this), "GoogleJsInterface");
            com.google.android.gms.ads.internal.zzq.zzkw().zza(context, zzazzVar.zzbnd, this.zzdbs.getSettings());
            super.zzg(this);
        } catch (Throwable th) {
            throw new zzbew("Init failed.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaif
    public final void zza(String str, Map map) {
        zzaim.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final void zza(String str, JSONObject jSONObject) {
        zzaim.zza(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzain, com.google.android.gms.internal.ads.zzaif
    public final void zzb(String str, JSONObject jSONObject) {
        zzaim.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final void zzj(String str, String str2) {
        zzaim.zza(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final void zzcx(String str) {
        zzcy(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", str));
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final void zzcy(String str) {
        zzbab.zzdzv.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzaih
            private final zzaie zzdbu;
            private final String zzdbv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdbu = this;
                this.zzdbv = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdbu.zzdd(this.zzdbv);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final void zzcz(String str) {
        zzbab.zzdzv.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzaig
            private final zzaie zzdbu;
            private final String zzdbv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdbu = this;
                this.zzdbv = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdbu.zzdc(this.zzdbv);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final void zza(zzaiv zzaivVar) {
        this.zzdbt = zzaivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final void destroy() {
        this.zzdbs.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final boolean isDestroyed() {
        return this.zzdbs.isDestroyed();
    }

    @Override // com.google.android.gms.internal.ads.zzais
    public final zzakc zzsu() {
        return new zzakf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzain, com.google.android.gms.internal.ads.zzajc
    public final void zzda(String str) {
        zzbab.zzdzv.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzaij
            private final zzaie zzdbu;
            private final String zzdbv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdbu = this;
                this.zzdbv = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdbu.zzdb(this.zzdbv);
            }
        });
    }

    public final /* synthetic */ void zzdb(String str) {
        this.zzdbs.zzda(str);
    }

    public final /* synthetic */ void zzdc(String str) {
        this.zzdbs.loadUrl(str);
    }

    public final /* synthetic */ void zzdd(String str) {
        this.zzdbs.loadData(str, "text/html", "UTF-8");
    }
}
