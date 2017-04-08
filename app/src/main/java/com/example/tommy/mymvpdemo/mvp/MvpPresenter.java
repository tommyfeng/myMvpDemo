package com.example.tommy.mymvpdemo.mvp;

/******************************************************************************
 * Copyright (C), 2006-2020, SZLangpai Co., Ltd.
 * ****************************************************************************
 * Version       : Initial Draft
 * Author        : FengQ
 * Created       : 2017/4/8
 * Description   :
 *****************************************************************************/
public interface MvpPresenter <T extends MvpView> {
    void attachView(T mvpView);
    void detachView();
}
