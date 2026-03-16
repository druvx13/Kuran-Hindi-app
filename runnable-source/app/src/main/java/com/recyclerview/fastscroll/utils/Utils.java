package com.recyclerview.fastscroll.utils;

import android.content.res.Resources;
import android.util.TypedValue;

public class Utils {
    private static boolean isScrollBarAtLeft;

    public static int toPixels(Resources resources, float f) {
        return (int) (f * resources.getDisplayMetrics().density);
    }

    public static int toScreenPixels(Resources resources, float f) {
        return (int) TypedValue.applyDimension(2, f, resources.getDisplayMetrics());
    }

    public static boolean isScrollBarAtLeft() {
        return isScrollBarAtLeft;
    }

    public static void setScrollbarToLeft(boolean z) {
        isScrollBarAtLeft = z;
    }
}
