package com.example.tommy.mymvpdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/******************************************************************************
 * Copyright (C), 2006-2020, SZLangpai Co., Ltd.
 * ****************************************************************************
 * Version       : Initial Draft
 * Author        : FengQ
 * Created       : 2017/4/8
 * Description   :
 *****************************************************************************/
public class DemoFragment extends Fragment implements DemoView{
    private static final String TAG = "DemoFragment";

    private Button mButton1;

    private DemoPresenter mPresenter;

    public static DemoFragment newInstance() {
        return new DemoFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root_view = inflater.inflate(R.layout.fragment_demo, container,false);

        mPresenter = new DemoPresenter();
        mPresenter.attachView(this);

        mButton1 = (Button) root_view.findViewById(R.id.btn_01);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toast = "hello MVP!!!";
                mPresenter.makeToast(toast);
            }
        });

        return root_view;
    }

    @Override
    public void showToast(String toast) {
        Log.i(TAG, "showToast: " + toast);
        Toast.makeText(getContext(), toast, Toast.LENGTH_SHORT).show();
    }
}
