package com.muslim.quran_hindi;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.SectionIndexer;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.model.QuranSuras;
import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter implements SectionIndexer {
    private Context context;
    ViewHolder holder;
    private LayoutInflater mInflater;
    private ArrayList<String> mSelections;
    private ArrayList<QuranSuras> surahLists;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public GridViewAdapter(Context context, ArrayList<QuranSuras> arrayList, ArrayList<String> arrayList2) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.surahLists = arrayList;
        this.mSelections = arrayList2;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.mInflater.inflate(R.layout.gridview_container, viewGroup, false);
            ViewHolder viewHolder = new ViewHolder();
            this.holder = viewHolder;
            viewHolder.linItemView = (LinearLayout) view.findViewById(R.id.linItemView);
            this.holder.tvSuraNameAr = (TextView) view.findViewById(R.id.tvSuraNameAR);
            this.holder.tvSuraName = (TextView) view.findViewById(R.id.tvSuraName);
            this.holder.tvSuraMeaning = (TextView) view.findViewById(R.id.tvSuraMeaning);
            this.holder.tvSuraNo = (TextView) view.findViewById(R.id.tvSuraNo);
            this.holder.layoutLastRead = (LinearLayout) view.findViewById(R.id.layoutLastRead);
            view.setTag(this.holder);
        } else {
            this.holder = (ViewHolder) view.getTag();
        }
        Utils.setMyBanglaText(this.holder.tvSuraName, this.surahLists.get(i).getSuraName());
        Utils.setMyBanglaText(this.holder.tvSuraMeaning, this.surahLists.get(i).getSuraMeaning());
        this.holder.tvSuraNameAr.setText(this.surahLists.get(i).getSura_name_ar());
        if (Utils.getInt(this.context, "LASTLISTVIEW") == i) {
            this.holder.tvSuraName.setTextColor(ContextCompat.getColor(this.context, R.color.myselector_list_item_text_color_pressed));
            this.holder.tvSuraMeaning.setTextColor(ContextCompat.getColor(this.context, R.color.myselector_list_item_text_color_pressed));
            this.holder.tvSuraNameAr.setTextColor(ContextCompat.getColor(this.context, R.color.myselector_list_item_text_color_pressed));
            this.holder.linItemView.setBackgroundResource(R.color.mywhitePressed_grid);
            this.holder.layoutLastRead.setVisibility(0);
        } else {
            this.holder.tvSuraName.setTextColor(ContextCompat.getColorStateList(this.context, R.color.selector_grid_item_text_color));
            this.holder.tvSuraMeaning.setTextColor(ContextCompat.getColorStateList(this.context, R.color.selector_grid_item_text_color));
            this.holder.tvSuraNameAr.setTextColor(ContextCompat.getColorStateList(this.context, R.color.selector_grid_item_text_color));
            this.holder.linItemView.setBackgroundResource(R.drawable.grid_bg);
            this.holder.layoutLastRead.setVisibility(8);
        }
        Utils.setMyBanglaText(this.holder.tvSuraNo, Utils.getBanglaNumber(i + 1));
        this.holder.tvSuraName.setTag(this.surahLists.get(i).getSura_reverse_id());
        float width = Utils.getWidth(this.context);
        if (width >= 720.0f) {
            Log.d("DREG", "Device is a 10'' tablet " + width);
            this.holder.tvSuraMeaning.setTextSize(20.0f);
        } else if (width >= 600.0f) {
            Log.d("DREG", "Device is a 7'' tablet " + width);
            this.holder.tvSuraMeaning.setTextSize(18.0f);
        } else if (width >= 400.0f) {
            Log.d("DREG", "Device is a 7'' tablet " + width);
            this.holder.tvSuraMeaning.setTextSize(18.0f);
        } else {
            Log.d("DREG", "Device is less than 7'' tablet " + width);
            this.holder.tvSuraMeaning.setTextSize(13.0f);
        }
        return view;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.surahLists.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.surahLists.get(i);
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        String str;
        if (i <= 0) {
            str = "0";
        } else if (this.surahLists.size() - 1 <= i) {
            str = String.valueOf(this.surahLists.size() - 1);
        } else {
            str = this.mSelections.get(i - 1);
        }
        int parseInt = Integer.parseInt(str);
        return parseInt > 0 ? parseInt - 1 : parseInt;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        Log.i("DREG", "Selection = " + i);
        return Integer.parseInt(this.mSelections.get(i));
    }

    @Override // android.widget.SectionIndexer
    public Object[] getSections() {
        ArrayList<String> arrayList = this.mSelections;
        return arrayList.toArray(new String[arrayList.size()]);
    }

    
    class ViewHolder {
        LinearLayout layoutLastRead;
        LinearLayout linItemView;
        TextView tvSuraMeaning;
        TextView tvSuraName;
        TextView tvSuraNameAr;
        TextView tvSuraNo;

        ViewHolder() {
        }
    }
}
