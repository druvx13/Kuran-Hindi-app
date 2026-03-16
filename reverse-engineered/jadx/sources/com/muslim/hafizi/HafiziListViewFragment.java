package com.muslim.hafizi;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.R;
import com.muslim.quran_hindi.model.QuranSuras;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class HafiziListViewFragment extends Fragment {
    public static ListView listViewPara;
    public static ListView listViewSurah;
    private ParaListViewAdapter paraListViewAdapter;
    private ArrayList<QuranJuzs> quranJuzs;
    private ArrayList<QuranSuras> quranSuras;
    private SurahListViewAdapter surahListViewAdapter;
    private TextView tvPara;
    private TextView tvSurah;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.quranJuzs = HafiziActivity11.quranJuzs;
        this.quranSuras = HafiziActivity11.quranSuras;
        View inflate = layoutInflater.inflate(R.layout.list_layout_hafizi, viewGroup, false);
        ListView listView = (ListView) inflate.findViewById(R.id.listViewSurah);
        listViewSurah = listView;
        listView.setFastScrollEnabled(true);
        SurahListViewAdapter surahListViewAdapter = new SurahListViewAdapter(getActivity(), this.quranSuras, Utils.getSelections(this.quranSuras.size()));
        this.surahListViewAdapter = surahListViewAdapter;
        listViewSurah.setAdapter((ListAdapter) surahListViewAdapter);
        listViewSurah.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.muslim.hafizi.HafiziListViewFragment.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                HafiziActivity11.getInstance().loadSuraViewFragment(view.findViewById(R.id.tvSuraName).getTag().toString());
            }
        });
        ListView listView2 = (ListView) inflate.findViewById(R.id.listViewPara);
        listViewPara = listView2;
        listView2.setFastScrollEnabled(true);
        ParaListViewAdapter paraListViewAdapter = new ParaListViewAdapter(getActivity(), this.quranJuzs, Utils.getSelections(this.quranJuzs.size()));
        this.paraListViewAdapter = paraListViewAdapter;
        listViewPara.setAdapter((ListAdapter) paraListViewAdapter);
        listViewPara.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.muslim.hafizi.HafiziListViewFragment.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                HafiziActivity11.getInstance().loadParaViewFragment(view.findViewById(R.id.tvParaName).getTag().toString());
            }
        });
        this.tvSurah = (TextView) inflate.findViewById(R.id.tvSura);
        this.tvPara = (TextView) inflate.findViewById(R.id.tvPara);
        Utils.setMyBanglaTextBold(this.tvSurah);
        Utils.setMyBanglaTextNormal(this.tvPara);
        this.tvSurah.setBackgroundColor(getResources().getColor(R.color.hafizi_tab_selected));
        this.tvPara.setBackgroundColor(getResources().getColor(R.color.hafizi_tab_normal));
        this.tvSurah.setTextSize(22.0f);
        this.tvPara.setTextSize(17.0f);
        this.tvSurah.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziListViewFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HafiziListViewFragment.this.tvSurah.setBackgroundColor(HafiziListViewFragment.this.getResources().getColor(R.color.hafizi_tab_selected));
                HafiziListViewFragment.this.tvPara.setBackgroundColor(HafiziListViewFragment.this.getResources().getColor(R.color.hafizi_tab_normal));
                Utils.setMyBanglaTextBold(HafiziListViewFragment.this.tvSurah);
                Utils.setMyBanglaTextNormal(HafiziListViewFragment.this.tvPara);
                HafiziListViewFragment.listViewPara.setVisibility(8);
                HafiziListViewFragment.listViewSurah.setVisibility(0);
                HafiziListViewFragment.this.tvSurah.setTextSize(22.0f);
                HafiziListViewFragment.this.tvPara.setTextSize(17.0f);
            }
        });
        this.tvPara.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziListViewFragment.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HafiziListViewFragment.this.tvSurah.setBackgroundColor(HafiziListViewFragment.this.getResources().getColor(R.color.hafizi_tab_normal));
                HafiziListViewFragment.this.tvPara.setBackgroundColor(HafiziListViewFragment.this.getResources().getColor(R.color.hafizi_tab_selected));
                Utils.setMyBanglaTextNormal(HafiziListViewFragment.this.tvSurah);
                Utils.setMyBanglaTextBold(HafiziListViewFragment.this.tvPara);
                HafiziListViewFragment.listViewSurah.setVisibility(8);
                HafiziListViewFragment.listViewPara.setVisibility(0);
                HafiziListViewFragment.this.tvSurah.setTextSize(17.0f);
                HafiziListViewFragment.this.tvPara.setTextSize(22.0f);
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.surahListViewAdapter.notifyDataSetChanged();
    }
}
