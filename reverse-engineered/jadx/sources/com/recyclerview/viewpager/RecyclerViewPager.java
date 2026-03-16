package com.recyclerview.viewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import androidx.core.text.TextUtilsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.muslim.quran_hindi.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class RecyclerViewPager extends RecyclerView {
    public static final boolean DEBUG = false;
    boolean isInertia;
    View mCurView;
    int mFirstTopWhenDragging;
    int mFisrtLeftWhenDragging;
    private float mFlingFactor;
    private boolean mHasCalledOnPageChanged;
    private float mLastY;
    int mMaxLeftWhenDragging;
    int mMaxTopWhenDragging;
    private float mMillisecondsPerInch;
    int mMinLeftWhenDragging;
    int mMinTopWhenDragging;
    boolean mNeedAdjust;
    private List<OnPageChangedListener> mOnPageChangedListeners;
    private int mPositionBeforeScroll;
    private int mPositionOnTouchDown;
    private boolean mSinglePageFling;
    private int mSmoothScrollTargetPosition;
    private float mTouchSpan;
    private float mTriggerOffset;
    private RecyclerViewPagerAdapter<?> mViewPagerAdapter;
    float minSlideDistance;
    private boolean reverseLayout;
    PointF touchStartPoint;

    /* loaded from: classes.dex */
    public interface OnPageChangedListener {
        void OnPageChanged(int i, int i2);
    }

    private int safeTargetPosition(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        return i >= i2 ? i2 - 1 : i;
    }

    public RecyclerViewPager(Context context) {
        this(context, null);
    }

    public RecyclerViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTriggerOffset = 0.25f;
        this.mFlingFactor = 0.15f;
        this.mMillisecondsPerInch = 25.0f;
        this.mSmoothScrollTargetPosition = -1;
        this.mPositionBeforeScroll = -1;
        this.mMaxLeftWhenDragging = Integer.MIN_VALUE;
        this.mMinLeftWhenDragging = Integer.MAX_VALUE;
        this.mMaxTopWhenDragging = Integer.MIN_VALUE;
        this.mMinTopWhenDragging = Integer.MAX_VALUE;
        this.mPositionOnTouchDown = -1;
        this.mHasCalledOnPageChanged = true;
        this.reverseLayout = false;
        initAttrs(context, attributeSet, i);
        setNestedScrollingEnabled(false);
        this.minSlideDistance = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerViewPager, i, 0);
        this.mFlingFactor = obtainStyledAttributes.getFloat(0, 0.15f);
        this.mTriggerOffset = obtainStyledAttributes.getFloat(4, 0.25f);
        this.mSinglePageFling = obtainStyledAttributes.getBoolean(3, this.mSinglePageFling);
        this.isInertia = obtainStyledAttributes.getBoolean(1, false);
        this.mMillisecondsPerInch = obtainStyledAttributes.getFloat(2, 25.0f);
        obtainStyledAttributes.recycle();
    }

    public void setFlingFactor(float f) {
        this.mFlingFactor = f;
    }

    public float getFlingFactor() {
        return this.mFlingFactor;
    }

    public void setTriggerOffset(float f) {
        this.mTriggerOffset = f;
    }

    public float getTriggerOffset() {
        return this.mTriggerOffset;
    }

    public void setSinglePageFling(boolean z) {
        this.mSinglePageFling = z;
    }

    public boolean isSinglePageFling() {
        return this.mSinglePageFling;
    }

    public boolean isInertia() {
        return this.isInertia;
    }

    public void setInertia(boolean z) {
        this.isInertia = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            Field declaredField = parcelable.getClass().getDeclaredField("mLayoutState");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(parcelable);
            Field declaredField2 = obj.getClass().getDeclaredField("mAnchorOffset");
            Field declaredField3 = obj.getClass().getDeclaredField("mAnchorPosition");
            declaredField3.setAccessible(true);
            declaredField2.setAccessible(true);
            if (declaredField2.getInt(obj) > 0) {
                declaredField3.set(obj, Integer.valueOf(declaredField3.getInt(obj) - 1));
            } else if (declaredField2.getInt(obj) < 0) {
                declaredField3.set(obj, Integer.valueOf(declaredField3.getInt(obj) + 1));
            }
            declaredField2.setInt(obj, 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerViewPagerAdapter ensureRecyclerViewPagerAdapter = ensureRecyclerViewPagerAdapter(adapter);
        this.mViewPagerAdapter = ensureRecyclerViewPagerAdapter;
        super.setAdapter(ensureRecyclerViewPagerAdapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void swapAdapter(RecyclerView.Adapter adapter, boolean z) {
        RecyclerViewPagerAdapter ensureRecyclerViewPagerAdapter = ensureRecyclerViewPagerAdapter(adapter);
        this.mViewPagerAdapter = ensureRecyclerViewPagerAdapter;
        super.swapAdapter(ensureRecyclerViewPagerAdapter, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public RecyclerView.Adapter getAdapter() {
        RecyclerViewPagerAdapter<?> recyclerViewPagerAdapter = this.mViewPagerAdapter;
        if (recyclerViewPagerAdapter != null) {
            return recyclerViewPagerAdapter.mAdapter;
        }
        return null;
    }

    public RecyclerViewPagerAdapter getWrapperAdapter() {
        return this.mViewPagerAdapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        super.setLayoutManager(layoutManager);
        if (layoutManager instanceof LinearLayoutManager) {
            this.reverseLayout = ((LinearLayoutManager) layoutManager).getReverseLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        float f = this.mFlingFactor;
        boolean fling = super.fling((int) (i * f), (int) (i2 * f));
        if (fling) {
            if (getLayoutManager().canScrollHorizontally()) {
                adjustPositionX(i);
            } else {
                adjustPositionY(i2);
            }
        }
        return fling;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollToPosition(int i) {
        if (this.mPositionBeforeScroll < 0) {
            this.mPositionBeforeScroll = getCurrentPosition();
        }
        this.mSmoothScrollTargetPosition = i;
        if (getLayoutManager() != null && (getLayoutManager() instanceof LinearLayoutManager)) {
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(getContext()) { // from class: com.recyclerview.viewpager.RecyclerViewPager.1
                @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public PointF computeScrollVectorForPosition(int i2) {
                    if (getLayoutManager() == null) {
                        return null;
                    }
                    return ((LinearLayoutManager) getLayoutManager()).computeScrollVectorForPosition(i2);
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    int rightDecorationWidth;
                    int bottomDecorationHeight;
                    if (getLayoutManager() == null) {
                        return;
                    }
                    int calculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
                    int calculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
                    if (calculateDxToMakeVisible > 0) {
                        rightDecorationWidth = calculateDxToMakeVisible - getLayoutManager().getLeftDecorationWidth(view);
                    } else {
                        rightDecorationWidth = calculateDxToMakeVisible + getLayoutManager().getRightDecorationWidth(view);
                    }
                    if (calculateDyToMakeVisible > 0) {
                        bottomDecorationHeight = calculateDyToMakeVisible - getLayoutManager().getTopDecorationHeight(view);
                    } else {
                        bottomDecorationHeight = calculateDyToMakeVisible + getLayoutManager().getBottomDecorationHeight(view);
                    }
                    int calculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((rightDecorationWidth * rightDecorationWidth) + (bottomDecorationHeight * bottomDecorationHeight)));
                    if (calculateTimeForDeceleration > 0) {
                        action.update(-rightDecorationWidth, -bottomDecorationHeight, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return RecyclerViewPager.this.mMillisecondsPerInch / displayMetrics.densityDpi;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public void onStop() {
                    super.onStop();
                    if (RecyclerViewPager.this.mOnPageChangedListeners != null) {
                        for (OnPageChangedListener onPageChangedListener : RecyclerViewPager.this.mOnPageChangedListeners) {
                            if (onPageChangedListener != null) {
                                onPageChangedListener.OnPageChanged(RecyclerViewPager.this.mPositionBeforeScroll, RecyclerViewPager.this.mSmoothScrollTargetPosition);
                            }
                        }
                    }
                    RecyclerViewPager.this.mHasCalledOnPageChanged = true;
                }
            };
            linearSmoothScroller.setTargetPosition(i);
            if (i == -1) {
                return;
            }
            getLayoutManager().startSmoothScroll(linearSmoothScroller);
            return;
        }
        super.smoothScrollToPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int i) {
        this.mPositionBeforeScroll = getCurrentPosition();
        this.mSmoothScrollTargetPosition = i;
        super.scrollToPosition(i);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.recyclerview.viewpager.RecyclerViewPager.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (Build.VERSION.SDK_INT < 16) {
                    RecyclerViewPager.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    RecyclerViewPager.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                if (RecyclerViewPager.this.mSmoothScrollTargetPosition < 0 || RecyclerViewPager.this.mSmoothScrollTargetPosition >= RecyclerViewPager.this.getItemCount() || RecyclerViewPager.this.mOnPageChangedListeners == null) {
                    return;
                }
                for (OnPageChangedListener onPageChangedListener : RecyclerViewPager.this.mOnPageChangedListeners) {
                    if (onPageChangedListener != null) {
                        onPageChangedListener.OnPageChanged(RecyclerViewPager.this.mPositionBeforeScroll, RecyclerViewPager.this.getCurrentPosition());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getItemCount() {
        RecyclerViewPagerAdapter<?> recyclerViewPagerAdapter = this.mViewPagerAdapter;
        if (recyclerViewPagerAdapter == null) {
            return 0;
        }
        return recyclerViewPagerAdapter.getItemCount();
    }

    public int getCurrentPosition() {
        int centerYChildPosition;
        if (getLayoutManager().canScrollHorizontally()) {
            centerYChildPosition = ViewUtils.getCenterXChildPosition(this);
        } else {
            centerYChildPosition = ViewUtils.getCenterYChildPosition(this);
        }
        return centerYChildPosition < 0 ? this.mSmoothScrollTargetPosition : centerYChildPosition;
    }

    private boolean isLeftToRightMode() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r5.reverseLayout == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
        if (r5.reverseLayout == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void adjustPositionX(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.reverseLayout
            if (r0 == 0) goto L6
            int r6 = r6 * (-1)
        L6:
            boolean r0 = r5.isLeftToRightMode()
            if (r0 != 0) goto Le
            int r6 = r6 * (-1)
        Le:
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto La3
            int r0 = com.recyclerview.viewpager.ViewUtils.getCenterXChildPosition(r5)
            int r1 = r5.getWidth()
            int r2 = r5.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r5.getPaddingRight()
            int r1 = r1 - r2
            int r6 = r5.getFlingCount(r6, r1)
            int r1 = r0 + r6
            boolean r2 = r5.mSinglePageFling
            r3 = 1
            if (r2 == 0) goto L41
            int r6 = java.lang.Math.min(r3, r6)
            r1 = -1
            int r6 = java.lang.Math.max(r1, r6)
            if (r6 != 0) goto L3e
            r1 = r0
            goto L41
        L3e:
            int r1 = r5.mPositionOnTouchDown
            int r1 = r1 + r6
        L41:
            r6 = 0
            int r6 = java.lang.Math.max(r1, r6)
            int r1 = r5.getItemCount()
            int r1 = r1 - r3
            int r6 = java.lang.Math.min(r6, r1)
            if (r6 != r0) goto L98
            boolean r1 = r5.mSinglePageFling
            if (r1 == 0) goto L59
            int r1 = r5.mPositionOnTouchDown
            if (r1 != r0) goto L98
        L59:
            android.view.View r0 = com.recyclerview.viewpager.ViewUtils.getCenterXChild(r5)
            if (r0 == 0) goto L98
            float r1 = r5.mTouchSpan
            int r2 = r0.getWidth()
            float r2 = (float) r2
            float r4 = r5.mTriggerOffset
            float r2 = r2 * r4
            float r2 = r2 * r4
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L7c
            if (r6 == 0) goto L7c
            boolean r0 = r5.reverseLayout
            if (r0 != 0) goto L79
        L76:
            int r6 = r6 + (-1)
            goto L98
        L79:
            int r6 = r6 + 1
            goto L98
        L7c:
            float r1 = r5.mTouchSpan
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r2 = r5.mTriggerOffset
            float r2 = -r2
            float r0 = r0 * r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L98
            int r0 = r5.getItemCount()
            int r0 = r0 - r3
            if (r6 == r0) goto L98
            boolean r0 = r5.reverseLayout
            if (r0 != 0) goto L76
            goto L79
        L98:
            int r0 = r5.getItemCount()
            int r6 = r5.safeTargetPosition(r6, r0)
            r5.smoothScrollToPosition(r6)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.recyclerview.viewpager.RecyclerViewPager.adjustPositionX(int):void");
    }

    public void addOnPageChangedListener(OnPageChangedListener onPageChangedListener) {
        if (this.mOnPageChangedListeners == null) {
            this.mOnPageChangedListeners = new ArrayList();
        }
        this.mOnPageChangedListeners.add(onPageChangedListener);
    }

    public void removeOnPageChangedListener(OnPageChangedListener onPageChangedListener) {
        List<OnPageChangedListener> list = this.mOnPageChangedListeners;
        if (list != null) {
            list.remove(onPageChangedListener);
        }
    }

    public void clearOnPageChangedListeners() {
        List<OnPageChangedListener> list = this.mOnPageChangedListeners;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r5.reverseLayout == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
        if (r5.reverseLayout == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void adjustPositionY(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.reverseLayout
            if (r0 == 0) goto L6
            int r6 = r6 * (-1)
        L6:
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L99
            int r0 = com.recyclerview.viewpager.ViewUtils.getCenterYChildPosition(r5)
            int r1 = r5.getHeight()
            int r2 = r5.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r5.getPaddingBottom()
            int r1 = r1 - r2
            int r6 = r5.getFlingCount(r6, r1)
            int r1 = r0 + r6
            boolean r2 = r5.mSinglePageFling
            r3 = 1
            if (r2 == 0) goto L39
            int r6 = java.lang.Math.min(r3, r6)
            r1 = -1
            int r6 = java.lang.Math.max(r1, r6)
            if (r6 != 0) goto L36
            r1 = r0
            goto L39
        L36:
            int r1 = r5.mPositionOnTouchDown
            int r1 = r1 + r6
        L39:
            r6 = 0
            int r6 = java.lang.Math.max(r1, r6)
            int r1 = r5.getItemCount()
            int r1 = r1 - r3
            int r6 = java.lang.Math.min(r6, r1)
            if (r6 != r0) goto L8e
            boolean r1 = r5.mSinglePageFling
            if (r1 == 0) goto L51
            int r1 = r5.mPositionOnTouchDown
            if (r1 != r0) goto L8e
        L51:
            android.view.View r0 = com.recyclerview.viewpager.ViewUtils.getCenterYChild(r5)
            if (r0 == 0) goto L8e
            float r1 = r5.mTouchSpan
            int r2 = r0.getHeight()
            float r2 = (float) r2
            float r4 = r5.mTriggerOffset
            float r2 = r2 * r4
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L72
            if (r6 == 0) goto L72
            boolean r0 = r5.reverseLayout
            if (r0 != 0) goto L6f
        L6c:
            int r6 = r6 + (-1)
            goto L8e
        L6f:
            int r6 = r6 + 1
            goto L8e
        L72:
            float r1 = r5.mTouchSpan
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r2 = r5.mTriggerOffset
            float r2 = -r2
            float r0 = r0 * r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L8e
            int r0 = r5.getItemCount()
            int r0 = r0 - r3
            if (r6 == r0) goto L8e
            boolean r0 = r5.reverseLayout
            if (r0 != 0) goto L6c
            goto L6f
        L8e:
            int r0 = r5.getItemCount()
            int r6 = r5.safeTargetPosition(r6, r0)
            r5.smoothScrollToPosition(r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.recyclerview.viewpager.RecyclerViewPager.adjustPositionY(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int centerYChildPosition;
        if (motionEvent.getAction() == 0 && getLayoutManager() != null) {
            if (getLayoutManager().canScrollHorizontally()) {
                centerYChildPosition = ViewUtils.getCenterXChildPosition(this);
            } else {
                centerYChildPosition = ViewUtils.getCenterYChildPosition(this);
            }
            this.mPositionOnTouchDown = centerYChildPosition;
            this.mLastY = motionEvent.getRawY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        if (motionEvent.getAction() == 2 && (view = this.mCurView) != null) {
            this.mMaxLeftWhenDragging = Math.max(view.getLeft(), this.mMaxLeftWhenDragging);
            this.mMaxTopWhenDragging = Math.max(this.mCurView.getTop(), this.mMaxTopWhenDragging);
            this.mMinLeftWhenDragging = Math.min(this.mCurView.getLeft(), this.mMinLeftWhenDragging);
            this.mMinTopWhenDragging = Math.min(this.mCurView.getTop(), this.mMinTopWhenDragging);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.isInertia) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (this.touchStartPoint == null) {
                this.touchStartPoint = new PointF();
            }
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.touchStartPoint.set(rawX, rawY);
            } else if (action == 2) {
                if (Math.abs(((float) Math.sqrt((this.touchStartPoint.x * this.touchStartPoint.x) + (this.touchStartPoint.y * this.touchStartPoint.y))) - ((float) Math.sqrt((rawX * rawX) + (rawY * rawY)))) > this.minSlideDistance) {
                    float abs = Math.abs((this.touchStartPoint.y - rawY) / (this.touchStartPoint.x - rawX));
                    if (Math.abs(this.touchStartPoint.y - rawY) < 1.0f) {
                        return getLayoutManager().canScrollHorizontally();
                    }
                    if (Math.abs(this.touchStartPoint.x - rawX) < 1.0f) {
                        return !getLayoutManager().canScrollHorizontally();
                    }
                    return ((double) abs) < Math.tan(Math.toRadians(30.0d));
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0121, code lost:
        if (r5.reverseLayout == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0123, code lost:
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0145, code lost:
        if (r5.reverseLayout == false) goto L46;
     */
    @Override // androidx.recyclerview.widget.RecyclerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrollStateChanged(int r6) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.recyclerview.viewpager.RecyclerViewPager.onScrollStateChanged(int):void");
    }

    protected RecyclerViewPagerAdapter ensureRecyclerViewPagerAdapter(RecyclerView.Adapter adapter) {
        return adapter instanceof RecyclerViewPagerAdapter ? (RecyclerViewPagerAdapter) adapter : new RecyclerViewPagerAdapter(this, adapter);
    }

    private int getFlingCount(int i, int i2) {
        int i3;
        if (i == 0) {
            return 0;
        }
        double d = i > 0 ? 1 : -1;
        double ceil = Math.ceil((((i * i3) * this.mFlingFactor) / i2) - this.mTriggerOffset);
        Double.isNaN(d);
        return (int) (d * ceil);
    }

    public float getlLastY() {
        return this.mLastY;
    }
}
