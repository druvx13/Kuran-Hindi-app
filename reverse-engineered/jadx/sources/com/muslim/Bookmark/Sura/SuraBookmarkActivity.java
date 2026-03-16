package com.muslim.Bookmark.Sura;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
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
import com.muslim.Bookmark.Sura.model.SuraBookmarkQuranSuras;
import com.muslim.Bookmark.Verses.VersesBookmarkActivity;
import com.muslim.Search.SearchQuranActivity;
import com.muslim.Settings.SettingsActivity;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.R;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public class SuraBookmarkActivity extends AppCompatActivity {
    public static ImageView ivBookmark;
    public static ImageView ivDrawerRight;
    public static FrameLayout leftDrawer;
    public static ArrayList<SuraBookmarkQuranSuras> listDataHeader;
    public static DrawerLayout mDrawerLayout;
    public static TextView mTitle;
    static SuraBookmarkActivity mainActivity;
    public static Menu menu;
    public static Toolbar toolbar;
    private Handler handler;
    private boolean isFinished;
    private HashMap<String, ArrayList<SuraBookmarkQuranSuras>> listDataChild;
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

    public static SuraBookmarkActivity getInstance() {
        return mainActivity;
    }

    public static Context getContext() {
        return getContext();
    }

    private static void stopPlaying() {
        Constants.SINGLE_PLAY = false;
        try {
            if (SuraBookmarkDetailsListAdapter.mp != null) {
                SuraBookmarkDetailsListAdapter.mp.stop();
                SuraBookmarkDetailsListAdapter.mp.release();
                SuraBookmarkDetailsListAdapter.mp = null;
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
    protected void onCreate(Bundle bundle) {
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
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.mDrawerToggle.syncState();
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
            prepareListDataBookmark();
            getSupportFragmentManager().popBackStack();
            showOverflowMenu(false);
            ivBookmark.setVisibility(8);
            ivDrawerRight.setVisibility(0);
            stopPlaying();
            Utils.setMyBanglaText(mTitle, getResources().getString(R.string.saved_suras));
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
        new Handler().postDelayed(new Runnable() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkActivity.1
            @Override // java.lang.Runnable
            public void run() {
                SuraBookmarkActivity.this.isFinished = false;
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
        String str = "";
        for (int i = 1; i < 115; i++) {
            if (Utils.getString(this, "bookmark_remove" + i).equals("" + i)) {
                if (str.equals("")) {
                    str = " where id = '" + (115 - i) + "' ";
                }
                str = str + " or id ='" + (115 - i) + "'";
            }
        }
        if (str.equals("")) {
            str = " where id = '115' ";
        }
        listDataHeader = DatabaseAccessor.getSurasByBookmarkId(str);
        for (int i2 = 0; i2 < listDataHeader.size(); i2++) {
            this.listDataChild.put(listDataHeader.get(i2).getSura_name_ar().trim(), DatabaseAccessor.getSurasByBookmarkId(str));
        }
    }

    public void loadGridFragment() {
        SuraBookmarkGridViewFragment suraBookmarkGridViewFragment = new SuraBookmarkGridViewFragment();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.content_frame, suraBookmarkGridViewFragment);
        beginTransaction.setTransition(8194);
        beginTransaction.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadListFragment() {
        SuraBookmarkListViewFragment suraBookmarkListViewFragment = new SuraBookmarkListViewFragment();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.content_left, suraBookmarkListViewFragment);
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
        SuraBookmarkViewPagerFragment suraBookmarkViewPagerFragment = new SuraBookmarkViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.KEY_SURA_ID, str);
        suraBookmarkViewPagerFragment.setArguments(bundle);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.content_frame, suraBookmarkViewPagerFragment);
        beginTransaction.addToBackStack(null);
        beginTransaction.setTransition(0);
        beginTransaction.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
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
        Utils.setMyBanglaText(textView, getResources().getString(R.string.saved_suras));
        ImageView imageView = (ImageView) toolbar.findViewById(R.id.ivBookMark);
        ivBookmark = imageView;
        imageView.setVisibility(8);
        ImageView imageView2 = (ImageView) toolbar.findViewById(R.id.ivDrawerRight);
        ivDrawerRight = imageView2;
        imageView2.setVisibility(0);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) { // from class: com.muslim.Bookmark.Sura.SuraBookmarkActivity.2
            @Override // androidx.appcompat.app.ActionBarDrawerToggle, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerStateChanged(int i) {
                if (i == 2) {
                    if (SuraBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(SuraBookmarkActivity.this.rightDrawer)) {
                        SuraBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(SuraBookmarkActivity.this.rightDrawer);
                    }
                    if (SuraBookmarkActivity.mDrawerLayout.isDrawerOpen(SuraBookmarkActivity.leftDrawer)) {
                        SuraBookmarkActivity.this.hideKeyboard();
                        SuraBookmarkActivity.mDrawerLayout.closeDrawer(SuraBookmarkActivity.leftDrawer);
                    }
                }
            }
        };
        ivDrawerRight.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SuraBookmarkActivity.mDrawerLayout.isDrawerOpen(SuraBookmarkActivity.leftDrawer)) {
                    SuraBookmarkActivity.mDrawerLayout.closeDrawer(SuraBookmarkActivity.leftDrawer);
                }
                if (SuraBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(SuraBookmarkActivity.this.rightDrawer)) {
                    SuraBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(SuraBookmarkActivity.this.rightDrawer);
                } else {
                    SuraBookmarkActivity.this.mDrawerLayoutRight.openDrawer(SuraBookmarkActivity.this.rightDrawer);
                }
            }
        });
        mDrawerLayout.post(new Runnable() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkActivity.4
            @Override // java.lang.Runnable
            public void run() {
                SuraBookmarkActivity.this.mDrawerToggle.syncState();
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
        this.relativeLayoutSuraBookmark.setBackgroundResource(R.color.detailsbutton);
        ((ImageView) findViewById(R.id.ivSuraBookmark)).setBackgroundResource(R.mipmap.ic_sura_bookmark_selected);
        ((TextView) findViewById(R.id.tvSuraBookmark)).setTextColor(-1);
        this.relativeLayoutHome.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SuraBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(SuraBookmarkActivity.this.rightDrawer)) {
                    SuraBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(SuraBookmarkActivity.this.rightDrawer);
                }
                SuraBookmarkActivity.this.finish();
            }
        });
        this.relativeLayoutSuraBookmark.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SuraBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(SuraBookmarkActivity.this.rightDrawer)) {
                    SuraBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(SuraBookmarkActivity.this.rightDrawer);
                }
            }
        });
        this.relativeLayoutAyatBookmark.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkActivity.7
            public String bookmark;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SuraBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(SuraBookmarkActivity.this.rightDrawer)) {
                    SuraBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(SuraBookmarkActivity.this.rightDrawer);
                }
                String str = "";
                int i = 1;
                while (i <= 6236) {
                    String string = Utils.getString(SuraBookmarkActivity.this, "bookmark_verse" + i);
                    this.bookmark = string;
                    Log.d("COW", string);
                    if (this.bookmark.equals("" + i)) {
                        str = str + "1";
                        i = 6237;
                    }
                    i++;
                }
                if (str.equals("")) {
                    Toast.makeText(SuraBookmarkActivity.this.getApplicationContext(), SuraBookmarkActivity.this.getResources().getString(R.string.no_verses_added), 0).show();
                    return;
                }
                SuraBookmarkActivity.this.finish();
                SuraBookmarkActivity.this.startActivity(new Intent(SuraBookmarkActivity.this, VersesBookmarkActivity.class));
            }
        });
        this.relativeLayoutSearch.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SuraBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(SuraBookmarkActivity.this.rightDrawer)) {
                    SuraBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(SuraBookmarkActivity.this.rightDrawer);
                }
                SuraBookmarkActivity.this.finish();
                SuraBookmarkActivity.this.startActivity(new Intent(SuraBookmarkActivity.this, SearchQuranActivity.class));
            }
        });
        this.relativeLayoutHafezi.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SuraBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(SuraBookmarkActivity.this.rightDrawer)) {
                    SuraBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(SuraBookmarkActivity.this.rightDrawer);
                }
                SuraBookmarkActivity.this.finish();
            }
        });
        this.relativeLayoutSettings.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SuraBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(SuraBookmarkActivity.this.rightDrawer)) {
                    SuraBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(SuraBookmarkActivity.this.rightDrawer);
                }
                SuraBookmarkActivity.this.finish();
                SuraBookmarkActivity.this.startActivity(new Intent(SuraBookmarkActivity.this, SettingsActivity.class));
            }
        });
        this.relativeLayoutReadMe.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Bookmark.Sura.SuraBookmarkActivity.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SuraBookmarkActivity.this.mDrawerLayoutRight.isDrawerOpen(SuraBookmarkActivity.this.rightDrawer)) {
                    SuraBookmarkActivity.this.mDrawerLayoutRight.closeDrawer(SuraBookmarkActivity.this.rightDrawer);
                }
            }
        });
    }
}
