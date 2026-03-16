package com.muslim.Search;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.muslim.Bookmark.Sura.SuraBookmarkActivity;
import com.muslim.Bookmark.Verses.VersesBookmarkActivity;
import com.muslim.Search.model.SearchQuranDetails;
import com.muslim.Settings.SettingsActivity;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.R;
import java.util.ArrayList;

public class SearchQuranActivity extends AppCompatActivity {
    public static ImageView ivDrawerRight;
    protected static ListView listView;
    static SearchQuranActivity mainActivity;
    protected static int new_top;
    private SearchDetailsListAdapter adapter;
    private Dialog dialog;
    public ImageView ivSearch;
    private DrawerLayout mDrawerLayoutRight;
    private ArrayList<String> mSelections;
    private TextView mTitle;
    private String query = "";
    private ArrayList<SearchQuranDetails> quranSuras;
    private RelativeLayout relativeLayoutAyatBookmark;
    private RelativeLayout relativeLayoutHafezi;
    private RelativeLayout relativeLayoutHome;
    private RelativeLayout relativeLayoutReadMe;
    private RelativeLayout relativeLayoutSearch;
    private RelativeLayout relativeLayoutSettings;
    private RelativeLayout relativeLayoutSuraBookmark;
    private LinearLayout rightDrawer;
    private Toolbar toolbar;
    private TextView tvEmpty;

    public static SearchQuranActivity getInstance() {
        return mainActivity;
    }

    public static Context getContext() {
        return getContext();
    }

    
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.activity_search);
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
        this.mDrawerLayoutRight = (DrawerLayout) findViewById(R.id.drawer_layout_right);
        this.rightDrawer = (LinearLayout) findViewById(R.id.right_drawer);
        this.mDrawerLayoutRight.setDrawerLockMode(1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        this.toolbar = toolbar;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        TextView textView = (TextView) this.toolbar.findViewById(R.id.toolbar_title);
        this.mTitle = textView;
        Utils.setMyBanglaText(textView, getResources().getString(R.string.search));
        ivDrawerRight = (ImageView) this.toolbar.findViewById(R.id.ivDrawerRight);
        this.ivSearch = (ImageView) this.toolbar.findViewById(R.id.ivSearchNow);
        ivDrawerRight.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Search.SearchQuranActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SearchQuranActivity.this.mDrawerLayoutRight.isDrawerOpen(SearchQuranActivity.this.rightDrawer)) {
                    SearchQuranActivity.this.mDrawerLayoutRight.closeDrawer(SearchQuranActivity.this.rightDrawer);
                } else {
                    SearchQuranActivity.this.mDrawerLayoutRight.openDrawer(SearchQuranActivity.this.rightDrawer);
                }
            }
        });
        this.ivSearch.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Search.SearchQuranActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SearchQuranActivity.this.dialog != null && SearchQuranActivity.this.dialog.isShowing()) {
                    SearchQuranActivity.this.dialog.dismiss();
                }
                SearchQuranActivity.this.dialogAdvancedSearch();
            }
        });
        listView = (ListView) findViewById(R.id.listView);
        this.tvEmpty = (TextView) findViewById(R.id.tvEmpty);
        listView.setFastScrollEnabled(true);
        if (Utils.getString(mainActivity, Constants.KEY_TRANSLITERATION_MOOD).equals(Constants.TRANSLITERATION_MOOD_ON)) {
            this.quranSuras = DatabaseAccessor.getAllVersesForSearch("", Utils.getString(mainActivity, Constants.KEY_TRANSLATOR), true);
        } else {
            this.quranSuras = DatabaseAccessor.getAllVersesForSearch("", Utils.getString(mainActivity, Constants.KEY_TRANSLATOR), false);
        }
        this.mSelections = Utils.getSelections(this.quranSuras.size());
        SearchDetailsListAdapter searchDetailsListAdapter = new SearchDetailsListAdapter(mainActivity, this.quranSuras, this.mSelections, "");
        this.adapter = searchDetailsListAdapter;
        listView.setAdapter((ListAdapter) searchDetailsListAdapter);
        this.adapter.notifyDataSetChanged();
        clickRightDrawer();
        Utils.setRightDrawerText(mainActivity, this.mDrawerLayoutRight, this.rightDrawer, false);
    }

    
    public void dialogAdvancedSearch() {
        if (this.mDrawerLayoutRight.isDrawerOpen(this.rightDrawer)) {
            this.mDrawerLayoutRight.closeDrawer(this.rightDrawer);
        }
        Dialog dialog = new Dialog(this);
        this.dialog = dialog;
        dialog.requestWindowFeature(1);
        this.dialog.setContentView(R.layout.dialog_layout_search);
        this.dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.dialog.setCancelable(false);
        Utils.setMyBanglaText((TextView) this.dialog.findViewById(R.id.tvChangeTranslator), getResources().getString(R.string.search));
        final EditText editText = (EditText) this.dialog.findViewById(R.id.etSearch);
        if (!this.mTitle.getText().toString().equals(getResources().getString(R.string.search)) && !this.mTitle.getText().toString().trim().isEmpty()) {
            editText.setText(this.mTitle.getText().toString().split(" ()")[0]);
        }
        ((ImageView) this.dialog.findViewById(R.id.iv_close)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Search.SearchQuranActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SearchQuranActivity.this.dialog.dismiss();
            }
        });
        ((Button) this.dialog.findViewById(R.id.buttonSearch)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Search.SearchQuranActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SearchQuranActivity.this.dialog.dismiss();
                SearchQuranActivity.this.query = editText.getText().toString().trim().replace("'", "");
                new SearchQuran().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            }
        });
        this.dialog.show();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            backStack();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    private void backStack() {
        if (this.mDrawerLayoutRight.isDrawerOpen(this.rightDrawer)) {
            this.mDrawerLayoutRight.closeDrawer(this.rightDrawer);
        } else if (!this.mTitle.getText().toString().equals(getResources().getString(R.string.search))) {
            this.query = "";
            ArrayList<SearchQuranDetails> allVersesForSearch = DatabaseAccessor.getAllVersesForSearch("", Utils.getString(mainActivity, Constants.KEY_TRANSLATOR), true);
            this.quranSuras = allVersesForSearch;
            this.mSelections = Utils.getSelections(allVersesForSearch.size());
            if (Utils.getString(mainActivity, Constants.KEY_TRANSLITERATION_MOOD).equals(Constants.TRANSLITERATION_MOOD_ON)) {
                SearchQuranActivity searchQuranActivity = mainActivity;
                this.adapter = new SearchDetailsListAdapter(searchQuranActivity, DatabaseAccessor.getAllVersesForSearch(this.query, Utils.getString(searchQuranActivity, Constants.KEY_TRANSLATOR), true), this.mSelections, this.query);
            } else {
                SearchQuranActivity searchQuranActivity2 = mainActivity;
                this.adapter = new SearchDetailsListAdapter(searchQuranActivity2, DatabaseAccessor.getAllVersesForSearch(this.query, Utils.getString(searchQuranActivity2, Constants.KEY_TRANSLATOR), false), this.mSelections, this.query);
            }
            listView.setAdapter((ListAdapter) this.adapter);
            this.adapter.notifyDataSetChanged();
            this.tvEmpty.setVisibility(8);
            listView.setVisibility(0);
            Utils.setMyBanglaText(this.mTitle, getResources().getString(R.string.search));
        } else {
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.mDrawerLayoutRight.isDrawerOpen(this.rightDrawer)) {
            this.mDrawerLayoutRight.closeDrawer(this.rightDrawer);
        } else {
            finish();
        }
    }

    private void clickRightDrawer() {
        this.relativeLayoutHome = (RelativeLayout) findViewById(R.id.relativeLayoutHome);
        this.relativeLayoutSuraBookmark = (RelativeLayout) findViewById(R.id.relativeLayoutSuraBookmark);
        this.relativeLayoutAyatBookmark = (RelativeLayout) findViewById(R.id.relativeLayoutAyatBookmark);
        this.relativeLayoutSearch = (RelativeLayout) findViewById(R.id.relativeLayoutSearch);
        this.relativeLayoutHafezi = (RelativeLayout) findViewById(R.id.relativeLayoutHafezi);
        this.relativeLayoutSettings = (RelativeLayout) findViewById(R.id.relativeLayoutSettings);
        this.relativeLayoutReadMe = (RelativeLayout) findViewById(R.id.relativeLayoutReadMe);
        this.relativeLayoutSearch.setBackgroundResource(R.color.detailsbutton);
        findViewById(R.id.ivSearch).setBackgroundResource(R.mipmap.ic_search_selected);
        ((TextView) findViewById(R.id.tvSearch)).setTextColor(-1);
        this.relativeLayoutHome.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Search.SearchQuranActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SearchQuranActivity.this.mDrawerLayoutRight.isDrawerOpen(SearchQuranActivity.this.rightDrawer)) {
                    SearchQuranActivity.this.mDrawerLayoutRight.closeDrawer(SearchQuranActivity.this.rightDrawer);
                }
                SearchQuranActivity.this.finish();
            }
        });
        this.relativeLayoutSuraBookmark.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Search.SearchQuranActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SearchQuranActivity.this.mDrawerLayoutRight.isDrawerOpen(SearchQuranActivity.this.rightDrawer)) {
                    SearchQuranActivity.this.mDrawerLayoutRight.closeDrawer(SearchQuranActivity.this.rightDrawer);
                }
                String str = "";
                for (int i = 1; i < 115; i++) {
                    if (Utils.getString(SearchQuranActivity.this, "bookmark_remove" + i).equals("" + i)) {
                        if (str.equals("")) {
                            str = " where id = '" + (115 - i) + "' ";
                        }
                        str = str + " or id ='" + (115 - i) + "'";
                    }
                }
                if (str.equals("")) {
                    Toast.makeText(SearchQuranActivity.this.getApplicationContext(), "No sura added to FAVOURITE list", 0).show();
                    return;
                }
                SearchQuranActivity.this.finish();
                SearchQuranActivity.this.startActivity(new Intent(SearchQuranActivity.this, SuraBookmarkActivity.class));
            }
        });
        this.relativeLayoutAyatBookmark.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Search.SearchQuranActivity.7
            public String bookmark;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SearchQuranActivity.this.mDrawerLayoutRight.isDrawerOpen(SearchQuranActivity.this.rightDrawer)) {
                    SearchQuranActivity.this.mDrawerLayoutRight.closeDrawer(SearchQuranActivity.this.rightDrawer);
                }
                String str = "";
                int i = 1;
                while (i <= 6236) {
                    String string = Utils.getString(SearchQuranActivity.this, "bookmark_verse" + i);
                    this.bookmark = string;
                    Log.d("COW", string);
                    if (this.bookmark.equals("" + i)) {
                        str = str + "1";
                        i = 6237;
                    }
                    i++;
                }
                if (str.equals("")) {
                    Toast.makeText(SearchQuranActivity.this.getApplicationContext(), SearchQuranActivity.this.getResources().getString(R.string.no_verses_added), 0).show();
                    return;
                }
                SearchQuranActivity.this.finish();
                SearchQuranActivity.this.startActivity(new Intent(SearchQuranActivity.this, VersesBookmarkActivity.class));
            }
        });
        this.relativeLayoutSearch.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Search.SearchQuranActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SearchQuranActivity.this.mDrawerLayoutRight.isDrawerOpen(SearchQuranActivity.this.rightDrawer)) {
                    SearchQuranActivity.this.mDrawerLayoutRight.closeDrawer(SearchQuranActivity.this.rightDrawer);
                }
            }
        });
        this.relativeLayoutSettings.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Search.SearchQuranActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SearchQuranActivity.this.mDrawerLayoutRight.isDrawerOpen(SearchQuranActivity.this.rightDrawer)) {
                    SearchQuranActivity.this.mDrawerLayoutRight.closeDrawer(SearchQuranActivity.this.rightDrawer);
                }
                SearchQuranActivity.this.finish();
                SearchQuranActivity.this.startActivity(new Intent(SearchQuranActivity.this, SettingsActivity.class));
            }
        });
        this.relativeLayoutReadMe.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Search.SearchQuranActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SearchQuranActivity.this.mDrawerLayoutRight.isDrawerOpen(SearchQuranActivity.this.rightDrawer)) {
                    SearchQuranActivity.this.mDrawerLayoutRight.closeDrawer(SearchQuranActivity.this.rightDrawer);
                }
            }
        });
    }

    
    public class SearchQuran extends AsyncTask<String, Integer, Long> {
        ProgressDialog mProgressDialog;

        public SearchQuran() {
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(SearchQuranActivity.this);
            this.mProgressDialog = progressDialog;
            progressDialog.setMessage("Searching....");
            this.mProgressDialog.show();
        }

        
        @Override // android.os.AsyncTask
        public Long doInBackground(String... strArr) {
            SearchQuranActivity searchQuranActivity = SearchQuranActivity.this;
            searchQuranActivity.quranSuras = DatabaseAccessor.getAllVersesForSearch(searchQuranActivity.query, Utils.getString(SearchQuranActivity.mainActivity, Constants.KEY_TRANSLATOR), true);
            SearchQuranActivity searchQuranActivity2 = SearchQuranActivity.this;
            searchQuranActivity2.mSelections = Utils.getSelections(searchQuranActivity2.quranSuras.size());
            if (Utils.getString(SearchQuranActivity.mainActivity, Constants.KEY_TRANSLITERATION_MOOD).equals(Constants.TRANSLITERATION_MOOD_ON)) {
                SearchQuranActivity.this.adapter = new SearchDetailsListAdapter(SearchQuranActivity.mainActivity, DatabaseAccessor.getAllVersesForSearch(SearchQuranActivity.this.query, Utils.getString(SearchQuranActivity.mainActivity, Constants.KEY_TRANSLATOR), true), SearchQuranActivity.this.mSelections, SearchQuranActivity.this.query);
                return null;
            }
            SearchQuranActivity.this.adapter = new SearchDetailsListAdapter(SearchQuranActivity.mainActivity, DatabaseAccessor.getAllVersesForSearch(SearchQuranActivity.this.query, Utils.getString(SearchQuranActivity.mainActivity, Constants.KEY_TRANSLATOR), false), SearchQuranActivity.this.mSelections, SearchQuranActivity.this.query);
            return null;
        }

        
        @Override // android.os.AsyncTask
        public void onPostExecute(Long l) {
            super.onPostExecute((SearchQuran) l);
            this.mProgressDialog.dismiss();
            SearchQuranActivity.listView.setAdapter((ListAdapter) SearchQuranActivity.this.adapter);
            SearchQuranActivity.this.adapter.notifyDataSetChanged();
            if (SearchQuranActivity.this.quranSuras.size() != 0) {
                SearchQuranActivity.this.tvEmpty.setVisibility(8);
                SearchQuranActivity.listView.setVisibility(0);
            } else {
                SearchQuranActivity.listView.setVisibility(8);
                SearchQuranActivity.this.tvEmpty.setVisibility(0);
            }
            if (SearchQuranActivity.this.query.isEmpty()) {
                Utils.setMyBanglaText(SearchQuranActivity.this.mTitle, SearchQuranActivity.this.getResources().getString(R.string.search));
                return;
            }
            TextView textView = SearchQuranActivity.this.mTitle;
            Utils.setMyBanglaTextHtml(textView, "<small><font color='#ffffdf'>" + SearchQuranActivity.this.query + " (" + SearchQuranActivity.this.quranSuras.size() + " " + SearchQuranActivity.this.getResources().getString(R.string.ayat) + ")</font></small>");
        }
    }
}
