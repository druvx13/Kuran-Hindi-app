package com.muslim.quran_hindi;

import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
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

public class ListViewFragment extends Fragment implements AdapterView.OnItemClickListener {
    public static ListView listView;
    public static ListViewAdapter listViewAdapter;
    private String audio;
    private ProgressDialog mProgressDialog;
    private ArrayList<QuranSuras> quranSuras;

    private static void stopPlaying() {
        Constants.IS_BISMILLAH = false;
        try {
            if (DetailsListAdapter.mp != null && DetailsListAdapter.mp.isPlaying()) {
                DetailsListAdapter.mp.stop();
                DetailsListAdapter.mp.release();
                DetailsListAdapter.mp = null;
                if (Build.VERSION.SDK_INT >= 21) {
                    QuranActivity.ivPlay.setImageDrawable(QuranActivity.mainActivity.getResources().getDrawable(R.mipmap.ic_play, QuranActivity.mainActivity.getTheme()));
                } else {
                    QuranActivity.ivPlay.setImageDrawable(QuranActivity.mainActivity.getResources().getDrawable(R.mipmap.ic_play));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.quranSuras = QuranActivity.quranSuras;
        View inflate = layoutInflater.inflate(R.layout.list_layout, viewGroup, false);
        ListView listView2 = (ListView) inflate.findViewById(R.id.listView);
        listView = listView2;
        listView2.setFastScrollEnabled(true);
        ListViewAdapter listViewAdapter2 = new ListViewAdapter(getActivity(), this.quranSuras, Utils.getSelections(this.quranSuras.size()));
        listViewAdapter = listViewAdapter2;
        listView.setAdapter((ListAdapter) listViewAdapter2);
        if (Utils.getMyInt(getActivity(), "LASTLISTVIEW") != -1) {
            listView.setSelection(Utils.getInt(getActivity(), "LASTLISTVIEW") - 1);
        }
        listView.setOnItemClickListener(this);
        return inflate;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String obj = view.findViewById(R.id.tvSuraName).getTag().toString();
        if (Integer.parseInt(obj) - 1 == 113 - Utils.getInt(getActivity(), "LASTLISTVIEW")) {
            Constants.FROM_RESUME = true;
        }
        QuranActivity.getInstance().loadViewPagerFragment(obj);
        stopPlaying();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        listViewAdapter.notifyDataSetChanged();
    }
}
