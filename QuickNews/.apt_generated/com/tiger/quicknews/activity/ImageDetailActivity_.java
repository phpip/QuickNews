//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package com.tiger.quicknews.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tiger.quicknews.R.id;
import com.tiger.quicknews.R.layout;
import com.tiger.quicknews.adapter.ImageAdapter_;
import com.tiger.quicknews.wedget.flipview.FlipView;
import org.androidannotations.api.SdkVersionHelper;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class ImageDetailActivity_
    extends ImageDetailActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_image);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        imageAdapter = ImageAdapter_.getInstance_(this);
        init();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static ImageDetailActivity_.IntentBuilder_ intent(Context context) {
        return new ImageDetailActivity_.IntentBuilder_(context);
    }

    public static ImageDetailActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new ImageDetailActivity_.IntentBuilder_(fragment);
    }

    public static ImageDetailActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new ImageDetailActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (((SdkVersionHelper.getSdkInt()< 5)&&(keyCode == KeyEvent.KEYCODE_BACK))&&(event.getRepeatCount() == 0)) {
            onBackPressed();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mFlipView = ((FlipView) hasViews.findViewById(id.flip_view));
        newTitle = ((TextView) hasViews.findViewById(id.new_title));
        initView();
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;
        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, ImageDetailActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            fragment_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, ImageDetailActivity_.class);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            fragmentSupport_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, ImageDetailActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public ImageDetailActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent_, requestCode);
            } else {
                if (fragment_!= null) {
                    fragment_.startActivityForResult(intent_, requestCode);
                } else {
                    if (context_ instanceof Activity) {
                        ((Activity) context_).startActivityForResult(intent_, requestCode);
                    } else {
                        context_.startActivity(intent_);
                    }
                }
            }
        }

    }

}
