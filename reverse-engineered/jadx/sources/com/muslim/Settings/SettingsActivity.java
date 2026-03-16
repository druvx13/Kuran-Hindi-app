package com.muslim.Settings;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import com.muslim.Bookmark.Sura.SuraBookmarkActivity;
import com.muslim.Bookmark.Verses.VersesBookmarkActivity;
import com.muslim.Search.SearchQuranActivity;
import com.muslim.necessary.db.DatabaseAccessor;
import com.muslim.necessary.utils.ArabicFarsiUrduGlyphUtils;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
import com.muslim.quran_hindi.DetailsListAdapter;
import com.muslim.quran_hindi.R;
import com.muslim.quran_hindi.model.QuranDetails;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class SettingsActivity extends AppCompatActivity {
    private static Dialog dialog;
    public static ImageView ivDrawerRight;
    private Activity activity;
    private AlertDialog alertDialog;
    private Button arIndoPak;
    private Button arSimple;
    private Button arUthmanic;
    private CheckBox ckLastRead;
    private CheckBox ckTransliteration;
    private LinearLayout layout_arabic_font;
    private LinearLayout layout_bangla_translator;
    private LinearLayout layout_last_read;
    private LinearLayout layout_receiter;
    private LinearLayout layout_receiter_full;
    private LinearLayout layout_style;
    private LinearLayout layout_transliteration;
    private LinearLayout linLout;
    private LinearLayout linear_bn_font;
    private LinearLayout linear_bn_translator;
    private LinearLayout listLinear;
    private MyDrawerLayout mDrawerLayoutRight;
    private TextView mTitle;
    private RadioButton rbMeQuran;
    private RadioButton rbNoorEHidayat;
    private RadioButton rbNoorEHira;
    private RadioButton rbNoorEHuda;
    private RadioButton rbQalamMajeed;
    private RadioButton rbUthmanic;
    private RelativeLayout relNumber;
    private RelativeLayout relativeLayoutAyatBookmark;
    private RelativeLayout relativeLayoutHafezi;
    private RelativeLayout relativeLayoutHome;
    private RelativeLayout relativeLayoutReadMe;
    private RelativeLayout relativeLayoutSearch;
    private RelativeLayout relativeLayoutSettings;
    private RelativeLayout relativeLayoutSuraBookmark;
    private RelativeLayout relative_bn_font_size;
    private RadioGroup rgArab;
    private RadioGroup rgIndoPak;
    private LinearLayout rightDrawer;
    private SeekBar seekBar_ar;
    private SeekBar seekBar_bn;
    private SwitchCompat tg1;
    private SwitchCompat tgStyle;
    private Toolbar toolbar;
    private TextView tvTransliteration;
    private TextView tvUccharon;
    private TextView tv_arabic_font_name;
    private TextView tv_bangla_translator;
    private TextView tv_indo_translation;
    private TextView tv_receiter_name;
    private TextView tv_verses_ar;
    private TextView tv_verses_ar_r;
    private TextView tv_verses_meaning;
    private TextView txtVerse;

    private static void stopPlaying() {
        try {
            if (DetailsListAdapter.mp != null) {
                DetailsListAdapter.mp.stop();
                DetailsListAdapter.mp.release();
                DetailsListAdapter.mp = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.activity = this;
        getWindow().addFlags(128);
        setContentView(R.layout.activity_settings);
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
        initializeVariables();
        toolbar();
        audioNameArabic();
        fontNameArabic();
        Log.d("FONT", Utils.getString(this, Constants.KEY_ARABIC_FONT));
        Utils.setArabicTypeface(this, this.tv_verses_ar);
        Utils.setArabicTypeface(this, this.tv_verses_ar_r);
        settext();
        Utils.setBanglaText(this, this.tv_verses_meaning, DatabaseAccessor.getAllVersesBySuraId("114", "").get(0).getContent().trim());
        if (Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_PROGRESS) == -1) {
            if (Utils.getWidth(this) >= 720.0f) {
                this.seekBar_ar.setProgress(26);
            } else if (Utils.getWidth(this) >= 600.0f) {
                this.seekBar_ar.setProgress(24);
            } else if (Utils.getWidth(this) >= 400.0f) {
                this.seekBar_ar.setProgress(22);
            } else {
                this.seekBar_ar.setProgress(20);
            }
        } else {
            this.seekBar_ar.setProgress(Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_PROGRESS));
        }
        if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_AL_MUSHAF) || Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HUDA)) {
            TextView textView = this.tv_verses_ar;
            double myInt = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt);
            textView.setTextSize((float) Math.round(myInt * 1.25d));
            TextView textView2 = this.tv_verses_ar_r;
            double myInt2 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt2);
            textView2.setTextSize((float) Math.round(myInt2 * 1.25d));
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIRA)) {
            TextView textView3 = this.tv_verses_ar;
            double myInt3 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt3);
            textView3.setTextSize((float) Math.round(myInt3 * 1.12d));
            TextView textView4 = this.tv_verses_ar_r;
            double myInt4 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt4);
            textView4.setTextSize((float) Math.round(myInt4 * 1.12d));
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_ME_QURAN)) {
            TextView textView5 = this.tv_verses_ar;
            double myInt5 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt5);
            textView5.setTextSize((float) Math.round(myInt5 * 0.933333d));
            TextView textView6 = this.tv_verses_ar_r;
            double myInt6 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt6);
            textView6.setTextSize((float) Math.round(myInt6 * 0.933333d));
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIDAYAT)) {
            TextView textView7 = this.tv_verses_ar;
            double myInt7 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt7);
            textView7.setTextSize((float) Math.round(myInt7 * 0.9d));
            TextView textView8 = this.tv_verses_ar_r;
            double myInt8 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt8);
            textView8.setTextSize((float) Math.round(myInt8 * 0.9d));
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DROID_NASKH)) {
            TextView textView9 = this.tv_verses_ar;
            double myInt9 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt9);
            textView9.setTextSize((float) Math.round(myInt9 * 0.7333333d));
            TextView textView10 = this.tv_verses_ar_r;
            double myInt10 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt10);
            textView10.setTextSize((float) Math.round(myInt10 * 0.7333333d));
        } else {
            this.tv_verses_ar.setTextSize(Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE));
            this.tv_verses_ar_r.setTextSize(Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE));
        }
        if (Utils.getMyInt(this, Constants.KEY_INDO_FONT_PROGRESS) == -1) {
            if (Utils.getWidth(this) >= 720.0f) {
                this.seekBar_bn.setProgress(10);
            } else if (Utils.getWidth(this) >= 600.0f) {
                this.seekBar_bn.setProgress(9);
            } else if (Utils.getWidth(this) >= 400.0f) {
                this.seekBar_bn.setProgress(8);
            } else {
                this.seekBar_bn.setProgress(7);
            }
        } else {
            this.seekBar_bn.setProgress(Utils.getMyInt(this, Constants.KEY_INDO_FONT_PROGRESS));
            this.tv_verses_meaning.setTextSize(Utils.getMyInt(this, Constants.KEY_BANGLA_FONT_SIZE));
            TextView textView11 = this.tvTransliteration;
            double myInt11 = Utils.getMyInt(this, Constants.KEY_BANGLA_FONT_SIZE);
            Double.isNaN(myInt11);
            textView11.setTextSize((float) Math.round(myInt11 * 0.88d));
        }
        this.seekBar_ar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.muslim.Settings.SettingsActivity.1
            int progress = 0;

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                this.progress = i + 10;
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(SettingsActivity.this.getApplicationContext()).edit();
                edit.remove(Constants.KEY_ARABIC_FONT_PROGRESS).remove(Constants.KEY_ARABIC_FONT_SIZE);
                edit.commit();
                Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_PROGRESS, seekBar.getProgress());
                Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SIZE, this.progress);
                Log.d("PPPPPPP", Utils.getMyInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_PROGRESS) + "  " + Utils.getMyInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SIZE));
                if (Utils.getString(SettingsActivity.this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_AL_MUSHAF) || Utils.getString(SettingsActivity.this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HUDA)) {
                    TextView textView12 = SettingsActivity.this.tv_verses_ar;
                    double myInt12 = Utils.getMyInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SIZE);
                    Double.isNaN(myInt12);
                    textView12.setTextSize((float) Math.round(myInt12 * 1.25d));
                    TextView textView13 = SettingsActivity.this.tv_verses_ar_r;
                    double myInt13 = Utils.getMyInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SIZE);
                    Double.isNaN(myInt13);
                    textView13.setTextSize((float) Math.round(myInt13 * 1.25d));
                } else if (Utils.getString(SettingsActivity.this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIRA)) {
                    TextView textView14 = SettingsActivity.this.tv_verses_ar;
                    double myInt14 = Utils.getMyInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SIZE);
                    Double.isNaN(myInt14);
                    textView14.setTextSize((float) Math.round(myInt14 * 1.12d));
                    TextView textView15 = SettingsActivity.this.tv_verses_ar_r;
                    double myInt15 = Utils.getMyInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SIZE);
                    Double.isNaN(myInt15);
                    textView15.setTextSize((float) Math.round(myInt15 * 1.12d));
                } else if (Utils.getString(SettingsActivity.this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_ME_QURAN)) {
                    TextView textView16 = SettingsActivity.this.tv_verses_ar;
                    double myInt16 = Utils.getMyInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SIZE);
                    Double.isNaN(myInt16);
                    textView16.setTextSize((float) Math.round(myInt16 * 0.933333d));
                    TextView textView17 = SettingsActivity.this.tv_verses_ar_r;
                    double myInt17 = Utils.getMyInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SIZE);
                    Double.isNaN(myInt17);
                    textView17.setTextSize((float) Math.round(myInt17 * 0.933333d));
                } else if (Utils.getString(SettingsActivity.this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIDAYAT)) {
                    TextView textView18 = SettingsActivity.this.tv_verses_ar;
                    double myInt18 = Utils.getMyInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SIZE);
                    Double.isNaN(myInt18);
                    textView18.setTextSize((float) Math.round(myInt18 * 0.9d));
                    TextView textView19 = SettingsActivity.this.tv_verses_ar_r;
                    double myInt19 = Utils.getMyInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SIZE);
                    Double.isNaN(myInt19);
                    textView19.setTextSize((float) Math.round(myInt19 * 0.9d));
                } else if (Utils.getString(SettingsActivity.this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DROID_NASKH)) {
                    TextView textView20 = SettingsActivity.this.tv_verses_ar;
                    double myInt20 = Utils.getMyInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SIZE);
                    Double.isNaN(myInt20);
                    textView20.setTextSize((float) Math.round(myInt20 * 0.7333333d));
                    TextView textView21 = SettingsActivity.this.tv_verses_ar_r;
                    double myInt21 = Utils.getMyInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SIZE);
                    Double.isNaN(myInt21);
                    textView21.setTextSize((float) Math.round(myInt21 * 0.7333333d));
                } else {
                    SettingsActivity.this.tv_verses_ar.setTextSize(Utils.getMyInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SIZE));
                    SettingsActivity.this.tv_verses_ar_r.setTextSize(Utils.getMyInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SIZE));
                }
            }
        });
        this.seekBar_bn.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.muslim.Settings.SettingsActivity.2
            int progress = 0;

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                this.progress = i + 10;
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(SettingsActivity.this.getApplicationContext()).edit();
                edit.remove(Constants.KEY_INDO_FONT_PROGRESS).remove(Constants.KEY_BANGLA_FONT_SIZE);
                edit.commit();
                Utils.putInt(SettingsActivity.this, Constants.KEY_INDO_FONT_PROGRESS, seekBar.getProgress());
                Utils.putInt(SettingsActivity.this, Constants.KEY_BANGLA_FONT_SIZE, this.progress);
                SettingsActivity.this.tv_verses_meaning.setTextSize(this.progress);
                TextView textView12 = SettingsActivity.this.tvTransliteration;
                double d = this.progress;
                Double.isNaN(d);
                textView12.setTextSize((float) Math.round(d * 0.88d));
            }
        });
        clickRightDrawer();
        isFromSuraDetails();
    }

    private void isFromSuraDetails() {
        if (Constants.FROM_SURA_DETAILS) {
            Constants.FROM_SURA_DETAILS = false;
            ivDrawerRight.setVisibility(8);
            this.mDrawerLayoutRight.setDrawerLockMode(1);
            findViewById(R.id.linear_layout_reading_mode).setVisibility(8);
            Constants.IS_FROM_SETTINGS = true;
        }
    }

    private void settext() {
        if (!Constants.isArabicFontSupported) {
            this.tv_verses_ar.setText(ArabicFarsiUrduGlyphUtils.formatToDisplay(DatabaseAccessor.getAllVersesBySuraId("114", "").get(0).getModified_content().trim()).trim());
            this.tv_verses_ar_r.setText(Html.fromHtml(ArabicFarsiUrduGlyphUtils.formatToDisplay(getReading().trim()).trim()), TextView.BufferType.SPANNABLE);
            return;
        }
        this.tv_verses_ar.setText(DatabaseAccessor.getAllVersesBySuraId("114", "").get(0).getModified_content().trim());
        this.tv_verses_ar_r.setText(Html.fromHtml(getReading().trim()), TextView.BufferType.SPANNABLE);
    }

    private void initializeVariables() {
        this.seekBar_ar = (SeekBar) findViewById(R.id.seekBar_ar);
        this.seekBar_bn = (SeekBar) findViewById(R.id.seekBar_bn);
        this.txtVerse = (TextView) findViewById(R.id.txtVerse);
        this.tv_verses_ar = (TextView) findViewById(R.id.tv_verses_ar);
        this.tv_verses_ar_r = (TextView) findViewById(R.id.tv_verses_ar_r);
        this.tv_verses_meaning = (TextView) findViewById(R.id.tv_verses_meaning);
        this.tg1 = (SwitchCompat) findViewById(R.id.tv_reading);
        this.ckTransliteration = (CheckBox) findViewById(R.id.ckTransliteration);
        this.ckLastRead = (CheckBox) findViewById(R.id.ckLastRead);
        this.tgStyle = (SwitchCompat) findViewById(R.id.tv_style);
        this.layout_style = (LinearLayout) findViewById(R.id.layout_style);
        this.layout_transliteration = (LinearLayout) findViewById(R.id.layout_transliteration);
        this.layout_last_read = (LinearLayout) findViewById(R.id.layout_last_read);
        this.listLinear = (LinearLayout) findViewById(R.id.listLinear);
        this.linLout = (LinearLayout) findViewById(R.id.linLout);
        this.linear_bn_font = (LinearLayout) findViewById(R.id.linear_bn_font);
        this.linear_bn_translator = (LinearLayout) findViewById(R.id.linear_bn_translator);
        this.layout_receiter_full = (LinearLayout) findViewById(R.id.layout_receiter_full);
        this.relative_bn_font_size = (RelativeLayout) findViewById(R.id.relative_bn_font_size);
        this.relNumber = (RelativeLayout) findViewById(R.id.relNumber);
        if (Utils.getString(this, Constants.KEY_READING_MOOD).equals(Constants.READING_MOOD_ON)) {
            this.tg1.setChecked(true);
            this.listLinear.setVisibility(8);
            this.linear_bn_translator.setVisibility(8);
            this.relative_bn_font_size.setVisibility(8);
            this.tv_verses_ar_r.setVisibility(0);
            this.layout_style.setVisibility(8);
            this.layout_transliteration.setVisibility(8);
            this.layout_last_read.setVisibility(8);
            this.layout_receiter_full.setVisibility(8);
        } else {
            this.tg1.setChecked(false);
            this.listLinear.setVisibility(0);
            this.linear_bn_translator.setVisibility(0);
            this.relative_bn_font_size.setVisibility(0);
            this.tv_verses_ar_r.setVisibility(8);
            this.layout_style.setVisibility(0);
            this.layout_transliteration.setVisibility(0);
            this.layout_last_read.setVisibility(0);
            this.layout_receiter_full.setVisibility(0);
        }
        TextView textView = (TextView) findViewById(R.id.tvUccharon);
        this.tvUccharon = textView;
        Utils.setMyBanglaText(textView, getResources().getString(R.string.pronunciation));
        TextView textView2 = (TextView) findViewById(R.id.tvTransliteration);
        this.tvTransliteration = textView2;
        textView2.setText(Html.fromHtml(DatabaseAccessor.getAllVersesBySuraId("114", "").get(0).getTrans().trim()), TextView.BufferType.SPANNABLE);
        this.tvTransliteration.setTypeface(null, 2);
        if (Utils.getString(this, Constants.KEY_TRANSLITERATION_MOOD).equals(Constants.TRANSLITERATION_MOOD_ON)) {
            this.tvTransliteration.setVisibility(0);
            this.ckTransliteration.setChecked(true);
        } else {
            this.tvTransliteration.setVisibility(8);
            this.ckTransliteration.setChecked(false);
        }
        if (Utils.getBoolean(this, Constants.IS_SAVED)) {
            this.ckLastRead.setChecked(true);
        } else {
            this.ckLastRead.setChecked(false);
        }
        this.ckTransliteration.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Utils.getString(SettingsActivity.this, Constants.KEY_TRANSLITERATION_MOOD).equals(Constants.TRANSLITERATION_MOOD_ON)) {
                    Utils.putString(SettingsActivity.this, Constants.KEY_TRANSLITERATION_MOOD, Constants.TRANSLITERATION_MOOD_OFF);
                    SettingsActivity.this.tvTransliteration.setVisibility(8);
                    SettingsActivity.this.ckTransliteration.setChecked(false);
                    return;
                }
                Utils.putString(SettingsActivity.this, Constants.KEY_TRANSLITERATION_MOOD, Constants.TRANSLITERATION_MOOD_ON);
                SettingsActivity.this.tvTransliteration.setVisibility(0);
                SettingsActivity.this.ckTransliteration.setChecked(true);
            }
        });
        this.layout_transliteration.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Utils.getString(SettingsActivity.this, Constants.KEY_TRANSLITERATION_MOOD).equals(Constants.TRANSLITERATION_MOOD_ON)) {
                    Utils.putString(SettingsActivity.this, Constants.KEY_TRANSLITERATION_MOOD, Constants.TRANSLITERATION_MOOD_OFF);
                    SettingsActivity.this.tvTransliteration.setVisibility(8);
                    SettingsActivity.this.ckTransliteration.setChecked(false);
                    return;
                }
                Utils.putString(SettingsActivity.this, Constants.KEY_TRANSLITERATION_MOOD, Constants.TRANSLITERATION_MOOD_ON);
                SettingsActivity.this.tvTransliteration.setVisibility(0);
                SettingsActivity.this.ckTransliteration.setChecked(true);
            }
        });
        this.layout_last_read.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Utils.getBoolean(SettingsActivity.this, Constants.IS_SAVED)) {
                    Utils.putBoolean(SettingsActivity.this, Constants.IS_SAVED, false);
                    SettingsActivity.this.ckLastRead.setChecked(false);
                    return;
                }
                Utils.putBoolean(SettingsActivity.this, Constants.IS_SAVED, true);
                SettingsActivity.this.ckLastRead.setChecked(true);
                Toast.makeText(SettingsActivity.this.getApplicationContext(), SettingsActivity.this.getResources().getString(R.string.last_read_toast), 1).show();
            }
        });
        this.ckLastRead.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Utils.getBoolean(SettingsActivity.this, Constants.IS_SAVED)) {
                    Utils.putBoolean(SettingsActivity.this, Constants.IS_SAVED, false);
                    SettingsActivity.this.ckLastRead.setChecked(false);
                    return;
                }
                Utils.putBoolean(SettingsActivity.this, Constants.IS_SAVED, true);
                SettingsActivity.this.ckLastRead.setChecked(true);
                Toast.makeText(SettingsActivity.this.getApplicationContext(), SettingsActivity.this.getResources().getString(R.string.last_read_toast), 1).show();
            }
        });
        if (Utils.getString(this, "normal").equals("")) {
            this.tgStyle.setChecked(true);
            this.relNumber.setBackgroundResource(R.color.red_light);
            this.linLout.setBackgroundResource(R.drawable.list_bg);
        } else {
            this.tgStyle.setChecked(false);
            this.relNumber.setBackgroundResource(17170443);
            this.linLout.setBackgroundResource(17170443);
        }
        this.tg1.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Utils.getString(SettingsActivity.this, Constants.KEY_READING_MOOD).equals(Constants.READING_MOOD_ON)) {
                    Utils.putString(SettingsActivity.this, Constants.KEY_READING_MOOD, Constants.READING_MOOD_OFF);
                    SettingsActivity.this.tg1.setChecked(false);
                    SettingsActivity.this.listLinear.setVisibility(0);
                    SettingsActivity.this.linear_bn_translator.setVisibility(0);
                    SettingsActivity.this.relative_bn_font_size.setVisibility(0);
                    SettingsActivity.this.tv_verses_ar_r.setVisibility(8);
                    SettingsActivity.this.layout_style.setVisibility(0);
                    SettingsActivity.this.layout_transliteration.setVisibility(0);
                    SettingsActivity.this.layout_last_read.setVisibility(0);
                    SettingsActivity.this.layout_receiter_full.setVisibility(0);
                    return;
                }
                Utils.putString(SettingsActivity.this, Constants.KEY_READING_MOOD, Constants.READING_MOOD_ON);
                SettingsActivity.this.tg1.setChecked(true);
                SettingsActivity.this.listLinear.setVisibility(8);
                SettingsActivity.this.linear_bn_translator.setVisibility(8);
                SettingsActivity.this.relative_bn_font_size.setVisibility(8);
                SettingsActivity.this.tv_verses_ar_r.setVisibility(0);
                SettingsActivity.this.layout_style.setVisibility(8);
                SettingsActivity.this.layout_transliteration.setVisibility(8);
                SettingsActivity.this.layout_last_read.setVisibility(8);
                SettingsActivity.this.layout_receiter_full.setVisibility(8);
            }
        });
        this.tgStyle.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Utils.getString(SettingsActivity.this, "normal").equals("1")) {
                    Utils.putString(SettingsActivity.this, "normal", "");
                    SettingsActivity.this.tgStyle.setChecked(true);
                    SettingsActivity.this.relNumber.setBackgroundResource(R.color.red_light);
                    SettingsActivity.this.linLout.setBackgroundResource(R.drawable.list_bg);
                    return;
                }
                Utils.putString(SettingsActivity.this, "normal", "1");
                SettingsActivity.this.tgStyle.setChecked(false);
                SettingsActivity.this.relNumber.setBackgroundResource(17170443);
                SettingsActivity.this.linLout.setBackgroundResource(17170443);
            }
        });
        Utils.setMyBanglaText(this.txtVerse, "১");
        this.layout_bangla_translator = (LinearLayout) findViewById(R.id.layout_bangla_translator);
        this.tv_indo_translation = (TextView) findViewById(R.id.tv_bangla_transliteration);
        this.tv_bangla_translator = (TextView) findViewById(R.id.tv_bangla_translator);
        Utils.setMyBanglaText(this.tv_indo_translation, getResources().getString(R.string.translation));
        if (Utils.getString(this, Constants.KEY_TRANSLATOR).equals(Constants.TRANS_HINDI)) {
            Utils.setMyBanglaText(this.tv_bangla_translator, getResources().getString(R.string.trans1_text));
        } else if (Utils.getString(this, Constants.KEY_TRANSLATOR).equals(Constants.TRANS_FAROOQ)) {
            Utils.setMyBanglaText(this.tv_bangla_translator, getResources().getString(R.string.trans2_text));
        } else if (Utils.getString(this, Constants.KEY_TRANSLATOR).equals(Constants.TRANS_INTERNATIONAL)) {
            this.tv_bangla_translator.setTypeface(null);
            this.tv_bangla_translator.setText("Saheeh International *");
        }
        this.layout_bangla_translator.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SettingsActivity.this);
                builder.setTitle(SettingsActivity.this.getResources().getString(R.string.select_translation));
                builder.setSingleChoiceItems(new CharSequence[]{SettingsActivity.this.getResources().getString(R.string.trans1), SettingsActivity.this.getResources().getString(R.string.trans2), "Saheeh International *"}, Utils.getInt(SettingsActivity.this, Constants.KEY_BANGLA_TRANSLATOR_SELECTED), new DialogInterface.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.9.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(SettingsActivity.this.getApplicationContext()).edit();
                        edit.remove(Constants.KEY_BANGLA_TRANSLATOR_SELECTED);
                        edit.commit();
                        Utils.putInt(SettingsActivity.this, Constants.KEY_BANGLA_TRANSLATOR_SELECTED, i);
                        if (i == 0) {
                            Utils.putString(SettingsActivity.this, Constants.KEY_TRANSLATOR, Constants.TRANS_HINDI);
                            Utils.setMyBanglaText(SettingsActivity.this.tv_bangla_translator, SettingsActivity.this.getResources().getString(R.string.trans1_text));
                        } else if (i == 1) {
                            Utils.putString(SettingsActivity.this, Constants.KEY_TRANSLATOR, Constants.TRANS_FAROOQ);
                            Utils.setMyBanglaText(SettingsActivity.this.tv_bangla_translator, SettingsActivity.this.getResources().getString(R.string.trans2_text));
                        } else if (i == 2) {
                            Utils.putString(SettingsActivity.this, Constants.KEY_TRANSLATOR, Constants.TRANS_INTERNATIONAL);
                            SettingsActivity.this.tv_bangla_translator.setTypeface(null);
                            SettingsActivity.this.tv_bangla_translator.setText("Saheeh International *");
                        }
                        Utils.setBanglaText(SettingsActivity.this, SettingsActivity.this.tv_verses_meaning, DatabaseAccessor.getAllVersesBySuraId("114", "").get(0).getContent().trim());
                        dialogInterface.dismiss();
                    }
                });
                builder.create().show();
            }
        });
        this.layout_receiter = (LinearLayout) findViewById(R.id.layout_receiter);
        this.tv_receiter_name = (TextView) findViewById(R.id.tv_receiter_name);
        this.layout_receiter.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                final CharSequence[] charSequenceArr = {"Abdur-Rahman as-Sudais", "Saad Al-Ghamdi", "Mishari Rashid al-Afasy", "AbdulBaset AbdulSamad"};
                AlertDialog.Builder builder = new AlertDialog.Builder(SettingsActivity.this);
                builder.setTitle(SettingsActivity.this.getResources().getString(R.string.select_reciter));
                builder.setSingleChoiceItems(charSequenceArr, Utils.getInt(SettingsActivity.this, Constants.KEY_RECEITER_SELECTED), new DialogInterface.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.10.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(SettingsActivity.this.getApplicationContext()).edit();
                        edit.remove(Constants.KEY_RECEITER);
                        edit.commit();
                        Utils.putInt(SettingsActivity.this, Constants.KEY_RECEITER_SELECTED, i);
                        SettingsActivity.this.tv_receiter_name.setText(charSequenceArr[i]);
                        if (i == 0) {
                            Utils.putString(SettingsActivity.this, Constants.KEY_RECEITER, Constants.RECEITER_SUDAIS);
                        } else if (i == 1) {
                            Utils.putString(SettingsActivity.this, Constants.KEY_RECEITER, Constants.RECEITER_GHAMDI);
                        } else if (i == 2) {
                            Utils.putString(SettingsActivity.this, Constants.KEY_RECEITER, Constants.RECEITER_AL_AFASY);
                        } else if (i == 3) {
                            Utils.putString(SettingsActivity.this, Constants.KEY_RECEITER, Constants.RECEITER_ABDUL_BASET);
                        }
                        SettingsActivity.this.playAudio();
                        dialogInterface.dismiss();
                    }
                });
                builder.create().show();
            }
        });
        this.layout_arabic_font = (LinearLayout) findViewById(R.id.layout_arabic_font);
        this.tv_arabic_font_name = (TextView) findViewById(R.id.tv_arabic_font_name);
        this.layout_arabic_font.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CharSequence[] charSequenceArr;
                if (Build.VERSION.SDK_INT >= 18) {
                    if (SettingsActivity.this.alertDialog != null && SettingsActivity.this.alertDialog.isShowing()) {
                        SettingsActivity.this.alertDialog.dismiss();
                    }
                    SettingsActivity.this.selectArabicFontNew();
                    return;
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    charSequenceArr = new CharSequence[]{"MeQuran Font", "Al-Mushaf Font"};
                } else {
                    charSequenceArr = Build.VERSION.SDK_INT >= 14 ? new CharSequence[]{"Al-Mushaf Font", "DroidNaskh Font"} : new CharSequence[]{"DroidNaskh Font", "Al-Mushaf Font"};
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(SettingsActivity.this);
                builder.setTitle(SettingsActivity.this.getResources().getString(R.string.select_arabic_font));
                builder.setSingleChoiceItems(charSequenceArr, Utils.getInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED), new DialogInterface.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.11.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(SettingsActivity.this.getApplicationContext()).edit();
                        edit.remove(Constants.KEY_ARABIC_FONT);
                        edit.commit();
                        Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, i);
                        if (Build.VERSION.SDK_INT >= 17) {
                            if (i == 0) {
                                Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_ME_QURAN);
                                SettingsActivity.this.tv_arabic_font_name.setText("MeQuran Font");
                            } else if (i == 1) {
                                Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_AL_MUSHAF);
                                SettingsActivity.this.tv_arabic_font_name.setText("Al-Mushaf Font");
                            }
                        } else if (Build.VERSION.SDK_INT >= 14) {
                            if (i == 0) {
                                Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_AL_MUSHAF);
                                SettingsActivity.this.tv_arabic_font_name.setText("Al-Mushaf Font");
                            } else if (i == 1) {
                                Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_DROID_NASKH);
                                SettingsActivity.this.tv_arabic_font_name.setText("DroidNaskh Font");
                            }
                        } else if (i == 0) {
                            Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_DROID_NASKH);
                            SettingsActivity.this.tv_arabic_font_name.setText("DroidNaskh Font");
                        } else if (i == 1) {
                            Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_AL_MUSHAF);
                            SettingsActivity.this.tv_arabic_font_name.setText("Al-Mushaf Font");
                        }
                        dialogInterface.dismiss();
                        SettingsActivity.this.afterChangingFont();
                    }
                });
                builder.create().show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void afterChangingFont() {
        settext();
        if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_AL_MUSHAF) || Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HUDA)) {
            TextView textView = this.tv_verses_ar;
            double myInt = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt);
            textView.setTextSize((float) Math.round(myInt * 1.25d));
            TextView textView2 = this.tv_verses_ar_r;
            double myInt2 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt2);
            textView2.setTextSize((float) Math.round(myInt2 * 1.25d));
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIRA)) {
            TextView textView3 = this.tv_verses_ar;
            double myInt3 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt3);
            textView3.setTextSize((float) Math.round(myInt3 * 1.12d));
            TextView textView4 = this.tv_verses_ar_r;
            double myInt4 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt4);
            textView4.setTextSize((float) Math.round(myInt4 * 1.12d));
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_ME_QURAN)) {
            TextView textView5 = this.tv_verses_ar;
            double myInt5 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt5);
            textView5.setTextSize((float) Math.round(myInt5 * 0.933333d));
            TextView textView6 = this.tv_verses_ar_r;
            double myInt6 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt6);
            textView6.setTextSize((float) Math.round(myInt6 * 0.933333d));
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIDAYAT)) {
            TextView textView7 = this.tv_verses_ar;
            double myInt7 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt7);
            textView7.setTextSize((float) Math.round(myInt7 * 0.9d));
            TextView textView8 = this.tv_verses_ar_r;
            double myInt8 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt8);
            textView8.setTextSize((float) Math.round(myInt8 * 0.9d));
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DROID_NASKH)) {
            TextView textView9 = this.tv_verses_ar;
            double myInt9 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt9);
            textView9.setTextSize((float) Math.round(myInt9 * 0.7333333d));
            TextView textView10 = this.tv_verses_ar_r;
            double myInt10 = Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE);
            Double.isNaN(myInt10);
            textView10.setTextSize((float) Math.round(myInt10 * 0.7333333d));
        } else {
            this.tv_verses_ar.setTextSize(Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE));
            this.tv_verses_ar_r.setTextSize(Utils.getMyInt(this, Constants.KEY_ARABIC_FONT_SIZE));
        }
        if (!Constants.isArabicFontSupported) {
            this.tv_verses_ar_r.setText(Html.fromHtml(ArabicFarsiUrduGlyphUtils.formatToDisplay(getReading().trim()).trim()), TextView.BufferType.SPANNABLE);
        } else {
            this.tv_verses_ar_r.setText(Html.fromHtml(getReading().trim()), TextView.BufferType.SPANNABLE);
        }
        Utils.setArabicTypeface(this, this.tv_verses_ar);
        Utils.setArabicTypeface(this, this.tv_verses_ar_r);
    }

    private void toolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        this.toolbar = toolbar;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        TextView textView = (TextView) this.toolbar.findViewById(R.id.toolbar_title);
        this.mTitle = textView;
        Utils.setMyBanglaText(textView, getResources().getString(R.string.settings));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.mDrawerLayoutRight = (MyDrawerLayout) findViewById(R.id.drawer_layout_right);
        ImageView imageView = (ImageView) this.toolbar.findViewById(R.id.ivDrawerRight);
        ivDrawerRight = imageView;
        imageView.setVisibility(0);
        this.rightDrawer = (LinearLayout) findViewById(R.id.right_drawer);
        ivDrawerRight.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SettingsActivity.this.mDrawerLayoutRight.isDrawerOpen(SettingsActivity.this.rightDrawer)) {
                    SettingsActivity.this.mDrawerLayoutRight.closeDrawer(SettingsActivity.this.rightDrawer);
                } else {
                    SettingsActivity.this.mDrawerLayoutRight.openDrawer(SettingsActivity.this.rightDrawer);
                }
            }
        });
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        backStack();
    }

    private void backStack() {
        finish();
    }

    private void audioNameArabic() {
        if (Utils.getString(this, Constants.KEY_RECEITER).equals(Constants.RECEITER_SUDAIS)) {
            this.tv_receiter_name.setText("Abdur-Rahman as-Sudais");
        } else if (Utils.getString(this, Constants.KEY_RECEITER).equals(Constants.RECEITER_GHAMDI)) {
            this.tv_receiter_name.setText("Saad Al-Ghamdi");
        } else if (Utils.getString(this, Constants.KEY_RECEITER).equals(Constants.RECEITER_AL_AFASY)) {
            this.tv_receiter_name.setText("Mishari Rashid al-Afasy");
        } else if (Utils.getString(this, Constants.KEY_RECEITER).equals(Constants.RECEITER_ABDUL_BASET)) {
            this.tv_receiter_name.setText("AbdulBaset AbdulSamad");
        }
    }

    private void fontNameArabic() {
        if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DEFAULT)) {
            this.tv_arabic_font_name.setText("Default Font");
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_QALAM_MAJEED)) {
            this.tv_arabic_font_name.setText("QalamMajeed Font");
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_ARAB)) {
            this.tv_arabic_font_name.setText("ArabType Font");
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIDAYAT)) {
            this.tv_arabic_font_name.setText("Noor E Hidayat Font");
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HUDA)) {
            this.tv_arabic_font_name.setText("Noor E Huda Font");
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIRA)) {
            this.tv_arabic_font_name.setText("Noor E Hira Font");
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_UTHMANI_BOLD)) {
            this.tv_arabic_font_name.setText("Uthmani Font @B");
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_UTHMANI_HAFS9)) {
            this.tv_arabic_font_name.setText("Uthmani Font");
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_ME_QURAN)) {
            this.tv_arabic_font_name.setText("MeQuran Font");
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_AL_MUSHAF)) {
            this.tv_arabic_font_name.setText("Al-Mushaf Font");
        } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DROID_NASKH)) {
            this.tv_arabic_font_name.setText("DroidNaskh Font");
        }
    }

    private String getReading() {
        String str;
        ArrayList<QuranDetails> allVersesBySuraId = DatabaseAccessor.getAllVersesBySuraId("114", "");
        String str2 = "";
        for (int i = 0; i < allVersesBySuraId.size(); i++) {
            if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_AL_MUSHAF) || Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_QALAM_MAJEED)) {
                str = "" + allVersesBySuraId.get(i).getModified_content().trim() + " ﴿" + Utils.getArabic_Mushaf_QalamMajeed_Number(i + 1) + "﴾ ";
            } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_ME_QURAN)) {
                str = "" + allVersesBySuraId.get(i).getModified_content().trim() + "   ﴿" + Utils.getArabicNumber(i + 1) + "﴾     ";
            } else if (Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIDAYAT) || Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HUDA) || Utils.getString(this, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIRA)) {
                str = "" + allVersesBySuraId.get(i).getModified_content().trim() + "  ";
            } else {
                str = "" + allVersesBySuraId.get(i).getModified_content().trim() + "{" + Utils.getArabicNumber(i + 1) + "} ";
            }
            str2 = str2 + str;
        }
        return str2;
    }

    private void clickRightDrawer() {
        Utils.setRightDrawerText(this, this.mDrawerLayoutRight, this.rightDrawer, false);
        this.relativeLayoutHome = (RelativeLayout) findViewById(R.id.relativeLayoutHome);
        this.relativeLayoutSuraBookmark = (RelativeLayout) findViewById(R.id.relativeLayoutSuraBookmark);
        this.relativeLayoutAyatBookmark = (RelativeLayout) findViewById(R.id.relativeLayoutAyatBookmark);
        this.relativeLayoutSearch = (RelativeLayout) findViewById(R.id.relativeLayoutSearch);
        this.relativeLayoutHafezi = (RelativeLayout) findViewById(R.id.relativeLayoutHafezi);
        this.relativeLayoutSettings = (RelativeLayout) findViewById(R.id.relativeLayoutSettings);
        this.relativeLayoutReadMe = (RelativeLayout) findViewById(R.id.relativeLayoutReadMe);
        this.relativeLayoutSettings.setBackgroundResource(R.color.detailsbutton);
        ((ImageView) findViewById(R.id.ivSettings)).setBackgroundResource(R.mipmap.ic_settings_selected);
        ((TextView) findViewById(R.id.tvSettings)).setTextColor(-1);
        this.relativeLayoutHome.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SettingsActivity.this.mDrawerLayoutRight.isDrawerOpen(SettingsActivity.this.rightDrawer)) {
                    SettingsActivity.this.mDrawerLayoutRight.closeDrawer(SettingsActivity.this.rightDrawer);
                }
                SettingsActivity.this.finish();
            }
        });
        this.relativeLayoutSuraBookmark.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SettingsActivity.this.mDrawerLayoutRight.isDrawerOpen(SettingsActivity.this.rightDrawer)) {
                    SettingsActivity.this.mDrawerLayoutRight.closeDrawer(SettingsActivity.this.rightDrawer);
                }
                String str = "";
                for (int i = 1; i < 115; i++) {
                    if (Utils.getString(SettingsActivity.this, "bookmark_remove" + i).equals("" + i)) {
                        if (str.equals("")) {
                            str = " where id = '" + (115 - i) + "' ";
                        }
                        str = str + " or id ='" + (115 - i) + "'";
                    }
                }
                if (str.equals("")) {
                    Toast.makeText(SettingsActivity.this.getApplicationContext(), "No sura added to FAVOURITE list", 0).show();
                    return;
                }
                SettingsActivity.this.finish();
                SettingsActivity.this.startActivity(new Intent(SettingsActivity.this, SuraBookmarkActivity.class));
            }
        });
        this.relativeLayoutAyatBookmark.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.15
            public String bookmark;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SettingsActivity.this.mDrawerLayoutRight.isDrawerOpen(SettingsActivity.this.rightDrawer)) {
                    SettingsActivity.this.mDrawerLayoutRight.closeDrawer(SettingsActivity.this.rightDrawer);
                }
                String str = "";
                int i = 1;
                while (i <= 6236) {
                    String string = Utils.getString(SettingsActivity.this, "bookmark_verse" + i);
                    this.bookmark = string;
                    Log.d("COW", string);
                    if (this.bookmark.equals("" + i)) {
                        str = str + "1";
                        i = 6237;
                    }
                    i++;
                }
                if (str.equals("")) {
                    Toast.makeText(SettingsActivity.this.getApplicationContext(), SettingsActivity.this.getResources().getString(R.string.no_verses_added), 0).show();
                    return;
                }
                SettingsActivity.this.finish();
                SettingsActivity.this.startActivity(new Intent(SettingsActivity.this, VersesBookmarkActivity.class));
            }
        });
        this.relativeLayoutSearch.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SettingsActivity.this.mDrawerLayoutRight.isDrawerOpen(SettingsActivity.this.rightDrawer)) {
                    SettingsActivity.this.mDrawerLayoutRight.closeDrawer(SettingsActivity.this.rightDrawer);
                }
                SettingsActivity.this.finish();
                SettingsActivity.this.startActivity(new Intent(SettingsActivity.this, SearchQuranActivity.class));
            }
        });
        this.relativeLayoutSettings.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SettingsActivity.this.mDrawerLayoutRight.isDrawerOpen(SettingsActivity.this.rightDrawer)) {
                    SettingsActivity.this.mDrawerLayoutRight.closeDrawer(SettingsActivity.this.rightDrawer);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playAudio() {
        stopPlaying();
        abAudio();
        DetailsListAdapter.mp.start();
        DetailsListAdapter.mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.muslim.Settings.SettingsActivity.18
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
            }
        });
    }

    private void abAudio() {
        if (Utils.getString(this, Constants.KEY_RECEITER).equals(Constants.RECEITER_SUDAIS)) {
            DetailsListAdapter.mp = MediaPlayer.create(this, (int) R.raw.bismillah_sudais);
        } else if (Utils.getString(this, Constants.KEY_RECEITER).equals(Constants.RECEITER_GHAMDI)) {
            DetailsListAdapter.mp = MediaPlayer.create(this, (int) R.raw.bismillah_ghamdi);
        } else if (Utils.getString(this, Constants.KEY_RECEITER).equals(Constants.RECEITER_AL_AFASY)) {
            DetailsListAdapter.mp = MediaPlayer.create(this, (int) R.raw.bismillah_al_afasy);
        } else if (Utils.getString(this, Constants.KEY_RECEITER).equals(Constants.RECEITER_ABDUL_BASET)) {
            DetailsListAdapter.mp = MediaPlayer.create(this, (int) R.raw.bismillah_abdul_baset);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selectArabicFontNew() {
        int i = 0;
        CharSequence[] charSequenceArr = {"Simple 1 (Expert)", "Simple 2 (Expert)", "Simple 3 (Expert)", "Uthmanic 1 (Madinah)", "Uthmanic 2 (Madinah)", "Uthmanic 3 (Madinah)", "Indo-Pak 1 (Asian)", "Indo-Pak 2 (Asian)", "Indo-Pak 3 (Asian)"};
        if (Utils.getString(this.activity, Constants.KEY_ARABIC_TEXT).equals(Constants.ARABIC_SIMPLE)) {
            if (Utils.getInt(this.activity, Constants.KEY_ARABIC_FONT_SELECTED) != 1) {
                if (Utils.getInt(this.activity, Constants.KEY_ARABIC_FONT_SELECTED) == 2) {
                    i = 1;
                } else {
                    Utils.getInt(this.activity, Constants.KEY_ARABIC_FONT_SELECTED);
                    i = 2;
                }
            }
        } else if (Utils.getString(this.activity, Constants.KEY_ARABIC_TEXT).equals(Constants.ARABIC_UTHMANIC)) {
            if (Utils.getInt(this.activity, Constants.KEY_ARABIC_FONT_SELECTED) == 1) {
                i = 3;
            } else if (Utils.getInt(this.activity, Constants.KEY_ARABIC_FONT_SELECTED) == 2) {
                i = 4;
            } else {
                if (Utils.getInt(this.activity, Constants.KEY_ARABIC_FONT_SELECTED) == 3) {
                    i = 5;
                }
                i = 2;
            }
        } else {
            if (Utils.getString(this.activity, Constants.KEY_ARABIC_TEXT).equals(Constants.ARABIC_INDOPAK)) {
                if (Utils.getInt(this.activity, Constants.KEY_ARABIC_FONT_SELECTED) == 4) {
                    i = 6;
                } else if (Utils.getInt(this.activity, Constants.KEY_ARABIC_FONT_SELECTED) == 5) {
                    i = 7;
                } else if (Utils.getInt(this.activity, Constants.KEY_ARABIC_FONT_SELECTED) == 6) {
                    i = 8;
                }
            }
            i = 2;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.activity);
        builder.setTitle("Select Arabic Font");
        builder.setSingleChoiceItems(charSequenceArr, i, new DialogInterface.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.19
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                switch (i2) {
                    case 0:
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT, Constants.FONT_UTHMANI_HAFS9);
                        Utils.putInt(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT_SELECTED, 1);
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_SIMPLE);
                        break;
                    case 1:
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT, Constants.FONT_QALAM_MAJEED);
                        Utils.putInt(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT_SELECTED, 2);
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_SIMPLE);
                        break;
                    case 2:
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT, Constants.FONT_ME_QURAN);
                        Utils.putInt(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT_SELECTED, 3);
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_SIMPLE);
                        break;
                    case 3:
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT, Constants.FONT_UTHMANI_HAFS9);
                        Utils.putInt(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT_SELECTED, 1);
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_UTHMANIC);
                        break;
                    case 4:
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT, Constants.FONT_QALAM_MAJEED);
                        Utils.putInt(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT_SELECTED, 2);
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_UTHMANIC);
                        break;
                    case 5:
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT, Constants.FONT_ME_QURAN);
                        Utils.putInt(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT_SELECTED, 3);
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_UTHMANIC);
                        break;
                    case 6:
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT, Constants.FONT_NOOR_E_HIDAYAT);
                        Utils.putInt(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT_SELECTED, 4);
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_INDOPAK);
                        break;
                    case 7:
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT, Constants.FONT_NOOR_E_HUDA);
                        Utils.putInt(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT_SELECTED, 5);
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_INDOPAK);
                        break;
                    case 8:
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT, Constants.FONT_NOOR_E_HIRA);
                        Utils.putInt(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT_SELECTED, 6);
                        Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_INDOPAK);
                        break;
                }
                if (i2 == 0 || i2 == 3) {
                    SettingsActivity.this.tv_arabic_font_name.setText("Uthmani Font");
                } else if (i2 == 1 || i2 == 4) {
                    SettingsActivity.this.tv_arabic_font_name.setText("QalamMajeed Font");
                } else if (i2 == 2 || i2 == 5) {
                    SettingsActivity.this.tv_arabic_font_name.setText("MeQuran Font");
                } else if (i2 == 6) {
                    SettingsActivity.this.tv_arabic_font_name.setText("Noor E Hidayat Font");
                } else if (i2 == 7) {
                    SettingsActivity.this.tv_arabic_font_name.setText("Noor E Huda Font");
                } else if (i2 == 8) {
                    SettingsActivity.this.tv_arabic_font_name.setText("Noor E Hira Font");
                }
                dialogInterface.dismiss();
                SettingsActivity.this.afterChangingFont();
            }
        });
        AlertDialog create = builder.create();
        this.alertDialog = create;
        create.show();
    }

    private void selectArabicFont() {
        Dialog dialog2 = new Dialog(this.activity);
        dialog = dialog2;
        dialog2.requestWindowFeature(1);
        dialog.setContentView(R.layout.dialog_custom_font);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCancelable(false);
        this.rgArab = (RadioGroup) dialog.findViewById(R.id.rgArab);
        this.rgIndoPak = (RadioGroup) dialog.findViewById(R.id.rgIndoPak);
        this.arSimple = (Button) dialog.findViewById(R.id.arSimple);
        this.arUthmanic = (Button) dialog.findViewById(R.id.arUthmanic);
        this.arIndoPak = (Button) dialog.findViewById(R.id.arIndoPak);
        this.rbUthmanic = (RadioButton) dialog.findViewById(R.id.rbUthmanic);
        this.rbQalamMajeed = (RadioButton) dialog.findViewById(R.id.rbQalamMajeed);
        this.rbMeQuran = (RadioButton) dialog.findViewById(R.id.rbMeQuran);
        this.rbNoorEHidayat = (RadioButton) dialog.findViewById(R.id.rbNoorEHidayat);
        this.rbNoorEHuda = (RadioButton) dialog.findViewById(R.id.rbNoorEHuda);
        this.rbNoorEHira = (RadioButton) dialog.findViewById(R.id.rbNoorEHira);
        if (Utils.getString(this.activity, Constants.KEY_ARABIC_TEXT).equals(Constants.ARABIC_SIMPLE)) {
            this.arSimple.setBackgroundResource(R.drawable.rounded_bg_left_selected);
            this.arUthmanic.setBackgroundResource(R.drawable.rounded_bg_middle);
            this.arIndoPak.setBackgroundResource(R.drawable.rounded_bg_right);
            this.rgIndoPak.setVisibility(8);
            this.rgArab.setVisibility(0);
        } else if (Utils.getString(this.activity, Constants.KEY_ARABIC_TEXT).equals(Constants.ARABIC_UTHMANIC)) {
            this.arSimple.setBackgroundResource(R.drawable.rounded_bg_left);
            this.arUthmanic.setBackgroundResource(R.drawable.rounded_bg_middle_selected);
            this.arIndoPak.setBackgroundResource(R.drawable.rounded_bg_right);
            this.rgIndoPak.setVisibility(8);
            this.rgArab.setVisibility(0);
        } else {
            this.arSimple.setBackgroundResource(R.drawable.rounded_bg_left);
            this.arUthmanic.setBackgroundResource(R.drawable.rounded_bg_middle);
            this.arIndoPak.setBackgroundResource(R.drawable.rounded_bg_right_selected);
            this.rgArab.setVisibility(8);
            this.rgIndoPak.setVisibility(0);
        }
        if (Utils.getInt(this, Constants.KEY_ARABIC_FONT_SELECTED) == 1) {
            this.rbUthmanic.setChecked(true);
        } else if (Utils.getInt(this, Constants.KEY_ARABIC_FONT_SELECTED) == 2) {
            this.rbQalamMajeed.setChecked(true);
        } else if (Utils.getInt(this, Constants.KEY_ARABIC_FONT_SELECTED) == 3) {
            this.rbMeQuran.setChecked(true);
        } else if (Utils.getInt(this, Constants.KEY_ARABIC_FONT_SELECTED) == 4) {
            this.rbNoorEHidayat.setChecked(true);
        } else if (Utils.getInt(this, Constants.KEY_ARABIC_FONT_SELECTED) == 5) {
            this.rbNoorEHuda.setChecked(true);
        } else if (Utils.getInt(this, Constants.KEY_ARABIC_FONT_SELECTED) == 6) {
            this.rbNoorEHira.setChecked(true);
        }
        this.arSimple.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.20
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.arSimple.setBackgroundResource(R.drawable.rounded_bg_left_selected);
                SettingsActivity.this.arUthmanic.setBackgroundResource(R.drawable.rounded_bg_middle);
                SettingsActivity.this.arIndoPak.setBackgroundResource(R.drawable.rounded_bg_right);
                SettingsActivity.this.rgIndoPak.setVisibility(8);
                SettingsActivity.this.rgArab.setVisibility(0);
                if (!SettingsActivity.this.rbUthmanic.isChecked()) {
                    if (!SettingsActivity.this.rbQalamMajeed.isChecked()) {
                        if (SettingsActivity.this.rbMeQuran.isChecked()) {
                            Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_ME_QURAN);
                            Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 3);
                        } else {
                            Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_UTHMANI_HAFS9);
                            Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 1);
                            SettingsActivity.this.rbUthmanic.setChecked(true);
                        }
                    } else {
                        Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_QALAM_MAJEED);
                        Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 2);
                    }
                } else {
                    Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_UTHMANI_HAFS9);
                    Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 1);
                }
                Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_SIMPLE);
            }
        });
        this.arUthmanic.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.21
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.arSimple.setBackgroundResource(R.drawable.rounded_bg_left);
                SettingsActivity.this.arUthmanic.setBackgroundResource(R.drawable.rounded_bg_middle_selected);
                SettingsActivity.this.arIndoPak.setBackgroundResource(R.drawable.rounded_bg_right);
                SettingsActivity.this.rgIndoPak.setVisibility(8);
                SettingsActivity.this.rgArab.setVisibility(0);
                if (!SettingsActivity.this.rbUthmanic.isChecked()) {
                    if (!SettingsActivity.this.rbQalamMajeed.isChecked()) {
                        if (SettingsActivity.this.rbMeQuran.isChecked()) {
                            Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_ME_QURAN);
                            Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 3);
                        } else {
                            Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_UTHMANI_HAFS9);
                            Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 1);
                            SettingsActivity.this.rbUthmanic.setChecked(true);
                        }
                    } else {
                        Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_QALAM_MAJEED);
                        Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 2);
                    }
                } else {
                    Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_UTHMANI_HAFS9);
                    Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 1);
                }
                Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_UTHMANIC);
            }
        });
        this.arIndoPak.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.22
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SettingsActivity.this.arSimple.setBackgroundResource(R.drawable.rounded_bg_left);
                SettingsActivity.this.arUthmanic.setBackgroundResource(R.drawable.rounded_bg_middle);
                SettingsActivity.this.arIndoPak.setBackgroundResource(R.drawable.rounded_bg_right_selected);
                SettingsActivity.this.rgArab.setVisibility(8);
                SettingsActivity.this.rgIndoPak.setVisibility(0);
                if (!SettingsActivity.this.rbNoorEHidayat.isChecked()) {
                    if (!SettingsActivity.this.rbNoorEHuda.isChecked()) {
                        if (SettingsActivity.this.rbNoorEHira.isChecked()) {
                            Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_NOOR_E_HIRA);
                            Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 6);
                        } else {
                            Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_NOOR_E_HUDA);
                            Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 5);
                            SettingsActivity.this.rbNoorEHuda.setChecked(true);
                        }
                    } else {
                        Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_NOOR_E_HUDA);
                        Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 5);
                    }
                } else {
                    Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_NOOR_E_HIDAYAT);
                    Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 4);
                }
                Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_INDOPAK);
            }
        });
        this.rbUthmanic.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.23
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_UTHMANI_HAFS9);
                Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 1);
            }
        });
        this.rbQalamMajeed.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.24
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_QALAM_MAJEED);
                Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 2);
            }
        });
        this.rbMeQuran.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.25
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_ME_QURAN);
                Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 3);
            }
        });
        this.rbNoorEHidayat.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.26
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_NOOR_E_HIDAYAT);
                Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 4);
                Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_INDOPAK);
            }
        });
        this.rbNoorEHuda.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.27
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_NOOR_E_HUDA);
                Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 5);
                Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_INDOPAK);
            }
        });
        this.rbNoorEHira.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.28
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Utils.putString(SettingsActivity.this, Constants.KEY_ARABIC_FONT, Constants.FONT_NOOR_E_HIRA);
                Utils.putInt(SettingsActivity.this, Constants.KEY_ARABIC_FONT_SELECTED, 6);
                Utils.putString(SettingsActivity.this.activity, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_INDOPAK);
            }
        });
        ((Button) dialog.findViewById(R.id.btnOk)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.Settings.SettingsActivity.29
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                char c;
                String string = Utils.getString(SettingsActivity.this.activity, Constants.KEY_ARABIC_FONT);
                switch (string.hashCode()) {
                    case -1519676246:
                        if (string.equals(Constants.FONT_UTHMANI_HAFS9)) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -985398331:
                        if (string.equals(Constants.FONT_NOOR_E_HIRA)) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -985387233:
                        if (string.equals(Constants.FONT_NOOR_E_HUDA)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -573189367:
                        if (string.equals(Constants.FONT_QALAM_MAJEED)) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 86979449:
                        if (string.equals(Constants.FONT_NOOR_E_HIDAYAT)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2115128218:
                        if (string.equals(Constants.FONT_ME_QURAN)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    SettingsActivity.this.tv_arabic_font_name.setText("Uthmani Font");
                } else if (c == 1) {
                    SettingsActivity.this.tv_arabic_font_name.setText("QalamMajeed Font");
                } else if (c == 2) {
                    SettingsActivity.this.tv_arabic_font_name.setText("MeQuran Font");
                } else if (c == 3) {
                    SettingsActivity.this.tv_arabic_font_name.setText("Noor E Hidayat Font");
                } else if (c == 4) {
                    SettingsActivity.this.tv_arabic_font_name.setText("Noor E Huda Font");
                } else if (c == 5) {
                    SettingsActivity.this.tv_arabic_font_name.setText("Noor E Hira Font");
                }
                SettingsActivity.dialog.dismiss();
                SettingsActivity.this.afterChangingFont();
            }
        });
        dialog.show();
    }
}
