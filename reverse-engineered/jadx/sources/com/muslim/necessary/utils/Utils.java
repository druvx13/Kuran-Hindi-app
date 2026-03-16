package com.muslim.necessary.utils;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.muslim.Bookmark.Sura.SuraBookmarkDetailsListAdapter;
import com.muslim.Bookmark.Verses.VersesBookmarkDetailsListAdapter;
import com.muslim.QuranApplication;
import com.muslim.hafizi.HafiziActivity11;
import com.muslim.quran_hindi.DetailsListAdapter;
import com.muslim.quran_hindi.R;
import com.muslim.quran_hindi.ViewPagerFragment;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* loaded from: classes.dex */
public class Utils {
    public static final String DEVELOPER_ID = "TopOfStack+Software";
    private static AlertDialog alertDialog;
    private static Typeface arabicTypeface;
    static Typeface banglaTypeface;
    public static InterstitialAd iAd;

    public static void showAdvertisement(Activity activity) {
        if (isNetworkAvailable(activity)) {
            initializeAdMob(activity);
        }
    }

    public static void initializeAdMob(Context context) {
        InterstitialAd interstitialAd = new InterstitialAd(context);
        iAd = interstitialAd;
        interstitialAd.setAdUnitId(Constants.AD_UNIT_ID);
        iAd.setAdListener(new AdListener() { // from class: com.muslim.necessary.utils.Utils.1
            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                Log.i("DREG", "Ad loaded successfully");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(int i) {
                Log.i("TAG", i + "");
            }
        });
        iAd.loadAd(new AdRequest.Builder().build());
    }

    public static boolean isNetEnabled(Context context) {
        return ((LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION)).isProviderEnabled("network");
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean hasConnection(Context context) {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            networkInfo = connectivityManager.getNetworkInfo(1);
        } catch (Exception unused) {
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
            if (networkInfo2 == null || !networkInfo2.isConnected()) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.isConnected()) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean isServerAvailable(String str) {
        try {
            return !InetAddress.getByName(str).equals("");
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setBanglaText(Activity activity, TextView textView, String str) {
        textView.setText(str.trim());
        if (getMyInt(activity, Constants.KEY_BANGLA_FONT_SIZE) != -1) {
            textView.setTextSize(getMyInt(activity, Constants.KEY_BANGLA_FONT_SIZE));
        }
    }

    public static void setMyBanglaText(TextView textView, String str) {
        textView.setText(str.trim());
    }

    public static void setMyBanglaTextHtml(TextView textView, String str) {
        textView.setText(Html.fromHtml(str.trim()), TextView.BufferType.SPANNABLE);
    }

    public static void setMyBanglaTextNormal(TextView textView) {
        textView.setTypeface(null, 0);
    }

    public static void setMyBanglaTextBold(TextView textView) {
        textView.setTypeface(null, 0);
    }

    public static void setTransliterationText(Activity activity, TextView textView, String str) {
        if (getString(activity, Constants.KEY_TRANSLITERATION_MOOD).equals(Constants.TRANSLITERATION_MOOD_ON)) {
            textView.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setText(Html.fromHtml(str.trim(), 0), TextView.BufferType.SPANNABLE);
            } else {
                textView.setText(Html.fromHtml(str.trim()), TextView.BufferType.SPANNABLE);
            }
            textView.setTypeface(null, 2);
            if (getMyInt(activity, Constants.KEY_BANGLA_FONT_SIZE) != -1) {
                double myInt = getMyInt(activity, Constants.KEY_BANGLA_FONT_SIZE);
                Double.isNaN(myInt);
                textView.setTextSize((float) Math.round(myInt * 0.88d));
                return;
            }
            return;
        }
        textView.setVisibility(8);
    }

    public static void setArabicText(Activity activity, TextView textView, String str, boolean z) {
        if (TextUtils.isEmpty(getString(activity, Constants.KEY_ARABIC_FONT))) {
            if (Build.VERSION.SDK_INT >= 18) {
                putString(activity, Constants.KEY_ARABIC_FONT, Constants.FONT_UTHMANI_HAFS9);
            } else if (Build.VERSION.SDK_INT >= 17) {
                putString(activity, Constants.KEY_ARABIC_FONT, Constants.FONT_ME_QURAN);
            } else if (Build.VERSION.SDK_INT >= 14) {
                putString(activity, Constants.KEY_ARABIC_FONT, Constants.FONT_AL_MUSHAF);
            } else {
                putString(activity, Constants.KEY_ARABIC_FONT, Constants.FONT_DROID_NASKH);
            }
        }
        setArabicTypeface(activity, textView);
        if (z) {
            if (!Constants.isArabicFontSupported || getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DROID_NASKH)) {
                if (Build.VERSION.SDK_INT >= 24) {
                    textView.setText(Html.fromHtml(ArabicFarsiUrduGlyphUtils.formatToDisplayArabic(str.trim()).trim(), 0), TextView.BufferType.SPANNABLE);
                } else {
                    textView.setText(Html.fromHtml(ArabicFarsiUrduGlyphUtils.formatToDisplayArabic(str.trim()).trim()), TextView.BufferType.SPANNABLE);
                }
            } else if (Build.VERSION.SDK_INT >= 24) {
                textView.setText(Html.fromHtml(str.trim(), 0), TextView.BufferType.SPANNABLE);
            } else {
                textView.setText(Html.fromHtml(str.trim()), TextView.BufferType.SPANNABLE);
            }
        } else if (!Constants.isArabicFontSupported || getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DROID_NASKH)) {
            textView.setText(ArabicFarsiUrduGlyphUtils.formatToDisplayArabic(str.trim()).trim());
        } else {
            textView.setText(str.trim());
        }
        arabicTextSize(activity, textView);
    }

    public static void setArabicText(Activity activity, TextView textView, String str, int i) {
        if (TextUtils.isEmpty(getString(activity, Constants.KEY_ARABIC_FONT))) {
            if (Build.VERSION.SDK_INT >= 18) {
                putString(activity, Constants.KEY_ARABIC_FONT, Constants.FONT_UTHMANI_HAFS9);
            } else if (Build.VERSION.SDK_INT >= 17) {
                putString(activity, Constants.KEY_ARABIC_FONT, Constants.FONT_ME_QURAN);
            } else if (Build.VERSION.SDK_INT >= 14) {
                putString(activity, Constants.KEY_ARABIC_FONT, Constants.FONT_AL_MUSHAF);
            } else {
                putString(activity, Constants.KEY_ARABIC_FONT, Constants.FONT_DROID_NASKH);
            }
        }
        if (!getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIDAYAT) && !getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HUDA) && !getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIRA)) {
            Typeface createFromAsset = Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/me_quran.ttf");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + ("  ﴿" + getArabicNumber(i) + "﴾"));
            int length = str.length();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("", setArabicTypeface(activity)), 0, str.length(), 34);
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("", createFromAsset), length, length2, 34);
            if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_UTHMANI_HAFS9) || getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_QALAM_MAJEED)) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), length, length2, 33);
            } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_ME_QURAN)) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.9f), length, length2, 33);
            } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_AL_MUSHAF)) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.7f), length, length2, 33);
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#763700")), length, length2, 34);
            if (!Constants.isArabicFontSupported || getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DROID_NASKH)) {
                textView.setText(ArabicFarsiUrduGlyphUtils.formatToDisplayArabic(str.trim()).trim());
            } else {
                textView.setText(spannableStringBuilder);
            }
        } else {
            setArabicTypeface(activity, textView);
            if (!Constants.isArabicFontSupported || getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DROID_NASKH)) {
                textView.setText(ArabicFarsiUrduGlyphUtils.formatToDisplayArabic(str.trim()).trim());
            } else {
                textView.setText(str.trim());
            }
        }
        arabicTextSize(activity, textView);
    }

    private static void arabicTextSize(Activity activity, TextView textView) {
        if (getMyInt(activity, Constants.KEY_ARABIC_FONT_SIZE) != -1) {
            if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_AL_MUSHAF) || getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HUDA)) {
                double myInt = getMyInt(activity, Constants.KEY_ARABIC_FONT_SIZE);
                Double.isNaN(myInt);
                textView.setTextSize((float) Math.round(myInt * 1.25d));
            } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIRA)) {
                double myInt2 = getMyInt(activity, Constants.KEY_ARABIC_FONT_SIZE);
                Double.isNaN(myInt2);
                textView.setTextSize((float) Math.round(myInt2 * 1.12d));
            } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_ME_QURAN)) {
                double myInt3 = getMyInt(activity, Constants.KEY_ARABIC_FONT_SIZE);
                Double.isNaN(myInt3);
                textView.setTextSize((float) Math.round(myInt3 * 0.933333d));
            } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIDAYAT)) {
                double myInt4 = getMyInt(activity, Constants.KEY_ARABIC_FONT_SIZE);
                Double.isNaN(myInt4);
                textView.setTextSize((float) Math.round(myInt4 * 0.9d));
            } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DROID_NASKH)) {
                double myInt5 = getMyInt(activity, Constants.KEY_ARABIC_FONT_SIZE);
                Double.isNaN(myInt5);
                textView.setTextSize((float) Math.round(myInt5 * 0.7333333d));
            } else {
                textView.setTextSize(getMyInt(activity, Constants.KEY_ARABIC_FONT_SIZE));
            }
        }
    }

    private static float arabicTextSize(Activity activity) {
        double myInt;
        double d;
        float myInt2 = getMyInt(activity, Constants.KEY_ARABIC_FONT_SIZE);
        if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_UTHMANI_HAFS9) || getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_QALAM_MAJEED)) {
            myInt = getMyInt(activity, Constants.KEY_ARABIC_FONT_SIZE);
            d = 1.07d;
            Double.isNaN(myInt);
        } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_AL_MUSHAF)) {
            myInt = getMyInt(activity, Constants.KEY_ARABIC_FONT_SIZE);
            d = 1.25d;
            Double.isNaN(myInt);
        } else {
            if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DROID_NASKH)) {
                myInt = getMyInt(activity, Constants.KEY_ARABIC_FONT_SIZE);
                d = 0.786d;
                Double.isNaN(myInt);
            }
            Toast.makeText(activity, "" + myInt2, 0).show();
            return myInt2;
        }
        myInt2 = (float) (myInt / d);
        Toast.makeText(activity, "" + myInt2, 0).show();
        return myInt2;
    }

    public static void setArabicTextReading(Activity activity, TextView textView, String str, int i) {
        setArabicTypeface(activity, textView);
        arabicTextSize(activity, textView);
        if (!Constants.isArabicFontSupported) {
            textView.setText(ArabicFarsiUrduGlyphUtils.formatToDisplayArabic(str.trim()).trim());
        } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIDAYAT) || getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HUDA) || getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIRA)) {
            textView.setText(str);
        } else {
            changeTextinViewMeQuran(activity, str, textView, Color.parseColor("#894306"), Color.parseColor("#fafafa"), i);
        }
    }

    private static void changeTextinViewMeQuran(Activity activity, String str, TextView textView, int i, int i2, int i3) {
        String str2;
        Typeface createFromAsset = Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/me_quran.ttf");
        SpannableString spannableString = new SpannableString(str);
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_UTHMANI_HAFS9) || getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_AL_MUSHAF) || getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_QALAM_MAJEED) || getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_ME_QURAN) || getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DROID_NASKH)) {
                str2 = "﴿" + getArabicNumber(i4 + 1) + "﴾";
            } else {
                str2 = "{" + getArabicNumber(i4 + 1) + "}";
            }
            int indexOf = str.indexOf(str2, i5);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
            if (indexOf < 0) {
                break;
            }
            int length = str2.length() + indexOf;
            spannableString.setSpan(foregroundColorSpan, indexOf, length, 33);
            if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_UTHMANI_HAFS9) || getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_QALAM_MAJEED)) {
                spannableString.setSpan(new RelativeSizeSpan(0.8f), indexOf, length, 33);
            } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_ME_QURAN)) {
                spannableString.setSpan(new RelativeSizeSpan(0.9f), indexOf, length, 33);
            } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_AL_MUSHAF)) {
                spannableString.setSpan(new RelativeSizeSpan(0.7f), indexOf, length, 33);
            }
            spannableString.setSpan(new CustomTypefaceSpan("", createFromAsset), indexOf, length, 33);
            i4++;
            i5 = length;
        }
        textView.setText(spannableString);
    }

    public static void showOtherApp(Activity activity) {
        if (isNetworkAvailable(activity)) {
            try {
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://developer?id=TopOfStack+Software")));
                return;
            } catch (ActivityNotFoundException unused) {
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/developer?id=TopOfStack+Software")));
                return;
            }
        }
        Toast.makeText(activity, "Please check your internet connection.", 0).show();
    }

    public static boolean isIntentAvailable(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public static void gotoLink(Activity activity) {
        if (isNetworkAvailable(activity)) {
            try {
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + activity.getPackageName())));
                return;
            } catch (ActivityNotFoundException unused) {
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + activity.getPackageName())));
                return;
            }
        }
        Toast.makeText(activity, "Please check your internet connection.", 0).show();
    }

    public static void share(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=" + activity.getPackageName());
        intent.setType("text/plain");
        activity.startActivity(intent);
    }

    public static final boolean putBoolean(Context context, String str, boolean z) {
        return PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(str, z).commit();
    }

    public static final boolean getBoolean(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, false);
    }

    public static final boolean putString(Context context, String str, String str2) {
        return PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, str2).commit();
    }

    public static final String getString(Activity activity, String str) {
        return PreferenceManager.getDefaultSharedPreferences(activity).getString(str, "");
    }

    public static final String getString(QuranApplication quranApplication, String str) {
        return PreferenceManager.getDefaultSharedPreferences(quranApplication).getString(str, "");
    }

    public static final boolean putInt(Context context, String str, int i) {
        return PreferenceManager.getDefaultSharedPreferences(context).edit().putInt(str, i).commit();
    }

    public static final int getInt(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(str, 0);
    }

    public static final int getHafiziInt(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(str, 609);
    }

    public static final int getMyInt(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(str, -1);
    }

    public static final boolean putLongValue(Context context, String str, long j) {
        return PreferenceManager.getDefaultSharedPreferences(context).edit().putLong(str, j).commit();
    }

    public static String getBanglaNumber(int i) {
        return getHiNumber(Integer.toString(i));
    }

    public static String getBanglaNumber(String str) {
        return getHiNumber(str);
    }

    public static String getMyEnglishNumber(String str) {
        return getEnNumber(str);
    }

    private static String getHiNumber(String str) {
        return str.replace("0", "०").replace("1", "१").replace("2", "२").replace("3", "३").replace("4", "४").replace("5", "५").replace("6", "६").replace("7", "७").replace("8", "८").replace("9", "९");
    }

    private static String getEnNumber(String str) {
        return str.replace("०", "0").replace("१", "1").replace("२", "2").replace("३", "3").replace("४", "4").replace("५", "5").replace("६", "6").replace("७", "7").replace("८", "8").replace("९", "9");
    }

    public static String getArabicNumber(int i) {
        return Integer.toString(i).replace('1', (char) 1633).replace('2', (char) 1634).replace('3', (char) 1635).replace('4', (char) 1636).replace('5', (char) 1637).replace('6', (char) 1638).replace('7', (char) 1639).replace('8', (char) 1640).replace('9', (char) 1641).replace('0', (char) 1632);
    }

    public static String getArabic_Mushaf_QalamMajeed_Number(int i) {
        return Integer.toString(i).replace('1', (char) 1777).replace('2', (char) 1778).replace('3', (char) 1779).replace('4', (char) 1780).replace('5', (char) 1781).replace('6', (char) 1782).replace('7', (char) 1783).replace('8', (char) 1784).replace('9', (char) 1785).replace('0', (char) 1776);
    }

    public static String getArabic_IndoPak_Number(int i) {
        return Integer.toString(i).replace('1', (char) 1777).replace('2', (char) 1778).replace('3', (char) 1779).replace('4', (char) 1780).replace('5', (char) 1781).replace('6', (char) 1782).replace('7', (char) 1783).replace('8', (char) 1784).replace('9', (char) 1785).replace('0', (char) 1776);
    }

    public static void sendViaIntent(Activity activity, String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.setType("text/plain");
        if (isIntentAvailable(activity, intent)) {
            activity.startActivity(Intent.createChooser(intent, str + "\n" + activity.getResources().getString(R.string.share_verse)));
            return;
        }
        Toast.makeText(activity, activity.getResources().getString(R.string.no_option_to_share_verse), 0).show();
    }

    public static Typeface setArabicTypeface(Activity activity) {
        if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DEFAULT)) {
            return null;
        }
        if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_QALAM_MAJEED)) {
            return Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/Al_Qalam_Quran_Majeed_2.ttf");
        }
        if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIDAYAT)) {
            return Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/noorehidayat.ttf");
        }
        if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HUDA)) {
            return Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/noorehuda.ttf");
        }
        if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIRA)) {
            return Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/noorehira.ttf");
        }
        if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_UTHMANI_BOLD)) {
            return Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/UthmanTN1B_Ver10.ttf");
        }
        if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_UTHMANI_HAFS9)) {
            return Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/UthmanicHafs1_Ver09.otf");
        }
        if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_ARAB)) {
            return Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/arabtype.ttf");
        }
        if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_ME_QURAN)) {
            return Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/me_quran.ttf");
        }
        if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_AL_MUSHAF)) {
            return Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/Al_Mushaf.ttf");
        }
        if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DROID_NASKH)) {
            return Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/DroidNaskhRegular.ttf");
        }
        return null;
    }

    public static void setArabicTypeface(Activity activity, TextView textView) {
        if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DEFAULT)) {
            arabicTypeface = null;
            if (getString(activity, Constants.KEY_ARABIC_FONT_STYLE).equals(Constants.STYLE_BOLD)) {
                textView.setTypeface(arabicTypeface, 1);
            } else {
                textView.setTypeface(arabicTypeface, 0);
            }
        } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_QALAM_MAJEED)) {
            arabicTypeface = Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/Al_Qalam_Quran_Majeed_2.ttf");
            if (getString(activity, Constants.KEY_ARABIC_FONT_STYLE).equals(Constants.STYLE_BOLD)) {
                textView.setTypeface(arabicTypeface, 1);
            } else {
                textView.setTypeface(arabicTypeface, 0);
            }
        } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIDAYAT)) {
            arabicTypeface = Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/noorehidayat.ttf");
            if (getString(activity, Constants.KEY_ARABIC_FONT_STYLE).equals(Constants.STYLE_BOLD)) {
                textView.setTypeface(arabicTypeface, 1);
            } else {
                textView.setTypeface(arabicTypeface, 0);
            }
        } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HUDA)) {
            arabicTypeface = Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/noorehuda.ttf");
            if (getString(activity, Constants.KEY_ARABIC_FONT_STYLE).equals(Constants.STYLE_BOLD)) {
                textView.setTypeface(arabicTypeface, 1);
            } else {
                textView.setTypeface(arabicTypeface, 0);
            }
        } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_NOOR_E_HIRA)) {
            arabicTypeface = Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/noorehira.ttf");
            if (getString(activity, Constants.KEY_ARABIC_FONT_STYLE).equals(Constants.STYLE_BOLD)) {
                textView.setTypeface(arabicTypeface, 1);
            } else {
                textView.setTypeface(arabicTypeface, 0);
            }
        } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_UTHMANI_BOLD)) {
            arabicTypeface = Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/UthmanTN1B_Ver10.ttf");
            if (getString(activity, Constants.KEY_ARABIC_FONT_STYLE).equals(Constants.STYLE_BOLD)) {
                textView.setTypeface(arabicTypeface, 1);
            } else {
                textView.setTypeface(arabicTypeface, 0);
            }
        } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_UTHMANI_HAFS9)) {
            arabicTypeface = Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/UthmanicHafs1_Ver09.otf");
            if (Build.VERSION.SDK_INT >= 23 || getString(activity, Constants.KEY_READING_MOOD).equals(Constants.READING_MOOD_ON)) {
                textView.setTypeface(arabicTypeface, 0);
                return;
            }
            textView.setTextColor(activity.getResources().getColor(R.color.normal_black));
            textView.setTypeface(arabicTypeface, 1);
        } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_ARAB)) {
            arabicTypeface = Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/arabtype.ttf");
            if (getString(activity, Constants.KEY_ARABIC_FONT_STYLE).equals(Constants.STYLE_BOLD)) {
                textView.setTypeface(arabicTypeface, 1);
            } else {
                textView.setTypeface(arabicTypeface, 0);
            }
        } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_ME_QURAN)) {
            arabicTypeface = Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/me_quran.ttf");
            if (getString(activity, Constants.KEY_ARABIC_FONT_STYLE).equals(Constants.STYLE_BOLD)) {
                textView.setTypeface(arabicTypeface, 1);
            } else {
                textView.setTypeface(arabicTypeface, 0);
            }
        } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_AL_MUSHAF)) {
            arabicTypeface = Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/Al_Mushaf.ttf");
            if (getString(activity, Constants.KEY_ARABIC_FONT_STYLE).equals(Constants.STYLE_BOLD)) {
                textView.setTypeface(arabicTypeface, 1);
            } else {
                textView.setTypeface(arabicTypeface, 0);
            }
        } else if (getString(activity, Constants.KEY_ARABIC_FONT).equals(Constants.FONT_DROID_NASKH)) {
            arabicTypeface = Typeface.createFromAsset(activity.getAssets(), "fonts/arabic/DroidNaskhRegular.ttf");
            if (getString(activity, Constants.KEY_ARABIC_FONT_STYLE).equals(Constants.STYLE_BOLD)) {
                textView.setTypeface(arabicTypeface, 1);
            } else {
                textView.setTypeface(arabicTypeface, 0);
            }
        }
    }

    public static void doRestart(Context context) {
        try {
            if (context != null) {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(context.getPackageName());
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.addFlags(67108864);
                        ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(1, System.currentTimeMillis() + 100, PendingIntent.getActivity(context, 223344, launchIntentForPackage, 268435456));
                        System.exit(0);
                    } else {
                        Log.e("TAG", "Was not able to restart application, mStartActivity null");
                    }
                } else {
                    Log.e("TAG", "Was not able to restart application, PM null");
                }
            } else {
                Log.e("TAG", "Was not able to restart application, Context null");
            }
        } catch (Exception unused) {
            Log.e("TAG", "Was not able to restart application");
        }
    }

    public static void setRightDrawerText(final Activity activity, final DrawerLayout drawerLayout, final LinearLayout linearLayout, final boolean z) {
        setMyBanglaText((TextView) activity.findViewById(R.id.tvHome), activity.getResources().getString(R.string.quran_1));
        setMyBanglaText((TextView) activity.findViewById(R.id.tvSuraBookmark), activity.getResources().getString(R.string.saved_suras));
        setMyBanglaText((TextView) activity.findViewById(R.id.tvAyatBookmark), activity.getResources().getString(R.string.saved_ayats));
        setMyBanglaText((TextView) activity.findViewById(R.id.tvSearch), activity.getResources().getString(R.string.search));
        setMyBanglaText((TextView) activity.findViewById(R.id.tvHafezi), activity.getResources().getString(R.string.hafezi_quran));
        setMyBanglaText((TextView) activity.findViewById(R.id.tvSettings), activity.getResources().getString(R.string.settings));
        ((RelativeLayout) activity.findViewById(R.id.relativeLayoutHafezi)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.necessary.utils.Utils.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DrawerLayout.this.isDrawerOpen(linearLayout)) {
                    DrawerLayout.this.closeDrawer(linearLayout);
                }
                Utils.openHafiziActivity(activity, z);
            }
        });
        rateShare(activity, drawerLayout, linearLayout);
    }

    public static void setRightDrawerTextForHafizi(Activity activity, DrawerLayout drawerLayout, LinearLayout linearLayout) {
        setMyBanglaText((TextView) activity.findViewById(R.id.tvHome), activity.getResources().getString(R.string.quran_1));
        setMyBanglaText((TextView) activity.findViewById(R.id.tvSuraBookmark), activity.getResources().getString(R.string.saved_suras));
        setMyBanglaText((TextView) activity.findViewById(R.id.tvAyatBookmark), activity.getResources().getString(R.string.saved_ayats));
        setMyBanglaText((TextView) activity.findViewById(R.id.tvSearch), activity.getResources().getString(R.string.search));
        setMyBanglaText((TextView) activity.findViewById(R.id.tvHafezi), activity.getResources().getString(R.string.hafezi_quran));
        setMyBanglaText((TextView) activity.findViewById(R.id.tvSettings), activity.getResources().getString(R.string.settings));
        rateShare(activity, drawerLayout, linearLayout);
    }

    public static void openHafiziActivity(final Activity activity, final boolean z) {
        File file = new File(getRoot().getAbsolutePath() + "/QuranIDEA/Hafizi_Images/");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!new File(getRoot().getAbsolutePath() + "/QuranIDEA/Hafizi_Images/2af1c0efb5de47d6c1b8a8aa77b3e34e-611-min.png/").exists()) {
            File file2 = new File(getRoot().getAbsolutePath() + "/QuranIDEA/Hafizi_Images/Q_Saudi.zip/");
            if (file2.exists()) {
                file2.delete();
            }
            if (file2.exists()) {
                return;
            }
            AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle("Hafizi Quran").setMessage("Do you want to download full Hafizi Qur'an file?").setPositiveButton("Download", new DialogInterface.OnClickListener() { // from class: com.muslim.necessary.utils.Utils.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (Utils.isNetworkAvailable(activity)) {
                        new DownloadHafizi(activity, "https://firebasestorage.googleapis.com/v0/b/quranapp-b1f84.appspot.com/o/Hafizi%20Quran%20Images%2FQ_Saudi.zip?alt=media&token=b7e69b2a-82bb-4719-8d2e-a61608104abf", Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Hafizi_Images/Q_Saudi.zip", Utils.getRoot().getAbsolutePath() + "/QuranIDEA/Hafizi_Images", z).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                        return;
                    }
                    Toast.makeText(activity, "Please Check Your Internet Connection.", 1).show();
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: com.muslim.necessary.utils.Utils.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            AlertDialog alertDialog2 = alertDialog;
            if (alertDialog2 != null && alertDialog2.isShowing()) {
                alertDialog.dismiss();
            }
            AlertDialog create = negativeButton.create();
            alertDialog = create;
            create.show();
            return;
        }
        if (!z) {
            activity.finish();
        }
        activity.startActivity(Build.VERSION.SDK_INT > 11 ? new Intent(activity, HafiziActivity11.class) : new Intent(activity, HafiziActivity11.class));
    }

    public static void unzip(Activity activity, String str, String str2, boolean z) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                Log.d("Unzip", "Unzipping " + nextEntry.getName() + " at " + str2);
                if (nextEntry.isDirectory()) {
                    hanldeDirectory(str2, nextEntry.getName());
                } else {
                    FileOutputStream fileOutputStream = new FileOutputStream(str2 + "/" + nextEntry.getName());
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    zipInputStream.closeEntry();
                    bufferedOutputStream.close();
                    fileOutputStream.close();
                }
            }
            zipInputStream.close();
            Log.d("Unzip", "Unzipping complete. path :  " + str2);
            if (!z) {
                activity.finish();
            }
            activity.startActivity(new Intent(activity, HafiziActivity11.class));
        } catch (Exception e) {
            Log.d("Unzip", "Unzipping failed");
            e.printStackTrace();
        }
    }

    public static void unzipSura(Activity activity, String str, String str2) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    Log.d("Unzip", "Unzipping " + nextEntry.getName() + " at " + str2);
                    if (nextEntry.isDirectory()) {
                        hanldeDirectory(str2, nextEntry.getName());
                    } else {
                        FileOutputStream fileOutputStream = new FileOutputStream(str2 + "/" + nextEntry.getName());
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        zipInputStream.closeEntry();
                        bufferedOutputStream.close();
                        fileOutputStream.close();
                    }
                } else {
                    zipInputStream.close();
                    Log.d("Unzip", "Unzipping complete. path :  " + str2);
                    return;
                }
            }
        } catch (Exception e) {
            Log.d("Unzip", "Unzipping failed");
            e.printStackTrace();
        }
    }

    public static void hanldeDirectory(String str, String str2) {
        File file = new File(str + str2);
        if (file.isDirectory()) {
            return;
        }
        file.mkdirs();
    }

    public static ArrayList<String> getSelections(int i) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i2 = 1; i2 <= i; i2++) {
            if (Build.VERSION.SDK_INT >= 14) {
                arrayList.add(getBanglaNumber(i2));
            } else {
                arrayList.add(Integer.toString(i2));
            }
        }
        return arrayList;
    }

    public static float getWidth(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        return Math.min(i / f, i2 / f);
    }

    public static long dirSize(File file) {
        long length;
        long j = 0;
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    length = dirSize(listFiles[i]);
                } else {
                    length = listFiles[i].length();
                }
                j += length;
            }
        }
        return j;
    }

    public static double size(double d) {
        double d2 = d / 1048576.0d;
        new DecimalFormat("0.00");
        return d2;
    }

    public static String replaceUthmaniArabic(String str) {
        return str.replace("۟", "ْ").replace("ۭ", "ۢ").replace("۪", "ٜ").replace("ۣ", "ۜ").replace("۫", "۬");
    }

    private static void rateShare(final Activity activity, final DrawerLayout drawerLayout, final LinearLayout linearLayout) {
        View findViewById = activity.findViewById(R.id.rateshare);
        TextView textView = (TextView) findViewById.findViewById(R.id.tvRate);
        TextView textView2 = (TextView) findViewById.findViewById(R.id.tvShare);
        setMyBanglaText(textView, textView.getText().toString());
        setMyBanglaText(textView2, textView2.getText().toString());
        ((RelativeLayout) findViewById.findViewById(R.id.relativeLayoutRate)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.necessary.utils.Utils.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DrawerLayout.this.isDrawerOpen(linearLayout)) {
                    DrawerLayout.this.closeDrawer(linearLayout);
                }
                Utils.gotoLink(activity);
            }
        });
        ((RelativeLayout) findViewById.findViewById(R.id.relativeLayoutShare)).setOnClickListener(new View.OnClickListener() { // from class: com.muslim.necessary.utils.Utils.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DrawerLayout.this.isDrawerOpen(linearLayout)) {
                    DrawerLayout.this.closeDrawer(linearLayout);
                }
                Utils.share(activity);
            }
        });
    }

    /* loaded from: classes.dex */
    public static class DownloadHafizi extends AsyncTask<String, Integer, Long> {
        Activity activity;
        String destination;
        Dialog dialog;
        String downloadUrl;
        private double fileSize;
        String folder;
        private Handler handler;
        boolean isfromMainActivity;
        ImageView ivClose;
        LinearLayout layoutConnecting;
        LinearLayout layoutDownloading;
        TextView outof;
        TextView outofMB;
        private Runnable runnable;
        SeekBar seekBar;

        public DownloadHafizi(Activity activity, String str, String str2, String str3, boolean z) {
            this.activity = activity;
            this.downloadUrl = str;
            this.destination = str2;
            this.folder = str3;
            this.isfromMainActivity = z;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            Dialog dialog = new Dialog(this.activity);
            this.dialog = dialog;
            dialog.requestWindowFeature(1);
            this.dialog.setContentView(R.layout.downloading);
            this.dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.dialog.setCancelable(false);
            TextView textView = (TextView) this.dialog.findViewById(R.id.tvChangeTranslator);
            this.layoutConnecting = (LinearLayout) this.dialog.findViewById(R.id.layoutConnecting);
            this.layoutDownloading = (LinearLayout) this.dialog.findViewById(R.id.layoutDownloading);
            SeekBar seekBar = (SeekBar) this.dialog.findViewById(R.id.seekBar);
            this.seekBar = seekBar;
            seekBar.setProgress(0);
            this.seekBar.setMax(100);
            this.seekBar.setOnTouchListener(new View.OnTouchListener() { // from class: com.muslim.necessary.utils.Utils.DownloadHafizi.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
            TextView textView2 = (TextView) this.dialog.findViewById(R.id.out_of_mb);
            this.outofMB = textView2;
            textView2.setText("Connecting with server...");
            TextView textView3 = (TextView) this.dialog.findViewById(R.id.outof);
            this.outof = textView3;
            textView3.setText("0/100");
            ImageView imageView = (ImageView) this.dialog.findViewById(R.id.iv_close);
            this.ivClose = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.necessary.utils.Utils.DownloadHafizi.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Constants.CANCEL_DOWNLOAD = true;
                    Constants.CLOSE_DOWNLOAD = true;
                    if (DownloadHafizi.this.handler != null && DownloadHafizi.this.runnable != null) {
                        DownloadHafizi.this.handler.removeCallbacks(DownloadHafizi.this.runnable);
                    }
                    DownloadHafizi.this.dialog.dismiss();
                    DownloadHafizi.this.cancel(true);
                    File file = new File(DownloadHafizi.this.destination);
                    if (file.exists()) {
                        file.delete();
                    }
                }
            });
            myHandler();
            this.dialog.show();
        }

        private void myHandler() {
            this.handler = new Handler();
            Runnable runnable = new Runnable() { // from class: com.muslim.necessary.utils.Utils.DownloadHafizi.3
                @Override // java.lang.Runnable
                public void run() {
                    if (!Constants.CANCEL_DOWNLOAD) {
                        Toast.makeText(DownloadHafizi.this.activity, "Server not responding !!!\nTry Later......\nMaybe your internet speed is too slow !!!", 1).show();
                    }
                    Constants.CANCEL_DOWNLOAD = false;
                    DownloadHafizi.this.dialog.dismiss();
                    DownloadHafizi.this.cancel(true);
                    File file = new File(DownloadHafizi.this.destination);
                    if (file.exists()) {
                        file.delete();
                    }
                }
            };
            this.runnable = runnable;
            this.handler.postDelayed(runnable, 30000L);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Long doInBackground(String... strArr) {
            try {
                Log.v("KURKUR", "NO FOOD");
                URL url = new URL(this.downloadUrl);
                Log.v("KURKUR attachmentLinkDownload", this.downloadUrl);
                URLConnection openConnection = url.openConnection();
                openConnection.connect();
                int contentLength = openConnection.getContentLength();
                this.fileSize = openConnection.getContentLength();
                Log.v("KURKUR lenghtOfFile", contentLength + "");
                if (isCancelled()) {
                    File file = new File(this.destination);
                    if (file.exists()) {
                        file.delete();
                    }
                    publishProgress(100);
                    return null;
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
                FileOutputStream fileOutputStream = new FileOutputStream(this.destination);
                byte[] bArr = new byte[1024];
                long j = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        j += read;
                        FileOutputStream fileOutputStream2 = fileOutputStream;
                        publishProgress(Integer.valueOf((int) ((100 * j) / contentLength)));
                        fileOutputStream2.write(bArr, 0, read);
                        Log.v("KURKUR total", j + "");
                        fileOutputStream = fileOutputStream2;
                    } else {
                        FileOutputStream fileOutputStream3 = fileOutputStream;
                        fileOutputStream3.flush();
                        fileOutputStream3.close();
                        bufferedInputStream.close();
                        return null;
                    }
                }
            } catch (FileNotFoundException e) {
                this.activity.runOnUiThread(new Runnable() { // from class: com.muslim.necessary.utils.Utils.DownloadHafizi.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!Constants.CLOSE_DOWNLOAD) {
                            Toast.makeText(DownloadHafizi.this.activity, "An unexpected error occured while downloading...\nPlease reconnect your internet connection...", 1).show();
                        } else {
                            Constants.CLOSE_DOWNLOAD = false;
                        }
                    }
                });
                e.printStackTrace();
                myHandlerCancelDownload();
                return null;
            } catch (MalformedURLException e2) {
                this.activity.runOnUiThread(new Runnable() { // from class: com.muslim.necessary.utils.Utils.DownloadHafizi.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!Constants.CLOSE_DOWNLOAD) {
                            Toast.makeText(DownloadHafizi.this.activity, "An unexpected error occured while downloading...\nPlease reconnect your internet connection...", 1).show();
                        } else {
                            Constants.CLOSE_DOWNLOAD = false;
                        }
                    }
                });
                e2.printStackTrace();
                myHandlerCancelDownload();
                return null;
            } catch (IOException e3) {
                this.activity.runOnUiThread(new Runnable() { // from class: com.muslim.necessary.utils.Utils.DownloadHafizi.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!Constants.CLOSE_DOWNLOAD) {
                            Toast.makeText(DownloadHafizi.this.activity, "An unexpected error occured while downloading...\nPlease reconnect your internet connection...", 1).show();
                        } else {
                            Constants.CLOSE_DOWNLOAD = false;
                        }
                    }
                });
                e3.printStackTrace();
                myHandlerCancelDownload();
                return null;
            }
        }

        private void myHandlerCancelDownload() {
            Runnable runnable;
            Constants.CANCEL_DOWNLOAD = false;
            Handler handler = this.handler;
            if (handler != null && (runnable = this.runnable) != null) {
                handler.removeCallbacks(runnable);
            }
            this.dialog.dismiss();
            cancel(true);
            File file = new File(this.destination);
            if (file.exists()) {
                file.delete();
            }
            myHandler();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onProgressUpdate(Integer... numArr) {
            Runnable runnable;
            Handler handler = this.handler;
            if (handler != null && (runnable = this.runnable) != null) {
                handler.removeCallbacks(runnable);
            }
            myHandler();
            this.layoutConnecting.setVisibility(8);
            this.layoutDownloading.setVisibility(0);
            this.seekBar.setProgress(numArr[0].intValue());
            double size = Utils.size(this.fileSize);
            double intValue = numArr[0].intValue();
            Double.isNaN(intValue);
            String format = String.format("%.02f", Double.valueOf((size * intValue) / 100.0d));
            String format2 = String.format("%.02f", Double.valueOf(Utils.size(this.fileSize)));
            this.outofMB.setText("( " + format + " / " + format2 + " ) MB");
            TextView textView = this.outof;
            StringBuilder sb = new StringBuilder();
            sb.append(numArr[0]);
            sb.append("/100");
            textView.setText(sb.toString());
            if (this.seekBar.getProgress() == this.seekBar.getMax()) {
                this.dialog.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Long l) {
            Runnable runnable;
            super.onPostExecute((DownloadHafizi) l);
            Handler handler = this.handler;
            if (handler != null && (runnable = this.runnable) != null) {
                handler.removeCallbacks(runnable);
            }
            new UnzipHafizi(this.activity, this.destination, this.folder, this.isfromMainActivity).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    /* loaded from: classes.dex */
    public static class UnzipHafizi extends AsyncTask<String, Integer, Long> {
        Activity activity;
        String destination;
        String folder;
        boolean isfromMainActivity;
        ProgressDialog mProgressDialog;

        public UnzipHafizi(Activity activity, String str, String str2, boolean z) {
            this.activity = activity;
            this.destination = str;
            this.folder = str2;
            this.isfromMainActivity = z;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(this.activity);
            this.mProgressDialog = progressDialog;
            progressDialog.setMessage("Preparing....");
            this.mProgressDialog.setCancelable(false);
            this.mProgressDialog.show();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Long doInBackground(String... strArr) {
            Utils.unzip(this.activity, this.destination, this.folder, this.isfromMainActivity);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Long l) {
            super.onPostExecute((UnzipHafizi) l);
            this.mProgressDialog.dismiss();
            File file = new File(this.destination);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class DownloadAudio extends AsyncTask<String, Integer, String> {
        Activity activity;
        String destination;
        Dialog dialog;
        String downloadUrl;
        private double fileSize;
        String folder;
        private Handler handler;
        ImageView ivClose;
        LinearLayout layoutConnecting;
        LinearLayout layoutDownloading;
        TextView outof;
        TextView outofMB;
        private Runnable runnable;
        SeekBar seekBar;

        public DownloadAudio(Activity activity, String str, String str2, String str3) {
            this.activity = activity;
            this.downloadUrl = str;
            this.destination = str2;
            this.folder = str3;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            Dialog dialog = new Dialog(this.activity);
            this.dialog = dialog;
            dialog.requestWindowFeature(1);
            this.dialog.setContentView(R.layout.downloading);
            this.dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.dialog.setCancelable(false);
            TextView textView = (TextView) this.dialog.findViewById(R.id.tvChangeTranslator);
            this.layoutConnecting = (LinearLayout) this.dialog.findViewById(R.id.layoutConnecting);
            this.layoutDownloading = (LinearLayout) this.dialog.findViewById(R.id.layoutDownloading);
            SeekBar seekBar = (SeekBar) this.dialog.findViewById(R.id.seekBar);
            this.seekBar = seekBar;
            seekBar.setProgress(0);
            this.seekBar.setMax(100);
            this.seekBar.setOnTouchListener(new View.OnTouchListener() { // from class: com.muslim.necessary.utils.Utils.DownloadAudio.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
            TextView textView2 = (TextView) this.dialog.findViewById(R.id.out_of_mb);
            this.outofMB = textView2;
            textView2.setText("Connecting with server...");
            TextView textView3 = (TextView) this.dialog.findViewById(R.id.outof);
            this.outof = textView3;
            textView3.setText("0/100");
            ImageView imageView = (ImageView) this.dialog.findViewById(R.id.iv_close);
            this.ivClose = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.muslim.necessary.utils.Utils.DownloadAudio.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Constants.CANCEL_DOWNLOAD = true;
                    Constants.CLOSE_DOWNLOAD = true;
                    if (DownloadAudio.this.handler != null && DownloadAudio.this.runnable != null) {
                        DownloadAudio.this.handler.removeCallbacks(DownloadAudio.this.runnable);
                    }
                    DownloadAudio.this.dialog.dismiss();
                    DownloadAudio.this.cancel(true);
                    File file = new File(DownloadAudio.this.destination);
                    if (file.exists()) {
                        file.delete();
                    }
                }
            });
            myHandler();
            this.dialog.show();
        }

        private void myHandler() {
            this.handler = new Handler();
            Runnable runnable = new Runnable() { // from class: com.muslim.necessary.utils.Utils.DownloadAudio.3
                @Override // java.lang.Runnable
                public void run() {
                    if (!Constants.CANCEL_DOWNLOAD) {
                        Toast.makeText(DownloadAudio.this.activity, "Server not responding !!!\nTry Later......\nMaybe your internet speed is too slow !!!", 1).show();
                    }
                    Constants.CANCEL_DOWNLOAD = false;
                    DownloadAudio.this.dialog.dismiss();
                    DownloadAudio.this.cancel(true);
                    File file = new File(DownloadAudio.this.destination);
                    if (file.exists()) {
                        file.delete();
                    }
                }
            };
            this.runnable = runnable;
            this.handler.postDelayed(runnable, 30000L);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public String doInBackground(String... strArr) {
            try {
                Log.v("KURKUR", "NO FOOD");
                URL url = new URL(this.downloadUrl);
                Log.v("KURKUR attachmentLinkDownload", this.downloadUrl);
                URLConnection openConnection = url.openConnection();
                openConnection.connect();
                int contentLength = openConnection.getContentLength();
                this.fileSize = openConnection.getContentLength();
                Log.v("KURKUR lenghtOfFile", contentLength + "");
                if (isCancelled()) {
                    File file = new File(this.destination);
                    if (file.exists()) {
                        file.delete();
                    }
                    publishProgress(100);
                    return null;
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
                FileOutputStream fileOutputStream = new FileOutputStream(this.destination);
                byte[] bArr = new byte[1024];
                long j = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        j += read;
                        FileOutputStream fileOutputStream2 = fileOutputStream;
                        publishProgress(Integer.valueOf((int) ((100 * j) / contentLength)));
                        fileOutputStream2.write(bArr, 0, read);
                        Log.v("KURKUR total", j + "");
                        fileOutputStream = fileOutputStream2;
                    } else {
                        FileOutputStream fileOutputStream3 = fileOutputStream;
                        fileOutputStream3.flush();
                        fileOutputStream3.close();
                        bufferedInputStream.close();
                        return null;
                    }
                }
            } catch (FileNotFoundException e) {
                this.activity.runOnUiThread(new Runnable() { // from class: com.muslim.necessary.utils.Utils.DownloadAudio.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!Constants.CLOSE_DOWNLOAD) {
                            Toast.makeText(DownloadAudio.this.activity, "An unexpected error occured while downloading...\nPlease reconnect your internet connection...", 1).show();
                        } else {
                            Constants.CLOSE_DOWNLOAD = false;
                        }
                    }
                });
                e.printStackTrace();
                myHandlerCancelDownload();
                return null;
            } catch (MalformedURLException e2) {
                this.activity.runOnUiThread(new Runnable() { // from class: com.muslim.necessary.utils.Utils.DownloadAudio.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!Constants.CLOSE_DOWNLOAD) {
                            Toast.makeText(DownloadAudio.this.activity, "An unexpected error occured while downloading...\nPlease reconnect your internet connection...", 1).show();
                        } else {
                            Constants.CLOSE_DOWNLOAD = false;
                        }
                    }
                });
                e2.printStackTrace();
                myHandlerCancelDownload();
                return null;
            } catch (IOException e3) {
                this.activity.runOnUiThread(new Runnable() { // from class: com.muslim.necessary.utils.Utils.DownloadAudio.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!Constants.CLOSE_DOWNLOAD) {
                            Toast.makeText(DownloadAudio.this.activity, "An unexpected error occured while downloading...\nPlease reconnect your internet connection...", 1).show();
                        } else {
                            Constants.CLOSE_DOWNLOAD = false;
                        }
                    }
                });
                e3.printStackTrace();
                myHandlerCancelDownload();
                return null;
            }
        }

        private void myHandlerCancelDownload() {
            Runnable runnable;
            Constants.CANCEL_DOWNLOAD = false;
            Handler handler = this.handler;
            if (handler != null && (runnable = this.runnable) != null) {
                handler.removeCallbacks(runnable);
            }
            this.dialog.dismiss();
            cancel(true);
            File file = new File(this.destination);
            if (file.exists()) {
                file.delete();
            }
            myHandler();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onProgressUpdate(Integer... numArr) {
            Runnable runnable;
            Handler handler = this.handler;
            if (handler != null && (runnable = this.runnable) != null) {
                handler.removeCallbacks(runnable);
            }
            myHandler();
            this.layoutConnecting.setVisibility(8);
            this.layoutDownloading.setVisibility(0);
            this.seekBar.setProgress(numArr[0].intValue());
            double size = Utils.size(this.fileSize);
            double intValue = numArr[0].intValue();
            Double.isNaN(intValue);
            String format = String.format("%.02f", Double.valueOf((size * intValue) / 100.0d));
            String format2 = String.format("%.02f", Double.valueOf(Utils.size(this.fileSize)));
            this.outofMB.setText("( " + format + " / " + format2 + " ) MB");
            TextView textView = this.outof;
            StringBuilder sb = new StringBuilder();
            sb.append(numArr[0]);
            sb.append("/100");
            textView.setText(sb.toString());
            if (this.seekBar.getProgress() == this.seekBar.getMax()) {
                this.dialog.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            Runnable runnable;
            super.onPostExecute((DownloadAudio) str);
            Handler handler = this.handler;
            if (handler != null && (runnable = this.runnable) != null) {
                handler.removeCallbacks(runnable);
            }
            Log.d("DREGGooG", "onPostExecute");
            new UnzipAudio(this.activity, this.destination, this.folder).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    /* loaded from: classes.dex */
    public static class UnzipAudio extends AsyncTask<String, Integer, Long> {
        Activity activity;
        String destination;
        String folder;
        ProgressDialog mProgressDialog;

        public UnzipAudio(Activity activity, String str, String str2) {
            this.activity = activity;
            this.destination = str;
            this.folder = str2;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(this.activity);
            this.mProgressDialog = progressDialog;
            progressDialog.setMessage("Preparing....");
            this.mProgressDialog.setCancelable(false);
            this.mProgressDialog.show();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Long doInBackground(String... strArr) {
            Utils.unzipSura(this.activity, this.destination, this.folder);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Long l) {
            super.onPostExecute((UnzipAudio) l);
            this.mProgressDialog.dismiss();
            File file = new File(this.destination);
            if (file.exists()) {
                file.delete();
            }
            try {
                if (Constants.SINGLE_PLAY) {
                    if (Constants.IS_FROM == 0) {
                        DetailsListAdapter.singlePlay(this.activity);
                        return;
                    } else if (Constants.IS_FROM == 1) {
                        SuraBookmarkDetailsListAdapter.singlePlay(this.activity);
                        return;
                    } else if (Constants.IS_FROM == 2) {
                        VersesBookmarkDetailsListAdapter.singlePlay(this.activity);
                        return;
                    } else {
                        return;
                    }
                }
                ViewPagerFragment.ivPlayClick(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String getAudioLink(String str) {
        if (str.length() == 1) {
            str = "00" + str;
        } else if (str.length() == 2) {
            str = "0" + str;
        }
        String string = getString(QuranApplication.quranApplication, Constants.KEY_RECEITER);
        char c = 65535;
        switch (string.hashCode()) {
            case -1807620119:
                if (string.equals(Constants.RECEITER_SUDAIS)) {
                    c = 0;
                    break;
                }
                break;
            case 742862551:
                if (string.equals(Constants.RECEITER_AL_AFASY)) {
                    c = 2;
                    break;
                }
                break;
            case 1176639945:
                if (string.equals(Constants.RECEITER_ABDUL_BASET)) {
                    c = 3;
                    break;
                }
                break;
            case 2131713586:
                if (string.equals(Constants.RECEITER_GHAMDI)) {
                    c = 1;
                    break;
                }
                break;
        }
        String str2 = "https://everyayah.com/data/Abdurrahmaan_As-Sudais_64kbps/zips/";
        if (c != 0) {
            if (c == 1) {
                str2 = "https://everyayah.com/data/Ghamadi_40kbps/zips/";
            } else if (c == 2) {
                str2 = "https://everyayah.com/data/Alafasy_64kbps/zips/";
            } else if (c == 3) {
                str2 = "https://everyayah.com/data/Abdul_Basit_Murattal_64kbps/zips/";
            }
        }
        return str2 + str + ".zip";
    }

    public static File getRoot() {
        if (Build.VERSION.SDK_INT < 29) {
            return Environment.getExternalStorageDirectory();
        }
        return QuranApplication.quranApplication.getExternalFilesDir(null);
    }
}
