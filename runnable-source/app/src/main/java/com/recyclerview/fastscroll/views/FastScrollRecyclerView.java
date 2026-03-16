package com.recyclerview.fastscroll.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.muslim.quran_hindi.R;
import com.recyclerview.fastscroll.interfaces.OnFastScrollStateChangeListener;
import com.recyclerview.fastscroll.utils.Utils;

public class FastScrollRecyclerView extends RecyclerView implements RecyclerView.OnItemTouchListener {
    private static final String TAG = "FastScrollRecyclerView";
    private int mDownX;
    private int mDownY;
    private boolean mFastScrollEnabled;
    private int mLastY;
    private ScrollOffsetInvalidator mScrollOffsetInvalidator;
    private SparseIntArray mScrollOffsets;
    private ScrollPositionState mScrollPosState;
    private FastScroller mScrollbar;
    private OnFastScrollStateChangeListener mStateChangeListener;
    private Utils utils;

    
    public interface MeasurableAdapter<VH extends RecyclerView.ViewHolder> {
        int getViewTypeHeight(RecyclerView recyclerView, VH vh, int i);
    }

    
    public static class ScrollPositionState {
        int rowHeight;
        int rowIndex;
        int rowTopOffset;
    }

    
    public interface SectionedAdapter {
        String getSectionName(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public FastScrollRecyclerView(Context context) {
        this(context, null);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mScrollPosState = new ScrollPositionState();
        Utils.setScrollbarToLeft(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FastScrollRecyclerView, 0, 0);
        try {
            this.mFastScrollEnabled = obtainStyledAttributes.getBoolean(10, true);
            obtainStyledAttributes.recycle();
            this.mScrollbar = new FastScroller(context, this, attributeSet);
            this.mScrollOffsetInvalidator = new ScrollOffsetInvalidator();
            this.mScrollOffsets = new SparseIntArray();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public int getScrollBarWidth() {
        return this.mScrollbar.getWidth();
    }

    public int getScrollBarThumbHeight() {
        return this.mScrollbar.getThumbHeight();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        addOnItemTouchListener(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (getAdapter() != null) {
            getAdapter().unregisterAdapterDataObserver(this.mScrollOffsetInvalidator);
        }
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mScrollOffsetInvalidator);
        }
        super.setAdapter(adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        return handleTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        handleTouchEvent(motionEvent);
    }

    
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean handleTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r19.getAction()
            float r2 = r19.getX()
            int r5 = (int) r2
            float r2 = r19.getY()
            int r10 = (int) r2
            if (r1 == 0) goto L40
            r2 = 1
            if (r1 == r2) goto L2c
            r2 = 2
            if (r1 == r2) goto L1c
            r2 = 3
            if (r1 == r2) goto L2c
            goto L51
        L1c:
            r0.mLastY = r10
            com.recyclerview.fastscroll.views.FastScroller r6 = r0.mScrollbar
            int r8 = r0.mDownX
            int r9 = r0.mDownY
            com.recyclerview.fastscroll.interfaces.OnFastScrollStateChangeListener r11 = r0.mStateChangeListener
            r7 = r19
            r6.handleTouchEvent(r7, r8, r9, r10, r11)
            goto L51
        L2c:
            com.recyclerview.fastscroll.views.FastScroller r12 = r0.mScrollbar
            int r14 = r0.mDownX
            int r15 = r0.mDownY
            int r1 = r0.mLastY
            com.recyclerview.fastscroll.interfaces.OnFastScrollStateChangeListener r2 = r0.mStateChangeListener
            r13 = r19
            r16 = r1
            r17 = r2
            r12.handleTouchEvent(r13, r14, r15, r16, r17)
            goto L51
        L40:
            r0.mDownX = r5
            r0.mLastY = r10
            r0.mDownY = r10
            com.recyclerview.fastscroll.views.FastScroller r3 = r0.mScrollbar
            com.recyclerview.fastscroll.interfaces.OnFastScrollStateChangeListener r8 = r0.mStateChangeListener
            r4 = r19
            r6 = r10
            r7 = r10
            r3.handleTouchEvent(r4, r5, r6, r7, r8)
        L51:
            com.recyclerview.fastscroll.views.FastScroller r1 = r0.mScrollbar
            boolean r1 = r1.isDragging()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.recyclerview.fastscroll.views.FastScrollRecyclerView.handleTouchEvent(android.view.MotionEvent):boolean");
    }

    protected int getAvailableScrollHeight(int i, int i2) {
        return (((getPaddingTop() + i2) + i) + getPaddingBottom()) - getHeight();
    }

    protected int getAvailableScrollBarHeight() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.mScrollbar.getThumbHeight();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.mFastScrollEnabled) {
            onUpdateScrollbar();
            this.mScrollbar.draw(canvas);
        }
    }

    protected void updateThumbPosition(ScrollPositionState scrollPositionState, int i) {
        int availableScrollHeight;
        int i2;
        int paddingTop;
        if (getAdapter() instanceof MeasurableAdapter) {
            availableScrollHeight = getAvailableScrollHeight(calculateAdapterHeight(), 0);
            i2 = calculateScrollDistanceToPosition(scrollPositionState.rowIndex);
        } else {
            availableScrollHeight = getAvailableScrollHeight(i * scrollPositionState.rowHeight, 0);
            i2 = scrollPositionState.rowHeight * scrollPositionState.rowIndex;
        }
        int availableScrollBarHeight = getAvailableScrollBarHeight();
        if (availableScrollHeight <= 0) {
            this.mScrollbar.setThumbPosition(-1, -1);
            return;
        }
        int min = (int) ((Math.min(availableScrollHeight, getPaddingTop() + i2) / availableScrollHeight) * availableScrollBarHeight);
        if (isLayoutManagerReversed()) {
            paddingTop = (availableScrollBarHeight - min) + getPaddingBottom();
        } else {
            paddingTop = min + getPaddingTop();
        }
        this.mScrollbar.setThumbPosition(Utils.isScrollBarAtLeft() ? 0 : getWidth() - this.mScrollbar.getWidth(), paddingTop);
    }

    private Utils getUtils() {
        if (this.utils == null) {
            this.utils = new Utils();
        }
        return this.utils;
    }

    public String scrollToPositionAtProgress(float f) {
        int i;
        int i2;
        float f2;
        int i3;
        int itemCount = getAdapter().getItemCount();
        if (itemCount == 0) {
            return "";
        }
        if (getLayoutManager() instanceof GridLayoutManager) {
            i = ((GridLayoutManager) getLayoutManager()).getSpanCount();
            double d = itemCount;
            double d2 = i;
            Double.isNaN(d);
            Double.isNaN(d2);
            itemCount = (int) Math.ceil(d / d2);
        } else {
            i = 1;
        }
        stopScroll();
        getCurScrollState(this.mScrollPosState);
        if (getAdapter() instanceof MeasurableAdapter) {
            f2 = findItemPosition(f);
            int availableScrollHeight = (int) (getAvailableScrollHeight(calculateAdapterHeight(), 0) * f);
            i3 = findMeasureAdapterFirstVisiblePosition(availableScrollHeight);
            i2 = calculateScrollDistanceToPosition(i3) - availableScrollHeight;
        } else {
            float findItemPosition = findItemPosition(f);
            int availableScrollHeight2 = (int) (getAvailableScrollHeight(itemCount * this.mScrollPosState.rowHeight, 0) * f);
            int i4 = (i * availableScrollHeight2) / this.mScrollPosState.rowHeight;
            i2 = -(availableScrollHeight2 % this.mScrollPosState.rowHeight);
            f2 = findItemPosition;
            i3 = i4;
        }
        ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(i3, i2);
        if (getAdapter() instanceof SectionedAdapter) {
            if (f == 1.0f) {
                f2 = getAdapter().getItemCount() - 1;
            }
            return ((SectionedAdapter) getAdapter()).getSectionName((int) f2);
        }
        return "";
    }

    private int findMeasureAdapterFirstVisiblePosition(int i) {
        if (getAdapter() instanceof MeasurableAdapter) {
            MeasurableAdapter measurableAdapter = (MeasurableAdapter) getAdapter();
            for (int i2 = 0; i2 < getAdapter().getItemCount(); i2++) {
                int calculateScrollDistanceToPosition = calculateScrollDistanceToPosition(i2);
                int viewTypeHeight = measurableAdapter.getViewTypeHeight(this, findViewHolderForAdapterPosition(i2), getAdapter().getItemViewType(i2)) + calculateScrollDistanceToPosition;
                if (i2 == getAdapter().getItemCount() - 1) {
                    if (i >= calculateScrollDistanceToPosition && i <= viewTypeHeight) {
                        return i2;
                    }
                } else if (i >= calculateScrollDistanceToPosition && i < viewTypeHeight) {
                    return i2;
                }
            }
            throw new IllegalStateException(String.format("Invalid passed height: %d, [low: %d, height: %d]", Integer.valueOf(i), Integer.valueOf(calculateScrollDistanceToPosition(0)), Integer.valueOf(calculateScrollDistanceToPosition(getAdapter().getItemCount() - 1) + measurableAdapter.getViewTypeHeight(this, findViewHolderForAdapterPosition(getAdapter().getItemCount() - 1), getAdapter().getItemViewType(getAdapter().getItemCount() - 1)))));
        }
        throw new IllegalStateException("findMeasureAdapterFirstVisiblePosition() should only be called where the RecyclerView.Adapter is an instance of MeasurableAdapter");
    }

    private float findItemPosition(float f) {
        if (getAdapter() instanceof MeasurableAdapter) {
            MeasurableAdapter measurableAdapter = (MeasurableAdapter) getAdapter();
            int calculateAdapterHeight = (int) (calculateAdapterHeight() * f);
            for (int i = 0; i < getAdapter().getItemCount(); i++) {
                int calculateScrollDistanceToPosition = calculateScrollDistanceToPosition(i);
                int viewTypeHeight = measurableAdapter.getViewTypeHeight(this, findViewHolderForAdapterPosition(i), getAdapter().getItemViewType(i)) + calculateScrollDistanceToPosition;
                if (i == getAdapter().getItemCount() - 1) {
                    if (calculateAdapterHeight >= calculateScrollDistanceToPosition && calculateAdapterHeight <= viewTypeHeight) {
                        return i;
                    }
                } else if (calculateAdapterHeight >= calculateScrollDistanceToPosition && calculateAdapterHeight < viewTypeHeight) {
                    return i;
                }
            }
            Log.w(TAG, "Failed to find a view at the provided scroll fraction (" + f + ")");
            return f * getAdapter().getItemCount();
        }
        return getAdapter().getItemCount() * f;
    }

    public void onUpdateScrollbar() {
        if (getAdapter() == null) {
            return;
        }
        int itemCount = getAdapter().getItemCount();
        if (getLayoutManager() instanceof GridLayoutManager) {
            double d = itemCount;
            double spanCount = ((GridLayoutManager) getLayoutManager()).getSpanCount();
            Double.isNaN(d);
            Double.isNaN(spanCount);
            itemCount = (int) Math.ceil(d / spanCount);
        }
        if (itemCount == 0) {
            this.mScrollbar.setThumbPosition(-1, -1);
            return;
        }
        getCurScrollState(this.mScrollPosState);
        if (this.mScrollPosState.rowIndex < 0) {
            this.mScrollbar.setThumbPosition(-1, -1);
        } else {
            updateThumbPosition(this.mScrollPosState, itemCount);
        }
    }

    
    public boolean isLayoutManagerReversed() {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getLayoutManager()).getReverseLayout();
        }
        return false;
    }

    private void getCurScrollState(ScrollPositionState scrollPositionState) {
        scrollPositionState.rowIndex = -1;
        scrollPositionState.rowTopOffset = -1;
        scrollPositionState.rowHeight = -1;
        RecyclerView.Adapter adapter = getAdapter();
        adapter.getClass();
        if (adapter.getItemCount() == 0 || getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        scrollPositionState.rowIndex = getChildAdapterPosition(childAt);
        if (getLayoutManager() instanceof GridLayoutManager) {
            scrollPositionState.rowIndex /= ((GridLayoutManager) getLayoutManager()).getSpanCount();
        }
        if (getAdapter() instanceof MeasurableAdapter) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            layoutManager.getClass();
            scrollPositionState.rowTopOffset = layoutManager.getDecoratedTop(childAt);
            scrollPositionState.rowHeight = ((MeasurableAdapter) getAdapter()).getViewTypeHeight(this, findViewHolderForAdapterPosition(scrollPositionState.rowIndex), getAdapter().getItemViewType(scrollPositionState.rowIndex));
            return;
        }
        RecyclerView.LayoutManager layoutManager2 = getLayoutManager();
        layoutManager2.getClass();
        scrollPositionState.rowTopOffset = layoutManager2.getDecoratedTop(childAt);
        scrollPositionState.rowHeight = childAt.getHeight() + getLayoutManager().getTopDecorationHeight(childAt) + getLayoutManager().getBottomDecorationHeight(childAt);
    }

    private int calculateScrollDistanceToPosition(int i) {
        if (!(getAdapter() instanceof MeasurableAdapter)) {
            throw new IllegalStateException("calculateScrollDistanceToPosition() should only be called where the RecyclerView.Adapter is an instance of MeasurableAdapter");
        }
        if (this.mScrollOffsets.indexOfKey(i) >= 0) {
            return this.mScrollOffsets.get(i);
        }
        MeasurableAdapter measurableAdapter = (MeasurableAdapter) getAdapter();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            this.mScrollOffsets.put(i3, i2);
            i2 += measurableAdapter.getViewTypeHeight(this, findViewHolderForAdapterPosition(i3), getAdapter().getItemViewType(i3));
        }
        this.mScrollOffsets.put(i, i2);
        return i2;
    }

    private int calculateAdapterHeight() {
        if (!(getAdapter() instanceof MeasurableAdapter)) {
            throw new IllegalStateException("calculateAdapterHeight() should only be called where the RecyclerView.Adapter is an instance of MeasurableAdapter");
        }
        return calculateScrollDistanceToPosition(getAdapter().getItemCount());
    }

    public void showScrollbar() {
        this.mScrollbar.show();
    }

    public void setThumbColor(int i) {
        this.mScrollbar.setThumbColor(i);
    }

    public void setTrackColor(int i) {
        this.mScrollbar.setTrackColor(i);
    }

    public void setPopupBgColor(int i) {
        this.mScrollbar.setPopupBgColor(i);
    }

    public void setPopupTextColor(int i) {
        this.mScrollbar.setPopupTextColor(i);
    }

    public void setPopupTextSize(int i) {
        this.mScrollbar.setPopupTextSize(i);
    }

    public void setPopUpTypeface(Typeface typeface) {
        this.mScrollbar.setPopupTypeface(typeface);
    }

    public void setAutoHideDelay(int i) {
        this.mScrollbar.setAutoHideDelay(i);
    }

    public void setAutoHideEnabled(boolean z) {
        this.mScrollbar.setAutoHideEnabled(z);
    }

    public void setOnFastScrollStateChangeListener(OnFastScrollStateChangeListener onFastScrollStateChangeListener) {
        this.mStateChangeListener = onFastScrollStateChangeListener;
    }

    @Deprecated
    public void setStateChangeListener(OnFastScrollStateChangeListener onFastScrollStateChangeListener) {
        setOnFastScrollStateChangeListener(onFastScrollStateChangeListener);
    }

    public void setThumbInactiveColor(int i) {
        this.mScrollbar.setThumbInactiveColor(i);
    }

    public void allowThumbInactiveColor(boolean z) {
        this.mScrollbar.enableThumbInactiveColor(z);
    }

    @Deprecated
    public void setThumbInactiveColor(boolean z) {
        allowThumbInactiveColor(z);
    }

    public void setFastScrollEnabled(boolean z) {
        this.mFastScrollEnabled = z;
    }

    public void setScrollbarToLeft(boolean z) {
        Utils.setScrollbarToLeft(z);
    }

    @Deprecated
    public void setThumbEnabled(boolean z) {
        setFastScrollEnabled(z);
    }

    public void setPopupPosition(int i) {
        this.mScrollbar.setPopupPosition(i);
    }

    
    private class ScrollOffsetInvalidator extends RecyclerView.AdapterDataObserver {
        private ScrollOffsetInvalidator() {
        }

        private void invalidateAllScrollOffsets() {
            FastScrollRecyclerView.this.mScrollOffsets.clear();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            invalidateAllScrollOffsets();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            invalidateAllScrollOffsets();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            invalidateAllScrollOffsets();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            invalidateAllScrollOffsets();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            invalidateAllScrollOffsets();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            invalidateAllScrollOffsets();
        }
    }
}
