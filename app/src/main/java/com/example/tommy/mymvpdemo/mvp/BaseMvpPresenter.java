package com.example.tommy.mymvpdemo.mvp;

/******************************************************************************
 * Copyright (C), 2006-2020, SZLangpai Co., Ltd.
 * ****************************************************************************
 * Version       : Initial Draft
 * Author        : FengQ
 * Created       : 2017/4/8
 * Description   :
 *****************************************************************************/
public abstract class BaseMvpPresenter <T extends MvpView> implements MvpPresenter<T> {
    private T mMvpView;

    @Override
    public void attachView(T mvpView) {
        mMvpView = mvpView;
    }

    @Override
    public void detachView() {
        mMvpView = null;
    }

    public boolean attached() {
        return mMvpView != null;
    }

    public T getMvpView() {
        return mMvpView;
    }
}
