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
import androidx.core.view.ViewCompat;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.model.QuranSuras;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ListViewAdapter extends BaseAdapter implements SectionIndexer {
    private Context context;
    ViewHolder holder;
    private LayoutInflater mInflater;
    private ArrayList<String> mSelections;
    private ArrayList<QuranSuras> sunnahItems;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public ListViewAdapter(Context context, ArrayList<QuranSuras> arrayList, ArrayList<String> arrayList2) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.sunnahItems = arrayList;
        this.mSelections = arrayList2;
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
        if (Utils.getInt(this.context, "LASTLISTVIEW") == i) {
            this.holder.tvSuraName.setTextColor(ContextCompat.getColor(this.context, R.color.selector_list_item_text_color_pressed));
            this.holder.tvSuraMeaning.setTextColor(ContextCompat.getColor(this.context, R.color.selector_list_item_text_color_pressed));
            this.holder.tvSuraNameAr.setTextColor(ContextCompat.getColor(this.context, R.color.selector_list_item_text_color_pressed));
            this.holder.tvSuraNo.setTextColor(ContextCompat.getColor(this.context, R.color.selector_list_item_text_color_pressed));
            this.holder.tvSuraNo.setBackgroundResource(R.drawable.numbering_selected);
            view.setBackgroundColor(ContextCompat.getColor(this.context, R.color.drawerColorSelect));
        } else {
            this.holder.tvSuraName.setTextColor(ContextCompat.getColorStateList(this.context, R.color.selector_grid_item_text_color));
            this.holder.tvSuraMeaning.setTextColor(ContextCompat.getColorStateList(this.context, R.color.selector_grid_item_text_color));
            this.holder.tvSuraNameAr.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            this.holder.tvSuraNo.setBackgroundResource(R.drawable.numbering_normal);
            view.setBackgroundResource(R.drawable.selector_grid_item);
        }
        Utils.setMyBanglaText(this.holder.tvSuraName, this.sunnahItems.get(i).getSuraName());
        Utils.setMyBanglaText(this.holder.tvSuraMeaning, this.sunnahItems.get(i).getSuraMeaning());
        this.holder.tvSuraNameAr.setText(this.sunnahItems.get(i).getSura_name_ar().trim());
        float width = Utils.getWidth(this.context);
        if (width >= 720.0f) {
            Log.d("DREG", "Device is a 10'' tablet " + width);
            this.holder.tvSuraMeaning.setTextSize(20.0f);
        } else if (width >= 600.0f) {
            Log.d("DREG", "Device is a 7'' tablet " + width);
            this.holder.tvSuraMeaning.setTextSize(18.0f);
        } else {
            Log.d("DREG", "Device is less than 7'' tablet " + width);
            this.holder.tvSuraMeaning.setTextSize(13.0f);
        }
        Utils.setMyBanglaText(this.holder.tvSuraNo, Utils.getBanglaNumber(i + 1));
        this.holder.tvSuraName.setTag(this.sunnahItems.get(i).getSura_reverse_id());
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

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        String str;
        if (i <= 0) {
            str = "0";
        } else if (this.sunnahItems.size() - 1 <= i) {
            str = String.valueOf(this.sunnahItems.size() - 1);
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
