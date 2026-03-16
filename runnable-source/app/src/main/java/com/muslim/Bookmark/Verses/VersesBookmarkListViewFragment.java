package com.muslim.Bookmark.Verses;

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
import com.muslim.Bookmark.Verses.model.VersesBookmarkQuranSuras;
import com.muslim.quran_hindi.R;
import java.util.ArrayList;

public class VersesBookmarkListViewFragment extends Fragment implements AdapterView.OnItemClickListener {
    public static ListView listView;
    private VersesBookmarkListViewAdapter listViewAdapter;
    private ArrayList<VersesBookmarkQuranSuras> quranSuras;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.quranSuras = VersesBookmarkActivity.listDataHeader;
        View inflate = layoutInflater.inflate(R.layout.list_layout, viewGroup, false);
        listView = (ListView) inflate.findViewById(R.id.listView);
        VersesBookmarkListViewAdapter versesBookmarkListViewAdapter = new VersesBookmarkListViewAdapter(getActivity(), this.quranSuras);
        this.listViewAdapter = versesBookmarkListViewAdapter;
        listView.setAdapter((ListAdapter) versesBookmarkListViewAdapter);
        listView.setOnItemClickListener(this);
        return inflate;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String obj = view.findViewById(R.id.tvSuraName).getTag().toString();
        VersesBookmarkActivity.getInstance().loadViewPagerFragment(obj);
        Log.d("DREG duaDBID", obj);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.listViewAdapter.notifyDataSetChanged();
    }
}
