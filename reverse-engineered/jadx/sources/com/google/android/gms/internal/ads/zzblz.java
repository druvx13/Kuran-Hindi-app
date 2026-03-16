package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzblz extends zzblx {
    private final View view;
    private final zzbek zzdce;
    private final Executor zzfhi;
    private final zzdgn zzfik;
    private final zzbnt zzfja;
    private final zzcae zzfjb;
    private final zzbvx zzfjc;
    private final zzegt<zzcte> zzfjd;
    private zzum zzfje;
    private final Context zzvf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblz(zzbnv zzbnvVar, Context context, zzdgn zzdgnVar, View view, zzbek zzbekVar, zzbnt zzbntVar, zzcae zzcaeVar, zzbvx zzbvxVar, zzegt<zzcte> zzegtVar, Executor executor) {
        super(zzbnvVar);
        this.zzvf = context;
        this.view = view;
        this.zzdce = zzbekVar;
        this.zzfik = zzdgnVar;
        this.zzfja = zzbntVar;
        this.zzfjb = zzcaeVar;
        this.zzfjc = zzbvxVar;
        this.zzfjd = zzegtVar;
        this.zzfhi = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final View zzahe() {
        return this.view;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zza(ViewGroup viewGroup, zzum zzumVar) {
        zzbek zzbekVar;
        if (viewGroup == null || (zzbekVar = this.zzdce) == null) {
            return;
        }
        zzbekVar.zza(zzbfz.zzb(zzumVar));
        viewGroup.setMinimumHeight(zzumVar.heightPixels);
        viewGroup.setMinimumWidth(zzumVar.widthPixels);
        this.zzfje = zzumVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final zzxl getVideoController() {
        try {
            return this.zzfja.getVideoController();
        } catch (zzdhk unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final zzdgn zzahd() {
        boolean z;
        zzum zzumVar = this.zzfje;
        if (zzumVar != null) {
            return zzdhh.zze(zzumVar);
        }
        if (this.zzfkd.zzguc) {
            Iterator<String> it = this.zzfkd.zzgtk.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String next = it.next();
                if (next != null && next.contains("FirstParty")) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return new zzdgn(this.view.getWidth(), this.view.getHeight(), false);
            }
        }
        return zzdhh.zza(this.zzfkd.zzgtq, this.zzfik);
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final zzdgn zzahi() {
        return this.zzfik;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final int zzahj() {
        return this.zzfgj.zzgus.zzgup.zzgug;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zzkf() {
        this.zzfjc.zzajr();
    }

    @Override // com.google.android.gms.internal.ads.zzbns
    public final void zzahk() {
        this.zzfhi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbly
            private final zzblz zzfiz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfiz = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfiz.zzahl();
            }
        });
        super.zzahk();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzahl() {
        if (this.zzfjb.zzalo() != null) {
            try {
                this.zzfjb.zzalo().zza(this.zzfjd.get(), ObjectWrapper.wrap(this.zzvf));
            } catch (RemoteException e) {
                zzawr.zzc("RemoteException when notifyAdLoad is called", e);
            }
        }
    }
}
