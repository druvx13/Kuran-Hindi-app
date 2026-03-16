package com.muslim.quran_hindi;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.extras.Num114;
import com.muslim.quran_hindi.extras.SuraAdapter114;
import com.muslim.quran_hindi.model.QuranSuras;
import com.recyclerview.viewpager.RecyclerViewPager;
import java.util.ArrayList;

public class ViewPagerFragmentReading extends Fragment {
    private int currentPage;
    private String duaDBID;
    private FastScroller fastScrollerH;
    private Handler handlerTitle;
    private SuraAdapter114 mAdapterHorizontal;
    private int mCurrentPosition;
    private int mScrollState;
    private Handler myHandler;
    private Runnable myRunnable;
    private ProgressDialog pDialog;
    private QuranSuras quranSuras;
    private ArrayList<QuranSuras> quranSurasArrayList;
    private RecyclerViewPager recyclerViewHorizontal;
    private Runnable runnableTitle;
    private TextView toastTitle;
    protected ViewPager viewPager;
    private ViewPagerAdapterReading viewPagerAdapterReading;
    private String text = "";
    private ArrayList<Num114> numListHorizontal = new ArrayList<>();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        QuranActivity.ivGoto.setVisibility(8);
        QuranActivity.ivDrawerRight.setVisibility(8);
        try {
            DatabaseAccessor.initDB(getActivity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        QuranActivity.mDrawerLayoutRight.setDrawerLockMode(1);
        String string = getArguments().getString(Constants.KEY_SURA_ID);
        this.duaDBID = string;
        this.quranSuras = DatabaseAccessor.getSuraById(String.valueOf(115 - Integer.parseInt(string)));
        this.quranSurasArrayList = DatabaseAccessor.getAllSurasReverse();
        Utils.setMyBanglaText(QuranActivity.mTitle, this.quranSuras.getSuraName());
        if (this.duaDBID.equals("0")) {
            this.currentPage = 0;
        } else {
            int i = 0;
            while (true) {
                if (i >= this.quranSurasArrayList.size()) {
                    break;
                } else if (this.quranSurasArrayList.get(i).getSura_id().toString().equals(this.duaDBID)) {
                    Log.d("WWWE", this.quranSurasArrayList.get(i).getSura_id());
                    Log.d("WWWER", this.quranSurasArrayList.get(i).getSura_reverse_id());
                    this.currentPage = i;
                    break;
                } else {
                    i++;
                }
            }
        }
        View inflate = layoutInflater.inflate(R.layout.pager_layout, viewGroup, false);
        inflate.findViewById(R.id.floatingActionMenu).setVisibility(8);
        this.toastTitle = (TextView) inflate.findViewById(R.id.toast_title);
        this.viewPager = (ViewPager) inflate.findViewById(R.id.pager_layout);
        ViewPagerAdapterReading viewPagerAdapterReading = new ViewPagerAdapterReading(getActivity(), this.quranSurasArrayList);
        this.viewPagerAdapterReading = viewPagerAdapterReading;
        this.viewPager.setAdapter(viewPagerAdapterReading);
        this.viewPagerAdapterReading.notifyDataSetChanged();
        if (Build.VERSION.SDK_INT >= 14) {
            this.viewPager.setOverScrollMode(2);
        }
        this.viewPager.setCurrentItem(113 - this.currentPage);
        FragmentActivity activity = getActivity();
        Utils.putString(activity, "savedviewpager", (this.viewPager.getCurrentItem() + 1) + "");
        Utils.putInt(getActivity(), "LASTLISTVIEW", 114 - (this.viewPager.getCurrentItem() + 1));
        Log.d("MyCows", (115 - (this.viewPager.getCurrentItem() + 1)) + "");
        extra(inflate);
        ListViewFragment.listView.setAdapter((ListAdapter) ListViewFragment.listViewAdapter);
        ListViewFragment.listView.setSelection(114 - (this.viewPager.getCurrentItem() + 2));
        this.viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.muslim.quran_hindi.ViewPagerFragmentReading.1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i2, float f, int i3) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i2) {
                ViewPagerFragmentReading.this.handleScrollState(i2);
                ViewPagerFragmentReading.this.mScrollState = i2;
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i2) {
                ViewPagerFragmentReading.this.mCurrentPosition = i2;
                Utils.putInt(ViewPagerFragmentReading.this.getActivity(), "LASTLISTVIEW", 114 - (ViewPagerFragmentReading.this.mCurrentPosition + 1));
                ListViewFragment.listView.setAdapter((ListAdapter) ListViewFragment.listViewAdapter);
                ListViewFragment.listView.setSelection(114 - (ViewPagerFragmentReading.this.mCurrentPosition + 2));
                Utils.putString(ViewPagerFragmentReading.this.getActivity(), "savedviewpager", String.valueOf(ViewPagerFragmentReading.this.mCurrentPosition + 1));
                ViewPagerFragmentReading viewPagerFragmentReading = ViewPagerFragmentReading.this;
                viewPagerFragmentReading.quranSuras = DatabaseAccessor.getSuraById(String.valueOf(115 - (viewPagerFragmentReading.viewPager.getCurrentItem() + 1)));
                Utils.setMyBanglaText(QuranActivity.mTitle, ViewPagerFragmentReading.this.quranSuras.getSuraName());
                ViewPagerFragmentReading.this.recyclerViewHorizontal.getLayoutManager().scrollToPosition(ViewPagerFragmentReading.this.mCurrentPosition);
            }
        });
        return inflate;
    }

    
    public void handleScrollState(int i) {
        if (i == 0) {
            setNextItemIfNeeded();
        }
    }

    private void setNextItemIfNeeded() {
        if (isScrollStateSettling()) {
            return;
        }
        handleSetNextItem();
    }

    private boolean isScrollStateSettling() {
        return this.mScrollState == 2;
    }

    private void handleSetNextItem() {
        int count = this.viewPager.getAdapter().getCount() - 1;
        int i = this.mCurrentPosition;
        if (i == 0) {
            this.viewPager.setCurrentItem(count, false);
        } else if (i == count) {
            this.viewPager.setCurrentItem(0, false);
        }
    }

    private void extra(View view) {
        this.recyclerViewHorizontal = (RecyclerViewPager) view.findViewById(R.id.recycler_view_horizontal);
        FastScroller fastScroller = (FastScroller) view.findViewById(R.id.fastscrollH);
        this.fastScrollerH = fastScroller;
        fastScroller.setHandleColor(Color.parseColor("#ffbf00"));
        this.mAdapterHorizontal = new SuraAdapter114(getActivity(), this.numListHorizontal);
        this.recyclerViewHorizontal.setLayoutManager(new LinearLayoutManager(QuranActivity.mainActivity, 0, false));
        this.recyclerViewHorizontal.setItemAnimator(new DefaultItemAnimator());
        this.recyclerViewHorizontal.setAdapter(this.mAdapterHorizontal);
        this.fastScrollerH.setRecyclerView(this.recyclerViewHorizontal);
        if (this.viewPager.getCurrentItem() == 0) {
            this.recyclerViewHorizontal.getLayoutManager().scrollToPosition(5);
        }
        new Handler().postDelayed(new Runnable() { // from class: com.muslim.quran_hindi.ViewPagerFragmentReading.2
            @Override // java.lang.Runnable
            public void run() {
                ViewPagerFragmentReading.this.recyclerViewHorizontal.getLayoutManager().scrollToPosition(ViewPagerFragmentReading.this.viewPager.getCurrentItem());
            }
        }, 100L);
        this.recyclerViewHorizontal.setSinglePageFling(true);
        prepareimgDataHorizontal();
        this.recyclerViewHorizontal.addOnPageChangedListener(new RecyclerViewPager.OnPageChangedListener() { // from class: com.muslim.quran_hindi.ViewPagerFragmentReading.3
            @Override // com.recyclerview.viewpager.RecyclerViewPager.OnPageChangedListener
            public void OnPageChanged(int i, final int i2) {
                if (ViewPagerFragmentReading.this.myHandler != null && ViewPagerFragmentReading.this.myRunnable != null) {
                    ViewPagerFragmentReading.this.myHandler.removeCallbacks(ViewPagerFragmentReading.this.myRunnable);
                }
                ViewPagerFragmentReading.this.myHandler = new Handler();
                ViewPagerFragmentReading.this.myRunnable = new Runnable() { // from class: com.muslim.quran_hindi.ViewPagerFragmentReading.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ViewPagerFragmentReading.this.viewPager.setCurrentItem(i2);
                    }
                };
                ViewPagerFragmentReading.this.myHandler.postDelayed(ViewPagerFragmentReading.this.myRunnable, 300L);
                TextView textView = ViewPagerFragmentReading.this.toastTitle;
                StringBuilder sb = new StringBuilder();
                int i3 = 114 - i2;
                sb.append(Utils.getBanglaNumber(i3));
                sb.append(". ");
                sb.append(QuranActivity.mainActivity.getResources().getString(R.string.sura));
                sb.append(" ");
                sb.append(DatabaseAccessor.getSuraById(String.valueOf(i3)).getSuraName().trim());
                Utils.setMyBanglaText(textView, sb.toString());
                if (ViewPagerFragmentReading.this.handlerTitle != null && ViewPagerFragmentReading.this.runnableTitle != null) {
                    ViewPagerFragmentReading.this.myHandler.removeCallbacks(ViewPagerFragmentReading.this.runnableTitle);
                }
                ViewPagerFragmentReading.this.toastTitle.setVisibility(0);
                ViewPagerFragmentReading.this.runnableTitle = new Runnable() { // from class: com.muslim.quran_hindi.ViewPagerFragmentReading.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ViewPagerFragmentReading.this.handlerTitle = null;
                        ViewPagerFragmentReading.this.runnableTitle = null;
                        ViewPagerFragmentReading.this.toastTitle.setVisibility(8);
                    }
                };
                ViewPagerFragmentReading.this.handlerTitle = new Handler();
                ViewPagerFragmentReading.this.handlerTitle.postDelayed(ViewPagerFragmentReading.this.runnableTitle, 3000L);
            }
        });
    }

    private void prepareimgDataHorizontal() {
        for (int i = 114; i >= 1; i--) {
            this.numListHorizontal.add(new Num114(String.valueOf(i)));
        }
        this.mAdapterHorizontal.notifyDataSetChanged();
    }

    
    class TheTask extends AsyncTask<String, String, String> {
        String page;

        
        @Override // android.os.AsyncTask
        public String doInBackground(String... strArr) {
            return null;
        }

        public TheTask(String str) {
            this.page = str;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            ViewPagerFragmentReading.this.pDialog = new ProgressDialog(ViewPagerFragmentReading.this.getActivity());
            ViewPagerFragmentReading.this.pDialog.setMessage("Please wait...");
            ViewPagerFragmentReading.this.pDialog.setCancelable(true);
            ViewPagerFragmentReading.this.pDialog.show();
        }

        
        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            super.onPostExecute((TheTask) str);
            if (ViewPagerFragmentReading.this.pDialog.isShowing()) {
                ViewPagerFragmentReading.this.pDialog.dismiss();
            }
            ViewPagerFragmentReading.this.viewPagerAdapterReading = new ViewPagerAdapterReading(ViewPagerFragmentReading.this.getActivity(), ViewPagerFragmentReading.this.quranSurasArrayList);
            ViewPagerFragmentReading.this.viewPager.setAdapter(ViewPagerFragmentReading.this.viewPagerAdapterReading);
            ViewPagerFragmentReading.this.viewPagerAdapterReading.notifyDataSetChanged();
        }
    }
}
