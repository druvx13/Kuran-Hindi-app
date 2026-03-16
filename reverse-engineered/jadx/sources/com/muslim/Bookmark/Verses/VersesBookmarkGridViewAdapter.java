package com.muslim.Bookmark.Verses;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.muslim.Bookmark.Verses.model.VersesBookmarkQuranSuras;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.R;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class VersesBookmarkGridViewAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<VersesBookmarkQuranSuras> duaItems;
    ViewHolder holder;
    private LayoutInflater mInflater;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public VersesBookmarkGridViewAdapter(Context context, ArrayList<VersesBookmarkQuranSuras> arrayList) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.duaItems = arrayList;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.mInflater.inflate(R.layout.gridview_container_bookmark, viewGroup, false);
            ViewHolder viewHolder = new ViewHolder();
            this.holder = viewHolder;
            viewHolder.tvSuraNameAr = (TextView) view.findViewById(R.id.tvSuraNameAR);
            this.holder.tvSuraName = (TextView) view.findViewById(R.id.tvSuraName);
            this.holder.tvSuraMeaning = (TextView) view.findViewById(R.id.tvSuraMeaning);
            this.holder.tvSuraNo = (TextView) view.findViewById(R.id.tvSuraNo);
            view.setTag(this.holder);
        } else {
            this.holder = (ViewHolder) view.getTag();
        }
        Utils.setMyBanglaText(this.holder.tvSuraName, this.duaItems.get(i).getSuraName());
        this.holder.tvSuraName.setTag(this.duaItems.get(i).getSura_id());
        Utils.setMyBanglaText(this.holder.tvSuraMeaning, this.duaItems.get(i).getSuraMeaning());
        Utils.setMyBanglaText(this.holder.tvSuraNo, Utils.getBanglaNumber(Integer.parseInt(this.duaItems.get(i).getSura_id())));
        this.holder.tvSuraNameAr.setText(this.duaItems.get(i).getSura_name_ar());
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
                this.holder.tvSuraMeaning.setTextSize(15.0f);
            } else {
                this.holder.tvSuraMeaning.setTextSize(18.0f);
            }
        } else if (width >= 400.0f) {
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
        return view;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.duaItems.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.duaItems.get(i);
    }

    /* loaded from: classes.dex */
    class ViewHolder {
        TextView tvCategoryTitle;
        public TextView tvSuraMeaning;
        public TextView tvSuraName;
        public TextView tvSuraNameAr;
        public TextView tvSuraNo;

        ViewHolder() {
        }
    }
}
