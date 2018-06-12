package com.example.zhangjiawen.ttms2.IView;

import android.widget.EditText;

import com.example.zhangjiawen.ttms2.Entity.StudioEntity;

/**
 * Created by zhangjiawen on 2018/6/6.
 */

public interface IPlayAddView extends BaseView {
    boolean isEmpty(EditText editText);
    void initAllStudioSpinner();
    void initAllStudioSpinnerView(StudioEntity studioEntity);
    void addCompleted();
    void getInputData();
    void initDatePicker();
    void setDatePicker();

}