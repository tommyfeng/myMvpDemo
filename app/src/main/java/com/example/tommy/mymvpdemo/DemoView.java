package com.example.tommy.mymvpdemo;

import com.example.tommy.mymvpdemo.mvp.MvpView;

/******************************************************************************
 * Copyright (C), 2006-2020, SZLangpai Co., Ltd.
 * ****************************************************************************
 * Version       : Initial Draft
 * Author        : FengQ
 * Created       : 2017/4/8
 * Description   :
 *****************************************************************************/
public interface DemoView extends MvpView {
    void showToast(String toast);
}
