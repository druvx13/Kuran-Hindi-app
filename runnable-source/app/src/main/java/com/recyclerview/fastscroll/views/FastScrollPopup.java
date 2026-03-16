package com.recyclerview.fastscroll.views;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.recyclerview.fastscroll.utils.Utils;

public class FastScrollPopup {
    private ObjectAnimator mAlphaAnimator;
    private int mBackgroundSize;
    private int mCornerRadius;
    private int mPopupPosition;
    private FastScrollRecyclerView mRecyclerView;
    private Resources mRes;
    private String mSectionName;
    private Paint mTextPaint;
    private int mTextVerticalAlignmentMode;
    private boolean mVisible;
    private Utils utils;
    private Path mBackgroundPath = new Path();
    private RectF mBackgroundRect = new RectF();
    private int mBackgroundColor = ViewCompat.MEASURED_STATE_MASK;
    private Rect mInvalidateRect = new Rect();
    private Rect mTmpRect = new Rect();
    private Rect mBgBounds = new Rect();
    private Rect mTextBounds = new Rect();
    private float mAlpha = 1.0f;
    private Paint mBackgroundPaint = new Paint(1);

    
    public FastScrollPopup(Resources resources, FastScrollRecyclerView fastScrollRecyclerView) {
        this.mRes = resources;
        this.mRecyclerView = fastScrollRecyclerView;
        Paint paint = new Paint(1);
        this.mTextPaint = paint;
        paint.setAlpha(0);
        setTextSize(Utils.toScreenPixels(this.mRes, 44.0f));
        setBackgroundSize(Utils.toPixels(this.mRes, 88.0f));
    }

    public void setBgColor(int i) {
        this.mBackgroundColor = i;
        this.mBackgroundPaint.setColor(i);
        this.mRecyclerView.invalidate(this.mBgBounds);
    }

    public void setTextColor(int i) {
        this.mTextPaint.setColor(i);
        this.mRecyclerView.invalidate(this.mBgBounds);
    }

    public void setTextSize(int i) {
        this.mTextPaint.setTextSize(i);
        this.mRecyclerView.invalidate(this.mBgBounds);
    }

    public void setBackgroundSize(int i) {
        this.mBackgroundSize = i;
        this.mCornerRadius = i / 2;
        this.mRecyclerView.invalidate(this.mBgBounds);
    }

    public void setTypeface(Typeface typeface) {
        this.mTextPaint.setTypeface(typeface);
        this.mRecyclerView.invalidate(this.mBgBounds);
    }

    public void animateVisibility(boolean z) {
        if (this.mVisible != z) {
            this.mVisible = z;
            ObjectAnimator objectAnimator = this.mAlphaAnimator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", fArr);
            this.mAlphaAnimator = ofFloat;
            ofFloat.setDuration(z ? 200L : 150L);
            this.mAlphaAnimator.start();
        }
    }

    public void setAlpha(float f) {
        this.mAlpha = f;
        this.mRecyclerView.invalidate(this.mBgBounds);
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public void setPopupTextVerticalAlignmentMode(int i) {
        this.mTextVerticalAlignmentMode = i;
    }

    public int getPopupTextVerticalAlignmentMode() {
        return this.mTextVerticalAlignmentMode;
    }

    public void setPopupPosition(int i) {
        this.mPopupPosition = i;
    }

    public int getPopupPosition() {
        return this.mPopupPosition;
    }

    private float[] createRadii() {
        if (this.mPopupPosition == 1) {
            int i = this.mCornerRadius;
            return new float[]{i, i, i, i, i, i, i, i};
        } else if (Utils.isScrollBarAtLeft()) {
            int i2 = this.mCornerRadius;
            return new float[]{i2, i2, i2, i2, i2, i2, 0.0f, 0.0f};
        } else {
            int i3 = this.mCornerRadius;
            return new float[]{i3, i3, i3, i3, 0.0f, 0.0f, i3, i3};
        }
    }

    private Utils getUtils() {
        if (this.utils == null) {
            this.utils = new Utils();
        }
        return this.utils;
    }

    public void draw(Canvas canvas) {
        float height;
        if (isVisible()) {
            int save = canvas.save();
            canvas.translate(this.mBgBounds.left, this.mBgBounds.top);
            this.mTmpRect.set(this.mBgBounds);
            this.mTmpRect.offsetTo(0, 0);
            this.mBackgroundPath.reset();
            this.mBackgroundRect.set(this.mTmpRect);
            float[] createRadii = createRadii();
            if (this.mTextVerticalAlignmentMode == 1) {
                Paint.FontMetrics fontMetrics = this.mTextPaint.getFontMetrics();
                height = ((this.mBgBounds.height() - fontMetrics.ascent) - fontMetrics.descent) / 2.0f;
            } else {
                height = (this.mBgBounds.height() + this.mTextBounds.height()) / 2.0f;
            }
            this.mBackgroundPath.addRoundRect(this.mBackgroundRect, createRadii, Path.Direction.CW);
            this.mBackgroundPaint.setAlpha((int) (Color.alpha(this.mBackgroundColor) * this.mAlpha));
            this.mTextPaint.setAlpha((int) (this.mAlpha * 255.0f));
            canvas.drawPath(this.mBackgroundPath, this.mBackgroundPaint);
            canvas.drawText(this.mSectionName, (this.mBgBounds.width() - this.mTextBounds.width()) / 2.0f, height, this.mTextPaint);
            canvas.restoreToCount(save);
        }
    }

    public void setSectionName(String str) {
        if (str.equals(this.mSectionName)) {
            return;
        }
        this.mSectionName = str;
        this.mTextPaint.getTextBounds(str, 0, str.length(), this.mTextBounds);
        Rect rect = this.mTextBounds;
        rect.right = (int) (rect.left + this.mTextPaint.measureText(str));
    }

    public Rect updateFastScrollerBounds(FastScrollRecyclerView fastScrollRecyclerView, int i) {
        this.mInvalidateRect.set(this.mBgBounds);
        if (isVisible()) {
            int scrollBarWidth = fastScrollRecyclerView.getScrollBarWidth();
            int i2 = this.mBackgroundSize;
            int max = Math.max(i2, this.mTextBounds.width() + (Math.round((this.mBackgroundSize - this.mTextBounds.height()) / 10.0f) * 5 * 2));
            if (this.mPopupPosition == 1) {
                this.mBgBounds.left = (fastScrollRecyclerView.getWidth() - max) / 2;
                Rect rect = this.mBgBounds;
                rect.right = rect.left + max;
                this.mBgBounds.top = (fastScrollRecyclerView.getHeight() - i2) / 2;
            } else {
                if (Utils.isScrollBarAtLeft()) {
                    this.mBgBounds.left = fastScrollRecyclerView.getScrollBarWidth() * 2;
                    Rect rect2 = this.mBgBounds;
                    rect2.right = rect2.left + max;
                } else {
                    this.mBgBounds.right = fastScrollRecyclerView.getWidth() - (fastScrollRecyclerView.getScrollBarWidth() * 2);
                    Rect rect3 = this.mBgBounds;
                    rect3.left = rect3.right - max;
                }
                this.mBgBounds.top = (((fastScrollRecyclerView.getPaddingTop() - fastScrollRecyclerView.getPaddingBottom()) + i) - i2) + (fastScrollRecyclerView.getScrollBarThumbHeight() / 2);
                this.mBgBounds.top = Math.max(fastScrollRecyclerView.getPaddingTop() + scrollBarWidth, Math.min(this.mBgBounds.top, ((fastScrollRecyclerView.getPaddingTop() + fastScrollRecyclerView.getHeight()) - scrollBarWidth) - i2));
            }
            Rect rect4 = this.mBgBounds;
            rect4.bottom = rect4.top + i2;
        } else {
            this.mBgBounds.setEmpty();
        }
        this.mInvalidateRect.union(this.mBgBounds);
        return this.mInvalidateRect;
    }

    public boolean isVisible() {
        return this.mAlpha > 0.0f && !TextUtils.isEmpty(this.mSectionName);
    }
}
