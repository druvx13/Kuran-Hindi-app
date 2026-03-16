package com.futuremind.recyclerviewfastscroll.viewprovider;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import com.futuremind.recyclerviewfastscroll.R;

public class VisibilityAnimationManager {
    protected AnimatorSet hideAnimator;
    private float pivotXRelative;
    private float pivotYRelative;
    protected AnimatorSet showAnimator;
    protected final View view;

    protected VisibilityAnimationManager(final View view, int i, int i2, float f, float f2, int i3) {
        this.view = view;
        this.pivotXRelative = f;
        this.pivotYRelative = f2;
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i2);
        this.hideAnimator = animatorSet;
        animatorSet.setStartDelay(i3);
        this.hideAnimator.setTarget(view);
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i);
        this.showAnimator = animatorSet2;
        animatorSet2.setTarget(view);
        this.hideAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.futuremind.recyclerviewfastscroll.viewprovider.VisibilityAnimationManager.1
            boolean wasCanceled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!this.wasCanceled) {
                    view.setVisibility(4);
                }
                this.wasCanceled = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.wasCanceled = true;
            }
        });
        updatePivot();
    }

    public void show() {
        this.hideAnimator.cancel();
        if (this.view.getVisibility() == 4) {
            this.view.setVisibility(0);
            updatePivot();
            this.showAnimator.start();
        }
    }

    public void hide() {
        updatePivot();
        this.hideAnimator.start();
    }

    protected void updatePivot() {
        View view = this.view;
        view.setPivotX(this.pivotXRelative * view.getMeasuredWidth());
        View view2 = this.view;
        view2.setPivotY(this.pivotYRelative * view2.getMeasuredHeight());
    }

    
    public static abstract class AbsBuilder<T extends VisibilityAnimationManager> {
        protected final View view;
        protected int showAnimatorResource = R.animator.fastscroll__default_show;
        protected int hideAnimatorResource = R.animator.fastscroll__default_hide;
        protected int hideDelay = 1000;
        protected float pivotX = 0.5f;
        protected float pivotY = 0.5f;

        public abstract T build();

        public AbsBuilder(View view) {
            this.view = view;
        }

        public AbsBuilder<T> withShowAnimator(int i) {
            this.showAnimatorResource = i;
            return this;
        }

        public AbsBuilder<T> withHideAnimator(int i) {
            this.hideAnimatorResource = i;
            return this;
        }

        public AbsBuilder<T> withHideDelay(int i) {
            this.hideDelay = i;
            return this;
        }

        public AbsBuilder<T> withPivotX(float f) {
            this.pivotX = f;
            return this;
        }

        public AbsBuilder<T> withPivotY(float f) {
            this.pivotY = f;
            return this;
        }
    }

    
    public static class Builder extends AbsBuilder<VisibilityAnimationManager> {
        public Builder(View view) {
            super(view);
        }

        @Override // com.futuremind.recyclerviewfastscroll.viewprovider.VisibilityAnimationManager.AbsBuilder
        public VisibilityAnimationManager build() {
            return new VisibilityAnimationManager(this.view, this.showAnimatorResource, this.hideAnimatorResource, this.pivotX, this.pivotY, this.hideDelay);
        }
    }
}
