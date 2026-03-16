package com.recyclerview.fastscroll.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.muslim.quran_hindi.R;
import com.recyclerview.fastscroll.interfaces.OnFastScrollStateChangeListener;
import com.recyclerview.fastscroll.utils.Utils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class FastScroller {
    private static final int DEFAULT_AUTO_HIDE_DELAY = 1500;
    private boolean mAnimatingShow;
    private Animator mAutoHideAnimator;
    private int mAutoHideDelay;
    private boolean mAutoHideEnabled;
    private final Runnable mHideRunnable;
    private boolean mIsDragging;
    private int mLastY;
    private FastScrollPopup mPopup;
    private FastScrollRecyclerView mRecyclerView;
    private Paint mThumb;
    private int mThumbActiveColor;
    private int mThumbHeight;
    private int mThumbInactiveColor;
    private boolean mThumbInactiveState;
    private int mTouchInset;
    private int mTouchOffset;
    private int mTouchSlop;
    private Paint mTrack;
    private int mWidth;
    private Utils utils;
    private Rect mTmpRect = new Rect();
    private Rect mInvalidateRect = new Rect();
    private Rect mInvalidateTmpRect = new Rect();
    private Point mThumbPosition = new Point(-1, -1);
    private Point mOffset = new Point(0, 0);

    
    public @interface PopupPosition {
        public static final int ADJACENT = 0;
        public static final int CENTER = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    
    public @interface PopupTextVerticalAlignmentMode {
        public static final int FONT_METRICS = 1;
        public static final int TEXT_BOUNDS = 0;
    }

    
    public @interface TrackPosition {
        public static final int LEFT = 1;
        public static final int RIGHT = 0;
    }

    public FastScroller(Context context, FastScrollRecyclerView fastScrollRecyclerView, AttributeSet attributeSet) {
        Resources resources = context.getResources();
        this.mRecyclerView = fastScrollRecyclerView;
        this.mPopup = new FastScrollPopup(resources, fastScrollRecyclerView);
        this.mThumbHeight = Utils.toPixels(resources, 48.0f);
        this.mWidth = Utils.toPixels(resources, 8.0f);
        this.mTouchInset = Utils.toPixels(resources, -24.0f);
        this.mThumb = new Paint(1);
        this.mTrack = new Paint(1);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FastScrollRecyclerView, 0, 0);
        try {
            this.mWidth = obtainStyledAttributes.getDimensionPixelSize(15, this.mWidth);
            this.mThumbHeight = obtainStyledAttributes.getDimensionPixelSize(13, this.mThumbHeight);
            obtainStyledAttributes.getInteger(14, 0);
            this.mAutoHideEnabled = obtainStyledAttributes.getBoolean(0, true);
            this.mAutoHideDelay = obtainStyledAttributes.getInteger(1, 1500);
            this.mThumbInactiveState = obtainStyledAttributes.getBoolean(2, true);
            this.mThumbActiveColor = obtainStyledAttributes.getColor(9, 2030043136);
            this.mThumbInactiveColor = obtainStyledAttributes.getColor(11, 2030043136);
            int color = obtainStyledAttributes.getColor(12, 671088640);
            int color2 = obtainStyledAttributes.getColor(4, ViewCompat.MEASURED_STATE_MASK);
            int color3 = obtainStyledAttributes.getColor(6, -1);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, Utils.toScreenPixels(resources, 44.0f));
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, Utils.toPixels(resources, 88.0f));
            int integer = obtainStyledAttributes.getInteger(8, 0);
            int integer2 = obtainStyledAttributes.getInteger(5, 0);
            this.mTrack.setColor(color);
            this.mThumb.setColor(this.mThumbInactiveState ? this.mThumbInactiveColor : this.mThumbActiveColor);
            this.mPopup.setBgColor(color2);
            this.mPopup.setTextColor(color3);
            this.mPopup.setTextSize(dimensionPixelSize);
            this.mPopup.setBackgroundSize(dimensionPixelSize2);
            this.mPopup.setPopupTextVerticalAlignmentMode(integer);
            this.mPopup.setPopupPosition(integer2);
            obtainStyledAttributes.recycle();
            this.mHideRunnable = new Runnable() { // from class: com.recyclerview.fastscroll.views.-$$Lambda$FastScroller$Jdpf83uNoh1bE6ktVcSwFYOvN9c
                @Override // java.lang.Runnable
                public final void run() {
                    FastScroller.this.lambda$new$0$FastScroller();
                }
            };
            this.mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.recyclerview.fastscroll.views.FastScroller.1
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    if (FastScroller.this.mRecyclerView.isInEditMode()) {
                        return;
                    }
                    FastScroller.this.show();
                }
            });
            if (this.mAutoHideEnabled) {
                postAutoHideDelayed();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public /* synthetic */ void lambda$new$0$FastScroller() {
        if (this.mIsDragging) {
            return;
        }
        Animator animator = this.mAutoHideAnimator;
        if (animator != null) {
            animator.cancel();
        }
        int[] iArr = new int[1];
        iArr[0] = (Utils.isScrollBarAtLeft() ? -1 : 1) * this.mWidth;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "offsetX", iArr);
        this.mAutoHideAnimator = ofInt;
        ofInt.setInterpolator(new FastOutLinearInInterpolator());
        this.mAutoHideAnimator.setDuration(200L);
        this.mAutoHideAnimator.start();
    }

    private Utils getUtils() {
        if (this.utils == null) {
            this.utils = new Utils();
        }
        return this.utils;
    }

    public int getThumbHeight() {
        return this.mThumbHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isDragging() {
        return this.mIsDragging;
    }

    public void handleTouchEvent(MotionEvent motionEvent, int i, int i2, int i3, OnFastScrollStateChangeListener onFastScrollStateChangeListener) {
        String scrollToPositionAtProgress;
        int action = motionEvent.getAction();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            if (isNearPoint(i, i2)) {
                this.mTouchOffset = i2 - this.mThumbPosition.y;
                return;
            }
            return;
        }
        if (action != 1) {
            if (action == 2) {
                if (!this.mIsDragging && isNearPoint(i, i2) && Math.abs(y - i2) > this.mTouchSlop) {
                    this.mRecyclerView.getParent().requestDisallowInterceptTouchEvent(true);
                    this.mIsDragging = true;
                    this.mTouchOffset += i3 - i2;
                    this.mPopup.animateVisibility(true);
                    if (onFastScrollStateChangeListener != null) {
                        onFastScrollStateChangeListener.onFastScrollStart();
                    }
                    if (this.mThumbInactiveState) {
                        this.mThumb.setColor(this.mThumbActiveColor);
                    }
                }
                if (this.mIsDragging) {
                    int i4 = this.mLastY;
                    if (i4 == 0 || Math.abs(i4 - y) >= this.mTouchSlop) {
                        this.mLastY = y;
                        boolean isLayoutManagerReversed = this.mRecyclerView.isLayoutManagerReversed();
                        int height = this.mRecyclerView.getHeight() - this.mThumbHeight;
                        float max = Math.max(0, Math.min(height, y - this.mTouchOffset)) / (this.mRecyclerView.getHeight() - this.mThumbHeight);
                        if (isLayoutManagerReversed) {
                            max = 1.0f - max;
                        }
                        scrollToPositionAtProgress = this.mRecyclerView.scrollToPositionAtProgress(max);
                        this.mPopup.setSectionName(scrollToPositionAtProgress);
                        this.mPopup.animateVisibility(!scrollToPositionAtProgress.isEmpty());
                        FastScrollRecyclerView fastScrollRecyclerView = this.mRecyclerView;
                        fastScrollRecyclerView.invalidate(this.mPopup.updateFastScrollerBounds(fastScrollRecyclerView, this.mThumbPosition.y));
                        return;
                    }
                    return;
                }
                return;
            } else if (action != 3) {
                return;
            }
        }
        this.mTouchOffset = 0;
        this.mLastY = 0;
        if (this.mIsDragging) {
            this.mIsDragging = false;
            this.mPopup.animateVisibility(false);
            if (onFastScrollStateChangeListener != null) {
                onFastScrollStateChangeListener.onFastScrollStop();
            }
        }
        if (this.mThumbInactiveState) {
            this.mThumb.setColor(this.mThumbInactiveColor);
        }
    }

    public void draw(Canvas canvas) {
        if (this.mThumbPosition.x < 0 || this.mThumbPosition.y < 0) {
            return;
        }
        canvas.drawRect(this.mThumbPosition.x + this.mOffset.x, this.mOffset.y + this.mRecyclerView.getPaddingTop(), this.mThumbPosition.x + this.mOffset.x + this.mWidth, (this.mRecyclerView.getHeight() + this.mOffset.y) - this.mRecyclerView.getPaddingBottom(), this.mTrack);
        canvas.drawRect(this.mThumbPosition.x + this.mOffset.x, this.mThumbPosition.y + this.mOffset.y, this.mThumbPosition.x + this.mOffset.x + this.mWidth, this.mThumbPosition.y + this.mOffset.y + this.mThumbHeight, this.mThumb);
        this.mPopup.draw(canvas);
    }

    private boolean isNearPoint(int i, int i2) {
        this.mTmpRect.set(this.mThumbPosition.x, this.mThumbPosition.y, this.mThumbPosition.x + this.mWidth, this.mThumbPosition.y + this.mThumbHeight);
        Rect rect = this.mTmpRect;
        int i3 = this.mTouchInset;
        rect.inset(i3, i3);
        return this.mTmpRect.contains(i, i2);
    }

    public void setThumbPosition(int i, int i2) {
        if (this.mThumbPosition.x == i && this.mThumbPosition.y == i2) {
            return;
        }
        this.mInvalidateRect.set(this.mThumbPosition.x + this.mOffset.x, this.mOffset.y, this.mThumbPosition.x + this.mOffset.x + this.mWidth, this.mRecyclerView.getHeight() + this.mOffset.y);
        this.mThumbPosition.set(i, i2);
        this.mInvalidateTmpRect.set(this.mThumbPosition.x + this.mOffset.x, this.mOffset.y, this.mThumbPosition.x + this.mOffset.x + this.mWidth, this.mRecyclerView.getHeight() + this.mOffset.y);
        this.mInvalidateRect.union(this.mInvalidateTmpRect);
        this.mRecyclerView.invalidate(this.mInvalidateRect);
    }

    public void setOffset(int i, int i2) {
        if (this.mOffset.x == i && this.mOffset.y == i2) {
            return;
        }
        this.mInvalidateRect.set(this.mThumbPosition.x + this.mOffset.x, this.mOffset.y, this.mThumbPosition.x + this.mOffset.x + this.mWidth, this.mRecyclerView.getHeight() + this.mOffset.y);
        this.mOffset.set(i, i2);
        this.mInvalidateTmpRect.set(this.mThumbPosition.x + this.mOffset.x, this.mOffset.y, this.mThumbPosition.x + this.mOffset.x + this.mWidth, this.mRecyclerView.getHeight() + this.mOffset.y);
        this.mInvalidateRect.union(this.mInvalidateTmpRect);
        this.mRecyclerView.invalidate(this.mInvalidateRect);
    }

    public void setOffsetX(int i) {
        setOffset(i, this.mOffset.y);
    }

    public int getOffsetX() {
        return this.mOffset.x;
    }

    public void show() {
        if (!this.mAnimatingShow) {
            Animator animator = this.mAutoHideAnimator;
            if (animator != null) {
                animator.cancel();
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "offsetX", 0);
            this.mAutoHideAnimator = ofInt;
            ofInt.setInterpolator(new LinearOutSlowInInterpolator());
            this.mAutoHideAnimator.setDuration(150L);
            this.mAutoHideAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.recyclerview.fastscroll.views.FastScroller.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator2) {
                    super.onAnimationCancel(animator2);
                    FastScroller.this.mAnimatingShow = false;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    super.onAnimationEnd(animator2);
                    FastScroller.this.mAnimatingShow = false;
                }
            });
            this.mAnimatingShow = true;
            this.mAutoHideAnimator.start();
        }
        if (this.mAutoHideEnabled) {
            postAutoHideDelayed();
        } else {
            cancelAutoHide();
        }
    }

    protected void postAutoHideDelayed() {
        if (this.mRecyclerView != null) {
            cancelAutoHide();
            this.mRecyclerView.postDelayed(this.mHideRunnable, this.mAutoHideDelay);
        }
    }

    protected void cancelAutoHide() {
        FastScrollRecyclerView fastScrollRecyclerView = this.mRecyclerView;
        if (fastScrollRecyclerView != null) {
            fastScrollRecyclerView.removeCallbacks(this.mHideRunnable);
        }
    }

    public void setThumbColor(int i) {
        this.mThumbActiveColor = i;
        this.mThumb.setColor(i);
        this.mRecyclerView.invalidate(this.mInvalidateRect);
    }

    public void setTrackColor(int i) {
        this.mTrack.setColor(i);
        this.mRecyclerView.invalidate(this.mInvalidateRect);
    }

    public void setPopupBgColor(int i) {
        this.mPopup.setBgColor(i);
    }

    public void setPopupTextColor(int i) {
        this.mPopup.setTextColor(i);
    }

    public void setPopupTypeface(Typeface typeface) {
        this.mPopup.setTypeface(typeface);
    }

    public void setPopupTextSize(int i) {
        this.mPopup.setTextSize(i);
    }

    public void setAutoHideDelay(int i) {
        this.mAutoHideDelay = i;
        if (this.mAutoHideEnabled) {
            postAutoHideDelayed();
        }
    }

    public void setAutoHideEnabled(boolean z) {
        this.mAutoHideEnabled = z;
        if (z) {
            postAutoHideDelayed();
        } else {
            cancelAutoHide();
        }
    }

    public void setPopupPosition(int i) {
        this.mPopup.setPopupPosition(i);
    }

    public void setThumbInactiveColor(int i) {
        this.mThumbInactiveColor = i;
        enableThumbInactiveColor(true);
    }

    public void enableThumbInactiveColor(boolean z) {
        this.mThumbInactiveState = z;
        this.mThumb.setColor(z ? this.mThumbInactiveColor : this.mThumbActiveColor);
    }

    @Deprecated
    public void setThumbInactiveColor(boolean z) {
        enableThumbInactiveColor(z);
    }
}
