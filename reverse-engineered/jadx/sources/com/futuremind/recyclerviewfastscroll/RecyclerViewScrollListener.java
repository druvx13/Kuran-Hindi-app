package com.futuremind.recyclerviewfastscroll;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class RecyclerViewScrollListener extends RecyclerView.OnScrollListener {
    List<ScrollerListener> listeners = new ArrayList();
    int oldScrollState = 0;
    private final FastScroller scroller;

    /* loaded from: classes.dex */
    public interface ScrollerListener {
        void onScroll(float f);
    }

    public RecyclerViewScrollListener(FastScroller fastScroller) {
        this.scroller = fastScroller;
    }

    public void addScrollerListener(ScrollerListener scrollerListener) {
        this.listeners.add(scrollerListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0 && this.oldScrollState != 0) {
            this.scroller.getViewProvider().onScrollFinished();
        } else if (i != 0 && this.oldScrollState == 0) {
            this.scroller.getViewProvider().onScrollStarted();
        }
        this.oldScrollState = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (this.scroller.shouldUpdateHandlePosition()) {
            updateHandlePosition(recyclerView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateHandlePosition(RecyclerView recyclerView) {
        int computeHorizontalScrollOffset;
        int computeHorizontalScrollExtent;
        int computeHorizontalScrollRange;
        if (this.scroller.isVertical()) {
            computeHorizontalScrollOffset = recyclerView.computeVerticalScrollOffset();
            computeHorizontalScrollExtent = recyclerView.computeVerticalScrollExtent();
            computeHorizontalScrollRange = recyclerView.computeVerticalScrollRange();
        } else {
            computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            computeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            computeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
        }
        float f = computeHorizontalScrollOffset / (computeHorizontalScrollRange - computeHorizontalScrollExtent);
        this.scroller.setScrollerPosition(f);
        notifyListeners(f);
    }

    public void notifyListeners(float f) {
        for (ScrollerListener scrollerListener : this.listeners) {
            scrollerListener.onScroll(f);
        }
    }
}
