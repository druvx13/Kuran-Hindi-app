package com.recyclerview.viewpager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class ViewUtils {
    public static View getCenterXChild(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (isChildInCenterX(recyclerView, childAt)) {
                    return childAt;
                }
            }
            return null;
        }
        return null;
    }

    public static int getCenterXChildPosition(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (isChildInCenterX(recyclerView, childAt)) {
                    return recyclerView.getChildAdapterPosition(childAt);
                }
            }
        }
        return childCount;
    }

    public static View getCenterYChild(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (isChildInCenterY(recyclerView, childAt)) {
                    return childAt;
                }
            }
            return null;
        }
        return null;
    }

    public static int getCenterYChildPosition(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (isChildInCenterY(recyclerView, childAt)) {
                    return recyclerView.getChildAdapterPosition(childAt);
                }
            }
        }
        return childCount;
    }

    public static boolean isChildInCenterX(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        recyclerView.getLocationOnScreen(iArr);
        int width = iArr[0] + (recyclerView.getWidth() / 2);
        if (childCount > 0) {
            view.getLocationOnScreen(iArr2);
            if (iArr2[0] <= width && iArr2[0] + view.getWidth() >= width) {
                return true;
            }
        }
        return false;
    }

    public static boolean isChildInCenterY(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        recyclerView.getLocationOnScreen(iArr);
        int height = iArr[1] + (recyclerView.getHeight() / 2);
        if (childCount > 0) {
            view.getLocationOnScreen(iArr2);
            return iArr2[1] <= height && iArr2[1] + view.getHeight() >= height;
        }
        return false;
    }
}
