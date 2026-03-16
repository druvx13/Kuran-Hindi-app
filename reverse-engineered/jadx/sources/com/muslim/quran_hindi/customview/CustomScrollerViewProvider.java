package com.muslim.quran_hindi.customview;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.futuremind.recyclerviewfastscroll.RecyclerViewScrollListener;
import com.futuremind.recyclerviewfastscroll.Utils;
import com.futuremind.recyclerviewfastscroll.viewprovider.DefaultBubbleBehavior;
import com.futuremind.recyclerviewfastscroll.viewprovider.ScrollerViewProvider;
import com.futuremind.recyclerviewfastscroll.viewprovider.ViewBehavior;
import com.futuremind.recyclerviewfastscroll.viewprovider.VisibilityAnimationManager;
import com.muslim.quran_hindi.R;
import com.muslim.quran_hindi.customview.CustomHandleBehavior;
/* loaded from: classes.dex */
public class CustomScrollerViewProvider extends ScrollerViewProvider {
    private TextView bubble;
    private View handle;

    private static ShapeDrawable drawCircle(int i, int i2, int i3) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicHeight(i2);
        shapeDrawable.setIntrinsicWidth(i);
        shapeDrawable.getPaint().setColor(i3);
        return shapeDrawable;
    }

    @Override // com.futuremind.recyclerviewfastscroll.viewprovider.ScrollerViewProvider
    public View provideHandleView(ViewGroup viewGroup) {
        this.handle = new View(getContext());
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.custom_handle_size);
        this.handle.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        Utils.setBackground(this.handle, drawCircle(dimensionPixelSize, dimensionPixelSize, ContextCompat.getColor(getContext(), R.color.custom_handle_color)));
        this.handle.setVisibility(4);
        return this.handle;
    }

    @Override // com.futuremind.recyclerviewfastscroll.viewprovider.ScrollerViewProvider
    public View provideBubbleView(ViewGroup viewGroup) {
        this.bubble = new TextView(getContext());
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.custom_bubble_size);
        this.bubble.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        Utils.setBackground(this.bubble, drawCircle(dimensionPixelSize, dimensionPixelSize, ContextCompat.getColor(getContext(), R.color.custom_bubble_color)));
        this.bubble.setVisibility(4);
        this.bubble.setGravity(17);
        this.bubble.setTextColor(ContextCompat.getColor(getContext(), 17170443));
        getScroller().addScrollerListener(new RecyclerViewScrollListener.ScrollerListener() { // from class: com.muslim.quran_hindi.customview.CustomScrollerViewProvider.1
            @Override // com.futuremind.recyclerviewfastscroll.RecyclerViewScrollListener.ScrollerListener
            public void onScroll(float f) {
                CustomScrollerViewProvider.this.bubble.setRotation(f * 360.0f);
            }
        });
        return this.bubble;
    }

    @Override // com.futuremind.recyclerviewfastscroll.viewprovider.ScrollerViewProvider
    public TextView provideBubbleTextView() {
        return this.bubble;
    }

    @Override // com.futuremind.recyclerviewfastscroll.viewprovider.ScrollerViewProvider
    public int getBubbleOffset() {
        float width;
        int width2;
        if (getScroller().isVertical()) {
            width = this.handle.getHeight() / 2.0f;
            width2 = this.bubble.getHeight();
        } else {
            width = this.handle.getWidth() / 2.0f;
            width2 = this.bubble.getWidth();
        }
        return (int) (width - (width2 / 2.0f));
    }

    @Override // com.futuremind.recyclerviewfastscroll.viewprovider.ScrollerViewProvider
    protected ViewBehavior provideHandleBehavior() {
        return new CustomHandleBehavior(new VisibilityAnimationManager.Builder(this.handle).withHideDelay(2000).build(), new CustomHandleBehavior.HandleAnimationManager.Builder(this.handle).withGrabAnimator(R.animator.custom_grab).withReleaseAnimator(R.animator.custom_release).build());
    }

    @Override // com.futuremind.recyclerviewfastscroll.viewprovider.ScrollerViewProvider
    protected ViewBehavior provideBubbleBehavior() {
        return new DefaultBubbleBehavior(new VisibilityAnimationManager.Builder(this.bubble).withHideDelay(0).build());
    }
}
