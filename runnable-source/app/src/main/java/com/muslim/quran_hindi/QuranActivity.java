package com.muslim.quran_hindi;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.muslim.Bookmark.Sura.SuraBookmarkActivity;
import com.muslim.Bookmark.Verses.VersesBookmarkActivity;
import com.muslim.Search.SearchQuranActivity;
import com.muslim.Settings.SettingsActivity;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.model.QuranSuras;
import com.recyclerview.fastscroll.views.FastScrollRecyclerView;
import java.util.ArrayList;

public class QuranActivity extends AppCompatActivity {
    public static Dialog dialog = null;
    public static ImageView ivDrawerRight = null;
    public static ImageView ivGoto = null;
    public static ImageView ivMore = null;
    public static ImageView ivPlay = null;
    public static FrameLayout leftDrawer = null;
    public static DrawerLayout mDrawerLayout = null;
    public static DrawerLayout mDrawerLayoutRight = null;
    public static TextView mTitle = null;
    static QuranActivity mainActivity = null;
    protected static Toolbar.LayoutParams params = null;
    public static String queryText = "";
    public static ArrayList<QuranSuras> quranSuras;
    public static Toolbar toolbar;
    private Handler adHandler;
    private Runnable adRunnable;
    private ArrayList<Integer> ayatArrayList;
    private boolean isFinished;
    private ActionBarDrawerToggle mDrawerToggle;
    private ProgressDialog mProgressDialog;
    private RelativeLayout relativeLayoutAyatBookmark;
    private RelativeLayout relativeLayoutDowanloadAll;
    private RelativeLayout relativeLayoutHafezi;
    private RelativeLayout relativeLayoutHome;
    private RelativeLayout relativeLayoutReadMe;
    private RelativeLayout relativeLayoutSearch;
    private RelativeLayout relativeLayoutSettings;
    private RelativeLayout relativeLayoutSuraBookmark;
    private LinearLayout rightDrawer;
    private SurahRecyclerAdapter surahRecyclerAdapter;
    private FastScrollRecyclerView surahRecyclerView;
    private TextView tvSurahVerses;
    private VersesRecyclerAdapter versesRecyclerAdapter;
    private FastScrollRecyclerView versesRecyclerView;

    public static QuranActivity getInstance() {
        return mainActivity;
    }

    public static Context getContext() {
        return mainActivity != null ? mainActivity.getApplicationContext() : null;
    }

    
    public static void stopPlaying() {
        Constants.IS_BISMILLAH = false;
        try {
            if (DetailsListAdapter.mp != null && DetailsListAdapter.mp.isPlaying()) {
                DetailsListAdapter.mp.stop();
                DetailsListAdapter.mp.release();
                DetailsListAdapter.mp = null;
                if (Build.VERSION.SDK_INT >= 21) {
                    ivPlay.setImageDrawable(mainActivity.getResources().getDrawable(R.mipmap.ic_play, mainActivity.getTheme()));
                } else {
                    ivPlay.setImageDrawable(mainActivity.getResources().getDrawable(R.mipmap.ic_play));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() {
        if (Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE) == -1) {
            if (Utils.getWidth(this) >= 720.0f) {
                Utils.putInt(this, Constants.KEY_ARABIC_FONT_SIZE, 38);
            } else if (Utils.getWidth(this) >= 600.0f) {
                Utils.putInt(this, Constants.KEY_ARABIC_FONT_SIZE, 35);
            } else if (Utils.getWidth(this) >= 400.0f) {
                Utils.putInt(this, Constants.KEY_ARABIC_FONT_SIZE, 32);
            } else {
                Utils.putInt(this, Constants.KEY_ARABIC_FONT_SIZE, 30);
            }
        }
    }

    private void getDeviceHeight() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        float f2 = i;
        float f3 = i2;
        Utils.putString(mainActivity, "device_width_dp", String.valueOf(Math.min(f2 / f, f3 / f)));
        float f4 = f2 / displayMetrics.xdpi;
        float f5 = f3 / displayMetrics.ydpi;
        Utils.putString(mainActivity, "device_height", String.valueOf(Math.sqrt((f4 * f4) + (f5 * f5))));
    }

    
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.activity_main_appbar_new);
        mainActivity = this;
        String string = Utils.getString(this, "device_height");
        String string2 = Utils.getString(mainActivity, "device_width_dp");
        if (string.equals("") || string2.equals("")) {
            getDeviceHeight();
        }
        double parseDouble = Double.parseDouble(Utils.getString(mainActivity, "device_height"));
        Log.d("DREG", "" + parseDouble);
        if (Build.VERSION.SDK_INT < 21) {
            if (parseDouble >= 4.0d) {
                findViewById(R.id.nokol_statusbar).setVisibility(0);
            } else {
                findViewById(R.id.nokol_statusbar).setVisibility(8);
            }
        } else if (parseDouble < 4.0d) {
            getWindow().setFlags(1024, 1024);
        }
        prepareListData();
        loadListFragment();
        loadGridFragment();
        clickDrawer();
        Utils.setRightDrawerText(mainActivity, mDrawerLayoutRight, this.rightDrawer, true);
        init();
        isStoragePermissionGranted();
        Constants.IS_SHOWN = 0;
        Utils.showAdvertisement(mainActivity);
        showRatings();
    }

    private void showRatings() {
        if (Utils.getInt(this, "showRatingsDialog") >= 100 || Utils.getInt(this, "showRatingsDialog") == -1) {
            return;
        }
        if (Utils.getInt(this, "showRatingsDialog") == 2) {
            Utils.putInt(this, "showRatingsDialog", Utils.getInt(this, "showRatingsDialog") + 1);
            showRatingsDialog();
        } else if (Utils.getInt(this, "showRatingsDialog") > 0 && Utils.getInt(this, "showRatingsDialog") % 5 == 0) {
            Utils.putInt(this, "showRatingsDialog", Utils.getInt(this, "showRatingsDialog") + 1);
            showRatingsDialog();
        } else {
            Utils.putInt(this, "showRatingsDialog", Utils.getInt(this, "showRatingsDialog") + 1);
        }
    }

    private void showRatingsDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.MyAlertDialogStyle);
        AlertDialog.Builder message = builder.setTitle(R.string.rating).setMessage(getResources().getString(R.string.rating_message));
        message.setPositiveButton(Html.fromHtml("<big>" + getResources().getString(R.string.rate_now) + "</big>"), new DialogInterface.OnClickListener() { // from class: com.muslim.quran_hindi.QuranActivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                Utils.gotoLink(QuranActivity.mainActivity);
            }
        }).setNeutralButton(getResources().getString(R.string.rated_previous), new DialogInterface.OnClickListener() { // from class: com.muslim.quran_hindi.QuranActivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                Utils.putInt(QuranActivity.mainActivity, "showRatingsDialog", -1);
            }
        }).setIcon(R.drawable.ic_app_rate);
        AlertDialog create = builder.create();
        create.show();
        create.getButton(-2).setAllCaps(false);
        create.getButton(-1).setAllCaps(false);
        create.getButton(-3).setAllCaps(false);
        create.show();
    }

    private void showAd() {
        if (Constants.IS_SHOWN % 3 == 0) {
            if (Utils.iAd == null || !Utils.iAd.isLoaded()) {
                return;
            }
            Toast.makeText(mainActivity, "An advertisement will show now", 0).show();
            this.adHandler = new Handler();
            Runnable runnable = new Runnable() { // from class: com.muslim.quran_hindi.QuranActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    Utils.iAd.show();
                    Constants.IS_SHOWN++;
                    Utils.showAdvertisement(QuranActivity.mainActivity);
                }
            };
            this.adRunnable = runnable;
            this.adHandler.postDelayed(runnable, 1000L);
            return;
        }
        Constants.IS_SHOWN++;
    }

    
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Runnable runnable;
        super.onPause();
        Handler handler = this.adHandler;
        if (handler == null || (runnable = this.adRunnable) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.mDrawerToggle.syncState();
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        backStack();
    }

    private void backStack() {
        if (mDrawerLayout.isDrawerOpen(leftDrawer)) {
            mDrawerLayout.closeDrawer(leftDrawer);
        } else if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            getSupportFragmentManager().popBackStackImmediate();
        } else if (ViewPagerFragment.floatingActionMenu != null && ViewPagerFragment.floatingActionMenu.isOpened()) {
            ViewPagerFragment.floatingActionMenu.close(true);
        } else if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
            mainActivity.setTheme(R.style.AppTheme);
            toolbar.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 21) {
                ivPlay.setImageDrawable(mainActivity.getResources().getDrawable(R.mipmap.ic_play, mainActivity.getTheme()));
            } else {
                ivPlay.setImageDrawable(mainActivity.getResources().getDrawable(R.mipmap.ic_play));
            }
            stopPlaying();
            Constants.isFirst = true;
            getSupportFragmentManager().popBackStackImmediate();
            ivPlay.setVisibility(8);
            ivMore.setVisibility(8);
            ivGoto.setVisibility(0);
            ivDrawerRight.setVisibility(0);
            Utils.setMyBanglaText(mTitle, getResources().getString(R.string.app));
            mDrawerLayout.setDrawerLockMode(0);
            mDrawerLayoutRight.setDrawerLockMode(1);
            showAd();
        } else if (mDrawerLayoutRight.isDrawerOpen(this.rightDrawer)) {
            mDrawerLayoutRight.closeDrawer(this.rightDrawer);
        } else {
            exitApp();
        }
    }

    private void exitApp() {
        Runnable runnable;
        Toast makeText = Toast.makeText(this, "", 0);
        boolean z = this.isFinished;
        if (!z) {
            makeText.setText("Press again to exit");
            makeText.show();
            this.isFinished = true;
            new Handler().postDelayed(new Runnable() { // from class: com.muslim.quran_hindi.QuranActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    QuranActivity.this.isFinished = false;
                }
            }, 3000L);
        } else if (z) {
            makeText.cancel();
            Handler handler = this.adHandler;
            if (handler != null && (runnable = this.adRunnable) != null) {
                handler.removeCallbacks(runnable);
            }
            finish();
        }
    }

    public void prepareListData() {
        quranSuras = DatabaseAccessor.getAllSuras();
    }

    public void loadGridFragment() {
        GridViewFragment gridViewFragment = new GridViewFragment();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.content_frame, gridViewFragment);
        beginTransaction.setTransition(8194);
        beginTransaction.commit();
    }

    void loadListFragment() {
        ListViewFragment listViewFragment = new ListViewFragment();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.content_left, listViewFragment);
        beginTransaction.setTransition(8194);
        beginTransaction.commit();
    }

    public void loadViewPagerFragment(String str) {
        if (mDrawerLayout.isDrawerOpen(leftDrawer)) {
            mDrawerLayout.closeDrawer(leftDrawer);
        }
        if (getSupportFragmentManager().getBackStackEntryCount() >= 1) {
            getSupportFragmentManager().popBackStack();
        } else {
            Constants.PREVIOUS_ITEM = 114 - Integer.parseInt(str);
        }
        if (Utils.getString(mainActivity, Constants.KEY_READING_MOOD).equals(Constants.READING_MOOD_ON)) {
            ViewPagerFragmentReading viewPagerFragmentReading = new ViewPagerFragmentReading();
            Bundle bundle = new Bundle();
            bundle.putString(Constants.KEY_SURA_ID, str);
            viewPagerFragmentReading.setArguments(bundle);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.setAllowOptimization(true);
            beginTransaction.replace(R.id.content_frame, viewPagerFragmentReading);
            beginTransaction.addToBackStack(null);
            beginTransaction.setTransition(0);
            beginTransaction.commit();
            return;
        }
        ViewPagerFragment viewPagerFragment = new ViewPagerFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString(Constants.KEY_SURA_ID, str);
        viewPagerFragment.setArguments(bundle2);
        FragmentTransaction beginTransaction2 = getSupportFragmentManager().beginTransaction();
        beginTransaction2.setAllowOptimization(true);
        beginTransaction2.replace(R.id.content_frame, viewPagerFragment);
        beginTransaction2.addToBackStack(null);
        beginTransaction2.setTransition(0);
        beginTransaction2.commit();
    }

    private void clickDrawer() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        leftDrawer = (FrameLayout) findViewById(R.id.content_left);
        mDrawerLayoutRight = (DrawerLayout) findViewById(R.id.drawer_layout_right);
        this.rightDrawer = (LinearLayout) findViewById(R.id.right_drawer);
        mDrawerLayoutRight.setDrawerLockMode(1);
        Toolbar toolbar2 = (Toolbar) findViewById(R.id.app_bar);
        toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        params = new Toolbar.LayoutParams(-2, -2);
        TextView textView = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mTitle = textView;
        Utils.setMyBanglaText(textView, getResources().getString(R.string.app));
        ImageView imageView = (ImageView) toolbar.findViewById(R.id.ivPlay);
        ivPlay = imageView;
        imageView.setVisibility(8);
        ImageView imageView2 = (ImageView) toolbar.findViewById(R.id.ivMore);
        ivMore = imageView2;
        imageView2.setVisibility(8);
        ImageView imageView3 = (ImageView) toolbar.findViewById(R.id.ivGoto);
        ivGoto = imageView3;
        imageView3.setVisibility(0);
        ivGoto.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.QuranActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (QuranActivity.dialog != null && QuranActivity.dialog.isShowing()) {
                    QuranActivity.dialog.dismiss();
                }
                QuranActivity.this.gotoAyah();
            }
        });
        ImageView imageView4 = (ImageView) toolbar.findViewById(R.id.ivDrawerRight);
        ivDrawerRight = imageView4;
        imageView4.setVisibility(0);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) { // from class: com.muslim.quran_hindi.QuranActivity.6
            @Override // androidx.appcompat.app.ActionBarDrawerToggle, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerStateChanged(int i) {
                if (i == 2) {
                    if (QuranActivity.mDrawerLayoutRight.isDrawerOpen(QuranActivity.this.rightDrawer)) {
                        QuranActivity.mDrawerLayoutRight.closeDrawer(QuranActivity.this.rightDrawer);
                    }
                    if (QuranActivity.mDrawerLayout.isDrawerOpen(QuranActivity.leftDrawer)) {
                        QuranActivity.mDrawerLayout.closeDrawer(QuranActivity.leftDrawer);
                    }
                }
            }
        };
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.QuranActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (QuranActivity.mDrawerLayout.isDrawerOpen(QuranActivity.leftDrawer)) {
                    QuranActivity.mDrawerLayout.closeDrawer(QuranActivity.leftDrawer);
                } else {
                    QuranActivity.mDrawerLayout.openDrawer(QuranActivity.leftDrawer);
                }
            }
        });
        ivDrawerRight.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.QuranActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (QuranActivity.mDrawerLayout.isDrawerOpen(QuranActivity.leftDrawer)) {
                    QuranActivity.mDrawerLayout.closeDrawer(QuranActivity.leftDrawer);
                }
                if (QuranActivity.mDrawerLayoutRight.isDrawerOpen(QuranActivity.this.rightDrawer)) {
                    QuranActivity.mDrawerLayoutRight.closeDrawer(QuranActivity.this.rightDrawer);
                } else {
                    QuranActivity.mDrawerLayoutRight.openDrawer(QuranActivity.this.rightDrawer);
                }
            }
        });
        mDrawerLayout.post(new Runnable() { // from class: com.muslim.quran_hindi.QuranActivity.9
            @Override // java.lang.Runnable
            public void run() {
                QuranActivity.this.mDrawerToggle.syncState();
            }
        });
        mDrawerLayout.setDrawerListener(this.mDrawerToggle);
        this.relativeLayoutHome = (RelativeLayout) findViewById(R.id.relativeLayoutHome);
        this.relativeLayoutSuraBookmark = (RelativeLayout) findViewById(R.id.relativeLayoutSuraBookmark);
        this.relativeLayoutAyatBookmark = (RelativeLayout) findViewById(R.id.relativeLayoutAyatBookmark);
        this.relativeLayoutSearch = (RelativeLayout) findViewById(R.id.relativeLayoutSearch);
        this.relativeLayoutHafezi = (RelativeLayout) findViewById(R.id.relativeLayoutHafezi);
        this.relativeLayoutSettings = (RelativeLayout) findViewById(R.id.relativeLayoutSettings);
        this.relativeLayoutReadMe = (RelativeLayout) findViewById(R.id.relativeLayoutReadMe);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayoutDowanloadAll);
        this.relativeLayoutDowanloadAll = relativeLayout;
        relativeLayout.setVisibility(8);
        this.relativeLayoutHome.setBackgroundResource(R.color.detailsbutton);
        findViewById(R.id.ivHome).setBackgroundResource(R.mipmap.ic_home_selected);
        ((TextView) findViewById(R.id.tvHome)).setTextColor(-1);
        this.relativeLayoutHome.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.QuranActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (QuranActivity.mDrawerLayoutRight.isDrawerOpen(QuranActivity.this.rightDrawer)) {
                    QuranActivity.mDrawerLayoutRight.closeDrawer(QuranActivity.this.rightDrawer);
                }
            }
        });
        this.relativeLayoutSuraBookmark.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.QuranActivity.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (QuranActivity.mDrawerLayoutRight.isDrawerOpen(QuranActivity.this.rightDrawer)) {
                    QuranActivity.mDrawerLayoutRight.closeDrawer(QuranActivity.this.rightDrawer);
                }
                String str = "";
                for (int i = 1; i < 115; i++) {
                    if (Utils.getString(QuranActivity.this, "bookmark_remove" + i).equals("" + i)) {
                        if (str.equals("")) {
                            str = " where id = '" + (115 - i) + "' ";
                        }
                        str = str + " or id ='" + (115 - i) + "'";
                    }
                }
                if (str.equals("")) {
                    Toast.makeText(QuranActivity.this.getApplicationContext(), "No sura added to FAVOURITE list", 0).show();
                } else {
                    QuranActivity.this.startActivity(new Intent(QuranActivity.this, SuraBookmarkActivity.class));
                }
            }
        });
        this.relativeLayoutAyatBookmark.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.QuranActivity.12
            public String bookmark;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (QuranActivity.mDrawerLayoutRight.isDrawerOpen(QuranActivity.this.rightDrawer)) {
                    QuranActivity.mDrawerLayoutRight.closeDrawer(QuranActivity.this.rightDrawer);
                }
                String str = "";
                int i = 1;
                while (i <= 6236) {
                    String string = Utils.getString(QuranActivity.this, "bookmark_verse" + i);
                    this.bookmark = string;
                    Log.d("COW", string);
                    if (this.bookmark.equals("" + i)) {
                        str = str + "1";
                        i = 6237;
                    }
                    i++;
                }
                if (str.equals("")) {
                    Toast.makeText(QuranActivity.this.getApplicationContext(), QuranActivity.this.getResources().getString(R.string.no_verses_added), 0).show();
                } else {
                    QuranActivity.this.startActivity(new Intent(QuranActivity.this, VersesBookmarkActivity.class));
                }
            }
        });
        this.relativeLayoutSearch.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.QuranActivity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (QuranActivity.mDrawerLayoutRight.isDrawerOpen(QuranActivity.this.rightDrawer)) {
                    QuranActivity.mDrawerLayoutRight.closeDrawer(QuranActivity.this.rightDrawer);
                }
                QuranActivity.this.startActivity(new Intent(QuranActivity.this, SearchQuranActivity.class));
            }
        });
        this.relativeLayoutSettings.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.QuranActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (QuranActivity.mDrawerLayoutRight.isDrawerOpen(QuranActivity.this.rightDrawer)) {
                    QuranActivity.mDrawerLayoutRight.closeDrawer(QuranActivity.this.rightDrawer);
                }
                QuranActivity.this.startActivity(new Intent(QuranActivity.this, SettingsActivity.class));
            }
        });
        this.relativeLayoutReadMe.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.QuranActivity.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (QuranActivity.mDrawerLayoutRight.isDrawerOpen(QuranActivity.this.rightDrawer)) {
                    QuranActivity.mDrawerLayoutRight.closeDrawer(QuranActivity.this.rightDrawer);
                }
            }
        });
    }

    public boolean isStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                Log.v("DREGTAG", "Permission is granted");
                return true;
            }
            Log.v("DREGTAG", "Permission is revoked");
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            return false;
        }
        Log.v("DREGTAG", "Permission is granted");
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr[0] == 0) {
            Log.v("DREGTAG", "Permission: " + strArr[0] + "was " + iArr[0]);
        }
    }

    public void gotoAyah() {
        Dialog dialog2 = new Dialog(mainActivity);
        dialog = dialog2;
        dialog2.requestWindowFeature(1);
        dialog.setContentView(R.layout.layout_goto);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        this.surahRecyclerView = (FastScrollRecyclerView) dialog.findViewById(R.id.surahRecyclerView);
        Constants.SELECTED_ID = Utils.getInt(mainActivity, "LASTLISTVIEW") + 1;
        this.surahRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        SurahRecyclerAdapter surahRecyclerAdapter = new SurahRecyclerAdapter();
        this.surahRecyclerAdapter = surahRecyclerAdapter;
        this.surahRecyclerView.setAdapter(surahRecyclerAdapter);
        this.surahRecyclerView.scrollToPosition(Constants.SELECTED_ID - 2);
        this.ayatArrayList = new ArrayList<>();
        FastScrollRecyclerView fastScrollRecyclerView = (FastScrollRecyclerView) dialog.findViewById(R.id.versesRecyclerView);
        this.versesRecyclerView = fastScrollRecyclerView;
        fastScrollRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        getVerses(Integer.parseInt(DatabaseAccessor.getSuraById(String.valueOf(Constants.SELECTED_ID)).getVersesId()));
        if (Utils.getBoolean(mainActivity, Constants.IS_SAVED) && Constants.SELECTED_ID == Utils.getInt(mainActivity, "LASTLISTVIEW") + 1) {
            QuranActivity quranActivity = mainActivity;
            Constants.SELECTED_AYAT = Utils.getInt(quranActivity, Constants.SELECTED_ID + "POSLISTVIEW") + 1;
        } else if (Constants.SELECTED_ID == 1) {
            Constants.SELECTED_AYAT = 1;
        } else {
            Constants.SELECTED_AYAT = 2;
        }
        VersesRecyclerAdapter versesRecyclerAdapter = new VersesRecyclerAdapter();
        this.versesRecyclerAdapter = versesRecyclerAdapter;
        this.versesRecyclerView.setAdapter(versesRecyclerAdapter);
        this.versesRecyclerView.scrollToPosition(Constants.SELECTED_AYAT - 2);
        TextView textView = (TextView) dialog.findViewById(R.id.tvSurahVerses);
        this.tvSurahVerses = textView;
        textView.setText(Utils.getBanglaNumber(Constants.SELECTED_ID) + ". " + DatabaseAccessor.getSuraById(String.valueOf(Constants.SELECTED_ID)).getSuraName() + getResources().getString(R.string.tvVerse) + Utils.getBanglaNumber(Constants.SELECTED_AYAT));
        TextView textView2 = (TextView) dialog.findViewById(R.id.btnSearch);
        Utils.setMyBanglaText(textView2, textView2.getText().toString());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.QuranActivity.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                QuranActivity.dialog.dismiss();
                Constants.IS_FROM_SEARCH = true;
                QuranActivity.this.loadViewPagerFragment(String.valueOf(115 - Constants.SELECTED_ID));
                QuranActivity.stopPlaying();
            }
        });
        ((ImageView) dialog.findViewById(R.id.iv_close)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.quran_hindi.QuranActivity.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                QuranActivity.dialog.dismiss();
            }
        });
        dialog.show();
    }

    
    public void getVerses(int i) {
        this.ayatArrayList.clear();
        for (int i2 = 1; i2 <= i; i2++) {
            this.ayatArrayList.add(Integer.valueOf(i2));
        }
    }

    
    
    public class SurahRecyclerAdapter extends RecyclerView.Adapter<SurahViewHolder> implements FastScrollRecyclerView.SectionedAdapter {
        SurahRecyclerAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SurahViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SurahViewHolder(LayoutInflater.from(QuranActivity.this.getApplicationContext()).inflate(R.layout.layout_goto_suraname, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SurahViewHolder surahViewHolder, int i) {
            Log.d("FREG", QuranActivity.quranSuras.get(i).getSura_id());
            surahViewHolder.tvSurahName.setText(QuranActivity.quranSuras.get(i).getSuraName());
            if (Constants.SELECTED_ID == Integer.parseInt(QuranActivity.quranSuras.get(i).getSura_id())) {
                surahViewHolder.tvSurahName.setBackgroundColor(-3355444);
            } else {
                surahViewHolder.tvSurahName.setBackgroundColor(-1);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return QuranActivity.quranSuras.size();
        }

        @Override // com.recyclerview.fastscroll.views.FastScrollRecyclerView.SectionedAdapter
        public String getSectionName(int i) {
            return Utils.getBanglaNumber(i + 1);
        }

        
        
        public class SurahViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            private TextView tvSurahName;

            SurahViewHolder(View view) {
                super(view);
                TextView textView = (TextView) view.findViewById(R.id.tvSuraName);
                this.tvSurahName = textView;
                textView.setOnClickListener(this);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Constants.SELECTED_ID = Integer.parseInt(QuranActivity.quranSuras.get(getAdapterPosition()).getSura_id());
                QuranActivity.this.getVerses(Integer.parseInt(QuranActivity.quranSuras.get(getAdapterPosition()).getVersesId()));
                QuranActivity.this.surahRecyclerAdapter = new SurahRecyclerAdapter();
                QuranActivity.this.surahRecyclerView.setAdapter(QuranActivity.this.surahRecyclerAdapter);
                QuranActivity.this.surahRecyclerView.scrollToPosition(Constants.SELECTED_ID - 2);
                if (Utils.getBoolean(QuranActivity.mainActivity, Constants.IS_SAVED) && Constants.SELECTED_ID == Utils.getInt(QuranActivity.mainActivity, "LASTLISTVIEW") + 1) {
                    QuranActivity quranActivity = QuranActivity.mainActivity;
                    Constants.SELECTED_AYAT = Utils.getInt(quranActivity, Constants.SELECTED_ID + "POSLISTVIEW") + 1;
                } else if (Constants.SELECTED_ID == 1) {
                    Constants.SELECTED_AYAT = 1;
                } else {
                    Constants.SELECTED_AYAT = 2;
                }
                QuranActivity.this.versesRecyclerAdapter = new VersesRecyclerAdapter();
                QuranActivity.this.versesRecyclerView.setAdapter(QuranActivity.this.versesRecyclerAdapter);
                QuranActivity.this.versesRecyclerView.scrollToPosition(Constants.SELECTED_AYAT - 2);
                TextView textView = QuranActivity.this.tvSurahVerses;
                textView.setText(Utils.getBanglaNumber(Constants.SELECTED_ID) + ". " + DatabaseAccessor.getSuraById(String.valueOf(Constants.SELECTED_ID)).getSuraName() + QuranActivity.this.getResources().getString(R.string.tvVerse) + Utils.getBanglaNumber(Constants.SELECTED_AYAT));
            }
        }
    }

    
    
    public class VersesRecyclerAdapter extends RecyclerView.Adapter<VersesViewHolder> implements FastScrollRecyclerView.SectionedAdapter {
        VersesRecyclerAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public VersesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new VersesViewHolder(LayoutInflater.from(QuranActivity.this.getApplicationContext()).inflate(R.layout.layout_goto_suraname, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(VersesViewHolder versesViewHolder, int i) {
            Log.d("FREGf", QuranActivity.this.ayatArrayList.size() + " jj");
            versesViewHolder.tvVerses.setText(Utils.getBanglaNumber(((Integer) QuranActivity.this.ayatArrayList.get(i)).toString()));
            if (Constants.SELECTED_AYAT == ((Integer) QuranActivity.this.ayatArrayList.get(i)).intValue()) {
                versesViewHolder.tvVerses.setBackgroundColor(-3355444);
            } else {
                versesViewHolder.tvVerses.setBackgroundColor(-1);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return QuranActivity.this.ayatArrayList.size();
        }

        @Override // com.recyclerview.fastscroll.views.FastScrollRecyclerView.SectionedAdapter
        public String getSectionName(int i) {
            return Utils.getBanglaNumber(i + 1);
        }

        
        
        public class VersesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            private TextView tvVerses;

            VersesViewHolder(View view) {
                super(view);
                TextView textView = (TextView) view.findViewById(R.id.tvSuraName);
                this.tvVerses = textView;
                textView.setOnClickListener(this);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Constants.SELECTED_AYAT = ((Integer) QuranActivity.this.ayatArrayList.get(getAdapterPosition())).intValue();
                QuranActivity.this.versesRecyclerAdapter = new VersesRecyclerAdapter();
                QuranActivity.this.versesRecyclerView.setAdapter(QuranActivity.this.versesRecyclerAdapter);
                QuranActivity.this.versesRecyclerView.scrollToPosition(Constants.SELECTED_AYAT - 2);
                TextView textView = QuranActivity.this.tvSurahVerses;
                textView.setText(Utils.getBanglaNumber(Constants.SELECTED_ID) + ". " + DatabaseAccessor.getSuraById(String.valueOf(Constants.SELECTED_ID)).getSuraName() + QuranActivity.this.getResources().getString(R.string.tvVerse) + Utils.getBanglaNumber(Constants.SELECTED_AYAT));
            }
        }
    }
}
