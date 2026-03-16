package com.muslim.quran_hindi.customview;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.view.View;
import com.futuremind.recyclerviewfastscroll.viewprovider.ViewBehavior;
import com.futuremind.recyclerviewfastscroll.viewprovider.VisibilityAnimationManager;
/* loaded from: classes.dex */
public class CustomHandleBehavior implements ViewBehavior {
    private final HandleAnimationManager grabManager;
    private boolean isGrabbed;
    private final VisibilityAnimationManager visibilityManager;

    public CustomHandleBehavior(VisibilityAnimationManager visibilityAnimationManager, HandleAnimationManager handleAnimationManager) {
        this.visibilityManager = visibilityAnimationManager;
        this.grabManager = handleAnimationManager;
    }

    @Override // com.futuremind.recyclerviewfastscroll.viewprovider.ViewBehavior
    public void onHandleGrabbed() {
        this.isGrabbed = true;
        this.visibilityManager.show();
        this.grabManager.onGrab();
    }

    @Override // com.futuremind.recyclerviewfastscroll.viewprovider.ViewBehavior
    public void onHandleReleased() {
        this.isGrabbed = false;
        this.visibilityManager.hide();
        this.grabManager.onRelease();
    }

    @Override // com.futuremind.recyclerviewfastscroll.viewprovider.ViewBehavior
    public void onScrollStarted() {
        this.visibilityManager.show();
    }

    @Override // com.futuremind.recyclerviewfastscroll.viewprovider.ViewBehavior
    public void onScrollFinished() {
        if (this.isGrabbed) {
            return;
        }
        this.visibilityManager.hide();
    }

    /* loaded from: classes.dex */
    static class HandleAnimationManager {
        private AnimatorSet grabAnimator;
        private AnimatorSet releaseAnimator;

        protected HandleAnimationManager(View view, int i, int i2) {
            if (i != -1) {
                AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i);
                this.grabAnimator = animatorSet;
                animatorSet.setTarget(view);
            }
            if (i2 != -1) {
                AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i2);
                this.releaseAnimator = animatorSet2;
                animatorSet2.setTarget(view);
            }
        }

        public void onGrab() {
            AnimatorSet animatorSet = this.releaseAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.grabAnimator;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }

        public void onRelease() {
            AnimatorSet animatorSet = this.grabAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.releaseAnimator;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }

        /* loaded from: classes.dex */
        public static class Builder {
            private int grabAnimator;
            private View handle;
            private int releaseAnimator;

            public Builder(View view) {
                this.handle = view;
            }

            public Builder withGrabAnimator(int i) {
                this.grabAnimator = i;
                return this;
            }

            public Builder withReleaseAnimator(int i) {
                this.releaseAnimator = i;
                return this;
            }

            public HandleAnimationManager build() {
                return new HandleAnimationManager(this.handle, this.grabAnimator, this.releaseAnimator);
            }
        }
    }
}
