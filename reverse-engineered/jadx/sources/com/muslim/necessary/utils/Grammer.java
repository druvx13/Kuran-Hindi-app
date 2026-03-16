package com.muslim.necessary.utils;

import android.content.Context;
import com.muslim.quran_hindi.R;
/* loaded from: classes.dex */
public class Grammer {
    public static String arabic(Context context, String str) {
        if (str.contains("نَّ")) {
            str = str.replace("نَّ", "<font color='" + context.getResources().getColor(R.color.gunna) + "'>نَّ</font>");
        }
        if (str.contains("مِن شَ")) {
            str = str.replace("ن شَ", "<font color='" + context.getResources().getColor(R.color.ikhfa) + "'>ن شَ</font>");
        }
        if (str.contains("قْ")) {
            str = str.replace("قْ", "<font color='" + context.getResources().getColor(R.color.qalqala) + "'>قْ</font>");
        }
        if (getlast2words(str).startsWith("ق")) {
            str = str.substring(0, str.length() - 2) + "<font color='" + context.getResources().getColor(R.color.qalqala) + "'>" + getlast2words(str) + "</font>";
        }
        if (getlast3words(str).startsWith("ق")) {
            str = str.substring(0, str.length() - 3) + "<font color='" + context.getResources().getColor(R.color.qalqala) + "'>" + getlast3words(str) + "</font>";
        }
        if (str.contains("طْ")) {
            str = str.replace("طْ", "<font color='" + context.getResources().getColor(R.color.qalqala) + "'>طْ</font>");
        }
        if (getlast2words(str).startsWith("ط")) {
            str = str.substring(0, str.length() - 2) + "<font color='" + context.getResources().getColor(R.color.qalqala) + "'>" + getlast2words(str) + "</font>";
        }
        if (getlast3words(str).startsWith("ط")) {
            str = str.substring(0, str.length() - 3) + "<font color='" + context.getResources().getColor(R.color.qalqala) + "'>" + getlast3words(str) + "</font>";
        }
        if (str.contains("بْ")) {
            str = str.replace("بْ", "<font color='" + context.getResources().getColor(R.color.qalqala) + "'>بْ</font>");
        }
        if (getlast2words(str).startsWith("ب")) {
            str = str.substring(0, str.length() - 2) + "<font color='" + context.getResources().getColor(R.color.qalqala) + "'>" + getlast2words(str) + "</font>";
        }
        if (getlast3words(str).startsWith("ب")) {
            str = str.substring(0, str.length() - 3) + "<font color='" + context.getResources().getColor(R.color.qalqala) + "'>" + getlast3words(str) + "</font>";
        }
        if (str.contains("جْ")) {
            str = str.replace("جْ", "<font color='" + context.getResources().getColor(R.color.qalqala) + "'>جْ</font>");
        }
        if (getlast2words(str).startsWith("د")) {
            str = str.substring(0, str.length() - 2) + "<font color='" + context.getResources().getColor(R.color.qalqala) + "'>" + getlast2words(str) + "</font>";
        }
        if (getlast3words(str).startsWith("د")) {
            str = str.substring(0, str.length() - 3) + "<font color='" + context.getResources().getColor(R.color.qalqala) + "'>" + getlast3words(str) + "</font>";
        }
        if (str.contains("دْ")) {
            str = str.replace("دْ", "<font color='" + context.getResources().getColor(R.color.qalqala) + "'>دْ</font>");
        }
        if (getlast2words(str).startsWith("د")) {
            str = str.substring(0, str.length() - 2) + "<font color='" + context.getResources().getColor(R.color.qalqala) + "'>" + getlast2words(str) + "</font>";
        }
        if (getlast3words(str).startsWith("د")) {
            return str.substring(0, str.length() - 3) + "<font color='" + context.getResources().getColor(R.color.qalqala) + "'>" + getlast3words(str) + "</font>";
        }
        return str;
    }

    private static String getlast2words(String str) {
        return str.length() == 2 ? str : str.length() > 2 ? str.substring(str.length() - 2) : "";
    }

    private static String getlast3words(String str) {
        return str.length() == 3 ? str : str.length() > 3 ? str.substring(str.length() - 3) : "";
    }
}
