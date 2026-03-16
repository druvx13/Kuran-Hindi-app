package com.muslim.hafizi;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerviewfastscroll.SectionTitleProvider;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.R;
import java.util.List;
/* loaded from: classes.dex */
public class ImgAdapter11 extends RecyclerView.Adapter<MyViewHolder> implements SectionTitleProvider {
    private Activity activity;
    private DatabaseAccessor db = new DatabaseAccessor();
    private List<Img> list;

    public ImgAdapter11(Activity activity, List<Img> list) {
        this.activity = activity;
        this.list = list;
    }

    @Override // com.futuremind.recyclerviewfastscroll.SectionTitleProvider
    public String getSectionTitle(int i) {
        if (this.activity.getResources().getConfiguration().orientation == 2) {
            return Utils.getBanglaNumber(i + 1);
        }
        return Utils.getBanglaNumber(610 - i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row, viewGroup, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d8  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(com.muslim.hafizi.ImgAdapter11.MyViewHolder r8, int r9) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.muslim.hafizi.ImgAdapter11.onBindViewHolder(com.muslim.hafizi.ImgAdapter11$MyViewHolder, int):void");
    }

    public /* synthetic */ void lambda$onBindViewHolder$0$ImgAdapter11(View view) {
        if (this.activity.getResources().getConfiguration().orientation == 1) {
            if (HafiziActivity11.toolshowhide) {
                HafiziActivity11.toolshowhide = false;
                HafiziActivity11.toolbar.setVisibility(8);
                return;
            }
            HafiziActivity11.toolshowhide = true;
            HafiziActivity11.toolbar.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    /* loaded from: classes.dex */
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;

        public MyViewHolder(View view) {
            super(view);
            this.imageView = (ImageView) view.findViewById(R.id.img);
        }
    }
}
