package com.example.tommy.mymvpdemo;

import android.util.Log;

import com.example.tommy.mymvpdemo.mvp.BaseMvpPresenter;

/******************************************************************************
 * Copyright (C), 2006-2020, SZLangpai Co., Ltd.
 * ****************************************************************************
 * Version       : Initial Draft
 * Author        : FengQ
 * Created       : 2017/4/8
 * Description   :
 *****************************************************************************/
public class DemoPresenter extends BaseMvpPresenter<DemoView> {
    private static final String TAG = "DemoPresenter";

    public void makeToast(String toast) {
        Log.i(TAG, "makeToast: ");
        getMvpView().showToast(toast);
    }
}
