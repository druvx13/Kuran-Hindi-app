package com.muslim.quran_hindi;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.model.QuranSuras;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class GridViewFragment extends Fragment implements AdapterView.OnItemClickListener {
    public static ListView gridView;
    public static GridViewAdapter gridViewAdapter;
    private ArrayList<QuranSuras> duaItems;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.duaItems = QuranActivity.quranSuras;
        View inflate = layoutInflater.inflate(R.layout.grid_layout, viewGroup, false);
        ListView listView = (ListView) inflate.findViewById(R.id.gridView);
        gridView = listView;
        listView.setFastScrollEnabled(true);
        GridViewAdapter gridViewAdapter2 = new GridViewAdapter(getActivity(), this.duaItems, Utils.getSelections(this.duaItems.size()));
        gridViewAdapter = gridViewAdapter2;
        gridView.setAdapter((ListAdapter) gridViewAdapter2);
        if (Utils.getMyInt(getActivity(), "LASTLISTVIEW") != -1) {
            new Handler().postDelayed(new Runnable() { // from class: com.muslim.quran_hindi.GridViewFragment.1
                @Override // java.lang.Runnable
                public void run() {
                    if (Utils.getMyInt(GridViewFragment.this.getActivity(), "LASTLISTVIEW") == 0 || Utils.getMyInt(GridViewFragment.this.getActivity(), "LASTLISTVIEW") == 1) {
                        GridViewFragment.gridView.setSelection(0);
                    } else {
                        GridViewFragment.gridView.setSelection(Utils.getInt(GridViewFragment.this.getActivity(), "LASTLISTVIEW") - 1);
                    }
                }
            }, 1L);
        }
        gridView.setOnItemClickListener(this);
        return inflate;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String obj = view.findViewById(R.id.tvSuraName).getTag().toString();
        if (Integer.parseInt(obj) - 1 == 113 - Utils.getInt(getActivity(), "LASTLISTVIEW")) {
            Constants.FROM_RESUME = true;
        }
        QuranActivity.getInstance().loadViewPagerFragment(obj);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gridViewAdapter.notifyDataSetChanged();
    }
}
