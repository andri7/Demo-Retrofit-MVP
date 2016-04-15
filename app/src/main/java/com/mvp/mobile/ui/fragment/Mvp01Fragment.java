package com.mvp.mobile.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kituri.demomvp.R;


public class Mvp01Fragment extends BaseFragment{

    private View fragmentLayout;

    static public final String TAG = "Mvp01Fragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (presenter != null) presenter.onCreate();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentLayout = inflater.inflate(R.layout.fr_01, container, false);
        return fragmentLayout;
    }

}
