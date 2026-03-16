package com.github.clans.fab;

import android.content.Context;
import android.os.Build;
/* loaded from: classes.dex */
final class Util {
    private Util() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int dpToPx(Context context, float f) {
        return Math.round(f * context.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasJellyBean() {
        return Build.VERSION.SDK_INT >= 16;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasLollipop() {
        return Build.VERSION.SDK_INT >= 21;
    }
}
