package com.muslim.Bookmark.Verses;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;
import com.muslim.Bookmark.Sura.SuraBookmarkActivity;
import com.muslim.Bookmark.Verses.model.VersesBookmarkQuranSuras;
import com.muslim.Search.SearchQuranActivity;
import com.muslim.Settings.SettingsActivity;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.R;
import java.util.ArrayList;
import java.util.HashMap;

public class VersesBookmarkActivity extends AppCompatActivity {
    public static ImageView ivDrawerRight;
    public static FrameLayout leftDrawer;
    public static ArrayList<VersesBookmarkQuranSuras> listDataHeader;
    public static DrawerLayout mDrawerLayout;
    public static TextView mTitle;
    static VersesBookmarkActivity mainActivity;
    public static Menu menu;
    public static Toolbar toolbar;
    private String bookmark;
    private Handler handler;
    private boolean isFinished;
    private ImageView ivBookmark;
    private HashMap<String, ArrayList<VersesBookmarkQuranSuras>> listDataChild;
    private DrawerLayout mDrawerLayoutRight;
    private ActionBarDrawerToggle mDrawerToggle;
    private ProgressDialog pDialog;
    private RelativeLayout relativeLayoutAyatBookmark;
    private RelativeLayout relativeLayoutHafezi;
    private RelativeLayout relativeLayoutHome;
    private RelativeLayout relativeLayoutReadMe;
    private RelativeLayout relativeLayoutSearch;
    private RelativeLayout relativeLayoutSettings;
    private RelativeLayout relativeLayoutSuraBookmark;
    private LinearLayout rightDrawer;
    private Runnable runUI;

    public boolean isChildSelectable(int i, int i2) {
        return false;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu2) {
        return true;
    }

    public static VersesBookmarkActivity getInstance() {
        return mainActivity;
    }

    public static Context getContext() {
        return getContext();
    }

    private static void stopPlaying() {
        Constants.SINGLE_PLAY = false;
        try {
            if (VersesBookmarkDetailsListAdapter.mp != null) {
                VersesBookmarkDetailsListAdapter.mp.stop();
                VersesBookmarkDetailsListAdapter.mp.release();
                VersesBookmarkDetailsListAdapter.mp = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showOverflowMenu(boolean z) {
        if (menu == null) {
        }
    }

    
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.activity_bookmark);
        mainActivity = this;
        double parseDouble = Double.parseDouble(Utils.getString(this, "device_height"));
        if (Build.VERSION.SDK_INT < 21) {
            if (parseDouble >= 4.0d) {
                findViewById(R.id.nokol_statusbar).setVisibility(0);
            } else {
                findViewById(R.id.nokol_statusbar).setVisibility(8);
            }
        } else if (parseDouble < 4.0d) {
            getWindow().setFlags(1024, 1024);
        }
        prepareListDataBookmark();
        loadListFragment();
        loadGridFragment();
        clickDrawer();
        Utils.setRightDrawerText(mainActivity, this.mDrawerLayoutRight, this.rightDrawer, false);
        Utils.putString(getApplicationContext(), "bookmark_remove", "");
    }

    
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.mDrawerToggle.syncState();
    }

    
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        stopPlaying();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 && mDrawerLayout.isDrawerOpen(leftDrawer)) {
            mDrawerLayout.closeDrawer(leftDrawer);
        }
        if (menuItem.getItemId() == 16908332) {
            if (mDrawerLayout.isDrawerOpen(leftDrawer)) {
                mDrawerLayout.closeDrawer(leftDrawer);
            } else {
                mDrawerLayout.openDrawer(leftDrawer);
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu2) {
        showOverflowMenu(false);
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        backStack();
    }

    private void backStack() {
        if (mDrawerLayout.isDrawerOpen(leftDrawer)) {
            mDrawerLayout.closeDrawer(leftDrawer);
        } else if (this.mDrawerLayoutRight.isDrawerOpen(this.rightDrawer)) {
            this.mDrawerLayoutRight.closeDrawer(this.rightDrawer);
        } else if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            getSupportFragmentManager().popBackStack();
            showOverflowMenu(false);
        } else if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
            getSupportFragmentManager().popBackStack();
            showOverflowMenu(false);
            stopPlaying();
            Utils.setMyBanglaText(mTitle, getResources().getString(R.string.my_saved_ayats));
        } else {
            finish();
        }
    }

    private void exitApp() {
        boolean z = this.isFinished;
        if (z) {
            if (z) {
                finish();
                return;
            }
            return;
        }
        Toast.makeText(getApplicationContext(), "Press again to exit", 0).show();
        this.isFinished = true;
        new Handler().postDelayed(new Runnable() { // from class: com.muslim.Bookmark.Verses.VersesBookmarkActivity.1
            @Override // java.lang.Runnable
            public void run() {
                VersesBookmarkActivity.this.isFinished = false;
            }
        }, 1500L);
    }

    public int getResourceID(String str, String str2, int i) {
        int identifier = getResources().getIdentifier(str2, str, getClass().getPackage().getName());
        return identifier == 0 ? i : identifier;
    }

    public void prepareListDataBookmark() {
        listDataHeader = new ArrayList<>();
        this.listDataChild = new HashMap<>();
        if (Build.VERSION.SDK_INT < 11) {
            new TheTask().execute(new String[0]);
        } else {
            new TheTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    public void loadGridFragment() {
        VersesBookmarkGridViewFragment versesBookmarkGridViewFragment = new VersesBookmarkGridViewFragment();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.content_frame, versesBookmarkGridViewFragment);
        beginTransaction.setTransition(8194);
        beginTransaction.commit();
    }

    void loadListFragment() {
        VersesBookmarkListViewFragment versesBookmarkListViewFragment = new VersesBookmarkListViewFragment();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.content_left, versesBookmarkListViewFragment);
        beginTransaction.setTransition(8194);
        beginTransaction.commit();
    }

    public void loadViewPagerFragment(String str) {
        if (mDrawerLayout.isDrawerOpen(leftDrawer)) {
            mDrawerLayout.closeDrawer(leftDrawer);
        }
        if (getSupportFragmentManager().getBackStackEntryCount() >= 1) {
            getSupportFragmentManager().popBackStack();
        }
        VersesBookmarkViewPagerFragment versesBookmarkViewPagerFragment = new VersesBookmarkViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.KEY_SURA_ID, str);
        versesBookmarkViewPagerFragment.setArguments(bundle);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.content_frame, versesBookmarkViewPagerFragment);
        beginTransaction.addToBackStack(null);
        beginTransaction.setTransition(0);
        beginTransaction.commit();
    }

    
    public void hideKeyboard() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    private void clickDrawer() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        leftDrawer = (FrameLayout) findViewById(R.id.content_left);
        this.mDrawerLayoutRight = (DrawerLayout) findViewById(R.id.drawer_layout_right);
        this.rightDrawer = (LinearLayout) findViewById(R.id.right_drawer);
        Toolbar toolbar2 = (Toolbar) findViewById(R.id.app_bar);
        toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        TextView textView = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mTitle = textView;
        Utils.setMyBanglaText(textView, getResources().getString(R.string.my_saved_ayats));
        ImageView imageView = (ImageView) toolbar.findViewById(R.id.ivBookMark);
        this.ivBookmark = imageView;
        imageView.setVisibility(8);
        ImageView imageView2 = (ImageView) toolbar.findViewById(R.id.ivDrawerRight);
        ivDrawerRight = imageView2;
        imageView2.setVisibility(0);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) { // from class: com.muslim.Bookmark.Verses.VersesBookmarkActivity.2
            @Override // androidx.appcompat.app.ActionBarDrawerToggle, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerStateChanged(int i) {
                if (i == 2) {
                    if (VersesBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(VersesBookmarkActivity.this.rightDrawer)) {
                        VersesBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(VersesBookmarkActivity.this.rightDrawer);
                    }
                    if (VersesBookmarkActivity.mDrawerLayout.isDrawerOpen(VersesBookmarkActivity.leftDrawer)) {
                        VersesBookmarkActivity.this.hideKeyboard();
                        VersesBookmarkActivity.mDrawerLayout.closeDrawer(VersesBookmarkActivity.leftDrawer);
                    }
                }
            }
        };
        ivDrawerRight.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Verses.VersesBookmarkActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (VersesBookmarkActivity.mDrawerLayout.isDrawerOpen(VersesBookmarkActivity.leftDrawer)) {
                    VersesBookmarkActivity.mDrawerLayout.closeDrawer(VersesBookmarkActivity.leftDrawer);
                }
                if (VersesBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(VersesBookmarkActivity.this.rightDrawer)) {
                    VersesBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(VersesBookmarkActivity.this.rightDrawer);
                } else {
                    VersesBookmarkActivity.this.mDrawerLayoutRight.openDrawer(VersesBookmarkActivity.this.rightDrawer);
                }
            }
        });
        mDrawerLayout.post(new Runnable() { // from class: com.muslim.Bookmark.Verses.VersesBookmarkActivity.4
            @Override // java.lang.Runnable
            public void run() {
                VersesBookmarkActivity.this.mDrawerToggle.syncState();
            }
        });
        mDrawerLayout.setDrawerListener(this.mDrawerToggle);
        if (!Utils.getBoolean(this, "miu")) {
            Utils.putBoolean(this, "miu", true);
            mDrawerLayout.openDrawer(leftDrawer);
        }
        this.relativeLayoutHome = (RelativeLayout) findViewById(R.id.relativeLayoutHome);
        this.relativeLayoutSuraBookmark = (RelativeLayout) findViewById(R.id.relativeLayoutSuraBookmark);
        this.relativeLayoutAyatBookmark = (RelativeLayout) findViewById(R.id.relativeLayoutAyatBookmark);
        this.relativeLayoutSearch = (RelativeLayout) findViewById(R.id.relativeLayoutSearch);
        this.relativeLayoutHafezi = (RelativeLayout) findViewById(R.id.relativeLayoutHafezi);
        this.relativeLayoutSettings = (RelativeLayout) findViewById(R.id.relativeLayoutSettings);
        this.relativeLayoutReadMe = (RelativeLayout) findViewById(R.id.relativeLayoutReadMe);
        this.relativeLayoutAyatBookmark.setBackgroundResource(R.color.detailsbutton);
        ((ImageView) findViewById(R.id.ivAyatBookmark)).setBackgroundResource(R.mipmap.ic_sura_bookmark_selected);
        ((TextView) findViewById(R.id.tvAyatBookmark)).setTextColor(-1);
        this.relativeLayoutHome.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Verses.VersesBookmarkActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (VersesBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(VersesBookmarkActivity.this.rightDrawer)) {
                    VersesBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(VersesBookmarkActivity.this.rightDrawer);
                }
                VersesBookmarkActivity.this.finish();
            }
        });
        this.relativeLayoutSuraBookmark.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Verses.VersesBookmarkActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (VersesBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(VersesBookmarkActivity.this.rightDrawer)) {
                    VersesBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(VersesBookmarkActivity.this.rightDrawer);
                }
                String str = "";
                for (int i = 1; i < 115; i++) {
                    if (Utils.getString(VersesBookmarkActivity.this, "bookmark_remove" + i).equals("" + i)) {
                        if (str.equals("")) {
                            str = " where id = '" + (115 - i) + "' ";
                        }
                        str = str + " or id ='" + (115 - i) + "'";
                    }
                }
                if (str.equals("")) {
                    Toast.makeText(VersesBookmarkActivity.this.getApplicationContext(), "No sura added to FAVOURITE list", 0).show();
                    return;
                }
                VersesBookmarkActivity.this.finish();
                VersesBookmarkActivity.this.startActivity(new Intent(VersesBookmarkActivity.this, SuraBookmarkActivity.class));
            }
        });
        this.relativeLayoutAyatBookmark.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Verses.VersesBookmarkActivity.7
            public String bookmark;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (VersesBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(VersesBookmarkActivity.this.rightDrawer)) {
                    VersesBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(VersesBookmarkActivity.this.rightDrawer);
                }
            }
        });
        this.relativeLayoutSearch.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Verses.VersesBookmarkActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (VersesBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(VersesBookmarkActivity.this.rightDrawer)) {
                    VersesBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(VersesBookmarkActivity.this.rightDrawer);
                }
                VersesBookmarkActivity.this.finish();
                VersesBookmarkActivity.this.startActivity(new Intent(VersesBookmarkActivity.this, SearchQuranActivity.class));
            }
        });
        this.relativeLayoutHafezi.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Verses.VersesBookmarkActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (VersesBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(VersesBookmarkActivity.this.rightDrawer)) {
                    VersesBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(VersesBookmarkActivity.this.rightDrawer);
                }
                VersesBookmarkActivity.this.finish();
            }
        });
        this.relativeLayoutSettings.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Verses.VersesBookmarkActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (VersesBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(VersesBookmarkActivity.this.rightDrawer)) {
                    VersesBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(VersesBookmarkActivity.this.rightDrawer);
                }
                VersesBookmarkActivity.this.finish();
                VersesBookmarkActivity.this.startActivity(new Intent(VersesBookmarkActivity.this, SettingsActivity.class));
            }
        });
        this.relativeLayoutReadMe.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Verses.VersesBookmarkActivity.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (VersesBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(VersesBookmarkActivity.this.rightDrawer)) {
                    VersesBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(VersesBookmarkActivity.this.rightDrawer);
                }
            }
        });
    }

    
    
    public class TheTask extends AsyncTask<String, String, String> {
        String text = "";

        TheTask() {
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            VersesBookmarkActivity.this.pDialog = new ProgressDialog(VersesBookmarkActivity.this);
            VersesBookmarkActivity.this.pDialog.setMessage("Please wait...");
            VersesBookmarkActivity.this.pDialog.setCancelable(false);
            VersesBookmarkActivity.this.pDialog.show();
        }

        
        @Override // android.os.AsyncTask
        public String doInBackground(String... strArr) {
            for (int i = 1; i <= 6236; i++) {
                VersesBookmarkActivity versesBookmarkActivity = VersesBookmarkActivity.this;
                versesBookmarkActivity.bookmark = Utils.getString(versesBookmarkActivity, "bookmark_verse" + i);
                String str = VersesBookmarkActivity.this.bookmark;
                if (str.equals("" + i)) {
                    if (this.text.equals("")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(" where id = '");
                        sb.append(DatabaseAccessor.getBookmarkSuraIdByVersesId(i + "").getSura_id());
                        sb.append("' ");
                        this.text = sb.toString();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.text);
                    sb2.append(" or id ='");
                    sb2.append(DatabaseAccessor.getBookmarkSuraIdByVersesId(i + "").getSura_id());
                    sb2.append("'");
                    this.text = sb2.toString();
                }
            }
            if (this.text.equals("")) {
                this.text = " where id = '115' ";
                VersesBookmarkActivity.this.finish();
            }
            return this.text;
        }

        
        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            super.onPostExecute((TheTask) str);
            Log.d("COC", str);
            VersesBookmarkActivity.listDataHeader = DatabaseAccessor.getVersesByBookmarkId(str);
            for (int i = 0; i < VersesBookmarkActivity.listDataHeader.size(); i++) {
                VersesBookmarkActivity.this.listDataChild.put(VersesBookmarkActivity.listDataHeader.get(i).getSura_name_ar().trim(), DatabaseAccessor.getVersesByBookmarkId(str));
            }
            VersesBookmarkActivity.this.loadListFragment();
            VersesBookmarkActivity.this.loadGridFragment();
            if (VersesBookmarkActivity.this.pDialog.isShowing()) {
                VersesBookmarkActivity.this.pDialog.dismiss();
            }
        }
    }
}
