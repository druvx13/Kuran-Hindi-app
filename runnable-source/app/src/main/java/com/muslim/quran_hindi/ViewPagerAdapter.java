package com.muslim.quran_hindi;

import android.app.Activity;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.model.QuranDetails;
import com.muslim.quran_hindi.model.QuranSuras;
import java.util.ArrayList;

public class ViewPagerAdapter extends PagerAdapter {
    public static int new_top;
    private DetailsListAdapter adapter;
    private Activity context;
    private LayoutInflater inflater;
    private ListView listView;
    private ArrayList<QuranSuras> quranSurasArrayList;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return null;
    }

    public ViewPagerAdapter(Activity activity, ArrayList<QuranSuras> arrayList) {
        this.context = activity;
        this.quranSurasArrayList = arrayList;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.quranSurasArrayList.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater");
        this.inflater = layoutInflater;
        View inflate = layoutInflater.inflate(R.layout.pager_container, viewGroup, false);
        final String sura_reverse_id = this.quranSurasArrayList.get(i).getSura_reverse_id();
        final String sura_id = this.quranSurasArrayList.get(i).getSura_id();
        ListView listView = (ListView) inflate.findViewById(R.id.listView);
        this.listView = listView;
        listView.setFastScrollEnabled(true);
        DetailsListAdapter detailsListAdapter = new DetailsListAdapter(this.context, DatabaseAccessor.getAllVersesBySuraId(sura_reverse_id, QuranActivity.queryText), sura_reverse_id);
        this.adapter = detailsListAdapter;
        this.listView.setAdapter((ListAdapter) detailsListAdapter);
        if (Constants.FROM_RESUME && Utils.getBoolean(this.context, Constants.IS_SAVED)) {
            Constants.FROM_RESUME = false;
            ListView listView2 = this.listView;
            Activity activity = this.context;
            int i2 = Utils.getInt(activity, sura_id + "POSLISTVIEW");
            Activity activity2 = this.context;
            listView2.setSelectionFromTop(i2, Utils.getInt(activity2, sura_id + "POSLISTVIEWTOP"));
        } else if (Constants.IS_FROM_SEARCH) {
            Constants.IS_FROM_SEARCH = false;
            this.listView.setSelection(Constants.SELECTED_AYAT - 1);
        } else if (Constants.isFirst) {
            this.listView.setSelection(Constants.INITIAL_SELECTION);
            Constants.INITIAL_SELECTION = 0;
        } else {
            this.listView.setSelection(Constants.SCROLL_TO);
        }
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.muslim.quran_hindi.ViewPagerAdapter.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j) {
                ViewPagerAdapter.new_top = view.getTop();
                if (ViewPagerAdapter.new_top < 1) {
                    ViewPagerAdapter.new_top = 1;
                }
                Log.d("Clicked", sura_id + " " + sura_reverse_id);
                ArrayList<QuranDetails> allVersesBySuraId = DatabaseAccessor.getAllVersesBySuraId(sura_reverse_id, "");
                if (DetailsListAdapter.dialog != null && DetailsListAdapter.dialog.isShowing()) {
                    DetailsListAdapter.dialog.dismiss();
                }
                Activity activity3 = ViewPagerAdapter.this.context;
                DetailsListAdapter.CustomDialog(activity3, sura_id + "_" + allVersesBySuraId.get(i3).getId(), adapterView);
                Log.d("MyCow", sura_id + "_" + allVersesBySuraId.get(i3).getId());
            }
        });
        if (Utils.getBoolean(this.context, Constants.IS_SAVED)) {
            this.listView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.muslim.quran_hindi.ViewPagerAdapter.2
                @Override // android.widget.AbsListView.OnScrollListener
                public void onScrollStateChanged(AbsListView absListView, int i3) {
                }

                @Override // android.widget.AbsListView.OnScrollListener
                public void onScroll(AbsListView absListView, int i3, int i4, int i5) {
                    int firstVisiblePosition = absListView.getFirstVisiblePosition();
                    View childAt = absListView.getChildAt(0);
                    int top = childAt != null ? childAt.getTop() - absListView.getPaddingTop() : 0;
                    Activity activity3 = ViewPagerAdapter.this.context;
                    Utils.putInt(activity3, sura_id + "POSLISTVIEW", firstVisiblePosition);
                    Activity activity4 = ViewPagerAdapter.this.context;
                    Utils.putInt(activity4, sura_id + "POSLISTVIEWTOP", top);
                }
            });
        }
        viewGroup.addView(inflate);
        return inflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(View view, int i, Object obj) {
        ((ViewPager) view).removeView((View) obj);
    }
}
