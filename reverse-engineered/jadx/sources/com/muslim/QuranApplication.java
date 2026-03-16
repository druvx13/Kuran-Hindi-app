package com.muslim;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.muslim.necessary.utils.Constants;
import com.muslim.necessary.utils.Utils;
/* loaded from: classes.dex */
public class QuranApplication extends Application {
    public static QuranApplication quranApplication;
    private Typeface arabicTypeface;

    public static QuranApplication getInstance() {
        return quranApplication;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        quranApplication = this;
        if (TextUtils.isEmpty(Utils.getString(this, Constants.KEY_ARABIC_FONT))) {
            Utils.putString(quranApplication, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_UTHMANIC);
            Utils.putString(quranApplication, "key_noor", "depricated");
            if (Build.VERSION.SDK_INT >= 18) {
                Utils.putString(quranApplication, Constants.KEY_ARABIC_FONT, Constants.FONT_QALAM_MAJEED);
                Utils.putInt(quranApplication, Constants.KEY_ARABIC_FONT_SELECTED, 2);
            } else if (Build.VERSION.SDK_INT >= 17) {
                Utils.putString(quranApplication, Constants.KEY_ARABIC_FONT, Constants.FONT_ME_QURAN);
                Utils.putInt(quranApplication, Constants.KEY_ARABIC_FONT_SELECTED, 0);
            } else if (Build.VERSION.SDK_INT >= 14) {
                Utils.putString(quranApplication, Constants.KEY_ARABIC_FONT, Constants.FONT_AL_MUSHAF);
                Utils.putInt(quranApplication, Constants.KEY_ARABIC_FONT_SELECTED, 0);
            } else {
                Utils.putString(quranApplication, Constants.KEY_ARABIC_FONT, Constants.FONT_DROID_NASKH);
                Utils.putInt(quranApplication, Constants.KEY_ARABIC_FONT_SELECTED, 0);
            }
        } else if (TextUtils.isEmpty(Utils.getString(quranApplication, Constants.KEY_ARABIC_TEXT))) {
            if (Utils.getString(quranApplication, "key_noor").equals("_noor")) {
                Utils.putString(quranApplication, "key_noor", "depricated");
                Utils.putString(quranApplication, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_INDOPAK);
            } else if (Utils.getString(quranApplication, "key_noor").equals("")) {
                Utils.putString(quranApplication, "key_noor", "depricated");
                Utils.putString(quranApplication, Constants.KEY_ARABIC_TEXT, Constants.ARABIC_UTHMANIC);
            }
        }
        if (!Utils.getBoolean(quranApplication, "new_user")) {
            Utils.putBoolean(quranApplication, "new_user", true);
            Utils.putBoolean(quranApplication, Constants.IS_SAVED, true);
        }
        if (TextUtils.isEmpty(Utils.getString(quranApplication, Constants.KEY_TRANSLATOR))) {
            Utils.putString(quranApplication, Constants.KEY_TRANSLATOR, Constants.TRANS_HINDI);
            Utils.putInt(quranApplication, Constants.KEY_BANGLA_FONT_SELECTED, 0);
            Utils.putString(quranApplication, Constants.KEY_TRANSLITERATION_MOOD, Constants.TRANSLITERATION_MOOD_ON);
        }
        Log.d("FONT", Utils.getString(quranApplication, Constants.KEY_ARABIC_FONT));
        if (TextUtils.isEmpty(Utils.getString(quranApplication, Constants.KEY_RECEITER))) {
            Utils.putInt(quranApplication, Constants.KEY_RECEITER_SELECTED, 2);
            Utils.putString(quranApplication, Constants.KEY_RECEITER, Constants.RECEITER_AL_AFASY);
        }
        if (TextUtils.isEmpty(Utils.getString(quranApplication, Constants.KEY_ARABIC_FONT_STYLE))) {
            Utils.putString(quranApplication, Constants.KEY_ARABIC_FONT_STYLE, Constants.FONT_STYLE_NORMAL);
        }
        if (TextUtils.isEmpty(Utils.getString(quranApplication, Constants.KEY_INDO_FONT_STYLE))) {
            Utils.putString(quranApplication, Constants.KEY_INDO_FONT_STYLE, Constants.FONT_STYLE_NORMAL);
        }
        Constants.isArabicFontSupported = Build.VERSION.SDK_INT >= 14;
        if (Build.VERSION.SDK_INT >= 18) {
            this.arabicTypeface = Typeface.createFromAsset(getAssets(), "fonts/arabic/UthmanicHafs1_Ver09.otf");
        } else if (Build.VERSION.SDK_INT >= 17) {
            this.arabicTypeface = Typeface.createFromAsset(getAssets(), "fonts/arabic/me_quran.ttf");
        } else if (Build.VERSION.SDK_INT >= 14) {
            this.arabicTypeface = Typeface.createFromAsset(getAssets(), "fonts/arabic/Al_Mushaf.ttf");
        } else {
            this.arabicTypeface = Typeface.createFromAsset(getAssets(), "fonts/arabic/DroidNaskhRegular.ttf");
        }
    }

    public Typeface getArabicTypeface() {
        return this.arabicTypeface;
    }

    public int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
