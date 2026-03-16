package com.muslim.Bookmark.Sura;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.muslim.Bookmark.Sura.model.SuraBookmarkQuranSuras;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class SuraBookmarkViewPagerFragment extends Fragment {
    private int currentPage;
    private String duaDBID;
    private int mCurrentPosition;
    private int mScrollState;
    private ProgressDialog pDialog;
    private SuraBookmarkQuranSuras quranSuras;
    private ArrayList<SuraBookmarkQuranSuras> quranSurasArrayList;
    private String text = "";
    private NonSwipeableViewPager viewPager;
    private SuraBookmarkViewPagerAdapter viewPagerAdapter;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SuraBookmarkActivity.ivBookmark.setVisibility(0);
        SuraBookmarkActivity.ivDrawerRight.setVisibility(8);
        try {
            DatabaseAccessor.initDB(getActivity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        String string = getArguments().getString(Constants.KEY_SURA_ID);
        this.duaDBID = string;
        this.quranSuras = DatabaseAccessor.getSuraBookmarkSuraById(string);
        String str = "";
        for (int i = 1; i < 115; i++) {
            if (Utils.getString(getActivity(), "bookmark_remove" + i).equals("" + i)) {
                if (str.equals("")) {
                    str = " where id = '" + i + "' ";
                }
                str = str + " or id ='" + i + "'";
            }
        }
        this.quranSurasArrayList = DatabaseAccessor.getAllSuraBookmarkSuras();
        Utils.setMyBanglaText(SuraBookmarkActivity.mTitle, this.quranSuras.getSuraName());
        this.currentPage = Integer.parseInt(this.duaDBID) - 1;
        View inflate = layoutInflater.inflate(R.layout.pager_layout_swipe_off, viewGroup, false);
        this.viewPager = (NonSwipeableViewPager) inflate.findViewById(R.id.view_pager);
        SuraBookmarkViewPagerAdapter suraBookmarkViewPagerAdapter = new SuraBookmarkViewPagerAdapter(getActivity(), this.quranSurasArrayList);
        this.viewPagerAdapter = suraBookmarkViewPagerAdapter;
        this.viewPager.setAdapter(suraBookmarkViewPagerAdapter);
        this.viewPagerAdapter.notifyDataSetChanged();
        if (Build.VERSION.SDK_INT >= 14) {
            this.viewPager.setOverScrollMode(2);
        }
        this.viewPager.setCurrentItem(this.currentPage);
        SuraBookmarkListViewFragment.listView.setSelection(this.viewPager.getCurrentItem());
        Log.d("MyCow", ((113 - this.viewPager.getCurrentItem()) + 1) + "");
        if (Build.VERSION.SDK_INT >= 21) {
            SuraBookmarkActivity.ivBookmark.setImageDrawable(getResources().getDrawable(R.drawable.bookmark, getActivity().getTheme()));
        } else {
            SuraBookmarkActivity.ivBookmark.setImageDrawable(getResources().getDrawable(R.drawable.bookmark));
        }
        SuraBookmarkActivity.ivBookmark.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkViewPagerFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FragmentActivity activity = SuraBookmarkViewPagerFragment.this.getActivity();
                StringBuilder sb = new StringBuilder();
                sb.append("bookmark_remove");
                sb.append((113 - SuraBookmarkViewPagerFragment.this.viewPager.getCurrentItem()) + 1);
                Utils.putString(activity, sb.toString(), "");
                Toast.makeText(SuraBookmarkViewPagerFragment.this.getActivity(), "Bookmark Removed", 0).show();
                SuraBookmarkViewPagerFragment.this.text = "";
                for (int i2 = 1; i2 < 115; i2++) {
                    FragmentActivity activity2 = SuraBookmarkViewPagerFragment.this.getActivity();
                    String string2 = Utils.getString(activity2, "bookmark_remove" + i2);
                    if (string2.equals("" + i2)) {
                        if (SuraBookmarkViewPagerFragment.this.text.equals("")) {
                            SuraBookmarkViewPagerFragment suraBookmarkViewPagerFragment = SuraBookmarkViewPagerFragment.this;
                            suraBookmarkViewPagerFragment.text = " where id = '" + (115 - i2) + "' ";
                        }
                        SuraBookmarkViewPagerFragment suraBookmarkViewPagerFragment2 = SuraBookmarkViewPagerFragment.this;
                        suraBookmarkViewPagerFragment2.text = SuraBookmarkViewPagerFragment.this.text + " or id ='" + (115 - i2) + "'";
                    }
                }
                SuraBookmarkViewPagerFragment.this.quranSurasArrayList = DatabaseAccessor.getAllSuraBookmarkSuras();
                SuraBookmarkViewPagerFragment suraBookmarkViewPagerFragment3 = SuraBookmarkViewPagerFragment.this;
                suraBookmarkViewPagerFragment3.viewPagerAdapter = new SuraBookmarkViewPagerAdapter(suraBookmarkViewPagerFragment3.getActivity(), SuraBookmarkViewPagerFragment.this.quranSurasArrayList);
                SuraBookmarkViewPagerFragment.this.viewPager.setAdapter(SuraBookmarkViewPagerFragment.this.viewPagerAdapter);
                SuraBookmarkViewPagerFragment.this.viewPagerAdapter.notifyDataSetChanged();
                SuraBookmarkActivity suraBookmarkActivity = SuraBookmarkActivity.getInstance();
                suraBookmarkActivity.prepareListDataBookmark();
                suraBookmarkActivity.loadListFragment();
                SuraBookmarkActivity.ivBookmark.setVisibility(8);
                SuraBookmarkActivity.ivDrawerRight.setVisibility(0);
                Utils.setMyBanglaText(SuraBookmarkActivity.mTitle, SuraBookmarkViewPagerFragment.this.getResources().getString(R.string.saved_suras));
                if (SuraBookmarkViewPagerFragment.this.text.equals("")) {
                    SuraBookmarkViewPagerFragment.this.getActivity().finish();
                } else {
                    SuraBookmarkActivity.getInstance().getSupportFragmentManager().popBackStack();
                }
            }
        });
        return inflate;
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
            SuraBookmarkViewPagerFragment.this.pDialog = new ProgressDialog(SuraBookmarkViewPagerFragment.this.getActivity());
            SuraBookmarkViewPagerFragment.this.pDialog.setMessage("Please wait...");
            SuraBookmarkViewPagerFragment.this.pDialog.setCancelable(true);
            SuraBookmarkViewPagerFragment.this.pDialog.show();
        }

        
        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            super.onPostExecute((TheTask) str);
            if (SuraBookmarkViewPagerFragment.this.pDialog.isShowing()) {
                SuraBookmarkViewPagerFragment.this.pDialog.dismiss();
            }
            SuraBookmarkViewPagerFragment suraBookmarkViewPagerFragment = SuraBookmarkViewPagerFragment.this;
            suraBookmarkViewPagerFragment.viewPagerAdapter = new SuraBookmarkViewPagerAdapter(suraBookmarkViewPagerFragment.getActivity(), SuraBookmarkViewPagerFragment.this.quranSurasArrayList);
            SuraBookmarkViewPagerFragment.this.viewPager.setAdapter(SuraBookmarkViewPagerFragment.this.viewPagerAdapter);
            SuraBookmarkViewPagerFragment.this.viewPagerAdapter.notifyDataSetChanged();
        }
    }

    private void sendBitmap() {
        saveBitmap(takeScreenshot());
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("png/image");
        intent.putExtra("android.intent.extra.STREAM", Uri.parse("file:///sdcard/screenshot.png"));
        if (Utils.isIntentAvailable(getActivity(), intent)) {
            getActivity().startActivity(Intent.createChooser(intent, "Email:"));
        } else {
            getActivity().startActivity(Intent.createChooser(intent, ""));
        }
    }

    public Bitmap takeScreenshot() {
        View rootView = getActivity().findViewById(16908290).getRootView();
        rootView.setDrawingCacheEnabled(true);
        return rootView.getDrawingCache();
    }

    public void saveBitmap(Bitmap bitmap) {
        deleteBitmap();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(Utils.getRoot() + "/screenshot.png"));
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            Log.e("GREC", e.getMessage(), e);
        } catch (IOException e2) {
            Log.e("GREC", e2.getMessage(), e2);
        }
    }

    private void deleteBitmap() {
        File file = new File(Utils.getRoot() + "/screenshot.png");
        if (file.exists()) {
            file.delete();
            if (file.exists()) {
                return;
            }
            Toast.makeText(getActivity(), "DELETED", 1).show();
        }
    }

    private void handleScrollState(int i) {
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

    
    public class ZoomOutPageTransformer implements ViewPager.PageTransformer {
        private static final float MIN_ALPHA = 0.5f;
        private static final float MIN_SCALE = 0.85f;

        public ZoomOutPageTransformer() {
        }

        @Override // androidx.viewpager.widget.ViewPager.PageTransformer
        public void transformPage(View view, float f) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (f < -1.0f) {
                view.setAlpha(0.0f);
            } else if (f <= 1.0f) {
                float max = Math.max((float) MIN_SCALE, 1.0f - Math.abs(f));
                float f2 = 1.0f - max;
                float f3 = (height * f2) / 2.0f;
                float f4 = (width * f2) / 2.0f;
                if (f < 0.0f) {
                    view.setTranslationX(f4 - (f3 / 2.0f));
                } else {
                    view.setTranslationX((-f4) + (f3 / 2.0f));
                }
                view.setScaleX(max);
                view.setScaleY(max);
                view.setAlpha((((max - MIN_SCALE) / 0.14999998f) * MIN_ALPHA) + MIN_ALPHA);
            } else {
                view.setAlpha(0.0f);
            }
        }
    }

    
    public class DepthPageTransformer implements ViewPager.PageTransformer {
        private static final float MIN_SCALE = 0.75f;

        public DepthPageTransformer() {
        }

        @Override // androidx.viewpager.widget.ViewPager.PageTransformer
        public void transformPage(View view, float f) {
            int width = view.getWidth();
            if (f < -1.0f) {
                view.setAlpha(0.0f);
            } else if (f <= 0.0f) {
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            } else if (f <= 1.0f) {
                view.setAlpha(1.0f - f);
                view.setTranslationX(width * (-f));
                float abs = ((1.0f - Math.abs(f)) * 0.25f) + MIN_SCALE;
                view.setScaleX(abs);
                view.setScaleY(abs);
            } else {
                view.setAlpha(0.0f);
            }
        }
    }
}
