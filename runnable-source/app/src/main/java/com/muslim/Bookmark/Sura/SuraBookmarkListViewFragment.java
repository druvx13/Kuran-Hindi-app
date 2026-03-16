package com.muslim.Bookmark.Sura;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import com.muslim.Bookmark.Sura.model.SuraBookmarkQuranSuras;
import com.muslim.quran_hindi.R;
import java.util.ArrayList;

public class SuraBookmarkListViewFragment extends Fragment implements AdapterView.OnItemClickListener {
    public static ListView listView;
    private SuraBookmarkListViewAdapter listViewAdapter;
    private ArrayList<SuraBookmarkQuranSuras> quranSuras;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.quranSuras = SuraBookmarkActivity.listDataHeader;
        View inflate = layoutInflater.inflate(R.layout.list_layout, viewGroup, false);
        listView = (ListView) inflate.findViewById(R.id.listView);
        SuraBookmarkListViewAdapter suraBookmarkListViewAdapter = new SuraBookmarkListViewAdapter(getActivity(), this.quranSuras);
        this.listViewAdapter = suraBookmarkListViewAdapter;
        listView.setAdapter((ListAdapter) suraBookmarkListViewAdapter);
        listView.setOnItemClickListener(this);
        return inflate;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String obj = view.findViewById(R.id.tvSuraName).getTag().toString();
        SuraBookmarkActivity.getInstance().loadViewPagerFragment(obj);
        Log.d("DREG duaDBID", obj);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.listViewAdapter.notifyDataSetChanged();
    }
}
