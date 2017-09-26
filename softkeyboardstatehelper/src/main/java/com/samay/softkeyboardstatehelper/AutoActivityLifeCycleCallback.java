package com.samay.softkeyboardstatehelper;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/**
 * Created by samay on 2017/9/26.
 */

public abstract class AutoActivityLifeCycleCallback implements Application.ActivityLifecycleCallbacks{
    private final Activity mCurrentActivity;

    public AutoActivityLifeCycleCallback(Activity activity) {
        mCurrentActivity=activity;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {

    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        if(mCurrentActivity == activity){
            mCurrentActivity.getApplication().unregisterActivityLifecycleCallbacks(this);
            onCurrentActivityDestroyed();
        }
    }

    protected abstract void onCurrentActivityDestroyed();
}
