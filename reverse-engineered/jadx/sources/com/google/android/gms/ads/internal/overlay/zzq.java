package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.zzazm;
import com.google.android.gms.internal.ads.zzvj;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzq extends FrameLayout implements View.OnClickListener {
    private final ImageButton zzdlb;
    private final zzy zzdlc;

    public zzq(Context context, zzp zzpVar, zzy zzyVar) {
        super(context);
        this.zzdlc = zzyVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zzdlb = imageButton;
        imageButton.setImageResource(17301527);
        this.zzdlb.setBackgroundColor(0);
        this.zzdlb.setOnClickListener(this);
        ImageButton imageButton2 = this.zzdlb;
        zzvj.zzpr();
        int zzc = zzazm.zzc(context, zzpVar.paddingLeft);
        zzvj.zzpr();
        int zzc2 = zzazm.zzc(context, 0);
        zzvj.zzpr();
        int zzc3 = zzazm.zzc(context, zzpVar.paddingRight);
        zzvj.zzpr();
        imageButton2.setPadding(zzc, zzc2, zzc3, zzazm.zzc(context, zzpVar.paddingBottom));
        this.zzdlb.setContentDescription("Interstitial close button");
        ImageButton imageButton3 = this.zzdlb;
        zzvj.zzpr();
        int zzc4 = zzazm.zzc(context, zzpVar.size + zzpVar.paddingLeft + zzpVar.paddingRight);
        zzvj.zzpr();
        addView(imageButton3, new FrameLayout.LayoutParams(zzc4, zzazm.zzc(context, zzpVar.size + zzpVar.paddingBottom), 17));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzy zzyVar = this.zzdlc;
        if (zzyVar != null) {
            zzyVar.zzug();
        }
    }

    public final void zzal(boolean z) {
        if (z) {
            this.zzdlb.setVisibility(8);
        } else {
            this.zzdlb.setVisibility(0);
        }
    }
}
