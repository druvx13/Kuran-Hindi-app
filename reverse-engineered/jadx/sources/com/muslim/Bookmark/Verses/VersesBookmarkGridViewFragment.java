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
/* loaded from: classes.dex */
public class VersesBookmarkGridViewFragment extends Fragment implements AdapterView.OnItemClickListener {
    public static ListView gridView;
    private ArrayList<VersesBookmarkQuranSuras> duaItems;
    private VersesBookmarkGridViewAdapter gridViewAdapter;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.duaItems = VersesBookmarkActivity.listDataHeader;
        View inflate = layoutInflater.inflate(R.layout.grid_layout, viewGroup, false);
        gridView = (ListView) inflate.findViewById(R.id.gridView);
        VersesBookmarkGridViewAdapter versesBookmarkGridViewAdapter = new VersesBookmarkGridViewAdapter(getActivity(), this.duaItems);
        this.gridViewAdapter = versesBookmarkGridViewAdapter;
        gridView.setAdapter((ListAdapter) versesBookmarkGridViewAdapter);
        gridView.setOnItemClickListener(this);
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
        this.gridViewAdapter.notifyDataSetChanged();
    }
}
