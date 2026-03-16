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
/* loaded from: classes.dex */
public class SuraBookmarkGridViewFragment extends Fragment implements AdapterView.OnItemClickListener {
    public static ListView gridView;
    private ArrayList<SuraBookmarkQuranSuras> duaItems;
    private SuraBookmarkGridViewAdapter gridViewAdapter;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.duaItems = SuraBookmarkActivity.listDataHeader;
        View inflate = layoutInflater.inflate(R.layout.grid_layout, viewGroup, false);
        gridView = (ListView) inflate.findViewById(R.id.gridView);
        SuraBookmarkGridViewAdapter suraBookmarkGridViewAdapter = new SuraBookmarkGridViewAdapter(getActivity(), this.duaItems);
        this.gridViewAdapter = suraBookmarkGridViewAdapter;
        gridView.setAdapter((ListAdapter) suraBookmarkGridViewAdapter);
        gridView.setOnItemClickListener(this);
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
        this.gridViewAdapter.notifyDataSetChanged();
    }
}
