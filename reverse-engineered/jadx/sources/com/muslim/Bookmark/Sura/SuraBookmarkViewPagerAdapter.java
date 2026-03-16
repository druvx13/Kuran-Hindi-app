package com.muslim.Bookmark.Sura;

import android.app.Activity;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.muslim.Bookmark.Sura.model.SuraBookmarkQuranDetails;
import com.muslim.Bookmark.Sura.model.SuraBookmarkQuranSuras;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.R;
import com.muslim.quran_hindi.model.QuranDetails;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class SuraBookmarkViewPagerAdapter extends PagerAdapter {
    public static int new_top;
    private SuraBookmarkDetailsListAdapter adapter;
    private Activity context;
    private LayoutInflater inflater;
    private ListView listView;
    private ArrayList<SuraBookmarkQuranDetails> quranDetails;
    private ArrayList<SuraBookmarkQuranSuras> quranSurasArrayList;
    private boolean toolshowhide = true;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return null;
    }

    public SuraBookmarkViewPagerAdapter(Activity activity, ArrayList<SuraBookmarkQuranSuras> arrayList) {
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
        String sura_id = this.quranSurasArrayList.get(i).getSura_id();
        this.listView = (ListView) inflate.findViewById(R.id.listView);
        if (Utils.getString(this.context, "normal").equals("1")) {
            this.listView.setBackgroundResource(17170443);
        }
        SuraBookmarkDetailsListAdapter suraBookmarkDetailsListAdapter = new SuraBookmarkDetailsListAdapter(this.context, sura_id, DatabaseAccessor.getAllSuraBookmarkVersesBySuraId(sura_id));
        this.adapter = suraBookmarkDetailsListAdapter;
        this.listView.setAdapter((ListAdapter) suraBookmarkDetailsListAdapter);
        final String sura_id2 = this.quranSurasArrayList.get(i).getSura_id();
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkViewPagerAdapter.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                SuraBookmarkViewPagerAdapter.new_top = view.getTop();
                if (SuraBookmarkViewPagerAdapter.new_top < 1) {
                    SuraBookmarkViewPagerAdapter.new_top = 1;
                }
                Log.d("Clicked", sura_id2 + " " + (115 - Integer.parseInt(sura_id2)));
                new DatabaseAccessor();
                ArrayList<QuranDetails> allVersesBySuraId = DatabaseAccessor.getAllVersesBySuraId(String.valueOf(115 - Integer.parseInt(sura_id2)), "");
                if (SuraBookmarkDetailsListAdapter.dialog != null && SuraBookmarkDetailsListAdapter.dialog.isShowing()) {
                    SuraBookmarkDetailsListAdapter.dialog.dismiss();
                }
                Activity activity = SuraBookmarkViewPagerAdapter.this.context;
                SuraBookmarkDetailsListAdapter.CustomDialog(activity, view, sura_id2 + "_" + allVersesBySuraId.get(i2).getId(), adapterView);
            }
        });
        ((ViewPager) viewGroup).addView(inflate);
        return inflate;
    }

    private void toolbarShowHide() {
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkViewPagerAdapter.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (SuraBookmarkViewPagerAdapter.this.toolshowhide) {
                    SuraBookmarkViewPagerAdapter.this.context.getWindow().addFlags(1024);
                    SuraBookmarkViewPagerAdapter.this.context.getWindow().clearFlags(2048);
                    SuraBookmarkActivity.toolbar.setVisibility(8);
                    SuraBookmarkViewPagerAdapter.this.toolshowhide = false;
                    return;
                }
                SuraBookmarkViewPagerAdapter.this.context.getWindow().addFlags(2048);
                SuraBookmarkViewPagerAdapter.this.context.getWindow().clearFlags(1024);
                SuraBookmarkActivity.toolbar.setVisibility(0);
                SuraBookmarkViewPagerAdapter.this.toolshowhide = true;
            }
        });
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(View view, int i, Object obj) {
        ((ViewPager) view).removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == ((View) obj);
    }
}
