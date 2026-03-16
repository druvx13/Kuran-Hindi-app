package com.muslim.hafizi;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
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
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import com.muslim.Bookmark.Sura.SuraBookmarkActivity;
import com.muslim.Bookmark.Verses.VersesBookmarkActivity;
import com.muslim.Search.SearchQuranActivity;
import com.muslim.Settings.SettingsActivity;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.R;
import com.muslim.quran_hindi.model.QuranSuras;
import com.recyclerview.viewpager.RecyclerViewPager;
import java.util.ArrayList;
import java.util.List;

public class HafiziActivity11 extends AppCompatActivity {
    private static HafiziActivity11 activity = null;
    public static Handler myHandler = null;
    public static Runnable myRunnable = null;
    public static ArrayList<QuranJuzs> quranJuzs = null;
    public static ArrayList<QuranSuras> quranSuras = null;
    public static Toolbar toolbar = null;
    public static boolean toolshowhide = true;
    public static TextView tvTitle;
    private Typeface arabicTypeface;
    private Dialog dialog;
    private FastScroller fastScrollerH;
    private FastScroller fastScrollerV;
    private ImageView ivDrawerRight;
    private ImageView ivGoToPage;
    private ImageView ivMore;
    private FrameLayout leftDrawer;
    private ImgAdapter11 mAdapterHorizontal;
    private ImgAdapter11 mAdapterViewVertical;
    private DrawerLayout mDrawerLayout;
    private DrawerLayout mDrawerLayoutRight;
    private ActionBarDrawerToggle mDrawerToggle;
    private int pageNumber;
    private RecyclerViewPager recyclerViewHorizontal;
    private RecyclerView recyclerViewVertical;
    private RelativeLayout relativeLayoutAyatBookmark;
    private RelativeLayout relativeLayoutDowanloadAll;
    private RelativeLayout relativeLayoutHafezi;
    private RelativeLayout relativeLayoutHome;
    private RelativeLayout relativeLayoutReadMe;
    private RelativeLayout relativeLayoutSearch;
    private RelativeLayout relativeLayoutSettings;
    private RelativeLayout relativeLayoutSuraBookmark;
    private LinearLayout rightDrawer;
    private TextView toolbar_title;
    DatabaseAccessor db = new DatabaseAccessor();
    private List<Img> imgListHorizontal = new ArrayList();
    private List<Img> imgListVertical = new ArrayList();
    private boolean orientation = true;

    public static HafiziActivity11 getInstance() {
        return activity;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_hafizi);
        Constants.isArabicFontSupported = Build.VERSION.SDK_INT >= 14;
        activity = this;
        prepareListData();
        clickDrawer();
        loadListFragment();
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        this.recyclerViewHorizontal = (RecyclerViewPager) findViewById(R.id.recycler_view_horizontal);
        this.fastScrollerH = (FastScroller) findViewById(R.id.fastscrollH);
        this.mAdapterHorizontal = new ImgAdapter11(this, this.imgListHorizontal);
        this.recyclerViewHorizontal.setLayoutManager(new LinearLayoutManager(getApplicationContext(), 0, false));
        this.recyclerViewHorizontal.setItemAnimator(new DefaultItemAnimator());
        this.recyclerViewHorizontal.setAdapter(this.mAdapterHorizontal);
        this.fastScrollerH.setRecyclerView(this.recyclerViewHorizontal);
        new Handler().postDelayed(new Runnable() { // from class: com.muslim.hafizi.HafiziActivity11.1
            @Override // java.lang.Runnable
            public void run() {
                HafiziActivity11.this.recyclerViewHorizontal.getLayoutManager().scrollToPosition(Utils.getHafiziInt(HafiziActivity11.this, "hafizi_saved_page"));
            }
        }, 10L);
        this.recyclerViewHorizontal.setSinglePageFling(true);
        prepareimgDataHorizontal();
        this.recyclerViewVertical = (RecyclerView) findViewById(R.id.recycler_view_vertical);
        this.fastScrollerV = (FastScroller) findViewById(R.id.fastscrollV);
        this.mAdapterViewVertical = new ImgAdapter11(this, this.imgListVertical);
        this.recyclerViewVertical.setLayoutManager(new LinearLayoutManager(getApplicationContext(), 1, false));
        this.recyclerViewVertical.setItemAnimator(new DefaultItemAnimator());
        this.recyclerViewVertical.setAdapter(this.mAdapterViewVertical);
        this.fastScrollerV.setRecyclerView(this.recyclerViewVertical);
        prepareimgDataVertical();
        this.recyclerViewHorizontal.addOnPageChangedListener(new RecyclerViewPager.OnPageChangedListener() { // from class: com.muslim.hafizi.HafiziActivity11.2
            
            
            
            @Override // com.recyclerview.viewpager.RecyclerViewPager.OnPageChangedListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void OnPageChanged(int r10, int r11) {
                /*
                    Method dump skipped, instructions count: 415
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.muslim.hafizi.HafiziActivity11.AnonymousClass2.OnPageChanged(int, int):void");
            }
        });
        ImageView imageView = (ImageView) toolbar.findViewById(R.id.ivMore);
        this.ivMore = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziActivity11.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HafiziActivity11.this.orientation) {
                    HafiziActivity11.this.orientation = false;
                    HafiziActivity11.this.setRequestedOrientation(0);
                    return;
                }
                HafiziActivity11.this.orientation = true;
                HafiziActivity11.this.setRequestedOrientation(1);
            }
        });
        rightDrawer();
        Utils.setRightDrawerTextForHafizi(activity, this.mDrawerLayoutRight, this.rightDrawer);
        this.ivDrawerRight = (ImageView) toolbar.findViewById(R.id.ivDrawerRight);
        this.mDrawerLayoutRight = (DrawerLayout) findViewById(R.id.drawer_layout_right);
        this.rightDrawer = (LinearLayout) findViewById(R.id.right_drawer);
        this.ivDrawerRight.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziActivity11.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HafiziActivity11.this.mDrawerLayout.isDrawerOpen(HafiziActivity11.this.leftDrawer)) {
                    HafiziActivity11.this.mDrawerLayout.closeDrawer(HafiziActivity11.this.leftDrawer);
                }
                if (HafiziActivity11.this.mDrawerLayoutRight.isDrawerOpen(HafiziActivity11.this.rightDrawer)) {
                    HafiziActivity11.this.mDrawerLayoutRight.closeDrawer(HafiziActivity11.this.rightDrawer);
                } else {
                    HafiziActivity11.this.mDrawerLayoutRight.openDrawer(HafiziActivity11.this.rightDrawer);
                }
            }
        });
        ImageView imageView2 = (ImageView) toolbar.findViewById(R.id.ivMore);
        this.ivMore = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziActivity11.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HafiziActivity11.this.dialog != null && HafiziActivity11.this.dialog.isShowing()) {
                    HafiziActivity11.this.dialog.dismiss();
                }
                if (HafiziActivity11.this.mDrawerLayout.isDrawerOpen(HafiziActivity11.this.leftDrawer)) {
                    HafiziActivity11.this.mDrawerLayout.closeDrawer(HafiziActivity11.this.leftDrawer);
                }
                if (HafiziActivity11.this.mDrawerLayoutRight.isDrawerOpen(HafiziActivity11.this.rightDrawer)) {
                    HafiziActivity11.this.mDrawerLayoutRight.closeDrawer(HafiziActivity11.this.rightDrawer);
                }
                HafiziActivity11.this.dialogMore();
            }
        });
        Toast.makeText(getApplicationContext(), getResources().getString(R.string.hafizi_prompt), 1).show();
    }

    
    public void dialogMore() {
        Dialog dialog = new Dialog(activity);
        this.dialog = dialog;
        dialog.requestWindowFeature(1);
        this.dialog.setContentView(R.layout.layout_popup_hafizi);
        this.dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.dialog.setCancelable(true);
        double d = (Double.parseDouble(Utils.getString(activity, "device_width_dp")) >= 600.0d ? 64 : 56) * getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        Window window = this.dialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.0f;
        attributes.y = (int) (d + 0.5d);
        attributes.flags |= 2;
        window.setGravity(53);
        window.setAttributes(attributes);
        ((LinearLayout) this.dialog.findViewById(R.id.layoutOrientation)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziActivity11.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HafiziActivity11.this.dialog.dismiss();
                if (HafiziActivity11.this.orientation) {
                    HafiziActivity11.this.orientation = false;
                    HafiziActivity11.this.setRequestedOrientation(0);
                    return;
                }
                HafiziActivity11.this.orientation = true;
                HafiziActivity11.this.setRequestedOrientation(1);
            }
        });
        ((LinearLayout) this.dialog.findViewById(R.id.layoutGotoPage)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziActivity11.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HafiziActivity11.this.dialog.dismiss();
                HafiziActivity11.this.dialogGotoPage();
            }
        });
        this.dialog.show();
    }

    
    
    
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void searchParaSura(android.widget.EditText r8, android.widget.TextView r9) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.muslim.hafizi.HafiziActivity11.searchParaSura(android.widget.EditText, android.widget.TextView):void");
    }

    
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (getResources().getConfiguration().orientation == 2) {
            Utils.putInt(this, "hafizi_saved_page", 609 - Constants.PAGE_NO);
        } else {
            Utils.putInt(this, "hafizi_saved_page", this.recyclerViewHorizontal.getCurrentPosition());
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        backStack();
    }

    private void backStack() {
        if (!this.orientation) {
            this.orientation = true;
            setRequestedOrientation(1);
        } else if (this.mDrawerLayout.isDrawerOpen(this.leftDrawer)) {
            this.mDrawerLayout.closeDrawer(this.leftDrawer);
        } else if (this.mDrawerLayoutRight.isDrawerOpen(this.rightDrawer)) {
            this.mDrawerLayoutRight.closeDrawer(this.rightDrawer);
        } else {
            finish();
        }
    }

    public void dialogGotoPage() {
        Dialog dialog = new Dialog(this);
        this.dialog = dialog;
        dialog.requestWindowFeature(1);
        this.dialog.setContentView(R.layout.layout_find_page);
        this.dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.dialog.setCancelable(false);
        final TextView textView = (TextView) this.dialog.findViewById(R.id.tvTitle);
        textView.setVisibility(8);
        final EditText editText = (EditText) this.dialog.findViewById(R.id.etPageNo);
        editText.setFilters(new InputFilter[]{new InputFilterMinMax("1", "610")});
        editText.addTextChangedListener(new TextWatcher() { // from class: com.muslim.hafizi.HafiziActivity11.8
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editText.getText().length() != 0 && Integer.parseInt(editable.toString()) >= 1 && Integer.parseInt(editable.toString()) <= 729) {
                    textView.setVisibility(0);
                    HafiziActivity11.this.searchParaSura(editText, textView);
                    return;
                }
                textView.setVisibility(8);
            }
        });
        ((TextView) this.dialog.findViewById(R.id.outof)).append("610");
        ((ImageView) this.dialog.findViewById(R.id.iv_close)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziActivity11.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HafiziActivity11.this.dialog.dismiss();
            }
        });
        ((Button) this.dialog.findViewById(R.id.searchButton)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziActivity11.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (editText.getText().length() != 0 && Integer.parseInt(editText.getText().toString()) >= 1 && Integer.parseInt(editText.getText().toString()) <= 729) {
                    HafiziActivity11.this.dialog.dismiss();
                    HafiziActivity11.this.recyclerViewHorizontal.getLayoutManager().scrollToPosition(610 - Integer.parseInt(editText.getText().toString()));
                    HafiziActivity11.this.searchParaSura(editText, HafiziActivity11.tvTitle);
                    if (HafiziActivity11.myHandler != null) {
                        HafiziActivity11.myHandler.removeCallbacks(HafiziActivity11.myRunnable);
                    }
                    HafiziActivity11.tvTitle.setVisibility(0);
                    HafiziActivity11.myRunnable = new Runnable() { // from class: com.muslim.hafizi.HafiziActivity11.10.1
                        @Override // java.lang.Runnable
                        public void run() {
                            HafiziActivity11.tvTitle.setVisibility(8);
                        }
                    };
                    HafiziActivity11.myHandler = new Handler();
                    HafiziActivity11.myHandler.postDelayed(HafiziActivity11.myRunnable, 2000L);
                    return;
                }
                Toast.makeText(HafiziActivity11.this.getApplicationContext(), HafiziActivity11.this.getResources().getString(R.string.page_validation), 0).show();
            }
        });
        this.dialog.show();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.recyclerViewHorizontal.setVisibility(8);
        this.recyclerViewVertical.setVisibility(8);
        this.fastScrollerH.setVisibility(8);
        this.fastScrollerV.setVisibility(8);
        if (getResources().getConfiguration().orientation == 2) {
            this.recyclerViewVertical.setVisibility(0);
            this.recyclerViewVertical.getLayoutManager().scrollToPosition(609 - this.recyclerViewHorizontal.getCurrentPosition());
            this.fastScrollerV.setVisibility(0);
            toolbar.setVisibility(8);
            return;
        }
        Log.d("TRANG", "" + Constants.PAGE_NO);
        this.recyclerViewHorizontal.getLayoutManager().scrollToPosition(609 - Constants.PAGE_NO);
        this.recyclerViewHorizontal.setVisibility(0);
        this.fastScrollerH.setVisibility(0);
        toolbar.setVisibility(0);
    }

    private void prepareimgDataHorizontal() {
        for (int i = 611; i >= 2; i += -1) {
            this.imgListHorizontal.add(new Img("2af1c0efb5de47d6c1b8a8aa77b3e34e-" + i + "-min.png"));
        }
        this.mAdapterHorizontal.notifyDataSetChanged();
    }

    private void prepareimgDataVertical() {
        for (int i = 2; i <= 611; i++) {
            this.imgListVertical.add(new Img("2af1c0efb5de47d6c1b8a8aa77b3e34e-" + i + "-min.png"));
        }
        this.mAdapterViewVertical.notifyDataSetChanged();
    }

    private void clickDrawer() {
        this.mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.leftDrawer = (FrameLayout) findViewById(R.id.content_left);
        Toolbar toolbar2 = (Toolbar) findViewById(R.id.app_bar);
        toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        TextView textView = (TextView) toolbar.findViewById(R.id.toolbar_title);
        this.toolbar_title = textView;
        Utils.setMyBanglaText(textView, getResources().getString(R.string.hafezi_quran));
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.mDrawerToggle = new ActionBarDrawerToggle(this, this.mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) { // from class: com.muslim.hafizi.HafiziActivity11.11
            @Override // androidx.appcompat.app.ActionBarDrawerToggle, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerStateChanged(int i) {
                if (i == 2) {
                    if (HafiziActivity11.this.mDrawerLayoutRight.isDrawerOpen(HafiziActivity11.this.rightDrawer)) {
                        HafiziActivity11.this.mDrawerLayoutRight.closeDrawer(HafiziActivity11.this.rightDrawer);
                    }
                    if (HafiziActivity11.this.mDrawerLayout.isDrawerOpen(HafiziActivity11.this.leftDrawer)) {
                        HafiziActivity11.this.hideKeyboard();
                        HafiziActivity11.this.mDrawerLayout.closeDrawer(HafiziActivity11.this.leftDrawer);
                    }
                }
            }
        };
        this.mDrawerLayout.post(new Runnable() { // from class: com.muslim.hafizi.HafiziActivity11.12
            @Override // java.lang.Runnable
            public void run() {
                HafiziActivity11.this.mDrawerToggle.syncState();
            }
        });
        this.mDrawerLayout.setDrawerListener(this.mDrawerToggle);
    }

    
    public void hideKeyboard() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    public void prepareListData() {
        quranSuras = DatabaseAccessor.getAllSuras();
        quranJuzs = DatabaseAccessor.getAllJuz();
    }

    void loadListFragment() {
        HafiziListViewFragment hafiziListViewFragment = new HafiziListViewFragment();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.content_left, hafiziListViewFragment);
        beginTransaction.setTransition(8194);
        beginTransaction.commit();
    }

    public void loadSuraViewFragment(String str) {
        if (this.mDrawerLayout.isDrawerOpen(this.leftDrawer)) {
            this.mDrawerLayout.closeDrawer(this.leftDrawer);
        }
        this.pageNumber = Integer.parseInt(DatabaseAccessor.getSuraById(str).getPage());
        String str2 = "";
        if (getResources().getConfiguration().orientation == 2) {
            this.recyclerViewVertical.getLayoutManager().scrollToPosition(610 - Integer.parseInt(DatabaseAccessor.getSuraByIdHafezi(str).getPage()));
            if (611 - this.pageNumber >= 2) {
                try {
                    Log.d("HGHGP", (612 - this.pageNumber) + "");
                    QuranJuzs paraByPages = DatabaseAccessor.getParaByPages("/" + (612 - this.pageNumber) + "/");
                    str2 = (getResources().getString(R.string.mypara) + Utils.getBanglaNumber(paraByPages.getId()) + "\n") + paraByPages.getPara_name() + " [ " + paraByPages.getPara_name_ar() + " ]\n";
                } catch (NullPointerException unused) {
                }
            }
            tvTitle.setText(str2 + getResources().getString(R.string.sura) + " " + DatabaseAccessor.getSuraByIdHafezi(str).getSuraName().trim() + "; " + getResources().getString(R.string.page) + Utils.getBanglaNumber(611 - this.pageNumber));
        } else {
            this.recyclerViewHorizontal.getLayoutManager().scrollToPosition(Integer.parseInt(DatabaseAccessor.getSuraByIdHafezi(str).getPage()) - 1);
            if (611 - this.pageNumber >= 2) {
                try {
                    Log.d("HGHG", (612 - this.pageNumber) + "");
                    QuranJuzs paraByPages2 = DatabaseAccessor.getParaByPages("/" + (612 - this.pageNumber) + "/");
                    str2 = (getResources().getString(R.string.mypara) + Utils.getBanglaNumber(paraByPages2.getId()) + "\n") + paraByPages2.getPara_name() + " [ " + paraByPages2.getPara_name_ar() + " ]\n";
                } catch (NullPointerException unused2) {
                }
            }
            tvTitle.setText(str2 + getResources().getString(R.string.sura) + " " + DatabaseAccessor.getSuraByIdHafezi(str).getSuraName().trim() + "; " + getResources().getString(R.string.page) + Utils.getBanglaNumber(611 - this.pageNumber));
        }
        Handler handler = myHandler;
        if (handler != null) {
            handler.removeCallbacks(myRunnable);
        }
        tvTitle.setVisibility(0);
        myRunnable = new Runnable() { // from class: com.muslim.hafizi.HafiziActivity11.13
            @Override // java.lang.Runnable
            public void run() {
                HafiziActivity11.tvTitle.setVisibility(8);
            }
        };
        Handler handler2 = new Handler();
        myHandler = handler2;
        handler2.postDelayed(myRunnable, 2000L);
    }

    public void loadParaViewFragment(String str) {
        if (this.mDrawerLayout.isDrawerOpen(this.leftDrawer)) {
            this.mDrawerLayout.closeDrawer(this.leftDrawer);
        }
        this.pageNumber = Integer.parseInt(DatabaseAccessor.getParaById(str).getStartPage());
        Log.d("HGHG", this.pageNumber + "");
        QuranJuzs paraById = DatabaseAccessor.getParaById(str);
        String str2 = (getResources().getString(R.string.mypara) + Utils.getBanglaNumber(str) + "\n") + paraById.getPara_name() + " [ " + paraById.getPara_name_ar() + " ]\n";
        if (getResources().getConfiguration().orientation == 2) {
            this.recyclerViewVertical.getLayoutManager().scrollToPosition(Integer.parseInt(DatabaseAccessor.getParaById(str).getStartPage()) - 2);
        } else {
            this.recyclerViewHorizontal.getLayoutManager().scrollToPosition(611 - Integer.parseInt(DatabaseAccessor.getParaById(str).getStartPage()));
        }
        TextView textView = tvTitle;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(getResources().getString(R.string.sura));
        sb.append(" ");
        sb.append(DatabaseAccessor.getSuraByPages("/" + (612 - this.pageNumber) + "/").getSuraName().trim());
        sb.append("; ");
        sb.append(getResources().getString(R.string.page));
        sb.append(Utils.getBanglaNumber(this.pageNumber + (-1)));
        textView.setText(sb.toString());
        Handler handler = myHandler;
        if (handler != null) {
            handler.removeCallbacks(myRunnable);
        }
        tvTitle.setVisibility(0);
        myRunnable = new Runnable() { // from class: com.muslim.hafizi.HafiziActivity11.14
            @Override // java.lang.Runnable
            public void run() {
                HafiziActivity11.tvTitle.setVisibility(8);
            }
        };
        Handler handler2 = new Handler();
        myHandler = handler2;
        handler2.postDelayed(myRunnable, 1500L);
    }

    private void rightDrawer() {
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
        this.relativeLayoutHafezi.setBackgroundResource(R.color.detailsbutton);
        findViewById(R.id.ivHafezi).setBackgroundResource(R.mipmap.ic_hafezi_selected);
        ((TextView) findViewById(R.id.tvHafezi)).setTextColor(-1);
        this.relativeLayoutHome.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziActivity11.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HafiziActivity11.this.mDrawerLayoutRight.isDrawerOpen(HafiziActivity11.this.rightDrawer)) {
                    HafiziActivity11.this.mDrawerLayoutRight.closeDrawer(HafiziActivity11.this.rightDrawer);
                }
                HafiziActivity11.this.finish();
            }
        });
        this.relativeLayoutSuraBookmark.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziActivity11.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HafiziActivity11.this.mDrawerLayoutRight.isDrawerOpen(HafiziActivity11.this.rightDrawer)) {
                    HafiziActivity11.this.mDrawerLayoutRight.closeDrawer(HafiziActivity11.this.rightDrawer);
                }
                String str = "";
                for (int i = 1; i < 115; i++) {
                    if (Utils.getString(HafiziActivity11.activity, "bookmark_remove" + i).equals("" + i)) {
                        if (str.equals("")) {
                            str = " where id = '" + (115 - i) + "' ";
                        }
                        str = str + " or id ='" + (115 - i) + "'";
                    }
                }
                if (str.equals("")) {
                    Toast.makeText(HafiziActivity11.this.getApplicationContext(), "No sura added to FAVOURITE list", 0).show();
                    return;
                }
                HafiziActivity11.this.finish();
                HafiziActivity11.this.startActivity(new Intent(HafiziActivity11.activity, SuraBookmarkActivity.class));
            }
        });
        this.relativeLayoutAyatBookmark.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziActivity11.17
            public String bookmark;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HafiziActivity11.this.mDrawerLayoutRight.isDrawerOpen(HafiziActivity11.this.rightDrawer)) {
                    HafiziActivity11.this.mDrawerLayoutRight.closeDrawer(HafiziActivity11.this.rightDrawer);
                }
                String str = "";
                int i = 1;
                while (i <= 6236) {
                    String string = Utils.getString(HafiziActivity11.activity, "bookmark_verse" + i);
                    this.bookmark = string;
                    Log.d("COW", string);
                    if (this.bookmark.equals("" + i)) {
                        str = str + "1";
                        i = 6237;
                    }
                    i++;
                }
                if (str.equals("")) {
                    Toast.makeText(HafiziActivity11.this.getApplicationContext(), "No verses added to FAVOURITE list", 0).show();
                    return;
                }
                HafiziActivity11.this.finish();
                HafiziActivity11.this.startActivity(new Intent(HafiziActivity11.activity, VersesBookmarkActivity.class));
            }
        });
        this.relativeLayoutSearch.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziActivity11.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HafiziActivity11.this.mDrawerLayoutRight.isDrawerOpen(HafiziActivity11.this.rightDrawer)) {
                    HafiziActivity11.this.mDrawerLayoutRight.closeDrawer(HafiziActivity11.this.rightDrawer);
                }
                HafiziActivity11.this.finish();
                HafiziActivity11.this.startActivity(new Intent(HafiziActivity11.activity, SearchQuranActivity.class));
            }
        });
        this.relativeLayoutHafezi.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziActivity11.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HafiziActivity11.this.mDrawerLayoutRight.isDrawerOpen(HafiziActivity11.this.rightDrawer)) {
                    HafiziActivity11.this.mDrawerLayoutRight.closeDrawer(HafiziActivity11.this.rightDrawer);
                }
            }
        });
        this.relativeLayoutSettings.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziActivity11.20
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HafiziActivity11.this.mDrawerLayoutRight.isDrawerOpen(HafiziActivity11.this.rightDrawer)) {
                    HafiziActivity11.this.mDrawerLayoutRight.closeDrawer(HafiziActivity11.this.rightDrawer);
                }
                HafiziActivity11.this.finish();
                HafiziActivity11.this.startActivity(new Intent(HafiziActivity11.activity, SettingsActivity.class));
            }
        });
        this.relativeLayoutReadMe.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.hafizi.HafiziActivity11.21
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HafiziActivity11.this.mDrawerLayoutRight.isDrawerOpen(HafiziActivity11.this.rightDrawer)) {
                    HafiziActivity11.this.mDrawerLayoutRight.closeDrawer(HafiziActivity11.this.rightDrawer);
                }
            }
        });
    }
}
