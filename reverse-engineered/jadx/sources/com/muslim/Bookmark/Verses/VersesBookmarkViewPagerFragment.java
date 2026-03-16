package com.muslim.Bookmark.Verses;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.muslim.Bookmark.Verses.model.VersesBookmarkQuranSuras;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.R;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class VersesBookmarkViewPagerFragment extends Fragment {
    static int new_top;
    private VersesBookmarkDetailsListAdapter adapter;
    private String bookmark;
    private int currentPage;
    private String duaDBID;
    private ListView listView;
    private VersesBookmarkQuranSuras quranSuras;
    private String text = "";

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            DatabaseAccessor.initDB(getActivity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        String string = getArguments().getString(Constants.KEY_SURA_ID);
        this.duaDBID = string;
        Log.d("XCXS", string);
        this.quranSuras = DatabaseAccessor.getVerseBookmarkSuraById(this.duaDBID);
        Utils.setMyBanglaText(VersesBookmarkActivity.mTitle, this.quranSuras.getSuraName());
        this.currentPage = Integer.parseInt(this.duaDBID) - 1;
        View inflate = layoutInflater.inflate(R.layout.list_layout, viewGroup, false);
        final String str = (this.currentPage + 1) + "";
        this.listView = (ListView) inflate.findViewById(R.id.listView);
        final ArrayList arrayList = new ArrayList();
        String str2 = "";
        for (int i = 1; i <= 6236; i++) {
            String string2 = Utils.getString(getActivity(), "bookmark_remove" + str + "_" + i);
            this.bookmark = string2;
            if (string2.equals(str + "_" + i)) {
                arrayList.add(Integer.valueOf(i));
                str2 = str2.equals("") ? " id = '" + i + "' " : str2 + " or id ='" + i + "'";
            }
        }
        VersesBookmarkDetailsListAdapter versesBookmarkDetailsListAdapter = new VersesBookmarkDetailsListAdapter(getActivity(), str, DatabaseAccessor.getAllVerseBookmarkVersesBySuraIdAndVersesId(str, str2));
        this.adapter = versesBookmarkDetailsListAdapter;
        this.listView.setAdapter((ListAdapter) versesBookmarkDetailsListAdapter);
        this.adapter.notifyDataSetChanged();
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.muslim.Bookmark.Verses.VersesBookmarkViewPagerFragment.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                VersesBookmarkViewPagerFragment.new_top = view.getTop();
                Log.d("SCOW", arrayList.get(0) + "");
                if (VersesBookmarkViewPagerFragment.new_top < 1) {
                    VersesBookmarkViewPagerFragment.new_top = 1;
                }
                if (VersesBookmarkDetailsListAdapter.dialog != null && VersesBookmarkDetailsListAdapter.dialog.isShowing()) {
                    VersesBookmarkDetailsListAdapter.dialog.dismiss();
                }
                FragmentActivity activity = VersesBookmarkViewPagerFragment.this.getActivity();
                VersesBookmarkDetailsListAdapter.CustomDialog(activity, str + "_" + arrayList.get(i2), i2);
                StringBuilder sb = new StringBuilder();
                sb.append("MyCow");
                sb.append(i2);
                String sb2 = sb.toString();
                Log.d(sb2, str + "_" + arrayList.get(i2));
            }
        });
        return inflate;
    }
}
