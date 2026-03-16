package com.muslim.hafizi;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.R;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ParaListViewAdapter extends BaseAdapter implements SectionIndexer {
    private Context context;
    ViewHolder holder;
    private LayoutInflater mInflater;
    private ArrayList<String> mSelections;
    private ArrayList<QuranJuzs> quranJuzs;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public ParaListViewAdapter(Context context, ArrayList<QuranJuzs> arrayList, ArrayList<String> arrayList2) {
        this.context = context;
        this.quranJuzs = arrayList;
        this.mSelections = arrayList2;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.mInflater.inflate(R.layout.para_listview_container, viewGroup, false);
            this.holder = new ViewHolder();
            ViewHolder.lblList = (LinearLayout) view.findViewById(R.id.lblList);
            this.holder.tvParaNameAr = (TextView) view.findViewById(R.id.tvParaNameAr);
            this.holder.tvParaName = (TextView) view.findViewById(R.id.tvParaName);
            this.holder.tvParaNo = (TextView) view.findViewById(R.id.tvParaNo);
            view.setTag(this.holder);
        } else {
            this.holder = (ViewHolder) view.getTag();
        }
        this.holder.tvParaName.setText(this.quranJuzs.get(i).getPara_name().trim());
        this.holder.tvParaNameAr.setText(this.quranJuzs.get(i).getPara_name_ar().trim());
        Utils.setMyBanglaText(this.holder.tvParaNo, Utils.getBanglaNumber(this.quranJuzs.get(i).getId()));
        this.holder.tvParaName.setTag(this.quranJuzs.get(i).getId());
        return view;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.quranJuzs.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.quranJuzs.get(i);
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        String str;
        if (i <= 0) {
            str = "0";
        } else if (this.quranJuzs.size() - 1 <= i) {
            str = String.valueOf(this.quranJuzs.size() - 1);
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
        TextView tvParaName;
        TextView tvParaNameAr;
        TextView tvParaNo;

        ViewHolder() {
        }
    }
}
