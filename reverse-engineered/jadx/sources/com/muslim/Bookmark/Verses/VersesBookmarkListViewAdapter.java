package com.muslim.Bookmark.Verses;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.muslim.Bookmark.Verses.model.VersesBookmarkQuranSuras;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.R;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class VersesBookmarkListViewAdapter extends BaseAdapter {
    private Context context;
    ViewHolder holder;
    private LayoutInflater mInflater;
    private ArrayList<VersesBookmarkQuranSuras> sunnahItems;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public VersesBookmarkListViewAdapter(Context context, ArrayList<VersesBookmarkQuranSuras> arrayList) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.sunnahItems = arrayList;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.mInflater.inflate(R.layout.listview_container, viewGroup, false);
            this.holder = new ViewHolder();
            ViewHolder.lblList = (LinearLayout) view.findViewById(R.id.lblList);
            this.holder.tvSuraNameAr = (TextView) view.findViewById(R.id.tvSuraNameAR);
            this.holder.tvSuraName = (TextView) view.findViewById(R.id.tvSuraName);
            this.holder.tvSuraMeaning = (TextView) view.findViewById(R.id.tvSuraMeaning);
            this.holder.tvSuraNo = (TextView) view.findViewById(R.id.tvSuraNo);
            view.setTag(this.holder);
        } else {
            this.holder = (ViewHolder) view.getTag();
        }
        Utils.setMyBanglaText(this.holder.tvSuraName, this.sunnahItems.get(i).getSuraName());
        Utils.setMyBanglaText(this.holder.tvSuraMeaning, this.sunnahItems.get(i).getSuraMeaning());
        this.holder.tvSuraNameAr.setText(this.sunnahItems.get(i).getSura_name_ar().trim());
        float width = Utils.getWidth(this.context);
        if (width >= 720.0f) {
            Log.d("DREG", "Device is a 10'' tablet " + width);
            if (i + 1 == 25) {
                this.holder.tvSuraMeaning.setTextSize(16.0f);
            } else {
                this.holder.tvSuraMeaning.setTextSize(20.0f);
            }
        } else if (width >= 600.0f) {
            Log.d("DREG", "Device is a 7'' tablet " + width);
            if (i + 1 == 25) {
                this.holder.tvSuraMeaning.setTextSize(14.0f);
            } else {
                this.holder.tvSuraMeaning.setTextSize(18.0f);
            }
        } else {
            Log.d("DREG", "Device is less than 7'' tablet " + width);
            if (i + 1 == 25) {
                this.holder.tvSuraMeaning.setTextSize(10.0f);
            } else {
                this.holder.tvSuraMeaning.setTextSize(13.0f);
            }
        }
        Utils.setMyBanglaText(this.holder.tvSuraNo, Utils.getBanglaNumber(Integer.parseInt(this.sunnahItems.get(i).getSura_id())));
        this.holder.tvSuraName.setTag(this.sunnahItems.get(i).getSura_id());
        return view;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.sunnahItems.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.sunnahItems.get(i);
    }

    /* loaded from: classes.dex */
    static class ViewHolder {
        public static LinearLayout lblList;
        TextView tvSuraMeaning;
        TextView tvSuraName;
        TextView tvSuraNameAr;
        TextView tvSuraNo;

        ViewHolder() {
        }
    }
}
